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
import com.tools20022.repository.codeset.RejectReasonCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason of transmission of a rejection message in response to a request or an
 * advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectReasonCode
 * RejectReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmUnableToProcess
 * RejectReason2Code.mmUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmInvalidMessage
 * RejectReason2Code.mmInvalidMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmParsingError
 * RejectReason2Code.mmParsingError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmSecurity
 * RejectReason2Code.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmInitiatingParty
 * RejectReason2Code.mmInitiatingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmRecipientParty
 * RejectReason2Code.mmRecipientParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmProtocolVersion
 * RejectReason2Code.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code#mmMessageType
 * RejectReason2Code.mmMessageType}</li>
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
 * <li>"UNPR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason of transmission of a rejection message in response to a request or an advice."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code
 * RejectReason1Code}</li>
 * </ul>
 */
public class RejectReason2Code extends RejectReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason2Code
	 * RejectReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmUnableToProcess
	 * RejectReason1Code.mmUnableToProcess}</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcess";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmUnableToProcess;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmInvalidMessage
	 * RejectReason1Code.mmInvalidMessage}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMessage = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMessage";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmInvalidMessage;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParsingError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmParsingError
	 * RejectReason1Code.mmParsingError}</li>
	 * </ul>
	 */
	public static final MMCode mmParsingError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParsingError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmParsingError;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmSecurity
	 * RejectReason1Code.mmSecurity}</li>
	 * </ul>
	 */
	public static final MMCode mmSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmSecurity;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmInitiatingParty
	 * RejectReason1Code.mmInitiatingParty}</li>
	 * </ul>
	 */
	public static final MMCode mmInitiatingParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmInitiatingParty;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmRecipientParty
	 * RejectReason1Code.mmRecipientParty}</li>
	 * </ul>
	 */
	public static final MMCode mmRecipientParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmRecipientParty;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmProtocolVersion
	 * RejectReason1Code.mmProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMCode mmProtocolVersion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmProtocolVersion;
			owner_lazy = () -> RejectReason2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectReason1Code#mmMessageType
	 * RejectReason1Code.mmMessageType}</li>
	 * </ul>
	 */
	public static final MMCode mmMessageType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageType";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectReason1Code.mmMessageType;
			owner_lazy = () -> RejectReason2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("UNPR");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectReason2Code";
				definition = "Reason of transmission of a rejection message in response to a request or an advice.";
				previousVersion_lazy = () -> RejectReason1Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectReason2Code.mmUnableToProcess, com.tools20022.repository.codeset.RejectReason2Code.mmInvalidMessage,
						com.tools20022.repository.codeset.RejectReason2Code.mmParsingError, com.tools20022.repository.codeset.RejectReason2Code.mmSecurity, com.tools20022.repository.codeset.RejectReason2Code.mmInitiatingParty,
						com.tools20022.repository.codeset.RejectReason2Code.mmRecipientParty, com.tools20022.repository.codeset.RejectReason2Code.mmProtocolVersion, com.tools20022.repository.codeset.RejectReason2Code.mmMessageType);
				trace_lazy = () -> RejectReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}