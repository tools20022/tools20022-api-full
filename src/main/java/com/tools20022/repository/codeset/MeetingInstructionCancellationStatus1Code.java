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
import com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Status of a meeting instruction cancellation request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatusCode
 * MeetingInstructionCancellationStatusCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code#CancellationCompleted
 * MeetingInstructionCancellationStatus1Code.CancellationCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code#PendingCancellation
 * MeetingInstructionCancellationStatus1Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code#CancellationDenied
 * MeetingInstructionCancellationStatus1Code.CancellationDenied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code#CancellationRejected
 * MeetingInstructionCancellationStatus1Code.CancellationRejected}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
 * "MeetingInstructionCancellationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Status of a meeting instruction cancellation request."</li>
 * </ul>
 */
public class MeetingInstructionCancellationStatus1Code extends MeetingInstructionCancellationStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code
	 * MeetingInstructionCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationCompleted"</li>
	 * </ul>
	 */
	public static final MMCode CancellationCompleted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationCompleted";
			owner_lazy = () -> MeetingInstructionCancellationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code
	 * MeetingInstructionCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final MMCode PendingCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> MeetingInstructionCancellationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code
	 * MeetingInstructionCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationDenied"</li>
	 * </ul>
	 */
	public static final MMCode CancellationDenied = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationDenied";
			owner_lazy = () -> MeetingInstructionCancellationStatus1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code
	 * MeetingInstructionCancellationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRejected"</li>
	 * </ul>
	 */
	public static final MMCode CancellationRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRejected";
			owner_lazy = () -> MeetingInstructionCancellationStatus1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("CAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "MeetingInstructionCancellationStatus1Code";
				definition = "Status of a meeting instruction cancellation request.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code.CancellationCompleted,
						com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code.PendingCancellation, com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code.CancellationDenied,
						com.tools20022.repository.codeset.MeetingInstructionCancellationStatus1Code.CancellationRejected);
				trace_lazy = () -> MeetingInstructionCancellationStatusCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}