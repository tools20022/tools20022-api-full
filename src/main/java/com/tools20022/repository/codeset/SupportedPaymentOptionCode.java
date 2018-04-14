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
import com.tools20022.repository.codeset.SupportedPaymentOptionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the options supported for a payment transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOptionCode#PartialApproval
 * SupportedPaymentOptionCode.PartialApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOptionCode#PaymentApprovalOnly
 * SupportedPaymentOptionCode.PaymentApprovalOnly}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code
 * SupportedPaymentOption1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SupportedPaymentOptionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the options supported for a payment transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SupportedPaymentOptionCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The entity supports a partial approval of the payment transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOptionCode
	 * SupportedPaymentOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The entity supports a partial approval of the payment transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SupportedPaymentOptionCode PartialApproval = new SupportedPaymentOptionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialApproval";
			definition = "The entity supports a partial approval of the payment transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportedPaymentOptionCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * The entity supports the approval of the payment service along with the
	 * decline of additional requested services (as cash-back).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOptionCode
	 * SupportedPaymentOptionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSRV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentApprovalOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The entity supports the approval of the payment service along with the decline of additional requested services (as cash-back)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SupportedPaymentOptionCode PaymentApprovalOnly = new SupportedPaymentOptionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentApprovalOnly";
			definition = "The entity supports the approval of the payment service along with the decline of additional requested services (as cash-back).";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportedPaymentOptionCode.mmObject();
			codeName = "MSRV";
		}
	};
	final static private LinkedHashMap<String, SupportedPaymentOptionCode> codesByName = new LinkedHashMap<>();

	protected SupportedPaymentOptionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportedPaymentOptionCode";
				definition = "Specifies the options supported for a payment transaction.";
				derivation_lazy = () -> Arrays.asList(SupportedPaymentOption1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SupportedPaymentOptionCode.PartialApproval, com.tools20022.repository.codeset.SupportedPaymentOptionCode.PaymentApprovalOnly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialApproval.getCodeName().get(), PartialApproval);
		codesByName.put(PaymentApprovalOnly.getCodeName().get(), PaymentApprovalOnly);
	}

	public static SupportedPaymentOptionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SupportedPaymentOptionCode[] values() {
		SupportedPaymentOptionCode[] values = new SupportedPaymentOptionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SupportedPaymentOptionCode> {
		@Override
		public SupportedPaymentOptionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SupportedPaymentOptionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}