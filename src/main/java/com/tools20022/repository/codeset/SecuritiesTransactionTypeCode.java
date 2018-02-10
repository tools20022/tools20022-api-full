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
import com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies underlying information regarding the type of settlement
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#BuySellBack
 * SecuritiesTransactionTypeCode.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#BuyIn
 * SecuritiesTransactionTypeCode.BuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#CentralBankCollateralOperation
 * SecuritiesTransactionTypeCode.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#CollateralIn
 * SecuritiesTransactionTypeCode.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#CollateralOut
 * SecuritiesTransactionTypeCode.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#DepositoryReceiptConversion
 * SecuritiesTransactionTypeCode.DepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#FactorUpdate
 * SecuritiesTransactionTypeCode.FactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#MoveOfStock
 * SecuritiesTransactionTypeCode.MoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#DepositoryReceiptIssue
 * SecuritiesTransactionTypeCode.DepositoryReceiptIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#MarkDown
 * SecuritiesTransactionTypeCode.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#MarkUp
 * SecuritiesTransactionTypeCode.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Netting
 * SecuritiesTransactionTypeCode.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#NonSyndicated
 * SecuritiesTransactionTypeCode.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#ExternalAccountTransfer
 * SecuritiesTransactionTypeCode.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#InternalAccountTransfer
 * SecuritiesTransactionTypeCode.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#PairOff
 * SecuritiesTransactionTypeCode.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Placement
 * SecuritiesTransactionTypeCode.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#PortfolioMove
 * SecuritiesTransactionTypeCode.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Realignment
 * SecuritiesTransactionTypeCode.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Withdrawal
 * SecuritiesTransactionTypeCode.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Redemption
 * SecuritiesTransactionTypeCode.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionTypeCode.DepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Repo
 * SecuritiesTransactionTypeCode.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionTypeCode.ReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Reporting
 * SecuritiesTransactionTypeCode.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#ReverseRepo
 * SecuritiesTransactionTypeCode.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#SellBuyBack
 * SecuritiesTransactionTypeCode.SellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#BorrowingReallocation
 * SecuritiesTransactionTypeCode.BorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#SecuritiesBorrowing
 * SecuritiesTransactionTypeCode.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#SecuritiesLending
 * SecuritiesTransactionTypeCode.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#LendingReallocation
 * SecuritiesTransactionTypeCode.LendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Subscription
 * SecuritiesTransactionTypeCode.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#SyndicateUnderwriters
 * SecuritiesTransactionTypeCode.SyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#TBAClosing
 * SecuritiesTransactionTypeCode.TBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Trade
 * SecuritiesTransactionTypeCode.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#TripartyRepo
 * SecuritiesTransactionTypeCode.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#TripartyReverseRepo
 * SecuritiesTransactionTypeCode.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#Turnaround
 * SecuritiesTransactionTypeCode.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#PreAdvice
 * SecuritiesTransactionTypeCode.PreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#AutoCollateralisation
 * SecuritiesTransactionTypeCode.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#MarketClaim
 * SecuritiesTransactionTypeCode.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeCode#CorporateAction
 * SecuritiesTransactionTypeCode.CorporateAction}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionTypeCode extends MMCode {

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
	public static final SecuritiesTransactionTypeCode BuySellBack = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			definition = "Relates to a buy sell back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode BuyIn = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyIn";
			definition = "Transaction relates to a buy-in by the market following a delivery transaction failure.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode CentralBankCollateralOperation = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			definition = "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode CollateralIn = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			definition = "Relates to a collateral transaction, from the point of view of the collateral taker or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode CollateralOut = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			definition = "Relates to a collateral transaction, from the point of view of the collateral giver or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode DepositoryReceiptConversion = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			definition = "Relates to a depository receipt conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode FactorUpdate = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			definition = "Relates to a factor update.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode MoveOfStock = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			definition = "Relates to a movement of shares into or out of a pooled account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode DepositoryReceiptIssue = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptIssue";
			definition = "Relates to issue of a depositary receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode MarkDown = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			definition = "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode MarkUp = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			definition = "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Netting = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
			codeName = "NETT";
		}
	};
	/**
	 * Relates to the issue of medium and short term paper (CP, CD, MTN, notes.)
	 * under a program and without syndication arrangement.
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
	 * "Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeCode NonSyndicated = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			definition = "Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode ExternalAccountTransfer = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			definition = "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode InternalAccountTransfer = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			definition = "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode PairOff = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Placement = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			definition = "Relates to the placement/new issue of a financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode PortfolioMove = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			definition = "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Realignment = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			definition = "Relates to a realignment of positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Withdrawal = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			definition = "Relates to the withdrawal of specified amounts from specified subaccounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Redemption = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			definition = "Relates to a redemption of funds (funds industry only).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode DepositoryReceiptReleaseCancellation = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			definition = "Relates to a release (into/from local) of depository receipt operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Repo = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			definition = "Relates to a repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode ReturnDeliveryWithoutMatching = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Reporting = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode ReverseRepo = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			definition = "Relates to a reverse repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode SellBuyBack = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			definition = "Relates to a sell buy back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode BorrowingReallocation = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingReallocation";
			definition = "Internal reallocation of a borrowed holding from one safekeeping account to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode SecuritiesBorrowing = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			definition = "Relates to a securities borrowing operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode SecuritiesLending = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			definition = "Relates to a securities lending operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode LendingReallocation = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingReallocation";
			definition = "Internal reallocation of a holding on loan from one safekeeping account to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Subscription = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Relates to a subscription to funds (funds industry only).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode SyndicateUnderwriters = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			definition = "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode TBAClosing = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			definition = "Relates to a To Be Announced (TBA) closing trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Trade = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			definition = "Relates to the settlement of a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode TripartyRepo = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			definition = "Relates to a triparty repurchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode TripartyReverseRepo = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			definition = "Relates to a triparty reverse repurchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode Turnaround = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode PreAdvice = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode AutoCollateralisation = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			definition = "Relates to an auto-collateralisation movement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode MarketClaim = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			definition = "Relates to a market claim.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
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
	public static final SecuritiesTransactionTypeCode CorporateAction = new SecuritiesTransactionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			definition = "Relates to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.mmObject();
			codeName = "CORP";
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionTypeCode> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTypeCode";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				derivation_lazy = () -> Arrays.asList(SecuritiesTransactionType11Code.mmObject(), SecuritiesTransactionType2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.BuySellBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.BuyIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.CollateralOut, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.DepositoryReceiptConversion,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.FactorUpdate, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.MoveOfStock,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.DepositoryReceiptIssue, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.MarkDown,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.MarkUp, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Netting,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.NonSyndicated, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.InternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.PairOff,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Placement, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.PortfolioMove,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Realignment, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Withdrawal,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Redemption, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.DepositoryReceiptReleaseCancellation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Repo, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.ReturnDeliveryWithoutMatching,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Reporting, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.BorrowingReallocation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.LendingReallocation, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Trade, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.PreAdvice, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionTypeCode.CorporateAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BuySellBack.getCodeName().get(), BuySellBack);
		codesByName.put(BuyIn.getCodeName().get(), BuyIn);
		codesByName.put(CentralBankCollateralOperation.getCodeName().get(), CentralBankCollateralOperation);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(DepositoryReceiptConversion.getCodeName().get(), DepositoryReceiptConversion);
		codesByName.put(FactorUpdate.getCodeName().get(), FactorUpdate);
		codesByName.put(MoveOfStock.getCodeName().get(), MoveOfStock);
		codesByName.put(DepositoryReceiptIssue.getCodeName().get(), DepositoryReceiptIssue);
		codesByName.put(MarkDown.getCodeName().get(), MarkDown);
		codesByName.put(MarkUp.getCodeName().get(), MarkUp);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(NonSyndicated.getCodeName().get(), NonSyndicated);
		codesByName.put(ExternalAccountTransfer.getCodeName().get(), ExternalAccountTransfer);
		codesByName.put(InternalAccountTransfer.getCodeName().get(), InternalAccountTransfer);
		codesByName.put(PairOff.getCodeName().get(), PairOff);
		codesByName.put(Placement.getCodeName().get(), Placement);
		codesByName.put(PortfolioMove.getCodeName().get(), PortfolioMove);
		codesByName.put(Realignment.getCodeName().get(), Realignment);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(DepositoryReceiptReleaseCancellation.getCodeName().get(), DepositoryReceiptReleaseCancellation);
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(ReturnDeliveryWithoutMatching.getCodeName().get(), ReturnDeliveryWithoutMatching);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(ReverseRepo.getCodeName().get(), ReverseRepo);
		codesByName.put(SellBuyBack.getCodeName().get(), SellBuyBack);
		codesByName.put(BorrowingReallocation.getCodeName().get(), BorrowingReallocation);
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(LendingReallocation.getCodeName().get(), LendingReallocation);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SyndicateUnderwriters.getCodeName().get(), SyndicateUnderwriters);
		codesByName.put(TBAClosing.getCodeName().get(), TBAClosing);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(TripartyRepo.getCodeName().get(), TripartyRepo);
		codesByName.put(TripartyReverseRepo.getCodeName().get(), TripartyReverseRepo);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(PreAdvice.getCodeName().get(), PreAdvice);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
	}

	public static SecuritiesTransactionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionTypeCode[] values() {
		SecuritiesTransactionTypeCode[] values = new SecuritiesTransactionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionTypeCode> {
		@Override
		public SecuritiesTransactionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}