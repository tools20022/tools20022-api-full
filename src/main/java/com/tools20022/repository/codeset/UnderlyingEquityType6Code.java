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
import com.tools20022.repository.codeset.UnderlyingEquityType6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type for a contract for equity derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#Basket
 * UnderlyingEquityType6Code.Basket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#DividendIndex
 * UnderlyingEquityType6Code.DividendIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#ExchangeTradedFund
 * UnderlyingEquityType6Code.ExchangeTradedFund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#Other
 * UnderlyingEquityType6Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#Share
 * UnderlyingEquityType6Code.Share}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#StockDividend
 * UnderlyingEquityType6Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#StockIndex
 * UnderlyingEquityType6Code.StockIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code#VolatilityIndex
 * UnderlyingEquityType6Code.VolatilityIndex}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV3Code
 * UnderlyingTypeV3Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnderlyingEquityType6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type for a contract for equity derivatives."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingEquityType6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Basket"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code Basket = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Basket";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.Basket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendIndex"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code DividendIndex = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.DividendIndex.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFund"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code ExchangeTradedFund = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFund";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.ExchangeTradedFund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code Other = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Share"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code Share = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Share";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.Share.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code StockDividend = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockIndex"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code StockIndex = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.StockIndex.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType6Code
	 * UnderlyingEquityType6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityIndex"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType6Code VolatilityIndex = new UnderlyingEquityType6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType6Code.mmObject();
			codeName = UnderlyingTypeV3Code.VolatilityIndex.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnderlyingEquityType6Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingEquityType6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingEquityType6Code";
				definition = "Specifies the type for a contract for equity derivatives.";
				trace_lazy = () -> UnderlyingTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingEquityType6Code.Basket, com.tools20022.repository.codeset.UnderlyingEquityType6Code.DividendIndex,
						com.tools20022.repository.codeset.UnderlyingEquityType6Code.ExchangeTradedFund, com.tools20022.repository.codeset.UnderlyingEquityType6Code.Other, com.tools20022.repository.codeset.UnderlyingEquityType6Code.Share,
						com.tools20022.repository.codeset.UnderlyingEquityType6Code.StockDividend, com.tools20022.repository.codeset.UnderlyingEquityType6Code.StockIndex,
						com.tools20022.repository.codeset.UnderlyingEquityType6Code.VolatilityIndex);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Basket.getCodeName().get(), Basket);
		codesByName.put(DividendIndex.getCodeName().get(), DividendIndex);
		codesByName.put(ExchangeTradedFund.getCodeName().get(), ExchangeTradedFund);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Share.getCodeName().get(), Share);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(StockIndex.getCodeName().get(), StockIndex);
		codesByName.put(VolatilityIndex.getCodeName().get(), VolatilityIndex);
	}

	public static UnderlyingEquityType6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingEquityType6Code[] values() {
		UnderlyingEquityType6Code[] values = new UnderlyingEquityType6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingEquityType6Code> {
		@Override
		public UnderlyingEquityType6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingEquityType6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}