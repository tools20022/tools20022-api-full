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
import com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies underlying information regarding the type of transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
 * SecuritiesTransactionTypeV2Code}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#CentralBankCollateralOperation
 * SecuritiesTransactionType10Code.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#BuySellBack
 * SecuritiesTransactionType10Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#CollateralIn
 * SecuritiesTransactionType10Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#CollateralOut
 * SecuritiesTransactionType10Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Netting
 * SecuritiesTransactionType10Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#ExternalAccountTransfer
 * SecuritiesTransactionType10Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#InternalAccountTransfer
 * SecuritiesTransactionType10Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#PairOff
 * SecuritiesTransactionType10Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Placement
 * SecuritiesTransactionType10Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#PortfolioMove
 * SecuritiesTransactionType10Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Realignment
 * SecuritiesTransactionType10Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Redemption
 * SecuritiesTransactionType10Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Repo
 * SecuritiesTransactionType10Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#ReverseRepo
 * SecuritiesTransactionType10Code.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#SecuritiesBorrowing
 * SecuritiesTransactionType10Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#SecuritiesLending
 * SecuritiesTransactionType10Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Subscription
 * SecuritiesTransactionType10Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Trade
 * SecuritiesTransactionType10Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#TripartyRepo
 * SecuritiesTransactionType10Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#TripartyReverseRepo
 * SecuritiesTransactionType10Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#Turnaround
 * SecuritiesTransactionType10Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#AutoCollateralisation
 * SecuritiesTransactionType10Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#MarketClaim
 * SecuritiesTransactionType10Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#CorporateAction
 * SecuritiesTransactionType10Code.CorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code#ExchangeTradedFunds
 * SecuritiesTransactionType10Code.ExchangeTradedFunds}</li>
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
 * <li>"CNCB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionType10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code
 * SecuritiesTransactionType18Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
 * SecuritiesTransactionType6Code}</li>
 * </ul>
 */
public class SecuritiesTransactionType10Code extends SecuritiesTransactionTypeV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#CentralBankCollateralOperation
	 * SecuritiesTransactionType18Code.CentralBankCollateralOperation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CentralBankCollateralOperation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.CentralBankCollateralOperation);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#BuySellBack
	 * SecuritiesTransactionType18Code.BuySellBack}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode BuySellBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.BuySellBack);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#CollateralIn
	 * SecuritiesTransactionType18Code.CollateralIn}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CollateralIn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.CollateralIn);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#CollateralOut
	 * SecuritiesTransactionType18Code.CollateralOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CollateralOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.CollateralOut);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Netting
	 * SecuritiesTransactionType18Code.Netting}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Netting = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Netting);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#ExternalAccountTransfer
	 * SecuritiesTransactionType18Code.ExternalAccountTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode ExternalAccountTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.ExternalAccountTransfer);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#InternalAccountTransfer
	 * SecuritiesTransactionType18Code.InternalAccountTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode InternalAccountTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.InternalAccountTransfer);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#PairOff
	 * SecuritiesTransactionType18Code.PairOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode PairOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.PairOff);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Placement
	 * SecuritiesTransactionType18Code.Placement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Placement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Placement);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#PortfolioMove
	 * SecuritiesTransactionType18Code.PortfolioMove}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode PortfolioMove = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.PortfolioMove);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Realignment
	 * SecuritiesTransactionType18Code.Realignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Realignment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Realignment);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Redemption
	 * SecuritiesTransactionType18Code.Redemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Redemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Redemption);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Repo
	 * SecuritiesTransactionType18Code.Repo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Repo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Repo);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#ReverseRepo
	 * SecuritiesTransactionType18Code.ReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode ReverseRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.ReverseRepo);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#SecuritiesBorrowing
	 * SecuritiesTransactionType18Code.SecuritiesBorrowing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecuritiesBorrowing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.SecuritiesBorrowing);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#SecuritiesLending
	 * SecuritiesTransactionType18Code.SecuritiesLending}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode SecuritiesLending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.SecuritiesLending);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Subscription
	 * SecuritiesTransactionType18Code.Subscription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Subscription = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Subscription);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Trade
	 * SecuritiesTransactionType18Code.Trade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Trade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Trade);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#TripartyRepo
	 * SecuritiesTransactionType18Code.TripartyRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode TripartyRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.TripartyRepo);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#TripartyReverseRepo
	 * SecuritiesTransactionType18Code.TripartyReverseRepo}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode TripartyReverseRepo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.TripartyReverseRepo);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#Turnaround
	 * SecuritiesTransactionType18Code.Turnaround}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode Turnaround = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.Turnaround);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#AutoCollateralisation
	 * SecuritiesTransactionType18Code.AutoCollateralisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode AutoCollateralisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.AutoCollateralisation);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#MarketClaim
	 * SecuritiesTransactionType18Code.MarketClaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode MarketClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.MarketClaim);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#CorporateAction
	 * SecuritiesTransactionType18Code.CorporateAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode CorporateAction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.CorporateAction);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
	 * SecuritiesTransactionType10Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType18Code#ExchangeTradedFunds
	 * SecuritiesTransactionType18Code.ExchangeTradedFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode ExchangeTradedFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType18Code.ExchangeTradedFunds);
			owner_lazy = () -> SecuritiesTransactionType10Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CNCB");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType10Code";
				definition = "Specifies underlying information regarding the type of transaction.";
				previousVersion_lazy = () -> SecuritiesTransactionType6Code.mmObject();
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType18Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType10Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.BuySellBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Netting, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.InternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.PairOff,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Placement, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.PortfolioMove,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Realignment, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Redemption,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Repo, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Subscription, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Trade,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.TripartyRepo, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.TripartyReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.Turnaround, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionType10Code.CorporateAction,
						com.tools20022.repository.codeset.SecuritiesTransactionType10Code.ExchangeTradedFunds);
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}