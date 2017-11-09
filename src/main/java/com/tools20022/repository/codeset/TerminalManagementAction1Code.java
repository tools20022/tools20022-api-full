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
import com.tools20022.repository.codeset.TerminalManagementActionCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Types of terminal management action to be performed by a point of
 * interaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionCode
 * TerminalManagementActionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmActivate
 * TerminalManagementAction1Code.mmActivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmDeactivate
 * TerminalManagementAction1Code.mmDeactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmDelete
 * TerminalManagementAction1Code.mmDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmDownload
 * TerminalManagementAction1Code.mmDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmInstall
 * TerminalManagementAction1Code.mmInstall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmRestart
 * TerminalManagementAction1Code.mmRestart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmUpload
 * TerminalManagementAction1Code.mmUpload}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "TerminalManagementAction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Types of terminal management action to be performed by a point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
 * TerminalManagementAction2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class TerminalManagementAction1Code extends TerminalManagementActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmActivate
	 * TerminalManagementAction2Code.mmActivate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmActivate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activate";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmActivate);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmDeactivate
	 * TerminalManagementAction2Code.mmDeactivate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeactivate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivate";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmDeactivate);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmDelete
	 * TerminalManagementAction2Code.mmDelete}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDelete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmDelete);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Download"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmDownload
	 * TerminalManagementAction2Code.mmDownload}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDownload = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Download";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmDownload);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Install"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmInstall
	 * TerminalManagementAction2Code.mmInstall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstall = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Install";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmInstall);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restart"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmRestart
	 * TerminalManagementAction2Code.mmRestart}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRestart = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restart";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmRestart);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
	 * TerminalManagementAction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upload"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmUpload
	 * TerminalManagementAction2Code.mmUpload}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUpload = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Upload";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmUpload);
			owner_lazy = () -> TerminalManagementAction1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction1Code";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementAction2Code.mmObject());
				code_lazy = () -> Arrays.asList(TerminalManagementAction1Code.mmActivate, TerminalManagementAction1Code.mmDeactivate, TerminalManagementAction1Code.mmDelete, TerminalManagementAction1Code.mmDownload,
						TerminalManagementAction1Code.mmInstall, TerminalManagementAction1Code.mmRestart, TerminalManagementAction1Code.mmUpload);
				trace_lazy = () -> TerminalManagementActionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}