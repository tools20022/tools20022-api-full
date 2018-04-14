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
import com.tools20022.repository.codeset.TerminalManagementActionResult4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#AccessDenied
 * TerminalManagementActionResult4Code.AccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#ConnectionError
 * TerminalManagementActionResult4Code.ConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#FormatError
 * TerminalManagementActionResult4Code.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#InvalidContent
 * TerminalManagementActionResult4Code.InvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#LengthError
 * TerminalManagementActionResult4Code.LengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#MemoryOverflow
 * TerminalManagementActionResult4Code.MemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#MissingFile
 * TerminalManagementActionResult4Code.MissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#NotSupported
 * TerminalManagementActionResult4Code.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#SignatureError
 * TerminalManagementActionResult4Code.SignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#Success
 * TerminalManagementActionResult4Code.Success}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#SyntaxError
 * TerminalManagementActionResult4Code.SyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#Timeout
 * TerminalManagementActionResult4Code.Timeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#UnknownData
 * TerminalManagementActionResult4Code.UnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#UnknownKeyReference
 * TerminalManagementActionResult4Code.UnknownKeyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#InvalidDelegationProof
 * TerminalManagementActionResult4Code.InvalidDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#InvalidDelegationInManagementPlan
 * TerminalManagementActionResult4Code.InvalidDelegationInManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#DelegationParametersReceivedUnauthorized
 * TerminalManagementActionResult4Code.DelegationParametersReceivedUnauthorized}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#AnyError
 * TerminalManagementActionResult4Code.AnyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#CommunicationError
 * TerminalManagementActionResult4Code.CommunicationError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code#UnlistedError
 * TerminalManagementActionResult4Code.UnlistedError}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionResult4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Final result of the processed terminal management action."</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
 * TerminalManagementActionResult3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionResult4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccessDenied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#AccessDenied
	 * TerminalManagementActionResult3Code.AccessDenied}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code AccessDenied = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessDenied";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.AccessDenied;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.AccessDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConnectionError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#ConnectionError
	 * TerminalManagementActionResult3Code.ConnectionError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code ConnectionError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConnectionError";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.ConnectionError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.ConnectionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#FormatError
	 * TerminalManagementActionResult3Code.FormatError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code FormatError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.FormatError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidContent
	 * TerminalManagementActionResult3Code.InvalidContent}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code InvalidContent = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidContent";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.InvalidContent;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidContent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LengthError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#LengthError
	 * TerminalManagementActionResult3Code.LengthError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code LengthError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthError";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.LengthError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.LengthError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemoryOverflow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MemoryOverflow
	 * TerminalManagementActionResult3Code.MemoryOverflow}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code MemoryOverflow = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoryOverflow";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.MemoryOverflow;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.MemoryOverflow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MissingFile
	 * TerminalManagementActionResult3Code.MissingFile}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code MissingFile = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingFile";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.MissingFile;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.MissingFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#NotSupported
	 * TerminalManagementActionResult3Code.NotSupported}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code NotSupported = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.NotSupported;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.NotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SignatureError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SignatureError
	 * TerminalManagementActionResult3Code.SignatureError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code SignatureError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureError";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.SignatureError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.SignatureError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Success
	 * TerminalManagementActionResult3Code.Success}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code Success = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.Success;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.Success.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyntaxError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SyntaxError
	 * TerminalManagementActionResult3Code.SyntaxError}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code SyntaxError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyntaxError";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.SyntaxError;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.SyntaxError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Timeout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Timeout
	 * TerminalManagementActionResult3Code.Timeout}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code Timeout = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timeout";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.Timeout;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.Timeout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownData
	 * TerminalManagementActionResult3Code.UnknownData}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code UnknownData = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownData";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.UnknownData;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownKeyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownKeyReference
	 * TerminalManagementActionResult3Code.UnknownKeyReference}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code UnknownKeyReference = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownKeyReference";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.UnknownKeyReference;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownKeyReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationProof"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidDelegationProof
	 * TerminalManagementActionResult3Code.InvalidDelegationProof}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code InvalidDelegationProof = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.InvalidDelegationProof;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidDelegationProof.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDelegationInManagementPlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidDelegationInManagementPlan
	 * TerminalManagementActionResult3Code.InvalidDelegationInManagementPlan}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code InvalidDelegationInManagementPlan = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.InvalidDelegationInManagementPlan;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidDelegationInManagementPlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DelegationParametersReceivedUnauthorized"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#DelegationParametersReceivedUnauthorized
	 * TerminalManagementActionResult3Code.
	 * DelegationParametersReceivedUnauthorized}</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code DelegationParametersReceivedUnauthorized = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			previousVersion_lazy = () -> TerminalManagementActionResult3Code.DelegationParametersReceivedUnauthorized;
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.DelegationParametersReceivedUnauthorized.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code AnyError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.AnyError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommunicationError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code CommunicationError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommunicationError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.CommunicationError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult4Code
	 * TerminalManagementActionResult4Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnlistedError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult4Code UnlistedError = new TerminalManagementActionResult4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnlistedError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult4Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnlistedError.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionResult4Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionResult4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResult4Code";
				definition = "Final result of the processed terminal management action.";
				previousVersion_lazy = () -> TerminalManagementActionResult3Code.mmObject();
				trace_lazy = () -> TerminalManagementActionResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResult4Code.AccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.ConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.FormatError, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.InvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.LengthError, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.MemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.MissingFile, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.SignatureError, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.UnknownData, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.UnknownKeyReference,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.InvalidDelegationProof, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.InvalidDelegationInManagementPlan,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.DelegationParametersReceivedUnauthorized, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.AnyError,
						com.tools20022.repository.codeset.TerminalManagementActionResult4Code.CommunicationError, com.tools20022.repository.codeset.TerminalManagementActionResult4Code.UnlistedError);
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
		codesByName.put(AnyError.getCodeName().get(), AnyError);
		codesByName.put(CommunicationError.getCodeName().get(), CommunicationError);
		codesByName.put(UnlistedError.getCodeName().get(), UnlistedError);
	}

	public static TerminalManagementActionResult4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionResult4Code[] values() {
		TerminalManagementActionResult4Code[] values = new TerminalManagementActionResult4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionResult4Code> {
		@Override
		public TerminalManagementActionResult4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionResult4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}