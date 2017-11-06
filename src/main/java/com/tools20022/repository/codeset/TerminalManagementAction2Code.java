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
import com.tools20022.repository.codeset.TerminalManagementActionCode;
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
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmActivate
 * TerminalManagementAction2Code.mmActivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmDeactivate
 * TerminalManagementAction2Code.mmDeactivate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmDelete
 * TerminalManagementAction2Code.mmDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmDownload
 * TerminalManagementAction2Code.mmDownload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmInstall
 * TerminalManagementAction2Code.mmInstall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmRestart
 * TerminalManagementAction2Code.mmRestart}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmUpload
 * TerminalManagementAction2Code.mmUpload}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code#mmUpdate
 * TerminalManagementAction2Code.mmUpdate}</li>
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
 * "TerminalManagementAction2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Types of terminal management action to be performed by a point of interaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code
 * TerminalManagementAction1Code}</li>
 * </ul>
 */
public class TerminalManagementAction2Code extends TerminalManagementActionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction2Code
	 * TerminalManagementAction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Activate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmActivate
	 * TerminalManagementAction1Code.mmActivate}</li>
	 * </ul>
	 */
	public static final MMCode mmActivate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Activate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmActivate;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmDeactivate
	 * TerminalManagementAction1Code.mmDeactivate}</li>
	 * </ul>
	 */
	public static final MMCode mmDeactivate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmDeactivate;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmDelete
	 * TerminalManagementAction1Code.mmDelete}</li>
	 * </ul>
	 */
	public static final MMCode mmDelete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmDelete;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Download"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmDownload
	 * TerminalManagementAction1Code.mmDownload}</li>
	 * </ul>
	 */
	public static final MMCode mmDownload = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Download";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmDownload;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Install"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmInstall
	 * TerminalManagementAction1Code.mmInstall}</li>
	 * </ul>
	 */
	public static final MMCode mmInstall = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Install";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmInstall;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Restart"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmRestart
	 * TerminalManagementAction1Code.mmRestart}</li>
	 * </ul>
	 */
	public static final MMCode mmRestart = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Restart";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmRestart;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Upload"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction1Code#mmUpload
	 * TerminalManagementAction1Code.mmUpload}</li>
	 * </ul>
	 */
	public static final MMCode mmUpload = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Upload";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementAction1Code.mmUpload;
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Update"</li>
	 * </ul>
	 */
	public static final MMCode mmUpdate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			owner_lazy = () -> TerminalManagementAction2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementAction2Code";
				definition = "Types of terminal management action to be performed by a point of interaction.";
				previousVersion_lazy = () -> TerminalManagementAction1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementAction2Code.mmActivate, com.tools20022.repository.codeset.TerminalManagementAction2Code.mmDeactivate,
						com.tools20022.repository.codeset.TerminalManagementAction2Code.mmDelete, com.tools20022.repository.codeset.TerminalManagementAction2Code.mmDownload,
						com.tools20022.repository.codeset.TerminalManagementAction2Code.mmInstall, com.tools20022.repository.codeset.TerminalManagementAction2Code.mmRestart,
						com.tools20022.repository.codeset.TerminalManagementAction2Code.mmUpload, com.tools20022.repository.codeset.TerminalManagementAction2Code.mmUpdate);
				trace_lazy = () -> TerminalManagementActionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}