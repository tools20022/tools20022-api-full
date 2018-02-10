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
import com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Final result of the processed terminal management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#AccessDenied
 * TerminalManagementActionResult3Code.AccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#ConnectionError
 * TerminalManagementActionResult3Code.ConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#FormatError
 * TerminalManagementActionResult3Code.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidContent
 * TerminalManagementActionResult3Code.InvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#LengthError
 * TerminalManagementActionResult3Code.LengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MemoryOverflow
 * TerminalManagementActionResult3Code.MemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MissingFile
 * TerminalManagementActionResult3Code.MissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#NotSupported
 * TerminalManagementActionResult3Code.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SignatureError
 * TerminalManagementActionResult3Code.SignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Success
 * TerminalManagementActionResult3Code.Success}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SyntaxError
 * TerminalManagementActionResult3Code.SyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Timeout
 * TerminalManagementActionResult3Code.Timeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownData
 * TerminalManagementActionResult3Code.UnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownKeyReference
 * TerminalManagementActionResult3Code.UnknownKeyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidDelegationProof
 * TerminalManagementActionResult3Code.InvalidDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidDelegationInManagementPlan
 * TerminalManagementActionResult3Code.InvalidDelegationInManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#DelegationParametersReceivedUnauthorized
 * TerminalManagementActionResult3Code.DelegationParametersReceivedUnauthorized}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
 * TerminalManagementActionResultCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACCD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionResult3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Final result of the processed terminal management action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
 * TerminalManagementActionResult4Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
 * TerminalManagementActionResult1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionResult3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessDenied"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#AccessDenied
	 * TerminalManagementActionResult4Code.AccessDenied}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#AccessDenied
	 * TerminalManagementActionResult1Code.AccessDenied}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code AccessDenied = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessDenied";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.AccessDenied);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.AccessDenied;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.AccessDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConnectionError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#ConnectionError
	 * TerminalManagementActionResult4Code.ConnectionError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#ConnectionError
	 * TerminalManagementActionResult1Code.ConnectionError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code ConnectionError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConnectionError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.ConnectionError);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.ConnectionError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.ConnectionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#FormatError
	 * TerminalManagementActionResult4Code.FormatError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#FormatError
	 * TerminalManagementActionResult1Code.FormatError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code FormatError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.FormatError);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.FormatError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidContent"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#InvalidContent
	 * TerminalManagementActionResult4Code.InvalidContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#InvalidContent
	 * TerminalManagementActionResult1Code.InvalidContent}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code InvalidContent = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidContent";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.InvalidContent);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.InvalidContent;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidContent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LengthError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#LengthError
	 * TerminalManagementActionResult4Code.LengthError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#LengthError
	 * TerminalManagementActionResult1Code.LengthError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code LengthError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.LengthError);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.LengthError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.LengthError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoryOverflow"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#MemoryOverflow
	 * TerminalManagementActionResult4Code.MemoryOverflow}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#MemoryOverflow
	 * TerminalManagementActionResult1Code.MemoryOverflow}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code MemoryOverflow = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoryOverflow";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.MemoryOverflow);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.MemoryOverflow;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.MemoryOverflow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingFile"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#MissingFile
	 * TerminalManagementActionResult4Code.MissingFile}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#MissingFile
	 * TerminalManagementActionResult1Code.MissingFile}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code MissingFile = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingFile";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.MissingFile);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.MissingFile;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.MissingFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#NotSupported
	 * TerminalManagementActionResult4Code.NotSupported}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#NotSupported
	 * TerminalManagementActionResult1Code.NotSupported}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code NotSupported = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.NotSupported);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.NotSupported;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.NotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#SignatureError
	 * TerminalManagementActionResult4Code.SignatureError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#SignatureError
	 * TerminalManagementActionResult1Code.SignatureError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code SignatureError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.SignatureError);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.SignatureError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.SignatureError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#Success
	 * TerminalManagementActionResult4Code.Success}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#Success
	 * TerminalManagementActionResult1Code.Success}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code Success = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.Success);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.Success;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.Success.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyntaxError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#SyntaxError
	 * TerminalManagementActionResult4Code.SyntaxError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#SyntaxError
	 * TerminalManagementActionResult1Code.SyntaxError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code SyntaxError = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyntaxError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.SyntaxError);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.SyntaxError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.SyntaxError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Timeout"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#Timeout
	 * TerminalManagementActionResult4Code.Timeout}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#Timeout
	 * TerminalManagementActionResult1Code.Timeout}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code Timeout = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timeout";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.Timeout);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.Timeout;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.Timeout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#UnknownData
	 * TerminalManagementActionResult4Code.UnknownData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#UnknownData
	 * TerminalManagementActionResult1Code.UnknownData}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code UnknownData = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownData";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.UnknownData);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.UnknownData;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownKeyReference"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#UnknownKeyReference
	 * TerminalManagementActionResult4Code.UnknownKeyReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#UnknownKeyReference
	 * TerminalManagementActionResult1Code.UnknownKeyReference}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code UnknownKeyReference = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownKeyReference";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.UnknownKeyReference);
			previousVersion_lazy = () -> TerminalManagementActionResult1Code.UnknownKeyReference;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownKeyReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationProof"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#InvalidDelegationProof
	 * TerminalManagementActionResult4Code.InvalidDelegationProof}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code InvalidDelegationProof = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.InvalidDelegationProof);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidDelegationProof.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationInManagementPlan"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#InvalidDelegationInManagementPlan
	 * TerminalManagementActionResult4Code.InvalidDelegationInManagementPlan}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code InvalidDelegationInManagementPlan = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.InvalidDelegationInManagementPlan);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidDelegationInManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
	 * TerminalManagementActionResult3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationParametersReceivedUnauthorized"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#DelegationParametersReceivedUnauthorized
	 * TerminalManagementActionResult4Code.
	 * DelegationParametersReceivedUnauthorized}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult3Code DelegationParametersReceivedUnauthorized = new TerminalManagementActionResult3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.DelegationParametersReceivedUnauthorized);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmObject();
			codeName = TerminalManagementActionResultCode.DelegationParametersReceivedUnauthorized.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionResult3Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionResult3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResult3Code";
				definition = "Final result of the processed terminal management action.";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult4Code.mmObject());
				previousVersion_lazy = () -> TerminalManagementActionResult1Code.mmObject();
				trace_lazy = () -> TerminalManagementActionResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResult3Code.AccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.ConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.FormatError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.LengthError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.MemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.MissingFile, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.SignatureError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.UnknownData, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.UnknownKeyReference,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InvalidDelegationProof, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.InvalidDelegationInManagementPlan,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.DelegationParametersReceivedUnauthorized);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccessDenied.getCodeName().get(), AccessDenied);
		codesByName.put(ConnectionError.getCodeName().get(), ConnectionError);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(InvalidContent.getCodeName().get(), InvalidContent);
		codesByName.put(LengthError.getCodeName().get(), LengthError);
		codesByName.put(MemoryOverflow.getCodeName().get(), MemoryOverflow);
		codesByName.put(MissingFile.getCodeName().get(), MissingFile);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
		codesByName.put(SignatureError.getCodeName().get(), SignatureError);
		codesByName.put(Success.getCodeName().get(), Success);
		codesByName.put(SyntaxError.getCodeName().get(), SyntaxError);
		codesByName.put(Timeout.getCodeName().get(), Timeout);
		codesByName.put(UnknownData.getCodeName().get(), UnknownData);
		codesByName.put(UnknownKeyReference.getCodeName().get(), UnknownKeyReference);
		codesByName.put(InvalidDelegationProof.getCodeName().get(), InvalidDelegationProof);
		codesByName.put(InvalidDelegationInManagementPlan.getCodeName().get(), InvalidDelegationInManagementPlan);
		codesByName.put(DelegationParametersReceivedUnauthorized.getCodeName().get(), DelegationParametersReceivedUnauthorized);
	}

	public static TerminalManagementActionResult3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionResult3Code[] values() {
		TerminalManagementActionResult3Code[] values = new TerminalManagementActionResult3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionResult3Code> {
		@Override
		public TerminalManagementActionResult3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionResult3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}