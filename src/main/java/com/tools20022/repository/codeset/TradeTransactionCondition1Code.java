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
import com.tools20022.repository.codeset.TradeTransactionConditionCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Indicates the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
 * TradeTransactionConditionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCumBonus
 * TradeTransactionCondition1Code.mmCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmExBonus
 * TradeTransactionCondition1Code.mmExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCumCoupon
 * TradeTransactionCondition1Code.mmCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmExCoupon
 * TradeTransactionCondition1Code.mmExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCumDividend
 * TradeTransactionCondition1Code.mmCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmExDividend
 * TradeTransactionCondition1Code.mmExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCumRights
 * TradeTransactionCondition1Code.mmCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmExRights
 * TradeTransactionCondition1Code.mmExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCumWarrant
 * TradeTransactionCondition1Code.mmCumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmExWarrant
 * TradeTransactionCondition1Code.mmExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialCumDividend
 * TradeTransactionCondition1Code.mmSpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialExDividend
 * TradeTransactionCondition1Code.mmSpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmBrokerDueBill
 * TradeTransactionCondition1Code.mmBrokerDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSoldShort
 * TradeTransactionCondition1Code.mmSoldShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmDirty
 * TradeTransactionCondition1Code.mmDirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmClean
 * TradeTransactionCondition1Code.mmClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmBlock
 * TradeTransactionCondition1Code.mmBlock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmGuaranteedDelivery
 * TradeTransactionCondition1Code.mmGuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmFractions
 * TradeTransactionCondition1Code.mmFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCrossTrade
 * TradeTransactionCondition1Code.mmCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmNoCrossTrade
 * TradeTransactionCondition1Code.mmNoCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmDirectOrder
 * TradeTransactionCondition1Code.mmDirectOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmDirectedOrder
 * TradeTransactionCondition1Code.mmDirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmWarehouseTrade
 * TradeTransactionCondition1Code.mmWarehouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmNotIncrease
 * TradeTransactionCondition1Code.mmNotIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmNotReduce
 * TradeTransactionCondition1Code.mmNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmForwardPriceTrade
 * TradeTransactionCondition1Code.mmForwardPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmHistoricPriceTrade
 * TradeTransactionCondition1Code.mmHistoricPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmResultOption
 * TradeTransactionCondition1Code.mmResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmResultRepo
 * TradeTransactionCondition1Code.mmResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmDeliverCountryIncorporation
 * TradeTransactionCondition1Code.mmDeliverCountryIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmDeliveryForm
 * TradeTransactionCondition1Code.mmDeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmBoardLot
 * TradeTransactionCondition1Code.mmBoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmBadName
 * TradeTransactionCondition1Code.mmBadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmBestExecution
 * TradeTransactionCondition1Code.mmBestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCall
 * TradeTransactionCondition1Code.mmCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmClosureBeforeRollOver
 * TradeTransactionCondition1Code.mmClosureBeforeRollOver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmMonthly
 * TradeTransactionCondition1Code.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmNewTradeFollowingRollover
 * TradeTransactionCondition1Code.mmNewTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmTradeFollowingRollover
 * TradeTransactionCondition1Code.mmTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmPutt
 * TradeTransactionCondition1Code.mmPutt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialCumCoupon
 * TradeTransactionCondition1Code.mmSpecialCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialExCoupon
 * TradeTransactionCondition1Code.mmSpecialExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialExBonus
 * TradeTransactionCondition1Code.mmSpecialExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialCumBonus
 * TradeTransactionCondition1Code.mmSpecialCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialCumRights
 * TradeTransactionCondition1Code.mmSpecialCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialExRights
 * TradeTransactionCondition1Code.mmSpecialExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialCumCapitalRepayments
 * TradeTransactionCondition1Code.mmSpecialCumCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialExCapitalRepayments
 * TradeTransactionCondition1Code.mmSpecialExCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmCashSettlement
 * TradeTransactionCondition1Code.mmCashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#mmSpecialPrice
 * TradeTransactionCondition1Code.mmSpecialPrice}</li>
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
 * <li>"CBNS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransactionCondition1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the conditions under which the order/trade is to be/was executed."
 * </li>
 * </ul>
 */
public class TradeTransactionCondition1Code extends TradeTransactionConditionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumBonus"</li>
	 * </ul>
	 */
	public static final MMCode mmCumBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumBonus";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExBonus"</li>
	 * </ul>
	 */
	public static final MMCode mmExBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExBonus";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumCoupon"</li>
	 * </ul>
	 */
	public static final MMCode mmCumCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumCoupon";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExCoupon"</li>
	 * </ul>
	 */
	public static final MMCode mmExCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividend"</li>
	 * </ul>
	 */
	public static final MMCode mmCumDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividend";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividend"</li>
	 * </ul>
	 */
	public static final MMCode mmExDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividend";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumRights"</li>
	 * </ul>
	 */
	public static final MMCode mmCumRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumRights";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExRights"</li>
	 * </ul>
	 */
	public static final MMCode mmExRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExRights";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumWarrant"</li>
	 * </ul>
	 */
	public static final MMCode mmCumWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumWarrant";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWarrant"</li>
	 * </ul>
	 */
	public static final MMCode mmExWarrant = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExWarrant";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumDividend"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialCumDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumDividend";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDividend"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialExDividend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDividend";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerDueBill"</li>
	 * </ul>
	 */
	public static final MMCode mmBrokerDueBill = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerDueBill";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoldShort"</li>
	 * </ul>
	 */
	public static final MMCode mmSoldShort = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoldShort";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * </ul>
	 */
	public static final MMCode mmDirty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * </ul>
	 */
	public static final MMCode mmClean = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Block"</li>
	 * </ul>
	 */
	public static final MMCode mmBlock = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Block";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDelivery"</li>
	 * </ul>
	 */
	public static final MMCode mmGuaranteedDelivery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDelivery";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fractions"</li>
	 * </ul>
	 */
	public static final MMCode mmFractions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fractions";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmCrossTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossTrade";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCrossTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmNoCrossTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCrossTrade";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectOrder"</li>
	 * </ul>
	 */
	public static final MMCode mmDirectOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectOrder";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectedOrder"</li>
	 * </ul>
	 */
	public static final MMCode mmDirectedOrder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectedOrder";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarehouseTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmWarehouseTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarehouseTrade";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIncrease"</li>
	 * </ul>
	 */
	public static final MMCode mmNotIncrease = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIncrease";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReduce"</li>
	 * </ul>
	 */
	public static final MMCode mmNotReduce = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReduce";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardPriceTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmForwardPriceTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardPriceTrade";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HistoricPriceTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmHistoricPriceTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HistoricPriceTrade";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultOption"</li>
	 * </ul>
	 */
	public static final MMCode mmResultOption = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultOption";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultRepo"</li>
	 * </ul>
	 */
	public static final MMCode mmResultRepo = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultRepo";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverCountryIncorporation"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverCountryIncorporation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverCountryIncorporation";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryForm"</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveryForm = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryForm";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * </ul>
	 */
	public static final MMCode mmBoardLot = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadName"</li>
	 * </ul>
	 */
	public static final MMCode mmBadName = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadName";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * </ul>
	 */
	public static final MMCode mmBestExecution = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestExecution";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * </ul>
	 */
	public static final MMCode mmCall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureBeforeRollOver"</li>
	 * </ul>
	 */
	public static final MMCode mmClosureBeforeRollOver = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureBeforeRollOver";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * </ul>
	 */
	public static final MMCode mmMonthly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewTradeFollowingRollover"</li>
	 * </ul>
	 */
	public static final MMCode mmNewTradeFollowingRollover = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewTradeFollowingRollover";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeFollowingRollover"</li>
	 * </ul>
	 */
	public static final MMCode mmTradeFollowingRollover = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeFollowingRollover";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Putt"</li>
	 * </ul>
	 */
	public static final MMCode mmPutt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Putt";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCoupon"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialCumCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumCoupon";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCoupon"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialExCoupon = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExCoupon";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExBonus"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialExBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExBonus";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumBonus"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialCumBonus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumBonus";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumRights"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialCumRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumRights";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExRights"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialExRights = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExRights";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCapitalRepayments"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialCumCapitalRepayments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumCapitalRepayments";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCapitalRepayments"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialExCapitalRepayments = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExCapitalRepayments";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * </ul>
	 */
	public static final MMCode mmCashSettlement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialPrice";
			owner_lazy = () -> TradeTransactionCondition1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition1Code";
				definition = "Indicates the conditions under which the order/trade is to be/was executed.";
				code_lazy = () -> Arrays.asList(TradeTransactionCondition1Code.mmCumBonus, TradeTransactionCondition1Code.mmExBonus, TradeTransactionCondition1Code.mmCumCoupon, TradeTransactionCondition1Code.mmExCoupon,
						TradeTransactionCondition1Code.mmCumDividend, TradeTransactionCondition1Code.mmExDividend, TradeTransactionCondition1Code.mmCumRights, TradeTransactionCondition1Code.mmExRights,
						TradeTransactionCondition1Code.mmCumWarrant, TradeTransactionCondition1Code.mmExWarrant, TradeTransactionCondition1Code.mmSpecialCumDividend, TradeTransactionCondition1Code.mmSpecialExDividend,
						TradeTransactionCondition1Code.mmBrokerDueBill, TradeTransactionCondition1Code.mmSoldShort, TradeTransactionCondition1Code.mmDirty, TradeTransactionCondition1Code.mmClean, TradeTransactionCondition1Code.mmBlock,
						TradeTransactionCondition1Code.mmGuaranteedDelivery, TradeTransactionCondition1Code.mmFractions, TradeTransactionCondition1Code.mmCrossTrade, TradeTransactionCondition1Code.mmNoCrossTrade,
						TradeTransactionCondition1Code.mmDirectOrder, TradeTransactionCondition1Code.mmDirectedOrder, TradeTransactionCondition1Code.mmWarehouseTrade, TradeTransactionCondition1Code.mmNotIncrease,
						TradeTransactionCondition1Code.mmNotReduce, TradeTransactionCondition1Code.mmForwardPriceTrade, TradeTransactionCondition1Code.mmHistoricPriceTrade, TradeTransactionCondition1Code.mmResultOption,
						TradeTransactionCondition1Code.mmResultRepo, TradeTransactionCondition1Code.mmDeliverCountryIncorporation, TradeTransactionCondition1Code.mmDeliveryForm, TradeTransactionCondition1Code.mmBoardLot,
						TradeTransactionCondition1Code.mmBadName, TradeTransactionCondition1Code.mmBestExecution, TradeTransactionCondition1Code.mmCall, TradeTransactionCondition1Code.mmClosureBeforeRollOver,
						TradeTransactionCondition1Code.mmMonthly, TradeTransactionCondition1Code.mmNewTradeFollowingRollover, TradeTransactionCondition1Code.mmTradeFollowingRollover, TradeTransactionCondition1Code.mmPutt,
						TradeTransactionCondition1Code.mmSpecialCumCoupon, TradeTransactionCondition1Code.mmSpecialExCoupon, TradeTransactionCondition1Code.mmSpecialExBonus, TradeTransactionCondition1Code.mmSpecialCumBonus,
						TradeTransactionCondition1Code.mmSpecialCumRights, TradeTransactionCondition1Code.mmSpecialExRights, TradeTransactionCondition1Code.mmSpecialCumCapitalRepayments,
						TradeTransactionCondition1Code.mmSpecialExCapitalRepayments, TradeTransactionCondition1Code.mmCashSettlement, TradeTransactionCondition1Code.mmSpecialPrice);
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}