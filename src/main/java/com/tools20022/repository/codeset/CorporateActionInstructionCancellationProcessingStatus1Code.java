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
import com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a corporate action instruction cancellation process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code#CancellationCompleted
 * CorporateActionInstructionCancellationProcessingStatus1Code.
 * CancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code#PendingCancellation
 * CorporateActionInstructionCancellationProcessingStatus1Code.
 * PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code#Accepted
 * CorporateActionInstructionCancellationProcessingStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code#Rejected
 * CorporateActionInstructionCancellationProcessingStatus1Code.Rejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatusCode
 * CorporateActionInstructionCancellationProcessingStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionInstructionCancellationProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a corporate action instruction cancellation process."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionInstructionCancellationProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code
	 * CorporateActionInstructionCancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatus1Code CancellationCompleted = new CorporateActionInstructionCancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.mmObject();
			codeName = CorporateActionInstructionCancellationProcessingStatusCode.CancellationCompleted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code
	 * CorporateActionInstructionCancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatus1Code PendingCancellation = new CorporateActionInstructionCancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.mmObject();
			codeName = CorporateActionInstructionCancellationProcessingStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code
	 * CorporateActionInstructionCancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatus1Code Accepted = new CorporateActionInstructionCancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.mmObject();
			codeName = CorporateActionInstructionCancellationProcessingStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code
	 * CorporateActionInstructionCancellationProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final CorporateActionInstructionCancellationProcessingStatus1Code Rejected = new CorporateActionInstructionCancellationProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.mmObject();
			codeName = CorporateActionInstructionCancellationProcessingStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionInstructionCancellationProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionInstructionCancellationProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionInstructionCancellationProcessingStatus1Code";
				definition = "Specifies the status of a corporate action instruction cancellation process.";
				trace_lazy = () -> CorporateActionInstructionCancellationProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.CancellationCompleted,
						com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.PendingCancellation,
						com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.Accepted, com.tools20022.repository.codeset.CorporateActionInstructionCancellationProcessingStatus1Code.Rejected);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancellationCompleted.getCodeName().get(), CancellationCompleted);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
	}

	public static CorporateActionInstructionCancellationProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionInstructionCancellationProcessingStatus1Code[] values() {
		CorporateActionInstructionCancellationProcessingStatus1Code[] values = new CorporateActionInstructionCancellationProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionInstructionCancellationProcessingStatus1Code> {
		@Override
		public CorporateActionInstructionCancellationProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionInstructionCancellationProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}