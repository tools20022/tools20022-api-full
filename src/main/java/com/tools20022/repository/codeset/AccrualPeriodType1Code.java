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
import com.tools20022.repository.codeset.AccrualPeriodType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#LongFirstPaymentPeriod
 * AccrualPeriodType1Code.LongFirstPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#FirstRegularPaymentPeriod
 * AccrualPeriodType1Code.FirstRegularPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#ShortFirstPaymentperiod
 * AccrualPeriodType1Code.ShortFirstPaymentperiod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#FirstYearOfPayment
 * AccrualPeriodType1Code.FirstYearOfPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#ExtraLongPaymentPeriod
 * AccrualPeriodType1Code.ExtraLongPaymentPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#DefaultPeriod
 * AccrualPeriodType1Code.DefaultPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code#PaymentOmitted
 * AccrualPeriodType1Code.PaymentOmitted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodTypeCode
 * AccrualPeriodTypeCode}</li>
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
 * "AccrualPeriodType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of the first accrual period for debt instruments compared to the normal accrual period of the security."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class AccrualPeriodType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongFirstPaymentPeriod"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code LongFirstPaymentPeriod = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongFirstPaymentPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.LongFirstPaymentPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstRegularPaymentPeriod"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code FirstRegularPaymentPeriod = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstRegularPaymentPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.FirstRegularPaymentPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShortFirstPaymentperiod"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code ShortFirstPaymentperiod = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShortFirstPaymentperiod";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.ShortFirstPaymentperiod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstYearOfPayment"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code FirstYearOfPayment = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstYearOfPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.FirstYearOfPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtraLongPaymentPeriod"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code ExtraLongPaymentPeriod = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraLongPaymentPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.ExtraLongPaymentPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultPeriod"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code DefaultPeriod = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultPeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.DefaultPeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.AccrualPeriodType1Code
	 * AccrualPeriodType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOmitted"</li>
	 * </ul>
	 */
	public static final AccrualPeriodType1Code PaymentOmitted = new AccrualPeriodType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOmitted";
			owner_lazy = () -> com.tools20022.repository.codeset.AccrualPeriodType1Code.mmObject();
			codeName = AccrualPeriodTypeCode.PaymentOmitted.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, AccrualPeriodType1Code> codesByName = new LinkedHashMap<>();

	protected AccrualPeriodType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LONG");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccrualPeriodType1Code";
				definition = "Specifies the type of the first accrual period for debt instruments compared to the normal accrual period of the security.";
				trace_lazy = () -> AccrualPeriodTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.AccrualPeriodType1Code.LongFirstPaymentPeriod, com.tools20022.repository.codeset.AccrualPeriodType1Code.FirstRegularPaymentPeriod,
						com.tools20022.repository.codeset.AccrualPeriodType1Code.ShortFirstPaymentperiod, com.tools20022.repository.codeset.AccrualPeriodType1Code.FirstYearOfPayment,
						com.tools20022.repository.codeset.AccrualPeriodType1Code.ExtraLongPaymentPeriod, com.tools20022.repository.codeset.AccrualPeriodType1Code.DefaultPeriod,
						com.tools20022.repository.codeset.AccrualPeriodType1Code.PaymentOmitted);
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

	public static AccrualPeriodType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static AccrualPeriodType1Code[] values() {
		AccrualPeriodType1Code[] values = new AccrualPeriodType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, AccrualPeriodType1Code> {
		@Override
		public AccrualPeriodType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(AccrualPeriodType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}