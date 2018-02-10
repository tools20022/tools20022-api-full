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
import com.tools20022.repository.codeset.TradeTransactionCondition3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions under which the order/trade is to be/was executed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#CumBonus
 * TradeTransactionCondition3Code.CumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ExBonus
 * TradeTransactionCondition3Code.ExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#CumCoupon
 * TradeTransactionCondition3Code.CumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ExCoupon
 * TradeTransactionCondition3Code.ExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#CumDividend
 * TradeTransactionCondition3Code.CumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ExDividend
 * TradeTransactionCondition3Code.ExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#CumRights
 * TradeTransactionCondition3Code.CumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ExRights
 * TradeTransactionCondition3Code.ExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#CumWarrant
 * TradeTransactionCondition3Code.CumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ExWarrant
 * TradeTransactionCondition3Code.ExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#SpecialCumDividend
 * TradeTransactionCondition3Code.SpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#SpecialExDividend
 * TradeTransactionCondition3Code.SpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#BrokerDueBill
 * TradeTransactionCondition3Code.BrokerDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#SoldShort
 * TradeTransactionCondition3Code.SoldShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#Dirty
 * TradeTransactionCondition3Code.Dirty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#Clean
 * TradeTransactionCondition3Code.Clean}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#Block
 * TradeTransactionCondition3Code.Block}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#GuaranteedDelivery
 * TradeTransactionCondition3Code.GuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#Fractions
 * TradeTransactionCondition3Code.Fractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#CrossTrade
 * TradeTransactionCondition3Code.CrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#NoCrossTrade
 * TradeTransactionCondition3Code.NoCrossTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#DirectOrder
 * TradeTransactionCondition3Code.DirectOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#DirectedOrder
 * TradeTransactionCondition3Code.DirectedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#WarehouseTrade
 * TradeTransactionCondition3Code.WarehouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#NotIncrease
 * TradeTransactionCondition3Code.NotIncrease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#NotReduce
 * TradeTransactionCondition3Code.NotReduce}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ForwardPriceTrade
 * TradeTransactionCondition3Code.ForwardPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#HistoricPriceTrade
 * TradeTransactionCondition3Code.HistoricPriceTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ResultOption
 * TradeTransactionCondition3Code.ResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#ResultRepo
 * TradeTransactionCondition3Code.ResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#DeliverCountryIncorporation
 * TradeTransactionCondition3Code.DeliverCountryIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#DeliveryForm
 * TradeTransactionCondition3Code.DeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#BoardLot
 * TradeTransactionCondition3Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#BadName
 * TradeTransactionCondition3Code.BadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#MarketPrice
 * TradeTransactionCondition3Code.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#NegotiatedTrade
 * TradeTransactionCondition3Code.NegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition3Code#NonMarketPrice
 * TradeTransactionCondition3Code.NonMarketPrice}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTransactionCondition3Code extends MMCode {

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
	public static final TradeTransactionCondition3Code CumBonus = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.CumBonus.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ExBonus = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ExBonus.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code CumCoupon = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.CumCoupon.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ExCoupon = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ExCoupon.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code CumDividend = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.CumDividend.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ExDividend = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ExDividend.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code CumRights = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.CumRights.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ExRights = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ExRights.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code CumWarrant = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumWarrant";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.CumWarrant.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ExWarrant = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExWarrant";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ExWarrant.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code SpecialCumDividend = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumDividend.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code SpecialExDividend = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExDividend.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code BrokerDueBill = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BrokerDueBill";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.BrokerDueBill.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code SoldShort = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoldShort";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.SoldShort.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code Dirty = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dirty";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.Dirty.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code Clean = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Clean";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.Clean.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code Block = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Block";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.Block.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code GuaranteedDelivery = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.GuaranteedDelivery.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code Fractions = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fractions";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.Fractions.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code CrossTrade = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CrossTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.CrossTrade.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code NoCrossTrade = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCrossTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.NoCrossTrade.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code DirectOrder = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.DirectOrder.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code DirectedOrder = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DirectedOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.DirectedOrder.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code WarehouseTrade = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarehouseTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.WarehouseTrade.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code NotIncrease = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIncrease";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.NotIncrease.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code NotReduce = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotReduce";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.NotReduce.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ForwardPriceTrade = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForwardPriceTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ForwardPriceTrade.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code HistoricPriceTrade = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HistoricPriceTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.HistoricPriceTrade.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ResultOption = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultOption";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ResultOption.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code ResultRepo = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.ResultRepo.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code DeliverCountryIncorporation = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverCountryIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.DeliverCountryIncorporation.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code DeliveryForm = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryForm";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.DeliveryForm.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code BoardLot = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.BoardLot.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code BadName = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadName";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.BadName.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code MarketPrice = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.MarketPrice.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code NegotiatedTrade = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.NegotiatedTrade.getCodeName().orElse(name);
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
	public static final TradeTransactionCondition3Code NonMarketPrice = new TradeTransactionCondition3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMarketPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition3Code.mmObject();
			codeName = TradeTransactionConditionCode.NonMarketPrice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeTransactionCondition3Code> codesByName = new LinkedHashMap<>();

	protected TradeTransactionCondition3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition3Code";
				definition = "Specifies the conditions under which the order/trade is to be/was executed.";
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionCondition3Code.CumBonus, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ExBonus,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.CumCoupon, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ExCoupon,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.CumDividend, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.CumRights, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ExRights,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.CumWarrant, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ExWarrant,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.SpecialCumDividend, com.tools20022.repository.codeset.TradeTransactionCondition3Code.SpecialExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.BrokerDueBill, com.tools20022.repository.codeset.TradeTransactionCondition3Code.SoldShort,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.Dirty, com.tools20022.repository.codeset.TradeTransactionCondition3Code.Clean, com.tools20022.repository.codeset.TradeTransactionCondition3Code.Block,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.GuaranteedDelivery, com.tools20022.repository.codeset.TradeTransactionCondition3Code.Fractions,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.CrossTrade, com.tools20022.repository.codeset.TradeTransactionCondition3Code.NoCrossTrade,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.DirectOrder, com.tools20022.repository.codeset.TradeTransactionCondition3Code.DirectedOrder,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.WarehouseTrade, com.tools20022.repository.codeset.TradeTransactionCondition3Code.NotIncrease,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.NotReduce, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ForwardPriceTrade,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.HistoricPriceTrade, com.tools20022.repository.codeset.TradeTransactionCondition3Code.ResultOption,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.ResultRepo, com.tools20022.repository.codeset.TradeTransactionCondition3Code.DeliverCountryIncorporation,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.DeliveryForm, com.tools20022.repository.codeset.TradeTransactionCondition3Code.BoardLot,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.BadName, com.tools20022.repository.codeset.TradeTransactionCondition3Code.MarketPrice,
						com.tools20022.repository.codeset.TradeTransactionCondition3Code.NegotiatedTrade, com.tools20022.repository.codeset.TradeTransactionCondition3Code.NonMarketPrice);
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
		codesByName.put(MarketPrice.getCodeName().get(), MarketPrice);
		codesByName.put(NegotiatedTrade.getCodeName().get(), NegotiatedTrade);
		codesByName.put(NonMarketPrice.getCodeName().get(), NonMarketPrice);
	}

	public static TradeTransactionCondition3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTransactionCondition3Code[] values() {
		TradeTransactionCondition3Code[] values = new TradeTransactionCondition3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTransactionCondition3Code> {
		@Override
		public TradeTransactionCondition3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTransactionCondition3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}