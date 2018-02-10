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
import com.tools20022.repository.codeset.SecuritiesTransactionType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#CentralBankCollateralOperation
 * SecuritiesTransactionType3Code.CentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#BuySellBack
 * SecuritiesTransactionType3Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#CollateralIn
 * SecuritiesTransactionType3Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#CollateralOut
 * SecuritiesTransactionType3Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#DepositoryReceiptConversion
 * SecuritiesTransactionType3Code.DepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#FactorUpdate
 * SecuritiesTransactionType3Code.FactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#MoveOfStock
 * SecuritiesTransactionType3Code.MoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Issuance
 * SecuritiesTransactionType3Code.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#MarkDown
 * SecuritiesTransactionType3Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#MarkUp
 * SecuritiesTransactionType3Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Netting
 * SecuritiesTransactionType3Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#NonSyndicated
 * SecuritiesTransactionType3Code.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#ExternalAccountTransfer
 * SecuritiesTransactionType3Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#InternalAccountTransfer
 * SecuritiesTransactionType3Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#PairOff
 * SecuritiesTransactionType3Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Placement
 * SecuritiesTransactionType3Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#PortfolioMove
 * SecuritiesTransactionType3Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Realignment
 * SecuritiesTransactionType3Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Withdrawal
 * SecuritiesTransactionType3Code.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Redemption
 * SecuritiesTransactionType3Code.Redemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionType3Code.DepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Repo
 * SecuritiesTransactionType3Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionType3Code.ReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Reporting
 * SecuritiesTransactionType3Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#ReverseRepo
 * SecuritiesTransactionType3Code.ReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#SellBuyBack
 * SecuritiesTransactionType3Code.SellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#SecuritiesBorrowing
 * SecuritiesTransactionType3Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#SecuritiesLending
 * SecuritiesTransactionType3Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Subscription
 * SecuritiesTransactionType3Code.Subscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#SyndicateUnderwriters
 * SecuritiesTransactionType3Code.SyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#TBAClosing
 * SecuritiesTransactionType3Code.TBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Trade
 * SecuritiesTransactionType3Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#TripartyRepo
 * SecuritiesTransactionType3Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#TripartyReverseRepo
 * SecuritiesTransactionType3Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#Turnaround
 * SecuritiesTransactionType3Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#AutoCollateralisation
 * SecuritiesTransactionType3Code.AutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#MarketClaim
 * SecuritiesTransactionType3Code.MarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code#CorporateAction
 * SecuritiesTransactionType3Code.CorporateAction}</li>
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
 * "SecuritiesTransactionType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType9Code
 * SecuritiesTransactionType9Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code CentralBankCollateralOperation = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code BuySellBack = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code CollateralIn = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code CollateralOut = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code DepositoryReceiptConversion = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code FactorUpdate = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.FactorUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code MoveOfStock = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MoveOfStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Issuance = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Issuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code MarkDown = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code MarkUp = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Netting = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code NonSyndicated = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.NonSyndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code ExternalAccountTransfer = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code InternalAccountTransfer = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.InternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code PairOff = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PairOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Placement = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Placement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code PortfolioMove = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PortfolioMove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Realignment = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Realignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Withdrawal = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Withdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Redemption = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code DepositoryReceiptReleaseCancellation = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptReleaseCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Repo = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code ReturnDeliveryWithoutMatching = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReturnDeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Reporting = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Reporting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code ReverseRepo = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code SellBuyBack = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code SecuritiesBorrowing = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code SecuritiesLending = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Subscription = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code SyndicateUnderwriters = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SyndicateUnderwriters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code TBAClosing = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TBAClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Trade = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code TripartyRepo = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code TripartyReverseRepo = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code Turnaround = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Turnaround.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code AutoCollateralisation = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code MarketClaim = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType3Code
	 * SecuritiesTransactionType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType3Code CorporateAction = new SecuritiesTransactionType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType3Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CorporateAction.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionType3Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNCB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType3Code";
				definition = "Specifies underlying information regarding the type of transaction.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesTransactionType9Code.mmObject());
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType3Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.BuySellBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.DepositoryReceiptConversion, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.FactorUpdate,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.MoveOfStock, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Issuance,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.MarkDown, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.MarkUp,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Netting, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.NonSyndicated,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.ExternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.InternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.PairOff, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Placement,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.PortfolioMove, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Realignment,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Withdrawal, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Redemption,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.DepositoryReceiptReleaseCancellation, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Repo,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.ReturnDeliveryWithoutMatching, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Reporting,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.ReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.SellBuyBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Subscription, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.SyndicateUnderwriters,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.TBAClosing, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Trade,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.TripartyRepo, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.TripartyReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.Turnaround, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.AutoCollateralisation,
						com.tools20022.repository.codeset.SecuritiesTransactionType3Code.MarketClaim, com.tools20022.repository.codeset.SecuritiesTransactionType3Code.CorporateAction);
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
		codesByName.put(Reporting.getCodeName().get(), Reporting);
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
	}

	public static SecuritiesTransactionType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionType3Code[] values() {
		SecuritiesTransactionType3Code[] values = new SecuritiesTransactionType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionType3Code> {
		@Override
		public SecuritiesTransactionType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}