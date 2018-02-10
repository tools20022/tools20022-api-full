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
import com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of event processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code#General
 * CorporateActionEventProcessingType1Code.General}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code#Distribution
 * CorporateActionEventProcessingType1Code.Distribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code#Reorganisation
 * CorporateActionEventProcessingType1Code.Reorganisation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingTypeCode
 * CorporateActionEventProcessingTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"GENL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventProcessingType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of event processing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventProcessingType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code
	 * CorporateActionEventProcessingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "General"</li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingType1Code General = new CorporateActionEventProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "General";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.mmObject();
			codeName = CorporateActionEventProcessingTypeCode.General.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code
	 * CorporateActionEventProcessingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingType1Code Distribution = new CorporateActionEventProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Distribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.mmObject();
			codeName = CorporateActionEventProcessingTypeCode.Distribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code
	 * CorporateActionEventProcessingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reorganisation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventProcessingType1Code Reorganisation = new CorporateActionEventProcessingType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reorganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.mmObject();
			codeName = CorporateActionEventProcessingTypeCode.Reorganisation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventProcessingType1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventProcessingType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("GENL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventProcessingType1Code";
				definition = "Specifies the type of event processing.";
				trace_lazy = () -> CorporateActionEventProcessingTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.General, com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.Distribution,
						com.tools20022.repository.codeset.CorporateActionEventProcessingType1Code.Reorganisation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(General.getCodeName().get(), General);
		codesByName.put(Distribution.getCodeName().get(), Distribution);
		codesByName.put(Reorganisation.getCodeName().get(), Reorganisation);
	}

	public static CorporateActionEventProcessingType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventProcessingType1Code[] values() {
		CorporateActionEventProcessingType1Code[] values = new CorporateActionEventProcessingType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventProcessingType1Code> {
		@Override
		public CorporateActionEventProcessingType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventProcessingType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}