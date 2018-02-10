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
import com.tools20022.repository.codeset.FailureReason8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Exception occurring outside the service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#CardRetained
 * FailureReason8Code.CardRetained}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#CardCaptured
 * FailureReason8Code.CardCaptured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#CustomerCancel
 * FailureReason8Code.CustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#ForgottenCard
 * FailureReason8Code.ForgottenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#Malfunction
 * FailureReason8Code.Malfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#SecurityError
 * FailureReason8Code.SecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#SuspectedFraud
 * FailureReason8Code.SuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code#UnableToCapture
 * FailureReason8Code.UnableToCapture}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FailureReasonCode
 * FailureReasonCode}</li>
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
 * "FailureReason8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Exception occurring outside the service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FailureReason8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRetained"</li>
	 * </ul>
	 */
	public static final FailureReason8Code CardRetained = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.CardRetained.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardCaptured"</li>
	 * </ul>
	 */
	public static final FailureReason8Code CardCaptured = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardCaptured";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.CardCaptured.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * </ul>
	 */
	public static final FailureReason8Code CustomerCancel = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.CustomerCancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForgottenCard"</li>
	 * </ul>
	 */
	public static final FailureReason8Code ForgottenCard = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForgottenCard";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.ForgottenCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * </ul>
	 */
	public static final FailureReason8Code Malfunction = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.Malfunction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityError"</li>
	 * </ul>
	 */
	public static final FailureReason8Code SecurityError = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityError";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.SecurityError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * </ul>
	 */
	public static final FailureReason8Code SuspectedFraud = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.SuspectedFraud.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailureReason8Code
	 * FailureReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToCapture"</li>
	 * </ul>
	 */
	public static final FailureReason8Code UnableToCapture = new FailureReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToCapture";
			owner_lazy = () -> com.tools20022.repository.codeset.FailureReason8Code.mmObject();
			codeName = FailureReasonCode.UnableToCapture.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FailureReason8Code> codesByName = new LinkedHashMap<>();

	protected FailureReason8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailureReason8Code";
				definition = "Exception occurring outside the service.";
				trace_lazy = () -> FailureReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailureReason8Code.CardRetained, com.tools20022.repository.codeset.FailureReason8Code.CardCaptured,
						com.tools20022.repository.codeset.FailureReason8Code.CustomerCancel, com.tools20022.repository.codeset.FailureReason8Code.ForgottenCard, com.tools20022.repository.codeset.FailureReason8Code.Malfunction,
						com.tools20022.repository.codeset.FailureReason8Code.SecurityError, com.tools20022.repository.codeset.FailureReason8Code.SuspectedFraud, com.tools20022.repository.codeset.FailureReason8Code.UnableToCapture);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardRetained.getCodeName().get(), CardRetained);
		codesByName.put(CardCaptured.getCodeName().get(), CardCaptured);
		codesByName.put(CustomerCancel.getCodeName().get(), CustomerCancel);
		codesByName.put(ForgottenCard.getCodeName().get(), ForgottenCard);
		codesByName.put(Malfunction.getCodeName().get(), Malfunction);
		codesByName.put(SecurityError.getCodeName().get(), SecurityError);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(UnableToCapture.getCodeName().get(), UnableToCapture);
	}

	public static FailureReason8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FailureReason8Code[] values() {
		FailureReason8Code[] values = new FailureReason8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FailureReason8Code> {
		@Override
		public FailureReason8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FailureReason8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}