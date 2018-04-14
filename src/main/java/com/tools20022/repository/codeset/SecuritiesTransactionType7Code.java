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
import com.tools20022.repository.codeset.SecuritiesTransactionType7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#CentralBankCollateralOperation
 * SecuritiesTransactionType7Code.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#BuySellBack
 * SecuritiesTransactionType7Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#CollateralIn
 * SecuritiesTransactionType7Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#CollateralOut
 * SecuritiesTransactionType7Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#DepositoryReceiptConversion
 * SecuritiesTransactionType7Code.DepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#FactorUpdate
 * SecuritiesTransactionType7Code.FactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#MoveOfStock
 * SecuritiesTransactionType7Code.MoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Issuance
 * SecuritiesTransactionType7Code.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#MarkDown
 * SecuritiesTransactionType7Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#MarkUp
 * SecuritiesTransactionType7Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Netting
 * SecuritiesTransactionType7Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#NonSyndicated
 * SecuritiesTransactionType7Code.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#ExternalAccountTransfer
 * SecuritiesTransactionType7Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#InternalAccountTransfer
 * SecuritiesTransactionType7Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#PairOff
 * SecuritiesTransactionType7Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Placement
 * SecuritiesTransactionType7Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#PortfolioMove
 * SecuritiesTransactionType7Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Realignment
 * SecuritiesTransactionType7Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Withdrawal
 * SecuritiesTransactionType7Code.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Redemption
 * SecuritiesTransactionType7Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionType7Code.DepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Repo
 * SecuritiesTransactionType7Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionType7Code.ReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#ReverseRepo
 * SecuritiesTransactionType7Code.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#SellBuyBack
 * SecuritiesTransactionType7Code.SellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#BorrowingReallocation
 * SecuritiesTransactionType7Code.BorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#SecuritiesBorrowing
 * SecuritiesTransactionType7Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#SecuritiesLending
 * SecuritiesTransactionType7Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#LendingReallocation
 * SecuritiesTransactionType7Code.LendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Subscription
 * SecuritiesTransactionType7Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#SyndicateUnderwriters
 * SecuritiesTransactionType7Code.SyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#TBAClosing
 * SecuritiesTransactionType7Code.TBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Trade
 * SecuritiesTransactionType7Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#TripartyRepo
 * SecuritiesTransactionType7Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#TripartyReverseRepo
 * SecuritiesTransactionType7Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#Turnaround
 * SecuritiesTransactionType7Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#CorporateAction
 * SecuritiesTransactionType7Code.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#MarketClaim
 * SecuritiesTransactionType7Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#AutoCollateralisation
 * SecuritiesTransactionType7Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code#ExchangeTradedFunds
 * SecuritiesTransactionType7Code.ExchangeTradedFunds}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
 * SecuritiesTransactionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CNCB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
 * SecuritiesTransactionType17Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType1Code
 * SecuritiesTransactionType1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CentralBankCollateralOperation
	 * SecuritiesTransactionType17Code.CentralBankCollateralOperation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code CentralBankCollateralOperation = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.CentralBankCollateralOperation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#BuySellBack
	 * SecuritiesTransactionType17Code.BuySellBack}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code BuySellBack = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.BuySellBack);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CollateralIn
	 * SecuritiesTransactionType17Code.CollateralIn}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code CollateralIn = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.CollateralIn);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CollateralOut
	 * SecuritiesTransactionType17Code.CollateralOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code CollateralOut = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.CollateralOut);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#DepositoryReceiptConversion
	 * SecuritiesTransactionType17Code.DepositoryReceiptConversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code DepositoryReceiptConversion = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.DepositoryReceiptConversion);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#FactorUpdate
	 * SecuritiesTransactionType17Code.FactorUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code FactorUpdate = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.FactorUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.FactorUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MoveOfStock
	 * SecuritiesTransactionType17Code.MoveOfStock}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code MoveOfStock = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.MoveOfStock);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MoveOfStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Issuance
	 * SecuritiesTransactionType17Code.Issuance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Issuance = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Issuance);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Issuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MarkDown
	 * SecuritiesTransactionType17Code.MarkDown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code MarkDown = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.MarkDown);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MarkUp
	 * SecuritiesTransactionType17Code.MarkUp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code MarkUp = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.MarkUp);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Netting
	 * SecuritiesTransactionType17Code.Netting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Netting = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Netting);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#NonSyndicated
	 * SecuritiesTransactionType17Code.NonSyndicated}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code NonSyndicated = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.NonSyndicated);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.NonSyndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ExternalAccountTransfer
	 * SecuritiesTransactionType17Code.ExternalAccountTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code ExternalAccountTransfer = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.ExternalAccountTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#InternalAccountTransfer
	 * SecuritiesTransactionType17Code.InternalAccountTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code InternalAccountTransfer = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.InternalAccountTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.InternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#PairOff
	 * SecuritiesTransactionType17Code.PairOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code PairOff = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.PairOff);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PairOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Placement
	 * SecuritiesTransactionType17Code.Placement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Placement = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Placement);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Placement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#PortfolioMove
	 * SecuritiesTransactionType17Code.PortfolioMove}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code PortfolioMove = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.PortfolioMove);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PortfolioMove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Realignment
	 * SecuritiesTransactionType17Code.Realignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Realignment = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Realignment);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Realignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Withdrawal
	 * SecuritiesTransactionType17Code.Withdrawal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Withdrawal = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Withdrawal);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Withdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Redemption
	 * SecuritiesTransactionType17Code.Redemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Redemption = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Redemption);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#DepositoryReceiptReleaseCancellation
	 * SecuritiesTransactionType17Code.DepositoryReceiptReleaseCancellation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code DepositoryReceiptReleaseCancellation = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.DepositoryReceiptReleaseCancellation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptReleaseCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Repo
	 * SecuritiesTransactionType17Code.Repo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Repo = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Repo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ReturnDeliveryWithoutMatching
	 * SecuritiesTransactionType17Code.ReturnDeliveryWithoutMatching}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code ReturnDeliveryWithoutMatching = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.ReturnDeliveryWithoutMatching);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReturnDeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ReverseRepo
	 * SecuritiesTransactionType17Code.ReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code ReverseRepo = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.ReverseRepo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SellBuyBack
	 * SecuritiesTransactionType17Code.SellBuyBack}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code SellBuyBack = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.SellBuyBack);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReallocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#BorrowingReallocation
	 * SecuritiesTransactionType17Code.BorrowingReallocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code BorrowingReallocation = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingReallocation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.BorrowingReallocation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BorrowingReallocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SecuritiesBorrowing
	 * SecuritiesTransactionType17Code.SecuritiesBorrowing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code SecuritiesBorrowing = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.SecuritiesBorrowing);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SecuritiesLending
	 * SecuritiesTransactionType17Code.SecuritiesLending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code SecuritiesLending = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.SecuritiesLending);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingReallocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#LendingReallocation
	 * SecuritiesTransactionType17Code.LendingReallocation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code LendingReallocation = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingReallocation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.LendingReallocation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.LendingReallocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Subscription
	 * SecuritiesTransactionType17Code.Subscription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Subscription = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Subscription);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SyndicateUnderwriters
	 * SecuritiesTransactionType17Code.SyndicateUnderwriters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code SyndicateUnderwriters = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.SyndicateUnderwriters);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SyndicateUnderwriters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#TBAClosing
	 * SecuritiesTransactionType17Code.TBAClosing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code TBAClosing = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.TBAClosing);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TBAClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Trade
	 * SecuritiesTransactionType17Code.Trade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Trade = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Trade);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#TripartyRepo
	 * SecuritiesTransactionType17Code.TripartyRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code TripartyRepo = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.TripartyRepo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#TripartyReverseRepo
	 * SecuritiesTransactionType17Code.TripartyReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code TripartyReverseRepo = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.TripartyReverseRepo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Turnaround
	 * SecuritiesTransactionType17Code.Turnaround}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code Turnaround = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.Turnaround);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Turnaround.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CorporateAction
	 * SecuritiesTransactionType17Code.CorporateAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code CorporateAction = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.CorporateAction);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MarketClaim
	 * SecuritiesTransactionType17Code.MarketClaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code MarketClaim = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.MarketClaim);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#AutoCollateralisation
	 * SecuritiesTransactionType17Code.AutoCollateralisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code AutoCollateralisation = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.AutoCollateralisation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType7Code
	 * SecuritiesTransactionType7Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ExchangeTradedFunds
	 * SecuritiesTransactionType17Code.ExchangeTradedFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType7Code ExchangeTradedFunds = new SecuritiesTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.ExchangeTradedFunds);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExchangeTradedFunds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionType7Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNCB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType7Code";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType17Code.mmObject());
				previousVersion_lazy = () -> SecuritiesTransactionType1Code.mmObject();
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType7Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.BuySellBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.DepositoryReceiptConversion, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.FactorUpdate,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.MoveOfStock, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Issuance,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.MarkDown, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.MarkUp,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Netting, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.NonSyndicated,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.ExternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.InternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.PairOff, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Placement,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.PortfolioMove, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Realignment,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Withdrawal, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Redemption,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.DepositoryReceiptReleaseCancellation, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Repo,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.ReturnDeliveryWithoutMatching, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.BorrowingReallocation,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.LendingReallocation, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Trade, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.CorporateAction, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.MarketClaim,
						com.tools20022.repository.codeset.SecuritiesTransactionType7Code.AutoCollateralisation, com.tools20022.repository.codeset.SecuritiesTransactionType7Code.ExchangeTradedFunds);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CentralBankCollateralOperation.getCodeName().get(), CentralBankCollateralOperation);
		codesByName.put(BuySellBack.getCodeName().get(), BuySellBack);
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
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
	}

	public static SecuritiesTransactionType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionType7Code[] values() {
		SecuritiesTransactionType7Code[] values = new SecuritiesTransactionType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionType7Code> {
		@Override
		public SecuritiesTransactionType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}