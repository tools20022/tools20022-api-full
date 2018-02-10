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
import com.tools20022.repository.codeset.CancellationReason4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for the request to cancel a payment instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code#RequestedByCustomer
 * CancellationReason4Code.RequestedByCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code#DuplicatePayment
 * CancellationReason4Code.DuplicatePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code#IncorrectAgent
 * CancellationReason4Code.IncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code#IncorrectCurrency
 * CancellationReason4Code.IncorrectCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code#UnduePayment
 * CancellationReason4Code.UnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code#CancelUponUnableToApply
 * CancellationReason4Code.CancelUponUnableToApply}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancellationReasonCode
 * CancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CUST"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for the request to cancel a payment instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code
	 * CancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedByCustomer"</li>
	 * </ul>
	 */
	public static final CancellationReason4Code RequestedByCustomer = new CancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason4Code.mmObject();
			codeName = CancellationReasonCode.RequestedByCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code
	 * CancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatePayment"</li>
	 * </ul>
	 */
	public static final CancellationReason4Code DuplicatePayment = new CancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason4Code.mmObject();
			codeName = CancellationReasonCode.DuplicatePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code
	 * CancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * </ul>
	 */
	public static final CancellationReason4Code IncorrectAgent = new CancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason4Code.mmObject();
			codeName = CancellationReasonCode.IncorrectAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code
	 * CancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCurrency"</li>
	 * </ul>
	 */
	public static final CancellationReason4Code IncorrectCurrency = new CancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason4Code.mmObject();
			codeName = CancellationReasonCode.IncorrectCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code
	 * CancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * </ul>
	 */
	public static final CancellationReason4Code UnduePayment = new CancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason4Code.mmObject();
			codeName = CancellationReasonCode.UnduePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason4Code
	 * CancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUponUnableToApply"</li>
	 * </ul>
	 */
	public static final CancellationReason4Code CancelUponUnableToApply = new CancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUponUnableToApply";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason4Code.mmObject();
			codeName = CancellationReasonCode.CancelUponUnableToApply.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancellationReason4Code> codesByName = new LinkedHashMap<>();

	protected CancellationReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationReason4Code";
				definition = "Specifies the reason for the request to cancel a payment instruction.";
				trace_lazy = () -> CancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationReason4Code.RequestedByCustomer, com.tools20022.repository.codeset.CancellationReason4Code.DuplicatePayment,
						com.tools20022.repository.codeset.CancellationReason4Code.IncorrectAgent, com.tools20022.repository.codeset.CancellationReason4Code.IncorrectCurrency,
						com.tools20022.repository.codeset.CancellationReason4Code.UnduePayment, com.tools20022.repository.codeset.CancellationReason4Code.CancelUponUnableToApply);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RequestedByCustomer.getCodeName().get(), RequestedByCustomer);
		codesByName.put(DuplicatePayment.getCodeName().get(), DuplicatePayment);
		codesByName.put(IncorrectAgent.getCodeName().get(), IncorrectAgent);
		codesByName.put(IncorrectCurrency.getCodeName().get(), IncorrectCurrency);
		codesByName.put(UnduePayment.getCodeName().get(), UnduePayment);
		codesByName.put(CancelUponUnableToApply.getCodeName().get(), CancelUponUnableToApply);
	}

	public static CancellationReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationReason4Code[] values() {
		CancellationReason4Code[] values = new CancellationReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationReason4Code> {
		@Override
		public CancellationReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}