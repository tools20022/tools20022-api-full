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
import com.tools20022.repository.codeset.CorporateActionReversalReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * The reason why a reversal of payment is taking place in corporate action
 * processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#DayCountBasisDifference
 * CorporateActionReversalReason1Code.DayCountBasisDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#IncorrectValueDate
 * CorporateActionReversalReason1Code.IncorrectValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#IncorrectRecordDate
 * CorporateActionReversalReason1Code.IncorrectRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#IncorrectPrice
 * CorporateActionReversalReason1Code.IncorrectPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#UnduePayment
 * CorporateActionReversalReason1Code.UnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#IncorrectEventLevelTaxRate
 * CorporateActionReversalReason1Code.IncorrectEventLevelTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#FundsNotReceived
 * CorporateActionReversalReason1Code.FundsNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#PaymentOutsideClearingSystem
 * CorporateActionReversalReason1Code.PaymentOutsideClearingSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code#IncorrectPaymentCurrency
 * CorporateActionReversalReason1Code.IncorrectPaymentCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReasonCode
 * CorporateActionReversalReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DCBD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionReversalReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The reason why a reversal of payment is taking place in corporate action processing."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionReversalReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasisDifference"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code DayCountBasisDifference = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasisDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.DayCountBasisDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectValueDate"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code IncorrectValueDate = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectValueDate";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.IncorrectValueDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectRecordDate"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code IncorrectRecordDate = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectRecordDate";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.IncorrectRecordDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPrice"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code IncorrectPrice = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.IncorrectPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code UnduePayment = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.UnduePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectEventLevelTaxRate"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code IncorrectEventLevelTaxRate = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectEventLevelTaxRate";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.IncorrectEventLevelTaxRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundsNotReceived"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code FundsNotReceived = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundsNotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.FundsNotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOutsideClearingSystem"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code PaymentOutsideClearingSystem = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOutsideClearingSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.PaymentOutsideClearingSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionReversalReason1Code
	 * CorporateActionReversalReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectPaymentCurrency"</li>
	 * </ul>
	 */
	public static final CorporateActionReversalReason1Code IncorrectPaymentCurrency = new CorporateActionReversalReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectPaymentCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionReversalReason1Code.mmObject();
			codeName = CorporateActionReversalReasonCode.IncorrectPaymentCurrency.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionReversalReason1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionReversalReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DCBD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionReversalReason1Code";
				definition = "The reason why a reversal of payment is taking place in corporate action processing.";
				trace_lazy = () -> CorporateActionReversalReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionReversalReason1Code.DayCountBasisDifference, com.tools20022.repository.codeset.CorporateActionReversalReason1Code.IncorrectValueDate,
						com.tools20022.repository.codeset.CorporateActionReversalReason1Code.IncorrectRecordDate, com.tools20022.repository.codeset.CorporateActionReversalReason1Code.IncorrectPrice,
						com.tools20022.repository.codeset.CorporateActionReversalReason1Code.UnduePayment, com.tools20022.repository.codeset.CorporateActionReversalReason1Code.IncorrectEventLevelTaxRate,
						com.tools20022.repository.codeset.CorporateActionReversalReason1Code.FundsNotReceived, com.tools20022.repository.codeset.CorporateActionReversalReason1Code.PaymentOutsideClearingSystem,
						com.tools20022.repository.codeset.CorporateActionReversalReason1Code.IncorrectPaymentCurrency);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DayCountBasisDifference.getCodeName().get(), DayCountBasisDifference);
		codesByName.put(IncorrectValueDate.getCodeName().get(), IncorrectValueDate);
		codesByName.put(IncorrectRecordDate.getCodeName().get(), IncorrectRecordDate);
		codesByName.put(IncorrectPrice.getCodeName().get(), IncorrectPrice);
		codesByName.put(UnduePayment.getCodeName().get(), UnduePayment);
		codesByName.put(IncorrectEventLevelTaxRate.getCodeName().get(), IncorrectEventLevelTaxRate);
		codesByName.put(FundsNotReceived.getCodeName().get(), FundsNotReceived);
		codesByName.put(PaymentOutsideClearingSystem.getCodeName().get(), PaymentOutsideClearingSystem);
		codesByName.put(IncorrectPaymentCurrency.getCodeName().get(), IncorrectPaymentCurrency);
	}

	public static CorporateActionReversalReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionReversalReason1Code[] values() {
		CorporateActionReversalReason1Code[] values = new CorporateActionReversalReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionReversalReason1Code> {
		@Override
		public CorporateActionReversalReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionReversalReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}