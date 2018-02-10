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
import com.tools20022.repository.codeset.WeekDayCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Weekdays
 * WeekDayCode.Weekdays}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Weekend
 * WeekDayCode.Weekend}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Monday
 * WeekDayCode.Monday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Tuesday
 * WeekDayCode.Tuesday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Wednesday
 * WeekDayCode.Wednesday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Thursday
 * WeekDayCode.Thursday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Friday
 * WeekDayCode.Friday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Saturday
 * WeekDayCode.Saturday}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDayCode#Sunday
 * WeekDayCode.Sunday}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay1Code WeekDay1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WeekDay2Code WeekDay2Code}</li>
 * </ul>
 * </li>
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
 * "WeekDayCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the day of the week of the delivery."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WeekDayCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Weekdays.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekdays"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Weekdays."</li>
	 * </ul>
	 */
	public static final WeekDayCode Weekdays = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekdays";
			definition = "Weekdays.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "WDAY";
		}
	};
	/**
	 * Weekend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Weekend."</li>
	 * </ul>
	 */
	public static final WeekDayCode Weekend = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekend";
			definition = "Weekend.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "WEND";
		}
	};
	/**
	 * Monday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Monday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Monday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monday";
			definition = "Monday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "MOND";
		}
	};
	/**
	 * Tuesday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TUED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tuesday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tuesday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Tuesday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tuesday";
			definition = "Tuesday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "TUED";
		}
	};
	/**
	 * Wednesday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Wednesday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Wednesday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Wednesday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Wednesday";
			definition = "Wednesday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "WEDD";
		}
	};
	/**
	 * Thursday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "THUD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Thursday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Thursday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Thursday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Thursday";
			definition = "Thursday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "THUD";
		}
	};
	/**
	 * Friday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Friday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Friday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Friday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Friday";
			definition = "Friday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "FRID";
		}
	};
	/**
	 * Saturday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SATD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Saturday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Saturday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Saturday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Saturday";
			definition = "Saturday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "SATD";
		}
	};
	/**
	 * Sunday.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WeekDayCode WeekDayCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Sunday"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sunday."</li>
	 * </ul>
	 */
	public static final WeekDayCode Sunday = new WeekDayCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Sunday";
			definition = "Sunday.";
			owner_lazy = () -> com.tools20022.repository.codeset.WeekDayCode.mmObject();
			codeName = "SUND";
		}
	};
	final static private LinkedHashMap<String, WeekDayCode> codesByName = new LinkedHashMap<>();

	protected WeekDayCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "WeekDayCode";
				definition = "Specifies the day of the week of the delivery.";
				derivation_lazy = () -> Arrays.asList(WeekDay1Code.mmObject(), WeekDay2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WeekDayCode.Weekdays, com.tools20022.repository.codeset.WeekDayCode.Weekend, com.tools20022.repository.codeset.WeekDayCode.Monday,
						com.tools20022.repository.codeset.WeekDayCode.Tuesday, com.tools20022.repository.codeset.WeekDayCode.Wednesday, com.tools20022.repository.codeset.WeekDayCode.Thursday,
						com.tools20022.repository.codeset.WeekDayCode.Friday, com.tools20022.repository.codeset.WeekDayCode.Saturday, com.tools20022.repository.codeset.WeekDayCode.Sunday);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Weekdays.getCodeName().get(), Weekdays);
		codesByName.put(Weekend.getCodeName().get(), Weekend);
		codesByName.put(Monday.getCodeName().get(), Monday);
		codesByName.put(Tuesday.getCodeName().get(), Tuesday);
		codesByName.put(Wednesday.getCodeName().get(), Wednesday);
		codesByName.put(Thursday.getCodeName().get(), Thursday);
		codesByName.put(Friday.getCodeName().get(), Friday);
		codesByName.put(Saturday.getCodeName().get(), Saturday);
		codesByName.put(Sunday.getCodeName().get(), Sunday);
	}

	public static WeekDayCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WeekDayCode[] values() {
		WeekDayCode[] values = new WeekDayCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WeekDayCode> {
		@Override
		public WeekDayCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WeekDayCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}