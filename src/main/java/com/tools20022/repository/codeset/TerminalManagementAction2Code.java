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
import com.tools20022.repository.codeset.TerminalManagementAction2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Activate
 * TerminalManagementAction2Code.Activate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Deactivate
 * TerminalManagementAction2Code.Deactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Delete
 * TerminalManagementAction2Code.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Download
 * TerminalManagementAction2Code.Download}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Install
 * TerminalManagementAction2Code.Install}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Restart
 * TerminalManagementAction2Code.Restart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Upload
 * TerminalManagementAction2Code.Upload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#Update
 * TerminalManagementAction2Code.Update}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementAction2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Types of terminal management action to be performed by a point of interaction."
 * </li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code
 * TerminalManagementAction4Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
 * TerminalManagementAction1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementAction2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Activate
	 * TerminalManagementAction1Code.Activate}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Activate = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activate";
			previousVersion_lazy = () -> TerminalManagementAction1Code.Activate;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Activate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Deactivate
	 * TerminalManagementAction4Code.Deactivate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Deactivate
	 * TerminalManagementAction1Code.Deactivate}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Deactivate = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivate";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Deactivate);
			previousVersion_lazy = () -> TerminalManagementAction1Code.Deactivate;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Deactivate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Delete
	 * TerminalManagementAction4Code.Delete}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Delete
	 * TerminalManagementAction1Code.Delete}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Delete = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Delete);
			previousVersion_lazy = () -> TerminalManagementAction1Code.Delete;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Delete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Download"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Download
	 * TerminalManagementAction4Code.Download}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Download
	 * TerminalManagementAction1Code.Download}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Download = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Download";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Download);
			previousVersion_lazy = () -> TerminalManagementAction1Code.Download;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Download.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Install"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Install
	 * TerminalManagementAction4Code.Install}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Install
	 * TerminalManagementAction1Code.Install}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Install = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Install";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Install);
			previousVersion_lazy = () -> TerminalManagementAction1Code.Install;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Install.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Restart
	 * TerminalManagementAction4Code.Restart}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Restart
	 * TerminalManagementAction1Code.Restart}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Restart = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restart";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Restart);
			previousVersion_lazy = () -> TerminalManagementAction1Code.Restart;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Restart.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Upload
	 * TerminalManagementAction4Code.Upload}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#Upload
	 * TerminalManagementAction1Code.Upload}</li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Upload = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Upload";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Upload);
			previousVersion_lazy = () -> TerminalManagementAction1Code.Upload;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Upload.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Update"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction4Code#Update
	 * TerminalManagementAction4Code.Update}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementAction2Code Update = new TerminalManagementAction2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.Update);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction2Code.mmObject();
			codeName = TerminalManagementActionCode.Update.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementAction2Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementAction2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction2Code";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction4Code.mmObject());
				previousVersion_lazy = () -> TerminalManagementAction1Code.mmObject();
				trace_lazy = () -> TerminalManagementActionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAction2Code.Activate, com.tools20022.repository.codeset.TerminalManagementAction2Code.Deactivate,
						com.tools20022.repository.codeset.TerminalManagementAction2Code.Delete, com.tools20022.repository.codeset.TerminalManagementAction2Code.Download,
						com.tools20022.repository.codeset.TerminalManagementAction2Code.Install, com.tools20022.repository.codeset.TerminalManagementAction2Code.Restart,
						com.tools20022.repository.codeset.TerminalManagementAction2Code.Upload, com.tools20022.repository.codeset.TerminalManagementAction2Code.Update);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Activate.getCodeName().get(), Activate);
		codesByName.put(Deactivate.getCodeName().get(), Deactivate);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(Download.getCodeName().get(), Download);
		codesByName.put(Install.getCodeName().get(), Install);
		codesByName.put(Restart.getCodeName().get(), Restart);
		codesByName.put(Upload.getCodeName().get(), Upload);
		codesByName.put(Update.getCodeName().get(), Update);
	}

	public static TerminalManagementAction2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementAction2Code[] values() {
		TerminalManagementAction2Code[] values = new TerminalManagementAction2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementAction2Code> {
		@Override
		public TerminalManagementAction2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementAction2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}