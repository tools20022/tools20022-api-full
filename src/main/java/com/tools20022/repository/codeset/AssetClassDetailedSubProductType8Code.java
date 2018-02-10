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
import com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Further sub product code list for commodity derivative Emissions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code#CER
 * AssetClassDetailedSubProductType8Code.CER}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code#ERU
 * AssetClassDetailedSubProductType8Code.ERU}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code#EUA
 * AssetClassDetailedSubProductType8Code.EUA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code#EUAA
 * AssetClassDetailedSubProductType8Code.EUAA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code#Other
 * AssetClassDetailedSubProductType8Code.Other}</li>
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
 * "AssetClassDetailedSubProductType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Further sub product code list for commodity derivative Emissions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AssetClassDetailedSubProductType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code
	 * AssetClassDetailedSubProductType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CER"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType8Code CER = new AssetClassDetailedSubProductType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CER";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.CER.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code
	 * AssetClassDetailedSubProductType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERU"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType8Code ERU = new AssetClassDetailedSubProductType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERU";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.ERU.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code
	 * AssetClassDetailedSubProductType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUA"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType8Code EUA = new AssetClassDetailedSubProductType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUA";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.EUA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code
	 * AssetClassDetailedSubProductType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUAA"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType8Code EUAA = new AssetClassDetailedSubProductType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUAA";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.EUAA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code
	 * AssetClassDetailedSubProductType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final AssetClassDetailedSubProductType8Code Other = new AssetClassDetailedSubProductType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AssetClassDetailedSubProductType8Code> codesByName = new LinkedHashMap<>();

	protected AssetClassDetailedSubProductType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassDetailedSubProductType8Code";
				definition = "Further sub product code list for commodity derivative Emissions.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.CER, com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.ERU,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.EUA, com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.EUAA,
						com.tools20022.repository.codeset.AssetClassDetailedSubProductType8Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CER.getCodeName().get(), CER);
		codesByName.put(ERU.getCodeName().get(), ERU);
		codesByName.put(EUA.getCodeName().get(), EUA);
		codesByName.put(EUAA.getCodeName().get(), EUAA);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static AssetClassDetailedSubProductType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AssetClassDetailedSubProductType8Code[] values() {
		AssetClassDetailedSubProductType8Code[] values = new AssetClassDetailedSubProductType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AssetClassDetailedSubProductType8Code> {
		@Override
		public AssetClassDetailedSubProductType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AssetClassDetailedSubProductType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}