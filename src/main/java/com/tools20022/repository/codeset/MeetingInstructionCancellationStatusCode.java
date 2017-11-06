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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a meeting instruction cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode#mmCancellationCompleted
 * MeetingInstructionCancellationStatusCode.mmCancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode#mmPendingCancellation
 * MeetingInstructionCancellationStatusCode.mmPendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode#mmCancellationDenied
 * MeetingInstructionCancellationStatusCode.mmCancellationDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode#mmCancellationRejected
 * MeetingInstructionCancellationStatusCode.mmCancellationRejected}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code
 * MeetingInstructionCancellationStatus1Code}</li>
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
 * <li>"CAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionCancellationStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a meeting instruction cancellation request."</li>
 * </ul>
 */
public class MeetingInstructionCancellationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Cancellation has been completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode
	 * MeetingInstructionCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation has been completed."</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			definition = "Cancellation has been completed.";
			owner_lazy = () -> MeetingInstructionCancellationStatusCode.mmObject();
			codeName = "CAND";
		}
	};
	/**
	 * Cancellation is pending. It is not known at this time whether
	 * cancellation can be executed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode
	 * MeetingInstructionCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation is pending. It is not known at this time whether cancellation can be executed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			definition = "Cancellation is pending. It is not known at this time whether cancellation can be executed.";
			owner_lazy = () -> MeetingInstructionCancellationStatusCode.mmObject();
			codeName = "CANP";
		}
	};
	/**
	 * Cancellation will not be executed due to business reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode
	 * MeetingInstructionCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationDenied"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation will not be executed due to business reasons. "</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDenied";
			definition = "Cancellation will not be executed due to business reasons. ";
			owner_lazy = () -> MeetingInstructionCancellationStatusCode.mmObject();
			codeName = "DEND";
		}
	};
	/**
	 * Cancellation request has been rejected for further processing due to
	 * system (data) reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode
	 * MeetingInstructionCancellationStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been rejected for further processing due to system (data) reasons."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCancellationRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRejected";
			definition = "Cancellation request has been rejected for further processing due to system (data) reasons.";
			owner_lazy = () -> MeetingInstructionCancellationStatusCode.mmObject();
			codeName = "REJT";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionCancellationStatusCode";
				definition = "Status of a meeting instruction cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode.mmCancellationCompleted,
						com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode.mmPendingCancellation, com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode.mmCancellationDenied,
						com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode.mmCancellationRejected);
				derivation_lazy = () -> Arrays.asList(MeetingInstructionCancellationStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}