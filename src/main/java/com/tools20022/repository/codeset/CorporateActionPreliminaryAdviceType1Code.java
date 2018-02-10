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
import com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of movement preliminary advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code#New
 * CorporateActionPreliminaryAdviceType1Code.New}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code#Replacement
 * CorporateActionPreliminaryAdviceType1Code.Replacement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceTypeCode
 * CorporateActionPreliminaryAdviceTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NEWM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionPreliminaryAdviceType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of movement preliminary advice."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionPreliminaryAdviceType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code
	 * CorporateActionPreliminaryAdviceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "New"</li>
	 * </ul>
	 */
	public static final CorporateActionPreliminaryAdviceType1Code New = new CorporateActionPreliminaryAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "New";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code.mmObject();
			codeName = CorporateActionPreliminaryAdviceTypeCode.New.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code
	 * CorporateActionPreliminaryAdviceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Replacement"</li>
	 * </ul>
	 */
	public static final CorporateActionPreliminaryAdviceType1Code Replacement = new CorporateActionPreliminaryAdviceType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Replacement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code.mmObject();
			codeName = CorporateActionPreliminaryAdviceTypeCode.Replacement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionPreliminaryAdviceType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionPreliminaryAdviceType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NEWM");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPreliminaryAdviceType1Code";
				definition = "Type of movement preliminary advice.";
				trace_lazy = () -> CorporateActionPreliminaryAdviceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code.New, com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code.Replacement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(New.getCodeName().get(), New);
		codesByName.put(Replacement.getCodeName().get(), Replacement);
	}

	public static CorporateActionPreliminaryAdviceType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionPreliminaryAdviceType1Code[] values() {
		CorporateActionPreliminaryAdviceType1Code[] values = new CorporateActionPreliminaryAdviceType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionPreliminaryAdviceType1Code> {
		@Override
		public CorporateActionPreliminaryAdviceType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionPreliminaryAdviceType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}