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
import com.tools20022.repository.codeset.NoticeTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined notice
 * type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NoticeTypeCode#Universal
 * NoticeTypeCode.Universal}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.NoticeTypeCode#CedeAndCo
 * NoticeTypeCode.CedeAndCo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.NoticeType1Code
 * NoticeType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNVL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NoticeTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined notice type."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class NoticeTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Notice is universal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticeTypeCode
	 * NoticeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Universal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notice is universal."</li>
	 * </ul>
	 */
	public static final NoticeTypeCode Universal = new NoticeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Universal";
			definition = "Notice is universal.";
			owner_lazy = () -> com.tools20022.repository.codeset.NoticeTypeCode.mmObject();
			codeName = "UNVL";
		}
	};
	/**
	 * Notice is specific to the securities registered in DTC's (The Depository
	 * Trust Company) nominee name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.NoticeTypeCode
	 * NoticeTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CEDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CedeAndCo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notice is specific to the securities registered in DTC's (The Depository Trust Company) nominee name."
	 * </li>
	 * </ul>
	 */
	public static final NoticeTypeCode CedeAndCo = new NoticeTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CedeAndCo";
			definition = "Notice is specific to the securities registered in DTC's (The Depository Trust Company) nominee name.";
			owner_lazy = () -> com.tools20022.repository.codeset.NoticeTypeCode.mmObject();
			codeName = "CEDE";
		}
	};
	final static private LinkedHashMap<String, NoticeTypeCode> codesByName = new LinkedHashMap<>();

	protected NoticeTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNVL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NoticeTypeCode";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined notice type.";
				derivation_lazy = () -> Arrays.asList(NoticeType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.NoticeTypeCode.Universal, com.tools20022.repository.codeset.NoticeTypeCode.CedeAndCo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Universal.getCodeName().get(), Universal);
		codesByName.put(CedeAndCo.getCodeName().get(), CedeAndCo);
	}

	public static NoticeTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static NoticeTypeCode[] values() {
		NoticeTypeCode[] values = new NoticeTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, NoticeTypeCode> {
		@Override
		public NoticeTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(NoticeTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}