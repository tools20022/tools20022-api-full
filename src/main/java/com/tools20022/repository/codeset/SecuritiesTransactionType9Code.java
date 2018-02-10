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
import com.tools20022.repository.codeset.SecuritiesTransactionType9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies underlying information regarding the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#CentralBankCollateralOperation
 * SecuritiesTransactionType9Code.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#BuySellBack
 * SecuritiesTransactionType9Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#CollateralIn
 * SecuritiesTransactionType9Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#CollateralOut
 * SecuritiesTransactionType9Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#DepositoryReceiptConversion
 * SecuritiesTransactionType9Code.DepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#FactorUpdate
 * SecuritiesTransactionType9Code.FactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#MoveOfStock
 * SecuritiesTransactionType9Code.MoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Issuance
 * SecuritiesTransactionType9Code.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#MarkDown
 * SecuritiesTransactionType9Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#MarkUp
 * SecuritiesTransactionType9Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Netting
 * SecuritiesTransactionType9Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#NonSyndicated
 * SecuritiesTransactionType9Code.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#ExternalAccountTransfer
 * SecuritiesTransactionType9Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#InternalAccountTransfer
 * SecuritiesTransactionType9Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#PairOff
 * SecuritiesTransactionType9Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Placement
 * SecuritiesTransactionType9Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#PortfolioMove
 * SecuritiesTransactionType9Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Realignment
 * SecuritiesTransactionType9Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Withdrawal
 * SecuritiesTransactionType9Code.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Redemption
 * SecuritiesTransactionType9Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionType9Code.DepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Repo
 * SecuritiesTransactionType9Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionType9Code.ReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#ReverseRepo
 * SecuritiesTransactionType9Code.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#SellBuyBack
 * SecuritiesTransactionType9Code.SellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#SecuritiesBorrowing
 * SecuritiesTransactionType9Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#SecuritiesLending
 * SecuritiesTransactionType9Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Subscription
 * SecuritiesTransactionType9Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#SyndicateUnderwriters
 * SecuritiesTransactionType9Code.SyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#TBAClosing
 * SecuritiesTransactionType9Code.TBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Trade
 * SecuritiesTransactionType9Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#TripartyRepo
 * SecuritiesTransactionType9Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#TripartyReverseRepo
 * SecuritiesTransactionType9Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#Turnaround
 * SecuritiesTransactionType9Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#AutoCollateralisation
 * SecuritiesTransactionType9Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#MarketClaim
 * SecuritiesTransactionType9Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#CorporateAction
 * SecuritiesTransactionType9Code.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code#ExchangeTradedFunds
 * SecuritiesTransactionType9Code.ExchangeTradedFunds}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code
 * SecuritiesTransactionType16Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
 * SecuritiesTransactionType3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionType9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#CentralBankCollateralOperation
	 * SecuritiesTransactionType16Code.CentralBankCollateralOperation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code CentralBankCollateralOperation = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.CentralBankCollateralOperation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#BuySellBack
	 * SecuritiesTransactionType16Code.BuySellBack}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code BuySellBack = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.BuySellBack);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#CollateralIn
	 * SecuritiesTransactionType16Code.CollateralIn}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code CollateralIn = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.CollateralIn);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#CollateralOut
	 * SecuritiesTransactionType16Code.CollateralOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code CollateralOut = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.CollateralOut);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#DepositoryReceiptConversion
	 * SecuritiesTransactionType16Code.DepositoryReceiptConversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code DepositoryReceiptConversion = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.DepositoryReceiptConversion);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#FactorUpdate
	 * SecuritiesTransactionType16Code.FactorUpdate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code FactorUpdate = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.FactorUpdate);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.FactorUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#MoveOfStock
	 * SecuritiesTransactionType16Code.MoveOfStock}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code MoveOfStock = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.MoveOfStock);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MoveOfStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Issuance
	 * SecuritiesTransactionType16Code.Issuance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Issuance = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Issuance);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Issuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#MarkDown
	 * SecuritiesTransactionType16Code.MarkDown}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code MarkDown = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.MarkDown);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#MarkUp
	 * SecuritiesTransactionType16Code.MarkUp}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code MarkUp = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.MarkUp);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Netting
	 * SecuritiesTransactionType16Code.Netting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Netting = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Netting);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#NonSyndicated
	 * SecuritiesTransactionType16Code.NonSyndicated}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code NonSyndicated = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.NonSyndicated);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.NonSyndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#ExternalAccountTransfer
	 * SecuritiesTransactionType16Code.ExternalAccountTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code ExternalAccountTransfer = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.ExternalAccountTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#InternalAccountTransfer
	 * SecuritiesTransactionType16Code.InternalAccountTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code InternalAccountTransfer = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.InternalAccountTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.InternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#PairOff
	 * SecuritiesTransactionType16Code.PairOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code PairOff = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.PairOff);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PairOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Placement
	 * SecuritiesTransactionType16Code.Placement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Placement = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Placement);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Placement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#PortfolioMove
	 * SecuritiesTransactionType16Code.PortfolioMove}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code PortfolioMove = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.PortfolioMove);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PortfolioMove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Realignment
	 * SecuritiesTransactionType16Code.Realignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Realignment = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Realignment);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Realignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Withdrawal
	 * SecuritiesTransactionType16Code.Withdrawal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Withdrawal = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Withdrawal);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Withdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Redemption
	 * SecuritiesTransactionType16Code.Redemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Redemption = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Redemption);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#DepositoryReceiptReleaseCancellation
	 * SecuritiesTransactionType16Code.DepositoryReceiptReleaseCancellation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code DepositoryReceiptReleaseCancellation = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.DepositoryReceiptReleaseCancellation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptReleaseCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Repo
	 * SecuritiesTransactionType16Code.Repo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Repo = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Repo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#ReturnDeliveryWithoutMatching
	 * SecuritiesTransactionType16Code.ReturnDeliveryWithoutMatching}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code ReturnDeliveryWithoutMatching = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.ReturnDeliveryWithoutMatching);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReturnDeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#ReverseRepo
	 * SecuritiesTransactionType16Code.ReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code ReverseRepo = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.ReverseRepo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#SellBuyBack
	 * SecuritiesTransactionType16Code.SellBuyBack}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code SellBuyBack = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.SellBuyBack);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#SecuritiesBorrowing
	 * SecuritiesTransactionType16Code.SecuritiesBorrowing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code SecuritiesBorrowing = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.SecuritiesBorrowing);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#SecuritiesLending
	 * SecuritiesTransactionType16Code.SecuritiesLending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code SecuritiesLending = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.SecuritiesLending);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Subscription
	 * SecuritiesTransactionType16Code.Subscription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Subscription = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Subscription);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#SyndicateUnderwriters
	 * SecuritiesTransactionType16Code.SyndicateUnderwriters}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code SyndicateUnderwriters = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.SyndicateUnderwriters);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SyndicateUnderwriters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#TBAClosing
	 * SecuritiesTransactionType16Code.TBAClosing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code TBAClosing = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.TBAClosing);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TBAClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Trade
	 * SecuritiesTransactionType16Code.Trade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Trade = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Trade);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#TripartyRepo
	 * SecuritiesTransactionType16Code.TripartyRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code TripartyRepo = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.TripartyRepo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#TripartyReverseRepo
	 * SecuritiesTransactionType16Code.TripartyReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code TripartyReverseRepo = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.TripartyReverseRepo);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#Turnaround
	 * SecuritiesTransactionType16Code.Turnaround}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code Turnaround = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.Turnaround);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Turnaround.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#AutoCollateralisation
	 * SecuritiesTransactionType16Code.AutoCollateralisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code AutoCollateralisation = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.AutoCollateralisation);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#MarketClaim
	 * SecuritiesTransactionType16Code.MarketClaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code MarketClaim = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.MarketClaim);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#CorporateAction
	 * SecuritiesTransactionType16Code.CorporateAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code CorporateAction = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.CorporateAction);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
	 * SecuritiesTransactionType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType16Code#ExchangeTradedFunds
	 * SecuritiesTransactionType16Code.ExchangeTradedFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType9Code ExchangeTradedFunds = new SecuritiesTransactionType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.ExchangeTradedFunds);
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType9Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExchangeTradedFunds.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionType9Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionType9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNCB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType9Code";
				definition = "Specifies underlying information regarding the type of transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType16Code.mmObject());
				previousVersion_lazy = () -> SecuritiesTransactionType3Code.mmObject();
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType9Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.BuySellBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.DepositoryReceiptConversion, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.FactorUpdate,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.MoveOfStock, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Issuance,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.MarkDown, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.MarkUp,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Netting, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.NonSyndicated,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.ExternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.InternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.PairOff, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Placement,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.PortfolioMove, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Realignment,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Withdrawal, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Redemption,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.DepositoryReceiptReleaseCancellation, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Repo,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.ReturnDeliveryWithoutMatching, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.SecuritiesBorrowing,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.SecuritiesLending, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Trade, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.AutoCollateralisation, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.MarketClaim,
						com.tools20022.repository.codeset.SecuritiesTransactionType9Code.CorporateAction, com.tools20022.repository.codeset.SecuritiesTransactionType9Code.ExchangeTradedFunds);
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
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SyndicateUnderwriters.getCodeName().get(), SyndicateUnderwriters);
		codesByName.put(TBAClosing.getCodeName().get(), TBAClosing);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(TripartyRepo.getCodeName().get(), TripartyRepo);
		codesByName.put(TripartyReverseRepo.getCodeName().get(), TripartyReverseRepo);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
	}

	public static SecuritiesTransactionType9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionType9Code[] values() {
		SecuritiesTransactionType9Code[] values = new SecuritiesTransactionType9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionType9Code> {
		@Override
		public SecuritiesTransactionType9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionType9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}