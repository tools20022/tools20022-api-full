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
import com.tools20022.repository.codeset.ATMCommandReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason for sending the command.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code#Diagnostic
 * ATMCommandReason1Code.Diagnostic}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code#Monitoring
 * ATMCommandReason1Code.Monitoring}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code#SecurityError
 * ATMCommandReason1Code.SecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code#Synchronisation
 * ATMCommandReason1Code.Synchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code#Update
 * ATMCommandReason1Code.Update}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCommandReasonCode
 * ATMCommandReasonCode}</li>
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
 * "ATMCommandReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason for sending the command."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCommandReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Diagnostic"</li>
	 * </ul>
	 */
	public static final ATMCommandReason1Code Diagnostic = new ATMCommandReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Diagnostic";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandReason1Code.mmObject();
			codeName = ATMCommandReasonCode.Diagnostic.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Monitoring"</li>
	 * </ul>
	 */
	public static final ATMCommandReason1Code Monitoring = new ATMCommandReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Monitoring";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandReason1Code.mmObject();
			codeName = ATMCommandReasonCode.Monitoring.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityError"</li>
	 * </ul>
	 */
	public static final ATMCommandReason1Code SecurityError = new ATMCommandReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityError";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandReason1Code.mmObject();
			codeName = ATMCommandReasonCode.SecurityError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Synchronisation"</li>
	 * </ul>
	 */
	public static final ATMCommandReason1Code Synchronisation = new ATMCommandReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Synchronisation";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandReason1Code.mmObject();
			codeName = ATMCommandReasonCode.Synchronisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCommandReason1Code
	 * ATMCommandReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Update"</li>
	 * </ul>
	 */
	public static final ATMCommandReason1Code Update = new ATMCommandReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Update";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCommandReason1Code.mmObject();
			codeName = ATMCommandReasonCode.Update.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCommandReason1Code> codesByName = new LinkedHashMap<>();

	protected ATMCommandReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCommandReason1Code";
				definition = "Reason for sending the command.";
				trace_lazy = () -> ATMCommandReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCommandReason1Code.Diagnostic, com.tools20022.repository.codeset.ATMCommandReason1Code.Monitoring,
						com.tools20022.repository.codeset.ATMCommandReason1Code.SecurityError, com.tools20022.repository.codeset.ATMCommandReason1Code.Synchronisation, com.tools20022.repository.codeset.ATMCommandReason1Code.Update);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Diagnostic.getCodeName().get(), Diagnostic);
		codesByName.put(Monitoring.getCodeName().get(), Monitoring);
		codesByName.put(SecurityError.getCodeName().get(), SecurityError);
		codesByName.put(Synchronisation.getCodeName().get(), Synchronisation);
		codesByName.put(Update.getCodeName().get(), Update);
	}

	public static ATMCommandReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCommandReason1Code[] values() {
		ATMCommandReason1Code[] values = new ATMCommandReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCommandReason1Code> {
		@Override
		public ATMCommandReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCommandReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}