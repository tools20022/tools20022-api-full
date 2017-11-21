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
 * Specifies the granularity of the frequency used for the reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmDaily
 * FrequencyGranularityTypeCode.mmDaily}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfMonth
 * FrequencyGranularityTypeCode.mmEndOfMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmWeekly
 * FrequencyGranularityTypeCode.mmWeekly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfWeek
 * FrequencyGranularityTypeCode.mmEndOfWeek}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfDay
 * FrequencyGranularityTypeCode.mmEndOfDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmMonthly
 * FrequencyGranularityTypeCode.mmMonthly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmQuarterly
 * FrequencyGranularityTypeCode.mmQuarterly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfQuarter
 * FrequencyGranularityTypeCode.mmEndOfQuarter}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmYearly
 * FrequencyGranularityTypeCode.mmYearly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmSemiannually
 * FrequencyGranularityTypeCode.mmSemiannually}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfSemester
 * FrequencyGranularityTypeCode.mmEndOfSemester}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfFortnight
 * FrequencyGranularityTypeCode.mmEndOfFortnight}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmFortnightly
 * FrequencyGranularityTypeCode.mmFortnightly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FrequencyGranularityTypeCode#mmEndOfYear
 * FrequencyGranularityTypeCode.mmEndOfYear}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class FrequencyGranularityTypeCode {

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
	public static final MMCode mmDaily = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Daily";
			definition = "Event takes place every day.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	 * "Event takes place at the end of each month or period of one  month."</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfMonth = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonth";
			definition = "Event takes place at the end of each month or period of one  month.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmWeekly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Weekly";
			definition = "Event takes place once a week.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmEndOfWeek = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfWeek";
			definition = "Event takes place at the end of each week.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmEndOfDay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfDay";
			definition = "Event takes place at the end of each day.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmMonthly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monthly";
			definition = "Event takes place every month or once a month.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmQuarterly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Quarterly";
			definition = "Event takes place every three months or four times a year.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmEndOfQuarter = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfQuarter";
			definition = "Event takes place at the end of each period of three months (or four times a year).";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmYearly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yearly";
			definition = "Event takes place every year or once a year.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmSemiannually = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Semiannually";
			definition = "Event takes place every six months or two times a year.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmEndOfSemester = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfSemester";
			definition = "Event takes place at the end of each six months (or two times a year).";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmEndOfFortnight = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfFortnight";
			definition = "Event takes place at the end of each two weeks.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmFortnightly = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fortnightly";
			definition = "Event takes place every two weeks.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
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
	public static final MMCode mmEndOfYear = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfYear";
			definition = "Event takes place at the end of each year.";
			owner_lazy = () -> FrequencyGranularityTypeCode.mmObject();
			codeName = "ENDY";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FrequencyGranularityTypeCode";
				definition = "Specifies the granularity of the frequency used for the reporting.";
				code_lazy = () -> Arrays.asList(FrequencyGranularityTypeCode.mmDaily, FrequencyGranularityTypeCode.mmEndOfMonth, FrequencyGranularityTypeCode.mmWeekly, FrequencyGranularityTypeCode.mmEndOfWeek,
						FrequencyGranularityTypeCode.mmEndOfDay, FrequencyGranularityTypeCode.mmMonthly, FrequencyGranularityTypeCode.mmQuarterly, FrequencyGranularityTypeCode.mmEndOfQuarter, FrequencyGranularityTypeCode.mmYearly,
						FrequencyGranularityTypeCode.mmSemiannually, FrequencyGranularityTypeCode.mmEndOfSemester, FrequencyGranularityTypeCode.mmEndOfFortnight, FrequencyGranularityTypeCode.mmFortnightly,
						FrequencyGranularityTypeCode.mmEndOfYear);
				derivation_lazy = () -> Arrays.asList(FrequencyGranularityType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}