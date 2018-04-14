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
import com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * List of codes for Agricultural related derivative contracts.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#Dairy
 * AssetClassSubProductAgriculturalType1Code.Dairy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#Forestry
 * AssetClassSubProductAgriculturalType1Code.Forestry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#GrainOilSeeds
 * AssetClassSubProductAgriculturalType1Code.GrainOilSeeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#Livestock
 * AssetClassSubProductAgriculturalType1Code.Livestock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#Softs
 * AssetClassSubProductAgriculturalType1Code.Softs}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#Seafood
 * AssetClassSubProductAgriculturalType1Code.Seafood}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code#Other
 * AssetClassSubProductAgriculturalType1Code.Other}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AssetClassSubProductAgriculturalType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "List of codes for Agricultural related derivative contracts."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassSubProductAgriculturalType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dairy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code Dairy = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dairy";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Dairy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Forestry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code Forestry = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Forestry";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Forestry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrainOilSeeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code GrainOilSeeds = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrainOilSeeds";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.GrainOilSeeds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Livestock"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code Livestock = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Livestock";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Livestock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Softs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code Softs = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Softs";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Softs.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Seafood"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code Seafood = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Seafood";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Seafood.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code
	 * AssetClassSubProductAgriculturalType1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final AssetClassSubProductAgriculturalType1Code Other = new AssetClassSubProductAgriculturalType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.mmObject();
			codeName = AssetClassSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassSubProductAgriculturalType1Code> codesByName = new LinkedHashMap<>();

	protected AssetClassSubProductAgriculturalType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AssetClassSubProductAgriculturalType1Code";
				definition = "List of codes for Agricultural related derivative contracts.";
				trace_lazy = () -> AssetClassSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.Dairy, com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.Forestry,
						com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.GrainOilSeeds, com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.Livestock,
						com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.Softs, com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.Seafood,
						com.tools20022.repository.codeset.AssetClassSubProductAgriculturalType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Dairy.getCodeName().get(), Dairy);
		codesByName.put(Forestry.getCodeName().get(), Forestry);
		codesByName.put(GrainOilSeeds.getCodeName().get(), GrainOilSeeds);
		codesByName.put(Livestock.getCodeName().get(), Livestock);
		codesByName.put(Softs.getCodeName().get(), Softs);
		codesByName.put(Seafood.getCodeName().get(), Seafood);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassSubProductAgriculturalType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassSubProductAgriculturalType1Code[] values() {
		AssetClassSubProductAgriculturalType1Code[] values = new AssetClassSubProductAgriculturalType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassSubProductAgriculturalType1Code> {
		@Override
		public AssetClassSubProductAgriculturalType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassSubProductAgriculturalType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}