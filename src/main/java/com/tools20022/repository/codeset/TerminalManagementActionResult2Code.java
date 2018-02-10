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
import com.tools20022.repository.codeset.TerminalManagementActionResult2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Final result of the processed command at the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#ConnectionError
 * TerminalManagementActionResult2Code.ConnectionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#FormatError
 * TerminalManagementActionResult2Code.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#Hardware
 * TerminalManagementActionResult2Code.Hardware}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#NotSupported
 * TerminalManagementActionResult2Code.NotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#Security
 * TerminalManagementActionResult2Code.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#Success
 * TerminalManagementActionResult2Code.Success}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#SyntaxError
 * TerminalManagementActionResult2Code.SyntaxError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#Timeout
 * TerminalManagementActionResult2Code.Timeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code#UnknownKeyReference
 * TerminalManagementActionResult2Code.UnknownKeyReference}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TerminalManagementActionResult2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Final result of the processed command at the ATM."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TerminalManagementActionResult2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConnectionError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code ConnectionError = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConnectionError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.ConnectionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code FormatError = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Hardware"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code Hardware = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Hardware";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.Hardware.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSupported"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code NotSupported = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.NotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code Security = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.Security.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Success"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code Success = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Success";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.Success.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyntaxError"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code SyntaxError = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyntaxError";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.SyntaxError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Timeout"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code Timeout = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Timeout";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.Timeout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementActionResult2Code
	 * TerminalManagementActionResult2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownKeyReference"</li>
	 * </ul>
	 */
	public static final TerminalManagementActionResult2Code UnknownKeyReference = new TerminalManagementActionResult2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownKeyReference";
			owner_lazy = () -> com.tools20022.repository.codeset.TerminalManagementActionResult2Code.mmObject();
			codeName = TerminalManagementActionResultCode.UnknownKeyReference.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TerminalManagementActionResult2Code> codesByName = new LinkedHashMap<>();

	protected TerminalManagementActionResult2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TerminalManagementActionResult2Code";
				definition = "Final result of the processed command at the ATM.";
				trace_lazy = () -> TerminalManagementActionResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TerminalManagementActionResult2Code.ConnectionError, com.tools20022.repository.codeset.TerminalManagementActionResult2Code.FormatError,
						com.tools20022.repository.codeset.TerminalManagementActionResult2Code.Hardware, com.tools20022.repository.codeset.TerminalManagementActionResult2Code.NotSupported,
						com.tools20022.repository.codeset.TerminalManagementActionResult2Code.Security, com.tools20022.repository.codeset.TerminalManagementActionResult2Code.Success,
						com.tools20022.repository.codeset.TerminalManagementActionResult2Code.SyntaxError, com.tools20022.repository.codeset.TerminalManagementActionResult2Code.Timeout,
						com.tools20022.repository.codeset.TerminalManagementActionResult2Code.UnknownKeyReference);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ConnectionError.getCodeName().get(), ConnectionError);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(Hardware.getCodeName().get(), Hardware);
		codesByName.put(NotSupported.getCodeName().get(), NotSupported);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(Success.getCodeName().get(), Success);
		codesByName.put(SyntaxError.getCodeName().get(), SyntaxError);
		codesByName.put(Timeout.getCodeName().get(), Timeout);
		codesByName.put(UnknownKeyReference.getCodeName().get(), UnknownKeyReference);
	}

	public static TerminalManagementActionResult2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TerminalManagementActionResult2Code[] values() {
		TerminalManagementActionResult2Code[] values = new TerminalManagementActionResult2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TerminalManagementActionResult2Code> {
		@Override
		public TerminalManagementActionResult2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TerminalManagementActionResult2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}