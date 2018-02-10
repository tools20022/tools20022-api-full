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
import com.tools20022.repository.codeset.ProcessingStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the processing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code#Complete
 * ProcessingStatus1Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code#PreliminaryConfirmed
 * ProcessingStatus1Code.PreliminaryConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code#PreliminaryUnconfirmed
 * ProcessingStatus1Code.PreliminaryUnconfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code#ForInformationOnly
 * ProcessingStatus1Code.ForInformationOnly}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ProcessingStatusCode
 * ProcessingStatusCode}</li>
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
 * "ProcessingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the processing status."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ProcessingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code
	 * ProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * </ul>
	 */
	public static final ProcessingStatus1Code Complete = new ProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatus1Code.mmObject();
			codeName = ProcessingStatusCode.Complete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code
	 * ProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreliminaryConfirmed"</li>
	 * </ul>
	 */
	public static final ProcessingStatus1Code PreliminaryConfirmed = new ProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreliminaryConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatus1Code.mmObject();
			codeName = ProcessingStatusCode.PreliminaryConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code
	 * ProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreliminaryUnconfirmed"</li>
	 * </ul>
	 */
	public static final ProcessingStatus1Code PreliminaryUnconfirmed = new ProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreliminaryUnconfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatus1Code.mmObject();
			codeName = ProcessingStatusCode.PreliminaryUnconfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ProcessingStatus1Code
	 * ProcessingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnly"</li>
	 * </ul>
	 */
	public static final ProcessingStatus1Code ForInformationOnly = new ProcessingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForInformationOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.ProcessingStatus1Code.mmObject();
			codeName = ProcessingStatusCode.ForInformationOnly.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ProcessingStatus1Code> codesByName = new LinkedHashMap<>();

	protected ProcessingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("COMP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProcessingStatus1Code";
				definition = "Specifies the processing status.";
				trace_lazy = () -> ProcessingStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ProcessingStatus1Code.Complete, com.tools20022.repository.codeset.ProcessingStatus1Code.PreliminaryConfirmed,
						com.tools20022.repository.codeset.ProcessingStatus1Code.PreliminaryUnconfirmed, com.tools20022.repository.codeset.ProcessingStatus1Code.ForInformationOnly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(PreliminaryConfirmed.getCodeName().get(), PreliminaryConfirmed);
		codesByName.put(PreliminaryUnconfirmed.getCodeName().get(), PreliminaryUnconfirmed);
		codesByName.put(ForInformationOnly.getCodeName().get(), ForInformationOnly);
	}

	public static ProcessingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ProcessingStatus1Code[] values() {
		ProcessingStatus1Code[] values = new ProcessingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ProcessingStatus1Code> {
		@Override
		public ProcessingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ProcessingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}