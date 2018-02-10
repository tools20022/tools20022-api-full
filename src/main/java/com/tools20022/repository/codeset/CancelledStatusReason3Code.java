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
import com.tools20022.repository.codeset.CancelledStatusReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying reason for cancellation of the associated
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code#CancelledByTransferAgent
 * CancelledStatusReason3Code.CancelledByTransferAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code#CancelledByClient
 * CancelledStatusReason3Code.CancelledByClient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code#CancelledByIntermediary
 * CancelledStatusReason3Code.CancelledByIntermediary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonCode
 * CancelledStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CNTA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CancelledStatusReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for cancellation of the associated transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code
	 * CancelledStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByTransferAgent"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason3Code CancelledByTransferAgent = new CancelledStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByTransferAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason3Code.mmObject();
			codeName = CancelledStatusReasonCode.CancelledByTransferAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code
	 * CancelledStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByClient"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason3Code CancelledByClient = new CancelledStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByClient";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason3Code.mmObject();
			codeName = CancelledStatusReasonCode.CancelledByClient.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason3Code
	 * CancelledStatusReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIntermediary"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason3Code CancelledByIntermediary = new CancelledStatusReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByIntermediary";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason3Code.mmObject();
			codeName = CancelledStatusReasonCode.CancelledByIntermediary.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReason3Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CNTA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReason3Code";
				definition = "Specifies the underlying reason for cancellation of the associated transaction.";
				trace_lazy = () -> CancelledStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReason3Code.CancelledByTransferAgent, com.tools20022.repository.codeset.CancelledStatusReason3Code.CancelledByClient,
						com.tools20022.repository.codeset.CancelledStatusReason3Code.CancelledByIntermediary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByTransferAgent.getCodeName().get(), CancelledByTransferAgent);
		codesByName.put(CancelledByClient.getCodeName().get(), CancelledByClient);
		codesByName.put(CancelledByIntermediary.getCodeName().get(), CancelledByIntermediary);
	}

	public static CancelledStatusReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReason3Code[] values() {
		CancelledStatusReason3Code[] values = new CancelledStatusReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReason3Code> {
		@Override
		public CancelledStatusReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}