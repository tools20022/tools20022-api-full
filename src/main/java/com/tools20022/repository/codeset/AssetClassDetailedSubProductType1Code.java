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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Further sub product code list for commodity derivative Grains Oil Seeds.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code#FeedWheat
 * AssetClassDetailedSubProductType1Code.FeedWheat}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code#Soybeans
 * AssetClassDetailedSubProductType1Code.Soybeans}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code#Rapeseed
 * AssetClassDetailedSubProductType1Code.Rapeseed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code#Other
 * AssetClassDetailedSubProductType1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code#Maize
 * AssetClassDetailedSubProductType1Code.Maize}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code#Rice
 * AssetClassDetailedSubProductType1Code.Rice}</li>
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
 * "AssetClassDetailedSubProductType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further sub product code list for commodity derivative Grains Oil Seeds."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassDetailedSubProductType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code
	 * AssetClassDetailedSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeedWheat"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType1Code FeedWheat = new AssetClassDetailedSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeedWheat";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.FeedWheat.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code
	 * AssetClassDetailedSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Soybeans"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType1Code Soybeans = new AssetClassDetailedSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Soybeans";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Soybeans.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code
	 * AssetClassDetailedSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rapeseed"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType1Code Rapeseed = new AssetClassDetailedSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rapeseed";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Rapeseed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code
	 * AssetClassDetailedSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType1Code Other = new AssetClassDetailedSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code
	 * AssetClassDetailedSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maize"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType1Code Maize = new AssetClassDetailedSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maize";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Maize.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code
	 * AssetClassDetailedSubProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rice"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType1Code Rice = new AssetClassDetailedSubProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rice";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Rice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassDetailedSubProductType1Code> codesByName = new LinkedHashMap<>();

	protected AssetClassDetailedSubProductType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassDetailedSubProductType1Code";
				definition = "Further sub product code list for commodity derivative Grains Oil Seeds.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.FeedWheat, com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.Soybeans,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.Rapeseed, com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.Other,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.Maize, com.tools20022.repository.codeset.AssetClassDetailedSubProductType1Code.Rice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FeedWheat.getCodeName().get(), FeedWheat);
		codesByName.put(Soybeans.getCodeName().get(), Soybeans);
		codesByName.put(Rapeseed.getCodeName().get(), Rapeseed);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Maize.getCodeName().get(), Maize);
		codesByName.put(Rice.getCodeName().get(), Rice);
	}

	public static AssetClassDetailedSubProductType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassDetailedSubProductType1Code[] values() {
		AssetClassDetailedSubProductType1Code[] values = new AssetClassDetailedSubProductType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassDetailedSubProductType1Code> {
		@Override
		public AssetClassDetailedSubProductType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassDetailedSubProductType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}