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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the time unit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmSecond
 * TimeUnitCode.mmSecond}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmMinute
 * TimeUnitCode.mmMinute}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmHour
 * TimeUnitCode.mmHour}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmCalendarDay
 * TimeUnitCode.mmCalendarDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmWeek
 * TimeUnitCode.mmWeek}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmMonth
 * TimeUnitCode.mmMonth}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnitCode#mmYear
 * TimeUnitCode.mmYear}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class TimeUnitCode {

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
	public static final MMCode mmSecond = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Second";
			definition = "Time unit is second.";
			owner_lazy = () -> TimeUnitCode.mmObject();
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
	public static final MMCode mmMinute = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Minute";
			definition = "Time unit is minute.";
			owner_lazy = () -> TimeUnitCode.mmObject();
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
	public static final MMCode mmHour = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Hour";
			definition = "Time unit is hour.";
			owner_lazy = () -> TimeUnitCode.mmObject();
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
	public static final MMCode mmCalendarDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalendarDay";
			definition = "Time unit is calendar day.";
			owner_lazy = () -> TimeUnitCode.mmObject();
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
	public static final MMCode mmWeek = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Week";
			definition = "Time unit is week.";
			owner_lazy = () -> TimeUnitCode.mmObject();
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
	public static final MMCode mmMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Month";
			definition = "Time unit is month.";
			owner_lazy = () -> TimeUnitCode.mmObject();
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
	public static final MMCode mmYear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Year";
			definition = "Time unit is year.";
			owner_lazy = () -> TimeUnitCode.mmObject();
			codeName = "YEAR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("SECO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeUnitCode";
				definition = "Specifies the time unit.";
				code_lazy = () -> Arrays.asList(TimeUnitCode.mmSecond, TimeUnitCode.mmMinute, TimeUnitCode.mmHour, TimeUnitCode.mmCalendarDay, TimeUnitCode.mmWeek, TimeUnitCode.mmMonth, TimeUnitCode.mmYear);
				derivation_lazy = () -> Arrays.asList(TimeUnit1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}