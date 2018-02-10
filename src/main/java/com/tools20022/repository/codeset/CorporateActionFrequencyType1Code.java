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
import com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the frequency of a CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code#Final
 * CorporateActionFrequencyType1Code.Final}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code#Interim
 * CorporateActionFrequencyType1Code.Interim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code#Regular
 * CorporateActionFrequencyType1Code.Regular}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code#Special
 * CorporateActionFrequencyType1Code.Special}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyTypeCode
 * CorporateActionFrequencyTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FINL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionFrequencyType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the frequency of a CA event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionFrequencyType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code
	 * CorporateActionFrequencyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Final"</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType1Code Final = new CorporateActionFrequencyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Final";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.mmObject();
			codeName = CorporateActionFrequencyTypeCode.Final.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code
	 * CorporateActionFrequencyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Interim"</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType1Code Interim = new CorporateActionFrequencyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Interim";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.mmObject();
			codeName = CorporateActionFrequencyTypeCode.Interim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code
	 * CorporateActionFrequencyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Regular"</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType1Code Regular = new CorporateActionFrequencyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Regular";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.mmObject();
			codeName = CorporateActionFrequencyTypeCode.Regular.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionFrequencyType1Code
	 * CorporateActionFrequencyType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * </ul>
	 */
	public static final CorporateActionFrequencyType1Code Special = new CorporateActionFrequencyType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.mmObject();
			codeName = CorporateActionFrequencyTypeCode.Special.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionFrequencyType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionFrequencyType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FINL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionFrequencyType1Code";
				definition = "Specifies the frequency of a CA event.";
				trace_lazy = () -> CorporateActionFrequencyTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.Final, com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.Interim,
						com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.Regular, com.tools20022.repository.codeset.CorporateActionFrequencyType1Code.Special);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Final.getCodeName().get(), Final);
		codesByName.put(Interim.getCodeName().get(), Interim);
		codesByName.put(Regular.getCodeName().get(), Regular);
		codesByName.put(Special.getCodeName().get(), Special);
	}

	public static CorporateActionFrequencyType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionFrequencyType1Code[] values() {
		CorporateActionFrequencyType1Code[] values = new CorporateActionFrequencyType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionFrequencyType1Code> {
		@Override
		public CorporateActionFrequencyType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionFrequencyType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}