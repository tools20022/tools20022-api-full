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
import com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason for a transfer or settlement instruction settlement
 * pending status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingSharesFromCounterparty
 * PendingSettlementStatusReason2Code.AwaitingSharesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AccountBlocked
 * PendingSettlementStatusReason2Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingSecurities
 * PendingSettlementStatusReason2Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#CounterpartyInsufficientSecurities
 * PendingSettlementStatusReason2Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingSettlementStatusReason2Code.
 * AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingSettlementStatusReason2Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#StatusReasonInvestigation
 * PendingSettlementStatusReason2Code.StatusReasonInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#LackOfSecurities
 * PendingSettlementStatusReason2Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#PendingLinkedInstruction
 * PendingSettlementStatusReason2Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#PhysicalSecuritiesVerification
 * PendingSettlementStatusReason2Code.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#PhysicalDeliveryDelay
 * PendingSettlementStatusReason2Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#SecuritiesBlocked
 * PendingSettlementStatusReason2Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#MissingInformation
 * PendingSettlementStatusReason2Code.MissingInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AccountNotOpen
 * PendingSettlementStatusReason2Code.AccountNotOpen}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#UnderInvestigation
 * PendingSettlementStatusReason2Code.UnderInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#UnderClientInvestigation
 * PendingSettlementStatusReason2Code.UnderClientInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#UnderTransferAgentInvestigation
 * PendingSettlementStatusReason2Code.UnderTransferAgentInvestigation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingTransferAgentStatus
 * PendingSettlementStatusReason2Code.AwaitingTransferAgentStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#UsualTransactionTime
 * PendingSettlementStatusReason2Code.UsualTransactionTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingStatus
 * PendingSettlementStatusReason2Code.AwaitingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#ApplicationFormSent
 * PendingSettlementStatusReason2Code.ApplicationFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#StockTransferFormSent
 * PendingSettlementStatusReason2Code.StockTransferFormSent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#LongerProcessing
 * PendingSettlementStatusReason2Code.LongerProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AdditionalDocumentsRequested
 * PendingSettlementStatusReason2Code.AdditionalDocumentsRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AdditionalDocumentsSent1
 * PendingSettlementStatusReason2Code.AdditionalDocumentsSent1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AdditionalDocumentsSent2
 * PendingSettlementStatusReason2Code.AdditionalDocumentsSent2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#DocumentsRejected
 * PendingSettlementStatusReason2Code.DocumentsRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingCounterpartyReceipt
 * PendingSettlementStatusReason2Code.AwaitingCounterpartyReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#AwaitingCounterpartyDelivery
 * PendingSettlementStatusReason2Code.AwaitingCounterpartyDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#NormalProcessingPeriodLapsed
 * PendingSettlementStatusReason2Code.NormalProcessingPeriodLapsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#WrongCounterpartyAccount
 * PendingSettlementStatusReason2Code.WrongCounterpartyAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#LackOfStampDutyInformation
 * PendingSettlementStatusReason2Code.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#TransferAgentProcessing
 * PendingSettlementStatusReason2Code.TransferAgentProcessing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#ExpectedConfirmation
 * PendingSettlementStatusReason2Code.ExpectedConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#Escalation
 * PendingSettlementStatusReason2Code.Escalation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#TransferAgentNonReceipt
 * PendingSettlementStatusReason2Code.TransferAgentNonReceipt}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReason2Code#FinalVerification
 * PendingSettlementStatusReason2Code.FinalVerification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingSettlementStatusReasonCode
 * PendingSettlementStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingSettlementStatusReason2Code extends MMCode {

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
	public static final PendingSettlementStatusReason2Code AwaitingSharesFromCounterparty = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSharesFromCounterparty.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AccountBlocked = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AccountBlocked.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingSecurities = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSecurities.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code CounterpartyInsufficientSecurities = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.CounterpartyInsufficientSecurities.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingDocumentsOrEndorsementsFromYou = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code StatusReasonInvestigation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.StatusReasonInvestigation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code LackOfSecurities = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.LackOfSecurities.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code PendingLinkedInstruction = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PendingLinkedInstruction.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code PhysicalSecuritiesVerification = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PhysicalSecuritiesVerification.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code PhysicalDeliveryDelay = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PhysicalDeliveryDelay.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code SecuritiesBlocked = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.SecuritiesBlocked.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code MissingInformation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.MissingInformation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AccountNotOpen = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotOpen";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AccountNotOpen.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code UnderInvestigation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.UnderInvestigation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code UnderClientInvestigation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderClientInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.UnderClientInvestigation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code UnderTransferAgentInvestigation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderTransferAgentInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.UnderTransferAgentInvestigation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingTransferAgentStatus = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingTransferAgentStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingTransferAgentStatus.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code UsualTransactionTime = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UsualTransactionTime";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.UsualTransactionTime.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingStatus = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingStatus.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code ApplicationFormSent = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationFormSent";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.ApplicationFormSent.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code StockTransferFormSent = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockTransferFormSent";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.StockTransferFormSent.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code LongerProcessing = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LongerProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.LongerProcessing.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AdditionalDocumentsRequested = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AdditionalDocumentsRequested.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AdditionalDocumentsSent1 = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent1";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AdditionalDocumentsSent1.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AdditionalDocumentsSent2 = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalDocumentsSent2";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AdditionalDocumentsSent2.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code DocumentsRejected = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentsRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.DocumentsRejected.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingCounterpartyReceipt = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingCounterpartyReceipt.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code AwaitingCounterpartyDelivery = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingCounterpartyDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingCounterpartyDelivery.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code NormalProcessingPeriodLapsed = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NormalProcessingPeriodLapsed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.NormalProcessingPeriodLapsed.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code WrongCounterpartyAccount = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCounterpartyAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.WrongCounterpartyAccount.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code LackOfStampDutyInformation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.LackOfStampDutyInformation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code TransferAgentProcessing = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentProcessing";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.TransferAgentProcessing.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code ExpectedConfirmation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpectedConfirmation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.ExpectedConfirmation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code Escalation = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Escalation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.Escalation.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code TransferAgentNonReceipt = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAgentNonReceipt";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.TransferAgentNonReceipt.getCodeName().orElse(name);
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
	public static final PendingSettlementStatusReason2Code FinalVerification = new PendingSettlementStatusReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.FinalVerification.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingSettlementStatusReason2Code> codesByName = new LinkedHashMap<>();

	protected PendingSettlementStatusReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWSH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingSettlementStatusReason2Code";
				definition = "Specifies the reason for a transfer or settlement instruction settlement pending status.";
				trace_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingSharesFromCounterparty, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AccountBlocked,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.CounterpartyInsufficientSecurities,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.StatusReasonInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.LackOfSecurities, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.PhysicalSecuritiesVerification, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.PhysicalDeliveryDelay,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.SecuritiesBlocked, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.MissingInformation,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AccountNotOpen, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.UnderInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.UnderClientInvestigation, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.UnderTransferAgentInvestigation,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingTransferAgentStatus, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.UsualTransactionTime,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingStatus, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.ApplicationFormSent,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.StockTransferFormSent, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.LongerProcessing,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AdditionalDocumentsRequested, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AdditionalDocumentsSent1,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AdditionalDocumentsSent2, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.DocumentsRejected,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingCounterpartyReceipt, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.AwaitingCounterpartyDelivery,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.NormalProcessingPeriodLapsed, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.WrongCounterpartyAccount,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.LackOfStampDutyInformation, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.TransferAgentProcessing,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.ExpectedConfirmation, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.Escalation,
						com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.TransferAgentNonReceipt, com.tools20022.repository.codeset.PendingSettlementStatusReason2Code.FinalVerification);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingSharesFromCounterparty.getCodeName().get(), AwaitingSharesFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(StatusReasonInvestigation.getCodeName().get(), StatusReasonInvestigation);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
		codesByName.put(PhysicalSecuritiesVerification.getCodeName().get(), PhysicalSecuritiesVerification);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(SecuritiesBlocked.getCodeName().get(), SecuritiesBlocked);
		codesByName.put(MissingInformation.getCodeName().get(), MissingInformation);
		codesByName.put(AccountNotOpen.getCodeName().get(), AccountNotOpen);
		codesByName.put(UnderInvestigation.getCodeName().get(), UnderInvestigation);
		codesByName.put(UnderClientInvestigation.getCodeName().get(), UnderClientInvestigation);
		codesByName.put(UnderTransferAgentInvestigation.getCodeName().get(), UnderTransferAgentInvestigation);
		codesByName.put(AwaitingTransferAgentStatus.getCodeName().get(), AwaitingTransferAgentStatus);
		codesByName.put(UsualTransactionTime.getCodeName().get(), UsualTransactionTime);
		codesByName.put(AwaitingStatus.getCodeName().get(), AwaitingStatus);
		codesByName.put(ApplicationFormSent.getCodeName().get(), ApplicationFormSent);
		codesByName.put(StockTransferFormSent.getCodeName().get(), StockTransferFormSent);
		codesByName.put(LongerProcessing.getCodeName().get(), LongerProcessing);
		codesByName.put(AdditionalDocumentsRequested.getCodeName().get(), AdditionalDocumentsRequested);
		codesByName.put(AdditionalDocumentsSent1.getCodeName().get(), AdditionalDocumentsSent1);
		codesByName.put(AdditionalDocumentsSent2.getCodeName().get(), AdditionalDocumentsSent2);
		codesByName.put(DocumentsRejected.getCodeName().get(), DocumentsRejected);
		codesByName.put(AwaitingCounterpartyReceipt.getCodeName().get(), AwaitingCounterpartyReceipt);
		codesByName.put(AwaitingCounterpartyDelivery.getCodeName().get(), AwaitingCounterpartyDelivery);
		codesByName.put(NormalProcessingPeriodLapsed.getCodeName().get(), NormalProcessingPeriodLapsed);
		codesByName.put(WrongCounterpartyAccount.getCodeName().get(), WrongCounterpartyAccount);
		codesByName.put(LackOfStampDutyInformation.getCodeName().get(), LackOfStampDutyInformation);
		codesByName.put(TransferAgentProcessing.getCodeName().get(), TransferAgentProcessing);
		codesByName.put(ExpectedConfirmation.getCodeName().get(), ExpectedConfirmation);
		codesByName.put(Escalation.getCodeName().get(), Escalation);
		codesByName.put(TransferAgentNonReceipt.getCodeName().get(), TransferAgentNonReceipt);
		codesByName.put(FinalVerification.getCodeName().get(), FinalVerification);
	}

	public static PendingSettlementStatusReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingSettlementStatusReason2Code[] values() {
		PendingSettlementStatusReason2Code[] values = new PendingSettlementStatusReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingSettlementStatusReason2Code> {
		@Override
		public PendingSettlementStatusReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingSettlementStatusReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}