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
import com.tools20022.repository.codeset.PendingSettlement2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction/instruction is pending settlement, ie,
 * pending delivery or receipt of the financial instrument. Settlement on the
 * instructed settlement date is still possible.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingMoney
 * PendingSettlement2Code.AwaitingMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingSecurities
 * PendingSettlement2Code.AwaitingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#InstructionRefusedOrNotRecognised
 * PendingSettlement2Code.InstructionRefusedOrNotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingSharesFromCounterparty
 * PendingSettlement2Code.AwaitingSharesFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#PhysicalDeliveryDelay
 * PendingSettlement2Code.PhysicalDeliveryDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#TradeAmendedInMarket
 * PendingSettlement2Code.TradeAmendedInMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingDocumentsOrEndorsementsFromYou
 * PendingSettlement2Code.AwaitingDocumentsOrEndorsementsFromYou}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingDocumentsOrEndorsementsFromCounterparty
 * PendingSettlement2Code.AwaitingDocumentsOrEndorsementsFromCounterparty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AccountBlocked
 * PendingSettlement2Code.AccountBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#EnquirySent
 * PendingSettlement2Code.EnquirySent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#NewIssues
 * PendingSettlement2Code.NewIssues}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#CounterpartyInsufficientSecurities
 * PendingSettlement2Code.CounterpartyInsufficientSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#MultipleSettlementAmount
 * PendingSettlement2Code.MultipleSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#GlobalFormSecurities
 * PendingSettlement2Code.GlobalFormSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#PreadviceInstructed
 * PendingSettlement2Code.PreadviceInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#GuaranteedDeliveryIndicatorDifference
 * PendingSettlement2Code.GuaranteedDeliveryIndicatorDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#TradeSettlesInPartials
 * PendingSettlement2Code.TradeSettlesInPartials}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#NoMatchingRequired
 * PendingSettlement2Code.NoMatchingRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#CounterpartyInsufficientMoney
 * PendingSettlement2Code.CounterpartyInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#CollateralShortage
 * PendingSettlement2Code.CollateralShortage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#SecuritiesPledgedAsCollateral
 * PendingSettlement2Code.SecuritiesPledgedAsCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#RefusedDepositForIssueOfDepositaryReceipts
 * PendingSettlement2Code.RefusedDepositForIssueOfDepositaryReceipts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#MaximumForeignLimitReached
 * PendingSettlement2Code.MaximumForeignLimitReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#NoForeignExchangeInstruction
 * PendingSettlement2Code.NoForeignExchangeInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#IncomeAdjustementRequired
 * PendingSettlement2Code.IncomeAdjustementRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#PendingLinkedInstruction
 * PendingSettlement2Code.PendingLinkedInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingSettlementDate
 * PendingSettlement2Code.AwaitingSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#LackOfSecurities
 * PendingSettlement2Code.LackOfSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#SecuritiesLoanedOut
 * PendingSettlement2Code.SecuritiesLoanedOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#InsufficientMoney
 * PendingSettlement2Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#ConfirmationNotReceived
 * PendingSettlement2Code.ConfirmationNotReceived}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#NotInGoodOrder
 * PendingSettlement2Code.NotInGoodOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#LackOfStampDutyInformation
 * PendingSettlement2Code.LackOfStampDutyInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#ProcessingBatchDifference
 * PendingSettlement2Code.ProcessingBatchDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#AwaitingNextSettlementCycle
 * PendingSettlement2Code.AwaitingNextSettlementCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#SecuritiesBlocked
 * PendingSettlement2Code.SecuritiesBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#CounterpartyInReceivership
 * PendingSettlement2Code.CounterpartyInReceivership}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#MinimumSettlementAmount
 * PendingSettlement2Code.MinimumSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code#PendingCAP
 * PendingSettlement2Code.PendingCAP}</li>
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
 * <li>"AWMO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingSettlement2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction/instruction is pending settlement, ie, pending delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingSettlement2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingMoney"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingMoney = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingSecurities = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionRefusedOrNotRecognised"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code InstructionRefusedOrNotRecognised = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionRefusedOrNotRecognised";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.InstructionRefusedOrNotRecognised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSharesFromCounterparty"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingSharesFromCounterparty = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSharesFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSharesFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDelay"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code PhysicalDeliveryDelay = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PhysicalDeliveryDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeAmendedInMarket"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code TradeAmendedInMarket = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeAmendedInMarket";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.TradeAmendedInMarket.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromYou"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingDocumentsOrEndorsementsFromYou = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromYou";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromYou.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingDocumentsOrEndorsementsFromCounterparty"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingDocumentsOrEndorsementsFromCounterparty = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingDocumentsOrEndorsementsFromCounterparty";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingDocumentsOrEndorsementsFromCounterparty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountBlocked"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AccountBlocked = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AccountBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EnquirySent"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code EnquirySent = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EnquirySent";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.EnquirySent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewIssues"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code NewIssues = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewIssues";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.NewIssues.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code CounterpartyInsufficientSecurities = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.CounterpartyInsufficientSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code MultipleSettlementAmount = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.MultipleSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalFormSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code GlobalFormSecurities = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalFormSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.GlobalFormSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreadviceInstructed"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code PreadviceInstructed = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreadviceInstructed";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PreadviceInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GuaranteedDeliveryIndicatorDifference"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code GuaranteedDeliveryIndicatorDifference = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GuaranteedDeliveryIndicatorDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.GuaranteedDeliveryIndicatorDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeSettlesInPartials"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code TradeSettlesInPartials = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeSettlesInPartials";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.TradeSettlesInPartials.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingRequired"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code NoMatchingRequired = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.NoMatchingRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInsufficientMoney"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code CounterpartyInsufficientMoney = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.CounterpartyInsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralShortage"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code CollateralShortage = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralShortage";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.CollateralShortage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesPledgedAsCollateral"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code SecuritiesPledgedAsCollateral = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesPledgedAsCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.SecuritiesPledgedAsCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedDepositForIssueOfDepositaryReceipts"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code RefusedDepositForIssueOfDepositaryReceipts = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedDepositForIssueOfDepositaryReceipts";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.RefusedDepositForIssueOfDepositaryReceipts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumForeignLimitReached"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code MaximumForeignLimitReached = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumForeignLimitReached";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.MaximumForeignLimitReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoForeignExchangeInstruction"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code NoForeignExchangeInstruction = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoForeignExchangeInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.NoForeignExchangeInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomeAdjustementRequired"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code IncomeAdjustementRequired = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomeAdjustementRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.IncomeAdjustementRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingLinkedInstruction"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code PendingLinkedInstruction = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingLinkedInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PendingLinkedInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingSettlementDate"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingSettlementDate = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingSettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingSettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfSecurities"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code LackOfSecurities = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.LackOfSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLoanedOut"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code SecuritiesLoanedOut = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLoanedOut";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.SecuritiesLoanedOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code InsufficientMoney = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.InsufficientMoney.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationNotReceived"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code ConfirmationNotReceived = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationNotReceived";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.ConfirmationNotReceived.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotInGoodOrder"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code NotInGoodOrder = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotInGoodOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.NotInGoodOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDutyInformation"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code LackOfStampDutyInformation = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDutyInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.LackOfStampDutyInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchDifference"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code ProcessingBatchDifference = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.ProcessingBatchDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AwaitingNextSettlementCycle"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code AwaitingNextSettlementCycle = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AwaitingNextSettlementCycle";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.AwaitingNextSettlementCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBlocked"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code SecuritiesBlocked = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBlocked";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.SecuritiesBlocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyInReceivership"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code CounterpartyInReceivership = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyInReceivership";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.CounterpartyInReceivership.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementAmount"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code MinimumSettlementAmount = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.MinimumSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingSettlement2Code
	 * PendingSettlement2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCAP"</li>
	 * </ul>
	 */
	public static final PendingSettlement2Code PendingCAP = new PendingSettlement2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCAP";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingSettlement2Code.mmObject();
			codeName = PendingSettlementStatusReasonCode.PendingCAP.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingSettlement2Code> codesByName = new LinkedHashMap<>();

	protected PendingSettlement2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AWMO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingSettlement2Code";
				definition = "Specifies the reason the transaction/instruction is pending settlement, ie, pending delivery or receipt of the financial instrument. Settlement on the instructed settlement date is still possible.";
				trace_lazy = () -> PendingSettlementStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingMoney, com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingSecurities,
						com.tools20022.repository.codeset.PendingSettlement2Code.InstructionRefusedOrNotRecognised, com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingSharesFromCounterparty,
						com.tools20022.repository.codeset.PendingSettlement2Code.PhysicalDeliveryDelay, com.tools20022.repository.codeset.PendingSettlement2Code.TradeAmendedInMarket,
						com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingDocumentsOrEndorsementsFromYou, com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingDocumentsOrEndorsementsFromCounterparty,
						com.tools20022.repository.codeset.PendingSettlement2Code.AccountBlocked, com.tools20022.repository.codeset.PendingSettlement2Code.EnquirySent, com.tools20022.repository.codeset.PendingSettlement2Code.NewIssues,
						com.tools20022.repository.codeset.PendingSettlement2Code.CounterpartyInsufficientSecurities, com.tools20022.repository.codeset.PendingSettlement2Code.MultipleSettlementAmount,
						com.tools20022.repository.codeset.PendingSettlement2Code.GlobalFormSecurities, com.tools20022.repository.codeset.PendingSettlement2Code.PreadviceInstructed,
						com.tools20022.repository.codeset.PendingSettlement2Code.GuaranteedDeliveryIndicatorDifference, com.tools20022.repository.codeset.PendingSettlement2Code.TradeSettlesInPartials,
						com.tools20022.repository.codeset.PendingSettlement2Code.NoMatchingRequired, com.tools20022.repository.codeset.PendingSettlement2Code.CounterpartyInsufficientMoney,
						com.tools20022.repository.codeset.PendingSettlement2Code.CollateralShortage, com.tools20022.repository.codeset.PendingSettlement2Code.SecuritiesPledgedAsCollateral,
						com.tools20022.repository.codeset.PendingSettlement2Code.RefusedDepositForIssueOfDepositaryReceipts, com.tools20022.repository.codeset.PendingSettlement2Code.MaximumForeignLimitReached,
						com.tools20022.repository.codeset.PendingSettlement2Code.NoForeignExchangeInstruction, com.tools20022.repository.codeset.PendingSettlement2Code.IncomeAdjustementRequired,
						com.tools20022.repository.codeset.PendingSettlement2Code.PendingLinkedInstruction, com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingSettlementDate,
						com.tools20022.repository.codeset.PendingSettlement2Code.LackOfSecurities, com.tools20022.repository.codeset.PendingSettlement2Code.SecuritiesLoanedOut,
						com.tools20022.repository.codeset.PendingSettlement2Code.InsufficientMoney, com.tools20022.repository.codeset.PendingSettlement2Code.ConfirmationNotReceived,
						com.tools20022.repository.codeset.PendingSettlement2Code.NotInGoodOrder, com.tools20022.repository.codeset.PendingSettlement2Code.LackOfStampDutyInformation,
						com.tools20022.repository.codeset.PendingSettlement2Code.ProcessingBatchDifference, com.tools20022.repository.codeset.PendingSettlement2Code.AwaitingNextSettlementCycle,
						com.tools20022.repository.codeset.PendingSettlement2Code.SecuritiesBlocked, com.tools20022.repository.codeset.PendingSettlement2Code.CounterpartyInReceivership,
						com.tools20022.repository.codeset.PendingSettlement2Code.MinimumSettlementAmount, com.tools20022.repository.codeset.PendingSettlement2Code.PendingCAP);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AwaitingMoney.getCodeName().get(), AwaitingMoney);
		codesByName.put(AwaitingSecurities.getCodeName().get(), AwaitingSecurities);
		codesByName.put(InstructionRefusedOrNotRecognised.getCodeName().get(), InstructionRefusedOrNotRecognised);
		codesByName.put(AwaitingSharesFromCounterparty.getCodeName().get(), AwaitingSharesFromCounterparty);
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
		codesByName.put(PreadviceInstructed.getCodeName().get(), PreadviceInstructed);
		codesByName.put(GuaranteedDeliveryIndicatorDifference.getCodeName().get(), GuaranteedDeliveryIndicatorDifference);
		codesByName.put(TradeSettlesInPartials.getCodeName().get(), TradeSettlesInPartials);
		codesByName.put(NoMatchingRequired.getCodeName().get(), NoMatchingRequired);
		codesByName.put(CounterpartyInsufficientMoney.getCodeName().get(), CounterpartyInsufficientMoney);
		codesByName.put(CollateralShortage.getCodeName().get(), CollateralShortage);
		codesByName.put(SecuritiesPledgedAsCollateral.getCodeName().get(), SecuritiesPledgedAsCollateral);
		codesByName.put(RefusedDepositForIssueOfDepositaryReceipts.getCodeName().get(), RefusedDepositForIssueOfDepositaryReceipts);
		codesByName.put(MaximumForeignLimitReached.getCodeName().get(), MaximumForeignLimitReached);
		codesByName.put(NoForeignExchangeInstruction.getCodeName().get(), NoForeignExchangeInstruction);
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
		codesByName.put(PendingCAP.getCodeName().get(), PendingCAP);
	}

	public static PendingSettlement2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingSettlement2Code[] values() {
		PendingSettlement2Code[] values = new PendingSettlement2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingSettlement2Code> {
		@Override
		public PendingSettlement2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingSettlement2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}