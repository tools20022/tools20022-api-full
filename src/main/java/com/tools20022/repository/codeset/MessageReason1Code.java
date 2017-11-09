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
import com.tools20022.repository.codeset.MessageReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reason to send an card acquirer to issuer message.<br>
 * It corresponds to ISO 8583, field number 25 for the version 93, and 9 for the
 * version 2003.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
 * MessageReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmAcquirerStandin
 * MessageReason1Code.mmAcquirerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmAmountInconsistency
 * MessageReason1Code.mmAmountInconsistency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCardAcceptorSuspicious
 * MessageReason1Code.mmCardAcceptorSuspicious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCardDeclined
 * MessageReason1Code.mmCardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCardProcessed
 * MessageReason1Code.mmCardProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCardRandomSelection
 * MessageReason1Code.mmCardRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCardRetained
 * MessageReason1Code.mmCardRetained}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCardUnableToProcess
 * MessageReason1Code.mmCardUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmCustomerCancel
 * MessageReason1Code.mmCustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmDeactivatedKey
 * MessageReason1Code.mmDeactivatedKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmErrorInResponse
 * MessageReason1Code.mmErrorInResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmFloorLimit
 * MessageReason1Code.mmFloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmInconsistentDeposit
 * MessageReason1Code.mmInconsistentDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmInvalidVerification
 * MessageReason1Code.mmInvalidVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmIssuerSignedOff
 * MessageReason1Code.mmIssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmIssuerStandin
 * MessageReason1Code.mmIssuerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmIssuerTimeout
 * MessageReason1Code.mmIssuerTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmIssuerUnavailable
 * MessageReason1Code.mmIssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmLifeCycleEnd
 * MessageReason1Code.mmLifeCycleEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmMalfunction
 * MessageReason1Code.mmMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmOfflineDeclined
 * MessageReason1Code.mmOfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmOnLineDeclined
 * MessageReason1Code.mmOnLineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmOnlineForced
 * MessageReason1Code.mmOnlineForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmOutOfSynchronisation
 * MessageReason1Code.mmOutOfSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmUncompleteDispense
 * MessageReason1Code.mmUncompleteDispense}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmUnableToSend
 * MessageReason1Code.mmUnableToSend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmUnableToComplete
 * MessageReason1Code.mmUnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmTooLateResponse
 * MessageReason1Code.mmTooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmTimeOut
 * MessageReason1Code.mmTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmTerminalUnableToProcess
 * MessageReason1Code.mmTerminalUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmTerminalRandomSelection
 * MessageReason1Code.mmTerminalRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmTerminalProcessed
 * MessageReason1Code.mmTerminalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmSuspectedFraud
 * MessageReason1Code.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmSecurityReason
 * MessageReason1Code.mmSecurityReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmReceiverUnavailable
 * MessageReason1Code.mmReceiverUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmReceiverTimeout
 * MessageReason1Code.mmReceiverTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmReceiverStandin
 * MessageReason1Code.mmReceiverStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmReceiverSignedOff
 * MessageReason1Code.mmReceiverSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#mmPartiallyCompleted
 * MessageReason1Code.mmPartiallyCompleted}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason to send an card acquirer to issuer message.\r\nIt corresponds to ISO 8583, field number 25 for the version 93, and 9 for the version 2003."
 * </li>
 * </ul>
 */
public class MessageReason1Code extends MessageReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerStandin"</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerStandin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerStandin";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountInconsistency"</li>
	 * </ul>
	 */
	public static final MMCode mmAmountInconsistency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountInconsistency";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardAcceptorSuspicious"</li>
	 * </ul>
	 */
	public static final MMCode mmCardAcceptorSuspicious = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardAcceptorSuspicious";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDeclined"</li>
	 * </ul>
	 */
	public static final MMCode mmCardDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProcessed"</li>
	 * </ul>
	 */
	public static final MMCode mmCardProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProcessed";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRandomSelection"</li>
	 * </ul>
	 */
	public static final MMCode mmCardRandomSelection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRandomSelection";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRetained"</li>
	 * </ul>
	 */
	public static final MMCode mmCardRetained = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardUnableToProcess"</li>
	 * </ul>
	 */
	public static final MMCode mmCardUnableToProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnableToProcess";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * </ul>
	 */
	public static final MMCode mmCustomerCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivatedKey"</li>
	 * </ul>
	 */
	public static final MMCode mmDeactivatedKey = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivatedKey";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorInResponse"</li>
	 * </ul>
	 */
	public static final MMCode mmErrorInResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorInResponse";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorLimit"</li>
	 * </ul>
	 */
	public static final MMCode mmFloorLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorLimit";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InconsistentDeposit"</li>
	 * </ul>
	 */
	public static final MMCode mmInconsistentDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InconsistentDeposit";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidVerification"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidVerification";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerSignedOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerStandin"</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerStandin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStandin";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeout"</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerTimeout = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeout";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerUnavailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCycleEnd"</li>
	 * </ul>
	 */
	public static final MMCode mmLifeCycleEnd = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeCycleEnd";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * </ul>
	 */
	public static final MMCode mmMalfunction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDeclined"</li>
	 * </ul>
	 */
	public static final MMCode mmOfflineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineDeclined"</li>
	 * </ul>
	 */
	public static final MMCode mmOnLineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlineForced"</li>
	 * </ul>
	 */
	public static final MMCode mmOnlineForced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlineForced";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSynchronisation"</li>
	 * </ul>
	 */
	public static final MMCode mmOutOfSynchronisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSynchronisation";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UncompleteDispense"</li>
	 * </ul>
	 */
	public static final MMCode mmUncompleteDispense = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncompleteDispense";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToSend"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToSend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToComplete"</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToComplete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateResponse"</li>
	 * </ul>
	 */
	public static final MMCode mmTooLateResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOut"</li>
	 * </ul>
	 */
	public static final MMCode mmTimeOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalUnableToProcess"</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalUnableToProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalUnableToProcess";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalRandomSelection"</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalRandomSelection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalRandomSelection";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalProcessed"</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalProcessed";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityReason"</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityReason = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityReason";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverUnavailable"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverUnavailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverUnavailable";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverTimeout"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverTimeout = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverTimeout";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverStandin"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverStandin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverStandin";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverSignedOff"</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverSignedOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverSignedOff";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code
	 * MessageReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyCompleted"</li>
	 * </ul>
	 */
	public static final MMCode mmPartiallyCompleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCompleted";
			owner_lazy = () -> MessageReason1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageReason1Code";
				definition = "Reason to send an card acquirer to issuer message.\r\nIt corresponds to ISO 8583, field number 25 for the version 93, and 9 for the version 2003.";
				code_lazy = () -> Arrays.asList(MessageReason1Code.mmAcquirerStandin, MessageReason1Code.mmAmountInconsistency, MessageReason1Code.mmCardAcceptorSuspicious, MessageReason1Code.mmCardDeclined,
						MessageReason1Code.mmCardProcessed, MessageReason1Code.mmCardRandomSelection, MessageReason1Code.mmCardRetained, MessageReason1Code.mmCardUnableToProcess, MessageReason1Code.mmCustomerCancel,
						MessageReason1Code.mmDeactivatedKey, MessageReason1Code.mmErrorInResponse, MessageReason1Code.mmFloorLimit, MessageReason1Code.mmInconsistentDeposit, MessageReason1Code.mmInvalidVerification,
						MessageReason1Code.mmIssuerSignedOff, MessageReason1Code.mmIssuerStandin, MessageReason1Code.mmIssuerTimeout, MessageReason1Code.mmIssuerUnavailable, MessageReason1Code.mmLifeCycleEnd,
						MessageReason1Code.mmMalfunction, MessageReason1Code.mmOfflineDeclined, MessageReason1Code.mmOnLineDeclined, MessageReason1Code.mmOnlineForced, MessageReason1Code.mmOutOfSynchronisation,
						MessageReason1Code.mmUncompleteDispense, MessageReason1Code.mmUnableToSend, MessageReason1Code.mmUnableToComplete, MessageReason1Code.mmTooLateResponse, MessageReason1Code.mmTimeOut,
						MessageReason1Code.mmTerminalUnableToProcess, MessageReason1Code.mmTerminalRandomSelection, MessageReason1Code.mmTerminalProcessed, MessageReason1Code.mmSuspectedFraud, MessageReason1Code.mmSecurityReason,
						MessageReason1Code.mmReceiverUnavailable, MessageReason1Code.mmReceiverTimeout, MessageReason1Code.mmReceiverStandin, MessageReason1Code.mmReceiverSignedOff, MessageReason1Code.mmPartiallyCompleted);
				trace_lazy = () -> MessageReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}