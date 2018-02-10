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
import com.tools20022.repository.codeset.TerminalManagementErrorAction2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Action to perform in case of error during the maintenance action in progress.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction2Code#SendStatusReport
 * TerminalManagementErrorAction2Code.SendStatusReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction2Code#StopSequence
 * TerminalManagementErrorAction2Code.StopSequence}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorActionCode
 * TerminalManagementErrorActionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SDSR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementErrorAction2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Action to perform in case of error during the maintenance action in progress."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementErrorAction2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction2Code
	 * TerminalManagementErrorAction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SendStatusReport"</li>
	 * </ul>
	 */
	public static final TerminalManagementErrorAction2Code SendStatusReport = new TerminalManagementErrorAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SendStatusReport";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementErrorAction2Code.mmObject();
			codeName = TerminalManagementErrorActionCode.SendStatusReport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementErrorAction2Code
	 * TerminalManagementErrorAction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopSequence"</li>
	 * </ul>
	 */
	public static final TerminalManagementErrorAction2Code StopSequence = new TerminalManagementErrorAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StopSequence";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementErrorAction2Code.mmObject();
			codeName = TerminalManagementErrorActionCode.StopSequence.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementErrorAction2Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementErrorAction2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SDSR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementErrorAction2Code";
				definition = "Action to perform in case of error during the maintenance action in progress.";
				trace_lazy = () -> TerminalManagementErrorActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementErrorAction2Code.SendStatusReport, com.tools20022.repository.codeset.TerminalManagementErrorAction2Code.StopSequence);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SendStatusReport.getCodeName().get(), SendStatusReport);
		codesByName.put(StopSequence.getCodeName().get(), StopSequence);
	}

	public static TerminalManagementErrorAction2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementErrorAction2Code[] values() {
		TerminalManagementErrorAction2Code[] values = new TerminalManagementErrorAction2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementErrorAction2Code> {
		@Override
		public TerminalManagementErrorAction2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementErrorAction2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}