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
import com.tools20022.repository.codeset.TerminalManagementAction4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Types of terminal management action to be performed by a point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Deactivate
 * TerminalManagementAction4Code.Deactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Delete
 * TerminalManagementAction4Code.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Download
 * TerminalManagementAction4Code.Download}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Install
 * TerminalManagementAction4Code.Install}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Restart
 * TerminalManagementAction4Code.Restart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Upload
 * TerminalManagementAction4Code.Upload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Update
 * TerminalManagementAction4Code.Update}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Bind
 * TerminalManagementAction4Code.Bind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Rebind
 * TerminalManagementAction4Code.Rebind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Unbind
 * TerminalManagementAction4Code.Unbind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Activate
 * TerminalManagementAction4Code.Activate}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementAction4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Types of terminal management action to be performed by a point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
 * TerminalManagementAction2Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementAction4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Deactivate
	 * TerminalManagementAction2Code.Deactivate}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Deactivate = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivate";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Deactivate;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Deactivate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Delete
	 * TerminalManagementAction2Code.Delete}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Delete = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Delete;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Delete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Download"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Download
	 * TerminalManagementAction2Code.Download}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Download = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Download";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Download;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Download.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Install"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Install
	 * TerminalManagementAction2Code.Install}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Install = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Install";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Install;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Install.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Restart
	 * TerminalManagementAction2Code.Restart}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Restart = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restart";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Restart;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Restart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Upload
	 * TerminalManagementAction2Code.Upload}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Upload = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Upload";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Upload;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Upload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Update"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Update
	 * TerminalManagementAction2Code.Update}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Update = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			previousVersion_lazy = () -> TerminalManagementAction2Code.Update;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Update.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bind"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Bind = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bind";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Bind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rebind"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Rebind = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rebind";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Rebind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unbind"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Unbind = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unbind";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Unbind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
	 * TerminalManagementAction4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * </ul>
	 */
	public static final TerminalManagementAction4Code Activate = new TerminalManagementAction4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activate";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction4Code.mmObject();
			codeName = TerminalManagementActionCode.Activate.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementAction4Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementAction4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction4Code";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				previousVersion_lazy = () -> TerminalManagementAction2Code.mmObject();
				trace_lazy = () -> TerminalManagementActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAction4Code.Deactivate, com.tools20022.repository.codeset.TerminalManagementAction4Code.Delete,
						com.tools20022.repository.codeset.TerminalManagementAction4Code.Download, com.tools20022.repository.codeset.TerminalManagementAction4Code.Install,
						com.tools20022.repository.codeset.TerminalManagementAction4Code.Restart, com.tools20022.repository.codeset.TerminalManagementAction4Code.Upload,
						com.tools20022.repository.codeset.TerminalManagementAction4Code.Update, com.tools20022.repository.codeset.TerminalManagementAction4Code.Bind, com.tools20022.repository.codeset.TerminalManagementAction4Code.Rebind,
						com.tools20022.repository.codeset.TerminalManagementAction4Code.Unbind, com.tools20022.repository.codeset.TerminalManagementAction4Code.Activate);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Deactivate.getCodeName().get(), Deactivate);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(Download.getCodeName().get(), Download);
		codesByName.put(Install.getCodeName().get(), Install);
		codesByName.put(Restart.getCodeName().get(), Restart);
		codesByName.put(Upload.getCodeName().get(), Upload);
		codesByName.put(Update.getCodeName().get(), Update);
		codesByName.put(Bind.getCodeName().get(), Bind);
		codesByName.put(Rebind.getCodeName().get(), Rebind);
		codesByName.put(Unbind.getCodeName().get(), Unbind);
		codesByName.put(Activate.getCodeName().get(), Activate);
	}

	public static TerminalManagementAction4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementAction4Code[] values() {
		TerminalManagementAction4Code[] values = new TerminalManagementAction4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementAction4Code> {
		@Override
		public TerminalManagementAction4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementAction4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}