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
import com.tools20022.repository.codeset.CaseAssignmentRejection1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for not accepting a Case.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code#UnderlyingPaymentNotFound
 * CaseAssignmentRejection1Code.UnderlyingPaymentNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code#NotAuthorisedToInvestigate
 * CaseAssignmentRejection1Code.NotAuthorisedToInvestigate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code#UnknownCase
 * CaseAssignmentRejection1Code.UnknownCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code#PaymentRejected
 * CaseAssignmentRejection1Code.PaymentRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code#PaymentCancelled
 * CaseAssignmentRejection1Code.PaymentCancelled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejectionCode
 * CaseAssignmentRejectionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NFND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CaseAssignmentRejection1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for not accepting a Case."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CaseAssignmentRejection1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code
	 * CaseAssignmentRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingPaymentNotFound"</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejection1Code UnderlyingPaymentNotFound = new CaseAssignmentRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingPaymentNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejection1Code.mmObject();
			codeName = CaseAssignmentRejectionCode.UnderlyingPaymentNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code
	 * CaseAssignmentRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorisedToInvestigate"</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejection1Code NotAuthorisedToInvestigate = new CaseAssignmentRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorisedToInvestigate";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejection1Code.mmObject();
			codeName = CaseAssignmentRejectionCode.NotAuthorisedToInvestigate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code
	 * CaseAssignmentRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCase"</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejection1Code UnknownCase = new CaseAssignmentRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownCase";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejection1Code.mmObject();
			codeName = CaseAssignmentRejectionCode.UnknownCase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code
	 * CaseAssignmentRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentRejected"</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejection1Code PaymentRejected = new CaseAssignmentRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejection1Code.mmObject();
			codeName = CaseAssignmentRejectionCode.PaymentRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CaseAssignmentRejection1Code
	 * CaseAssignmentRejection1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCancelled"</li>
	 * </ul>
	 */
	public static final CaseAssignmentRejection1Code PaymentCancelled = new CaseAssignmentRejection1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.CaseAssignmentRejection1Code.mmObject();
			codeName = CaseAssignmentRejectionCode.PaymentCancelled.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CaseAssignmentRejection1Code> codesByName = new LinkedHashMap<>();

	protected CaseAssignmentRejection1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NFND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CaseAssignmentRejection1Code";
				definition = "Specifies the reason for not accepting a Case.";
				trace_lazy = () -> CaseAssignmentRejectionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CaseAssignmentRejection1Code.UnderlyingPaymentNotFound, com.tools20022.repository.codeset.CaseAssignmentRejection1Code.NotAuthorisedToInvestigate,
						com.tools20022.repository.codeset.CaseAssignmentRejection1Code.UnknownCase, com.tools20022.repository.codeset.CaseAssignmentRejection1Code.PaymentRejected,
						com.tools20022.repository.codeset.CaseAssignmentRejection1Code.PaymentCancelled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnderlyingPaymentNotFound.getCodeName().get(), UnderlyingPaymentNotFound);
		codesByName.put(NotAuthorisedToInvestigate.getCodeName().get(), NotAuthorisedToInvestigate);
		codesByName.put(UnknownCase.getCodeName().get(), UnknownCase);
		codesByName.put(PaymentRejected.getCodeName().get(), PaymentRejected);
		codesByName.put(PaymentCancelled.getCodeName().get(), PaymentCancelled);
	}

	public static CaseAssignmentRejection1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CaseAssignmentRejection1Code[] values() {
		CaseAssignmentRejection1Code[] values = new CaseAssignmentRejection1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CaseAssignmentRejection1Code> {
		@Override
		public CaseAssignmentRejection1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CaseAssignmentRejection1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}