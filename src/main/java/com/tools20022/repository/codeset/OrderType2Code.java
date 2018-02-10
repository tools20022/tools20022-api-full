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

import com.tools20022.metamodel.ext.FIXSynonym;
import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.OrderType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies a type of order based on the Financial Information Exchange
 * Protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#Market
 * OrderType2Code.Market}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#Limit
 * OrderType2Code.Limit}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#Stop
 * OrderType2Code.Stop}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#LimitWith
 * OrderType2Code.LimitWith}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#LimitWithout
 * OrderType2Code.LimitWithout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#OnBasisPrice
 * OrderType2Code.OnBasisPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#MarketTouched
 * OrderType2Code.MarketTouched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#WithOrWithout
 * OrderType2Code.WithOrWithout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#PreviouslyQuoted
 * OrderType2Code.PreviouslyQuoted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#PreviouslyIndicated
 * OrderType2Code.PreviouslyIndicated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#ForexSwap
 * OrderType2Code.ForexSwap}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#Funari
 * OrderType2Code.Funari}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#MarketWithLeftover
 * OrderType2Code.MarketWithLeftover}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#Pegged
 * OrderType2Code.Pegged}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#StopLoss
 * OrderType2Code.StopLoss}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OrderType2Code#StopLimit
 * OrderType2Code.StopLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OrderType2Code#CounterOrderSelection
 * OrderType2Code.CounterOrderSelection}</li>
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
 * semanticMarkup} = FIXSynonym: field tag 40</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MRKT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OrderType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a type of order based on the Financial Information Exchange Protocol."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OrderType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Market"</li>
	 * </ul>
	 */
	public static final OrderType2Code Market = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Market";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.Market.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Limit"</li>
	 * </ul>
	 */
	public static final OrderType2Code Limit = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Limit";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.Limit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Stop"</li>
	 * </ul>
	 */
	public static final OrderType2Code Stop = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Stop";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.Stop.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWith"</li>
	 * </ul>
	 */
	public static final OrderType2Code LimitWith = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWith";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.LimitWith.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitWithout"</li>
	 * </ul>
	 */
	public static final OrderType2Code LimitWithout = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitWithout";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.LimitWithout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnBasisPrice"</li>
	 * </ul>
	 */
	public static final OrderType2Code OnBasisPrice = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnBasisPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.OnBasisPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketTouched"</li>
	 * </ul>
	 */
	public static final OrderType2Code MarketTouched = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketTouched";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.MarketTouched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithOrWithout"</li>
	 * </ul>
	 */
	public static final OrderType2Code WithOrWithout = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithOrWithout";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.WithOrWithout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyQuoted"</li>
	 * </ul>
	 */
	public static final OrderType2Code PreviouslyQuoted = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyQuoted";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.PreviouslyQuoted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyIndicated"</li>
	 * </ul>
	 */
	public static final OrderType2Code PreviouslyIndicated = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyIndicated";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.PreviouslyIndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForexSwap"</li>
	 * </ul>
	 */
	public static final OrderType2Code ForexSwap = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForexSwap";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.ForexSwap.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Funari"</li>
	 * </ul>
	 */
	public static final OrderType2Code Funari = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Funari";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.Funari.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketWithLeftover"</li>
	 * </ul>
	 */
	public static final OrderType2Code MarketWithLeftover = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketWithLeftover";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.MarketWithLeftover.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pegged"</li>
	 * </ul>
	 */
	public static final OrderType2Code Pegged = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pegged";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.Pegged.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopLoss"</li>
	 * </ul>
	 */
	public static final OrderType2Code StopLoss = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLoss";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.StopLoss.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopLimit"</li>
	 * </ul>
	 */
	public static final OrderType2Code StopLimit = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.StopLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OrderType2Code
	 * OrderType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterOrderSelection"</li>
	 * </ul>
	 */
	public static final OrderType2Code CounterOrderSelection = new OrderType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterOrderSelection";
			owner_lazy = () -> com.tools20022.repository.codeset.OrderType2Code.mmObject();
			codeName = OrderTypeCode.CounterOrderSelection.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OrderType2Code> codesByName = new LinkedHashMap<>();

	protected OrderType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				semanticMarkup_lazy = () -> Arrays.asList(new FIXSynonym(this, "field tag 40"));
				example = Arrays.asList("MRKT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OrderType2Code";
				definition = "Specifies a type of order based on the Financial Information Exchange Protocol.";
				trace_lazy = () -> OrderTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OrderType2Code.Market, com.tools20022.repository.codeset.OrderType2Code.Limit, com.tools20022.repository.codeset.OrderType2Code.Stop,
						com.tools20022.repository.codeset.OrderType2Code.LimitWith, com.tools20022.repository.codeset.OrderType2Code.LimitWithout, com.tools20022.repository.codeset.OrderType2Code.OnBasisPrice,
						com.tools20022.repository.codeset.OrderType2Code.MarketTouched, com.tools20022.repository.codeset.OrderType2Code.WithOrWithout, com.tools20022.repository.codeset.OrderType2Code.PreviouslyQuoted,
						com.tools20022.repository.codeset.OrderType2Code.PreviouslyIndicated, com.tools20022.repository.codeset.OrderType2Code.ForexSwap, com.tools20022.repository.codeset.OrderType2Code.Funari,
						com.tools20022.repository.codeset.OrderType2Code.MarketWithLeftover, com.tools20022.repository.codeset.OrderType2Code.Pegged, com.tools20022.repository.codeset.OrderType2Code.StopLoss,
						com.tools20022.repository.codeset.OrderType2Code.StopLimit, com.tools20022.repository.codeset.OrderType2Code.CounterOrderSelection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Market.getCodeName().get(), Market);
		codesByName.put(Limit.getCodeName().get(), Limit);
		codesByName.put(Stop.getCodeName().get(), Stop);
		codesByName.put(LimitWith.getCodeName().get(), LimitWith);
		codesByName.put(LimitWithout.getCodeName().get(), LimitWithout);
		codesByName.put(OnBasisPrice.getCodeName().get(), OnBasisPrice);
		codesByName.put(MarketTouched.getCodeName().get(), MarketTouched);
		codesByName.put(WithOrWithout.getCodeName().get(), WithOrWithout);
		codesByName.put(PreviouslyQuoted.getCodeName().get(), PreviouslyQuoted);
		codesByName.put(PreviouslyIndicated.getCodeName().get(), PreviouslyIndicated);
		codesByName.put(ForexSwap.getCodeName().get(), ForexSwap);
		codesByName.put(Funari.getCodeName().get(), Funari);
		codesByName.put(MarketWithLeftover.getCodeName().get(), MarketWithLeftover);
		codesByName.put(Pegged.getCodeName().get(), Pegged);
		codesByName.put(StopLoss.getCodeName().get(), StopLoss);
		codesByName.put(StopLimit.getCodeName().get(), StopLimit);
		codesByName.put(CounterOrderSelection.getCodeName().get(), CounterOrderSelection);
	}

	public static OrderType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OrderType2Code[] values() {
		OrderType2Code[] values = new OrderType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OrderType2Code> {
		@Override
		public OrderType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OrderType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}