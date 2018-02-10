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
import com.tools20022.repository.codeset.TradeTransactionCondition4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#CumBonus
 * TradeTransactionCondition4Code.CumBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ExBonus
 * TradeTransactionCondition4Code.ExBonus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#CumCoupon
 * TradeTransactionCondition4Code.CumCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ExCoupon
 * TradeTransactionCondition4Code.ExCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#CumDividend
 * TradeTransactionCondition4Code.CumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ExDividend
 * TradeTransactionCondition4Code.ExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#CumRights
 * TradeTransactionCondition4Code.CumRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ExRights
 * TradeTransactionCondition4Code.ExRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#CumWarrant
 * TradeTransactionCondition4Code.CumWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ExWarrant
 * TradeTransactionCondition4Code.ExWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#SpecialCumDividend
 * TradeTransactionCondition4Code.SpecialCumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#SpecialExDividend
 * TradeTransactionCondition4Code.SpecialExDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#GuaranteedDelivery
 * TradeTransactionCondition4Code.GuaranteedDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ResultOption
 * TradeTransactionCondition4Code.ResultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#ResultRepo
 * TradeTransactionCondition4Code.ResultRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#DeliveryForm
 * TradeTransactionCondition4Code.DeliveryForm}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#BoardLot
 * TradeTransactionCondition4Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#BadName
 * TradeTransactionCondition4Code.BadName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#MarketPrice
 * TradeTransactionCondition4Code.MarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#NegotiatedTrade
 * TradeTransactionCondition4Code.NegotiatedTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#NonMarketPrice
 * TradeTransactionCondition4Code.NonMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code#DeliverCountryIncorporation
 * TradeTransactionCondition4Code.DeliverCountryIncorporation}</li>
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
 * "TradeTransactionCondition4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions under which the order/trade is to be/was executed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeTransactionCondition4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumBonus"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code CumBonus = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.CumBonus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExBonus"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ExBonus = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExBonus";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ExBonus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumCoupon"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code CumCoupon = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.CumCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExCoupon"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ExCoupon = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ExCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividend"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code CumDividend = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.CumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExDividend"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ExDividend = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ExDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumRights"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code CumRights = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.CumRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExRights"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ExRights = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExRights";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ExRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumWarrant"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code CumWarrant = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumWarrant";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.CumWarrant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExWarrant"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ExWarrant = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExWarrant";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ExWarrant.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialCumDividend"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code SpecialCumDividend = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialCumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialCumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialExDividend"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code SpecialExDividend = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialExDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.SpecialExDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDelivery"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code GuaranteedDelivery = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.GuaranteedDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultOption"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ResultOption = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultOption";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ResultOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResultRepo"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code ResultRepo = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResultRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.ResultRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryForm"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code DeliveryForm = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryForm";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.DeliveryForm.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code BoardLot = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.BoardLot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BadName"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code BadName = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BadName";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.BadName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPrice"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code MarketPrice = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.MarketPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NegotiatedTrade"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code NegotiatedTrade = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NegotiatedTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.NegotiatedTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonMarketPrice"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code NonMarketPrice = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonMarketPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.NonMarketPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeTransactionCondition4Code
	 * TradeTransactionCondition4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverCountryIncorporation"</li>
	 * </ul>
	 */
	public static final TradeTransactionCondition4Code DeliverCountryIncorporation = new TradeTransactionCondition4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverCountryIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeTransactionCondition4Code.mmObject();
			codeName = TradeTransactionConditionCode.DeliverCountryIncorporation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeTransactionCondition4Code> codesByName = new LinkedHashMap<>();

	protected TradeTransactionCondition4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CBNS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradeTransactionCondition4Code";
				definition = "Specifies the conditions under which the order/trade is to be/was executed.";
				trace_lazy = () -> TradeTransactionConditionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeTransactionCondition4Code.CumBonus, com.tools20022.repository.codeset.TradeTransactionCondition4Code.ExBonus,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.CumCoupon, com.tools20022.repository.codeset.TradeTransactionCondition4Code.ExCoupon,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.CumDividend, com.tools20022.repository.codeset.TradeTransactionCondition4Code.ExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.CumRights, com.tools20022.repository.codeset.TradeTransactionCondition4Code.ExRights,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.CumWarrant, com.tools20022.repository.codeset.TradeTransactionCondition4Code.ExWarrant,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.SpecialCumDividend, com.tools20022.repository.codeset.TradeTransactionCondition4Code.SpecialExDividend,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.GuaranteedDelivery, com.tools20022.repository.codeset.TradeTransactionCondition4Code.ResultOption,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.ResultRepo, com.tools20022.repository.codeset.TradeTransactionCondition4Code.DeliveryForm,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.BoardLot, com.tools20022.repository.codeset.TradeTransactionCondition4Code.BadName,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.MarketPrice, com.tools20022.repository.codeset.TradeTransactionCondition4Code.NegotiatedTrade,
						com.tools20022.repository.codeset.TradeTransactionCondition4Code.NonMarketPrice, com.tools20022.repository.codeset.TradeTransactionCondition4Code.DeliverCountryIncorporation);
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
		codesByName.put(GuaranteedDelivery.getCodeName().get(), GuaranteedDelivery);
		codesByName.put(ResultOption.getCodeName().get(), ResultOption);
		codesByName.put(ResultRepo.getCodeName().get(), ResultRepo);
		codesByName.put(DeliveryForm.getCodeName().get(), DeliveryForm);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(BadName.getCodeName().get(), BadName);
		codesByName.put(MarketPrice.getCodeName().get(), MarketPrice);
		codesByName.put(NegotiatedTrade.getCodeName().get(), NegotiatedTrade);
		codesByName.put(NonMarketPrice.getCodeName().get(), NonMarketPrice);
		codesByName.put(DeliverCountryIncorporation.getCodeName().get(), DeliverCountryIncorporation);
	}

	public static TradeTransactionCondition4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeTransactionCondition4Code[] values() {
		TradeTransactionCondition4Code[] values = new TradeTransactionCondition4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeTransactionCondition4Code> {
		@Override
		public TradeTransactionCondition4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeTransactionCondition4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}