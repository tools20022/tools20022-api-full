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
import com.tools20022.repository.codeset.UnderlyingEquityType4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code#StockIndex
 * UnderlyingEquityType4Code.StockIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code#DividendIndex
 * UnderlyingEquityType4Code.DividendIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code#Other
 * UnderlyingEquityType4Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code#VolatilityIndex
 * UnderlyingEquityType4Code.VolatilityIndex}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnderlyingTypeV2Code
 * UnderlyingTypeV2Code}</li>
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
 * "UnderlyingEquityType4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type for a contract for equity derivatives."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnderlyingEquityType4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code
	 * UnderlyingEquityType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockIndex"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType4Code StockIndex = new UnderlyingEquityType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType4Code.mmObject();
			codeName = UnderlyingTypeV2Code.StockIndex.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code
	 * UnderlyingEquityType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendIndex"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType4Code DividendIndex = new UnderlyingEquityType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType4Code.mmObject();
			codeName = UnderlyingTypeV2Code.DividendIndex.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code
	 * UnderlyingEquityType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType4Code Other = new UnderlyingEquityType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType4Code.mmObject();
			codeName = UnderlyingTypeV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnderlyingEquityType4Code
	 * UnderlyingEquityType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VolatilityIndex"</li>
	 * </ul>
	 */
	public static final UnderlyingEquityType4Code VolatilityIndex = new UnderlyingEquityType4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VolatilityIndex";
			owner_lazy = () -> com.tools20022.repository.codeset.UnderlyingEquityType4Code.mmObject();
			codeName = UnderlyingTypeV2Code.VolatilityIndex.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnderlyingEquityType4Code> codesByName = new LinkedHashMap<>();

	protected UnderlyingEquityType4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnderlyingEquityType4Code";
				definition = "Specifies the type for a contract for equity derivatives.";
				trace_lazy = () -> UnderlyingTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnderlyingEquityType4Code.StockIndex, com.tools20022.repository.codeset.UnderlyingEquityType4Code.DividendIndex,
						com.tools20022.repository.codeset.UnderlyingEquityType4Code.Other, com.tools20022.repository.codeset.UnderlyingEquityType4Code.VolatilityIndex);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(StockIndex.getCodeName().get(), StockIndex);
		codesByName.put(DividendIndex.getCodeName().get(), DividendIndex);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(VolatilityIndex.getCodeName().get(), VolatilityIndex);
	}

	public static UnderlyingEquityType4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnderlyingEquityType4Code[] values() {
		UnderlyingEquityType4Code[] values = new UnderlyingEquityType4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnderlyingEquityType4Code> {
		@Override
		public UnderlyingEquityType4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnderlyingEquityType4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}