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
import com.tools20022.repository.codeset.PendingSettlementStatusReasonCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason for a transfer or settlement instruction settlement
 * pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
 * PendingSettlementStatusReasonCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingSharesFromCounterparty
 * PendingSettlementStatusReason2Code.mmAwaitingSharesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAccountBlocked
 * PendingSettlementStatusReason2Code.mmAccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingSecurities
 * PendingSettlementStatusReason2Code.mmAwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmCounterpartyInsufficientSecurities
 * PendingSettlementStatusReason2Code.mmCounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingSettlementStatusReason2Code.
 * mmAwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingDocumentsOrEndorsementsFromYou
 * PendingSettlementStatusReason2Code.mmAwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmStatusReasonInvestigation
 * PendingSettlementStatusReason2Code.mmStatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmLackOfSecurities
 * PendingSettlementStatusReason2Code.mmLackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmPendingLinkedInstruction
 * PendingSettlementStatusReason2Code.mmPendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmPhysicalSecuritiesVerification
 * PendingSettlementStatusReason2Code.mmPhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmPhysicalDeliveryDelay
 * PendingSettlementStatusReason2Code.mmPhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmSecuritiesBlocked
 * PendingSettlementStatusReason2Code.mmSecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmMissingInformation
 * PendingSettlementStatusReason2Code.mmMissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAccountNotOpen
 * PendingSettlementStatusReason2Code.mmAccountNotOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmUnderInvestigation
 * PendingSettlementStatusReason2Code.mmUnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmUnderClientInvestigation
 * PendingSettlementStatusReason2Code.mmUnderClientInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmUnderTransferAgentInvestigation
 * PendingSettlementStatusReason2Code.mmUnderTransferAgentInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingTransferAgentStatus
 * PendingSettlementStatusReason2Code.mmAwaitingTransferAgentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmUsualTransactionTime
 * PendingSettlementStatusReason2Code.mmUsualTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingStatus
 * PendingSettlementStatusReason2Code.mmAwaitingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmApplicationFormSent
 * PendingSettlementStatusReason2Code.mmApplicationFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmStockTransferFormSent
 * PendingSettlementStatusReason2Code.mmStockTransferFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmLongerProcessing
 * PendingSettlementStatusReason2Code.mmLongerProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAdditionalDocumentsRequested
 * PendingSettlementStatusReason2Code.mmAdditionalDocumentsRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAdditionalDocumentsSent1
 * PendingSettlementStatusReason2Code.mmAdditionalDocumentsSent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAdditionalDocumentsSent2
 * PendingSettlementStatusReason2Code.mmAdditionalDocumentsSent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmDocumentsRejected
 * PendingSettlementStatusReason2Code.mmDocumentsRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingCounterpartyReceipt
 * PendingSettlementStatusReason2Code.mmAwaitingCounterpartyReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmAwaitingCounterpartyDelivery
 * PendingSettlementStatusReason2Code.mmAwaitingCounterpartyDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmNormalProcessingPeriodLapsed
 * PendingSettlementStatusReason2Code.mmNormalProcessingPeriodLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmWrongCounterpartyAccount
 * PendingSettlementStatusReason2Code.mmWrongCounterpartyAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmLackOfStampDutyInformation
 * PendingSettlementStatusReason2Code.mmLackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmTransferAgentProcessing
 * PendingSettlementStatusReason2Code.mmTransferAgentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmExpectedConfirmation
 * PendingSettlementStatusReason2Code.mmExpectedConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmEscalation
 * PendingSettlementStatusReason2Code.mmEscalation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmTransferAgentNonReceipt
 * PendingSettlementStatusReason2Code.mmTransferAgentNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#mmFinalVerification
 * PendingSettlementStatusReason2Code.mmFinalVerification}</li>
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
 * <li>"AWSH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingSettlementStatusReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason for a transfer or settlement instruction settlement pending status."
 * </li>
 * </ul>
 */
public class PendingSettlementStatusReason2Code extends PendingSettlementStatusReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSharesFromCounterparty"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingSharesFromCounterparty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final MMCode mmAccountBlocked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmCounterpartyInsufficientSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingDocumentsOrEndorsementsFromCounterparty = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingDocumentsOrEndorsementsFromYou = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * </ul>
	 */
	public static final MMCode mmStatusReasonInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final MMCode mmLackOfSecurities = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * </ul>
	 */
	public static final MMCode mmPendingLinkedInstruction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalSecuritiesVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalDeliveryDelay = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * </ul>
	 */
	public static final MMCode mmSecuritiesBlocked = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingInformation"</li>
	 * </ul>
	 */
	public static final MMCode mmMissingInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotOpen"</li>
	 * </ul>
	 */
	public static final MMCode mmAccountNotOpen = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderInvestigation"</li>
	 * </ul>
	 */
	public static final MMCode mmUnderInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderClientInvestigation"</li>
	 * </ul>
	 */
	public static final MMCode mmUnderClientInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderTransferAgentInvestigation"</li>
	 * </ul>
	 */
	public static final MMCode mmUnderTransferAgentInvestigation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingTransferAgentStatus"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingTransferAgentStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UsualTransactionTime"</li>
	 * </ul>
	 */
	public static final MMCode mmUsualTransactionTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingStatus"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationFormSent"</li>
	 * </ul>
	 */
	public static final MMCode mmApplicationFormSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockTransferFormSent"</li>
	 * </ul>
	 */
	public static final MMCode mmStockTransferFormSent = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LongerProcessing"</li>
	 * </ul>
	 */
	public static final MMCode mmLongerProcessing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsRequested"</li>
	 * </ul>
	 */
	public static final MMCode mmAdditionalDocumentsRequested = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsSent1"</li>
	 * </ul>
	 */
	public static final MMCode mmAdditionalDocumentsSent1 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalDocumentsSent2"</li>
	 * </ul>
	 */
	public static final MMCode mmAdditionalDocumentsSent2 = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentsRejected"</li>
	 * </ul>
	 */
	public static final MMCode mmDocumentsRejected = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCounterpartyReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingCounterpartyReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingCounterpartyDelivery"</li>
	 * </ul>
	 */
	public static final MMCode mmAwaitingCounterpartyDelivery = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NormalProcessingPeriodLapsed"</li>
	 * </ul>
	 */
	public static final MMCode mmNormalProcessingPeriodLapsed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCounterpartyAccount"</li>
	 * </ul>
	 */
	public static final MMCode mmWrongCounterpartyAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * </ul>
	 */
	public static final MMCode mmLackOfStampDutyInformation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgentProcessing"</li>
	 * </ul>
	 */
	public static final MMCode mmTransferAgentProcessing = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpectedConfirmation"</li>
	 * </ul>
	 */
	public static final MMCode mmExpectedConfirmation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Escalation"</li>
	 * </ul>
	 */
	public static final MMCode mmEscalation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAgentNonReceipt"</li>
	 * </ul>
	 */
	public static final MMCode mmTransferAgentNonReceipt = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code
	 * PendingSettlementStatusReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalVerification"</li>
	 * </ul>
	 */
	public static final MMCode mmFinalVerification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			owner_lazy = () -> PendingSettlementStatusReason2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AWSH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatusReason2Code";
				definition = "Specifies the reason for a transfer or settlement instruction settlement pending status.";
				code_lazy = () -> Arrays.asList(PendingSettlementStatusReason2Code.mmAwaitingSharesFromCounterparty, PendingSettlementStatusReason2Code.mmAccountBlocked, PendingSettlementStatusReason2Code.mmAwaitingSecurities,
						PendingSettlementStatusReason2Code.mmCounterpartyInsufficientSecurities, PendingSettlementStatusReason2Code.mmAwaitingDocumentsOrEndorsementsFromCounterparty,
						PendingSettlementStatusReason2Code.mmAwaitingDocumentsOrEndorsementsFromYou, PendingSettlementStatusReason2Code.mmStatusReasonInvestigation, PendingSettlementStatusReason2Code.mmLackOfSecurities,
						PendingSettlementStatusReason2Code.mmPendingLinkedInstruction, PendingSettlementStatusReason2Code.mmPhysicalSecuritiesVerification, PendingSettlementStatusReason2Code.mmPhysicalDeliveryDelay,
						PendingSettlementStatusReason2Code.mmSecuritiesBlocked, PendingSettlementStatusReason2Code.mmMissingInformation, PendingSettlementStatusReason2Code.mmAccountNotOpen,
						PendingSettlementStatusReason2Code.mmUnderInvestigation, PendingSettlementStatusReason2Code.mmUnderClientInvestigation, PendingSettlementStatusReason2Code.mmUnderTransferAgentInvestigation,
						PendingSettlementStatusReason2Code.mmAwaitingTransferAgentStatus, PendingSettlementStatusReason2Code.mmUsualTransactionTime, PendingSettlementStatusReason2Code.mmAwaitingStatus,
						PendingSettlementStatusReason2Code.mmApplicationFormSent, PendingSettlementStatusReason2Code.mmStockTransferFormSent, PendingSettlementStatusReason2Code.mmLongerProcessing,
						PendingSettlementStatusReason2Code.mmAdditionalDocumentsRequested, PendingSettlementStatusReason2Code.mmAdditionalDocumentsSent1, PendingSettlementStatusReason2Code.mmAdditionalDocumentsSent2,
						PendingSettlementStatusReason2Code.mmDocumentsRejected, PendingSettlementStatusReason2Code.mmAwaitingCounterpartyReceipt, PendingSettlementStatusReason2Code.mmAwaitingCounterpartyDelivery,
						PendingSettlementStatusReason2Code.mmNormalProcessingPeriodLapsed, PendingSettlementStatusReason2Code.mmWrongCounterpartyAccount, PendingSettlementStatusReason2Code.mmLackOfStampDutyInformation,
						PendingSettlementStatusReason2Code.mmTransferAgentProcessing, PendingSettlementStatusReason2Code.mmExpectedConfirmation, PendingSettlementStatusReason2Code.mmEscalation,
						PendingSettlementStatusReason2Code.mmTransferAgentNonReceipt, PendingSettlementStatusReason2Code.mmFinalVerification);
				trace_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}