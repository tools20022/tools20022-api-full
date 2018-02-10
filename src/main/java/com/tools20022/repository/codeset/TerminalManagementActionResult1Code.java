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
import com.tools20022.repository.codeset.TerminalManagementActionResult1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#AccessDenied
 * TerminalManagementActionResult1Code.AccessDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#ConnectionError
 * TerminalManagementActionResult1Code.ConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#FormatError
 * TerminalManagementActionResult1Code.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#InvalidContent
 * TerminalManagementActionResult1Code.InvalidContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#LengthError
 * TerminalManagementActionResult1Code.LengthError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#MemoryOverflow
 * TerminalManagementActionResult1Code.MemoryOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#MissingFile
 * TerminalManagementActionResult1Code.MissingFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#NotSupported
 * TerminalManagementActionResult1Code.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#SignatureError
 * TerminalManagementActionResult1Code.SignatureError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#Success
 * TerminalManagementActionResult1Code.Success}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#SyntaxError
 * TerminalManagementActionResult1Code.SyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#Timeout
 * TerminalManagementActionResult1Code.Timeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#UnknownData
 * TerminalManagementActionResult1Code.UnknownData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code#UnknownKeyReference
 * TerminalManagementActionResult1Code.UnknownKeyReference}</li>
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
 * "TerminalManagementActionResult1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Final result of the processed terminal management action."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code
 * TerminalManagementActionResult3Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionResult1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#AccessDenied
	 * TerminalManagementActionResult3Code.AccessDenied}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code AccessDenied = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccessDenied";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.AccessDenied);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.AccessDenied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#ConnectionError
	 * TerminalManagementActionResult3Code.ConnectionError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code ConnectionError = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConnectionError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.ConnectionError);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.ConnectionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#FormatError
	 * TerminalManagementActionResult3Code.FormatError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code FormatError = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.FormatError);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#InvalidContent
	 * TerminalManagementActionResult3Code.InvalidContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code InvalidContent = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidContent";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.InvalidContent);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.InvalidContent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#LengthError
	 * TerminalManagementActionResult3Code.LengthError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code LengthError = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.LengthError);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.LengthError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MemoryOverflow
	 * TerminalManagementActionResult3Code.MemoryOverflow}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code MemoryOverflow = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemoryOverflow";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.MemoryOverflow);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.MemoryOverflow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#MissingFile
	 * TerminalManagementActionResult3Code.MissingFile}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code MissingFile = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingFile";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.MissingFile);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.MissingFile.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#NotSupported
	 * TerminalManagementActionResult3Code.NotSupported}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code NotSupported = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.NotSupported);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.NotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SignatureError
	 * TerminalManagementActionResult3Code.SignatureError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code SignatureError = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SignatureError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.SignatureError);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.SignatureError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Success
	 * TerminalManagementActionResult3Code.Success}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code Success = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.Success);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.Success.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#SyntaxError
	 * TerminalManagementActionResult3Code.SyntaxError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code SyntaxError = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyntaxError";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.SyntaxError);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.SyntaxError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#Timeout
	 * TerminalManagementActionResult3Code.Timeout}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code Timeout = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timeout";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.Timeout);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.Timeout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownData
	 * TerminalManagementActionResult3Code.UnknownData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code UnknownData = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownData";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.UnknownData);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult1Code
	 * TerminalManagementActionResult1Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult3Code#UnknownKeyReference
	 * TerminalManagementActionResult3Code.UnknownKeyReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult1Code UnknownKeyReference = new TerminalManagementActionResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownKeyReference";
			nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.UnknownKeyReference);
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult1Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownKeyReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionResult1Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionResult1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACCD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResult1Code";
				definition = "Final result of the processed terminal management action.";
				nextVersions_lazy = () -> Arrays.asList(TerminalManagementActionResult3Code.mmObject());
				trace_lazy = () -> TerminalManagementActionResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResult1Code.AccessDenied, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.ConnectionError,
						com.tools20022.repository.codeset.TerminalManagementActionResult1Code.FormatError, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.InvalidContent,
						com.tools20022.repository.codeset.TerminalManagementActionResult1Code.LengthError, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.MemoryOverflow,
						com.tools20022.repository.codeset.TerminalManagementActionResult1Code.MissingFile, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResult1Code.SignatureError, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResult1Code.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResult1Code.UnknownData, com.tools20022.repository.codeset.TerminalManagementActionResult1Code.UnknownKeyReference);
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
	}

	public static TerminalManagementActionResult1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionResult1Code[] values() {
		TerminalManagementActionResult1Code[] values = new TerminalManagementActionResult1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionResult1Code> {
		@Override
		public TerminalManagementActionResult1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionResult1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}