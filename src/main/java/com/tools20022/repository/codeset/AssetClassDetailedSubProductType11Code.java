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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Further sub product code list for commodity derivative Precious.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code#Gold
 * AssetClassDetailedSubProductType11Code.Gold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code#Other
 * AssetClassDetailedSubProductType11Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code#Palladium
 * AssetClassDetailedSubProductType11Code.Palladium}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code#Platinum
 * AssetClassDetailedSubProductType11Code.Platinum}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code#Silver
 * AssetClassDetailedSubProductType11Code.Silver}</li>
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
 * "AssetClassDetailedSubProductType11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further sub product code list for commodity derivative Precious."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassDetailedSubProductType11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code
	 * AssetClassDetailedSubProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Gold"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType11Code Gold = new AssetClassDetailedSubProductType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Gold";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Gold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code
	 * AssetClassDetailedSubProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType11Code Other = new AssetClassDetailedSubProductType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code
	 * AssetClassDetailedSubProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Palladium"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType11Code Palladium = new AssetClassDetailedSubProductType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Palladium";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Palladium.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code
	 * AssetClassDetailedSubProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Platinum"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType11Code Platinum = new AssetClassDetailedSubProductType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Platinum";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Platinum.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code
	 * AssetClassDetailedSubProductType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Silver"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType11Code Silver = new AssetClassDetailedSubProductType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Silver";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Silver.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassDetailedSubProductType11Code> codesByName = new LinkedHashMap<>();

	protected AssetClassDetailedSubProductType11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassDetailedSubProductType11Code";
				definition = "Further sub product code list for commodity derivative Precious.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.Gold, com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.Other,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.Palladium, com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.Platinum,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType11Code.Silver);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Gold.getCodeName().get(), Gold);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(Palladium.getCodeName().get(), Palladium);
		codesByName.put(Platinum.getCodeName().get(), Platinum);
		codesByName.put(Silver.getCodeName().get(), Silver);
	}

	public static AssetClassDetailedSubProductType11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassDetailedSubProductType11Code[] values() {
		AssetClassDetailedSubProductType11Code[] values = new AssetClassDetailedSubProductType11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassDetailedSubProductType11Code> {
		@Override
		public AssetClassDetailedSubProductType11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassDetailedSubProductType11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}