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
import com.tools20022.repository.codeset.PaymentTimeCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the payment conditions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentTimeCode
 * PaymentTimeCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmPaymentOnDelivery
 * PaymentTime1Code.mmPaymentOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmEndOfMonthOfDelivery
 * PaymentTime1Code.mmEndOfMonthOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmEndOfPeriodAfterDelivery
 * PaymentTime1Code.mmEndOfPeriodAfterDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmEndOfPeriodAfterEndOfDeliveryMonth
 * PaymentTime1Code.mmEndOfPeriodAfterEndOfDeliveryMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmPaymentOnReceiptOfInvoice
 * PaymentTime1Code.mmPaymentOnReceiptOfInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmEndOfPeriodAfterEndOfReceiptMonth
 * PaymentTime1Code.mmEndOfPeriodAfterEndOfReceiptMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmEndOfPeriodAfterReceipt
 * PaymentTime1Code.mmEndOfPeriodAfterReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code#mmEndOfMonthOfReceipt
 * PaymentTime1Code.mmEndOfMonthOfReceipt}</li>
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
 * <li>"CASH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTime1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment conditions."</li>
 * </ul>
 */
public class PaymentTime1Code extends PaymentTimeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnDelivery"</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentOnDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfDelivery"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfMonthOfDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterDelivery"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfPeriodAfterDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfDeliveryMonth"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfPeriodAfterEndOfDeliveryMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnReceiptOfInvoice"</li>
	 * </ul>
	 */
	public static final MMCode mmPaymentOnReceiptOfInvoice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfReceiptMonth"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfPeriodAfterEndOfReceiptMonth = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfPeriodAfterReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime1Code
	 * PaymentTime1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmEndOfMonthOfReceipt = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			owner_lazy = () -> PaymentTime1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CASH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "PaymentTime1Code";
				definition = "Specifies the payment conditions.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTime1Code.mmPaymentOnDelivery, com.tools20022.repository.codeset.PaymentTime1Code.mmEndOfMonthOfDelivery,
						com.tools20022.repository.codeset.PaymentTime1Code.mmEndOfPeriodAfterDelivery, com.tools20022.repository.codeset.PaymentTime1Code.mmEndOfPeriodAfterEndOfDeliveryMonth,
						com.tools20022.repository.codeset.PaymentTime1Code.mmPaymentOnReceiptOfInvoice, com.tools20022.repository.codeset.PaymentTime1Code.mmEndOfPeriodAfterEndOfReceiptMonth,
						com.tools20022.repository.codeset.PaymentTime1Code.mmEndOfPeriodAfterReceipt, com.tools20022.repository.codeset.PaymentTime1Code.mmEndOfMonthOfReceipt);
				trace_lazy = () -> PaymentTimeCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}