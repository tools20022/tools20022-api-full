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
import com.tools20022.repository.codeset.FailingReason3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingMoney
 * FailingReason3Code.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#BuyInProcedure
 * FailingReason3Code.BuyInProcedure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CounterpartyTooLateForSettlement
 * FailingReason3Code.CounterpartyTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AccountServicerDeadlineMissed
 * FailingReason3Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CancellationConfirmationRequested
 * FailingReason3Code.CancellationConfirmationRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingSecurities
 * FailingReason3Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#UnderObjection
 * FailingReason3Code.UnderObjection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingSecuritiesFromCounterparty
 * FailingReason3Code.AwaitingSecuritiesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#PhysicalDeliveryDelay
 * FailingReason3Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#ConfirmationDiscrepency
 * FailingReason3Code.ConfirmationDiscrepency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingDocumentsOrEndorsementsFromYou
 * FailingReason3Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#MoneySecuritiesTooLateForSettlement
 * FailingReason3Code.MoneySecuritiesTooLateForSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * FailingReason3Code.AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AccountBlocked
 * FailingReason3Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#EnquirySent
 * FailingReason3Code.EnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#NewIssues
 * FailingReason3Code.NewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CounterpartyInsufficientSecurities
 * FailingReason3Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#MultipleSettlementAmount
 * FailingReason3Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#GlobalFormSecurities
 * FailingReason3Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#YourInstructionOnHold
 * FailingReason3Code.YourInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#TradeSettlesInPartials
 * FailingReason3Code.TradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#NoForeignExchangeInstruction
 * FailingReason3Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CounterpartyInsufficientMoney
 * FailingReason3Code.CounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CollateralShortage
 * FailingReason3Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#SecuritiesPledgedAsCollateral
 * FailingReason3Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#RefusedDepositForIssueOfDepositaryReceipts
 * FailingReason3Code.RefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#MaximumForeignLimitReached
 * FailingReason3Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#IncomeAdjustementRequired
 * FailingReason3Code.IncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#PendingLinkedInstruction
 * FailingReason3Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#LackOfSecurities
 * FailingReason3Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#SecuritiesLoanedOut
 * FailingReason3Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#InsufficientMoney
 * FailingReason3Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#ConfirmationNotReceived
 * FailingReason3Code.ConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#NotInGoodOrder
 * FailingReason3Code.NotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#LackOfStampDutyInformation
 * FailingReason3Code.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#ProcessingBatchDifference
 * FailingReason3Code.ProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingNextSettlementCycle
 * FailingReason3Code.AwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#SecuritiesBlocked
 * FailingReason3Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CounterpartyInReceivership
 * FailingReason3Code.CounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#MinimumSettlementAmount
 * FailingReason3Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#StatusReasonInvestigation
 * FailingReason3Code.StatusReasonInvestigation}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.FailingReason3Code#Other
 * FailingReason3Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#PhysicalSecuritiesVerification
 * FailingReason3Code.PhysicalSecuritiesVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#BeneficialOwnershipDisagreement
 * FailingReason3Code.BeneficialOwnershipDisagreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#BothInstructionsOnHold
 * FailingReason3Code.BothInstructionsOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#ClearingHouseTrade
 * FailingReason3Code.ClearingHouseTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#UnavailableDeliverableDenominatedQuantity
 * FailingReason3Code.UnavailableDeliverableDenominatedQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#NaturalDisaster
 * FailingReason3Code.NaturalDisaster}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CounterpartyReturnedShares
 * FailingReason3Code.CounterpartyReturnedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#SecuritiesFrozenAtCSD
 * FailingReason3Code.SecuritiesFrozenAtCSD}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#AwaitingOtherTransaction
 * FailingReason3Code.AwaitingOtherTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#MarketDeadlineMissed
 * FailingReason3Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#InsufficientCentralBankLiquidity
 * FailingReason3Code.InsufficientCentralBankLiquidity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CounterpartyInstructionOnHold
 * FailingReason3Code.CounterpartyInstructionOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#CertificatesRejected
 * FailingReason3Code.CertificatesRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#SettlementSystemMethodModified
 * FailingReason3Code.SettlementSystemMethodModified}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#WrongCertificatesNumbers
 * FailingReason3Code.WrongCertificatesNumbers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#SystemOnHold
 * FailingReason3Code.SystemOnHold}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code#IncompleteNumberCount
 * FailingReason3Code.IncompleteNumberCount}</li>
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
 * "FailingReason3Code"</li>
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
public class FailingReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingMoney = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyInProcedure"</li>
	 * </ul>
	 */
	public static final FailingReason3Code BuyInProcedure = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyInProcedure";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.BuyInProcedure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForSettlement"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CounterpartyTooLateForSettlement = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyTooLateForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AccountServicerDeadlineMissed = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationConfirmationRequested"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CancellationConfirmationRequested = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationConfirmationRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CancellationConfirmationRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingSecurities = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderObjection"</li>
	 * </ul>
	 */
	public static final FailingReason3Code UnderObjection = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderObjection";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.UnderObjection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecuritiesFromCounterparty"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingSecuritiesFromCounterparty = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecuritiesFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingSecuritiesFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * </ul>
	 */
	public static final FailingReason3Code PhysicalDeliveryDelay = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.PhysicalDeliveryDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDiscrepency"</li>
	 * </ul>
	 */
	public static final FailingReason3Code ConfirmationDiscrepency = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDiscrepency";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.ConfirmationDiscrepency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingDocumentsOrEndorsementsFromYou = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoneySecuritiesTooLateForSettlement"</li>
	 * </ul>
	 */
	public static final FailingReason3Code MoneySecuritiesTooLateForSettlement = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoneySecuritiesTooLateForSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.MoneySecuritiesTooLateForSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingDocumentsOrEndorsementsFromCounterparty = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AccountBlocked = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnquirySent"</li>
	 * </ul>
	 */
	public static final FailingReason3Code EnquirySent = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.EnquirySent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssues"</li>
	 * </ul>
	 */
	public static final FailingReason3Code NewIssues = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.NewIssues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CounterpartyInsufficientSecurities = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInsufficientSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * </ul>
	 */
	public static final FailingReason3Code MultipleSettlementAmount = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.MultipleSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason3Code GlobalFormSecurities = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.GlobalFormSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YourInstructionOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason3Code YourInstructionOnHold = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "YourInstructionOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.YourInstructionOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlesInPartials"</li>
	 * </ul>
	 */
	public static final FailingReason3Code TradeSettlesInPartials = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.TradeSettlesInPartials.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * </ul>
	 */
	public static final FailingReason3Code NoForeignExchangeInstruction = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.NoForeignExchangeInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientMoney"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CounterpartyInsufficientMoney = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CollateralShortage = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CollateralShortage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * </ul>
	 */
	public static final FailingReason3Code SecuritiesPledgedAsCollateral = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesPledgedAsCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedDepositForIssueOfDepositaryReceipts"</li>
	 * </ul>
	 */
	public static final FailingReason3Code RefusedDepositForIssueOfDepositaryReceipts = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.RefusedDepositForIssueOfDepositaryReceipts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * </ul>
	 */
	public static final FailingReason3Code MaximumForeignLimitReached = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.MaximumForeignLimitReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeAdjustementRequired"</li>
	 * </ul>
	 */
	public static final FailingReason3Code IncomeAdjustementRequired = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.IncomeAdjustementRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * </ul>
	 */
	public static final FailingReason3Code PendingLinkedInstruction = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.PendingLinkedInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final FailingReason3Code LackOfSecurities = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * </ul>
	 */
	public static final FailingReason3Code SecuritiesLoanedOut = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesLoanedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final FailingReason3Code InsufficientMoney = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationNotReceived"</li>
	 * </ul>
	 */
	public static final FailingReason3Code ConfirmationNotReceived = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.ConfirmationNotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInGoodOrder"</li>
	 * </ul>
	 */
	public static final FailingReason3Code NotInGoodOrder = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.NotInGoodOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * </ul>
	 */
	public static final FailingReason3Code LackOfStampDutyInformation = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.LackOfStampDutyInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchDifference"</li>
	 * </ul>
	 */
	public static final FailingReason3Code ProcessingBatchDifference = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.ProcessingBatchDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingNextSettlementCycle"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingNextSettlementCycle = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingNextSettlementCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * </ul>
	 */
	public static final FailingReason3Code SecuritiesBlocked = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInReceivership"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CounterpartyInReceivership = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInReceivership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * </ul>
	 */
	public static final FailingReason3Code MinimumSettlementAmount = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.MinimumSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusReasonInvestigation"</li>
	 * </ul>
	 */
	public static final FailingReason3Code StatusReasonInvestigation = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusReasonInvestigation";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.StatusReasonInvestigation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final FailingReason3Code Other = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSecuritiesVerification"</li>
	 * </ul>
	 */
	public static final FailingReason3Code PhysicalSecuritiesVerification = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSecuritiesVerification";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.PhysicalSecuritiesVerification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnershipDisagreement"</li>
	 * </ul>
	 */
	public static final FailingReason3Code BeneficialOwnershipDisagreement = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnershipDisagreement";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.BeneficialOwnershipDisagreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BothInstructionsOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason3Code BothInstructionsOnHold = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BothInstructionsOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.BothInstructionsOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingHouseTrade"</li>
	 * </ul>
	 */
	public static final FailingReason3Code ClearingHouseTrade = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingHouseTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.ClearingHouseTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailableDeliverableDenominatedQuantity"</li>
	 * </ul>
	 */
	public static final FailingReason3Code UnavailableDeliverableDenominatedQuantity = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailableDeliverableDenominatedQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.UnavailableDeliverableDenominatedQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NaturalDisaster"</li>
	 * </ul>
	 */
	public static final FailingReason3Code NaturalDisaster = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NaturalDisaster";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.NaturalDisaster.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReturnedShares"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CounterpartyReturnedShares = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReturnedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyReturnedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesFrozenAtCSD"</li>
	 * </ul>
	 */
	public static final FailingReason3Code SecuritiesFrozenAtCSD = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesFrozenAtCSD";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.SecuritiesFrozenAtCSD.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingOtherTransaction"</li>
	 * </ul>
	 */
	public static final FailingReason3Code AwaitingOtherTransaction = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingOtherTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.AwaitingOtherTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final FailingReason3Code MarketDeadlineMissed = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCentralBankLiquidity"</li>
	 * </ul>
	 */
	public static final FailingReason3Code InsufficientCentralBankLiquidity = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCentralBankLiquidity";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.InsufficientCentralBankLiquidity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInstructionOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CounterpartyInstructionOnHold = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInstructionOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CounterpartyInstructionOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificatesRejected"</li>
	 * </ul>
	 */
	public static final FailingReason3Code CertificatesRejected = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificatesRejected";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.CertificatesRejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodModified"</li>
	 * </ul>
	 */
	public static final FailingReason3Code SettlementSystemMethodModified = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodModified";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.SettlementSystemMethodModified.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCertificatesNumbers"</li>
	 * </ul>
	 */
	public static final FailingReason3Code WrongCertificatesNumbers = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCertificatesNumbers";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.WrongCertificatesNumbers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemOnHold"</li>
	 * </ul>
	 */
	public static final FailingReason3Code SystemOnHold = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemOnHold";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.SystemOnHold.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FailingReason3Code
	 * FailingReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncompleteNumberCount"</li>
	 * </ul>
	 */
	public static final FailingReason3Code IncompleteNumberCount = new FailingReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncompleteNumberCount";
			owner_lazy = () -> com.tools20022.repository.codeset.FailingReason3Code.mmObject();
			codeName = PendingFailingReasonCode.IncompleteNumberCount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FailingReason3Code> codesByName = new LinkedHashMap<>();

	protected FailingReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FailingReason3Code";
				definition = "Specifies the reason the transaction/instruction is failing settlement. Settlement on the instructed settlement date is no longer possible.";
				previousVersion_lazy = () -> FailingReason1Code.mmObject();
				trace_lazy = () -> PendingFailingReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FailingReason3Code.AwaitingMoney, com.tools20022.repository.codeset.FailingReason3Code.BuyInProcedure,
						com.tools20022.repository.codeset.FailingReason3Code.CounterpartyTooLateForSettlement, com.tools20022.repository.codeset.FailingReason3Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.FailingReason3Code.CancellationConfirmationRequested, com.tools20022.repository.codeset.FailingReason3Code.AwaitingSecurities,
						com.tools20022.repository.codeset.FailingReason3Code.UnderObjection, com.tools20022.repository.codeset.FailingReason3Code.AwaitingSecuritiesFromCounterparty,
						com.tools20022.repository.codeset.FailingReason3Code.PhysicalDeliveryDelay, com.tools20022.repository.codeset.FailingReason3Code.ConfirmationDiscrepency,
						com.tools20022.repository.codeset.FailingReason3Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.FailingReason3Code.MoneySecuritiesTooLateForSettlement,
						com.tools20022.repository.codeset.FailingReason3Code.AwaitingDocumentsOrEndorsementsFromCounterparty, com.tools20022.repository.codeset.FailingReason3Code.AccountBlocked,
						com.tools20022.repository.codeset.FailingReason3Code.EnquirySent, com.tools20022.repository.codeset.FailingReason3Code.NewIssues,
						com.tools20022.repository.codeset.FailingReason3Code.CounterpartyInsufficientSecurities, com.tools20022.repository.codeset.FailingReason3Code.MultipleSettlementAmount,
						com.tools20022.repository.codeset.FailingReason3Code.GlobalFormSecurities, com.tools20022.repository.codeset.FailingReason3Code.YourInstructionOnHold,
						com.tools20022.repository.codeset.FailingReason3Code.TradeSettlesInPartials, com.tools20022.repository.codeset.FailingReason3Code.NoForeignExchangeInstruction,
						com.tools20022.repository.codeset.FailingReason3Code.CounterpartyInsufficientMoney, com.tools20022.repository.codeset.FailingReason3Code.CollateralShortage,
						com.tools20022.repository.codeset.FailingReason3Code.SecuritiesPledgedAsCollateral, com.tools20022.repository.codeset.FailingReason3Code.RefusedDepositForIssueOfDepositaryReceipts,
						com.tools20022.repository.codeset.FailingReason3Code.MaximumForeignLimitReached, com.tools20022.repository.codeset.FailingReason3Code.IncomeAdjustementRequired,
						com.tools20022.repository.codeset.FailingReason3Code.PendingLinkedInstruction, com.tools20022.repository.codeset.FailingReason3Code.LackOfSecurities,
						com.tools20022.repository.codeset.FailingReason3Code.SecuritiesLoanedOut, com.tools20022.repository.codeset.FailingReason3Code.InsufficientMoney,
						com.tools20022.repository.codeset.FailingReason3Code.ConfirmationNotReceived, com.tools20022.repository.codeset.FailingReason3Code.NotInGoodOrder,
						com.tools20022.repository.codeset.FailingReason3Code.LackOfStampDutyInformation, com.tools20022.repository.codeset.FailingReason3Code.ProcessingBatchDifference,
						com.tools20022.repository.codeset.FailingReason3Code.AwaitingNextSettlementCycle, com.tools20022.repository.codeset.FailingReason3Code.SecuritiesBlocked,
						com.tools20022.repository.codeset.FailingReason3Code.CounterpartyInReceivership, com.tools20022.repository.codeset.FailingReason3Code.MinimumSettlementAmount,
						com.tools20022.repository.codeset.FailingReason3Code.StatusReasonInvestigation, com.tools20022.repository.codeset.FailingReason3Code.Other,
						com.tools20022.repository.codeset.FailingReason3Code.PhysicalSecuritiesVerification, com.tools20022.repository.codeset.FailingReason3Code.BeneficialOwnershipDisagreement,
						com.tools20022.repository.codeset.FailingReason3Code.BothInstructionsOnHold, com.tools20022.repository.codeset.FailingReason3Code.ClearingHouseTrade,
						com.tools20022.repository.codeset.FailingReason3Code.UnavailableDeliverableDenominatedQuantity, com.tools20022.repository.codeset.FailingReason3Code.NaturalDisaster,
						com.tools20022.repository.codeset.FailingReason3Code.CounterpartyReturnedShares, com.tools20022.repository.codeset.FailingReason3Code.SecuritiesFrozenAtCSD,
						com.tools20022.repository.codeset.FailingReason3Code.AwaitingOtherTransaction, com.tools20022.repository.codeset.FailingReason3Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.FailingReason3Code.InsufficientCentralBankLiquidity, com.tools20022.repository.codeset.FailingReason3Code.CounterpartyInstructionOnHold,
						com.tools20022.repository.codeset.FailingReason3Code.CertificatesRejected, com.tools20022.repository.codeset.FailingReason3Code.SettlementSystemMethodModified,
						com.tools20022.repository.codeset.FailingReason3Code.WrongCertificatesNumbers, com.tools20022.repository.codeset.FailingReason3Code.SystemOnHold,
						com.tools20022.repository.codeset.FailingReason3Code.IncompleteNumberCount);
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
		codesByName.put(IncompleteNumberCount.getCodeName().get(), IncompleteNumberCount);
	}

	public static FailingReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FailingReason3Code[] values() {
		FailingReason3Code[] values = new FailingReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FailingReason3Code> {
		@Override
		public FailingReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FailingReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}