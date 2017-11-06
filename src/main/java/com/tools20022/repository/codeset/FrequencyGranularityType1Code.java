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
import com.tools20022.repository.codeset.FrequencyGranularityTypeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Defines the granularity of the frequency used for the reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
 * FrequencyGranularityTypeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfMonth
 * FrequencyGranularityType1Code.mmEndOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfWeek
 * FrequencyGranularityType1Code.mmEndOfWeek}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfSemester
 * FrequencyGranularityType1Code.mmEndOfSemester}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfQuarter
 * FrequencyGranularityType1Code.mmEndOfQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfFortnight
 * FrequencyGranularityType1Code.mmEndOfFortnight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfDay
 * FrequencyGranularityType1Code.mmEndOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code#mmEndOfYear
 * FrequencyGranularityType1Code.mmEndOfYear}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class FrequencyGranularityType1Code extends FrequencyGranularityTypeCode {

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
	public static final MMCode mmEndOfMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonth";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	public static final MMCode mmEndOfWeek = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfWeek";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	public static final MMCode mmEndOfSemester = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfSemester";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	public static final MMCode mmEndOfQuarter = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfQuarter";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	public static final MMCode mmEndOfFortnight = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfFortnight";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	public static final MMCode mmEndOfDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDay";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
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
	public static final MMCode mmEndOfYear = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfYear";
			owner_lazy = () -> FrequencyGranularityType1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "FrequencyGranularityType1Code";
				definition = "Defines the granularity of the frequency used for the reporting.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfMonth, com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfWeek,
						com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfSemester, com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfQuarter,
						com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfFortnight, com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfDay,
						com.tools20022.repository.codeset.FrequencyGranularityType1Code.mmEndOfYear);
				trace_lazy = () -> FrequencyGranularityTypeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}