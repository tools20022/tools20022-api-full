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
import com.tools20022.repository.codeset.AssetClassProductType14Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Commodity derivative base product code list for Official Economic Statistics.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType14Code#OfficialEconomicStatistic
 * AssetClassProductType14Code.OfficialEconomicStatistic}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassProductTypeCode
 * AssetClassProductTypeCode}</li>
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
 * "AssetClassProductType14Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Commodity derivative base product code list for Official Economic Statistics."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassProductType14Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassProductType14Code
	 * AssetClassProductType14Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfficialEconomicStatistic"</li>
	 * </ul>
	 */
	public static final AssetClassProductType14Code OfficialEconomicStatistic = new AssetClassProductType14Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfficialEconomicStatistic";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassProductType14Code.mmObject();
			codeName = AssetClassProductTypeCode.OfficialEconomicStatistic.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassProductType14Code> codesByName = new LinkedHashMap<>();

	protected AssetClassProductType14Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassProductType14Code";
				definition = "Commodity derivative base product code list for Official Economic Statistics.";
				trace_lazy = () -> AssetClassProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassProductType14Code.OfficialEconomicStatistic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OfficialEconomicStatistic.getCodeName().get(), OfficialEconomicStatistic);
	}

	public static AssetClassProductType14Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassProductType14Code[] values() {
		AssetClassProductType14Code[] values = new AssetClassProductType14Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassProductType14Code> {
		@Override
		public AssetClassProductType14Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassProductType14Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}