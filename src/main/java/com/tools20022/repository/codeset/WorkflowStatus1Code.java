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
import com.tools20022.repository.codeset.WorkflowStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the workflow status of the details of a specific level.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code#Complete
 * WorkflowStatus1Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code#Conflict
 * WorkflowStatus1Code.Conflict}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code#ConditionallyComplete
 * WorkflowStatus1Code.ConditionallyComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code#Incomplete
 * WorkflowStatus1Code.Incomplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code#Deleted
 * WorkflowStatus1Code.Deleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode
 * WorkflowStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"COMP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "WorkflowStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the workflow status of the details of a specific level. "</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WorkflowStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * </ul>
	 */
	public static final WorkflowStatus1Code Complete = new WorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatus1Code.mmObject();
			codeName = WorkflowStatusCode.Complete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conflict"</li>
	 * </ul>
	 */
	public static final WorkflowStatus1Code Conflict = new WorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conflict";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatus1Code.mmObject();
			codeName = WorkflowStatusCode.Conflict.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyComplete"</li>
	 * </ul>
	 */
	public static final WorkflowStatus1Code ConditionallyComplete = new WorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyComplete";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatus1Code.mmObject();
			codeName = WorkflowStatusCode.ConditionallyComplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * </ul>
	 */
	public static final WorkflowStatus1Code Incomplete = new WorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatus1Code.mmObject();
			codeName = WorkflowStatusCode.Incomplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
	 * WorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * </ul>
	 */
	public static final WorkflowStatus1Code Deleted = new WorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatus1Code.mmObject();
			codeName = WorkflowStatusCode.Deleted.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, WorkflowStatus1Code> codesByName = new LinkedHashMap<>();

	protected WorkflowStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WorkflowStatus1Code";
				definition = "Specifies the workflow status of the details of a specific level. ";
				trace_lazy = () -> WorkflowStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WorkflowStatus1Code.Complete, com.tools20022.repository.codeset.WorkflowStatus1Code.Conflict,
						com.tools20022.repository.codeset.WorkflowStatus1Code.ConditionallyComplete, com.tools20022.repository.codeset.WorkflowStatus1Code.Incomplete, com.tools20022.repository.codeset.WorkflowStatus1Code.Deleted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(Conflict.getCodeName().get(), Conflict);
		codesByName.put(ConditionallyComplete.getCodeName().get(), ConditionallyComplete);
		codesByName.put(Incomplete.getCodeName().get(), Incomplete);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
	}

	public static WorkflowStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WorkflowStatus1Code[] values() {
		WorkflowStatus1Code[] values = new WorkflowStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WorkflowStatus1Code> {
		@Override
		public WorkflowStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WorkflowStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}