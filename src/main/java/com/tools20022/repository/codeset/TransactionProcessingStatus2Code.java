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
import com.tools20022.repository.codeset.TransactionProcessingStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides the processing status of a transaction (at account servicer level).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#Cancelled
 * TransactionProcessingStatus2Code.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#PendingCancellation
 * TransactionProcessingStatus2Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#CancellationRequested
 * TransactionProcessingStatus2Code.CancellationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#PendingProcessing
 * TransactionProcessingStatus2Code.PendingProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#AcknowledgedAccepted
 * TransactionProcessingStatus2Code.AcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#Generated
 * TransactionProcessingStatus2Code.Generated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code#InRepair
 * TransactionProcessingStatus2Code.InRepair}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionProcessingStatusCode
 * InstructionProcessingStatusCode}</li>
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
 * "TransactionProcessingStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the processing status of a transaction (at account servicer level)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TransactionProcessingStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code Cancelled = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code PendingCancellation = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequested"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code CancellationRequested = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.CancellationRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessing"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code PendingProcessing = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.PendingProcessing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code AcknowledgedAccepted = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.AcknowledgedAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Generated"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code Generated = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Generated";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.Generated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionProcessingStatus2Code
	 * TransactionProcessingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InRepair"</li>
	 * </ul>
	 */
	public static final TransactionProcessingStatus2Code InRepair = new TransactionProcessingStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InRepair";
			owner_lazy = () -> com.tools20022.repository.codeset.TransactionProcessingStatus2Code.mmObject();
			codeName = InstructionProcessingStatusCode.InRepair.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TransactionProcessingStatus2Code> codesByName = new LinkedHashMap<>();

	protected TransactionProcessingStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TransactionProcessingStatus2Code";
				definition = "Provides the processing status of a transaction (at account servicer level).";
				trace_lazy = () -> InstructionProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TransactionProcessingStatus2Code.Cancelled, com.tools20022.repository.codeset.TransactionProcessingStatus2Code.PendingCancellation,
						com.tools20022.repository.codeset.TransactionProcessingStatus2Code.CancellationRequested, com.tools20022.repository.codeset.TransactionProcessingStatus2Code.PendingProcessing,
						com.tools20022.repository.codeset.TransactionProcessingStatus2Code.AcknowledgedAccepted, com.tools20022.repository.codeset.TransactionProcessingStatus2Code.Generated,
						com.tools20022.repository.codeset.TransactionProcessingStatus2Code.InRepair);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(CancellationRequested.getCodeName().get(), CancellationRequested);
		codesByName.put(PendingProcessing.getCodeName().get(), PendingProcessing);
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(Generated.getCodeName().get(), Generated);
		codesByName.put(InRepair.getCodeName().get(), InRepair);
	}

	public static TransactionProcessingStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TransactionProcessingStatus2Code[] values() {
		TransactionProcessingStatus2Code[] values = new TransactionProcessingStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TransactionProcessingStatus2Code> {
		@Override
		public TransactionProcessingStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TransactionProcessingStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}