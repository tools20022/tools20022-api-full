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
import com.tools20022.repository.codeset.TimeUnitCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the time unit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#Second
 * TimeUnitCode.Second}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#Minute
 * TimeUnitCode.Minute}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#Hour
 * TimeUnitCode.Hour}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#CalendarDay
 * TimeUnitCode.CalendarDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#Week
 * TimeUnitCode.Week}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#Month
 * TimeUnitCode.Month}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#Year
 * TimeUnitCode.Year}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code
 * TimeUnit1Code}</li>
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
 * <li>"SECO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeUnitCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the time unit."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TimeUnitCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Time unit is second.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Second"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is second."</li>
	 * </ul>
	 */
	public static final TimeUnitCode Second = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Second";
			definition = "Time unit is second.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "SECO";
		}
	};
	/**
	 * Time unit is minute.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is minute."</li>
	 * </ul>
	 */
	public static final TimeUnitCode Minute = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Minute";
			definition = "Time unit is minute.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "MINU";
		}
	};
	/**
	 * Time unit is hour.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HOUR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is hour."</li>
	 * </ul>
	 */
	public static final TimeUnitCode Hour = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hour";
			definition = "Time unit is hour.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "HOUR";
		}
	};
	/**
	 * Time unit is calendar day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAYC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalendarDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is calendar day."</li>
	 * </ul>
	 */
	public static final TimeUnitCode CalendarDay = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalendarDay";
			definition = "Time unit is calendar day.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "DAYC";
		}
	};
	/**
	 * Time unit is week.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Week"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is week."</li>
	 * </ul>
	 */
	public static final TimeUnitCode Week = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Week";
			definition = "Time unit is week.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * Time unit is month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Month"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is month."</li>
	 * </ul>
	 */
	public static final TimeUnitCode Month = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Month";
			definition = "Time unit is month.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Time unit is year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time unit is year."</li>
	 * </ul>
	 */
	public static final TimeUnitCode Year = new TimeUnitCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "Time unit is year.";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnitCode.mmObject();
			codeName = "YEAR";
		}
	};
	final static private LinkedHashMap<String, TimeUnitCode> codesByName = new LinkedHashMap<>();

	protected TimeUnitCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SECO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeUnitCode";
				definition = "Specifies the time unit.";
				derivation_lazy = () -> Arrays.asList(TimeUnit1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TimeUnitCode.Second, com.tools20022.repository.codeset.TimeUnitCode.Minute, com.tools20022.repository.codeset.TimeUnitCode.Hour,
						com.tools20022.repository.codeset.TimeUnitCode.CalendarDay, com.tools20022.repository.codeset.TimeUnitCode.Week, com.tools20022.repository.codeset.TimeUnitCode.Month,
						com.tools20022.repository.codeset.TimeUnitCode.Year);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Second.getCodeName().get(), Second);
		codesByName.put(Minute.getCodeName().get(), Minute);
		codesByName.put(Hour.getCodeName().get(), Hour);
		codesByName.put(CalendarDay.getCodeName().get(), CalendarDay);
		codesByName.put(Week.getCodeName().get(), Week);
		codesByName.put(Month.getCodeName().get(), Month);
		codesByName.put(Year.getCodeName().get(), Year);
	}

	public static TimeUnitCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TimeUnitCode[] values() {
		TimeUnitCode[] values = new TimeUnitCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TimeUnitCode> {
		@Override
		public TimeUnitCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TimeUnitCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}