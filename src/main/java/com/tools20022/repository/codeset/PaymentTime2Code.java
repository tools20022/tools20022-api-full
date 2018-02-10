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
import com.tools20022.repository.codeset.PaymentTime2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the payment conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#PaymentOnDelivery
 * PaymentTime2Code.PaymentOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfMonthOfDelivery
 * PaymentTime2Code.EndOfMonthOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfPeriodAfterDelivery
 * PaymentTime2Code.EndOfPeriodAfterDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfPeriodAfterEndOfDeliveryMonth
 * PaymentTime2Code.EndOfPeriodAfterEndOfDeliveryMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#PaymentOnReceiptOfInvoice
 * PaymentTime2Code.PaymentOnReceiptOfInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfPeriodAfterEndOfReceiptMonth
 * PaymentTime2Code.EndOfPeriodAfterEndOfReceiptMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfPeriodAfterReceipt
 * PaymentTime2Code.EndOfPeriodAfterReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfMonthOfReceipt
 * PaymentTime2Code.EndOfMonthOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code#EndOfPeriodAfterMatch
 * PaymentTime2Code.EndOfPeriodAfterMatch}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
 * PaymentTimeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTime2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment conditions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentTime2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnDelivery"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code PaymentOnDelivery = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.PaymentOnDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfDelivery"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfMonthOfDelivery = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfMonthOfDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterDelivery"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfPeriodAfterDelivery = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfDeliveryMonth"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfPeriodAfterEndOfDeliveryMonth = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnReceiptOfInvoice"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code PaymentOnReceiptOfInvoice = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.PaymentOnReceiptOfInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfReceiptMonth"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfPeriodAfterEndOfReceiptMonth = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterEndOfReceiptMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterReceipt"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfPeriodAfterReceipt = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfReceipt"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfMonthOfReceipt = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfMonthOfReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime2Code
	 * PaymentTime2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterMatch"</li>
	 * </ul>
	 */
	public static final PaymentTime2Code EndOfPeriodAfterMatch = new PaymentTime2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime2Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterMatch.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentTime2Code> codesByName = new LinkedHashMap<>();

	protected PaymentTime2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CASH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTime2Code";
				definition = "Specifies the payment conditions.";
				trace_lazy = () -> PaymentTimeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTime2Code.PaymentOnDelivery, com.tools20022.repository.codeset.PaymentTime2Code.EndOfMonthOfDelivery,
						com.tools20022.repository.codeset.PaymentTime2Code.EndOfPeriodAfterDelivery, com.tools20022.repository.codeset.PaymentTime2Code.EndOfPeriodAfterEndOfDeliveryMonth,
						com.tools20022.repository.codeset.PaymentTime2Code.PaymentOnReceiptOfInvoice, com.tools20022.repository.codeset.PaymentTime2Code.EndOfPeriodAfterEndOfReceiptMonth,
						com.tools20022.repository.codeset.PaymentTime2Code.EndOfPeriodAfterReceipt, com.tools20022.repository.codeset.PaymentTime2Code.EndOfMonthOfReceipt,
						com.tools20022.repository.codeset.PaymentTime2Code.EndOfPeriodAfterMatch);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PaymentOnDelivery.getCodeName().get(), PaymentOnDelivery);
		codesByName.put(EndOfMonthOfDelivery.getCodeName().get(), EndOfMonthOfDelivery);
		codesByName.put(EndOfPeriodAfterDelivery.getCodeName().get(), EndOfPeriodAfterDelivery);
		codesByName.put(EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().get(), EndOfPeriodAfterEndOfDeliveryMonth);
		codesByName.put(PaymentOnReceiptOfInvoice.getCodeName().get(), PaymentOnReceiptOfInvoice);
		codesByName.put(EndOfPeriodAfterEndOfReceiptMonth.getCodeName().get(), EndOfPeriodAfterEndOfReceiptMonth);
		codesByName.put(EndOfPeriodAfterReceipt.getCodeName().get(), EndOfPeriodAfterReceipt);
		codesByName.put(EndOfMonthOfReceipt.getCodeName().get(), EndOfMonthOfReceipt);
		codesByName.put(EndOfPeriodAfterMatch.getCodeName().get(), EndOfPeriodAfterMatch);
	}

	public static PaymentTime2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentTime2Code[] values() {
		PaymentTime2Code[] values = new PaymentTime2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentTime2Code> {
		@Override
		public PaymentTime2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentTime2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}