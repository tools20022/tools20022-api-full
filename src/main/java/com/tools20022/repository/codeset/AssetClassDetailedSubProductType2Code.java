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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Further sub product code list for commodity derivative Softs.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code#RobustaCoffee
 * AssetClassDetailedSubProductType2Code.RobustaCoffee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code#Cocoa
 * AssetClassDetailedSubProductType2Code.Cocoa}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code#RawSugar
 * AssetClassDetailedSubProductType2Code.RawSugar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code#WhiteSugar
 * AssetClassDetailedSubProductType2Code.WhiteSugar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code#Other
 * AssetClassDetailedSubProductType2Code.Other}</li>
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
 * "AssetClassDetailedSubProductType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Further sub product code list for commodity derivative Softs."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassDetailedSubProductType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code
	 * AssetClassDetailedSubProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RobustaCoffee"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType2Code RobustaCoffee = new AssetClassDetailedSubProductType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RobustaCoffee";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.RobustaCoffee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code
	 * AssetClassDetailedSubProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cocoa"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType2Code Cocoa = new AssetClassDetailedSubProductType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cocoa";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Cocoa.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code
	 * AssetClassDetailedSubProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RawSugar"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType2Code RawSugar = new AssetClassDetailedSubProductType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RawSugar";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.RawSugar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code
	 * AssetClassDetailedSubProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WhiteSugar"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType2Code WhiteSugar = new AssetClassDetailedSubProductType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WhiteSugar";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.WhiteSugar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code
	 * AssetClassDetailedSubProductType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType2Code Other = new AssetClassDetailedSubProductType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassDetailedSubProductType2Code> codesByName = new LinkedHashMap<>();

	protected AssetClassDetailedSubProductType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassDetailedSubProductType2Code";
				definition = "Further sub product code list for commodity derivative Softs.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.RobustaCoffee, com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.Cocoa,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.RawSugar, com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.WhiteSugar,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RobustaCoffee.getCodeName().get(), RobustaCoffee);
		codesByName.put(Cocoa.getCodeName().get(), Cocoa);
		codesByName.put(RawSugar.getCodeName().get(), RawSugar);
		codesByName.put(WhiteSugar.getCodeName().get(), WhiteSugar);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassDetailedSubProductType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassDetailedSubProductType2Code[] values() {
		AssetClassDetailedSubProductType2Code[] values = new AssetClassDetailedSubProductType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassDetailedSubProductType2Code> {
		@Override
		public AssetClassDetailedSubProductType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassDetailedSubProductType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}