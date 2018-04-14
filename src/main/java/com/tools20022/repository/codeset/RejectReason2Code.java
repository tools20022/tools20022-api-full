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
import com.tools20022.repository.codeset.RejectReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason of transmission of a rejection message in response to a request or an
 * advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#UnableToProcess
 * RejectReason2Code.UnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#InvalidMessage
 * RejectReason2Code.InvalidMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#ParsingError
 * RejectReason2Code.ParsingError}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectReason2Code#Security
 * RejectReason2Code.Security}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#InitiatingParty
 * RejectReason2Code.InitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#RecipientParty
 * RejectReason2Code.RecipientParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#ProtocolVersion
 * RejectReason2Code.ProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#MessageType
 * RejectReason2Code.MessageType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
 * RejectReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason of transmission of a rejection message in response to a request or an advice."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UNPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code
 * RejectReason1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#UnableToProcess
	 * RejectReason1Code.UnableToProcess}</li>
	 * </ul>
	 */
	public static final RejectReason2Code UnableToProcess = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcess";
			previousVersion_lazy = () -> RejectReason1Code.UnableToProcess;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.UnableToProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#InvalidMessage
	 * RejectReason1Code.InvalidMessage}</li>
	 * </ul>
	 */
	public static final RejectReason2Code InvalidMessage = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMessage";
			previousVersion_lazy = () -> RejectReason1Code.InvalidMessage;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.InvalidMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParsingError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#ParsingError
	 * RejectReason1Code.ParsingError}</li>
	 * </ul>
	 */
	public static final RejectReason2Code ParsingError = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParsingError";
			previousVersion_lazy = () -> RejectReason1Code.ParsingError;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.ParsingError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#Security
	 * RejectReason1Code.Security}</li>
	 * </ul>
	 */
	public static final RejectReason2Code Security = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			previousVersion_lazy = () -> RejectReason1Code.Security;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.Security.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#InitiatingParty
	 * RejectReason1Code.InitiatingParty}</li>
	 * </ul>
	 */
	public static final RejectReason2Code InitiatingParty = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			previousVersion_lazy = () -> RejectReason1Code.InitiatingParty;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.InitiatingParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#RecipientParty
	 * RejectReason1Code.RecipientParty}</li>
	 * </ul>
	 */
	public static final RejectReason2Code RecipientParty = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			previousVersion_lazy = () -> RejectReason1Code.RecipientParty;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.RecipientParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#ProtocolVersion
	 * RejectReason1Code.ProtocolVersion}</li>
	 * </ul>
	 */
	public static final RejectReason2Code ProtocolVersion = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			previousVersion_lazy = () -> RejectReason1Code.ProtocolVersion;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.ProtocolVersion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#MessageType
	 * RejectReason1Code.MessageType}</li>
	 * </ul>
	 */
	public static final RejectReason2Code MessageType = new RejectReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageType";
			previousVersion_lazy = () -> RejectReason1Code.MessageType;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectReason2Code.mmObject();
			codeName = RejectReasonCode.MessageType.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectReason2Code> codesByName = new LinkedHashMap<>();

	protected RejectReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UNPR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectReason2Code";
				definition = "Reason of transmission of a rejection message in response to a request or an advice.";
				previousVersion_lazy = () -> RejectReason1Code.mmObject();
				trace_lazy = () -> RejectReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectReason2Code.UnableToProcess, com.tools20022.repository.codeset.RejectReason2Code.InvalidMessage,
						com.tools20022.repository.codeset.RejectReason2Code.ParsingError, com.tools20022.repository.codeset.RejectReason2Code.Security, com.tools20022.repository.codeset.RejectReason2Code.InitiatingParty,
						com.tools20022.repository.codeset.RejectReason2Code.RecipientParty, com.tools20022.repository.codeset.RejectReason2Code.ProtocolVersion, com.tools20022.repository.codeset.RejectReason2Code.MessageType);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnableToProcess.getCodeName().get(), UnableToProcess);
		codesByName.put(InvalidMessage.getCodeName().get(), InvalidMessage);
		codesByName.put(ParsingError.getCodeName().get(), ParsingError);
		codesByName.put(Security.getCodeName().get(), Security);
		codesByName.put(InitiatingParty.getCodeName().get(), InitiatingParty);
		codesByName.put(RecipientParty.getCodeName().get(), RecipientParty);
		codesByName.put(ProtocolVersion.getCodeName().get(), ProtocolVersion);
		codesByName.put(MessageType.getCodeName().get(), MessageType);
	}

	public static RejectReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectReason2Code[] values() {
		RejectReason2Code[] values = new RejectReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectReason2Code> {
		@Override
		public RejectReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}