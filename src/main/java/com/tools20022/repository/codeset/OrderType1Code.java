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
import com.tools20022.repository.codeset.OrderType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of instruction to a broker or dealer to buy or sell a
 * financial instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#AllOrNone
 * OrderType1Code.AllOrNone}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#BuyContraShortExempt
 * OrderType1Code.BuyContraShortExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#BuyContraShort
 * OrderType1Code.BuyContraShort}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#BuyMinus
 * OrderType1Code.BuyMinus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Carefully
 * OrderType1Code.Carefully}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Combination
 * OrderType1Code.Combination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#Discretionary
 * OrderType1Code.Discretionary}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Limit
 * OrderType1Code.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#LimitWith
 * OrderType1Code.LimitWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#LimitWithout
 * OrderType1Code.LimitWithout}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Market
 * OrderType1Code.Market}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#MarketNotHeld
 * OrderType1Code.MarketNotHeld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#MarketTouched
 * OrderType1Code.MarketTouched}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#NotHeld
 * OrderType1Code.NotHeld}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#OrderLie
 * OrderType1Code.OrderLie}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#OnBasisPrice
 * OrderType1Code.OnBasisPrice}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Stop
 * OrderType1Code.Stop}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#StopLimit
 * OrderType1Code.StopLimit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#StopLoss
 * OrderType1Code.StopLoss}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#SellPlus
 * OrderType1Code.SellPlus}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#SellShort
 * OrderType1Code.SellShort}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#SellShortExempt
 * OrderType1Code.SellShortExempt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#WithOrWithout
 * OrderType1Code.WithOrWithout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#PreviouslyQuoted
 * OrderType1Code.PreviouslyQuoted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#PreviouslyIndicated
 * OrderType1Code.PreviouslyIndicated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#ForexSwap
 * OrderType1Code.ForexSwap}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Funari
 * OrderType1Code.Funari}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#MarketWithLeftover
 * OrderType1Code.MarketWithLeftover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType1Code#Pegged
 * OrderType1Code.Pegged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType1Code#CounterOrderSelection
 * OrderType1Code.CounterOrderSelection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OrderTypeCode OrderTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
 * semanticMarkup} = ISO15022Synonym: :22a::TOOR</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ALNO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllOrNone"</li>
	 * </ul>
	 */
	public static final OrderType1Code AllOrNone = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllOrNone";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.AllOrNone.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyContraShortExempt"</li>
	 * </ul>
	 */
	public static final OrderType1Code BuyContraShortExempt = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyContraShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.BuyContraShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyContraShort"</li>
	 * </ul>
	 */
	public static final OrderType1Code BuyContraShort = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyContraShort";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.BuyContraShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyMinus"</li>
	 * </ul>
	 */
	public static final OrderType1Code BuyMinus = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyMinus";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.BuyMinus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Carefully"</li>
	 * </ul>
	 */
	public static final OrderType1Code Carefully = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Carefully";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Carefully.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Combination"</li>
	 * </ul>
	 */
	public static final OrderType1Code Combination = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Combination";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Combination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Discretionary"</li>
	 * </ul>
	 */
	public static final OrderType1Code Discretionary = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Discretionary";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Discretionary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * </ul>
	 */
	public static final OrderType1Code Limit = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Limit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWith"</li>
	 * </ul>
	 */
	public static final OrderType1Code LimitWith = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWith";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.LimitWith.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWithout"</li>
	 * </ul>
	 */
	public static final OrderType1Code LimitWithout = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWithout";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.LimitWithout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * </ul>
	 */
	public static final OrderType1Code Market = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Market.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketNotHeld"</li>
	 * </ul>
	 */
	public static final OrderType1Code MarketNotHeld = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketNotHeld";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.MarketNotHeld.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTouched"</li>
	 * </ul>
	 */
	public static final OrderType1Code MarketTouched = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTouched";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.MarketTouched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotHeld"</li>
	 * </ul>
	 */
	public static final OrderType1Code NotHeld = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotHeld";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.NotHeld.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderLie"</li>
	 * </ul>
	 */
	public static final OrderType1Code OrderLie = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderLie";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.OrderLie.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnBasisPrice"</li>
	 * </ul>
	 */
	public static final OrderType1Code OnBasisPrice = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnBasisPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.OnBasisPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stop"</li>
	 * </ul>
	 */
	public static final OrderType1Code Stop = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stop";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Stop.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopLimit"</li>
	 * </ul>
	 */
	public static final OrderType1Code StopLimit = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.StopLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopLoss"</li>
	 * </ul>
	 */
	public static final OrderType1Code StopLoss = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLoss";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.StopLoss.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellPlus"</li>
	 * </ul>
	 */
	public static final OrderType1Code SellPlus = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellPlus";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.SellPlus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShort"</li>
	 * </ul>
	 */
	public static final OrderType1Code SellShort = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShort";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.SellShort.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellShortExempt"</li>
	 * </ul>
	 */
	public static final OrderType1Code SellShortExempt = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellShortExempt";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.SellShortExempt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithOrWithout"</li>
	 * </ul>
	 */
	public static final OrderType1Code WithOrWithout = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithOrWithout";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.WithOrWithout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyQuoted"</li>
	 * </ul>
	 */
	public static final OrderType1Code PreviouslyQuoted = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyQuoted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.PreviouslyQuoted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyIndicated"</li>
	 * </ul>
	 */
	public static final OrderType1Code PreviouslyIndicated = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyIndicated";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.PreviouslyIndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForexSwap"</li>
	 * </ul>
	 */
	public static final OrderType1Code ForexSwap = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForexSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.ForexSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Funari"</li>
	 * </ul>
	 */
	public static final OrderType1Code Funari = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Funari";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Funari.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketWithLeftover"</li>
	 * </ul>
	 */
	public static final OrderType1Code MarketWithLeftover = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketWithLeftover";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.MarketWithLeftover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pegged"</li>
	 * </ul>
	 */
	public static final OrderType1Code Pegged = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.Pegged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType1Code
	 * OrderType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterOrderSelection"</li>
	 * </ul>
	 */
	public static final OrderType1Code CounterOrderSelection = new OrderType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterOrderSelection";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType1Code.mmObject();
			codeName = OrderTypeCode.CounterOrderSelection.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderType1Code> codesByName = new LinkedHashMap<>();

	protected OrderType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22a::TOOR"));
				example = Arrays.asList("ALNO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderType1Code";
				definition = "Indicates the type of  instruction to a broker or dealer to buy or sell a financial instrument.";
				trace_lazy = () -> OrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderType1Code.AllOrNone, com.tools20022.repository.codeset.OrderType1Code.BuyContraShortExempt,
						com.tools20022.repository.codeset.OrderType1Code.BuyContraShort, com.tools20022.repository.codeset.OrderType1Code.BuyMinus, com.tools20022.repository.codeset.OrderType1Code.Carefully,
						com.tools20022.repository.codeset.OrderType1Code.Combination, com.tools20022.repository.codeset.OrderType1Code.Discretionary, com.tools20022.repository.codeset.OrderType1Code.Limit,
						com.tools20022.repository.codeset.OrderType1Code.LimitWith, com.tools20022.repository.codeset.OrderType1Code.LimitWithout, com.tools20022.repository.codeset.OrderType1Code.Market,
						com.tools20022.repository.codeset.OrderType1Code.MarketNotHeld, com.tools20022.repository.codeset.OrderType1Code.MarketTouched, com.tools20022.repository.codeset.OrderType1Code.NotHeld,
						com.tools20022.repository.codeset.OrderType1Code.OrderLie, com.tools20022.repository.codeset.OrderType1Code.OnBasisPrice, com.tools20022.repository.codeset.OrderType1Code.Stop,
						com.tools20022.repository.codeset.OrderType1Code.StopLimit, com.tools20022.repository.codeset.OrderType1Code.StopLoss, com.tools20022.repository.codeset.OrderType1Code.SellPlus,
						com.tools20022.repository.codeset.OrderType1Code.SellShort, com.tools20022.repository.codeset.OrderType1Code.SellShortExempt, com.tools20022.repository.codeset.OrderType1Code.WithOrWithout,
						com.tools20022.repository.codeset.OrderType1Code.PreviouslyQuoted, com.tools20022.repository.codeset.OrderType1Code.PreviouslyIndicated, com.tools20022.repository.codeset.OrderType1Code.ForexSwap,
						com.tools20022.repository.codeset.OrderType1Code.Funari, com.tools20022.repository.codeset.OrderType1Code.MarketWithLeftover, com.tools20022.repository.codeset.OrderType1Code.Pegged,
						com.tools20022.repository.codeset.OrderType1Code.CounterOrderSelection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AllOrNone.getCodeName().get(), AllOrNone);
		codesByName.put(BuyContraShortExempt.getCodeName().get(), BuyContraShortExempt);
		codesByName.put(BuyContraShort.getCodeName().get(), BuyContraShort);
		codesByName.put(BuyMinus.getCodeName().get(), BuyMinus);
		codesByName.put(Carefully.getCodeName().get(), Carefully);
		codesByName.put(Combination.getCodeName().get(), Combination);
		codesByName.put(Discretionary.getCodeName().get(), Discretionary);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(LimitWith.getCodeName().get(), LimitWith);
		codesByName.put(LimitWithout.getCodeName().get(), LimitWithout);
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(MarketNotHeld.getCodeName().get(), MarketNotHeld);
		codesByName.put(MarketTouched.getCodeName().get(), MarketTouched);
		codesByName.put(NotHeld.getCodeName().get(), NotHeld);
		codesByName.put(OrderLie.getCodeName().get(), OrderLie);
		codesByName.put(OnBasisPrice.getCodeName().get(), OnBasisPrice);
		codesByName.put(Stop.getCodeName().get(), Stop);
		codesByName.put(StopLimit.getCodeName().get(), StopLimit);
		codesByName.put(StopLoss.getCodeName().get(), StopLoss);
		codesByName.put(SellPlus.getCodeName().get(), SellPlus);
		codesByName.put(SellShort.getCodeName().get(), SellShort);
		codesByName.put(SellShortExempt.getCodeName().get(), SellShortExempt);
		codesByName.put(WithOrWithout.getCodeName().get(), WithOrWithout);
		codesByName.put(PreviouslyQuoted.getCodeName().get(), PreviouslyQuoted);
		codesByName.put(PreviouslyIndicated.getCodeName().get(), PreviouslyIndicated);
		codesByName.put(ForexSwap.getCodeName().get(), ForexSwap);
		codesByName.put(Funari.getCodeName().get(), Funari);
		codesByName.put(MarketWithLeftover.getCodeName().get(), MarketWithLeftover);
		codesByName.put(Pegged.getCodeName().get(), Pegged);
		codesByName.put(CounterOrderSelection.getCodeName().get(), CounterOrderSelection);
	}

	public static OrderType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderType1Code[] values() {
		OrderType1Code[] values = new OrderType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderType1Code> {
		@Override
		public OrderType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}