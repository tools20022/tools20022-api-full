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
import com.tools20022.repository.codeset.TimeUnit1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Unit of time associated with the contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#CalendarDay
 * TimeUnit1Code.CalendarDay}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#Hour
 * TimeUnit1Code.Hour}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#Minute
 * TimeUnit1Code.Minute}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#Month
 * TimeUnit1Code.Month}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#Second
 * TimeUnit1Code.Second}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#Week
 * TimeUnit1Code.Week}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.TimeUnit1Code#Year
 * TimeUnit1Code.Year}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TimeUnitCode TimeUnitCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeUnit1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Unit of time associated with the contract."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DAYC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TimeUnit1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalendarDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code CalendarDay = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalendarDay";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.CalendarDay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code Hour = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hour";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.Hour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Minute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code Minute = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Minute";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.Minute.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Month"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code Month = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Month";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.Month.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Second"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code Second = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Second";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.Second.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Week"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code Week = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Week";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.Week.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TimeUnit1Code
	 * TimeUnit1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Year"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TimeUnit1Code Year = new TimeUnit1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Year";
			owner_lazy = () -> com.tools20022.repository.codeset.TimeUnit1Code.mmObject();
			codeName = TimeUnitCode.Year.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TimeUnit1Code> codesByName = new LinkedHashMap<>();

	protected TimeUnit1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DAYC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TimeUnit1Code";
				definition = "Unit of time associated with the contract.";
				trace_lazy = () -> TimeUnitCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TimeUnit1Code.CalendarDay, com.tools20022.repository.codeset.TimeUnit1Code.Hour, com.tools20022.repository.codeset.TimeUnit1Code.Minute,
						com.tools20022.repository.codeset.TimeUnit1Code.Month, com.tools20022.repository.codeset.TimeUnit1Code.Second, com.tools20022.repository.codeset.TimeUnit1Code.Week,
						com.tools20022.repository.codeset.TimeUnit1Code.Year);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CalendarDay.getCodeName().get(), CalendarDay);
		codesByName.put(Hour.getCodeName().get(), Hour);
		codesByName.put(Minute.getCodeName().get(), Minute);
		codesByName.put(Month.getCodeName().get(), Month);
		codesByName.put(Second.getCodeName().get(), Second);
		codesByName.put(Week.getCodeName().get(), Week);
		codesByName.put(Year.getCodeName().get(), Year);
	}

	public static TimeUnit1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TimeUnit1Code[] values() {
		TimeUnit1Code[] values = new TimeUnit1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TimeUnit1Code> {
		@Override
		public TimeUnit1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TimeUnit1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}