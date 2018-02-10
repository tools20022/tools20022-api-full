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
import com.tools20022.repository.codeset.ReportingMessageStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a whole message processing.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#Accepted
 * ReportingMessageStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#AcceptedTechnicalValidation
 * ReportingMessageStatus1Code.AcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#PartiallyAccepted
 * ReportingMessageStatus1Code.PartiallyAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#Received
 * ReportingMessageStatus1Code.Received}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#Rejected
 * ReportingMessageStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#Reminder
 * ReportingMessageStatus1Code.Reminder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#Warning
 * ReportingMessageStatus1Code.Warning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#IncorrectFilename
 * ReportingMessageStatus1Code.IncorrectFilename}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code#CorruptedFile
 * ReportingMessageStatus1Code.CorruptedFile}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
 * MessageStatusCode}</li>
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
 * "ReportingMessageStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a whole message processing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ReportingMessageStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code Accepted = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code AcceptedTechnicalValidation = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.AcceptedTechnicalValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAccepted"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code PartiallyAccepted = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.PartiallyAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code Received = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.Received.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code Rejected = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code Reminder = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.Reminder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warning"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code Warning = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.Warning.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFilename"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code IncorrectFilename = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFilename";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.IncorrectFilename.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
	 * ReportingMessageStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorruptedFile"</li>
	 * </ul>
	 */
	public static final ReportingMessageStatus1Code CorruptedFile = new ReportingMessageStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorruptedFile";
			owner_lazy = () -> com.tools20022.repository.codeset.ReportingMessageStatus1Code.mmObject();
			codeName = MessageStatusCode.CorruptedFile.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ReportingMessageStatus1Code> codesByName = new LinkedHashMap<>();

	protected ReportingMessageStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReportingMessageStatus1Code";
				definition = "Specifies the status of a whole message processing.";
				trace_lazy = () -> MessageStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ReportingMessageStatus1Code.Accepted, com.tools20022.repository.codeset.ReportingMessageStatus1Code.AcceptedTechnicalValidation,
						com.tools20022.repository.codeset.ReportingMessageStatus1Code.PartiallyAccepted, com.tools20022.repository.codeset.ReportingMessageStatus1Code.Received,
						com.tools20022.repository.codeset.ReportingMessageStatus1Code.Rejected, com.tools20022.repository.codeset.ReportingMessageStatus1Code.Reminder, com.tools20022.repository.codeset.ReportingMessageStatus1Code.Warning,
						com.tools20022.repository.codeset.ReportingMessageStatus1Code.IncorrectFilename, com.tools20022.repository.codeset.ReportingMessageStatus1Code.CorruptedFile);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(AcceptedTechnicalValidation.getCodeName().get(), AcceptedTechnicalValidation);
		codesByName.put(PartiallyAccepted.getCodeName().get(), PartiallyAccepted);
		codesByName.put(Received.getCodeName().get(), Received);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Reminder.getCodeName().get(), Reminder);
		codesByName.put(Warning.getCodeName().get(), Warning);
		codesByName.put(IncorrectFilename.getCodeName().get(), IncorrectFilename);
		codesByName.put(CorruptedFile.getCodeName().get(), CorruptedFile);
	}

	public static ReportingMessageStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ReportingMessageStatus1Code[] values() {
		ReportingMessageStatus1Code[] values = new ReportingMessageStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ReportingMessageStatus1Code> {
		@Override
		public ReportingMessageStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ReportingMessageStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}