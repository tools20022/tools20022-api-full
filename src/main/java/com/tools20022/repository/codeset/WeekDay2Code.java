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
import com.tools20022.repository.codeset.WeekDay2Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Wednesday
 * WeekDay2Code.Wednesday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Tuesday
 * WeekDay2Code.Tuesday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Thursday
 * WeekDay2Code.Thursday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Sunday
 * WeekDay2Code.Sunday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Saturday
 * WeekDay2Code.Saturday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Monday
 * WeekDay2Code.Monday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code#Friday
 * WeekDay2Code.Friday}</li>
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
 * "WeekDay2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the day of the week of the delivery."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WeekDay2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wednesday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Wednesday
	 * WeekDay1Code.Wednesday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Wednesday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wednesday";
			previousVersion_lazy = () -> WeekDay1Code.Wednesday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Wednesday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tuesday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Tuesday
	 * WeekDay1Code.Tuesday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Tuesday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tuesday";
			previousVersion_lazy = () -> WeekDay1Code.Tuesday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Tuesday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Thursday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Thursday
	 * WeekDay1Code.Thursday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Thursday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Thursday";
			previousVersion_lazy = () -> WeekDay1Code.Thursday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Thursday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sunday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Sunday
	 * WeekDay1Code.Sunday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Sunday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sunday";
			previousVersion_lazy = () -> WeekDay1Code.Sunday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Sunday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Saturday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Saturday
	 * WeekDay1Code.Saturday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Saturday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Saturday";
			previousVersion_lazy = () -> WeekDay1Code.Saturday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Saturday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Monday
	 * WeekDay1Code.Monday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Monday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monday";
			previousVersion_lazy = () -> WeekDay1Code.Monday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Monday.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Friday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDay1Code#Friday
	 * WeekDay1Code.Friday}</li>
	 * </ul>
	 */
	public static final WeekDay2Code Friday = new WeekDay2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Friday";
			previousVersion_lazy = () -> WeekDay1Code.Friday;
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDay2Code.mmObject();
			codeName = WeekDayCode.Friday.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, WeekDay2Code> codesByName = new LinkedHashMap<>();

	protected WeekDay2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "WeekDay2Code";
				definition = "Specifies the day of the week of the delivery.";
				previousVersion_lazy = () -> WeekDay1Code.mmObject();
				trace_lazy = () -> WeekDayCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WeekDay2Code.Wednesday, com.tools20022.repository.codeset.WeekDay2Code.Tuesday, com.tools20022.repository.codeset.WeekDay2Code.Thursday,
						com.tools20022.repository.codeset.WeekDay2Code.Sunday, com.tools20022.repository.codeset.WeekDay2Code.Saturday, com.tools20022.repository.codeset.WeekDay2Code.Monday,
						com.tools20022.repository.codeset.WeekDay2Code.Friday);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Wednesday.getCodeName().get(), Wednesday);
		codesByName.put(Tuesday.getCodeName().get(), Tuesday);
		codesByName.put(Thursday.getCodeName().get(), Thursday);
		codesByName.put(Sunday.getCodeName().get(), Sunday);
		codesByName.put(Saturday.getCodeName().get(), Saturday);
		codesByName.put(Monday.getCodeName().get(), Monday);
		codesByName.put(Friday.getCodeName().get(), Friday);
	}

	public static WeekDay2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WeekDay2Code[] values() {
		WeekDay2Code[] values = new WeekDay2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WeekDay2Code> {
		@Override
		public WeekDay2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WeekDay2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}