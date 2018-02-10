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
import com.tools20022.repository.codeset.FrequencyGranularityTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the granularity of the frequency used for the reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Daily
 * FrequencyGranularityTypeCode.Daily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfMonth
 * FrequencyGranularityTypeCode.EndOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Weekly
 * FrequencyGranularityTypeCode.Weekly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfWeek
 * FrequencyGranularityTypeCode.EndOfWeek}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfDay
 * FrequencyGranularityTypeCode.EndOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Monthly
 * FrequencyGranularityTypeCode.Monthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Quarterly
 * FrequencyGranularityTypeCode.Quarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfQuarter
 * FrequencyGranularityTypeCode.EndOfQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Yearly
 * FrequencyGranularityTypeCode.Yearly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Semiannually
 * FrequencyGranularityTypeCode.Semiannually}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfSemester
 * FrequencyGranularityTypeCode.EndOfSemester}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfFortnight
 * FrequencyGranularityTypeCode.EndOfFortnight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#Fortnightly
 * FrequencyGranularityTypeCode.Fortnightly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#EndOfYear
 * FrequencyGranularityTypeCode.EndOfYear}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityType1Code
 * FrequencyGranularityType1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FrequencyGranularityTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the granularity of the frequency used for the reporting."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FrequencyGranularityTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Event takes place every day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Daily"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every day."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Daily = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			definition = "Event takes place every day.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "DAIL";
		}
	};
	/**
	 * Event takes place at the end of each month or period of one month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place at the end of each month or period of one month."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfMonth = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonth";
			definition = "Event takes place at the end of each month or period of one month.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "EMON";
		}
	};
	/**
	 * Event takes place once a week.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WEEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Weekly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place once a week."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Weekly = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			definition = "Event takes place once a week.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "WEEK";
		}
	};
	/**
	 * Event takes place at the end of each week.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EWEK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfWeek"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place at the end of each week."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfWeek = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfWeek";
			definition = "Event takes place at the end of each week.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "EWEK";
		}
	};
	/**
	 * Event takes place at the end of each day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place at the end of each day."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfDay = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDay";
			definition = "Event takes place at the end of each day.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "EDAY";
		}
	};
	/**
	 * Event takes place every month or once a month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MNTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monthly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every month or once a month."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Monthly = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			definition = "Event takes place every month or once a month.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "MNTH";
		}
	};
	/**
	 * Event takes place every three months or four times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QURT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Quarterly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place every three months or four times a year."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Quarterly = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			definition = "Event takes place every three months or four times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "QURT";
		}
	};
	/**
	 * Event takes place at the end of each period of three months (or four
	 * times a year).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfQuarter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place at the end of each period of three months (or four times a year)."
	 * </li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfQuarter = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfQuarter";
			definition = "Event takes place at the end of each period of three months (or four times a year).";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "EQRT";
		}
	};
	/**
	 * Event takes place every year or once a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yearly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every year or once a year."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Yearly = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yearly";
			definition = "Event takes place every year or once a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "YEAR";
		}
	};
	/**
	 * Event takes place every six months or two times a year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MIAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Semiannually"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every six months or two times a year."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Semiannually = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Semiannually";
			definition = "Event takes place every six months or two times a year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "MIAN";
		}
	};
	/**
	 * Event takes place at the end of each six months (or two times a year).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ESEM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfSemester"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event takes place at the end of each six months (or two times a year)."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfSemester = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfSemester";
			definition = "Event takes place at the end of each six months (or two times a year).";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "ESEM";
		}
	};
	/**
	 * Event takes place at the end of each two weeks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EFRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfFortnight"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place at the end of each two weeks."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfFortnight = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfFortnight";
			definition = "Event takes place at the end of each two weeks.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "EFRT";
		}
	};
	/**
	 * Event takes place every two weeks.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fortnightly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place every two weeks."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode Fortnightly = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fortnightly";
			definition = "Event takes place every two weeks.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "FRTN";
		}
	};
	/**
	 * Event takes place at the end of each year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode
	 * FrequencyGranularityTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENDY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event takes place at the end of each year."</li>
	 * </ul>
	 */
	public static final FrequencyGranularityTypeCode EndOfYear = new FrequencyGranularityTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfYear";
			definition = "Event takes place at the end of each year.";
			owner_lazy = () -> com.tools20022.repository.codeset.FrequencyGranularityTypeCode.mmObject();
			codeName = "ENDY";
		}
	};
	final static private LinkedHashMap<String, FrequencyGranularityTypeCode> codesByName = new LinkedHashMap<>();

	protected FrequencyGranularityTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrequencyGranularityTypeCode";
				definition = "Specifies the granularity of the frequency used for the reporting.";
				derivation_lazy = () -> Arrays.asList(FrequencyGranularityType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Daily, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfMonth,
						com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Weekly, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfWeek,
						com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfDay, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Monthly,
						com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Quarterly, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfQuarter,
						com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Yearly, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Semiannually,
						com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfSemester, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfFortnight,
						com.tools20022.repository.codeset.FrequencyGranularityTypeCode.Fortnightly, com.tools20022.repository.codeset.FrequencyGranularityTypeCode.EndOfYear);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Daily.getCodeName().get(), Daily);
		codesByName.put(EndOfMonth.getCodeName().get(), EndOfMonth);
		codesByName.put(Weekly.getCodeName().get(), Weekly);
		codesByName.put(EndOfWeek.getCodeName().get(), EndOfWeek);
		codesByName.put(EndOfDay.getCodeName().get(), EndOfDay);
		codesByName.put(Monthly.getCodeName().get(), Monthly);
		codesByName.put(Quarterly.getCodeName().get(), Quarterly);
		codesByName.put(EndOfQuarter.getCodeName().get(), EndOfQuarter);
		codesByName.put(Yearly.getCodeName().get(), Yearly);
		codesByName.put(Semiannually.getCodeName().get(), Semiannually);
		codesByName.put(EndOfSemester.getCodeName().get(), EndOfSemester);
		codesByName.put(EndOfFortnight.getCodeName().get(), EndOfFortnight);
		codesByName.put(Fortnightly.getCodeName().get(), Fortnightly);
		codesByName.put(EndOfYear.getCodeName().get(), EndOfYear);
	}

	public static FrequencyGranularityTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FrequencyGranularityTypeCode[] values() {
		FrequencyGranularityTypeCode[] values = new FrequencyGranularityTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FrequencyGranularityTypeCode> {
		@Override
		public FrequencyGranularityTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FrequencyGranularityTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}