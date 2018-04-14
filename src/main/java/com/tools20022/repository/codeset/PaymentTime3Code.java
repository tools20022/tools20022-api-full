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
import com.tools20022.repository.codeset.PaymentTime3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfMonthOfDelivery
 * PaymentTime3Code.EndOfMonthOfDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfMonthOfReceipt
 * PaymentTime3Code.EndOfMonthOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterBaselineEstablishment
 * PaymentTime3Code.EndOfPeriodAfterBaselineEstablishment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterDelivery
 * PaymentTime3Code.EndOfPeriodAfterDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterEndOfDeliveryMonth
 * PaymentTime3Code.EndOfPeriodAfterEndOfDeliveryMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterEndOfReceiptMonth
 * PaymentTime3Code.EndOfPeriodAfterEndOfReceiptMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterInvoiceDate
 * PaymentTime3Code.EndOfPeriodAfterInvoiceDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterMatch
 * PaymentTime3Code.EndOfPeriodAfterMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterPurchaseOrderDate
 * PaymentTime3Code.EndOfPeriodAfterPurchaseOrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterReceipt
 * PaymentTime3Code.EndOfPeriodAfterReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#EndOfPeriodAfterShipmentDate
 * PaymentTime3Code.EndOfPeriodAfterShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#PaymentOnDelivery
 * PaymentTime3Code.PaymentOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code#PaymentOnReceiptOfInvoice
 * PaymentTime3Code.PaymentOnReceiptOfInvoice}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTime3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment conditions."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentTime3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfMonthOfDelivery = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfMonthOfDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfMonthOfReceipt = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfMonthOfReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterBaselineEstablishment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterBaselineEstablishment = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterBaselineEstablishment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterBaselineEstablishment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterDelivery = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfDeliveryMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterEndOfDeliveryMonth = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfReceiptMonth"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterEndOfReceiptMonth = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterEndOfReceiptMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterInvoiceDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterInvoiceDate = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterInvoiceDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterInvoiceDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterMatch = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterPurchaseOrderDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterPurchaseOrderDate = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterPurchaseOrderDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterPurchaseOrderDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterReceipt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterReceipt = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterShipmentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code EndOfPeriodAfterShipmentDate = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterShipmentDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterShipmentDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code PaymentOnDelivery = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.PaymentOnDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime3Code
	 * PaymentTime3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnReceiptOfInvoice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final PaymentTime3Code PaymentOnReceiptOfInvoice = new PaymentTime3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime3Code.mmObject();
			codeName = PaymentTimeCode.PaymentOnReceiptOfInvoice.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentTime3Code> codesByName = new LinkedHashMap<>();

	protected PaymentTime3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTime3Code";
				definition = "Specifies the payment conditions.";
				trace_lazy = () -> PaymentTimeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTime3Code.EndOfMonthOfDelivery, com.tools20022.repository.codeset.PaymentTime3Code.EndOfMonthOfReceipt,
						com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterBaselineEstablishment, com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterDelivery,
						com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterEndOfDeliveryMonth, com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterEndOfReceiptMonth,
						com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterInvoiceDate, com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterMatch,
						com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterPurchaseOrderDate, com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterReceipt,
						com.tools20022.repository.codeset.PaymentTime3Code.EndOfPeriodAfterShipmentDate, com.tools20022.repository.codeset.PaymentTime3Code.PaymentOnDelivery,
						com.tools20022.repository.codeset.PaymentTime3Code.PaymentOnReceiptOfInvoice);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(EndOfMonthOfDelivery.getCodeName().get(), EndOfMonthOfDelivery);
		codesByName.put(EndOfMonthOfReceipt.getCodeName().get(), EndOfMonthOfReceipt);
		codesByName.put(EndOfPeriodAfterBaselineEstablishment.getCodeName().get(), EndOfPeriodAfterBaselineEstablishment);
		codesByName.put(EndOfPeriodAfterDelivery.getCodeName().get(), EndOfPeriodAfterDelivery);
		codesByName.put(EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().get(), EndOfPeriodAfterEndOfDeliveryMonth);
		codesByName.put(EndOfPeriodAfterEndOfReceiptMonth.getCodeName().get(), EndOfPeriodAfterEndOfReceiptMonth);
		codesByName.put(EndOfPeriodAfterInvoiceDate.getCodeName().get(), EndOfPeriodAfterInvoiceDate);
		codesByName.put(EndOfPeriodAfterMatch.getCodeName().get(), EndOfPeriodAfterMatch);
		codesByName.put(EndOfPeriodAfterPurchaseOrderDate.getCodeName().get(), EndOfPeriodAfterPurchaseOrderDate);
		codesByName.put(EndOfPeriodAfterReceipt.getCodeName().get(), EndOfPeriodAfterReceipt);
		codesByName.put(EndOfPeriodAfterShipmentDate.getCodeName().get(), EndOfPeriodAfterShipmentDate);
		codesByName.put(PaymentOnDelivery.getCodeName().get(), PaymentOnDelivery);
		codesByName.put(PaymentOnReceiptOfInvoice.getCodeName().get(), PaymentOnReceiptOfInvoice);
	}

	public static PaymentTime3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentTime3Code[] values() {
		PaymentTime3Code[] values = new PaymentTime3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentTime3Code> {
		@Override
		public PaymentTime3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentTime3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}