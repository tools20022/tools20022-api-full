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
import com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Code list for Environmental related derivative contracts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code#Emission
 * AssetClassSubProductEnvironmentalType1Code.Emission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code#Weather
 * AssetClassSubProductEnvironmentalType1Code.Weather}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code#Other
 * AssetClassSubProductEnvironmentalType1Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductTypeCode
 * AssetClassSubProductTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassSubProductEnvironmentalType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Code list for Environmental related derivative contracts."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductEnvironmentalType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code
	 * AssetClassSubProductEnvironmentalType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Emission"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnvironmentalType1Code Emission = new AssetClassSubProductEnvironmentalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Emission";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Emission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code
	 * AssetClassSubProductEnvironmentalType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weather"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnvironmentalType1Code Weather = new AssetClassSubProductEnvironmentalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weather";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Weather.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code
	 * AssetClassSubProductEnvironmentalType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassSubProductEnvironmentalType1Code Other = new AssetClassSubProductEnvironmentalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductEnvironmentalType1Code> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductEnvironmentalType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AssetClassSubProductEnvironmentalType1Code";
				definition = "Code list for Environmental related derivative contracts.";
				trace_lazy = () -> AssetClassSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.Emission, com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.Weather,
						com.tools20022.repository.codeset.AssetClassSubProductEnvironmentalType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Emission.getCodeName().get(), Emission);
		codesByName.put(Weather.getCodeName().get(), Weather);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassSubProductEnvironmentalType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductEnvironmentalType1Code[] values() {
		AssetClassSubProductEnvironmentalType1Code[] values = new AssetClassSubProductEnvironmentalType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductEnvironmentalType1Code> {
		@Override
		public AssetClassSubProductEnvironmentalType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductEnvironmentalType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}