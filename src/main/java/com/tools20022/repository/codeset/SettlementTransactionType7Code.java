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
import com.tools20022.repository.codeset.SettlementTransactionType7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#BuySellBack
 * SettlementTransactionType7Code.BuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#CollateralIn
 * SettlementTransactionType7Code.CollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#CollateralOut
 * SettlementTransactionType7Code.CollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#DepositoryReceiptConversion
 * SettlementTransactionType7Code.DepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#FactorUpdate
 * SettlementTransactionType7Code.FactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#MoveOfStock
 * SettlementTransactionType7Code.MoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Issuance
 * SettlementTransactionType7Code.Issuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#MarkDown
 * SettlementTransactionType7Code.MarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#MarkUp
 * SettlementTransactionType7Code.MarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Netting
 * SettlementTransactionType7Code.Netting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#NonSyndicated
 * SettlementTransactionType7Code.NonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#ExternalAccountTransfer
 * SettlementTransactionType7Code.ExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#InternalAccountTransfer
 * SettlementTransactionType7Code.InternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#PairOff
 * SettlementTransactionType7Code.PairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Placement
 * SettlementTransactionType7Code.Placement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#PortfolioMove
 * SettlementTransactionType7Code.PortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Realignment
 * SettlementTransactionType7Code.Realignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Withdrawal
 * SettlementTransactionType7Code.Withdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#DepositoryReceiptReleaseCancellation
 * SettlementTransactionType7Code.DepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Repo
 * SettlementTransactionType7Code.Repo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#ReturnDeliveryWithoutMatching
 * SettlementTransactionType7Code.ReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Reporting
 * SettlementTransactionType7Code.Reporting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#ReverseRepurchaseAgreement
 * SettlementTransactionType7Code.ReverseRepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#SellBuyBack
 * SettlementTransactionType7Code.SellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#SecuritiesBorrowing
 * SettlementTransactionType7Code.SecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#SecuritiesLending
 * SettlementTransactionType7Code.SecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#SyndicateUnderwriters
 * SettlementTransactionType7Code.SyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#TBAClosing
 * SettlementTransactionType7Code.TBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Trade
 * SettlementTransactionType7Code.Trade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#TripartyRepo
 * SettlementTransactionType7Code.TripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#TripartyReverseRepo
 * SettlementTransactionType7Code.TripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#Turnaround
 * SettlementTransactionType7Code.Turnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#GuaranteedClose
 * SettlementTransactionType7Code.GuaranteedClose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code#OfferingIssuingTrade
 * SettlementTransactionType7Code.OfferingIssuingTrade}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV3Code
 * SecuritiesTransactionTypeV3Code}</li>
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
 * "SettlementTransactionType7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementTransactionType7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code BuySellBack = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code CollateralIn = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code CollateralOut = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code DepositoryReceiptConversion = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.DepositoryReceiptConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code FactorUpdate = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.FactorUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code MoveOfStock = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.MoveOfStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Issuance = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Issuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code MarkDown = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code MarkUp = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Netting = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code NonSyndicated = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.NonSyndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code ExternalAccountTransfer = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.ExternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code InternalAccountTransfer = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.InternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code PairOff = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.PairOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Placement = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Placement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code PortfolioMove = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.PortfolioMove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Realignment = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Realignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Withdrawal = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Withdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code DepositoryReceiptReleaseCancellation = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.DepositoryReceiptReleaseCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Repo = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code ReturnDeliveryWithoutMatching = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.ReturnDeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reporting"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Reporting = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reporting";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Reporting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepurchaseAgreement"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code ReverseRepurchaseAgreement = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepurchaseAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.ReverseRepurchaseAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code SellBuyBack = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.SellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code SecuritiesBorrowing = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code SecuritiesLending = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code SyndicateUnderwriters = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.SyndicateUnderwriters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code TBAClosing = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.TBAClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Trade = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code TripartyRepo = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.TripartyRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code TripartyReverseRepo = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.TripartyReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code Turnaround = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.Turnaround.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedClose"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code GuaranteedClose = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedClose";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.GuaranteedClose.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementTransactionType7Code
	 * SettlementTransactionType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferingIssuingTrade"</li>
	 * </ul>
	 */
	public static final SettlementTransactionType7Code OfferingIssuingTrade = new SettlementTransactionType7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferingIssuingTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementTransactionType7Code.mmObject();
			codeName = SecuritiesTransactionTypeV3Code.OfferingIssuingTrade.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementTransactionType7Code> codesByName = new LinkedHashMap<>();

	protected SettlementTransactionType7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BSBK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementTransactionType7Code";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				trace_lazy = () -> SecuritiesTransactionTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementTransactionType7Code.BuySellBack, com.tools20022.repository.codeset.SettlementTransactionType7Code.CollateralIn,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.CollateralOut, com.tools20022.repository.codeset.SettlementTransactionType7Code.DepositoryReceiptConversion,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.FactorUpdate, com.tools20022.repository.codeset.SettlementTransactionType7Code.MoveOfStock,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.Issuance, com.tools20022.repository.codeset.SettlementTransactionType7Code.MarkDown,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.MarkUp, com.tools20022.repository.codeset.SettlementTransactionType7Code.Netting,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.NonSyndicated, com.tools20022.repository.codeset.SettlementTransactionType7Code.ExternalAccountTransfer,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.InternalAccountTransfer, com.tools20022.repository.codeset.SettlementTransactionType7Code.PairOff,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.Placement, com.tools20022.repository.codeset.SettlementTransactionType7Code.PortfolioMove,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.Realignment, com.tools20022.repository.codeset.SettlementTransactionType7Code.Withdrawal,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.DepositoryReceiptReleaseCancellation, com.tools20022.repository.codeset.SettlementTransactionType7Code.Repo,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.ReturnDeliveryWithoutMatching, com.tools20022.repository.codeset.SettlementTransactionType7Code.Reporting,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.ReverseRepurchaseAgreement, com.tools20022.repository.codeset.SettlementTransactionType7Code.SellBuyBack,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SettlementTransactionType7Code.SecuritiesLending,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SettlementTransactionType7Code.TBAClosing,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.Trade, com.tools20022.repository.codeset.SettlementTransactionType7Code.TripartyRepo,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.TripartyReverseRepo, com.tools20022.repository.codeset.SettlementTransactionType7Code.Turnaround,
						com.tools20022.repository.codeset.SettlementTransactionType7Code.GuaranteedClose, com.tools20022.repository.codeset.SettlementTransactionType7Code.OfferingIssuingTrade);
			}
		});
		return mmObject_lazy.get();
	}

	static {
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
		codesByName.put(DepositoryReceiptReleaseCancellation.getCodeName().get(), DepositoryReceiptReleaseCancellation);
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(ReturnDeliveryWithoutMatching.getCodeName().get(), ReturnDeliveryWithoutMatching);
		codesByName.put(Reporting.getCodeName().get(), Reporting);
		codesByName.put(ReverseRepurchaseAgreement.getCodeName().get(), ReverseRepurchaseAgreement);
		codesByName.put(SellBuyBack.getCodeName().get(), SellBuyBack);
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(SyndicateUnderwriters.getCodeName().get(), SyndicateUnderwriters);
		codesByName.put(TBAClosing.getCodeName().get(), TBAClosing);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(TripartyRepo.getCodeName().get(), TripartyRepo);
		codesByName.put(TripartyReverseRepo.getCodeName().get(), TripartyReverseRepo);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(GuaranteedClose.getCodeName().get(), GuaranteedClose);
		codesByName.put(OfferingIssuingTrade.getCodeName().get(), OfferingIssuingTrade);
	}

	public static SettlementTransactionType7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementTransactionType7Code[] values() {
		SettlementTransactionType7Code[] values = new SettlementTransactionType7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementTransactionType7Code> {
		@Override
		public SettlementTransactionType7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementTransactionType7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}