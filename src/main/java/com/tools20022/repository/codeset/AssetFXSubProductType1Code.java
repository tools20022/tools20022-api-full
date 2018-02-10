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
import com.tools20022.repository.codeset.AssetFXSubProductType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the allowed foreign exchange types for foreign exchange
 * derivatives.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code#ForeignExchangeCrossRate
 * AssetFXSubProductType1Code.ForeignExchangeCrossRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code#ForeignExchangeEmergingMarket
 * AssetFXSubProductType1Code.ForeignExchangeEmergingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code#ForeignExchangeMajor
 * AssetFXSubProductType1Code.ForeignExchangeMajor}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductTypeCode
 * AssetClassDetailedSubProductTypeCode}</li>
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
 * "AssetFXSubProductType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the allowed foreign exchange types for foreign exchange derivatives."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetFXSubProductType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code
	 * AssetFXSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeCrossRate"</li>
	 * </ul>
	 */
	public static final AssetFXSubProductType1Code ForeignExchangeCrossRate = new AssetFXSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeCrossRate";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetFXSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.ForeignExchangeCrossRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code
	 * AssetFXSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeEmergingMarket"</li>
	 * </ul>
	 */
	public static final AssetFXSubProductType1Code ForeignExchangeEmergingMarket = new AssetFXSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeEmergingMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetFXSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.ForeignExchangeEmergingMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetFXSubProductType1Code
	 * AssetFXSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeMajor"</li>
	 * </ul>
	 */
	public static final AssetFXSubProductType1Code ForeignExchangeMajor = new AssetFXSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeMajor";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetFXSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.ForeignExchangeMajor.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetFXSubProductType1Code> codesByName = new LinkedHashMap<>();

	protected AssetFXSubProductType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetFXSubProductType1Code";
				definition = "Specifies the allowed foreign exchange types for foreign exchange derivatives.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetFXSubProductType1Code.ForeignExchangeCrossRate, com.tools20022.repository.codeset.AssetFXSubProductType1Code.ForeignExchangeEmergingMarket,
						com.tools20022.repository.codeset.AssetFXSubProductType1Code.ForeignExchangeMajor);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ForeignExchangeCrossRate.getCodeName().get(), ForeignExchangeCrossRate);
		codesByName.put(ForeignExchangeEmergingMarket.getCodeName().get(), ForeignExchangeEmergingMarket);
		codesByName.put(ForeignExchangeMajor.getCodeName().get(), ForeignExchangeMajor);
	}

	public static AssetFXSubProductType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetFXSubProductType1Code[] values() {
		AssetFXSubProductType1Code[] values = new AssetFXSubProductType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetFXSubProductType1Code> {
		@Override
		public AssetFXSubProductType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetFXSubProductType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}