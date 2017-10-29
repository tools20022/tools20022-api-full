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
import com.tools20022.repository.codeset.PrePaymentSpeedCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Speed of unscheduled partial of complete payment of the principal amount
 * outstanding on a debt obligation before its due date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeedCode
 * PrePaymentSpeedCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#SingleMonthlyMortality
 * PrePaymentSpeed1Code.SingleMonthlyMortality}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#ConstantPrePaymentRate
 * PrePaymentSpeed1Code.ConstantPrePaymentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#AbsolutePrePaymentSpeed
 * PrePaymentSpeed1Code.AbsolutePrePaymentSpeed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#MonthlyPrePaymentRate
 * PrePaymentSpeed1Code.MonthlyPrePaymentRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#HomeEquityPrePaymentCurve
 * PrePaymentSpeed1Code.HomeEquityPrePaymentCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#BMAPrePaymentCurve
 * PrePaymentSpeed1Code.BMAPrePaymentCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#ProspectusPrePaymentCurve
 * PrePaymentSpeed1Code.ProspectusPrePaymentCurve}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code#ManufacturedHousingPrePaymentCurve
 * PrePaymentSpeed1Code.ManufacturedHousingPrePaymentCurve}</li>
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
 * <li>"SIMM"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PrePaymentSpeed1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Speed of unscheduled partial of complete payment of the principal amount outstanding on a debt obligation before its due date."
 * </li>
 * </ul>
 */
public class PrePaymentSpeed1Code extends PrePaymentSpeedCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleMonthlyMortality"</li>
	 * </ul>
	 */
	public static final MMCode SingleMonthlyMortality = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleMonthlyMortality";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConstantPrePaymentRate"</li>
	 * </ul>
	 */
	public static final MMCode ConstantPrePaymentRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConstantPrePaymentRate";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AbsolutePrePaymentSpeed"</li>
	 * </ul>
	 */
	public static final MMCode AbsolutePrePaymentSpeed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AbsolutePrePaymentSpeed";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonthlyPrePaymentRate"</li>
	 * </ul>
	 */
	public static final MMCode MonthlyPrePaymentRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonthlyPrePaymentRate";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HomeEquityPrePaymentCurve"</li>
	 * </ul>
	 */
	public static final MMCode HomeEquityPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HomeEquityPrePaymentCurve";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BMAPrePaymentCurve"</li>
	 * </ul>
	 */
	public static final MMCode BMAPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BMAPrePaymentCurve";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProspectusPrePaymentCurve"</li>
	 * </ul>
	 */
	public static final MMCode ProspectusPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProspectusPrePaymentCurve";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PrePaymentSpeed1Code
	 * PrePaymentSpeed1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManufacturedHousingPrePaymentCurve"</li>
	 * </ul>
	 */
	public static final MMCode ManufacturedHousingPrePaymentCurve = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManufacturedHousingPrePaymentCurve";
			owner_lazy = () -> PrePaymentSpeed1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("SIMM");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PrePaymentSpeed1Code";
				definition = "Speed of unscheduled partial of complete payment of the principal amount outstanding on a debt obligation before its due date.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PrePaymentSpeed1Code.SingleMonthlyMortality, com.tools20022.repository.codeset.PrePaymentSpeed1Code.ConstantPrePaymentRate,
						com.tools20022.repository.codeset.PrePaymentSpeed1Code.AbsolutePrePaymentSpeed, com.tools20022.repository.codeset.PrePaymentSpeed1Code.MonthlyPrePaymentRate,
						com.tools20022.repository.codeset.PrePaymentSpeed1Code.HomeEquityPrePaymentCurve, com.tools20022.repository.codeset.PrePaymentSpeed1Code.BMAPrePaymentCurve,
						com.tools20022.repository.codeset.PrePaymentSpeed1Code.ProspectusPrePaymentCurve, com.tools20022.repository.codeset.PrePaymentSpeed1Code.ManufacturedHousingPrePaymentCurve);
				trace_lazy = () -> PrePaymentSpeedCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}