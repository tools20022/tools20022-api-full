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
import com.tools20022.repository.codeset.TerminalManagementActionResultCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Final result of the processed terminal management action.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResultCode
 * TerminalManagementActionResultCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmAccessDenied
 * TerminalManagementActionResult3Code.mmAccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmConnectionError
 * TerminalManagementActionResult3Code.mmConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmFormatError
 * TerminalManagementActionResult3Code.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmInvalidContent
 * TerminalManagementActionResult3Code.mmInvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmLengthError
 * TerminalManagementActionResult3Code.mmLengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmMemoryOverflow
 * TerminalManagementActionResult3Code.mmMemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmMissingFile
 * TerminalManagementActionResult3Code.mmMissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmNotSupported
 * TerminalManagementActionResult3Code.mmNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmSignatureError
 * TerminalManagementActionResult3Code.mmSignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmSuccess
 * TerminalManagementActionResult3Code.mmSuccess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmSyntaxError
 * TerminalManagementActionResult3Code.mmSyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmTimeout
 * TerminalManagementActionResult3Code.mmTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmUnknownData
 * TerminalManagementActionResult3Code.mmUnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmUnknownKeyReference
 * TerminalManagementActionResult3Code.mmUnknownKeyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmInvalidDelegationProof
 * TerminalManagementActionResult3Code.mmInvalidDelegationProof}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmInvalidDelegationInManagementPlan
 * TerminalManagementActionResult3Code.mmInvalidDelegationInManagementPlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#mmDelegationParametersReceivedUnauthorized
 * TerminalManagementActionResult3Code.
 * mmDelegationParametersReceivedUnauthorized}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
 * TerminalManagementActionResult1Code}</li>
 * </ul>
 */
public class TerminalManagementActionResult3Code extends TerminalManagementActionResultCode {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmAccessDenied
	 * TerminalManagementActionResult1Code.mmAccessDenied}</li>
	 * </ul>
	 */
	public static final MMCode mmAccessDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessDenied";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmAccessDenied;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmConnectionError
	 * TerminalManagementActionResult1Code.mmConnectionError}</li>
	 * </ul>
	 */
	public static final MMCode mmConnectionError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConnectionError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmConnectionError;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmFormatError
	 * TerminalManagementActionResult1Code.mmFormatError}</li>
	 * </ul>
	 */
	public static final MMCode mmFormatError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmFormatError;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmInvalidContent
	 * TerminalManagementActionResult1Code.mmInvalidContent}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidContent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidContent";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmInvalidContent;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmLengthError
	 * TerminalManagementActionResult1Code.mmLengthError}</li>
	 * </ul>
	 */
	public static final MMCode mmLengthError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmLengthError;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmMemoryOverflow
	 * TerminalManagementActionResult1Code.mmMemoryOverflow}</li>
	 * </ul>
	 */
	public static final MMCode mmMemoryOverflow = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoryOverflow";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmMemoryOverflow;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmMissingFile
	 * TerminalManagementActionResult1Code.mmMissingFile}</li>
	 * </ul>
	 */
	public static final MMCode mmMissingFile = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingFile";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmMissingFile;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmNotSupported
	 * TerminalManagementActionResult1Code.mmNotSupported}</li>
	 * </ul>
	 */
	public static final MMCode mmNotSupported = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmNotSupported;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmSignatureError
	 * TerminalManagementActionResult1Code.mmSignatureError}</li>
	 * </ul>
	 */
	public static final MMCode mmSignatureError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmSignatureError;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmSuccess
	 * TerminalManagementActionResult1Code.mmSuccess}</li>
	 * </ul>
	 */
	public static final MMCode mmSuccess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmSuccess;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmSyntaxError
	 * TerminalManagementActionResult1Code.mmSyntaxError}</li>
	 * </ul>
	 */
	public static final MMCode mmSyntaxError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyntaxError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmSyntaxError;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmTimeout
	 * TerminalManagementActionResult1Code.mmTimeout}</li>
	 * </ul>
	 */
	public static final MMCode mmTimeout = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timeout";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmTimeout;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmUnknownData
	 * TerminalManagementActionResult1Code.mmUnknownData}</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownData";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmUnknownData;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#mmUnknownKeyReference
	 * TerminalManagementActionResult1Code.mmUnknownKeyReference}</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownKeyReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownKeyReference";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmUnknownKeyReference;
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * </ul>
	 */
	public static final MMCode mmInvalidDelegationProof = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationProof";
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * </ul>
	 */
	public static final MMCode mmInvalidDelegationInManagementPlan = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDelegationInManagementPlan";
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
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
	 * </ul>
	 */
	public static final MMCode mmDelegationParametersReceivedUnauthorized = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DelegationParametersReceivedUnauthorized";
			owner_lazy = () -> TerminalManagementActionResult3Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResult3Code";
				definition = "Final result of the processed terminal management action.";
				previousVersion_lazy = () -> TerminalManagementActionResult1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmAccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmFormatError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmInvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmLengthError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmMemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmMissingFile, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmNotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmSignatureError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmSuccess,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmSyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmTimeout,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmUnknownData, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmUnknownKeyReference,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmInvalidDelegationProof, com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmInvalidDelegationInManagementPlan,
						com.tools20022.repository.codeset.TerminalManagementActionResult3Code.mmDelegationParametersReceivedUnauthorized);
				trace_lazy = () -> TerminalManagementActionResultCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}