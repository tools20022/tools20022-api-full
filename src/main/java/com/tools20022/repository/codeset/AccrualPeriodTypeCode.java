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
 * Specifies the type of the first accrual period for debt instruments compared
 * to the normal accrual period of the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmLongFirstPaymentPeriod
 * AccrualPeriodTypeCode.mmLongFirstPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmFirstRegularPaymentPeriod
 * AccrualPeriodTypeCode.mmFirstRegularPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmShortFirstPaymentperiod
 * AccrualPeriodTypeCode.mmShortFirstPaymentperiod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmFirstYearOfPayment
 * AccrualPeriodTypeCode.mmFirstYearOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmExtraLongPaymentPeriod
 * AccrualPeriodTypeCode.mmExtraLongPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmDefaultPeriod
 * AccrualPeriodTypeCode.mmDefaultPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#mmPaymentOmitted
 * AccrualPeriodTypeCode.mmPaymentOmitted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
 * AccrualPeriodType1Code}</li>
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
 * <li>"LONG"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccrualPeriodTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the first accrual period for debt instruments compared to the normal accrual period of the security."
 * </li>
 * </ul>
 */
public class AccrualPeriodTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Long first payment period is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LONG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongFirstPaymentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Long first payment period is applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmLongFirstPaymentPeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongFirstPaymentPeriod";
			definition = "Long first payment period is applicable.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "LONG";
		}
	};
	/**
	 * Regular first payment period is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstRegularPaymentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Regular first payment period is applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmFirstRegularPaymentPeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstRegularPaymentPeriod";
			definition = "Regular first payment period is applicable.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "FREG";
		}
	};
	/**
	 * Short first payment period is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHRT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortFirstPaymentperiod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Short first payment period is applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmShortFirstPaymentperiod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortFirstPaymentperiod";
			definition = "Short first payment period is applicable.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "SHRT";
		}
	};
	/**
	 * First year of payment is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "YEAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstYearOfPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "First year of payment is applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmFirstYearOfPayment = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstYearOfPayment";
			definition = "First year of payment is applicable.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "YEAR";
		}
	};
	/**
	 * Extra long payment period is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XLNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtraLongPaymentPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Extra long payment period is applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmExtraLongPaymentPeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraLongPaymentPeriod";
			definition = "Extra long payment period is applicable.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "XLNG";
		}
	};
	/**
	 * Default payment period is applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Default payment period is applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmDefaultPeriod = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultPeriod";
			definition = "Default payment period is applicable.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Payment is omitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
	 * AccrualPeriodTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOmitted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Payment is omitted."</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentOmitted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOmitted";
			definition = "Payment is omitted.";
			owner_lazy = () -> AccrualPeriodTypeCode.mmObject();
			codeName = "OMIT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("LONG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccrualPeriodTypeCode";
				definition = "Specifies the type of the first accrual period for debt instruments compared to the normal accrual period of the security.";
				code_lazy = () -> Arrays.asList(AccrualPeriodTypeCode.mmLongFirstPaymentPeriod, AccrualPeriodTypeCode.mmFirstRegularPaymentPeriod, AccrualPeriodTypeCode.mmShortFirstPaymentperiod, AccrualPeriodTypeCode.mmFirstYearOfPayment,
						AccrualPeriodTypeCode.mmExtraLongPaymentPeriod, AccrualPeriodTypeCode.mmDefaultPeriod, AccrualPeriodTypeCode.mmPaymentOmitted);
				derivation_lazy = () -> Arrays.asList(AccrualPeriodType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}