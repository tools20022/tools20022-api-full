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
import com.tools20022.repository.codeset.FinancingStatusReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the coded reason for the financing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
 * FinancingStatusReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmCancellationRequestOutOfTime
 * FinancingStatusReason1Code.mmCancellationRequestOutOfTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmNoMatchingFinancingRequest
 * FinancingStatusReason1Code.mmNoMatchingFinancingRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmIncorrectAccountNumber
 * FinancingStatusReason1Code.mmIncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmClosedAccountNumber
 * FinancingStatusReason1Code.mmClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmBlockedAccount
 * FinancingStatusReason1Code.mmBlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmUnrecognisedFinancingRequestor
 * FinancingStatusReason1Code.mmUnrecognisedFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmUnrecognisedIntermediaryAgent
 * FinancingStatusReason1Code.mmUnrecognisedIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmUnexpectedIntermediaryAgent
 * FinancingStatusReason1Code.mmUnexpectedIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmUnrecognisedParty
 * FinancingStatusReason1Code.mmUnrecognisedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmInvalidPaymentDueDate
 * FinancingStatusReason1Code.mmInvalidPaymentDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmDuplicatedRequestMessage
 * FinancingStatusReason1Code.mmDuplicatedRequestMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmWrongIdentification
 * FinancingStatusReason1Code.mmWrongIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmInvalidDocumentNumber
 * FinancingStatusReason1Code.mmInvalidDocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmMissingMandatoryInformation
 * FinancingStatusReason1Code.mmMissingMandatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmNarrative
 * FinancingStatusReason1Code.mmNarrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#mmFinancingProcessAlreadyInitiated
 * FinancingStatusReason1Code.mmFinancingProcessAlreadyInitiated}</li>
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
 * <li>"CA01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the coded reason for the financing status."</li>
 * </ul>
 */
public class FinancingStatusReason1Code extends FinancingStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestOutOfTime"</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationRequestOutOfTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestOutOfTime";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingFinancingRequest"</li>
	 * </ul>
	 */
	public static final MMCode mmNoMatchingFinancingRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingFinancingRequest";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountNumber";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccountNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmBlockedAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAccount";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedFinancingRequestor"</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedFinancingRequestor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedFinancingRequestor";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIntermediaryAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedIntermediaryAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIntermediaryAgent";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedIntermediaryAgent"</li>
	 * </ul>
	 */
	public static final MMCode mmUnexpectedIntermediaryAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedIntermediaryAgent";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedParty"</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedParty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedParty";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPaymentDueDate"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidPaymentDueDate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPaymentDueDate";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatedRequestMessage"</li>
	 * </ul>
	 */
	public static final MMCode mmDuplicatedRequestMessage = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatedRequestMessage";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongIdentification"</li>
	 * </ul>
	 */
	public static final MMCode mmWrongIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongIdentification";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDocumentNumber"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidDocumentNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDocumentNumber";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMandatoryInformation"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingMandatoryInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMandatoryInformation";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * </ul>
	 */
	public static final MMCode mmNarrative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingProcessAlreadyInitiated"</li>
	 * </ul>
	 */
	public static final MMCode mmFinancingProcessAlreadyInitiated = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingProcessAlreadyInitiated";
			owner_lazy = () -> FinancingStatusReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CA01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingStatusReason1Code";
				definition = "Specifies the coded reason for the financing status.";
				code_lazy = () -> Arrays.asList(FinancingStatusReason1Code.mmCancellationRequestOutOfTime, FinancingStatusReason1Code.mmNoMatchingFinancingRequest, FinancingStatusReason1Code.mmIncorrectAccountNumber,
						FinancingStatusReason1Code.mmClosedAccountNumber, FinancingStatusReason1Code.mmBlockedAccount, FinancingStatusReason1Code.mmUnrecognisedFinancingRequestor, FinancingStatusReason1Code.mmUnrecognisedIntermediaryAgent,
						FinancingStatusReason1Code.mmUnexpectedIntermediaryAgent, FinancingStatusReason1Code.mmUnrecognisedParty, FinancingStatusReason1Code.mmInvalidPaymentDueDate, FinancingStatusReason1Code.mmDuplicatedRequestMessage,
						FinancingStatusReason1Code.mmWrongIdentification, FinancingStatusReason1Code.mmInvalidDocumentNumber, FinancingStatusReason1Code.mmMissingMandatoryInformation, FinancingStatusReason1Code.mmNarrative,
						FinancingStatusReason1Code.mmFinancingProcessAlreadyInitiated);
				trace_lazy = () -> FinancingStatusReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}