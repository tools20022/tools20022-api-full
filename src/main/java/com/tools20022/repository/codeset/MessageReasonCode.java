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
 * Reason to send an card acquirer to issuer message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageReason1Code
 * MessageReason1Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmAcquirerStandin
 * MessageReasonCode.mmAcquirerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmAmountInconsistency
 * MessageReasonCode.mmAmountInconsistency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCardAcceptorSuspicious
 * MessageReasonCode.mmCardAcceptorSuspicious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCardDeclined
 * MessageReasonCode.mmCardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCardProcessed
 * MessageReasonCode.mmCardProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCardRandomSelection
 * MessageReasonCode.mmCardRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCardRetained
 * MessageReasonCode.mmCardRetained}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCardUnableToProcess
 * MessageReasonCode.mmCardUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmCustomerCancel
 * MessageReasonCode.mmCustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmDeactivatedKey
 * MessageReasonCode.mmDeactivatedKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmErrorInResponse
 * MessageReasonCode.mmErrorInResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmFloorLimit
 * MessageReasonCode.mmFloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmInconsistentDeposit
 * MessageReasonCode.mmInconsistentDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmInvalidVerification
 * MessageReasonCode.mmInvalidVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmIssuerSignedOff
 * MessageReasonCode.mmIssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmIssuerStandin
 * MessageReasonCode.mmIssuerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmIssuerTimeout
 * MessageReasonCode.mmIssuerTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmIssuerUnavailable
 * MessageReasonCode.mmIssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmLifeCycleEnd
 * MessageReasonCode.mmLifeCycleEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmMalfunction
 * MessageReasonCode.mmMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmOfflineDeclined
 * MessageReasonCode.mmOfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmOnLineDeclined
 * MessageReasonCode.mmOnLineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmOnlineForced
 * MessageReasonCode.mmOnlineForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmOutOfSynchronisation
 * MessageReasonCode.mmOutOfSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmPartiallyCompleted
 * MessageReasonCode.mmPartiallyCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmReceiverSignedOff
 * MessageReasonCode.mmReceiverSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmReceiverStandin
 * MessageReasonCode.mmReceiverStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmReceiverTimeout
 * MessageReasonCode.mmReceiverTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmReceiverUnavailable
 * MessageReasonCode.mmReceiverUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmSecurityReason
 * MessageReasonCode.mmSecurityReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmSuspectedFraud
 * MessageReasonCode.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmTerminalProcessed
 * MessageReasonCode.mmTerminalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmTerminalRandomSelection
 * MessageReasonCode.mmTerminalRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmTerminalUnableToProcess
 * MessageReasonCode.mmTerminalUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmTimeOut
 * MessageReasonCode.mmTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmTooLateResponse
 * MessageReasonCode.mmTooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmUnableToComplete
 * MessageReasonCode.mmUnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmUnableToSend
 * MessageReasonCode.mmUnableToSend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#mmUncompleteDispense
 * MessageReasonCode.mmUncompleteDispense}</li>
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
 * "MessageReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason to send an card acquirer to issuer message."</li>
 * </ul>
 */
public class MessageReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Stand-in processing at the acquirer's option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerStandin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stand-in processing at the acquirer's option."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerStandin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerStandin";
			definition = "Stand-in processing at the acquirer's option.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ASTD";
		}
	};
	/**
	 * Amount inconsistent between request and response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountInconsistency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount inconsistent between request and response."</li>
	 * </ul>
	 */
	public static final MMCode mmAmountInconsistency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountInconsistency";
			definition = "Amount inconsistent between request and response.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "AMNT";
		}
	};
	/**
	 * Card acceptor forced to be online.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASPC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardAcceptorSuspicious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card acceptor forced to be online."</li>
	 * </ul>
	 */
	public static final MMCode mmCardAcceptorSuspicious = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardAcceptorSuspicious";
			definition = "Card acceptor forced to be online.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ASPC";
		}
	};
	/**
	 * Integrated circuit card declines the transaction after the authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Integrated circuit card declines the transaction after the authorisation."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			definition = "Integrated circuit card declines the transaction after the authorisation.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "CDCL";
		}
	};
	/**
	 * Transaction performed offline by the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction performed offline by the card."</li>
	 * </ul>
	 */
	public static final MMCode mmCardProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProcessed";
			definition = "Transaction performed offline by the card.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "COFF";
		}
	};
	/**
	 * Random online decided by the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRandomSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random online decided by the card."</li>
	 * </ul>
	 */
	public static final MMCode mmCardRandomSelection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRandomSelection";
			definition = "Random online decided by the card.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "CRND";
		}
	};
	/**
	 * Card left by the cardholder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRetained"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card left by the cardholder."</li>
	 * </ul>
	 */
	public static final MMCode mmCardRetained = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			definition = "Card left by the cardholder.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "CRTN";
		}
	};
	/**
	 * Card cannot process offline the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUNB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardUnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card cannot process offline the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmCardUnableToProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnableToProcess";
			definition = "Card cannot process offline the transaction.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "CUNB";
		}
	};
	/**
	 * Customer cancellation, for example removing the chip card after sending
	 * the authorisation, but before the end of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer cancellation, for example removing the chip card after sending the authorisation, but before the end of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCustomerCancel = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			definition = "Customer cancellation, for example removing the chip card after sending the authorisation, but before the end of the transaction.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "CCAN";
		}
	};
	/**
	 * Deactivated key must be replaced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KDAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivatedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deactivated key must be replaced."</li>
	 * </ul>
	 */
	public static final MMCode mmDeactivatedKey = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivatedKey";
			definition = "Deactivated key must be replaced.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "KDAC";
		}
	};
	/**
	 * Response message was invalid (for example a problem of format or
	 * security).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorInResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response message was invalid (for example a problem of format or security)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmErrorInResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorInResponse";
			definition = "Response message was invalid (for example a problem of format or security).";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ERRP";
		}
	};
	/**
	 * Transaction above or under the floor limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLRL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction above or under the floor limit."</li>
	 * </ul>
	 */
	public static final MMCode mmFloorLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorLimit";
			definition = "Transaction above or under the floor limit.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "FLRL";
		}
	};
	/**
	 * Inconsistency between the items deposited and their declared value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IDPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InconsistentDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Inconsistency between the items deposited and their declared value."</li>
	 * </ul>
	 */
	public static final MMCode mmInconsistentDeposit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InconsistentDeposit";
			definition = "Inconsistency between the items deposited and their declared value.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "IDPS";
		}
	};
	/**
	 * Verification of the key has failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verification of the key has failed."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidVerification";
			definition = "Verification of the key has failed.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "KINV";
		}
	};
	/**
	 * Issuer signed off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer signed off."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerSignedOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			definition = "Issuer signed off.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ISGN";
		}
	};
	/**
	 * Stand-in processing at the issuer's option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerStandin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stand-in processing at the issuer's option."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerStandin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStandin";
			definition = "Stand-in processing at the issuer's option.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ISTD";
		}
	};
	/**
	 * Issuer timed out on request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ITIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer timed out on request."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerTimeout = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeout";
			definition = "Issuer timed out on request.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ITIM";
		}
	};
	/**
	 * Issuer unavailable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IUNV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer unavailable."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerUnavailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			definition = "Issuer unavailable.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "IUNV";
		}
	};
	/**
	 * End of key life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENDK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCycleEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End of key life cycle."</li>
	 * </ul>
	 */
	public static final MMCode mmLifeCycleEnd = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeCycleEnd";
			definition = "End of key life cycle.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "ENDK";
		}
	};
	/**
	 * Suspected malfunction (for example card reader defect, or printer out of
	 * order).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLFC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Suspected malfunction (for example card reader defect, or printer out of order)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMalfunction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			definition = "Suspected malfunction (for example card reader defect, or printer out of order).";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "MLFC";
		}
	};
	/**
	 * Offline authorisation declined the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline authorisation declined the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOfflineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			definition = "Offline authorisation declined the transaction.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "FDCL";
		}
	};
	/**
	 * Online authorisation declined the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NDCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Online authorisation declined the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmOnLineDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			definition = "Online authorisation declined the transaction.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "NDCL";
		}
	};
	/**
	 * Forced online by card acceptor, terminal, card, or the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlineForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Forced online by card acceptor, terminal, card, or the issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmOnlineForced = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlineForced";
			definition = "Forced online by card acceptor, terminal, card, or the issuer.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "FORC";
		}
	};
	/**
	 * Keys not synchronised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KSYN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSynchronisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Keys not synchronised."</li>
	 * </ul>
	 */
	public static final MMCode mmOutOfSynchronisation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSynchronisation";
			definition = "Keys not synchronised.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "KSYN";
		}
	};
	/**
	 * Partial reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial reversal."</li>
	 * </ul>
	 */
	public static final MMCode mmPartiallyCompleted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCompleted";
			definition = "Partial reversal.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Receiver signed off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver signed off."</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverSignedOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverSignedOff";
			definition = "Receiver signed off.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "RSGN";
		}
	};
	/**
	 * Stand-in processing at the receiver's option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverStandin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stand-in processing at the receiver's option."</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverStandin = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverStandin";
			definition = "Stand-in processing at the receiver's option.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "RSTD";
		}
	};
	/**
	 * Receiver timed out on request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverTimeout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver timed out on request."</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverTimeout = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverTimeout";
			definition = "Receiver timed out on request.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "RTIM";
		}
	};
	/**
	 * Receiver unavailable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RUNV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver unavailable."</li>
	 * </ul>
	 */
	public static final MMCode mmReceiverUnavailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverUnavailable";
			definition = "Receiver unavailable.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "RUNV";
		}
	};
	/**
	 * Security reasons.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security reasons."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityReason = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityReason";
			definition = "Security reasons.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "KSEC";
		}
	};
	/**
	 * Card transaction failed because the merchant suspected a fraud.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card transaction failed because the merchant suspected a fraud."</li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			definition = "Card transaction failed because the merchant suspected a fraud.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Transaction performed offline by the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction performed offline by the terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalProcessed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalProcessed";
			definition = "Transaction performed offline by the terminal.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "TOFF";
		}
	};
	/**
	 * Random online decided by the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalRandomSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random online decided by the terminal."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalRandomSelection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalRandomSelection";
			definition = "Random online decided by the terminal.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "TRND";
		}
	};
	/**
	 * Terminal cannot process offline the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TUNB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalUnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal cannot process offline the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalUnableToProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalUnableToProcess";
			definition = "Terminal cannot process offline the transaction.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "TUNB";
		}
	};
	/**
	 * Waiting for response from the receiver, or no response was received (for
	 * example connection release before receiving the response).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TIMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Waiting for response from the receiver, or no response was received (for example connection release before receiving the response)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTimeOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			definition = "Waiting for response from the receiver, or no response was received (for example connection release before receiving the response).";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "TIMO";
		}
	};
	/**
	 * Response to the authorisation received too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the authorisation received too late."</li>
	 * </ul>
	 */
	public static final MMCode mmTooLateResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			definition = "Response to the authorisation received too late.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Card acceptor device unable to complete transaction after the
	 * authorisation response (for example, the written signature invalid).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCMP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card acceptor device unable to complete transaction after the authorisation response (for example, the written signature invalid)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToComplete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			definition = "Card acceptor device unable to complete transaction after the authorisation response (for example, the written signature invalid).";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "UCMP";
		}
	};
	/**
	 * Unable to send the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "USND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToSend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to send the message."</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToSend = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			definition = "Unable to send the message.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "USND";
		}
	};
	/**
	 * Cardholder did not take the presented items.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
	 * MessageReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UDSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UncompleteDispense"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder did not take the presented items."</li>
	 * </ul>
	 */
	public static final MMCode mmUncompleteDispense = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncompleteDispense";
			definition = "Cardholder did not take the presented items.";
			owner_lazy = () -> MessageReasonCode.mmObject();
			codeName = "UDSP";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageReasonCode";
				definition = "Reason to send an card acquirer to issuer message.";
				code_lazy = () -> Arrays.asList(MessageReasonCode.mmAcquirerStandin, MessageReasonCode.mmAmountInconsistency, MessageReasonCode.mmCardAcceptorSuspicious, MessageReasonCode.mmCardDeclined, MessageReasonCode.mmCardProcessed,
						MessageReasonCode.mmCardRandomSelection, MessageReasonCode.mmCardRetained, MessageReasonCode.mmCardUnableToProcess, MessageReasonCode.mmCustomerCancel, MessageReasonCode.mmDeactivatedKey,
						MessageReasonCode.mmErrorInResponse, MessageReasonCode.mmFloorLimit, MessageReasonCode.mmInconsistentDeposit, MessageReasonCode.mmInvalidVerification, MessageReasonCode.mmIssuerSignedOff,
						MessageReasonCode.mmIssuerStandin, MessageReasonCode.mmIssuerTimeout, MessageReasonCode.mmIssuerUnavailable, MessageReasonCode.mmLifeCycleEnd, MessageReasonCode.mmMalfunction, MessageReasonCode.mmOfflineDeclined,
						MessageReasonCode.mmOnLineDeclined, MessageReasonCode.mmOnlineForced, MessageReasonCode.mmOutOfSynchronisation, MessageReasonCode.mmPartiallyCompleted, MessageReasonCode.mmReceiverSignedOff,
						MessageReasonCode.mmReceiverStandin, MessageReasonCode.mmReceiverTimeout, MessageReasonCode.mmReceiverUnavailable, MessageReasonCode.mmSecurityReason, MessageReasonCode.mmSuspectedFraud,
						MessageReasonCode.mmTerminalProcessed, MessageReasonCode.mmTerminalRandomSelection, MessageReasonCode.mmTerminalUnableToProcess, MessageReasonCode.mmTimeOut, MessageReasonCode.mmTooLateResponse,
						MessageReasonCode.mmUnableToComplete, MessageReasonCode.mmUnableToSend, MessageReasonCode.mmUncompleteDispense);
				derivation_lazy = () -> Arrays.asList(MessageReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}