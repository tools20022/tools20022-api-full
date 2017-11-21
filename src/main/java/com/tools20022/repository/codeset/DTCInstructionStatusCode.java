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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * DTC (The Depository Trust Company) system status code of instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmRecycle
 * DTCInstructionStatusCode.mmRecycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmMade
 * DTCInstructionStatusCode.mmMade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmDropped
 * DTCInstructionStatusCode.mmDropped}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmEditReject
 * DTCInstructionStatusCode.mmEditReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmCancel
 * DTCInstructionStatusCode.mmCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmConversionCancellation
 * DTCInstructionStatusCode.mmConversionCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmPendingDocumentation
 * DTCInstructionStatusCode.mmPendingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmPendingApproval
 * DTCInstructionStatusCode.mmPendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmPending
 * DTCInstructionStatusCode.mmPending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmRejectedByAgent
 * DTCInstructionStatusCode.mmRejectedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmReject
 * DTCInstructionStatusCode.mmReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmRecycleMade
 * DTCInstructionStatusCode.mmRecycleMade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmRescinded
 * DTCInstructionStatusCode.mmRescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmSwung
 * DTCInstructionStatusCode.mmSwung}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmWithdrawn
 * DTCInstructionStatusCode.mmWithdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmFullyCovered
 * DTCInstructionStatusCode.mmFullyCovered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmExpired
 * DTCInstructionStatusCode.mmExpired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#mmOpen
 * DTCInstructionStatusCode.mmOpen}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCInstructionStatus1Code
 * DTCInstructionStatus1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCInstructionStatus2Code
 * DTCInstructionStatus2Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCProtectInstructionStatus1Code
 * DTCProtectInstructionStatus1Code}</li>
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
 * <li>"RECY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCInstructionStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "DTC (The Depository Trust Company) system status code of instruction."</li>
 * </ul>
 */
public class DTCInstructionStatusCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction waiting for position. Instruction will subsequently either
	 * become “Made” or “Dropped” by end of day.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Recycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction waiting for position.  Instruction will subsequently either become “Made” or “Dropped” by end of day."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRecycle = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Recycle";
			definition = "Instruction waiting for position.  Instruction will subsequently either become “Made” or “Dropped” by end of day.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "RECY";
		}
	};
	/**
	 * Fully processed instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MADE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Made"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fully processed instruction."</li>
	 * </ul>
	 */
	public static final MMCode mmMade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Made";
			definition = "Fully processed instruction.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "MADE";
		}
	};
	/**
	 * Instruction dropped due to insufficient position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DROP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Dropped"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction dropped due to insufficient position."</li>
	 * </ul>
	 */
	public static final MMCode mmDropped = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Dropped";
			definition = "Instruction dropped due to insufficient position.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "DROP";
		}
	};
	/**
	 * Transaction rejected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EDRJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EditReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction rejected."</li>
	 * </ul>
	 */
	public static final MMCode mmEditReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EditReject";
			definition = "Transaction rejected.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "EDRJ";
		}
	};
	/**
	 * Instruction cancelled by client relating to survivor option event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction cancelled by client relating to survivor option event."</li>
	 * </ul>
	 */
	public static final MMCode mmCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancel";
			definition = "Instruction cancelled by client relating to survivor option event.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Cancellation of conversion instruction upon agent approval only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConversionCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation of conversion instruction upon agent approval only."</li>
	 * </ul>
	 */
	public static final MMCode mmConversionCancellation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConversionCancellation";
			definition = "Cancellation of conversion instruction upon agent approval only.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "CCAN";
		}
	};
	/**
	 * Instruction for CD early redemption awaiting paperwork. Instruction will
	 * become MADE when DTC releases instruction upon paperwork.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDOC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction for CD early redemption awaiting paperwork.  Instruction will become MADE when DTC releases instruction upon paperwork."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingDocumentation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDocumentation";
			definition = "Instruction for CD early redemption awaiting paperwork.  Instruction will become MADE when DTC releases instruction upon paperwork.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "PDOC";
		}
	};
	/**
	 * Instruction pending release or delete from approval function.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PENA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingApproval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction pending release or delete from approval function."</li>
	 * </ul>
	 */
	public static final MMCode mmPendingApproval = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingApproval";
			definition = "Instruction pending release or delete from approval function.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "PENA";
		}
	};
	/**
	 * Instruction waiting for update after submission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction waiting for update after submission."</li>
	 * </ul>
	 */
	public static final MMCode mmPending = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			definition = "Instruction waiting for update after submission.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "PEND";
		}
	};
	/**
	 * Instruction or withdrawal rejected by agent relating to survivor option
	 * event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction or withdrawal rejected by agent relating to survivor option event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRejectedByAgent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByAgent";
			definition = "Instruction or withdrawal rejected by agent relating to survivor option event.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "REJA";
		}
	};
	/**
	 * Instruction did not pass initial validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction did not pass initial validation."</li>
	 * </ul>
	 */
	public static final MMCode mmReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reject";
			definition = "Instruction did not pass initial validation.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "REJT";
		}
	};
	/**
	 * Previously recycled transactions have been “MADE” and the system is
	 * processing the updates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecycleMade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Previously recycled transactions have been “MADE” and the system is processing the updates."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRecycleMade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecycleMade";
			definition = "Previously recycled transactions have been “MADE” and the system is processing the updates.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "REMD";
		}
	};
	/**
	 * Rescinded by Issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rescinded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rescinded by Issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmRescinded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rescinded";
			definition = "Rescinded by Issuer.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "RESC";
		}
	};
	/**
	 * Instruction moved from one client account to another for put events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Swung"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction moved from one client account to another for put events."</li>
	 * </ul>
	 */
	public static final MMCode mmSwung = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Swung";
			definition = "Instruction moved from one client account to another for put events.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "SWUN";
		}
	};
	/**
	 * Client instruction withdrawn for events with withdrawal priviledge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Client instruction withdrawn for events with withdrawal priviledge."</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawn = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			definition = "Client instruction withdrawn for events with withdrawal priviledge.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "WITH";
		}
	};
	/**
	 * Protect instruction has been fully covered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyCovered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect instruction has been fully covered."</li>
	 * </ul>
	 */
	public static final MMCode mmFullyCovered = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyCovered";
			definition = "Protect instruction has been fully covered.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "COVR";
		}
	};
	/**
	 * Protect instruction has expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect instruction has expired."</li>
	 * </ul>
	 */
	public static final MMCode mmExpired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Protect instruction has expired.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Protect instruction which has not been fully covered. Will include
	 * partial covers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode
	 * DTCInstructionStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPEN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Protect instruction which has not been fully covered.  Will include partial covers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOpen = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			definition = "Protect instruction which has not been fully covered.  Will include partial covers.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "OPEN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("RECY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCInstructionStatusCode";
				definition = "DTC (The Depository Trust Company) system status code of instruction.";
				code_lazy = () -> Arrays.asList(DTCInstructionStatusCode.mmRecycle, DTCInstructionStatusCode.mmMade, DTCInstructionStatusCode.mmDropped, DTCInstructionStatusCode.mmEditReject, DTCInstructionStatusCode.mmCancel,
						DTCInstructionStatusCode.mmConversionCancellation, DTCInstructionStatusCode.mmPendingDocumentation, DTCInstructionStatusCode.mmPendingApproval, DTCInstructionStatusCode.mmPending,
						DTCInstructionStatusCode.mmRejectedByAgent, DTCInstructionStatusCode.mmReject, DTCInstructionStatusCode.mmRecycleMade, DTCInstructionStatusCode.mmRescinded, DTCInstructionStatusCode.mmSwung,
						DTCInstructionStatusCode.mmWithdrawn, DTCInstructionStatusCode.mmFullyCovered, DTCInstructionStatusCode.mmExpired, DTCInstructionStatusCode.mmOpen);
				derivation_lazy = () -> Arrays.asList(DTCInstructionStatus1Code.mmObject(), DTCInstructionStatus2Code.mmObject(), DTCProtectInstructionStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}