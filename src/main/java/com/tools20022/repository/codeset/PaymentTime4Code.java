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
import com.tools20022.repository.codeset.PaymentTime4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#PaymentOnReceiptOfInvoice
 * PaymentTime4Code.PaymentOnReceiptOfInvoice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#PaymentOnDelivery
 * PaymentTime4Code.PaymentOnDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterShipmentDate
 * PaymentTime4Code.EndOfPeriodAfterShipmentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterReceipt
 * PaymentTime4Code.EndOfPeriodAfterReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterPurchaseOrderDate
 * PaymentTime4Code.EndOfPeriodAfterPurchaseOrderDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterInvoiceDate
 * PaymentTime4Code.EndOfPeriodAfterInvoiceDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterEndOfReceiptMonth
 * PaymentTime4Code.EndOfPeriodAfterEndOfReceiptMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterEndOfDeliveryMonth
 * PaymentTime4Code.EndOfPeriodAfterEndOfDeliveryMonth}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterDelivery
 * PaymentTime4Code.EndOfPeriodAfterDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfPeriodAfterBaselineEstablishment
 * PaymentTime4Code.EndOfPeriodAfterBaselineEstablishment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfMonthOfReceipt
 * PaymentTime4Code.EndOfMonthOfReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code#EndOfMonthOfDelivery
 * PaymentTime4Code.EndOfMonthOfDelivery}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PaymentTime4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the payment conditions."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentTime4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnReceiptOfInvoice"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code PaymentOnReceiptOfInvoice = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnReceiptOfInvoice";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.PaymentOnReceiptOfInvoice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOnDelivery"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code PaymentOnDelivery = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOnDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.PaymentOnDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterShipmentDate"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterShipmentDate = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterShipmentDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterShipmentDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterReceipt"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterReceipt = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterPurchaseOrderDate"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterPurchaseOrderDate = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterPurchaseOrderDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterPurchaseOrderDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterInvoiceDate"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterInvoiceDate = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterInvoiceDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterInvoiceDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfReceiptMonth"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterEndOfReceiptMonth = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfReceiptMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterEndOfReceiptMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterEndOfDeliveryMonth"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterEndOfDeliveryMonth = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterEndOfDeliveryMonth";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterDelivery"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterDelivery = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfPeriodAfterBaselineEstablishment"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfPeriodAfterBaselineEstablishment = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfPeriodAfterBaselineEstablishment";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfPeriodAfterBaselineEstablishment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfReceipt"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfMonthOfReceipt = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfMonthOfReceipt.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentTime4Code
	 * PaymentTime4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfMonthOfDelivery"</li>
	 * </ul>
	 */
	public static final PaymentTime4Code EndOfMonthOfDelivery = new PaymentTime4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfMonthOfDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentTime4Code.mmObject();
			codeName = PaymentTimeCode.EndOfMonthOfDelivery.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentTime4Code> codesByName = new LinkedHashMap<>();

	protected PaymentTime4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentTime4Code";
				definition = "Specifies the payment conditions.";
				trace_lazy = () -> PaymentTimeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentTime4Code.PaymentOnReceiptOfInvoice, com.tools20022.repository.codeset.PaymentTime4Code.PaymentOnDelivery,
						com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterShipmentDate, com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterReceipt,
						com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterPurchaseOrderDate, com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterInvoiceDate,
						com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterEndOfReceiptMonth, com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterEndOfDeliveryMonth,
						com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterDelivery, com.tools20022.repository.codeset.PaymentTime4Code.EndOfPeriodAfterBaselineEstablishment,
						com.tools20022.repository.codeset.PaymentTime4Code.EndOfMonthOfReceipt, com.tools20022.repository.codeset.PaymentTime4Code.EndOfMonthOfDelivery);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PaymentOnReceiptOfInvoice.getCodeName().get(), PaymentOnReceiptOfInvoice);
		codesByName.put(PaymentOnDelivery.getCodeName().get(), PaymentOnDelivery);
		codesByName.put(EndOfPeriodAfterShipmentDate.getCodeName().get(), EndOfPeriodAfterShipmentDate);
		codesByName.put(EndOfPeriodAfterReceipt.getCodeName().get(), EndOfPeriodAfterReceipt);
		codesByName.put(EndOfPeriodAfterPurchaseOrderDate.getCodeName().get(), EndOfPeriodAfterPurchaseOrderDate);
		codesByName.put(EndOfPeriodAfterInvoiceDate.getCodeName().get(), EndOfPeriodAfterInvoiceDate);
		codesByName.put(EndOfPeriodAfterEndOfReceiptMonth.getCodeName().get(), EndOfPeriodAfterEndOfReceiptMonth);
		codesByName.put(EndOfPeriodAfterEndOfDeliveryMonth.getCodeName().get(), EndOfPeriodAfterEndOfDeliveryMonth);
		codesByName.put(EndOfPeriodAfterDelivery.getCodeName().get(), EndOfPeriodAfterDelivery);
		codesByName.put(EndOfPeriodAfterBaselineEstablishment.getCodeName().get(), EndOfPeriodAfterBaselineEstablishment);
		codesByName.put(EndOfMonthOfReceipt.getCodeName().get(), EndOfMonthOfReceipt);
		codesByName.put(EndOfMonthOfDelivery.getCodeName().get(), EndOfMonthOfDelivery);
	}

	public static PaymentTime4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentTime4Code[] values() {
		PaymentTime4Code[] values = new PaymentTime4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentTime4Code> {
		@Override
		public PaymentTime4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentTime4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}