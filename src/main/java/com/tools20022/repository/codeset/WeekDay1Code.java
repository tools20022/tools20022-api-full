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
import com.tools20022.repository.codeset.WeekDay1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the day of the week of the delivery.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Weekend
 * WeekDay1Code.Weekend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Weekdays
 * WeekDay1Code.Weekdays}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Wednesday
 * WeekDay1Code.Wednesday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Tuesday
 * WeekDay1Code.Tuesday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Thursday
 * WeekDay1Code.Thursday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Sunday
 * WeekDay1Code.Sunday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Saturday
 * WeekDay1Code.Saturday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Monday
 * WeekDay1Code.Monday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code#Friday
 * WeekDay1Code.Friday}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WeekDay1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the day of the week of the delivery."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WeekDay1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekend"</li>
	 * </ul>
	 */
	public static final WeekDay1Code Weekend = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekend";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Weekend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekdays"</li>
	 * </ul>
	 */
	public static final WeekDay1Code Weekdays = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekdays";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Weekdays.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wednesday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Wednesday
	 * WeekDay2Code.Wednesday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Wednesday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wednesday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Wednesday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Wednesday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tuesday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Tuesday
	 * WeekDay2Code.Tuesday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Tuesday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tuesday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Tuesday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Tuesday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Thursday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Thursday
	 * WeekDay2Code.Thursday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Thursday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Thursday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Thursday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Thursday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sunday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Sunday
	 * WeekDay2Code.Sunday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Sunday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sunday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Sunday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Sunday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Saturday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Saturday
	 * WeekDay2Code.Saturday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Saturday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Saturday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Saturday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Saturday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Monday
	 * WeekDay2Code.Monday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Monday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Monday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Monday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Friday"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Friday
	 * WeekDay2Code.Friday}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final WeekDay1Code Friday = new WeekDay1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Friday";
			nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.Friday);
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay1Code.mmObject();
			codeName = WeekDayCode.Friday.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, WeekDay1Code> codesByName = new LinkedHashMap<>();

	protected WeekDay1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "WeekDay1Code";
				definition = "Specifies the day of the week of the delivery.";
				nextVersions_lazy = () -> Arrays.asList(WeekDay2Code.mmObject());
				trace_lazy = () -> WeekDayCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WeekDay1Code.Weekend, com.tools20022.repository.codeset.WeekDay1Code.Weekdays, com.tools20022.repository.codeset.WeekDay1Code.Wednesday,
						com.tools20022.repository.codeset.WeekDay1Code.Tuesday, com.tools20022.repository.codeset.WeekDay1Code.Thursday, com.tools20022.repository.codeset.WeekDay1Code.Sunday,
						com.tools20022.repository.codeset.WeekDay1Code.Saturday, com.tools20022.repository.codeset.WeekDay1Code.Monday, com.tools20022.repository.codeset.WeekDay1Code.Friday);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Weekend.getCodeName().get(), Weekend);
		codesByName.put(Weekdays.getCodeName().get(), Weekdays);
		codesByName.put(Wednesday.getCodeName().get(), Wednesday);
		codesByName.put(Tuesday.getCodeName().get(), Tuesday);
		codesByName.put(Thursday.getCodeName().get(), Thursday);
		codesByName.put(Sunday.getCodeName().get(), Sunday);
		codesByName.put(Saturday.getCodeName().get(), Saturday);
		codesByName.put(Monday.getCodeName().get(), Monday);
		codesByName.put(Friday.getCodeName().get(), Friday);
	}

	public static WeekDay1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WeekDay1Code[] values() {
		WeekDay1Code[] values = new WeekDay1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WeekDay1Code> {
		@Override
		public WeekDay1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WeekDay1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}