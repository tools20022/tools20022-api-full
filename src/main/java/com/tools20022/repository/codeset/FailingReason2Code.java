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
import com.tools20022.repository.codeset.FailingReason2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is failing settlement.
 * Settlement on the instructed settlement date is no longer possible.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingMoney
 * FailingReason2Code.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#BuyInProcedure
 * FailingReason2Code.BuyInProcedure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CounterpartyTooLateForSettlement
 * FailingReason2Code.CounterpartyTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AccountServicerDeadlineMissed
 * FailingReason2Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CancellationConfirmationRequested
 * FailingReason2Code.CancellationConfirmationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingSecurities
 * FailingReason2Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#UnderObjection
 * FailingReason2Code.UnderObjection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingSecuritiesFromCounterparty
 * FailingReason2Code.AwaitingSecuritiesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#PhysicalDeliveryDelay
 * FailingReason2Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#ConfirmationDiscrepency
 * FailingReason2Code.ConfirmationDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingDocumentsOrEndorsementsFromYou
 * FailingReason2Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#MoneySecuritiesTooLateForSettlement
 * FailingReason2Code.MoneySecuritiesTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * FailingReason2Code.AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AccountBlocked
 * FailingReason2Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#EnquirySent
 * FailingReason2Code.EnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#NewIssues
 * FailingReason2Code.NewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CounterpartyInsufficientSecurities
 * FailingReason2Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#MultipleSettlementAmount
 * FailingReason2Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#GlobalFormSecurities
 * FailingReason2Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#YourInstructionOnHold
 * FailingReason2Code.YourInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#TradeSettlesInPartials
 * FailingReason2Code.TradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#NoForeignExchangeInstruction
 * FailingReason2Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CounterpartyInsufficientMoney
 * FailingReason2Code.CounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CollateralShortage
 * FailingReason2Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#SecuritiesPledgedAsCollateral
 * FailingReason2Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#RefusedDepositForIssueOfDepositaryReceipts
 * FailingReason2Code.RefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#MaximumForeignLimitReached
 * FailingReason2Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#IncomeAdjustementRequired
 * FailingReason2Code.IncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#PendingLinkedInstruction
 * FailingReason2Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#LackOfSecurities
 * FailingReason2Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#SecuritiesLoanedOut
 * FailingReason2Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#InsufficientMoney
 * FailingReason2Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#ConfirmationNotReceived
 * FailingReason2Code.ConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#NotInGoodOrder
 * FailingReason2Code.NotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#LackOfStampDutyInformation
 * FailingReason2Code.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#ProcessingBatchDifference
 * FailingReason2Code.ProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingNextSettlementCycle
 * FailingReason2Code.AwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#SecuritiesBlocked
 * FailingReason2Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CounterpartyInReceivership
 * FailingReason2Code.CounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#MinimumSettlementAmount
 * FailingReason2Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#StatusReasonInvestigation
 * FailingReason2Code.StatusReasonInvestigation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailingReason2Code#Other
 * FailingReason2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#PhysicalSecuritiesVerification
 * FailingReason2Code.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#BeneficialOwnershipDisagreement
 * FailingReason2Code.BeneficialOwnershipDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#BothInstructionsOnHold
 * FailingReason2Code.BothInstructionsOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#ClearingHouseTrade
 * FailingReason2Code.ClearingHouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#UnavailableDeliverableDenominatedQuantity
 * FailingReason2Code.UnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#NaturalDisaster
 * FailingReason2Code.NaturalDisaster}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CounterpartyReturnedShares
 * FailingReason2Code.CounterpartyReturnedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#SecuritiesFrozenAtCSD
 * FailingReason2Code.SecuritiesFrozenAtCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#AwaitingOtherTransaction
 * FailingReason2Code.AwaitingOtherTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#MarketDeadlineMissed
 * FailingReason2Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#InsufficientCentralBankLiquidity
 * FailingReason2Code.InsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CounterpartyInstructionOnHold
 * FailingReason2Code.CounterpartyInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CertificatesRejected
 * FailingReason2Code.CertificatesRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#SettlementSystemMethodModified
 * FailingReason2Code.SettlementSystemMethodModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#WrongCertificatesNumbers
 * FailingReason2Code.WrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#SystemOnHold
 * FailingReason2Code.SystemOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#ConditionalDeliveryAwaitingRelease
 * FailingReason2Code.ConditionalDeliveryAwaitingRelease}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailingReason2Code#CSDHold
 * FailingReason2Code.CSDHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#CSDValidation
 * FailingReason2Code.CSDValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code#IncompleteNumberCount
 * FailingReason2Code.IncompleteNumberCount}</li>
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
 * "FailingReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.FailingReason1Code
 * FailingReason1Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FailingReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingMoney = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInProcedure"</li>
	 * </ul>
	 */
	public static final FailingReason2Code BuyInProcedure = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInProcedure";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.BuyInProcedure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForSettlement"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CounterpartyTooLateForSettlement = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyTooLateForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AccountServicerDeadlineMissed = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationConfirmationRequested"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CancellationConfirmationRequested = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationConfirmationRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CancellationConfirmationRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingSecurities = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderObjection"</li>
	 * </ul>
	 */
	public static final FailingReason2Code UnderObjection = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderObjection";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.UnderObjection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecuritiesFromCounterparty"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingSecuritiesFromCounterparty = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecuritiesFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * </ul>
	 */
	public static final FailingReason2Code PhysicalDeliveryDelay = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.PhysicalDeliveryDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDiscrepency"</li>
	 * </ul>
	 */
	public static final FailingReason2Code ConfirmationDiscrepency = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDiscrepency";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ConfirmationDiscrepency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingDocumentsOrEndorsementsFromYou = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneySecuritiesTooLateForSettlement"</li>
	 * </ul>
	 */
	public static final FailingReason2Code MoneySecuritiesTooLateForSettlement = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneySecuritiesTooLateForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MoneySecuritiesTooLateForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingDocumentsOrEndorsementsFromCounterparty = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AccountBlocked = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnquirySent"</li>
	 * </ul>
	 */
	public static final FailingReason2Code EnquirySent = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.EnquirySent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssues"</li>
	 * </ul>
	 */
	public static final FailingReason2Code NewIssues = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.NewIssues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CounterpartyInsufficientSecurities = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInsufficientSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * </ul>
	 */
	public static final FailingReason2Code MultipleSettlementAmount = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MultipleSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason2Code GlobalFormSecurities = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.GlobalFormSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YourInstructionOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason2Code YourInstructionOnHold = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YourInstructionOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.YourInstructionOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlesInPartials"</li>
	 * </ul>
	 */
	public static final FailingReason2Code TradeSettlesInPartials = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.TradeSettlesInPartials.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * </ul>
	 */
	public static final FailingReason2Code NoForeignExchangeInstruction = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.NoForeignExchangeInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientMoney"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CounterpartyInsufficientMoney = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CollateralShortage = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CollateralShortage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * </ul>
	 */
	public static final FailingReason2Code SecuritiesPledgedAsCollateral = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesPledgedAsCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedDepositForIssueOfDepositaryReceipts"</li>
	 * </ul>
	 */
	public static final FailingReason2Code RefusedDepositForIssueOfDepositaryReceipts = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.RefusedDepositForIssueOfDepositaryReceipts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * </ul>
	 */
	public static final FailingReason2Code MaximumForeignLimitReached = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MaximumForeignLimitReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeAdjustementRequired"</li>
	 * </ul>
	 */
	public static final FailingReason2Code IncomeAdjustementRequired = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.IncomeAdjustementRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * </ul>
	 */
	public static final FailingReason2Code PendingLinkedInstruction = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.PendingLinkedInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason2Code LackOfSecurities = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * </ul>
	 */
	public static final FailingReason2Code SecuritiesLoanedOut = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesLoanedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final FailingReason2Code InsufficientMoney = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationNotReceived"</li>
	 * </ul>
	 */
	public static final FailingReason2Code ConfirmationNotReceived = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ConfirmationNotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInGoodOrder"</li>
	 * </ul>
	 */
	public static final FailingReason2Code NotInGoodOrder = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.NotInGoodOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * </ul>
	 */
	public static final FailingReason2Code LackOfStampDutyInformation = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfStampDutyInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchDifference"</li>
	 * </ul>
	 */
	public static final FailingReason2Code ProcessingBatchDifference = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ProcessingBatchDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingNextSettlementCycle"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingNextSettlementCycle = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingNextSettlementCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * </ul>
	 */
	public static final FailingReason2Code SecuritiesBlocked = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInReceivership"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CounterpartyInReceivership = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInReceivership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * </ul>
	 */
	public static final FailingReason2Code MinimumSettlementAmount = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MinimumSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * </ul>
	 */
	public static final FailingReason2Code StatusReasonInvestigation = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.StatusReasonInvestigation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final FailingReason2Code Other = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * </ul>
	 */
	public static final FailingReason2Code PhysicalSecuritiesVerification = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.PhysicalSecuritiesVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipDisagreement"</li>
	 * </ul>
	 */
	public static final FailingReason2Code BeneficialOwnershipDisagreement = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.BeneficialOwnershipDisagreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BothInstructionsOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason2Code BothInstructionsOnHold = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothInstructionsOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.BothInstructionsOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingHouseTrade"</li>
	 * </ul>
	 */
	public static final FailingReason2Code ClearingHouseTrade = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ClearingHouseTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableDeliverableDenominatedQuantity"</li>
	 * </ul>
	 */
	public static final FailingReason2Code UnavailableDeliverableDenominatedQuantity = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.UnavailableDeliverableDenominatedQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalDisaster"</li>
	 * </ul>
	 */
	public static final FailingReason2Code NaturalDisaster = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalDisaster";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.NaturalDisaster.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReturnedShares"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CounterpartyReturnedShares = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReturnedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyReturnedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFrozenAtCSD"</li>
	 * </ul>
	 */
	public static final FailingReason2Code SecuritiesFrozenAtCSD = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFrozenAtCSD";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesFrozenAtCSD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingOtherTransaction"</li>
	 * </ul>
	 */
	public static final FailingReason2Code AwaitingOtherTransaction = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingOtherTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingOtherTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final FailingReason2Code MarketDeadlineMissed = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCentralBankLiquidity"</li>
	 * </ul>
	 */
	public static final FailingReason2Code InsufficientCentralBankLiquidity = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientCentralBankLiquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInstructionOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CounterpartyInstructionOnHold = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInstructionOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInstructionOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesRejected"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CertificatesRejected = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CertificatesRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodModified"</li>
	 * </ul>
	 */
	public static final FailingReason2Code SettlementSystemMethodModified = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodModified";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SettlementSystemMethodModified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * </ul>
	 */
	public static final FailingReason2Code WrongCertificatesNumbers = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason2Code SystemOnHold = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.SystemOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalDeliveryAwaitingRelease"</li>
	 * </ul>
	 */
	public static final FailingReason2Code ConditionalDeliveryAwaitingRelease = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalDeliveryAwaitingRelease";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.ConditionalDeliveryAwaitingRelease.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDHold"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CSDHold = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CSDHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CSDValidation"</li>
	 * </ul>
	 */
	public static final FailingReason2Code CSDValidation = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CSDValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.CSDValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason2Code
	 * FailingReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteNumberCount"</li>
	 * </ul>
	 */
	public static final FailingReason2Code IncompleteNumberCount = new FailingReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason2Code.mmObject();
			codeName = PendingFailingReasonCode.IncompleteNumberCount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FailingReason2Code> codesByName = new LinkedHashMap<>();

	protected FailingReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailingReason2Code";
				definition = "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible.";
				previousVersion_lazy = () -> FailingReason1Code.mmObject();
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailingReason2Code.AwaitingMoney, com.tools20022.repository.codeset.FailingReason2Code.BuyInProcedure,
						com.tools20022.repository.codeset.FailingReason2Code.CounterpartyTooLateForSettlement, com.tools20022.repository.codeset.FailingReason2Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.FailingReason2Code.CancellationConfirmationRequested, com.tools20022.repository.codeset.FailingReason2Code.AwaitingSecurities,
						com.tools20022.repository.codeset.FailingReason2Code.UnderObjection, com.tools20022.repository.codeset.FailingReason2Code.AwaitingSecuritiesFromCounterparty,
						com.tools20022.repository.codeset.FailingReason2Code.PhysicalDeliveryDelay, com.tools20022.repository.codeset.FailingReason2Code.ConfirmationDiscrepency,
						com.tools20022.repository.codeset.FailingReason2Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.FailingReason2Code.MoneySecuritiesTooLateForSettlement,
						com.tools20022.repository.codeset.FailingReason2Code.AwaitingDocumentsOrEndorsementsFromCounterparty, com.tools20022.repository.codeset.FailingReason2Code.AccountBlocked,
						com.tools20022.repository.codeset.FailingReason2Code.EnquirySent, com.tools20022.repository.codeset.FailingReason2Code.NewIssues,
						com.tools20022.repository.codeset.FailingReason2Code.CounterpartyInsufficientSecurities, com.tools20022.repository.codeset.FailingReason2Code.MultipleSettlementAmount,
						com.tools20022.repository.codeset.FailingReason2Code.GlobalFormSecurities, com.tools20022.repository.codeset.FailingReason2Code.YourInstructionOnHold,
						com.tools20022.repository.codeset.FailingReason2Code.TradeSettlesInPartials, com.tools20022.repository.codeset.FailingReason2Code.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.FailingReason2Code.CounterpartyInsufficientMoney, com.tools20022.repository.codeset.FailingReason2Code.CollateralShortage,
						com.tools20022.repository.codeset.FailingReason2Code.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.FailingReason2Code.RefusedDepositForIssueOfDepositaryReceipts,
						com.tools20022.repository.codeset.FailingReason2Code.MaximumForeignLimitReached, com.tools20022.repository.codeset.FailingReason2Code.IncomeAdjustementRequired,
						com.tools20022.repository.codeset.FailingReason2Code.PendingLinkedInstruction, com.tools20022.repository.codeset.FailingReason2Code.LackOfSecurities,
						com.tools20022.repository.codeset.FailingReason2Code.SecuritiesLoanedOut, com.tools20022.repository.codeset.FailingReason2Code.InsufficientMoney,
						com.tools20022.repository.codeset.FailingReason2Code.ConfirmationNotReceived, com.tools20022.repository.codeset.FailingReason2Code.NotInGoodOrder,
						com.tools20022.repository.codeset.FailingReason2Code.LackOfStampDutyInformation, com.tools20022.repository.codeset.FailingReason2Code.ProcessingBatchDifference,
						com.tools20022.repository.codeset.FailingReason2Code.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.FailingReason2Code.SecuritiesBlocked,
						com.tools20022.repository.codeset.FailingReason2Code.CounterpartyInReceivership, com.tools20022.repository.codeset.FailingReason2Code.MinimumSettlementAmount,
						com.tools20022.repository.codeset.FailingReason2Code.StatusReasonInvestigation, com.tools20022.repository.codeset.FailingReason2Code.Other,
						com.tools20022.repository.codeset.FailingReason2Code.PhysicalSecuritiesVerification, com.tools20022.repository.codeset.FailingReason2Code.BeneficialOwnershipDisagreement,
						com.tools20022.repository.codeset.FailingReason2Code.BothInstructionsOnHold, com.tools20022.repository.codeset.FailingReason2Code.ClearingHouseTrade,
						com.tools20022.repository.codeset.FailingReason2Code.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.FailingReason2Code.NaturalDisaster,
						com.tools20022.repository.codeset.FailingReason2Code.CounterpartyReturnedShares, com.tools20022.repository.codeset.FailingReason2Code.SecuritiesFrozenAtCSD,
						com.tools20022.repository.codeset.FailingReason2Code.AwaitingOtherTransaction, com.tools20022.repository.codeset.FailingReason2Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.FailingReason2Code.InsufficientCentralBankLiquidity, com.tools20022.repository.codeset.FailingReason2Code.CounterpartyInstructionOnHold,
						com.tools20022.repository.codeset.FailingReason2Code.CertificatesRejected, com.tools20022.repository.codeset.FailingReason2Code.SettlementSystemMethodModified,
						com.tools20022.repository.codeset.FailingReason2Code.WrongCertificatesNumbers, com.tools20022.repository.codeset.FailingReason2Code.SystemOnHold,
						com.tools20022.repository.codeset.FailingReason2Code.ConditionalDeliveryAwaitingRelease, com.tools20022.repository.codeset.FailingReason2Code.CSDHold,
						com.tools20022.repository.codeset.FailingReason2Code.CSDValidation, com.tools20022.repository.codeset.FailingReason2Code.IncompleteNumberCount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(BuyInProcedure.getCodeName().get(), BuyInProcedure);
		codesByName.put(CounterpartyTooLateForSettlement.getCodeName().get(), CounterpartyTooLateForSettlement);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(CancellationConfirmationRequested.getCodeName().get(), CancellationConfirmationRequested);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(UnderObjection.getCodeName().get(), UnderObjection);
		codesByName.put(AwaitingSecuritiesFromCounterparty.getCodeName().get(), AwaitingSecuritiesFromCounterparty);
		codesByName.put(PhysicalDeliveryDelay.getCodeName().get(), PhysicalDeliveryDelay);
		codesByName.put(ConfirmationDiscrepency.getCodeName().get(), ConfirmationDiscrepency);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromYou.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromYou);
		codesByName.put(MoneySecuritiesTooLateForSettlement.getCodeName().get(), MoneySecuritiesTooLateForSettlement);
		codesByName.put(AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().get(), AwaitingDocumentsOrEndorsementsFromCounterparty);
		codesByName.put(AccountBlocked.getCodeName().get(), AccountBlocked);
		codesByName.put(EnquirySent.getCodeName().get(), EnquirySent);
		codesByName.put(NewIssues.getCodeName().get(), NewIssues);
		codesByName.put(CounterpartyInsufficientSecurities.getCodeName().get(), CounterpartyInsufficientSecurities);
		codesByName.put(MultipleSettlementAmount.getCodeName().get(), MultipleSettlementAmount);
		codesByName.put(GlobalFormSecurities.getCodeName().get(), GlobalFormSecurities);
		codesByName.put(YourInstructionOnHold.getCodeName().get(), YourInstructionOnHold);
		codesByName.put(TradeSettlesInPartials.getCodeName().get(), TradeSettlesInPartials);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
		codesByName.put(CounterpartyInsufficientMoney.getCodeName().get(), CounterpartyInsufficientMoney);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(RefusedDepositForIssueOfDepositaryReceipts.getCodeName().get(), RefusedDepositForIssueOfDepositaryReceipts);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(IncomeAdjustementRequired.getCodeName().get(), IncomeAdjustementRequired);
		codesByName.put(PendingLinkedInstruction.getCodeName().get(), PendingLinkedInstruction);
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
		codesByName.put(ConditionalDeliveryAwaitingRelease.getCodeName().get(), ConditionalDeliveryAwaitingRelease);
		codesByName.put(CSDHold.getCodeName().get(), CSDHold);
		codesByName.put(CSDValidation.getCodeName().get(), CSDValidation);
		codesByName.put(IncompleteNumberCount.getCodeName().get(), IncompleteNumberCount);
	}

	public static FailingReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FailingReason2Code[] values() {
		FailingReason2Code[] values = new FailingReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FailingReason2Code> {
		@Override
		public FailingReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FailingReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}