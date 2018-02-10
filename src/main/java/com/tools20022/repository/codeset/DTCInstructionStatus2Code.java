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
import com.tools20022.repository.codeset.DTCInstructionStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * DTC (The Depository Trust Company) system status code of instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Cancel
 * DTCInstructionStatus2Code.Cancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#ConversionCancellation
 * DTCInstructionStatus2Code.ConversionCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Dropped
 * DTCInstructionStatus2Code.Dropped}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Made
 * DTCInstructionStatus2Code.Made}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#PendingDocumentation
 * DTCInstructionStatus2Code.PendingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#PendingApproval
 * DTCInstructionStatus2Code.PendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Pending
 * DTCInstructionStatus2Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#RejectedByAgent
 * DTCInstructionStatus2Code.RejectedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Reject
 * DTCInstructionStatus2Code.Reject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#RecycleMade
 * DTCInstructionStatus2Code.RecycleMade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Rescinded
 * DTCInstructionStatus2Code.Rescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Swung
 * DTCInstructionStatus2Code.Swung}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Withdrawn
 * DTCInstructionStatus2Code.Withdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code#Recycle
 * DTCInstructionStatus2Code.Recycle}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
 * DTCInstructionStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCInstructionStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "DTC (The Depository Trust Company) system status code of instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCInstructionStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancel"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Cancel = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancel";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Cancel.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionCancellation"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code ConversionCancellation = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.ConversionCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dropped"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Dropped = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dropped";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Dropped.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Made"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Made = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Made";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Made.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDocumentation"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code PendingDocumentation = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDocumentation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.PendingDocumentation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code PendingApproval = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.PendingApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Pending = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByAgent"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code RejectedByAgent = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.RejectedByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reject"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Reject = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reject";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Reject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecycleMade"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code RecycleMade = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecycleMade";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.RecycleMade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Rescinded = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Rescinded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swung"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Swung = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swung";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Swung.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Withdrawn = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Withdrawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
	 * DTCInstructionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recycle"</li>
	 * </ul>
	 */
	public static final DTCInstructionStatus2Code Recycle = new DTCInstructionStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recycle";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCInstructionStatus2Code.mmObject();
			codeName = DTCInstructionStatusCode.Recycle.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCInstructionStatus2Code> codesByName = new LinkedHashMap<>();

	protected DTCInstructionStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DTCInstructionStatus2Code";
				definition = "DTC (The Depository Trust Company) system status code of instruction.";
				trace_lazy = () -> DTCInstructionStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCInstructionStatus2Code.Cancel, com.tools20022.repository.codeset.DTCInstructionStatus2Code.ConversionCancellation,
						com.tools20022.repository.codeset.DTCInstructionStatus2Code.Dropped, com.tools20022.repository.codeset.DTCInstructionStatus2Code.Made,
						com.tools20022.repository.codeset.DTCInstructionStatus2Code.PendingDocumentation, com.tools20022.repository.codeset.DTCInstructionStatus2Code.PendingApproval,
						com.tools20022.repository.codeset.DTCInstructionStatus2Code.Pending, com.tools20022.repository.codeset.DTCInstructionStatus2Code.RejectedByAgent, com.tools20022.repository.codeset.DTCInstructionStatus2Code.Reject,
						com.tools20022.repository.codeset.DTCInstructionStatus2Code.RecycleMade, com.tools20022.repository.codeset.DTCInstructionStatus2Code.Rescinded, com.tools20022.repository.codeset.DTCInstructionStatus2Code.Swung,
						com.tools20022.repository.codeset.DTCInstructionStatus2Code.Withdrawn, com.tools20022.repository.codeset.DTCInstructionStatus2Code.Recycle);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Cancel.getCodeName().get(), Cancel);
		codesByName.put(ConversionCancellation.getCodeName().get(), ConversionCancellation);
		codesByName.put(Dropped.getCodeName().get(), Dropped);
		codesByName.put(Made.getCodeName().get(), Made);
		codesByName.put(PendingDocumentation.getCodeName().get(), PendingDocumentation);
		codesByName.put(PendingApproval.getCodeName().get(), PendingApproval);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(RejectedByAgent.getCodeName().get(), RejectedByAgent);
		codesByName.put(Reject.getCodeName().get(), Reject);
		codesByName.put(RecycleMade.getCodeName().get(), RecycleMade);
		codesByName.put(Rescinded.getCodeName().get(), Rescinded);
		codesByName.put(Swung.getCodeName().get(), Swung);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
		codesByName.put(Recycle.getCodeName().get(), Recycle);
	}

	public static DTCInstructionStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCInstructionStatus2Code[] values() {
		DTCInstructionStatus2Code[] values = new DTCInstructionStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCInstructionStatus2Code> {
		@Override
		public DTCInstructionStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCInstructionStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}