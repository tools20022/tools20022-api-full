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
import com.tools20022.repository.codeset.LiquidityIndicatorType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the market and statistic conditions upon which a liquidity
 * indicator has been computed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code#FiveDayMovingAverage
 * LiquidityIndicatorType1Code.FiveDayMovingAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code#TwentyDayMovingAverage
 * LiquidityIndicatorType1Code.TwentyDayMovingAverage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code#NormalMarketSize
 * LiquidityIndicatorType1Code.NormalMarketSize}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorTypeCode
 * LiquidityIndicatorTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LiquidityIndicatorType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the market and statistic conditions upon which a liquidity indicator has been computed."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FIVE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class LiquidityIndicatorType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code
	 * LiquidityIndicatorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiveDayMovingAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LiquidityIndicatorType1Code FiveDayMovingAverage = new LiquidityIndicatorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiveDayMovingAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorType1Code.mmObject();
			codeName = LiquidityIndicatorTypeCode.FiveDayMovingAverage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code
	 * LiquidityIndicatorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwentyDayMovingAverage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LiquidityIndicatorType1Code TwentyDayMovingAverage = new LiquidityIndicatorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwentyDayMovingAverage";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorType1Code.mmObject();
			codeName = LiquidityIndicatorTypeCode.TwentyDayMovingAverage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.LiquidityIndicatorType1Code
	 * LiquidityIndicatorType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalMarketSize"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final LiquidityIndicatorType1Code NormalMarketSize = new LiquidityIndicatorType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalMarketSize";
			owner_lazy = () -> com.tools20022.repository.codeset.LiquidityIndicatorType1Code.mmObject();
			codeName = LiquidityIndicatorTypeCode.NormalMarketSize.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, LiquidityIndicatorType1Code> codesByName = new LinkedHashMap<>();

	protected LiquidityIndicatorType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FIVE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LiquidityIndicatorType1Code";
				definition = "Specifies the market and statistic conditions upon which a liquidity indicator has been computed.";
				trace_lazy = () -> LiquidityIndicatorTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.LiquidityIndicatorType1Code.FiveDayMovingAverage, com.tools20022.repository.codeset.LiquidityIndicatorType1Code.TwentyDayMovingAverage,
						com.tools20022.repository.codeset.LiquidityIndicatorType1Code.NormalMarketSize);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FiveDayMovingAverage.getCodeName().get(), FiveDayMovingAverage);
		codesByName.put(TwentyDayMovingAverage.getCodeName().get(), TwentyDayMovingAverage);
		codesByName.put(NormalMarketSize.getCodeName().get(), NormalMarketSize);
	}

	public static LiquidityIndicatorType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static LiquidityIndicatorType1Code[] values() {
		LiquidityIndicatorType1Code[] values = new LiquidityIndicatorType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, LiquidityIndicatorType1Code> {
		@Override
		public LiquidityIndicatorType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(LiquidityIndicatorType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}