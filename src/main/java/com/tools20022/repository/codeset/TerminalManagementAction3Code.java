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
import com.tools20022.repository.codeset.TerminalManagementAction3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of action to perform.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code#Create
 * TerminalManagementAction3Code.Create}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code#Delete
 * TerminalManagementAction3Code.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code#Update
 * TerminalManagementAction3Code.Update}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
 * TerminalManagementActionCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementAction3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of action to perform."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementAction3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Create"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction3Code Create = new TerminalManagementAction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Create";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction3Code.mmObject();
			codeName = TerminalManagementActionCode.Create.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction3Code Delete = new TerminalManagementAction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction3Code.mmObject();
			codeName = TerminalManagementActionCode.Delete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Update"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction3Code Update = new TerminalManagementAction3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction3Code.mmObject();
			codeName = TerminalManagementActionCode.Update.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementAction3Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementAction3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction3Code";
				definition = "Type of action to perform.";
				trace_lazy = () -> TerminalManagementActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAction3Code.Create, com.tools20022.repository.codeset.TerminalManagementAction3Code.Delete,
						com.tools20022.repository.codeset.TerminalManagementAction3Code.Update);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Create.getCodeName().get(), Create);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(Update.getCodeName().get(), Update);
	}

	public static TerminalManagementAction3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementAction3Code[] values() {
		TerminalManagementAction3Code[] values = new TerminalManagementAction3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementAction3Code> {
		@Override
		public TerminalManagementAction3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementAction3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}