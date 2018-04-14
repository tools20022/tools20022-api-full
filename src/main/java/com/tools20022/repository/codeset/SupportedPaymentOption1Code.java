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
import com.tools20022.repository.codeset.SupportedPaymentOption1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code#PartialApproval
 * SupportedPaymentOption1Code.PartialApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code#PaymentApprovalOnly
 * SupportedPaymentOption1Code.PaymentApprovalOnly}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOptionCode
 * SupportedPaymentOptionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SupportedPaymentOption1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the options supported for a payment transaction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SupportedPaymentOption1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code
	 * SupportedPaymentOption1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SupportedPaymentOption1Code PartialApproval = new SupportedPaymentOption1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportedPaymentOption1Code.mmObject();
			codeName = SupportedPaymentOptionCode.PartialApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SupportedPaymentOption1Code
	 * SupportedPaymentOption1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentApprovalOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final SupportedPaymentOption1Code PaymentApprovalOnly = new SupportedPaymentOption1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentApprovalOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.SupportedPaymentOption1Code.mmObject();
			codeName = SupportedPaymentOptionCode.PaymentApprovalOnly.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SupportedPaymentOption1Code> codesByName = new LinkedHashMap<>();

	protected SupportedPaymentOption1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SupportedPaymentOption1Code";
				definition = "Specifies the options supported for a payment transaction.";
				trace_lazy = () -> SupportedPaymentOptionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SupportedPaymentOption1Code.PartialApproval, com.tools20022.repository.codeset.SupportedPaymentOption1Code.PaymentApprovalOnly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(PartialApproval.getCodeName().get(), PartialApproval);
		codesByName.put(PaymentApprovalOnly.getCodeName().get(), PaymentApprovalOnly);
	}

	public static SupportedPaymentOption1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SupportedPaymentOption1Code[] values() {
		SupportedPaymentOption1Code[] values = new SupportedPaymentOption1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SupportedPaymentOption1Code> {
		@Override
		public SupportedPaymentOption1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SupportedPaymentOption1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}