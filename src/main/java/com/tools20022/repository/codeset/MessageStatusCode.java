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
import com.tools20022.repository.codeset.MessageStatusCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.MessageStatusCode#Accepted
 * MessageStatusCode.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode#AcceptedTechnicalValidation
 * MessageStatusCode.AcceptedTechnicalValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode#PartiallyAccepted
 * MessageStatusCode.PartiallyAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageStatusCode#Received
 * MessageStatusCode.Received}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageStatusCode#Rejected
 * MessageStatusCode.Rejected}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageStatusCode#Reminder
 * MessageStatusCode.Reminder}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageStatusCode#Warning
 * MessageStatusCode.Warning}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode#CorruptedFile
 * MessageStatusCode.CorruptedFile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode#IncorrectFilename
 * MessageStatusCode.IncorrectFilename}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ReportingMessageStatus1Code
 * ReportingMessageStatus1Code}</li>
 * </ul>
 * </li>
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
 * "MessageStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of a whole message processing."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Whole message has been accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Whole message has been accepted."</li>
	 * </ul>
	 */
	public static final MessageStatusCode Accepted = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Whole message has been accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "ACPT";
		}
	};
	/**
	 * Message has passed syntactical validation but further validations have
	 * not been completed yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptedTechnicalValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message has passed syntactical validation but further validations have not been completed yet."
	 * </li>
	 * </ul>
	 */
	public static final MessageStatusCode AcceptedTechnicalValidation = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptedTechnicalValidation";
			definition = "Message has passed syntactical validation but further validations have not been completed yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Message has been partially accepted. A number of transactions have been
	 * accepted, whereas another number of transactions have not yet been
	 * accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted."
	 * </li>
	 * </ul>
	 */
	public static final MessageStatusCode PartiallyAccepted = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyAccepted";
			definition = "Message has been partially accepted. A number of transactions have been accepted, whereas another number of transactions have not yet been accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Message has been received but not processed yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCVD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Received"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message has been received but not processed yet."</li>
	 * </ul>
	 */
	public static final MessageStatusCode Received = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Received";
			definition = "Message has been received but not processed yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "RCVD";
		}
	};
	/**
	 * Message has been rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message has been rejected."</li>
	 * </ul>
	 */
	public static final MessageStatusCode Rejected = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			definition = "Message has been rejected.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Reminder of a non received message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reminder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reminder of a non received message."</li>
	 * </ul>
	 */
	public static final MessageStatusCode Reminder = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reminder";
			definition = "Reminder of a non received message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "RMDR";
		}
	};
	/**
	 * Message has been accepted with warnings.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Warning"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message has been accepted with warnings."</li>
	 * </ul>
	 */
	public static final MessageStatusCode Warning = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Warning";
			definition = "Message has been accepted with warnings.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "WARN";
		}
	};
	/**
	 * File containing the report is corrupted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorruptedFile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File containing the report is corrupted."</li>
	 * </ul>
	 */
	public static final MessageStatusCode CorruptedFile = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorruptedFile";
			definition = "File containing the report is corrupted.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "CRPT";
		}
	};
	/**
	 * File containing the report has an incorrect filename.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageStatusCode
	 * MessageStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectFilename"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "File containing the report has an incorrect filename."</li>
	 * </ul>
	 */
	public static final MessageStatusCode IncorrectFilename = new MessageStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectFilename";
			definition = "File containing the report has an incorrect filename.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageStatusCode.mmObject();
			codeName = "INCF";
		}
	};
	final static private LinkedHashMap<String, MessageStatusCode> codesByName = new LinkedHashMap<>();

	protected MessageStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageStatusCode";
				definition = "Specifies the status of a whole message processing.";
				derivation_lazy = () -> Arrays.asList(ReportingMessageStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageStatusCode.Accepted, com.tools20022.repository.codeset.MessageStatusCode.AcceptedTechnicalValidation,
						com.tools20022.repository.codeset.MessageStatusCode.PartiallyAccepted, com.tools20022.repository.codeset.MessageStatusCode.Received, com.tools20022.repository.codeset.MessageStatusCode.Rejected,
						com.tools20022.repository.codeset.MessageStatusCode.Reminder, com.tools20022.repository.codeset.MessageStatusCode.Warning, com.tools20022.repository.codeset.MessageStatusCode.CorruptedFile,
						com.tools20022.repository.codeset.MessageStatusCode.IncorrectFilename);
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
		codesByName.put(CorruptedFile.getCodeName().get(), CorruptedFile);
		codesByName.put(IncorrectFilename.getCodeName().get(), IncorrectFilename);
	}

	public static MessageStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageStatusCode[] values() {
		MessageStatusCode[] values = new MessageStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageStatusCode> {
		@Override
		public MessageStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}