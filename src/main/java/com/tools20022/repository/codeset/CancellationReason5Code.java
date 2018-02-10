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
import com.tools20022.repository.codeset.CancellationReason5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#DuplicatePayment
 * CancellationReason5Code.DuplicatePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#IncorrectAgent
 * CancellationReason5Code.IncorrectAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#IncorrectCurrency
 * CancellationReason5Code.IncorrectCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#RequestedByCustomer
 * CancellationReason5Code.RequestedByCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#UnduePayment
 * CancellationReason5Code.UnduePayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#CancelUponUnableToApply
 * CancellationReason5Code.CancelUponUnableToApply}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#TechnicalProblem
 * CancellationReason5Code.TechnicalProblem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code#FraudulentOrigin
 * CancellationReason5Code.FraudulentOrigin}</li>
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
 * <li>"DUPL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancellationReason5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for requesting the cancellation of a payment instruction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancellationReason5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatePayment"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code DuplicatePayment = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.DuplicatePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAgent"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code IncorrectAgent = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.IncorrectAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCurrency"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code IncorrectCurrency = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.IncorrectCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedByCustomer"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code RequestedByCustomer = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedByCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.RequestedByCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnduePayment"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code UnduePayment = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnduePayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.UnduePayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelUponUnableToApply"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code CancelUponUnableToApply = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelUponUnableToApply";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.CancelUponUnableToApply.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TechnicalProblem"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code TechnicalProblem = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TechnicalProblem";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.TechnicalProblem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancellationReason5Code
	 * CancellationReason5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FraudulentOrigin"</li>
	 * </ul>
	 */
	public static final CancellationReason5Code FraudulentOrigin = new CancellationReason5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FraudulentOrigin";
			owner_lazy = () -> com.tools20022.repository.codeset.CancellationReason5Code.mmObject();
			codeName = CancellationReasonCode.FraudulentOrigin.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancellationReason5Code> codesByName = new LinkedHashMap<>();

	protected CancellationReason5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DUPL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancellationReason5Code";
				definition = "Specifies the reason for requesting the cancellation of a payment instruction.";
				trace_lazy = () -> CancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancellationReason5Code.DuplicatePayment, com.tools20022.repository.codeset.CancellationReason5Code.IncorrectAgent,
						com.tools20022.repository.codeset.CancellationReason5Code.IncorrectCurrency, com.tools20022.repository.codeset.CancellationReason5Code.RequestedByCustomer,
						com.tools20022.repository.codeset.CancellationReason5Code.UnduePayment, com.tools20022.repository.codeset.CancellationReason5Code.CancelUponUnableToApply,
						com.tools20022.repository.codeset.CancellationReason5Code.TechnicalProblem, com.tools20022.repository.codeset.CancellationReason5Code.FraudulentOrigin);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DuplicatePayment.getCodeName().get(), DuplicatePayment);
		codesByName.put(IncorrectAgent.getCodeName().get(), IncorrectAgent);
		codesByName.put(IncorrectCurrency.getCodeName().get(), IncorrectCurrency);
		codesByName.put(RequestedByCustomer.getCodeName().get(), RequestedByCustomer);
		codesByName.put(UnduePayment.getCodeName().get(), UnduePayment);
		codesByName.put(CancelUponUnableToApply.getCodeName().get(), CancelUponUnableToApply);
		codesByName.put(TechnicalProblem.getCodeName().get(), TechnicalProblem);
		codesByName.put(FraudulentOrigin.getCodeName().get(), FraudulentOrigin);
	}

	public static CancellationReason5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancellationReason5Code[] values() {
		CancellationReason5Code[] values = new CancellationReason5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancellationReason5Code> {
		@Override
		public CancellationReason5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancellationReason5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}