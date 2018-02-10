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
import com.tools20022.repository.codeset.WorkflowStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode#Complete
 * WorkflowStatusCode.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode#Conflict
 * WorkflowStatusCode.Conflict}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode#ConditionallyComplete
 * WorkflowStatusCode.ConditionallyComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode#Incomplete
 * WorkflowStatusCode.Incomplete}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.WorkflowStatusCode#Deleted
 * WorkflowStatusCode.Deleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.WorkflowStatus1Code
 * WorkflowStatus1Code}</li>
 * </ul>
 * </li>
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
 * "WorkflowStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the workflow status of the details of a specific level."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class WorkflowStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Level details are complete. All required data is populated and verified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode
	 * WorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level details are complete. All required data is populated and verified."
	 * </li>
	 * </ul>
	 */
	public static final WorkflowStatusCode Complete = new WorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			definition = "Level details are complete. All required data is populated and verified.";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatusCode.mmObject();
			codeName = "COMP";
		}
	};
	/**
	 * Level details are incomplete due to conflicting details from 2 or more
	 * sources.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode
	 * WorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNFL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conflict"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level details are incomplete due to conflicting details from 2 or more sources."
	 * </li>
	 * </ul>
	 */
	public static final WorkflowStatusCode Conflict = new WorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conflict";
			definition = "Level details are incomplete due to conflicting details from 2 or more sources.";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatusCode.mmObject();
			codeName = "CNFL";
		}
	};
	/**
	 * Level details are complete pending a condition.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode
	 * WorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionallyComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Level details are complete pending a condition."</li>
	 * </ul>
	 */
	public static final WorkflowStatusCode ConditionallyComplete = new WorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionallyComplete";
			definition = "Level details are complete pending a condition.";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatusCode.mmObject();
			codeName = "COND";
		}
	};
	/**
	 * Level details are incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode
	 * WorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Incomplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Level details are incomplete."</li>
	 * </ul>
	 */
	public static final WorkflowStatusCode Incomplete = new WorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Incomplete";
			definition = "Level details are incomplete.";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatusCode.mmObject();
			codeName = "INCO";
		}
	};
	/**
	 * Level has been deleted, cancelled/deactivated/invalidated by the source
	 * or due to error processing error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.WorkflowStatusCode
	 * WorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Level has been deleted, cancelled/deactivated/invalidated by the source or due to error processing error."
	 * </li>
	 * </ul>
	 */
	public static final WorkflowStatusCode Deleted = new WorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Level has been deleted, cancelled/deactivated/invalidated by the source or due to error processing error.";
			owner_lazy = () -> com.tools20022.repository.codeset.WorkflowStatusCode.mmObject();
			codeName = "DLTD";
		}
	};
	final static private LinkedHashMap<String, WorkflowStatusCode> codesByName = new LinkedHashMap<>();

	protected WorkflowStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "WorkflowStatusCode";
				definition = "Specifies the workflow status of the details of a specific level.";
				derivation_lazy = () -> Arrays.asList(WorkflowStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.WorkflowStatusCode.Complete, com.tools20022.repository.codeset.WorkflowStatusCode.Conflict,
						com.tools20022.repository.codeset.WorkflowStatusCode.ConditionallyComplete, com.tools20022.repository.codeset.WorkflowStatusCode.Incomplete, com.tools20022.repository.codeset.WorkflowStatusCode.Deleted);
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

	public static WorkflowStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static WorkflowStatusCode[] values() {
		WorkflowStatusCode[] values = new WorkflowStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, WorkflowStatusCode> {
		@Override
		public WorkflowStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(WorkflowStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}