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
import com.tools20022.repository.codeset.UnmatchedReason3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason the transaction, transfer or settlement instruction is
 * unmatched.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#NoMatch
 * UnmatchedReason3Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#SettlementDate
 * UnmatchedReason3Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#TransactionDirection
 * UnmatchedReason3Code.TransactionDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#TransactionDealAmount
 * UnmatchedReason3Code.TransactionDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ReceivingDeliveringDepository
 * UnmatchedReason3Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#SettlementAmount
 * UnmatchedReason3Code.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#DealPrice
 * UnmatchedReason3Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#FinancialInstrumentQuantity
 * UnmatchedReason3Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RepurchaseCallDelay
 * UnmatchedReason3Code.RepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#AccountServicerDeadlineMissed
 * UnmatchedReason3Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#SettlementTransaction
 * UnmatchedReason3Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#SettlementSystemMethod
 * UnmatchedReason3Code.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#FinancialInstrument
 * UnmatchedReason3Code.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#VariableRateSupport
 * UnmatchedReason3Code.VariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#NotRecognised
 * UnmatchedReason3Code.NotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RepurchaseSpreadRate
 * UnmatchedReason3Code.RepurchaseSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RepurchaseRate
 * UnmatchedReason3Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#CounterpartyTooLateForMatching
 * UnmatchedReason3Code.CounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RepurchaseRateType
 * UnmatchedReason3Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RepurchaseAmount
 * UnmatchedReason3Code.RepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RepurchasePremiumAmount
 * UnmatchedReason3Code.RepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#PhysicalSettlement
 * UnmatchedReason3Code.PhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#CommonReference
 * UnmatchedReason3Code.CommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#PaymentCode
 * UnmatchedReason3Code.PaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#PlaceOfTrade
 * UnmatchedReason3Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#PossibleDuplicate
 * UnmatchedReason3Code.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ForfeitRepurchaseAmount
 * UnmatchedReason3Code.ForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ExecutionBrokerCommission
 * UnmatchedReason3Code.ExecutionBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RegistrationDetails
 * UnmatchedReason3Code.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#RTGSSystem
 * UnmatchedReason3Code.RTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ReceivingDeliveringParty1
 * UnmatchedReason3Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#CounterpartyCancelled
 * UnmatchedReason3Code.CounterpartyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ChargesAmount
 * UnmatchedReason3Code.ChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ReceivingDeliveringParty3
 * UnmatchedReason3Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#CurrencySettlementAmount
 * UnmatchedReason3Code.CurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#MatchingRecordCancelled
 * UnmatchedReason3Code.MatchingRecordCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#LetterOfGuarantee
 * UnmatchedReason3Code.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#NoMatchingStarted
 * UnmatchedReason3Code.NoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#SafekeepingAccount
 * UnmatchedReason3Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#TradeDate
 * UnmatchedReason3Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#MarketDeadlineMissed
 * UnmatchedReason3Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ClosingDateTime
 * UnmatchedReason3Code.ClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#TaxStatus
 * UnmatchedReason3Code.TaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#ReceivingDeliveringParty2
 * UnmatchedReason3Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#PlaceOfSafekeeping
 * UnmatchedReason3Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#MissingMarketSide
 * UnmatchedReason3Code.MissingMarketSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#UnmatchedMarketSide
 * UnmatchedReason3Code.UnmatchedMarketSide}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code#Other
 * UnmatchedReason3Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReasonCode
 * UnmatchedReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CMIS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedReason3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction, transfer or settlement instruction is unmatched."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.UnmatchedReason6Code
 * UnmatchedReason6Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedReason3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code NoMatch = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code SettlementDate = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDirection"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code TransactionDirection = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDirection";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.TransactionDirection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDealAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code TransactionDealAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDealAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.TransactionDealAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ReceivingDeliveringDepository = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code SettlementAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code DealPrice = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code FinancialInstrumentQuantity = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCallDelay"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RepurchaseCallDelay = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCallDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code AccountServicerDeadlineMissed = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code SettlementTransaction = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code SettlementSystemMethod = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementSystemMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code FinancialInstrument = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code VariableRateSupport = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.VariableRateSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code NotRecognised = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotRecognised";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.NotRecognised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpreadRate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RepurchaseSpreadRate = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseSpreadRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseSpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RepurchaseRate = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code CounterpartyTooLateForMatching = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyTooLateForMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RepurchaseRateType = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RepurchaseAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchasePremiumAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RepurchasePremiumAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchasePremiumAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchasePremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code PhysicalSettlement = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.PhysicalSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code CommonReference = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.CommonReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code PaymentCode = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.PaymentCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code PlaceOfTrade = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code PossibleDuplicate = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.PossibleDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ForfeitRepurchaseAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitRepurchaseAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ForfeitRepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionBrokerCommission"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ExecutionBrokerCommission = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionBrokerCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ExecutionBrokerCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RegistrationDetails = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RegistrationDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code RTGSSystem = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.RTGSSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ReceivingDeliveringParty1 = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelled"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code CounterpartyCancelled = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ChargesAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ChargesAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ReceivingDeliveringParty3 = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencySettlementAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code CurrencySettlementAmount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencySettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.CurrencySettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingRecordCancelled"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code MatchingRecordCancelled = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingRecordCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.MatchingRecordCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code LetterOfGuarantee = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.LetterOfGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code NoMatchingStarted = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingStarted";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatchingStarted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code SafekeepingAccount = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code TradeDate = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code MarketDeadlineMissed = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTime"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ClosingDateTime = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ClosingDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code TaxStatus = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.TaxStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code ReceivingDeliveringParty2 = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code PlaceOfSafekeeping = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMarketSide"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code MissingMarketSide = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMarketSide";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.MissingMarketSide.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedMarketSide"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code UnmatchedMarketSide = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedMarketSide";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.UnmatchedMarketSide.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason3Code
	 * UnmatchedReason3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final UnmatchedReason3Code Other = new UnmatchedReason3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason3Code.mmObject();
			codeName = UnmatchedReasonCode.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnmatchedReason3Code> codesByName = new LinkedHashMap<>();

	protected UnmatchedReason3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CMIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedReason3Code";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				nextVersions_lazy = () -> Arrays.asList(UnmatchedReason6Code.mmObject());
				trace_lazy = () -> UnmatchedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedReason3Code.NoMatch, com.tools20022.repository.codeset.UnmatchedReason3Code.SettlementDate,
						com.tools20022.repository.codeset.UnmatchedReason3Code.TransactionDirection, com.tools20022.repository.codeset.UnmatchedReason3Code.TransactionDealAmount,
						com.tools20022.repository.codeset.UnmatchedReason3Code.ReceivingDeliveringDepository, com.tools20022.repository.codeset.UnmatchedReason3Code.SettlementAmount,
						com.tools20022.repository.codeset.UnmatchedReason3Code.DealPrice, com.tools20022.repository.codeset.UnmatchedReason3Code.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.UnmatchedReason3Code.RepurchaseCallDelay, com.tools20022.repository.codeset.UnmatchedReason3Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReason3Code.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedReason3Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.UnmatchedReason3Code.FinancialInstrument, com.tools20022.repository.codeset.UnmatchedReason3Code.VariableRateSupport,
						com.tools20022.repository.codeset.UnmatchedReason3Code.NotRecognised, com.tools20022.repository.codeset.UnmatchedReason3Code.RepurchaseSpreadRate,
						com.tools20022.repository.codeset.UnmatchedReason3Code.RepurchaseRate, com.tools20022.repository.codeset.UnmatchedReason3Code.CounterpartyTooLateForMatching,
						com.tools20022.repository.codeset.UnmatchedReason3Code.RepurchaseRateType, com.tools20022.repository.codeset.UnmatchedReason3Code.RepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedReason3Code.RepurchasePremiumAmount, com.tools20022.repository.codeset.UnmatchedReason3Code.PhysicalSettlement,
						com.tools20022.repository.codeset.UnmatchedReason3Code.CommonReference, com.tools20022.repository.codeset.UnmatchedReason3Code.PaymentCode, com.tools20022.repository.codeset.UnmatchedReason3Code.PlaceOfTrade,
						com.tools20022.repository.codeset.UnmatchedReason3Code.PossibleDuplicate, com.tools20022.repository.codeset.UnmatchedReason3Code.ForfeitRepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedReason3Code.ExecutionBrokerCommission, com.tools20022.repository.codeset.UnmatchedReason3Code.RegistrationDetails,
						com.tools20022.repository.codeset.UnmatchedReason3Code.RTGSSystem, com.tools20022.repository.codeset.UnmatchedReason3Code.ReceivingDeliveringParty1,
						com.tools20022.repository.codeset.UnmatchedReason3Code.CounterpartyCancelled, com.tools20022.repository.codeset.UnmatchedReason3Code.ChargesAmount,
						com.tools20022.repository.codeset.UnmatchedReason3Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.UnmatchedReason3Code.CurrencySettlementAmount,
						com.tools20022.repository.codeset.UnmatchedReason3Code.MatchingRecordCancelled, com.tools20022.repository.codeset.UnmatchedReason3Code.LetterOfGuarantee,
						com.tools20022.repository.codeset.UnmatchedReason3Code.NoMatchingStarted, com.tools20022.repository.codeset.UnmatchedReason3Code.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedReason3Code.TradeDate,
						com.tools20022.repository.codeset.UnmatchedReason3Code.MarketDeadlineMissed, com.tools20022.repository.codeset.UnmatchedReason3Code.ClosingDateTime, com.tools20022.repository.codeset.UnmatchedReason3Code.TaxStatus,
						com.tools20022.repository.codeset.UnmatchedReason3Code.ReceivingDeliveringParty2, com.tools20022.repository.codeset.UnmatchedReason3Code.PlaceOfSafekeeping,
						com.tools20022.repository.codeset.UnmatchedReason3Code.MissingMarketSide, com.tools20022.repository.codeset.UnmatchedReason3Code.UnmatchedMarketSide, com.tools20022.repository.codeset.UnmatchedReason3Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(TransactionDirection.getCodeName().get(), TransactionDirection);
		codesByName.put(TransactionDealAmount.getCodeName().get(), TransactionDealAmount);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(RepurchaseCallDelay.getCodeName().get(), RepurchaseCallDelay);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(FinancialInstrument.getCodeName().get(), FinancialInstrument);
		codesByName.put(VariableRateSupport.getCodeName().get(), VariableRateSupport);
		codesByName.put(NotRecognised.getCodeName().get(), NotRecognised);
		codesByName.put(RepurchaseSpreadRate.getCodeName().get(), RepurchaseSpreadRate);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(CounterpartyTooLateForMatching.getCodeName().get(), CounterpartyTooLateForMatching);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(RepurchaseAmount.getCodeName().get(), RepurchaseAmount);
		codesByName.put(RepurchasePremiumAmount.getCodeName().get(), RepurchasePremiumAmount);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(PaymentCode.getCodeName().get(), PaymentCode);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(ForfeitRepurchaseAmount.getCodeName().get(), ForfeitRepurchaseAmount);
		codesByName.put(ExecutionBrokerCommission.getCodeName().get(), ExecutionBrokerCommission);
		codesByName.put(RegistrationDetails.getCodeName().get(), RegistrationDetails);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(CounterpartyCancelled.getCodeName().get(), CounterpartyCancelled);
		codesByName.put(ChargesAmount.getCodeName().get(), ChargesAmount);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(CurrencySettlementAmount.getCodeName().get(), CurrencySettlementAmount);
		codesByName.put(MatchingRecordCancelled.getCodeName().get(), MatchingRecordCancelled);
		codesByName.put(LetterOfGuarantee.getCodeName().get(), LetterOfGuarantee);
		codesByName.put(NoMatchingStarted.getCodeName().get(), NoMatchingStarted);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(MissingMarketSide.getCodeName().get(), MissingMarketSide);
		codesByName.put(UnmatchedMarketSide.getCodeName().get(), UnmatchedMarketSide);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static UnmatchedReason3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedReason3Code[] values() {
		UnmatchedReason3Code[] values = new UnmatchedReason3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedReason3Code> {
		@Override
		public UnmatchedReason3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedReason3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}