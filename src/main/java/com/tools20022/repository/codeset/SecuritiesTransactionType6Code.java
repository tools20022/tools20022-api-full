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
import com.tools20022.repository.codeset.SecuritiesTransactionType6Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#CentralBankCollateralOperation
 * SecuritiesTransactionType6Code.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#BuySellBack
 * SecuritiesTransactionType6Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#CollateralIn
 * SecuritiesTransactionType6Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#CollateralOut
 * SecuritiesTransactionType6Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Netting
 * SecuritiesTransactionType6Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#ExternalAccountTransfer
 * SecuritiesTransactionType6Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#InternalAccountTransfer
 * SecuritiesTransactionType6Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#PairOff
 * SecuritiesTransactionType6Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Placement
 * SecuritiesTransactionType6Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#PortfolioMove
 * SecuritiesTransactionType6Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Realignment
 * SecuritiesTransactionType6Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Redemption
 * SecuritiesTransactionType6Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Repo
 * SecuritiesTransactionType6Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#ReverseRepo
 * SecuritiesTransactionType6Code.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#SecuritiesBorrowing
 * SecuritiesTransactionType6Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#SecuritiesLending
 * SecuritiesTransactionType6Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Subscription
 * SecuritiesTransactionType6Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Trade
 * SecuritiesTransactionType6Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#TripartyRepo
 * SecuritiesTransactionType6Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#TripartyReverseRepo
 * SecuritiesTransactionType6Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#Turnaround
 * SecuritiesTransactionType6Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#AutoCollateralisation
 * SecuritiesTransactionType6Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#MarketClaim
 * SecuritiesTransactionType6Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code#CorporateAction
 * SecuritiesTransactionType6Code.CorporateAction}</li>
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
 * "SecuritiesTransactionType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType10Code
 * SecuritiesTransactionType10Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code CentralBankCollateralOperation = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code BuySellBack = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code CollateralIn = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code CollateralOut = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Netting = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code ExternalAccountTransfer = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code InternalAccountTransfer = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.InternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code PairOff = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PairOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Placement = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Placement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code PortfolioMove = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PortfolioMove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Realignment = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Realignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Redemption = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Repo = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code ReverseRepo = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code SecuritiesBorrowing = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code SecuritiesLending = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Subscription = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Trade = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code TripartyRepo = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code TripartyReverseRepo = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code Turnaround = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Turnaround.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code AutoCollateralisation = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code MarketClaim = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType6Code
	 * SecuritiesTransactionType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType6Code CorporateAction = new SecuritiesTransactionType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType6Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CorporateAction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionType6Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNCB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType6Code";
				definition = "Specifies underlying information regarding the type of transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType10Code.mmObject());
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType6Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.BuySellBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Netting, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.InternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.PairOff,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Placement, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.PortfolioMove,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Realignment, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Redemption,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Repo, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Subscription, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Trade,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.TripartyRepo, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.TripartyReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.Turnaround, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionType6Code.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionType6Code.CorporateAction);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CentralBankCollateralOperation.getCodeName().get(), CentralBankCollateralOperation);
		codesByName.put(BuySellBack.getCodeName().get(), BuySellBack);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(ExternalAccountTransfer.getCodeName().get(), ExternalAccountTransfer);
		codesByName.put(InternalAccountTransfer.getCodeName().get(), InternalAccountTransfer);
		codesByName.put(PairOff.getCodeName().get(), PairOff);
		codesByName.put(Placement.getCodeName().get(), Placement);
		codesByName.put(PortfolioMove.getCodeName().get(), PortfolioMove);
		codesByName.put(Realignment.getCodeName().get(), Realignment);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(ReverseRepo.getCodeName().get(), ReverseRepo);
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(TripartyRepo.getCodeName().get(), TripartyRepo);
		codesByName.put(TripartyReverseRepo.getCodeName().get(), TripartyReverseRepo);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
	}

	public static SecuritiesTransactionType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionType6Code[] values() {
		SecuritiesTransactionType6Code[] values = new SecuritiesTransactionType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionType6Code> {
		@Override
		public SecuritiesTransactionType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}