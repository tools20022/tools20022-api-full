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
import com.tools20022.repository.codeset.MessageReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason to send an card acquirer to issuer message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#AcquirerStandin
 * MessageReasonCode.AcquirerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#AmountInconsistency
 * MessageReasonCode.AmountInconsistency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CardAcceptorSuspicious
 * MessageReasonCode.CardAcceptorSuspicious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CardDeclined
 * MessageReasonCode.CardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CardProcessed
 * MessageReasonCode.CardProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CardRandomSelection
 * MessageReasonCode.CardRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CardRetained
 * MessageReasonCode.CardRetained}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CardUnableToProcess
 * MessageReasonCode.CardUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#CustomerCancel
 * MessageReasonCode.CustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#DeactivatedKey
 * MessageReasonCode.DeactivatedKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#ErrorInResponse
 * MessageReasonCode.ErrorInResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#FloorLimit
 * MessageReasonCode.FloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#InconsistentDeposit
 * MessageReasonCode.InconsistentDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#InvalidVerification
 * MessageReasonCode.InvalidVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#IssuerSignedOff
 * MessageReasonCode.IssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#IssuerStandin
 * MessageReasonCode.IssuerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#IssuerTimeout
 * MessageReasonCode.IssuerTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#IssuerUnavailable
 * MessageReasonCode.IssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#LifeCycleEnd
 * MessageReasonCode.LifeCycleEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#Malfunction
 * MessageReasonCode.Malfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#OfflineDeclined
 * MessageReasonCode.OfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#OnLineDeclined
 * MessageReasonCode.OnLineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#OnlineForced
 * MessageReasonCode.OnlineForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#OutOfSynchronisation
 * MessageReasonCode.OutOfSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#PartiallyCompleted
 * MessageReasonCode.PartiallyCompleted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#ReceiverSignedOff
 * MessageReasonCode.ReceiverSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#ReceiverStandin
 * MessageReasonCode.ReceiverStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#ReceiverTimeout
 * MessageReasonCode.ReceiverTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#ReceiverUnavailable
 * MessageReasonCode.ReceiverUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#SecurityReason
 * MessageReasonCode.SecurityReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#SuspectedFraud
 * MessageReasonCode.SuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#TerminalProcessed
 * MessageReasonCode.TerminalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#TerminalRandomSelection
 * MessageReasonCode.TerminalRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#TerminalUnableToProcess
 * MessageReasonCode.TerminalUnableToProcess}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageReasonCode#TimeOut
 * MessageReasonCode.TimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#TooLateResponse
 * MessageReasonCode.TooLateResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#UnableToComplete
 * MessageReasonCode.UnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#UnableToSend
 * MessageReasonCode.UnableToSend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode#UncompleteDispense
 * MessageReasonCode.UncompleteDispense}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageReason1Code
 * MessageReason1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason to send an card acquirer to issuer message."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageReasonCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerStandin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stand-in processing at the acquirer's option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode AcquirerStandin = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerStandin";
			definition = "Stand-in processing at the acquirer's option.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountInconsistency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount inconsistent between request and response."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode AmountInconsistency = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountInconsistency";
			definition = "Amount inconsistent between request and response.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardAcceptorSuspicious"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card acceptor forced to be online."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CardAcceptorSuspicious = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardAcceptorSuspicious";
			definition = "Card acceptor forced to be online.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Integrated circuit card declines the transaction after the authorisation."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CardDeclined = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			definition = "Integrated circuit card declines the transaction after the authorisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction performed offline by the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CardProcessed = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProcessed";
			definition = "Transaction performed offline by the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRandomSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random online decided by the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CardRandomSelection = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRandomSelection";
			definition = "Random online decided by the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardRetained"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card left by the cardholder."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CardRetained = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			definition = "Card left by the cardholder.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardUnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card cannot process offline the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CardUnableToProcess = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnableToProcess";
			definition = "Card cannot process offline the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerCancel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer cancellation, for example removing the chip card after sending the authorisation, but before the end of the transaction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode CustomerCancel = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			definition = "Customer cancellation, for example removing the chip card after sending the authorisation, but before the end of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeactivatedKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deactivated key must be replaced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode DeactivatedKey = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivatedKey";
			definition = "Deactivated key must be replaced.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ErrorInResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response message was invalid (for example a problem of format or security)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode ErrorInResponse = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorInResponse";
			definition = "Response message was invalid (for example a problem of format or security).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FloorLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction above or under the floor limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode FloorLimit = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorLimit";
			definition = "Transaction above or under the floor limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InconsistentDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Inconsistency between the items deposited and their declared value."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode InconsistentDeposit = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InconsistentDeposit";
			definition = "Inconsistency between the items deposited and their declared value.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Verification of the key has failed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode InvalidVerification = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidVerification";
			definition = "Verification of the key has failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer signed off."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode IssuerSignedOff = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			definition = "Issuer signed off.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerStandin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stand-in processing at the issuer's option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode IssuerStandin = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStandin";
			definition = "Stand-in processing at the issuer's option.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer timed out on request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode IssuerTimeout = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeout";
			definition = "Issuer timed out on request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer unavailable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode IssuerUnavailable = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			definition = "Issuer unavailable.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCycleEnd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "End of key life cycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode LifeCycleEnd = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeCycleEnd";
			definition = "End of key life cycle.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Malfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Suspected malfunction (for example card reader defect, or printer out of order)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode Malfunction = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			definition = "Suspected malfunction (for example card reader defect, or printer out of order).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfflineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offline authorisation declined the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode OfflineDeclined = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			definition = "Offline authorisation declined the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Online authorisation declined the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode OnLineDeclined = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			definition = "Online authorisation declined the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnlineForced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Forced online by card acceptor, terminal, card, or the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode OnlineForced = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlineForced";
			definition = "Forced online by card acceptor, terminal, card, or the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSynchronisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Keys not synchronised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode OutOfSynchronisation = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSynchronisation";
			definition = "Keys not synchronised.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyCompleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode PartiallyCompleted = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCompleted";
			definition = "Partial reversal.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver signed off."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode ReceiverSignedOff = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverSignedOff";
			definition = "Receiver signed off.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverStandin"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stand-in processing at the receiver's option."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode ReceiverStandin = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverStandin";
			definition = "Stand-in processing at the receiver's option.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverTimeout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver timed out on request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode ReceiverTimeout = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverTimeout";
			definition = "Receiver timed out on request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiver unavailable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode ReceiverUnavailable = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverUnavailable";
			definition = "Receiver unavailable.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security reasons."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode SecurityReason = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityReason";
			definition = "Security reasons.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card transaction failed because the merchant suspected a fraud."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode SuspectedFraud = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			definition = "Card transaction failed because the merchant suspected a fraud.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalProcessed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction performed offline by the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode TerminalProcessed = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalProcessed";
			definition = "Transaction performed offline by the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalRandomSelection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Random online decided by the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode TerminalRandomSelection = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalRandomSelection";
			definition = "Random online decided by the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalUnableToProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Terminal cannot process offline the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode TerminalUnableToProcess = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalUnableToProcess";
			definition = "Terminal cannot process offline the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Waiting for response from the receiver, or no response was received (for example connection release before receiving the response)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode TimeOut = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			definition = "Waiting for response from the receiver, or no response was received (for example connection release before receiving the response).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLateResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to the authorisation received too late."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode TooLateResponse = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			definition = "Response to the authorisation received too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card acceptor device unable to complete transaction after the authorisation response (for example, the written signature invalid)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode UnableToComplete = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			definition = "Card acceptor device unable to complete transaction after the authorisation response (for example, the written signature invalid).";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToSend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to send the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode UnableToSend = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			definition = "Unable to send the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UncompleteDispense"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cardholder did not take the presented items."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MessageReasonCode UncompleteDispense = new MessageReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncompleteDispense";
			definition = "Cardholder did not take the presented items.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReasonCode.mmObject();
			codeName = "UDSP";
		}
	};
	final static private LinkedHashMap<String, MessageReasonCode> codesByName = new LinkedHashMap<>();

	protected MessageReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageReasonCode";
				definition = "Reason to send an card acquirer to issuer message.";
				derivation_lazy = () -> Arrays.asList(MessageReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageReasonCode.AcquirerStandin, com.tools20022.repository.codeset.MessageReasonCode.AmountInconsistency,
						com.tools20022.repository.codeset.MessageReasonCode.CardAcceptorSuspicious, com.tools20022.repository.codeset.MessageReasonCode.CardDeclined, com.tools20022.repository.codeset.MessageReasonCode.CardProcessed,
						com.tools20022.repository.codeset.MessageReasonCode.CardRandomSelection, com.tools20022.repository.codeset.MessageReasonCode.CardRetained, com.tools20022.repository.codeset.MessageReasonCode.CardUnableToProcess,
						com.tools20022.repository.codeset.MessageReasonCode.CustomerCancel, com.tools20022.repository.codeset.MessageReasonCode.DeactivatedKey, com.tools20022.repository.codeset.MessageReasonCode.ErrorInResponse,
						com.tools20022.repository.codeset.MessageReasonCode.FloorLimit, com.tools20022.repository.codeset.MessageReasonCode.InconsistentDeposit, com.tools20022.repository.codeset.MessageReasonCode.InvalidVerification,
						com.tools20022.repository.codeset.MessageReasonCode.IssuerSignedOff, com.tools20022.repository.codeset.MessageReasonCode.IssuerStandin, com.tools20022.repository.codeset.MessageReasonCode.IssuerTimeout,
						com.tools20022.repository.codeset.MessageReasonCode.IssuerUnavailable, com.tools20022.repository.codeset.MessageReasonCode.LifeCycleEnd, com.tools20022.repository.codeset.MessageReasonCode.Malfunction,
						com.tools20022.repository.codeset.MessageReasonCode.OfflineDeclined, com.tools20022.repository.codeset.MessageReasonCode.OnLineDeclined, com.tools20022.repository.codeset.MessageReasonCode.OnlineForced,
						com.tools20022.repository.codeset.MessageReasonCode.OutOfSynchronisation, com.tools20022.repository.codeset.MessageReasonCode.PartiallyCompleted,
						com.tools20022.repository.codeset.MessageReasonCode.ReceiverSignedOff, com.tools20022.repository.codeset.MessageReasonCode.ReceiverStandin, com.tools20022.repository.codeset.MessageReasonCode.ReceiverTimeout,
						com.tools20022.repository.codeset.MessageReasonCode.ReceiverUnavailable, com.tools20022.repository.codeset.MessageReasonCode.SecurityReason, com.tools20022.repository.codeset.MessageReasonCode.SuspectedFraud,
						com.tools20022.repository.codeset.MessageReasonCode.TerminalProcessed, com.tools20022.repository.codeset.MessageReasonCode.TerminalRandomSelection,
						com.tools20022.repository.codeset.MessageReasonCode.TerminalUnableToProcess, com.tools20022.repository.codeset.MessageReasonCode.TimeOut, com.tools20022.repository.codeset.MessageReasonCode.TooLateResponse,
						com.tools20022.repository.codeset.MessageReasonCode.UnableToComplete, com.tools20022.repository.codeset.MessageReasonCode.UnableToSend, com.tools20022.repository.codeset.MessageReasonCode.UncompleteDispense);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerStandin.getCodeName().get(), AcquirerStandin);
		codesByName.put(AmountInconsistency.getCodeName().get(), AmountInconsistency);
		codesByName.put(CardAcceptorSuspicious.getCodeName().get(), CardAcceptorSuspicious);
		codesByName.put(CardDeclined.getCodeName().get(), CardDeclined);
		codesByName.put(CardProcessed.getCodeName().get(), CardProcessed);
		codesByName.put(CardRandomSelection.getCodeName().get(), CardRandomSelection);
		codesByName.put(CardRetained.getCodeName().get(), CardRetained);
		codesByName.put(CardUnableToProcess.getCodeName().get(), CardUnableToProcess);
		codesByName.put(CustomerCancel.getCodeName().get(), CustomerCancel);
		codesByName.put(DeactivatedKey.getCodeName().get(), DeactivatedKey);
		codesByName.put(ErrorInResponse.getCodeName().get(), ErrorInResponse);
		codesByName.put(FloorLimit.getCodeName().get(), FloorLimit);
		codesByName.put(InconsistentDeposit.getCodeName().get(), InconsistentDeposit);
		codesByName.put(InvalidVerification.getCodeName().get(), InvalidVerification);
		codesByName.put(IssuerSignedOff.getCodeName().get(), IssuerSignedOff);
		codesByName.put(IssuerStandin.getCodeName().get(), IssuerStandin);
		codesByName.put(IssuerTimeout.getCodeName().get(), IssuerTimeout);
		codesByName.put(IssuerUnavailable.getCodeName().get(), IssuerUnavailable);
		codesByName.put(LifeCycleEnd.getCodeName().get(), LifeCycleEnd);
		codesByName.put(Malfunction.getCodeName().get(), Malfunction);
		codesByName.put(OfflineDeclined.getCodeName().get(), OfflineDeclined);
		codesByName.put(OnLineDeclined.getCodeName().get(), OnLineDeclined);
		codesByName.put(OnlineForced.getCodeName().get(), OnlineForced);
		codesByName.put(OutOfSynchronisation.getCodeName().get(), OutOfSynchronisation);
		codesByName.put(PartiallyCompleted.getCodeName().get(), PartiallyCompleted);
		codesByName.put(ReceiverSignedOff.getCodeName().get(), ReceiverSignedOff);
		codesByName.put(ReceiverStandin.getCodeName().get(), ReceiverStandin);
		codesByName.put(ReceiverTimeout.getCodeName().get(), ReceiverTimeout);
		codesByName.put(ReceiverUnavailable.getCodeName().get(), ReceiverUnavailable);
		codesByName.put(SecurityReason.getCodeName().get(), SecurityReason);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(TerminalProcessed.getCodeName().get(), TerminalProcessed);
		codesByName.put(TerminalRandomSelection.getCodeName().get(), TerminalRandomSelection);
		codesByName.put(TerminalUnableToProcess.getCodeName().get(), TerminalUnableToProcess);
		codesByName.put(TimeOut.getCodeName().get(), TimeOut);
		codesByName.put(TooLateResponse.getCodeName().get(), TooLateResponse);
		codesByName.put(UnableToComplete.getCodeName().get(), UnableToComplete);
		codesByName.put(UnableToSend.getCodeName().get(), UnableToSend);
		codesByName.put(UncompleteDispense.getCodeName().get(), UncompleteDispense);
	}

	public static MessageReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageReasonCode[] values() {
		MessageReasonCode[] values = new MessageReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageReasonCode> {
		@Override
		public MessageReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}