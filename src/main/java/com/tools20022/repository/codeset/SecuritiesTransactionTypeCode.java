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
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmBuySellBack
 * SecuritiesTransactionTypeCode.mmBuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmBuyIn
 * SecuritiesTransactionTypeCode.mmBuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmCentralBankCollateralOperation
 * SecuritiesTransactionTypeCode.mmCentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmCollateralIn
 * SecuritiesTransactionTypeCode.mmCollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmCollateralOut
 * SecuritiesTransactionTypeCode.mmCollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmDepositoryReceiptConversion
 * SecuritiesTransactionTypeCode.mmDepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmFactorUpdate
 * SecuritiesTransactionTypeCode.mmFactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmMoveOfStock
 * SecuritiesTransactionTypeCode.mmMoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmDepositoryReceiptIssue
 * SecuritiesTransactionTypeCode.mmDepositoryReceiptIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmMarkDown
 * SecuritiesTransactionTypeCode.mmMarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmMarkUp
 * SecuritiesTransactionTypeCode.mmMarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmNetting
 * SecuritiesTransactionTypeCode.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmNonSyndicated
 * SecuritiesTransactionTypeCode.mmNonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmExternalAccountTransfer
 * SecuritiesTransactionTypeCode.mmExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmInternalAccountTransfer
 * SecuritiesTransactionTypeCode.mmInternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmPairOff
 * SecuritiesTransactionTypeCode.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmPlacement
 * SecuritiesTransactionTypeCode.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmPortfolioMove
 * SecuritiesTransactionTypeCode.mmPortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmRealignment
 * SecuritiesTransactionTypeCode.mmRealignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmWithdrawal
 * SecuritiesTransactionTypeCode.mmWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmRedemption
 * SecuritiesTransactionTypeCode.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmDepositoryReceiptReleaseCancellation
 * SecuritiesTransactionTypeCode.mmDepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmRepo
 * SecuritiesTransactionTypeCode.mmRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmReturnDeliveryWithoutMatching
 * SecuritiesTransactionTypeCode.mmReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmReporting
 * SecuritiesTransactionTypeCode.mmReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmReverseRepo
 * SecuritiesTransactionTypeCode.mmReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmSellBuyBack
 * SecuritiesTransactionTypeCode.mmSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmBorrowingReallocation
 * SecuritiesTransactionTypeCode.mmBorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmSecuritiesBorrowing
 * SecuritiesTransactionTypeCode.mmSecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmSecuritiesLending
 * SecuritiesTransactionTypeCode.mmSecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmLendingReallocation
 * SecuritiesTransactionTypeCode.mmLendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmSubscription
 * SecuritiesTransactionTypeCode.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmSyndicateUnderwriters
 * SecuritiesTransactionTypeCode.mmSyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmTBAClosing
 * SecuritiesTransactionTypeCode.mmTBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmTrade
 * SecuritiesTransactionTypeCode.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmTripartyRepo
 * SecuritiesTransactionTypeCode.mmTripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmTripartyReverseRepo
 * SecuritiesTransactionTypeCode.mmTripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmTurnaround
 * SecuritiesTransactionTypeCode.mmTurnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmPreAdvice
 * SecuritiesTransactionTypeCode.mmPreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmAutoCollateralisation
 * SecuritiesTransactionTypeCode.mmAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmMarketClaim
 * SecuritiesTransactionTypeCode.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#mmCorporateAction
 * SecuritiesTransactionTypeCode.mmCorporateAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType11Code
 * SecuritiesTransactionType11Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType2Code
 * SecuritiesTransactionType2Code}</li>
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
 * "SecuritiesTransactionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * </ul>
 */
public class SecuritiesTransactionTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Relates to a buy sell back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BSBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a buy sell back transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmBuySellBack = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			definition = "Relates to a buy sell back transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIYI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyIn";
			definition = "Transaction relates to a buy-in by the market following a delivery transaction failure.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			definition = "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Relates to a collateral transaction, from the point of view of the collateral taker or its agent.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COLO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Relates to a collateral transaction, from the point of view of the collateral giver or its agent.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "COLO";
		}
	};
	/**
	 * Relates to a depository receipt conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a depository receipt conversion."</li>
	 * </ul>
	 */
	public static final MMCode mmDepositoryReceiptConversion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			definition = "Relates to a depository receipt conversion.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Relates to a factor update.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a factor update."</li>
	 * </ul>
	 */
	public static final MMCode mmFactorUpdate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			definition = "Relates to a factor update.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "FCTA";
		}
	};
	/**
	 * Relates to a movement of shares into or out of a pooled account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			definition = "Relates to a movement of shares into or out of a pooled account.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "INSP";
		}
	};
	/**
	 * Relates to issue of a depositary receipt.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to issue of a depositary receipt."</li>
	 * </ul>
	 */
	public static final MMCode mmDepositoryReceiptIssue = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptIssue";
			definition = "Relates to issue of a depositary receipt.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKDW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			definition = "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MKUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			definition = "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "MKUP";
		}
	};
	/**
	 * Relates to the netting of settlement instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NETT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the netting of settlement instructions."</li>
	 * </ul>
	 */
	public static final MMCode mmNetting = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NSYN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			definition = "Relates to the issue of medium and short term paper (CP, CD, MTN, notes ...) under a program and without syndication arrangement.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			definition = "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			definition = "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "PAIR";
		}
	};
	/**
	 * Relates to the placement/new issue of a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Relates to the placement/new issue of a financial instrument.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PORT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			definition = "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "PORT";
		}
	};
	/**
	 * Relates to a realignment of positions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a realignment of positions."</li>
	 * </ul>
	 */
	public static final MMCode mmRealignment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			definition = "Relates to a realignment of positions.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Relates to the withdrawal of specified amounts from specified subaccounts.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "REDI";
		}
	};
	/**
	 * Relates to a redemption of funds (funds industry only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a redemption of funds (funds industry only)."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Relates to a redemption of funds (funds industry only).";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Relates to a release (into/from local) of depository receipt operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RELE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			definition = "Relates to a release (into/from local) of depository receipt operation.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "RELE";
		}
	};
	/**
	 * Relates to a repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a repurchase agreement transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			definition = "Relates to a repurchase agreement transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RODE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "RODE";
		}
	};
	/**
	 * Relates to a transaction that is for reporting purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "RPTO";
		}
	};
	/**
	 * Relates to a reverse repurchase agreement transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a reverse repurchase agreement transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmReverseRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			definition = "Relates to a reverse repurchase agreement transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "RVPO";
		}
	};
	/**
	 * Relates to a sell buy back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a sell buy back transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmSellBuyBack = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			definition = "Relates to a sell buy back transaction.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingReallocation";
			definition = "Internal reallocation of a borrowed holding from one safekeeping account to another.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "SBRE";
		}
	};
	/**
	 * Relates to a securities borrowing operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a securities borrowing operation."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesBorrowing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			definition = "Relates to a securities borrowing operation.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "SECB";
		}
	};
	/**
	 * Relates to a securities lending operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a securities lending operation."</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesLending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			definition = "Relates to a securities lending operation.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLRE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingReallocation";
			definition = "Internal reallocation of a holding on loan from one safekeeping account to another.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "SLRE";
		}
	};
	/**
	 * Relates to a subscription to funds (funds industry only).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Relates to a subscription to funds (funds industry only).";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			definition = "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "SYND";
		}
	};
	/**
	 * Relates to a To Be Announced (TBA) closing trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TBAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a To Be Announced (TBA) closing trade."</li>
	 * </ul>
	 */
	public static final MMCode mmTBAClosing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			definition = "Relates to a To Be Announced (TBA) closing trade.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "TBAC";
		}
	};
	/**
	 * Relates to the settlement of a trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to the settlement of a trade."</li>
	 * </ul>
	 */
	public static final MMCode mmTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Relates to the settlement of a trade.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "TRAD";
		}
	};
	/**
	 * Relates to a triparty repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a triparty repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmTripartyRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			definition = "Relates to a triparty repurchase agreement.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "TRPO";
		}
	};
	/**
	 * Relates to a triparty reverse repurchase agreement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRVO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a triparty reverse repurchase agreement."</li>
	 * </ul>
	 */
	public static final MMCode mmTripartyReverseRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			definition = "Relates to a triparty reverse repurchase agreement.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TURN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "TURN";
		}
	};
	/**
	 * Transaction is a pre-advice, that is, for matching purposes only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
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
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "PREA";
		}
	};
	/**
	 * Relates to an auto-collateralisation movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to an auto-collateralisation movement."</li>
	 * </ul>
	 */
	public static final MMCode mmAutoCollateralisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			definition = "Relates to an auto-collateralisation movement.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "AUTO";
		}
	};
	/**
	 * Relates to a market claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLAI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a market claim."</li>
	 * </ul>
	 */
	public static final MMCode mmMarketClaim = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			definition = "Relates to a market claim.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "CLAI";
		}
	};
	/**
	 * Relates to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode
	 * SecuritiesTransactionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Relates to a corporate action."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateAction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Relates to a corporate action.";
			owner_lazy = () -> SecuritiesTransactionTypeCode.mmObject();
			codeName = "CORP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTypeCode";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				code_lazy = () -> Arrays.asList(SecuritiesTransactionTypeCode.mmBuySellBack, SecuritiesTransactionTypeCode.mmBuyIn, SecuritiesTransactionTypeCode.mmCentralBankCollateralOperation,
						SecuritiesTransactionTypeCode.mmCollateralIn, SecuritiesTransactionTypeCode.mmCollateralOut, SecuritiesTransactionTypeCode.mmDepositoryReceiptConversion, SecuritiesTransactionTypeCode.mmFactorUpdate,
						SecuritiesTransactionTypeCode.mmMoveOfStock, SecuritiesTransactionTypeCode.mmDepositoryReceiptIssue, SecuritiesTransactionTypeCode.mmMarkDown, SecuritiesTransactionTypeCode.mmMarkUp,
						SecuritiesTransactionTypeCode.mmNetting, SecuritiesTransactionTypeCode.mmNonSyndicated, SecuritiesTransactionTypeCode.mmExternalAccountTransfer, SecuritiesTransactionTypeCode.mmInternalAccountTransfer,
						SecuritiesTransactionTypeCode.mmPairOff, SecuritiesTransactionTypeCode.mmPlacement, SecuritiesTransactionTypeCode.mmPortfolioMove, SecuritiesTransactionTypeCode.mmRealignment,
						SecuritiesTransactionTypeCode.mmWithdrawal, SecuritiesTransactionTypeCode.mmRedemption, SecuritiesTransactionTypeCode.mmDepositoryReceiptReleaseCancellation, SecuritiesTransactionTypeCode.mmRepo,
						SecuritiesTransactionTypeCode.mmReturnDeliveryWithoutMatching, SecuritiesTransactionTypeCode.mmReporting, SecuritiesTransactionTypeCode.mmReverseRepo, SecuritiesTransactionTypeCode.mmSellBuyBack,
						SecuritiesTransactionTypeCode.mmBorrowingReallocation, SecuritiesTransactionTypeCode.mmSecuritiesBorrowing, SecuritiesTransactionTypeCode.mmSecuritiesLending, SecuritiesTransactionTypeCode.mmLendingReallocation,
						SecuritiesTransactionTypeCode.mmSubscription, SecuritiesTransactionTypeCode.mmSyndicateUnderwriters, SecuritiesTransactionTypeCode.mmTBAClosing, SecuritiesTransactionTypeCode.mmTrade,
						SecuritiesTransactionTypeCode.mmTripartyRepo, SecuritiesTransactionTypeCode.mmTripartyReverseRepo, SecuritiesTransactionTypeCode.mmTurnaround, SecuritiesTransactionTypeCode.mmPreAdvice,
						SecuritiesTransactionTypeCode.mmAutoCollateralisation, SecuritiesTransactionTypeCode.mmMarketClaim, SecuritiesTransactionTypeCode.mmCorporateAction);
				derivation_lazy = () -> Arrays.asList(SecuritiesTransactionType11Code.mmObject(), SecuritiesTransactionType2Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}