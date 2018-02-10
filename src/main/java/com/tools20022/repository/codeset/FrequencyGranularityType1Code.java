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
import com.tools20022.repository.codeset.FrequencyGranularityType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the granularity of the frequency used for the reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfMonth
 * FrequencyGranularityType1Code.EndOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfWeek
 * FrequencyGranularityType1Code.EndOfWeek}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfSemester
 * FrequencyGranularityType1Code.EndOfSemester}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfQuarter
 * FrequencyGranularityType1Code.EndOfQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfFortnight
 * FrequencyGranularityType1Code.EndOfFortnight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfDay
 * FrequencyGranularityType1Code.EndOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#EndOfYear
 * FrequencyGranularityType1Code.EndOfYear}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
 * FrequencyGranularityTypeCode}</li>
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
 * "FrequencyGranularityType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the granularity of the frequency used for the reporting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FrequencyGranularityType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonth"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfMonth = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfWeek"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfWeek = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfWeek";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfWeek.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfSemester"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfSemester = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfSemester";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfSemester.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfQuarter"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfQuarter = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfQuarter";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfQuarter.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfFortnight"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfFortnight = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfFortnight";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfFortnight.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDay"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfDay = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDay";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
	 * FrequencyGranularityType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfYear"</li>
	 * </ul>
	 */
	public static final FrequencyGranularityType1Code EndOfYear = new FrequencyGranularityType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfYear";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmObject();
			codeName = FrequencyGranularityTypeCode.EndOfYear.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FrequencyGranularityType1Code> codesByName = new LinkedHashMap<>();

	protected FrequencyGranularityType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrequencyGranularityType1Code";
				definition = "Defines the granularity of the frequency used for the reporting.";
				trace_lazy = () -> FrequencyGranularityTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfMonth, com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfWeek,
						com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfSemester, com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfQuarter,
						com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfFortnight, com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfDay,
						com.tools20022.repository.codeset.FrequencyGranularityType1Code.EndOfYear);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EndOfMonth.getCodeName().get(), EndOfMonth);
		codesByName.put(EndOfWeek.getCodeName().get(), EndOfWeek);
		codesByName.put(EndOfSemester.getCodeName().get(), EndOfSemester);
		codesByName.put(EndOfQuarter.getCodeName().get(), EndOfQuarter);
		codesByName.put(EndOfFortnight.getCodeName().get(), EndOfFortnight);
		codesByName.put(EndOfDay.getCodeName().get(), EndOfDay);
		codesByName.put(EndOfYear.getCodeName().get(), EndOfYear);
	}

	public static FrequencyGranularityType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FrequencyGranularityType1Code[] values() {
		FrequencyGranularityType1Code[] values = new FrequencyGranularityType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FrequencyGranularityType1Code> {
		@Override
		public FrequencyGranularityType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FrequencyGranularityType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}