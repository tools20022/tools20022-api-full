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
import com.tools20022.repository.codeset.PendingReason10Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is pending settlement.
 * Settlement on the instructed settlement date is still possible.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingMoney
 * PendingReason10Code.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AccountServicerDeadlineMissed
 * PendingReason10Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingSecurities
 * PendingReason10Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#InstructionRefusedOrNotRecognised
 * PendingReason10Code.InstructionRefusedOrNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingSecuritiesFromCounterparty
 * PendingReason10Code.AwaitingSecuritiesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#PhysicalDeliveryDelay
 * PendingReason10Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#TradeAmendedInMarket
 * PendingReason10Code.TradeAmendedInMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingReason10Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingReason10Code.AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AccountBlocked
 * PendingReason10Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#EnquirySent
 * PendingReason10Code.EnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#NewIssues
 * PendingReason10Code.NewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CounterpartyInsufficientSecurities
 * PendingReason10Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#MultipleSettlementAmount
 * PendingReason10Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#GlobalFormSecurities
 * PendingReason10Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#YourInstructionOnHold
 * PendingReason10Code.YourInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#TradeSettlesInPartials
 * PendingReason10Code.TradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#NoMatchingRequired
 * PendingReason10Code.NoMatchingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#NoForeignExchangeInstruction
 * PendingReason10Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CounterpartyInsufficientMoney
 * PendingReason10Code.CounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CollateralShortage
 * PendingReason10Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#SecuritiesPledgedAsCollateral
 * PendingReason10Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#RefusedDepositForIssueOfDepositaryReceipts
 * PendingReason10Code.RefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#MaximumForeignLimitReached
 * PendingReason10Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#IncomeAdjustementRequired
 * PendingReason10Code.IncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#PendingLinkedInstruction
 * PendingReason10Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingSettlementDate
 * PendingReason10Code.AwaitingSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#LackOfSecurities
 * PendingReason10Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#SecuritiesLoanedOut
 * PendingReason10Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#InsufficientMoney
 * PendingReason10Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#ConfirmationNotReceived
 * PendingReason10Code.ConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#NotInGoodOrder
 * PendingReason10Code.NotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#LackOfStampDutyInformation
 * PendingReason10Code.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#ProcessingBatchDifference
 * PendingReason10Code.ProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingNextSettlementCycle
 * PendingReason10Code.AwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#SecuritiesBlocked
 * PendingReason10Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CounterpartyInReceivership
 * PendingReason10Code.CounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#MinimumSettlementAmount
 * PendingReason10Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#StatusReasonInvestigation
 * PendingReason10Code.StatusReasonInvestigation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingReason10Code#Other
 * PendingReason10Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#PhysicalSecuritiesVerification
 * PendingReason10Code.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#BeneficialOwnershipDisagreement
 * PendingReason10Code.BeneficialOwnershipDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#BothInstructionsOnHold
 * PendingReason10Code.BothInstructionsOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#ClearingHouseTrade
 * PendingReason10Code.ClearingHouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#UnavailableDeliverableDenominatedQuantity
 * PendingReason10Code.UnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#NaturalDisaster
 * PendingReason10Code.NaturalDisaster}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CounterpartyReturnedShares
 * PendingReason10Code.CounterpartyReturnedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#SecuritiesFrozenAtCSD
 * PendingReason10Code.SecuritiesFrozenAtCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#AwaitingOtherTransaction
 * PendingReason10Code.AwaitingOtherTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#MarketDeadlineMissed
 * PendingReason10Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#InsufficientCentralBankLiquidity
 * PendingReason10Code.InsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CounterpartyInstructionOnHold
 * PendingReason10Code.CounterpartyInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#CertificatesRejected
 * PendingReason10Code.CertificatesRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#SettlementSystemMethodModified
 * PendingReason10Code.SettlementSystemMethodModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#WrongCertificatesNumbers
 * PendingReason10Code.WrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#SystemOnHold
 * PendingReason10Code.SystemOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code#IncompleteNumberCount
 * PendingReason10Code.IncompleteNumberCount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PendingFailingReasonCode
 * PendingFailingReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AWMO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingReason10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is pending settlement. Settlement on the instructed settlement date is still possible."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.PendingReason1Code
 * PendingReason1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingReason10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingMoney = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AccountServicerDeadlineMissed = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingSecurities = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionRefusedOrNotRecognised"</li>
	 * </ul>
	 */
	public static final PendingReason10Code InstructionRefusedOrNotRecognised = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.InstructionRefusedOrNotRecognised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecuritiesFromCounterparty"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingSecuritiesFromCounterparty = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecuritiesFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * </ul>
	 */
	public static final PendingReason10Code PhysicalDeliveryDelay = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.PhysicalDeliveryDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmendedInMarket"</li>
	 * </ul>
	 */
	public static final PendingReason10Code TradeAmendedInMarket = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmendedInMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.TradeAmendedInMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingDocumentsOrEndorsementsFromYou = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AccountBlocked = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnquirySent"</li>
	 * </ul>
	 */
	public static final PendingReason10Code EnquirySent = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.EnquirySent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssues"</li>
	 * </ul>
	 */
	public static final PendingReason10Code NewIssues = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.NewIssues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CounterpartyInsufficientSecurities = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInsufficientSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingReason10Code MultipleSettlementAmount = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.MultipleSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * </ul>
	 */
	public static final PendingReason10Code GlobalFormSecurities = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.GlobalFormSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YourInstructionOnHold"</li>
	 * </ul>
	 */
	public static final PendingReason10Code YourInstructionOnHold = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YourInstructionOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.YourInstructionOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlesInPartials"</li>
	 * </ul>
	 */
	public static final PendingReason10Code TradeSettlesInPartials = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.TradeSettlesInPartials.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingRequired"</li>
	 * </ul>
	 */
	public static final PendingReason10Code NoMatchingRequired = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.NoMatchingRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * </ul>
	 */
	public static final PendingReason10Code NoForeignExchangeInstruction = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.NoForeignExchangeInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientMoney"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CounterpartyInsufficientMoney = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CollateralShortage = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CollateralShortage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * </ul>
	 */
	public static final PendingReason10Code SecuritiesPledgedAsCollateral = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesPledgedAsCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedDepositForIssueOfDepositaryReceipts"</li>
	 * </ul>
	 */
	public static final PendingReason10Code RefusedDepositForIssueOfDepositaryReceipts = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.RefusedDepositForIssueOfDepositaryReceipts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * </ul>
	 */
	public static final PendingReason10Code MaximumForeignLimitReached = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.MaximumForeignLimitReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeAdjustementRequired"</li>
	 * </ul>
	 */
	public static final PendingReason10Code IncomeAdjustementRequired = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.IncomeAdjustementRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * </ul>
	 */
	public static final PendingReason10Code PendingLinkedInstruction = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.PendingLinkedInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSettlementDate"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingSettlementDate = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final PendingReason10Code LackOfSecurities = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * </ul>
	 */
	public static final PendingReason10Code SecuritiesLoanedOut = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesLoanedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final PendingReason10Code InsufficientMoney = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationNotReceived"</li>
	 * </ul>
	 */
	public static final PendingReason10Code ConfirmationNotReceived = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.ConfirmationNotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInGoodOrder"</li>
	 * </ul>
	 */
	public static final PendingReason10Code NotInGoodOrder = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.NotInGoodOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * </ul>
	 */
	public static final PendingReason10Code LackOfStampDutyInformation = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfStampDutyInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchDifference"</li>
	 * </ul>
	 */
	public static final PendingReason10Code ProcessingBatchDifference = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.ProcessingBatchDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingNextSettlementCycle"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingNextSettlementCycle = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingNextSettlementCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * </ul>
	 */
	public static final PendingReason10Code SecuritiesBlocked = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInReceivership"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CounterpartyInReceivership = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInReceivership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingReason10Code MinimumSettlementAmount = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.MinimumSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * </ul>
	 */
	public static final PendingReason10Code StatusReasonInvestigation = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.StatusReasonInvestigation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final PendingReason10Code Other = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * </ul>
	 */
	public static final PendingReason10Code PhysicalSecuritiesVerification = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.PhysicalSecuritiesVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipDisagreement"</li>
	 * </ul>
	 */
	public static final PendingReason10Code BeneficialOwnershipDisagreement = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.BeneficialOwnershipDisagreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BothInstructionsOnHold"</li>
	 * </ul>
	 */
	public static final PendingReason10Code BothInstructionsOnHold = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothInstructionsOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.BothInstructionsOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingHouseTrade"</li>
	 * </ul>
	 */
	public static final PendingReason10Code ClearingHouseTrade = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.ClearingHouseTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableDeliverableDenominatedQuantity"</li>
	 * </ul>
	 */
	public static final PendingReason10Code UnavailableDeliverableDenominatedQuantity = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.UnavailableDeliverableDenominatedQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalDisaster"</li>
	 * </ul>
	 */
	public static final PendingReason10Code NaturalDisaster = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalDisaster";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.NaturalDisaster.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReturnedShares"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CounterpartyReturnedShares = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReturnedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyReturnedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFrozenAtCSD"</li>
	 * </ul>
	 */
	public static final PendingReason10Code SecuritiesFrozenAtCSD = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFrozenAtCSD";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesFrozenAtCSD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingOtherTransaction"</li>
	 * </ul>
	 */
	public static final PendingReason10Code AwaitingOtherTransaction = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingOtherTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingOtherTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final PendingReason10Code MarketDeadlineMissed = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCentralBankLiquidity"</li>
	 * </ul>
	 */
	public static final PendingReason10Code InsufficientCentralBankLiquidity = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientCentralBankLiquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInstructionOnHold"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CounterpartyInstructionOnHold = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInstructionOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInstructionOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesRejected"</li>
	 * </ul>
	 */
	public static final PendingReason10Code CertificatesRejected = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.CertificatesRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodModified"</li>
	 * </ul>
	 */
	public static final PendingReason10Code SettlementSystemMethodModified = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodModified";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.SettlementSystemMethodModified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * </ul>
	 */
	public static final PendingReason10Code WrongCertificatesNumbers = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemOnHold"</li>
	 * </ul>
	 */
	public static final PendingReason10Code SystemOnHold = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.SystemOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingReason10Code
	 * PendingReason10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteNumberCount"</li>
	 * </ul>
	 */
	public static final PendingReason10Code IncompleteNumberCount = new PendingReason10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingReason10Code.mmObject();
			codeName = PendingFailingReasonCode.IncompleteNumberCount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingReason10Code> codesByName = new LinkedHashMap<>();

	protected PendingReason10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingReason10Code";
				definition = "Specifies the reason the transaction/instruction is pending settlement. Settlement on the instructed settlement date is still possible.";
				previousVersion_lazy = () -> PendingReason1Code.mmObject();
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingReason10Code.AwaitingMoney, com.tools20022.repository.codeset.PendingReason10Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.PendingReason10Code.AwaitingSecurities, com.tools20022.repository.codeset.PendingReason10Code.InstructionRefusedOrNotRecognised,
						com.tools20022.repository.codeset.PendingReason10Code.AwaitingSecuritiesFromCounterparty, com.tools20022.repository.codeset.PendingReason10Code.PhysicalDeliveryDelay,
						com.tools20022.repository.codeset.PendingReason10Code.TradeAmendedInMarket, com.tools20022.repository.codeset.PendingReason10Code.AwaitingDocumentsOrEndorsementsFromYou,
						com.tools20022.repository.codeset.PendingReason10Code.AwaitingDocumentsOrEndorsementsFromCounterparty, com.tools20022.repository.codeset.PendingReason10Code.AccountBlocked,
						com.tools20022.repository.codeset.PendingReason10Code.EnquirySent, com.tools20022.repository.codeset.PendingReason10Code.NewIssues,
						com.tools20022.repository.codeset.PendingReason10Code.CounterpartyInsufficientSecurities, com.tools20022.repository.codeset.PendingReason10Code.MultipleSettlementAmount,
						com.tools20022.repository.codeset.PendingReason10Code.GlobalFormSecurities, com.tools20022.repository.codeset.PendingReason10Code.YourInstructionOnHold,
						com.tools20022.repository.codeset.PendingReason10Code.TradeSettlesInPartials, com.tools20022.repository.codeset.PendingReason10Code.NoMatchingRequired,
						com.tools20022.repository.codeset.PendingReason10Code.NoForeignExchangeInstruction, com.tools20022.repository.codeset.PendingReason10Code.CounterpartyInsufficientMoney,
						com.tools20022.repository.codeset.PendingReason10Code.CollateralShortage, com.tools20022.repository.codeset.PendingReason10Code.SecuritiesPledgedAsCollateral,
						com.tools20022.repository.codeset.PendingReason10Code.RefusedDepositForIssueOfDepositaryReceipts, com.tools20022.repository.codeset.PendingReason10Code.MaximumForeignLimitReached,
						com.tools20022.repository.codeset.PendingReason10Code.IncomeAdjustementRequired, com.tools20022.repository.codeset.PendingReason10Code.PendingLinkedInstruction,
						com.tools20022.repository.codeset.PendingReason10Code.AwaitingSettlementDate, com.tools20022.repository.codeset.PendingReason10Code.LackOfSecurities,
						com.tools20022.repository.codeset.PendingReason10Code.SecuritiesLoanedOut, com.tools20022.repository.codeset.PendingReason10Code.InsufficientMoney,
						com.tools20022.repository.codeset.PendingReason10Code.ConfirmationNotReceived, com.tools20022.repository.codeset.PendingReason10Code.NotInGoodOrder,
						com.tools20022.repository.codeset.PendingReason10Code.LackOfStampDutyInformation, com.tools20022.repository.codeset.PendingReason10Code.ProcessingBatchDifference,
						com.tools20022.repository.codeset.PendingReason10Code.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.PendingReason10Code.SecuritiesBlocked,
						com.tools20022.repository.codeset.PendingReason10Code.CounterpartyInReceivership, com.tools20022.repository.codeset.PendingReason10Code.MinimumSettlementAmount,
						com.tools20022.repository.codeset.PendingReason10Code.StatusReasonInvestigation, com.tools20022.repository.codeset.PendingReason10Code.Other,
						com.tools20022.repository.codeset.PendingReason10Code.PhysicalSecuritiesVerification, com.tools20022.repository.codeset.PendingReason10Code.BeneficialOwnershipDisagreement,
						com.tools20022.repository.codeset.PendingReason10Code.BothInstructionsOnHold, com.tools20022.repository.codeset.PendingReason10Code.ClearingHouseTrade,
						com.tools20022.repository.codeset.PendingReason10Code.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.PendingReason10Code.NaturalDisaster,
						com.tools20022.repository.codeset.PendingReason10Code.CounterpartyReturnedShares, com.tools20022.repository.codeset.PendingReason10Code.SecuritiesFrozenAtCSD,
						com.tools20022.repository.codeset.PendingReason10Code.AwaitingOtherTransaction, com.tools20022.repository.codeset.PendingReason10Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.PendingReason10Code.InsufficientCentralBankLiquidity, com.tools20022.repository.codeset.PendingReason10Code.CounterpartyInstructionOnHold,
						com.tools20022.repository.codeset.PendingReason10Code.CertificatesRejected, com.tools20022.repository.codeset.PendingReason10Code.SettlementSystemMethodModified,
						com.tools20022.repository.codeset.PendingReason10Code.WrongCertificatesNumbers, com.tools20022.repository.codeset.PendingReason10Code.SystemOnHold,
						com.tools20022.repository.codeset.PendingReason10Code.IncompleteNumberCount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(InstructionRefusedOrNotRecognised.getCodeName().get(), InstructionRefusedOrNotRecognised);
		codesByName.put(AwaitingSecuritiesFromCounterparty.getCodeName().get(), AwaitingSecuritiesFromCounterparty);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(TradeAmendedInMarket.getCodeName().get(), TradeAmendedInMarket);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(EnquirySent.getCodeName().get(), EnquirySent);
		codesByName.put(NewIssues.getCodeName().get(), NewIssues);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(MultipleSettlementAmount.getCodeName().get(), MultipleSettlementAmount);
		codesByName.put(GlobalFormSecurities.getCodeName().get(), GlobalFormSecurities);
		codesByName.put(YourInstructionOnHold.getCodeName().get(), YourInstructionOnHold);
		codesByName.put(TradeSettlesInPartials.getCodeName().get(), TradeSettlesInPartials);
		codesByName.put(NoMatchingRequired.getCodeName().get(), NoMatchingRequired);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
		codesByName.put(CounterpartyInsufficientMoney.getCodeName().get(), CounterpartyInsufficientMoney);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(RefusedDepositForIssueOfDepositaryReceipts.getCodeName().get(), RefusedDepositForIssueOfDepositaryReceipts);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(IncomeAdjustementRequired.getCodeName().get(), IncomeAdjustementRequired);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
		codesByName.put(AwaitingSettlementDate.getCodeName().get(), AwaitingSettlementDate);
		codesByName.put(LackOfSecurities.getCodeName().get(), LackOfSecurities);
		codesByName.put(SecuritiesLoanedOut.getCodeName().get(), SecuritiesLoanedOut);
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(ConfirmationNotReceived.getCodeName().get(), ConfirmationNotReceived);
		codesByName.put(NotInGoodOrder.getCodeName().get(), NotInGoodOrder);
		codesByName.put(LackOfStampDutyInformation.getCodeName().get(), LackOfStampDutyInformation);
		codesByName.put(ProcessingBatchDifference.getCodeName().get(), ProcessingBatchDifference);
		codesByName.put(AwaitingNextSettlementCycle.getCodeName().get(), AwaitingNextSettlementCycle);
		codesByName.put(SecuritiesBlocked.getCodeName().get(), SecuritiesBlocked);
		codesByName.put(CounterpartyInReceivership.getCodeName().get(), CounterpartyInReceivership);
		codesByName.put(MinimumSettlementAmount.getCodeName().get(), MinimumSettlementAmount);
		codesByName.put(StatusReasonInvestigation.getCodeName().get(), StatusReasonInvestigation);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PhysicalSecuritiesVerification.getCodeName().get(), PhysicalSecuritiesVerification);
		codesByName.put(BeneficialOwnershipDisagreement.getCodeName().get(), BeneficialOwnershipDisagreement);
		codesByName.put(BothInstructionsOnHold.getCodeName().get(), BothInstructionsOnHold);
		codesByName.put(ClearingHouseTrade.getCodeName().get(), ClearingHouseTrade);
		codesByName.put(UnavailableDeliverableDenominatedQuantity.getCodeName().get(), UnavailableDeliverableDenominatedQuantity);
		codesByName.put(NaturalDisaster.getCodeName().get(), NaturalDisaster);
		codesByName.put(CounterpartyReturnedShares.getCodeName().get(), CounterpartyReturnedShares);
		codesByName.put(SecuritiesFrozenAtCSD.getCodeName().get(), SecuritiesFrozenAtCSD);
		codesByName.put(AwaitingOtherTransaction.getCodeName().get(), AwaitingOtherTransaction);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(InsufficientCentralBankLiquidity.getCodeName().get(), InsufficientCentralBankLiquidity);
		codesByName.put(CounterpartyInstructionOnHold.getCodeName().get(), CounterpartyInstructionOnHold);
		codesByName.put(CertificatesRejected.getCodeName().get(), CertificatesRejected);
		codesByName.put(SettlementSystemMethodModified.getCodeName().get(), SettlementSystemMethodModified);
		codesByName.put(WrongCertificatesNumbers.getCodeName().get(), WrongCertificatesNumbers);
		codesByName.put(SystemOnHold.getCodeName().get(), SystemOnHold);
		codesByName.put(IncompleteNumberCount.getCodeName().get(), IncompleteNumberCount);
	}

	public static PendingReason10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingReason10Code[] values() {
		PendingReason10Code[] values = new PendingReason10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingReason10Code> {
		@Override
		public PendingReason10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingReason10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}