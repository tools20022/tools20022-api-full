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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.TradeTransactionCondition1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CumBonus
 * TradeTransactionCondition1Code.CumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ExBonus
 * TradeTransactionCondition1Code.ExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CumCoupon
 * TradeTransactionCondition1Code.CumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ExCoupon
 * TradeTransactionCondition1Code.ExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CumDividend
 * TradeTransactionCondition1Code.CumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ExDividend
 * TradeTransactionCondition1Code.ExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CumRights
 * TradeTransactionCondition1Code.CumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ExRights
 * TradeTransactionCondition1Code.ExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CumWarrant
 * TradeTransactionCondition1Code.CumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ExWarrant
 * TradeTransactionCondition1Code.ExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialCumDividend
 * TradeTransactionCondition1Code.SpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialExDividend
 * TradeTransactionCondition1Code.SpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#BrokerDueBill
 * TradeTransactionCondition1Code.BrokerDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SoldShort
 * TradeTransactionCondition1Code.SoldShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Dirty
 * TradeTransactionCondition1Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Clean
 * TradeTransactionCondition1Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Block
 * TradeTransactionCondition1Code.Block}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#GuaranteedDelivery
 * TradeTransactionCondition1Code.GuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Fractions
 * TradeTransactionCondition1Code.Fractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CrossTrade
 * TradeTransactionCondition1Code.CrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#NoCrossTrade
 * TradeTransactionCondition1Code.NoCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#DirectOrder
 * TradeTransactionCondition1Code.DirectOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#DirectedOrder
 * TradeTransactionCondition1Code.DirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#WarehouseTrade
 * TradeTransactionCondition1Code.WarehouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#NotIncrease
 * TradeTransactionCondition1Code.NotIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#NotReduce
 * TradeTransactionCondition1Code.NotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ForwardPriceTrade
 * TradeTransactionCondition1Code.ForwardPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#HistoricPriceTrade
 * TradeTransactionCondition1Code.HistoricPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ResultOption
 * TradeTransactionCondition1Code.ResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ResultRepo
 * TradeTransactionCondition1Code.ResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#DeliverCountryIncorporation
 * TradeTransactionCondition1Code.DeliverCountryIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#DeliveryForm
 * TradeTransactionCondition1Code.DeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#BoardLot
 * TradeTransactionCondition1Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#BadName
 * TradeTransactionCondition1Code.BadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#BestExecution
 * TradeTransactionCondition1Code.BestExecution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Call
 * TradeTransactionCondition1Code.Call}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#ClosureBeforeRollOver
 * TradeTransactionCondition1Code.ClosureBeforeRollOver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Monthly
 * TradeTransactionCondition1Code.Monthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#NewTradeFollowingRollover
 * TradeTransactionCondition1Code.NewTradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#TradeFollowingRollover
 * TradeTransactionCondition1Code.TradeFollowingRollover}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#Putt
 * TradeTransactionCondition1Code.Putt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialCumCoupon
 * TradeTransactionCondition1Code.SpecialCumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialExCoupon
 * TradeTransactionCondition1Code.SpecialExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialExBonus
 * TradeTransactionCondition1Code.SpecialExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialCumBonus
 * TradeTransactionCondition1Code.SpecialCumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialCumRights
 * TradeTransactionCondition1Code.SpecialCumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialExRights
 * TradeTransactionCondition1Code.SpecialExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialCumCapitalRepayments
 * TradeTransactionCondition1Code.SpecialCumCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialExCapitalRepayments
 * TradeTransactionCondition1Code.SpecialExCapitalRepayments}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#CashSettlement
 * TradeTransactionCondition1Code.CashSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code#SpecialPrice
 * TradeTransactionCondition1Code.SpecialPrice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionConditionCode
 * TradeTransactionConditionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeTransactionCondition1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the conditions under which the order/trade is to be/was executed."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22a::TTCO</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTransactionCondition1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition1Code
	 * TradeTransactionCondition1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CumBonus = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CumBonus.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ExBonus = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ExBonus.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CumCoupon = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CumCoupon.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ExCoupon = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ExCoupon.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CumDividend = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CumDividend.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ExDividend = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ExDividend.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CumRights = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CumRights.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ExRights = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ExRights.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CumWarrant = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumWarrant";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CumWarrant.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ExWarrant = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExWarrant";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ExWarrant.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialCumDividend = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumDividend.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialExDividend = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExDividend.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BrokerDueBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code BrokerDueBill = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerDueBill";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.BrokerDueBill.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoldShort"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SoldShort = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoldShort";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SoldShort.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dirty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Dirty = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Dirty.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Clean"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Clean = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Clean.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Block"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Block = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Block";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Block.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code GuaranteedDelivery = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.GuaranteedDelivery.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Fractions = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fractions";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Fractions.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CrossTrade = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CrossTrade.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCrossTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code NoCrossTrade = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCrossTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.NoCrossTrade.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code DirectOrder = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.DirectOrder.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DirectedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code DirectedOrder = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectedOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.DirectedOrder.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarehouseTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code WarehouseTrade = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarehouseTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.WarehouseTrade.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIncrease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code NotIncrease = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIncrease";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.NotIncrease.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotReduce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code NotReduce = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReduce";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.NotReduce.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForwardPriceTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ForwardPriceTrade = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardPriceTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ForwardPriceTrade.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HistoricPriceTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code HistoricPriceTrade = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HistoricPriceTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.HistoricPriceTrade.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ResultOption = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultOption";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ResultOption.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultRepo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ResultRepo = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ResultRepo.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverCountryIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code DeliverCountryIncorporation = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverCountryIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.DeliverCountryIncorporation.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code DeliveryForm = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryForm";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.DeliveryForm.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code BoardLot = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.BoardLot.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code BadName = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadName";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.BadName.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code BestExecution = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestExecution";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.BestExecution.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Call"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Call = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Call";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Call.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosureBeforeRollOver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code ClosureBeforeRollOver = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosureBeforeRollOver";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.ClosureBeforeRollOver.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Monthly = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Monthly.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewTradeFollowingRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code NewTradeFollowingRollover = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewTradeFollowingRollover";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.NewTradeFollowingRollover.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeFollowingRollover"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code TradeFollowingRollover = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeFollowingRollover";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.TradeFollowingRollover.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Putt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code Putt = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Putt";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.Putt.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialCumCoupon = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumCoupon.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialExCoupon = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExCoupon.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialExBonus = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExBonus.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumBonus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialCumBonus = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumBonus.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialCumRights = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumRights.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialExRights = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExRights.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumCapitalRepayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialCumCapitalRepayments = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumCapitalRepayments";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumCapitalRepayments.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExCapitalRepayments"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialExCapitalRepayments = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExCapitalRepayments";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExCapitalRepayments.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code CashSettlement = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.CashSettlement.getCodeName().orElse(name);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition1Code SpecialPrice = new TradeTransactionCondition1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition1Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialPrice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeTransactionCondition1Code> codesByName = new LinkedHashMap<>();

	protected TradeTransactionCondition1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TTCO"));
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition1Code";
				definition = "Indicates the conditions under which the order/trade is to be/was executed.";
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionCondition1Code.CumBonus, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ExBonus,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.CumCoupon, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ExCoupon,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.CumDividend, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.CumRights, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ExRights,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.CumWarrant, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ExWarrant,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialCumDividend, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.BrokerDueBill, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SoldShort,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.Dirty, com.tools20022.repository.codeset.TradeTransactionCondition1Code.Clean, com.tools20022.repository.codeset.TradeTransactionCondition1Code.Block,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.GuaranteedDelivery, com.tools20022.repository.codeset.TradeTransactionCondition1Code.Fractions,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.CrossTrade, com.tools20022.repository.codeset.TradeTransactionCondition1Code.NoCrossTrade,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.DirectOrder, com.tools20022.repository.codeset.TradeTransactionCondition1Code.DirectedOrder,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.WarehouseTrade, com.tools20022.repository.codeset.TradeTransactionCondition1Code.NotIncrease,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.NotReduce, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ForwardPriceTrade,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.HistoricPriceTrade, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ResultOption,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.ResultRepo, com.tools20022.repository.codeset.TradeTransactionCondition1Code.DeliverCountryIncorporation,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.DeliveryForm, com.tools20022.repository.codeset.TradeTransactionCondition1Code.BoardLot,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.BadName, com.tools20022.repository.codeset.TradeTransactionCondition1Code.BestExecution,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.Call, com.tools20022.repository.codeset.TradeTransactionCondition1Code.ClosureBeforeRollOver,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.Monthly, com.tools20022.repository.codeset.TradeTransactionCondition1Code.NewTradeFollowingRollover,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.TradeFollowingRollover, com.tools20022.repository.codeset.TradeTransactionCondition1Code.Putt,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialCumCoupon, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialExCoupon,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialExBonus, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialCumBonus,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialCumRights, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialExRights,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialCumCapitalRepayments, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialExCapitalRepayments,
						com.tools20022.repository.codeset.TradeTransactionCondition1Code.CashSettlement, com.tools20022.repository.codeset.TradeTransactionCondition1Code.SpecialPrice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CumBonus.getCodeName().get(), CumBonus);
		codesByName.put(ExBonus.getCodeName().get(), ExBonus);
		codesByName.put(CumCoupon.getCodeName().get(), CumCoupon);
		codesByName.put(ExCoupon.getCodeName().get(), ExCoupon);
		codesByName.put(CumDividend.getCodeName().get(), CumDividend);
		codesByName.put(ExDividend.getCodeName().get(), ExDividend);
		codesByName.put(CumRights.getCodeName().get(), CumRights);
		codesByName.put(ExRights.getCodeName().get(), ExRights);
		codesByName.put(CumWarrant.getCodeName().get(), CumWarrant);
		codesByName.put(ExWarrant.getCodeName().get(), ExWarrant);
		codesByName.put(SpecialCumDividend.getCodeName().get(), SpecialCumDividend);
		codesByName.put(SpecialExDividend.getCodeName().get(), SpecialExDividend);
		codesByName.put(BrokerDueBill.getCodeName().get(), BrokerDueBill);
		codesByName.put(SoldShort.getCodeName().get(), SoldShort);
		codesByName.put(Dirty.getCodeName().get(), Dirty);
		codesByName.put(Clean.getCodeName().get(), Clean);
		codesByName.put(Block.getCodeName().get(), Block);
		codesByName.put(GuaranteedDelivery.getCodeName().get(), GuaranteedDelivery);
		codesByName.put(Fractions.getCodeName().get(), Fractions);
		codesByName.put(CrossTrade.getCodeName().get(), CrossTrade);
		codesByName.put(NoCrossTrade.getCodeName().get(), NoCrossTrade);
		codesByName.put(DirectOrder.getCodeName().get(), DirectOrder);
		codesByName.put(DirectedOrder.getCodeName().get(), DirectedOrder);
		codesByName.put(WarehouseTrade.getCodeName().get(), WarehouseTrade);
		codesByName.put(NotIncrease.getCodeName().get(), NotIncrease);
		codesByName.put(NotReduce.getCodeName().get(), NotReduce);
		codesByName.put(ForwardPriceTrade.getCodeName().get(), ForwardPriceTrade);
		codesByName.put(HistoricPriceTrade.getCodeName().get(), HistoricPriceTrade);
		codesByName.put(ResultOption.getCodeName().get(), ResultOption);
		codesByName.put(ResultRepo.getCodeName().get(), ResultRepo);
		codesByName.put(DeliverCountryIncorporation.getCodeName().get(), DeliverCountryIncorporation);
		codesByName.put(DeliveryForm.getCodeName().get(), DeliveryForm);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(BadName.getCodeName().get(), BadName);
		codesByName.put(BestExecution.getCodeName().get(), BestExecution);
		codesByName.put(Call.getCodeName().get(), Call);
		codesByName.put(ClosureBeforeRollOver.getCodeName().get(), ClosureBeforeRollOver);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(NewTradeFollowingRollover.getCodeName().get(), NewTradeFollowingRollover);
		codesByName.put(TradeFollowingRollover.getCodeName().get(), TradeFollowingRollover);
		codesByName.put(Putt.getCodeName().get(), Putt);
		codesByName.put(SpecialCumCoupon.getCodeName().get(), SpecialCumCoupon);
		codesByName.put(SpecialExCoupon.getCodeName().get(), SpecialExCoupon);
		codesByName.put(SpecialExBonus.getCodeName().get(), SpecialExBonus);
		codesByName.put(SpecialCumBonus.getCodeName().get(), SpecialCumBonus);
		codesByName.put(SpecialCumRights.getCodeName().get(), SpecialCumRights);
		codesByName.put(SpecialExRights.getCodeName().get(), SpecialExRights);
		codesByName.put(SpecialCumCapitalRepayments.getCodeName().get(), SpecialCumCapitalRepayments);
		codesByName.put(SpecialExCapitalRepayments.getCodeName().get(), SpecialExCapitalRepayments);
		codesByName.put(CashSettlement.getCodeName().get(), CashSettlement);
		codesByName.put(SpecialPrice.getCodeName().get(), SpecialPrice);
	}

	public static TradeTransactionCondition1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTransactionCondition1Code[] values() {
		TradeTransactionCondition1Code[] values = new TradeTransactionCondition1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTransactionCondition1Code> {
		@Override
		public TradeTransactionCondition1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTransactionCondition1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}