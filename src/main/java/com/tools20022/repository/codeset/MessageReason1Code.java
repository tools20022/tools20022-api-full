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
import com.tools20022.repository.codeset.MessageReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason to send an card acquirer to issuer message.<br>
 * It corresponds to ISO 8583, field number 25 for the version 93, and 9 for the
 * version 2003.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#AcquirerStandin
 * MessageReason1Code.AcquirerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#AmountInconsistency
 * MessageReason1Code.AmountInconsistency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CardAcceptorSuspicious
 * MessageReason1Code.CardAcceptorSuspicious}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CardDeclined
 * MessageReason1Code.CardDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CardProcessed
 * MessageReason1Code.CardProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CardRandomSelection
 * MessageReason1Code.CardRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CardRetained
 * MessageReason1Code.CardRetained}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CardUnableToProcess
 * MessageReason1Code.CardUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#CustomerCancel
 * MessageReason1Code.CustomerCancel}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#DeactivatedKey
 * MessageReason1Code.DeactivatedKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#ErrorInResponse
 * MessageReason1Code.ErrorInResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#FloorLimit
 * MessageReason1Code.FloorLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#InconsistentDeposit
 * MessageReason1Code.InconsistentDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#InvalidVerification
 * MessageReason1Code.InvalidVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#IssuerSignedOff
 * MessageReason1Code.IssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#IssuerStandin
 * MessageReason1Code.IssuerStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#IssuerTimeout
 * MessageReason1Code.IssuerTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#IssuerUnavailable
 * MessageReason1Code.IssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#LifeCycleEnd
 * MessageReason1Code.LifeCycleEnd}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#Malfunction
 * MessageReason1Code.Malfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#OfflineDeclined
 * MessageReason1Code.OfflineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#OnLineDeclined
 * MessageReason1Code.OnLineDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#OnlineForced
 * MessageReason1Code.OnlineForced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#OutOfSynchronisation
 * MessageReason1Code.OutOfSynchronisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#UncompleteDispense
 * MessageReason1Code.UncompleteDispense}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#UnableToSend
 * MessageReason1Code.UnableToSend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#UnableToComplete
 * MessageReason1Code.UnableToComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#TooLateResponse
 * MessageReason1Code.TooLateResponse}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageReason1Code#TimeOut
 * MessageReason1Code.TimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#TerminalUnableToProcess
 * MessageReason1Code.TerminalUnableToProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#TerminalRandomSelection
 * MessageReason1Code.TerminalRandomSelection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#TerminalProcessed
 * MessageReason1Code.TerminalProcessed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#SuspectedFraud
 * MessageReason1Code.SuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#SecurityReason
 * MessageReason1Code.SecurityReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#ReceiverUnavailable
 * MessageReason1Code.ReceiverUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#ReceiverTimeout
 * MessageReason1Code.ReceiverTimeout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#ReceiverStandin
 * MessageReason1Code.ReceiverStandin}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#ReceiverSignedOff
 * MessageReason1Code.ReceiverSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageReason1Code#PartiallyCompleted
 * MessageReason1Code.PartiallyCompleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageReasonCode
 * MessageReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageReason1Code extends MMCode {

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
	public static final MessageReason1Code AcquirerStandin = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerStandin";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.AcquirerStandin.getCodeName().orElse(name);
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
	public static final MessageReason1Code AmountInconsistency = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountInconsistency";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.AmountInconsistency.getCodeName().orElse(name);
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
	public static final MessageReason1Code CardAcceptorSuspicious = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardAcceptorSuspicious";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CardAcceptorSuspicious.getCodeName().orElse(name);
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
	public static final MessageReason1Code CardDeclined = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDeclined";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CardDeclined.getCodeName().orElse(name);
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
	public static final MessageReason1Code CardProcessed = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CardProcessed.getCodeName().orElse(name);
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
	public static final MessageReason1Code CardRandomSelection = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRandomSelection";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CardRandomSelection.getCodeName().orElse(name);
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
	public static final MessageReason1Code CardRetained = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardRetained";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CardRetained.getCodeName().orElse(name);
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
	public static final MessageReason1Code CardUnableToProcess = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardUnableToProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CardUnableToProcess.getCodeName().orElse(name);
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
	public static final MessageReason1Code CustomerCancel = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerCancel";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.CustomerCancel.getCodeName().orElse(name);
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
	public static final MessageReason1Code DeactivatedKey = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeactivatedKey";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.DeactivatedKey.getCodeName().orElse(name);
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
	public static final MessageReason1Code ErrorInResponse = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ErrorInResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.ErrorInResponse.getCodeName().orElse(name);
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
	public static final MessageReason1Code FloorLimit = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FloorLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.FloorLimit.getCodeName().orElse(name);
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
	public static final MessageReason1Code InconsistentDeposit = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InconsistentDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.InconsistentDeposit.getCodeName().orElse(name);
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
	public static final MessageReason1Code InvalidVerification = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.InvalidVerification.getCodeName().orElse(name);
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
	public static final MessageReason1Code IssuerSignedOff = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.IssuerSignedOff.getCodeName().orElse(name);
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
	public static final MessageReason1Code IssuerStandin = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerStandin";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.IssuerStandin.getCodeName().orElse(name);
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
	public static final MessageReason1Code IssuerTimeout = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeout";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.IssuerTimeout.getCodeName().orElse(name);
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
	public static final MessageReason1Code IssuerUnavailable = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.IssuerUnavailable.getCodeName().orElse(name);
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
	public static final MessageReason1Code LifeCycleEnd = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LifeCycleEnd";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.LifeCycleEnd.getCodeName().orElse(name);
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
	public static final MessageReason1Code Malfunction = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Malfunction";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.Malfunction.getCodeName().orElse(name);
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
	public static final MessageReason1Code OfflineDeclined = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfflineDeclined";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.OfflineDeclined.getCodeName().orElse(name);
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
	public static final MessageReason1Code OnLineDeclined = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineDeclined";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.OnLineDeclined.getCodeName().orElse(name);
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
	public static final MessageReason1Code OnlineForced = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnlineForced";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.OnlineForced.getCodeName().orElse(name);
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
	public static final MessageReason1Code OutOfSynchronisation = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSynchronisation";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.OutOfSynchronisation.getCodeName().orElse(name);
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
	public static final MessageReason1Code UncompleteDispense = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UncompleteDispense";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.UncompleteDispense.getCodeName().orElse(name);
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
	public static final MessageReason1Code UnableToSend = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToSend";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.UnableToSend.getCodeName().orElse(name);
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
	public static final MessageReason1Code UnableToComplete = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToComplete";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.UnableToComplete.getCodeName().orElse(name);
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
	public static final MessageReason1Code TooLateResponse = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLateResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.TooLateResponse.getCodeName().orElse(name);
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
	public static final MessageReason1Code TimeOut = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TimeOut";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.TimeOut.getCodeName().orElse(name);
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
	public static final MessageReason1Code TerminalUnableToProcess = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalUnableToProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.TerminalUnableToProcess.getCodeName().orElse(name);
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
	public static final MessageReason1Code TerminalRandomSelection = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalRandomSelection";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.TerminalRandomSelection.getCodeName().orElse(name);
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
	public static final MessageReason1Code TerminalProcessed = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalProcessed";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.TerminalProcessed.getCodeName().orElse(name);
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
	public static final MessageReason1Code SuspectedFraud = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.SuspectedFraud.getCodeName().orElse(name);
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
	public static final MessageReason1Code SecurityReason = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityReason";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.SecurityReason.getCodeName().orElse(name);
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
	public static final MessageReason1Code ReceiverUnavailable = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverUnavailable";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.ReceiverUnavailable.getCodeName().orElse(name);
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
	public static final MessageReason1Code ReceiverTimeout = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverTimeout";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.ReceiverTimeout.getCodeName().orElse(name);
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
	public static final MessageReason1Code ReceiverStandin = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverStandin";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.ReceiverStandin.getCodeName().orElse(name);
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
	public static final MessageReason1Code ReceiverSignedOff = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverSignedOff";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.ReceiverSignedOff.getCodeName().orElse(name);
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
	public static final MessageReason1Code PartiallyCompleted = new MessageReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyCompleted";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageReason1Code.mmObject();
			codeName = MessageReasonCode.PartiallyCompleted.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageReason1Code> codesByName = new LinkedHashMap<>();

	protected MessageReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageReason1Code";
				definition = "Reason to send an card acquirer to issuer message.\r\nIt corresponds to ISO 8583, field number 25 for the version 93, and 9 for the version 2003.";
				trace_lazy = () -> MessageReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageReason1Code.AcquirerStandin, com.tools20022.repository.codeset.MessageReason1Code.AmountInconsistency,
						com.tools20022.repository.codeset.MessageReason1Code.CardAcceptorSuspicious, com.tools20022.repository.codeset.MessageReason1Code.CardDeclined, com.tools20022.repository.codeset.MessageReason1Code.CardProcessed,
						com.tools20022.repository.codeset.MessageReason1Code.CardRandomSelection, com.tools20022.repository.codeset.MessageReason1Code.CardRetained, com.tools20022.repository.codeset.MessageReason1Code.CardUnableToProcess,
						com.tools20022.repository.codeset.MessageReason1Code.CustomerCancel, com.tools20022.repository.codeset.MessageReason1Code.DeactivatedKey, com.tools20022.repository.codeset.MessageReason1Code.ErrorInResponse,
						com.tools20022.repository.codeset.MessageReason1Code.FloorLimit, com.tools20022.repository.codeset.MessageReason1Code.InconsistentDeposit, com.tools20022.repository.codeset.MessageReason1Code.InvalidVerification,
						com.tools20022.repository.codeset.MessageReason1Code.IssuerSignedOff, com.tools20022.repository.codeset.MessageReason1Code.IssuerStandin, com.tools20022.repository.codeset.MessageReason1Code.IssuerTimeout,
						com.tools20022.repository.codeset.MessageReason1Code.IssuerUnavailable, com.tools20022.repository.codeset.MessageReason1Code.LifeCycleEnd, com.tools20022.repository.codeset.MessageReason1Code.Malfunction,
						com.tools20022.repository.codeset.MessageReason1Code.OfflineDeclined, com.tools20022.repository.codeset.MessageReason1Code.OnLineDeclined, com.tools20022.repository.codeset.MessageReason1Code.OnlineForced,
						com.tools20022.repository.codeset.MessageReason1Code.OutOfSynchronisation, com.tools20022.repository.codeset.MessageReason1Code.UncompleteDispense, com.tools20022.repository.codeset.MessageReason1Code.UnableToSend,
						com.tools20022.repository.codeset.MessageReason1Code.UnableToComplete, com.tools20022.repository.codeset.MessageReason1Code.TooLateResponse, com.tools20022.repository.codeset.MessageReason1Code.TimeOut,
						com.tools20022.repository.codeset.MessageReason1Code.TerminalUnableToProcess, com.tools20022.repository.codeset.MessageReason1Code.TerminalRandomSelection,
						com.tools20022.repository.codeset.MessageReason1Code.TerminalProcessed, com.tools20022.repository.codeset.MessageReason1Code.SuspectedFraud, com.tools20022.repository.codeset.MessageReason1Code.SecurityReason,
						com.tools20022.repository.codeset.MessageReason1Code.ReceiverUnavailable, com.tools20022.repository.codeset.MessageReason1Code.ReceiverTimeout, com.tools20022.repository.codeset.MessageReason1Code.ReceiverStandin,
						com.tools20022.repository.codeset.MessageReason1Code.ReceiverSignedOff, com.tools20022.repository.codeset.MessageReason1Code.PartiallyCompleted);
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
		codesByName.put(UncompleteDispense.getCodeName().get(), UncompleteDispense);
		codesByName.put(UnableToSend.getCodeName().get(), UnableToSend);
		codesByName.put(UnableToComplete.getCodeName().get(), UnableToComplete);
		codesByName.put(TooLateResponse.getCodeName().get(), TooLateResponse);
		codesByName.put(TimeOut.getCodeName().get(), TimeOut);
		codesByName.put(TerminalUnableToProcess.getCodeName().get(), TerminalUnableToProcess);
		codesByName.put(TerminalRandomSelection.getCodeName().get(), TerminalRandomSelection);
		codesByName.put(TerminalProcessed.getCodeName().get(), TerminalProcessed);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(SecurityReason.getCodeName().get(), SecurityReason);
		codesByName.put(ReceiverUnavailable.getCodeName().get(), ReceiverUnavailable);
		codesByName.put(ReceiverTimeout.getCodeName().get(), ReceiverTimeout);
		codesByName.put(ReceiverStandin.getCodeName().get(), ReceiverStandin);
		codesByName.put(ReceiverSignedOff.getCodeName().get(), ReceiverSignedOff);
		codesByName.put(PartiallyCompleted.getCodeName().get(), PartiallyCompleted);
	}

	public static MessageReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageReason1Code[] values() {
		MessageReason1Code[] values = new MessageReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageReason1Code> {
		@Override
		public MessageReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}