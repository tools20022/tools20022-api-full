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
import com.tools20022.repository.codeset.CancellationReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for requesting the cancellation of a payment
 * instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#RequestedByCustomer
 * CancellationReason3Code.RequestedByCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#DuplicatePayment
 * CancellationReason3Code.DuplicatePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#IncorrectAgent
 * CancellationReason3Code.IncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#IncorrectCurrency
 * CancellationReason3Code.IncorrectCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#UnduePayment
 * CancellationReason3Code.UnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#InsufficientDebtorDetails
 * CancellationReason3Code.InsufficientDebtorDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code#InsufficientCreditorDetails
 * CancellationReason3Code.InsufficientCreditorDetails}</li>
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
 * "CancellationReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for requesting the cancellation of a payment instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedByCustomer"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code RequestedByCustomer = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.RequestedByCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatePayment"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code DuplicatePayment = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.DuplicatePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code IncorrectAgent = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.IncorrectAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCurrency"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code IncorrectCurrency = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.IncorrectCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code UnduePayment = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.UnduePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientDebtorDetails"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code InsufficientDebtorDetails = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientDebtorDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.InsufficientDebtorDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason3Code
	 * CancellationReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCreditorDetails"</li>
	 * </ul>
	 */
	public static final CancellationReason3Code InsufficientCreditorDetails = new CancellationReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCreditorDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason3Code.mmObject();
			codeName = CancellationReasonCode.InsufficientCreditorDetails.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancellationReason3Code> codesByName = new LinkedHashMap<>();

	protected CancellationReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CUST");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationReason3Code";
				definition = "Specifies the reason for requesting the cancellation of a payment instruction.";
				trace_lazy = () -> CancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationReason3Code.RequestedByCustomer, com.tools20022.repository.codeset.CancellationReason3Code.DuplicatePayment,
						com.tools20022.repository.codeset.CancellationReason3Code.IncorrectAgent, com.tools20022.repository.codeset.CancellationReason3Code.IncorrectCurrency,
						com.tools20022.repository.codeset.CancellationReason3Code.UnduePayment, com.tools20022.repository.codeset.CancellationReason3Code.InsufficientDebtorDetails,
						com.tools20022.repository.codeset.CancellationReason3Code.InsufficientCreditorDetails);
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
		codesByName.put(InsufficientDebtorDetails.getCodeName().get(), InsufficientDebtorDetails);
		codesByName.put(InsufficientCreditorDetails.getCodeName().get(), InsufficientCreditorDetails);
	}

	public static CancellationReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationReason3Code[] values() {
		CancellationReason3Code[] values = new CancellationReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationReason3Code> {
		@Override
		public CancellationReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}