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
import com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies an mission allowance type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code#EUAA
 * EmissionAllowanceProductType1Code.EUAA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code#EUA
 * EmissionAllowanceProductType1Code.EUA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code#ERU
 * EmissionAllowanceProductType1Code.ERU}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code#CER
 * EmissionAllowanceProductType1Code.CER}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code#Other
 * EmissionAllowanceProductType1Code.Other}</li>
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
 * "EmissionAllowanceProductType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies an mission allowance type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EmissionAllowanceProductType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code
	 * EmissionAllowanceProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUAA"</li>
	 * </ul>
	 */
	public static final EmissionAllowanceProductType1Code EUAA = new EmissionAllowanceProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUAA";
			owner_lazy = () -> com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.EUAA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code
	 * EmissionAllowanceProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUA"</li>
	 * </ul>
	 */
	public static final EmissionAllowanceProductType1Code EUA = new EmissionAllowanceProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUA";
			owner_lazy = () -> com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.EUA.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code
	 * EmissionAllowanceProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ERU"</li>
	 * </ul>
	 */
	public static final EmissionAllowanceProductType1Code ERU = new EmissionAllowanceProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ERU";
			owner_lazy = () -> com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.ERU.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code
	 * EmissionAllowanceProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CER"</li>
	 * </ul>
	 */
	public static final EmissionAllowanceProductType1Code CER = new EmissionAllowanceProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CER";
			owner_lazy = () -> com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.CER.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EmissionAllowanceProductType1Code
	 * EmissionAllowanceProductType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final EmissionAllowanceProductType1Code Other = new EmissionAllowanceProductType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.mmObject();
			codeName = AssetClassDetailedSubProductTypeCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EmissionAllowanceProductType1Code> codesByName = new LinkedHashMap<>();

	protected EmissionAllowanceProductType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EmissionAllowanceProductType1Code";
				definition = "Specifies an mission allowance type.";
				trace_lazy = () -> AssetClassDetailedSubProductTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.EUAA, com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.EUA,
						com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.ERU, com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.CER,
						com.tools20022.repository.codeset.EmissionAllowanceProductType1Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EUAA.getCodeName().get(), EUAA);
		codesByName.put(EUA.getCodeName().get(), EUA);
		codesByName.put(ERU.getCodeName().get(), ERU);
		codesByName.put(CER.getCodeName().get(), CER);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static EmissionAllowanceProductType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EmissionAllowanceProductType1Code[] values() {
		EmissionAllowanceProductType1Code[] values = new EmissionAllowanceProductType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EmissionAllowanceProductType1Code> {
		@Override
		public EmissionAllowanceProductType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EmissionAllowanceProductType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}