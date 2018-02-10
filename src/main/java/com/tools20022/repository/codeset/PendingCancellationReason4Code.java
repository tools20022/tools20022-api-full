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
import com.tools20022.repository.codeset.PendingCancellationReason4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Standard code to specify
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code#AccountServicerDeadlineMissed
 * PendingCancellationReason4Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code#QuantityRejection
 * PendingCancellationReason4Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code#MarketDeadlineMissed
 * PendingCancellationReason4Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code#Other
 * PendingCancellationReason4Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonCode
 * RejectionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingCancellationReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Standard code to specify"</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingCancellationReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code
	 * PendingCancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingCancellationReason4Code AccountServicerDeadlineMissed = new PendingCancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingCancellationReason4Code.mmObject();
			codeName = RejectionReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code
	 * PendingCancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * </ul>
	 */
	public static final PendingCancellationReason4Code QuantityRejection = new PendingCancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingCancellationReason4Code.mmObject();
			codeName = RejectionReasonCode.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code
	 * PendingCancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingCancellationReason4Code MarketDeadlineMissed = new PendingCancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingCancellationReason4Code.mmObject();
			codeName = RejectionReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason4Code
	 * PendingCancellationReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingCancellationReason4Code Other = new PendingCancellationReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingCancellationReason4Code.mmObject();
			codeName = RejectionReasonCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingCancellationReason4Code> codesByName = new LinkedHashMap<>();

	protected PendingCancellationReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingCancellationReason4Code";
				definition = "Standard code to specify";
				trace_lazy = () -> RejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingCancellationReason4Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.PendingCancellationReason4Code.QuantityRejection,
						com.tools20022.repository.codeset.PendingCancellationReason4Code.MarketDeadlineMissed, com.tools20022.repository.codeset.PendingCancellationReason4Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static PendingCancellationReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingCancellationReason4Code[] values() {
		PendingCancellationReason4Code[] values = new PendingCancellationReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingCancellationReason4Code> {
		@Override
		public PendingCancellationReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingCancellationReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}