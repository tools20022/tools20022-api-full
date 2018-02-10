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
import com.tools20022.repository.codeset.PendingReason4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Standard code to specify the reason why the instruction/event has a pending
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code#NotDelivered
 * PendingReason4Code.NotDelivered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code#NoPayment
 * PendingReason4Code.NoPayment}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason4Code#Other
 * PendingReason4Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code#SentToTaxAuthorities
 * PendingReason4Code.SentToTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code#ValidForTaxAuthorities
 * PendingReason4Code.ValidForTaxAuthorities}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
 * PendingFailingReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NSEC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Standard code to specify the reason why the instruction/event has a pending status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code
	 * PendingReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDelivered"</li>
	 * </ul>
	 */
	public static final PendingReason4Code NotDelivered = new PendingReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDelivered";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason4Code.mmObject();
			codeName = PendingFailingReasonCode.NotDelivered.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code
	 * PendingReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPayment"</li>
	 * </ul>
	 */
	public static final PendingReason4Code NoPayment = new PendingReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason4Code.mmObject();
			codeName = PendingFailingReasonCode.NoPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code
	 * PendingReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingReason4Code Other = new PendingReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason4Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code
	 * PendingReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SentToTaxAuthorities"</li>
	 * </ul>
	 */
	public static final PendingReason4Code SentToTaxAuthorities = new PendingReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SentToTaxAuthorities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason4Code.mmObject();
			codeName = PendingFailingReasonCode.SentToTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason4Code
	 * PendingReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValidForTaxAuthorities"</li>
	 * </ul>
	 */
	public static final PendingReason4Code ValidForTaxAuthorities = new PendingReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValidForTaxAuthorities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason4Code.mmObject();
			codeName = PendingFailingReasonCode.ValidForTaxAuthorities.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingReason4Code> codesByName = new LinkedHashMap<>();

	protected PendingReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NSEC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingReason4Code";
				definition = "Standard code to specify the reason why the instruction/event has a pending status.";
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingReason4Code.NotDelivered, com.tools20022.repository.codeset.PendingReason4Code.NoPayment, com.tools20022.repository.codeset.PendingReason4Code.Other,
						com.tools20022.repository.codeset.PendingReason4Code.SentToTaxAuthorities, com.tools20022.repository.codeset.PendingReason4Code.ValidForTaxAuthorities);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NotDelivered.getCodeName().get(), NotDelivered);
		codesByName.put(NoPayment.getCodeName().get(), NoPayment);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(SentToTaxAuthorities.getCodeName().get(), SentToTaxAuthorities);
		codesByName.put(ValidForTaxAuthorities.getCodeName().get(), ValidForTaxAuthorities);
	}

	public static PendingReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingReason4Code[] values() {
		PendingReason4Code[] values = new PendingReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingReason4Code> {
		@Override
		public PendingReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}