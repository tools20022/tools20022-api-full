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
import com.tools20022.repository.codeset.AccrualPeriodTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the first accrual period for debt instruments compared
 * to the normal accrual period of the security.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#LongFirstPaymentPeriod
 * AccrualPeriodTypeCode.LongFirstPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#FirstRegularPaymentPeriod
 * AccrualPeriodTypeCode.FirstRegularPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#ShortFirstPaymentperiod
 * AccrualPeriodTypeCode.ShortFirstPaymentperiod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#FirstYearOfPayment
 * AccrualPeriodTypeCode.FirstYearOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#ExtraLongPaymentPeriod
 * AccrualPeriodTypeCode.ExtraLongPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#DefaultPeriod
 * AccrualPeriodTypeCode.DefaultPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode#PaymentOmitted
 * AccrualPeriodTypeCode.PaymentOmitted}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccrualPeriodTypeCode extends MMCode {

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
	public static final AccrualPeriodTypeCode LongFirstPaymentPeriod = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongFirstPaymentPeriod";
			definition = "Long first payment period is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
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
	public static final AccrualPeriodTypeCode FirstRegularPaymentPeriod = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstRegularPaymentPeriod";
			definition = "Regular first payment period is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
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
	public static final AccrualPeriodTypeCode ShortFirstPaymentperiod = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortFirstPaymentperiod";
			definition = "Short first payment period is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
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
	public static final AccrualPeriodTypeCode FirstYearOfPayment = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstYearOfPayment";
			definition = "First year of payment is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
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
	public static final AccrualPeriodTypeCode ExtraLongPaymentPeriod = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraLongPaymentPeriod";
			definition = "Extra long payment period is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
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
	public static final AccrualPeriodTypeCode DefaultPeriod = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultPeriod";
			definition = "Default payment period is applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Payment has not been done.
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
	 * definition} = "Payment has not been done."</li>
	 * </ul>
	 */
	public static final AccrualPeriodTypeCode PaymentOmitted = new AccrualPeriodTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOmitted";
			definition = "Payment has not been done.";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodTypeCode.mmObject();
			codeName = "OMIT";
		}
	};
	final static private LinkedHashMap<String, AccrualPeriodTypeCode> codesByName = new LinkedHashMap<>();

	protected AccrualPeriodTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LONG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccrualPeriodTypeCode";
				definition = "Specifies the type of the first accrual period for debt instruments compared to the normal accrual period of the security.";
				derivation_lazy = () -> Arrays.asList(AccrualPeriodType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccrualPeriodTypeCode.LongFirstPaymentPeriod, com.tools20022.repository.codeset.AccrualPeriodTypeCode.FirstRegularPaymentPeriod,
						com.tools20022.repository.codeset.AccrualPeriodTypeCode.ShortFirstPaymentperiod, com.tools20022.repository.codeset.AccrualPeriodTypeCode.FirstYearOfPayment,
						com.tools20022.repository.codeset.AccrualPeriodTypeCode.ExtraLongPaymentPeriod, com.tools20022.repository.codeset.AccrualPeriodTypeCode.DefaultPeriod,
						com.tools20022.repository.codeset.AccrualPeriodTypeCode.PaymentOmitted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LongFirstPaymentPeriod.getCodeName().get(), LongFirstPaymentPeriod);
		codesByName.put(FirstRegularPaymentPeriod.getCodeName().get(), FirstRegularPaymentPeriod);
		codesByName.put(ShortFirstPaymentperiod.getCodeName().get(), ShortFirstPaymentperiod);
		codesByName.put(FirstYearOfPayment.getCodeName().get(), FirstYearOfPayment);
		codesByName.put(ExtraLongPaymentPeriod.getCodeName().get(), ExtraLongPaymentPeriod);
		codesByName.put(DefaultPeriod.getCodeName().get(), DefaultPeriod);
		codesByName.put(PaymentOmitted.getCodeName().get(), PaymentOmitted);
	}

	public static AccrualPeriodTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccrualPeriodTypeCode[] values() {
		AccrualPeriodTypeCode[] values = new AccrualPeriodTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccrualPeriodTypeCode> {
		@Override
		public AccrualPeriodTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccrualPeriodTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}