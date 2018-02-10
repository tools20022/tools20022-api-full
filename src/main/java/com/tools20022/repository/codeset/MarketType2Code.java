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
import com.tools20022.repository.codeset.MarketType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of market in which transactions take place, for example,
 * primary.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType2Code#PrimaryMarket
 * MarketType2Code.PrimaryMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType2Code#SecondaryMarket
 * MarketType2Code.SecondaryMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType2Code#OverTheCounter
 * MarketType2Code.OverTheCounter}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MarketType2Code#Various
 * MarketType2Code.Various}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MarketType2Code#StockExchange
 * MarketType2Code.StockExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MarketTypeCode MarketTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PRIM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MarketType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of market in which transactions take place, for example, primary."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MarketType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType2Code
	 * MarketType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrimaryMarket"</li>
	 * </ul>
	 */
	public static final MarketType2Code PrimaryMarket = new MarketType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrimaryMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType2Code.mmObject();
			codeName = MarketTypeCode.PrimaryMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType2Code
	 * MarketType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondaryMarket"</li>
	 * </ul>
	 */
	public static final MarketType2Code SecondaryMarket = new MarketType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondaryMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType2Code.mmObject();
			codeName = MarketTypeCode.SecondaryMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType2Code
	 * MarketType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverTheCounter"</li>
	 * </ul>
	 */
	public static final MarketType2Code OverTheCounter = new MarketType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OverTheCounter";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType2Code.mmObject();
			codeName = MarketTypeCode.OverTheCounter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType2Code
	 * MarketType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Various"</li>
	 * </ul>
	 */
	public static final MarketType2Code Various = new MarketType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Various";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType2Code.mmObject();
			codeName = MarketTypeCode.Various.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MarketType2Code
	 * MarketType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockExchange"</li>
	 * </ul>
	 */
	public static final MarketType2Code StockExchange = new MarketType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.MarketType2Code.mmObject();
			codeName = MarketTypeCode.StockExchange.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MarketType2Code> codesByName = new LinkedHashMap<>();

	protected MarketType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PRIM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MarketType2Code";
				definition = "Specifies the type of market in which transactions take place, for example, primary.";
				trace_lazy = () -> MarketTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MarketType2Code.PrimaryMarket, com.tools20022.repository.codeset.MarketType2Code.SecondaryMarket,
						com.tools20022.repository.codeset.MarketType2Code.OverTheCounter, com.tools20022.repository.codeset.MarketType2Code.Various, com.tools20022.repository.codeset.MarketType2Code.StockExchange);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PrimaryMarket.getCodeName().get(), PrimaryMarket);
		codesByName.put(SecondaryMarket.getCodeName().get(), SecondaryMarket);
		codesByName.put(OverTheCounter.getCodeName().get(), OverTheCounter);
		codesByName.put(Various.getCodeName().get(), Various);
		codesByName.put(StockExchange.getCodeName().get(), StockExchange);
	}

	public static MarketType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MarketType2Code[] values() {
		MarketType2Code[] values = new MarketType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MarketType2Code> {
		@Override
		public MarketType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MarketType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}