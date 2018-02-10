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
import com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Additional process to perform before starting or after a terminal management
 * action by the point of interaction (POI).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code#ManualConfirmation
 * TerminalManagementAdditionalProcess1Code.ManualConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code#Reconciliation
 * TerminalManagementAdditionalProcess1Code.Reconciliation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code#RestartSystem
 * TerminalManagementAdditionalProcess1Code.RestartSystem}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcessCode
 * TerminalManagementAdditionalProcessCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MANC"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementAdditionalProcess1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Additional process to perform before starting or after a terminal management action by the point of interaction (POI)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementAdditionalProcess1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManualConfirmation"</li>
	 * </ul>
	 */
	public static final TerminalManagementAdditionalProcess1Code ManualConfirmation = new TerminalManagementAdditionalProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManualConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.mmObject();
			codeName = TerminalManagementAdditionalProcessCode.ManualConfirmation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reconciliation"</li>
	 * </ul>
	 */
	public static final TerminalManagementAdditionalProcess1Code Reconciliation = new TerminalManagementAdditionalProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reconciliation";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.mmObject();
			codeName = TerminalManagementAdditionalProcessCode.Reconciliation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code
	 * TerminalManagementAdditionalProcess1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestartSystem"</li>
	 * </ul>
	 */
	public static final TerminalManagementAdditionalProcess1Code RestartSystem = new TerminalManagementAdditionalProcess1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestartSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.mmObject();
			codeName = TerminalManagementAdditionalProcessCode.RestartSystem.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementAdditionalProcess1Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementAdditionalProcess1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MANC");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAdditionalProcess1Code";
				definition = "Additional process to perform before starting or after a terminal management action by the point of interaction (POI).";
				trace_lazy = () -> TerminalManagementAdditionalProcessCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.ManualConfirmation, com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.Reconciliation,
						com.tools20022.repository.codeset.TerminalManagementAdditionalProcess1Code.RestartSystem);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ManualConfirmation.getCodeName().get(), ManualConfirmation);
		codesByName.put(Reconciliation.getCodeName().get(), Reconciliation);
		codesByName.put(RestartSystem.getCodeName().get(), RestartSystem);
	}

	public static TerminalManagementAdditionalProcess1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementAdditionalProcess1Code[] values() {
		TerminalManagementAdditionalProcess1Code[] values = new TerminalManagementAdditionalProcess1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementAdditionalProcess1Code> {
		@Override
		public TerminalManagementAdditionalProcess1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementAdditionalProcess1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}