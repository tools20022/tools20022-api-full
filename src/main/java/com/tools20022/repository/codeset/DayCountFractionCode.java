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
import com.tools20022.repository.codeset.DayCountFractionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the method used to compute accruing interest of a financial
 * instrument.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#IC30E3360orEurobondbasismodel3
 * DayCountFractionCode.IC30E3360orEurobondbasismodel3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#IC30360ICMAor30360basicrule
 * DayCountFractionCode.IC30360ICMAor30360basicrule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#ActualActualISDA
 * DayCountFractionCode.ActualActualISDA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#Actual360
 * DayCountFractionCode.Actual360}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#Actual365Fixed
 * DayCountFractionCode.Actual365Fixed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#ActualActualAFB
 * DayCountFractionCode.ActualActualAFB}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#IC30E360orEuroBondBasismodel1
 * DayCountFractionCode.IC30E360orEuroBondBasismodel1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode#ActualActualICMA
 * DayCountFractionCode.ActualActualICMA}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DayCountFractionCode#Other
 * DayCountFractionCode.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DayCountFraction1Code
 * DayCountFraction1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DayCountFractionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the method used to compute accruing interest of a financial instrument."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DayCountFractionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month. This
	 * means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a
	 * leap year) is assumed to be equivalent to a 30 Feb. It is a variation of
	 * the 30E/360 (or Eurobond basis) method where the last day of February is
	 * always assumed to be a 30th, even if it is the last day of the maturity
	 * coupon period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "30E-360"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E3360orEurobondbasismodel3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. It is a variation of the 30E/360 (or Eurobond basis) method where the last day of February is always assumed to be a 30th, even if it is the last day of the maturity coupon period."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode IC30E3360orEurobondbasismodel3 = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E3360orEurobondbasismodel3";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. It is a variation of the 30E/360 (or Eurobond basis) method where the last day of February is always assumed to be a 30th, even if it is the last day of the maturity coupon period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "30E-360";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month, except
	 * for February. This means that a 31st is assumed to be a 30th and the 28
	 * Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). It is
	 * the most commonly used 30/360 method for non-US straight and convertible
	 * bonds issued before 01/01/1999.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "360-360"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30360ICMAor30360basicrule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). It is the most commonly used 30/360 method for non-US straight and convertible bonds issued before 01/01/1999."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode IC30360ICMAor30360basicrule = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30360ICMAor30360basicrule";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month, except for February. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be a 28th (or 29th). It is the most commonly used 30/360 method for non-US straight and convertible bonds issued before 01/01/1999.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "360-360";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days of the interest period that fall (falling on a normal year,
	 * year) divided by 365, added to the actual number of days of the interest
	 * period that fall (falling on a leap year, year) divided by 366.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACT-365"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualISDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days of the interest period that fall (falling on a normal year, year) divided by 365, added to the actual number of days of the interest period that fall (falling on a leap year, year) divided by 366."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode ActualActualISDA = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualISDA";
			definition = "Method whereby interest is calculated based on the actual number of accrued days of the interest period that fall (falling on a normal year, year) divided by 365, added to the actual number of days of the interest period that fall (falling on a leap year, year) divided by 366.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "ACT-365";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days in the interest period and a 360-day year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACT-360"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual360"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 360-day year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode Actual360 = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual360";
			definition = "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 360-day year.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "ACT-360";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days in the interest period and a 365-day year.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AFI-365"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Actual365Fixed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 365-day year."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode Actual365Fixed = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Actual365Fixed";
			definition = "Method whereby interest is calculated based on the actual number of accrued days in the interest period and a 365-day year.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "AFI-365";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days and a 366-day year (if 29 Feb falls in the coupon period) or
	 * a 365-day year (if 29 Feb does not fall in the coupon period). If a
	 * coupon period is longer than one year, it is split by repetitively
	 * separating full year sub-periods counting backwards from the end of the
	 * coupon period (a year backwards from a 28 Feb being 29 Feb, if it
	 * exists). The first of the sub-periods starts on the start date of the
	 * accrued interest period and thus is possibly shorter than a year. Then
	 * the interest computation is operated separately on each sub-period and
	 * the intermediate results are summed up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXA-EXA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualAFB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days and a 366-day year (if 29 Feb falls in the coupon period) or a 365-day year (if 29 Feb does not fall in the coupon period). If a coupon period is longer than one year, it is split by repetitively separating full year sub-periods counting backwards from the end of the coupon period (a year backwards from a 28 Feb being 29 Feb, if it exists). The first of the sub-periods starts on the start date of the accrued interest period and thus is possibly shorter than a year. Then the interest computation is operated separately on each sub-period and the intermediate results are summed up."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode ActualActualAFB = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualAFB";
			definition = "Method whereby interest is calculated based on the actual number of accrued days and a 366-day year (if 29 Feb falls in the coupon period) or a 365-day year (if 29 Feb does not fall in the coupon period). If a coupon period is longer than one year, it is split by repetitively separating full year sub-periods counting backwards from the end of the coupon period (a year backwards from a 28 Feb being 29 Feb, if it exists). The first of the sub-periods starts on the start date of the accrued interest period and thus is possibly shorter than a year. Then the interest computation is operated separately on each sub-period and the intermediate results are summed up.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "EXA-EXA";
		}
	};
	/**
	 * Method whereby interest is calculated based on a 30-day month and a
	 * 360-day year. Accrued interest to a value date on the last day of a month
	 * shall be the same as to the 30th calendar day of the same month. This
	 * means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a
	 * leap year) is assumed to be equivalent to a 30 Feb. However, if the last
	 * day of the maturity coupon period is the last day of February, it will
	 * not be assumed to be a 30th. It is a variation of the 30/360 (ICMA)
	 * method commonly used for Eurobonds. The usage of this variation is only
	 * relevant when the coupon periods are scheduled to end on the last day of
	 * the month.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EBD-360"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IC30E360orEuroBondBasismodel1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. However, if the last day of the maturity coupon period is the last day of February, it will not be assumed to be a 30th. It is a variation of the 30/360 (ICMA) method commonly used for Eurobonds. The usage of this variation is only relevant when the coupon periods are scheduled to end on the last day of the month."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode IC30E360orEuroBondBasismodel1 = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IC30E360orEuroBondBasismodel1";
			definition = "Method whereby interest is calculated based on a 30-day month and a 360-day year. Accrued interest to a value date on the last day of a month shall be the same as to the 30th calendar day of the same month. This means that a 31st is assumed to be a 30th and the 28 Feb (or 29 Feb for a leap year) is assumed to be equivalent to a 30 Feb. However, if the last day of the maturity coupon period is the last day of February, it will not be assumed to be a 30th. It is a variation of the 30/360 (ICMA) method commonly used for Eurobonds. The usage of this variation is only relevant when the coupon periods are scheduled to end on the last day of the month.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "EBD-360";
		}
	};
	/**
	 * Method whereby interest is calculated based on the actual number of
	 * accrued days and the assumed number of days in a year, that is, the
	 * actual number of days in the coupon period multiplied by the number of
	 * interest payments in the year. If the coupon period is irregular (first
	 * or last coupon), it is extended or split into quasi interest periods that
	 * have the length of a regular coupon period and the computation is
	 * operated separately on each quasi interest period and the intermediate
	 * results are summed up.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICM-ACT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActualActualICMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method whereby interest is calculated based on the actual number of accrued days and the assumed number of days in a year, that is, the actual number of days in the coupon period multiplied by the number of interest payments in the year. If the coupon period is irregular (first or last coupon), it is extended or split into quasi interest periods that have the length of a regular coupon period and the computation is operated separately on each quasi interest period and the intermediate results are summed up."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode ActualActualICMA = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActualActualICMA";
			definition = "Method whereby interest is calculated based on the actual number of accrued days and the assumed number of days in a year, that is, the actual number of days in the coupon period multiplied by the number of interest payments in the year. If the coupon period is irregular (first or last coupon), it is extended or split into quasi interest periods that have the length of a regular coupon period and the computation is operated separately on each quasi interest period and the intermediate results are summed up.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "ICM-ACT";
		}
	};
	/**
	 * Other day count fraction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DayCountFractionCode
	 * DayCountFractionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other day count fraction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DayCountFractionCode Other = new DayCountFractionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other day count fraction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DayCountFractionCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, DayCountFractionCode> codesByName = new LinkedHashMap<>();

	protected DayCountFractionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DayCountFractionCode";
				definition = "Specifies the method used to compute accruing interest of a financial instrument.";
				derivation_lazy = () -> Arrays.asList(DayCountFraction1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DayCountFractionCode.IC30E3360orEurobondbasismodel3, com.tools20022.repository.codeset.DayCountFractionCode.IC30360ICMAor30360basicrule,
						com.tools20022.repository.codeset.DayCountFractionCode.ActualActualISDA, com.tools20022.repository.codeset.DayCountFractionCode.Actual360, com.tools20022.repository.codeset.DayCountFractionCode.Actual365Fixed,
						com.tools20022.repository.codeset.DayCountFractionCode.ActualActualAFB, com.tools20022.repository.codeset.DayCountFractionCode.IC30E360orEuroBondBasismodel1,
						com.tools20022.repository.codeset.DayCountFractionCode.ActualActualICMA, com.tools20022.repository.codeset.DayCountFractionCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(IC30E3360orEurobondbasismodel3.getCodeName().get(), IC30E3360orEurobondbasismodel3);
		codesByName.put(IC30360ICMAor30360basicrule.getCodeName().get(), IC30360ICMAor30360basicrule);
		codesByName.put(ActualActualISDA.getCodeName().get(), ActualActualISDA);
		codesByName.put(Actual360.getCodeName().get(), Actual360);
		codesByName.put(Actual365Fixed.getCodeName().get(), Actual365Fixed);
		codesByName.put(ActualActualAFB.getCodeName().get(), ActualActualAFB);
		codesByName.put(IC30E360orEuroBondBasismodel1.getCodeName().get(), IC30E360orEuroBondBasismodel1);
		codesByName.put(ActualActualICMA.getCodeName().get(), ActualActualICMA);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DayCountFractionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DayCountFractionCode[] values() {
		DayCountFractionCode[] values = new DayCountFractionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DayCountFractionCode> {
		@Override
		public DayCountFractionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DayCountFractionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}