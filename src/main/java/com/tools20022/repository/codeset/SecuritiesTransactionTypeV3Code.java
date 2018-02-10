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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#BuySellBack
 * SecuritiesTransactionTypeV3Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#BuyIn
 * SecuritiesTransactionTypeV3Code.BuyIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#CentralBankCollateralOperation
 * SecuritiesTransactionTypeV3Code.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#CollateralIn
 * SecuritiesTransactionTypeV3Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#CollateralOut
 * SecuritiesTransactionTypeV3Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#DepositoryReceiptConversion
 * SecuritiesTransactionTypeV3Code.DepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#FactorUpdate
 * SecuritiesTransactionTypeV3Code.FactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#MoveOfStock
 * SecuritiesTransactionTypeV3Code.MoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Issuance
 * SecuritiesTransactionTypeV3Code.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#MarkDown
 * SecuritiesTransactionTypeV3Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#MarkUp
 * SecuritiesTransactionTypeV3Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Netting
 * SecuritiesTransactionTypeV3Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#NonSyndicated
 * SecuritiesTransactionTypeV3Code.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#ExternalAccountTransfer
 * SecuritiesTransactionTypeV3Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#InternalAccountTransfer
 * SecuritiesTransactionTypeV3Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#PairOff
 * SecuritiesTransactionTypeV3Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Placement
 * SecuritiesTransactionTypeV3Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#PortfolioMove
 * SecuritiesTransactionTypeV3Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Realignment
 * SecuritiesTransactionTypeV3Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Withdrawal
 * SecuritiesTransactionTypeV3Code.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Redemption
 * SecuritiesTransactionTypeV3Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionTypeV3Code.DepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Repo
 * SecuritiesTransactionTypeV3Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionTypeV3Code.ReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Reporting
 * SecuritiesTransactionTypeV3Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#ReverseRepurchaseAgreement
 * SecuritiesTransactionTypeV3Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#SellBuyBack
 * SecuritiesTransactionTypeV3Code.SellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#BorrowingReallocation
 * SecuritiesTransactionTypeV3Code.BorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#SecuritiesBorrowing
 * SecuritiesTransactionTypeV3Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#SecuritiesLending
 * SecuritiesTransactionTypeV3Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#LendingReallocation
 * SecuritiesTransactionTypeV3Code.LendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Subscription
 * SecuritiesTransactionTypeV3Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#SyndicateUnderwriters
 * SecuritiesTransactionTypeV3Code.SyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#TBAClosing
 * SecuritiesTransactionTypeV3Code.TBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Trade
 * SecuritiesTransactionTypeV3Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#TripartyRepo
 * SecuritiesTransactionTypeV3Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#TripartyReverseRepo
 * SecuritiesTransactionTypeV3Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Turnaround
 * SecuritiesTransactionTypeV3Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#PreAdvice
 * SecuritiesTransactionTypeV3Code.PreAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#AutoCollateralisation
 * SecuritiesTransactionTypeV3Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#MarketClaim
 * SecuritiesTransactionTypeV3Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#CorporateAction
 * SecuritiesTransactionTypeV3Code.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Buy
 * SecuritiesTransactionTypeV3Code.Buy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Sell
 * SecuritiesTransactionTypeV3Code.Sell}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#InitialPublicOffer
 * SecuritiesTransactionTypeV3Code.InitialPublicOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#ReinvestmentOfDividend
 * SecuritiesTransactionTypeV3Code.ReinvestmentOfDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#CrossFrom
 * SecuritiesTransactionTypeV3Code.CrossFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#CrossTo
 * SecuritiesTransactionTypeV3Code.CrossTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#SwitchFrom
 * SecuritiesTransactionTypeV3Code.SwitchFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#SwitchTo
 * SecuritiesTransactionTypeV3Code.SwitchTo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Basket
 * SecuritiesTransactionTypeV3Code.Basket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#GuaranteedClose
 * SecuritiesTransactionTypeV3Code.GuaranteedClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Program
 * SecuritiesTransactionTypeV3Code.Program}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#EmployeeTradeReporting
 * SecuritiesTransactionTypeV3Code.EmployeeTradeReporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Agency
 * SecuritiesTransactionTypeV3Code.Agency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#BrokerToBroker
 * SecuritiesTransactionTypeV3Code.BrokerToBroker}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#PreAllocation
 * SecuritiesTransactionTypeV3Code.PreAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#FundToFund
 * SecuritiesTransactionTypeV3Code.FundToFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#List
 * SecuritiesTransactionTypeV3Code.List}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#Index
 * SecuritiesTransactionTypeV3Code.Index}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#VWAPGuarantee
 * SecuritiesTransactionTypeV3Code.VWAPGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#RiskTrade
 * SecuritiesTransactionTypeV3Code.RiskTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code#OfferingIssuingTrade
 * SecuritiesTransactionTypeV3Code.OfferingIssuingTrade}</li>
 * </ul>
 * </li>
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
 * "SecuritiesTransactionTypeV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionTypeV3Code extends MMCode {

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
	public static final SecuritiesTransactionTypeV3Code BuySellBack = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuySellBack";
			definition = "Relates to a buy sell back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code BuyIn = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BuyIn";
			definition = "Transaction relates to a buy-in by the market following a delivery transaction failure.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code CentralBankCollateralOperation = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CentralBankCollateralOperation";
			definition = "Relates to a collateral delivery/receipt to a national central bank for central bank credit operations.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code CollateralIn = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralIn";
			definition = "Relates to a collateral transaction, from the point of view of the collateral taker or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code CollateralOut = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CollateralOut";
			definition = "Relates to a collateral transaction, from the point of view of the collateral giver or its agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code DepositoryReceiptConversion = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptConversion";
			definition = "Relates to a depository receipt conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code FactorUpdate = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FactorUpdate";
			definition = "Relates to a factor update.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code MoveOfStock = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MoveOfStock";
			definition = "Relates to a movement of shares into or out of a pooled account.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Issuance = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Issuance";
			definition = "Relates to the issuance of a security such as an equity or a depositary receipt.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code MarkDown = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkDown";
			definition = "Relates to the decrease of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corp. event realigned).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code MarkUp = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarkUp";
			definition = "Relates to the increase of positions held by an International Central Securities Depository (ICSD) at the common depository due to custody operations (repurchase, pre-release, proceed of corporate event realigned).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Netting = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Netting";
			definition = "Relates to the netting of settlement instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * "Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement."
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV3Code NonSyndicated = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonSyndicated";
			definition = "Relates to the issue of medium and short term paper (CP, CD, MTN, notes.) under a program and without syndication arrangement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code ExternalAccountTransfer = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExternalAccountTransfer";
			definition = "Relates to an account transfer involving more than one instructing party (messages sender) and/or account servicer (messages receiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code InternalAccountTransfer = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InternalAccountTransfer";
			definition = "Relates to an account transfer involving one instructing party (messages sender) at one account servicer (messages receiver).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code PairOff = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PairOff";
			definition = "Relates to a pair-off: the transaction is paired off and netted against one or more previous transactions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Placement = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Placement";
			definition = "Relates to the placement/new issue of a financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code PortfolioMove = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PortfolioMove";
			definition = "Relates to a portfolio move from one investment manager to another and/or from an account servicer to another. It is generally charged differently than another account transfer, hence the need to identify this type of transfer as such.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Realignment = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Realignment";
			definition = "Relates to a realignment of positions.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Withdrawal = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Withdrawal";
			definition = "Relates to the withdrawal of specified amounts from specified subaccounts.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Redemption = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Redemption";
			definition = "Relates to a redemption of funds (funds industry only).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code DepositoryReceiptReleaseCancellation = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			definition = "Relates to a release (into/from local) of depository receipt operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Repo = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Repo";
			definition = "Relates to a repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code ReturnDeliveryWithoutMatching = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			definition = "Relates to the return of financial instruments resulting from a rejected delivery without matching operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Reporting = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Reporting";
			definition = "Relates to a transaction that is for reporting purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code ReverseRepurchaseAgreement = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReverseRepurchaseAgreement";
			definition = "Relates to a reverse repurchase agreement transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code SellBuyBack = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SellBuyBack";
			definition = "Relates to a sell buy back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code BorrowingReallocation = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BorrowingReallocation";
			definition = "Internal reallocation of a borrowed holding from one safekeeping account to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code SecuritiesBorrowing = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesBorrowing";
			definition = "Relates to a securities borrowing operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code SecuritiesLending = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesLending";
			definition = "Relates to a securities lending operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code LendingReallocation = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LendingReallocation";
			definition = "Internal reallocation of a holding on loan from one safekeeping account to another.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Subscription = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Subscription";
			definition = "Relates to a subscription to funds (funds industry only).";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code SyndicateUnderwriters = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SyndicateUnderwriters";
			definition = "Relates to the issue of financial instruments through a syndicate of underwriters and a lead manager.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code TBAClosing = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TBAClosing";
			definition = "Relates to a To Be Announced (TBA) closing trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Trade = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Trade";
			definition = "Relates to the settlement of a trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code TripartyRepo = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyRepo";
			definition = "Relates to a triparty repurchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code TripartyReverseRepo = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TripartyReverseRepo";
			definition = "Relates to a triparty reverse repurchase agreement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Turnaround = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Turnaround";
			definition = "Relates to a turnaround: the same security is bought and sold to settle the same day, to or from different brokers.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code PreAdvice = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAdvice";
			definition = "Transaction is a pre-advice, that is, for matching purposes only.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code AutoCollateralisation = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AutoCollateralisation";
			definition = "Relates to an auto-collateralisation movement.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code MarketClaim = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketClaim";
			definition = "Relates to a market claim.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code CorporateAction = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Relates to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Buy = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Buy";
			definition = "Transaction is a purchase of financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code Sell = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sell";
			definition = "Transaction is a sale of financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code InitialPublicOffer = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitialPublicOffer";
			definition = "Transaction is an Initial Public Offer (IPO) order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code ReinvestmentOfDividend = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReinvestmentOfDividend";
			definition = "Transaction is a reinvestment of dividends.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code CrossFrom = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossFrom";
			definition = "Indicates that the type of transaction is a cross from.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code CrossTo = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossTo";
			definition = "Indicates that the type of transaction is a cross to.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code SwitchFrom = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchFrom";
			definition = "Transaction is a change of an investment from one sub-fund to another sub-fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code SwitchTo = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SwitchTo";
			definition = "Transaction is a change of an investment from one sub-fund to another sub-fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//BASK</li>
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
	public static final SecuritiesTransactionTypeV3Code Basket = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//BASK"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Basket";
			definition = "A basket trade, i.e. a unit of 15 or more financial instruments used in program trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "BSKT";
		}
	};
	/**
	 * Trade which is guaranteed to be finalized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GUAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade which is guaranteed to be finalized."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV3Code GuaranteedClose = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GuaranteedClose";
			definition = "Trade which is guaranteed to be finalized.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//PROG</li>
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
	public static final SecuritiesTransactionTypeV3Code Program = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//PROG"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Program";
			definition = "A program trade, i.e. a computer-driven trade of buying and selling of baskets of 15 or more financial instruments by index arbitrage specialists or institutional traders.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code EmployeeTradeReporting = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EmployeeTradeReporting";
			definition = "Transaction relates to employee trade reporting.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
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
	public static final SecuritiesTransactionTypeV3Code Agency = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Agency";
			definition = "Trade in which an agent intermediates between a buyer and a seller.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//BRKR</li>
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
	public static final SecuritiesTransactionTypeV3Code BrokerToBroker = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//BRKR"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BrokerToBroker";
			definition = "A trade from a broker to another broker.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//PALL</li>
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
	public static final SecuritiesTransactionTypeV3Code PreAllocation = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//PALL"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreAllocation";
			definition = "A pre-allocated trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//FUND</li>
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
	public static final SecuritiesTransactionTypeV3Code FundToFund = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//FUND"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundToFund";
			definition = "A trade from an investment fund to another investment fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//LIST</li>
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
	public static final SecuritiesTransactionTypeV3Code List = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//LIST"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "List";
			definition = "Transaction is an List order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::TRTR//INDX</li>
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
	public static final SecuritiesTransactionTypeV3Code Index = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::TRTR//INDX"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Transaction is an Index order.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
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
	public static final SecuritiesTransactionTypeV3Code VWAPGuarantee = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "VWAPGuarantee";
			definition = "Trade whose price is guaranteed as the weighted average of the trade prices on a specific day.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "VWAP";
		}
	};
	/**
	 * Trade involving risk.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
	 * SecuritiesTransactionTypeV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RISK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = FIXSynonym: 418</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RiskTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade involving risk."</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionTypeV3Code RiskTrade = new SecuritiesTransactionTypeV3Code() {
		{
			semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "418"));
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RiskTrade";
			definition = "Trade involving risk.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
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
	public static final SecuritiesTransactionTypeV3Code OfferingIssuingTrade = new SecuritiesTransactionTypeV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			definition = "Offering issue trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.mmObject();
			codeName = "OFIT";
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionTypeV3Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionTypeV3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionTypeV3Code";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				derivation_lazy = () -> Arrays.asList(SettlementTransactionType7Code.mmObject(), SecuritiesTransactionType15Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.BuySellBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.BuyIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.CollateralIn,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.CollateralOut, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.DepositoryReceiptConversion,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.FactorUpdate, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.MoveOfStock,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Issuance, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.MarkDown,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.MarkUp, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Netting,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.NonSyndicated, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.InternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.PairOff,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Placement, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.PortfolioMove,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Realignment, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Withdrawal,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Redemption, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.DepositoryReceiptReleaseCancellation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Repo, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.ReturnDeliveryWithoutMatching,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Reporting, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.ReverseRepurchaseAgreement,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.BorrowingReallocation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.LendingReallocation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Trade, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.PreAdvice, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.CorporateAction,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Buy, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Sell,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.InitialPublicOffer, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.ReinvestmentOfDividend,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.CrossFrom, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.CrossTo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.SwitchFrom, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.SwitchTo,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Basket, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.GuaranteedClose,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Program, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.EmployeeTradeReporting,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Agency, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.BrokerToBroker,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.PreAllocation, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.FundToFund,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.List, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.Index,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.VWAPGuarantee, com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.RiskTrade,
						com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code.OfferingIssuingTrade);
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
		codesByName.put(Issuance.getCodeName().get(), Issuance);
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
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
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
		codesByName.put(Buy.getCodeName().get(), Buy);
		codesByName.put(Sell.getCodeName().get(), Sell);
		codesByName.put(InitialPublicOffer.getCodeName().get(), InitialPublicOffer);
		codesByName.put(ReinvestmentOfDividend.getCodeName().get(), ReinvestmentOfDividend);
		codesByName.put(CrossFrom.getCodeName().get(), CrossFrom);
		codesByName.put(CrossTo.getCodeName().get(), CrossTo);
		codesByName.put(SwitchFrom.getCodeName().get(), SwitchFrom);
		codesByName.put(SwitchTo.getCodeName().get(), SwitchTo);
		codesByName.put(Basket.getCodeName().get(), Basket);
		codesByName.put(GuaranteedClose.getCodeName().get(), GuaranteedClose);
		codesByName.put(Program.getCodeName().get(), Program);
		codesByName.put(EmployeeTradeReporting.getCodeName().get(), EmployeeTradeReporting);
		codesByName.put(Agency.getCodeName().get(), Agency);
		codesByName.put(BrokerToBroker.getCodeName().get(), BrokerToBroker);
		codesByName.put(PreAllocation.getCodeName().get(), PreAllocation);
		codesByName.put(FundToFund.getCodeName().get(), FundToFund);
		codesByName.put(List.getCodeName().get(), List);
		codesByName.put(Index.getCodeName().get(), Index);
		codesByName.put(VWAPGuarantee.getCodeName().get(), VWAPGuarantee);
		codesByName.put(RiskTrade.getCodeName().get(), RiskTrade);
		codesByName.put(OfferingIssuingTrade.getCodeName().get(), OfferingIssuingTrade);
	}

	public static SecuritiesTransactionTypeV3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionTypeV3Code[] values() {
		SecuritiesTransactionTypeV3Code[] values = new SecuritiesTransactionTypeV3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionTypeV3Code> {
		@Override
		public SecuritiesTransactionTypeV3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionTypeV3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}