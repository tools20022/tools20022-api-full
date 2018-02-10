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
import com.tools20022.repository.codeset.EventWorkflowStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the workflow status of the announcement record based on validation
 * procedure.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#Approved
 * EventWorkflowStatus1Code.Approved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#PendingApproval
 * EventWorkflowStatus1Code.PendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#ConditionallyApproved
 * EventWorkflowStatus1Code.ConditionallyApproved}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#PendingConditionalApproval
 * EventWorkflowStatus1Code.PendingConditionalApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#InConflict
 * EventWorkflowStatus1Code.InConflict}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#Incomplete
 * EventWorkflowStatus1Code.Incomplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#PendingDeleted
 * EventWorkflowStatus1Code.PendingDeleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#NotSupported
 * EventWorkflowStatus1Code.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#PendingNotSupported
 * EventWorkflowStatus1Code.PendingNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code#PendingCancelled
 * EventWorkflowStatus1Code.PendingCancelled}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatusCode
 * EventWorkflowStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WSAP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EventWorkflowStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the workflow status of the announcement record based on validation procedure."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EventWorkflowStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Approved"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code Approved = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Approved";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.Approved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code PendingApproval = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.PendingApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyApproved"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code ConditionallyApproved = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyApproved";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.ConditionallyApproved.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingConditionalApproval"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code PendingConditionalApproval = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingConditionalApproval";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.PendingConditionalApproval.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InConflict"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code InConflict = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InConflict";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.InConflict.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code Incomplete = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.Incomplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeleted"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code PendingDeleted = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeleted";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.PendingDeleted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code NotSupported = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.NotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingNotSupported"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code PendingNotSupported = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingNotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.PendingNotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EventWorkflowStatus1Code
	 * EventWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancelled"</li>
	 * </ul>
	 */
	public static final EventWorkflowStatus1Code PendingCancelled = new EventWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.EventWorkflowStatus1Code.mmObject();
			codeName = EventWorkflowStatusCode.PendingCancelled.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EventWorkflowStatus1Code> codesByName = new LinkedHashMap<>();

	protected EventWorkflowStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WSAP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EventWorkflowStatus1Code";
				definition = "Specifies the workflow status of the announcement record based on validation procedure.";
				trace_lazy = () -> EventWorkflowStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EventWorkflowStatus1Code.Approved, com.tools20022.repository.codeset.EventWorkflowStatus1Code.PendingApproval,
						com.tools20022.repository.codeset.EventWorkflowStatus1Code.ConditionallyApproved, com.tools20022.repository.codeset.EventWorkflowStatus1Code.PendingConditionalApproval,
						com.tools20022.repository.codeset.EventWorkflowStatus1Code.InConflict, com.tools20022.repository.codeset.EventWorkflowStatus1Code.Incomplete,
						com.tools20022.repository.codeset.EventWorkflowStatus1Code.PendingDeleted, com.tools20022.repository.codeset.EventWorkflowStatus1Code.NotSupported,
						com.tools20022.repository.codeset.EventWorkflowStatus1Code.PendingNotSupported, com.tools20022.repository.codeset.EventWorkflowStatus1Code.PendingCancelled);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Approved.getCodeName().get(), Approved);
		codesByName.put(PendingApproval.getCodeName().get(), PendingApproval);
		codesByName.put(ConditionallyApproved.getCodeName().get(), ConditionallyApproved);
		codesByName.put(PendingConditionalApproval.getCodeName().get(), PendingConditionalApproval);
		codesByName.put(InConflict.getCodeName().get(), InConflict);
		codesByName.put(Incomplete.getCodeName().get(), Incomplete);
		codesByName.put(PendingDeleted.getCodeName().get(), PendingDeleted);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
		codesByName.put(PendingNotSupported.getCodeName().get(), PendingNotSupported);
		codesByName.put(PendingCancelled.getCodeName().get(), PendingCancelled);
	}

	public static EventWorkflowStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EventWorkflowStatus1Code[] values() {
		EventWorkflowStatus1Code[] values = new EventWorkflowStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EventWorkflowStatus1Code> {
		@Override
		public EventWorkflowStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EventWorkflowStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}