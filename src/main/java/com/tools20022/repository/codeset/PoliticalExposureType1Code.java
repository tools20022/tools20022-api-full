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
import com.tools20022.repository.codeset.PoliticalExposureType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the political exposure type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureType1Code#NoPoliticalExposure
 * PoliticalExposureType1Code.NoPoliticalExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureType1Code#PoliticalExposureForeign
 * PoliticalExposureType1Code.PoliticalExposureForeign}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureType1Code#PoliticalExposureDomestic
 * PoliticalExposureType1Code.PoliticalExposureDomestic}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureTypeCode
 * PoliticalExposureTypeCode}</li>
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
 * "PoliticalExposureType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the political exposure type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PoliticalExposureType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureType1Code
	 * PoliticalExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPoliticalExposure"</li>
	 * </ul>
	 */
	public static final PoliticalExposureType1Code NoPoliticalExposure = new PoliticalExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPoliticalExposure";
			owner_lazy = () -> com.tools20022.repository.codeset.PoliticalExposureType1Code.mmObject();
			codeName = PoliticalExposureTypeCode.NoPoliticalExposure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureType1Code
	 * PoliticalExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticalExposureForeign"</li>
	 * </ul>
	 */
	public static final PoliticalExposureType1Code PoliticalExposureForeign = new PoliticalExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticalExposureForeign";
			owner_lazy = () -> com.tools20022.repository.codeset.PoliticalExposureType1Code.mmObject();
			codeName = PoliticalExposureTypeCode.PoliticalExposureForeign.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PoliticalExposureType1Code
	 * PoliticalExposureType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoliticalExposureDomestic"</li>
	 * </ul>
	 */
	public static final PoliticalExposureType1Code PoliticalExposureDomestic = new PoliticalExposureType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoliticalExposureDomestic";
			owner_lazy = () -> com.tools20022.repository.codeset.PoliticalExposureType1Code.mmObject();
			codeName = PoliticalExposureTypeCode.PoliticalExposureDomestic.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PoliticalExposureType1Code> codesByName = new LinkedHashMap<>();

	protected PoliticalExposureType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PoliticalExposureType1Code";
				definition = "Specifies the political exposure type.";
				trace_lazy = () -> PoliticalExposureTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PoliticalExposureType1Code.NoPoliticalExposure, com.tools20022.repository.codeset.PoliticalExposureType1Code.PoliticalExposureForeign,
						com.tools20022.repository.codeset.PoliticalExposureType1Code.PoliticalExposureDomestic);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoPoliticalExposure.getCodeName().get(), NoPoliticalExposure);
		codesByName.put(PoliticalExposureForeign.getCodeName().get(), PoliticalExposureForeign);
		codesByName.put(PoliticalExposureDomestic.getCodeName().get(), PoliticalExposureDomestic);
	}

	public static PoliticalExposureType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PoliticalExposureType1Code[] values() {
		PoliticalExposureType1Code[] values = new PoliticalExposureType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PoliticalExposureType1Code> {
		@Override
		public PoliticalExposureType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PoliticalExposureType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}