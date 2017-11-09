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
 * Specifies the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
 * TradeTransactionConditionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmCumBonus
 * TradeTransactionCondition3Code.mmCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmExBonus
 * TradeTransactionCondition3Code.mmExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmCumCoupon
 * TradeTransactionCondition3Code.mmCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmExCoupon
 * TradeTransactionCondition3Code.mmExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmCumDividend
 * TradeTransactionCondition3Code.mmCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmExDividend
 * TradeTransactionCondition3Code.mmExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmCumRights
 * TradeTransactionCondition3Code.mmCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmExRights
 * TradeTransactionCondition3Code.mmExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmCumWarrant
 * TradeTransactionCondition3Code.mmCumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmExWarrant
 * TradeTransactionCondition3Code.mmExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmSpecialCumDividend
 * TradeTransactionCondition3Code.mmSpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmSpecialExDividend
 * TradeTransactionCondition3Code.mmSpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmBrokerDueBill
 * TradeTransactionCondition3Code.mmBrokerDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmSoldShort
 * TradeTransactionCondition3Code.mmSoldShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmDirty
 * TradeTransactionCondition3Code.mmDirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmClean
 * TradeTransactionCondition3Code.mmClean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmBlock
 * TradeTransactionCondition3Code.mmBlock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmGuaranteedDelivery
 * TradeTransactionCondition3Code.mmGuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmFractions
 * TradeTransactionCondition3Code.mmFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmCrossTrade
 * TradeTransactionCondition3Code.mmCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmNoCrossTrade
 * TradeTransactionCondition3Code.mmNoCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmDirectOrder
 * TradeTransactionCondition3Code.mmDirectOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmDirectedOrder
 * TradeTransactionCondition3Code.mmDirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmWarehouseTrade
 * TradeTransactionCondition3Code.mmWarehouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmNotIncrease
 * TradeTransactionCondition3Code.mmNotIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmNotReduce
 * TradeTransactionCondition3Code.mmNotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmForwardPriceTrade
 * TradeTransactionCondition3Code.mmForwardPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmHistoricPriceTrade
 * TradeTransactionCondition3Code.mmHistoricPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmResultOption
 * TradeTransactionCondition3Code.mmResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmResultRepo
 * TradeTransactionCondition3Code.mmResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmDeliverCountryIncorporation
 * TradeTransactionCondition3Code.mmDeliverCountryIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmDeliveryForm
 * TradeTransactionCondition3Code.mmDeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmBoardLot
 * TradeTransactionCondition3Code.mmBoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmBadName
 * TradeTransactionCondition3Code.mmBadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmMarketPrice
 * TradeTransactionCondition3Code.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmNegotiatedTrade
 * TradeTransactionCondition3Code.mmNegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#mmNonMarketPrice
 * TradeTransactionCondition3Code.mmNonMarketPrice}</li>
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
 * "TradeTransactionCondition3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be/was executed."
 * </li>
 * </ul>
 */
public class TradeTransactionCondition3Code extends TradeTransactionConditionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
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
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmMarketPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * </ul>
	 */
	public static final MMCode mmNegotiatedTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code
	 * TradeTransactionCondition3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMarketPrice"</li>
	 * </ul>
	 */
	public static final MMCode mmNonMarketPrice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMarketPrice";
			owner_lazy = () -> TradeTransactionCondition3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition3Code";
				definition = "Specifies the conditions under which the order/trade is to be/was executed.";
				code_lazy = () -> Arrays.asList(TradeTransactionCondition3Code.mmCumBonus, TradeTransactionCondition3Code.mmExBonus, TradeTransactionCondition3Code.mmCumCoupon, TradeTransactionCondition3Code.mmExCoupon,
						TradeTransactionCondition3Code.mmCumDividend, TradeTransactionCondition3Code.mmExDividend, TradeTransactionCondition3Code.mmCumRights, TradeTransactionCondition3Code.mmExRights,
						TradeTransactionCondition3Code.mmCumWarrant, TradeTransactionCondition3Code.mmExWarrant, TradeTransactionCondition3Code.mmSpecialCumDividend, TradeTransactionCondition3Code.mmSpecialExDividend,
						TradeTransactionCondition3Code.mmBrokerDueBill, TradeTransactionCondition3Code.mmSoldShort, TradeTransactionCondition3Code.mmDirty, TradeTransactionCondition3Code.mmClean, TradeTransactionCondition3Code.mmBlock,
						TradeTransactionCondition3Code.mmGuaranteedDelivery, TradeTransactionCondition3Code.mmFractions, TradeTransactionCondition3Code.mmCrossTrade, TradeTransactionCondition3Code.mmNoCrossTrade,
						TradeTransactionCondition3Code.mmDirectOrder, TradeTransactionCondition3Code.mmDirectedOrder, TradeTransactionCondition3Code.mmWarehouseTrade, TradeTransactionCondition3Code.mmNotIncrease,
						TradeTransactionCondition3Code.mmNotReduce, TradeTransactionCondition3Code.mmForwardPriceTrade, TradeTransactionCondition3Code.mmHistoricPriceTrade, TradeTransactionCondition3Code.mmResultOption,
						TradeTransactionCondition3Code.mmResultRepo, TradeTransactionCondition3Code.mmDeliverCountryIncorporation, TradeTransactionCondition3Code.mmDeliveryForm, TradeTransactionCondition3Code.mmBoardLot,
						TradeTransactionCondition3Code.mmBadName, TradeTransactionCondition3Code.mmMarketPrice, TradeTransactionCondition3Code.mmNegotiatedTrade, TradeTransactionCondition3Code.mmNonMarketPrice);
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}