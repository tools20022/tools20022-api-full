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
 * DTC (The Depository Trust Company) system status code of instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Recycle
 * DTCInstructionStatusCode.Recycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Made
 * DTCInstructionStatusCode.Made}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Dropped
 * DTCInstructionStatusCode.Dropped}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#EditReject
 * DTCInstructionStatusCode.EditReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Cancel
 * DTCInstructionStatusCode.Cancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#ConversionCancellation
 * DTCInstructionStatusCode.ConversionCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#PendingDocumentation
 * DTCInstructionStatusCode.PendingDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#PendingApproval
 * DTCInstructionStatusCode.PendingApproval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Pending
 * DTCInstructionStatusCode.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#RejectedByAgent
 * DTCInstructionStatusCode.RejectedByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Reject
 * DTCInstructionStatusCode.Reject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#RecycleMade
 * DTCInstructionStatusCode.RecycleMade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Rescinded
 * DTCInstructionStatusCode.Rescinded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Swung
 * DTCInstructionStatusCode.Swung}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Withdrawn
 * DTCInstructionStatusCode.Withdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#FullyCovered
 * DTCInstructionStatusCode.FullyCovered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Expired
 * DTCInstructionStatusCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCInstructionStatusCode#Open
 * DTCInstructionStatusCode.Open}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
	public static final MMCode Recycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Made = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Dropped = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode EditReject = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Cancel = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode ConversionCancellation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingDocumentation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode PendingApproval = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Pending = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RejectedByAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Reject = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode RecycleMade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Rescinded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Swung = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Withdrawn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode FullyCovered = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Expired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
	public static final MMCode Open = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			definition = "Protect instruction which has not been fully covered.  Will include partial covers.";
			owner_lazy = () -> DTCInstructionStatusCode.mmObject();
			codeName = "OPEN";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RECY");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCInstructionStatusCode";
				definition = "DTC (The Depository Trust Company) system status code of instruction.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCInstructionStatusCode.Recycle, com.tools20022.repository.codeset.DTCInstructionStatusCode.Made,
						com.tools20022.repository.codeset.DTCInstructionStatusCode.Dropped, com.tools20022.repository.codeset.DTCInstructionStatusCode.EditReject, com.tools20022.repository.codeset.DTCInstructionStatusCode.Cancel,
						com.tools20022.repository.codeset.DTCInstructionStatusCode.ConversionCancellation, com.tools20022.repository.codeset.DTCInstructionStatusCode.PendingDocumentation,
						com.tools20022.repository.codeset.DTCInstructionStatusCode.PendingApproval, com.tools20022.repository.codeset.DTCInstructionStatusCode.Pending,
						com.tools20022.repository.codeset.DTCInstructionStatusCode.RejectedByAgent, com.tools20022.repository.codeset.DTCInstructionStatusCode.Reject, com.tools20022.repository.codeset.DTCInstructionStatusCode.RecycleMade,
						com.tools20022.repository.codeset.DTCInstructionStatusCode.Rescinded, com.tools20022.repository.codeset.DTCInstructionStatusCode.Swung, com.tools20022.repository.codeset.DTCInstructionStatusCode.Withdrawn,
						com.tools20022.repository.codeset.DTCInstructionStatusCode.FullyCovered, com.tools20022.repository.codeset.DTCInstructionStatusCode.Expired, com.tools20022.repository.codeset.DTCInstructionStatusCode.Open);
				derivation_lazy = () -> Arrays.asList(DTCInstructionStatus1Code.mmObject(), DTCInstructionStatus2Code.mmObject(), DTCProtectInstructionStatus1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}