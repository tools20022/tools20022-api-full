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
import com.tools20022.repository.codeset.UnmatchedReason4Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#AccountServicerDeadlineMissed
 * UnmatchedReason4Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RepurchaseCallDelay
 * UnmatchedReason4Code.RepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ChargesAmount
 * UnmatchedReason4Code.ChargesAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#NoMatch
 * UnmatchedReason4Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#CounterpartyCancelled
 * UnmatchedReason4Code.CounterpartyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SettlementDate
 * UnmatchedReason4Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#DealPrice
 * UnmatchedReason4Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#TransactionDealAmount
 * UnmatchedReason4Code.TransactionDealAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#TransactionDirection
 * UnmatchedReason4Code.TransactionDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ReceivingDeliveringDepository
 * UnmatchedReason4Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SettlementAmount
 * UnmatchedReason4Code.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#FinancialInstrumentQuantity
 * UnmatchedReason4Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#FinancialInstrument
 * UnmatchedReason4Code.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#TradeDate
 * UnmatchedReason4Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ExecutionBrokerCommission
 * UnmatchedReason4Code.ExecutionBrokerCommission}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ForfeitRepurchaseAmount
 * UnmatchedReason4Code.ForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#MarketDeadlineMissed
 * UnmatchedReason4Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#LetterOfGuarantee
 * UnmatchedReason4Code.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#MatchingRecordCancelled
 * UnmatchedReason4Code.MatchingRecordCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#NarrativeReason
 * UnmatchedReason4Code.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#PhysicalSettlement
 * UnmatchedReason4Code.PhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#PlaceOfTrade
 * UnmatchedReason4Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#PossibleDuplicate
 * UnmatchedReason4Code.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RepurchaseAmount
 * UnmatchedReason4Code.RepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RepurchaseRate
 * UnmatchedReason4Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RepurchasePremiumAmount
 * UnmatchedReason4Code.RepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RepurchaseRateType
 * UnmatchedReason4Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RepurchaseSpreadRate
 * UnmatchedReason4Code.RepurchaseSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#RTGSSystem
 * UnmatchedReason4Code.RTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SafekeepingAccount
 * UnmatchedReason4Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SettlementTransaction
 * UnmatchedReason4Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SettlementSystemMethod
 * UnmatchedReason4Code.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ClosingDateTime
 * UnmatchedReason4Code.ClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#TaxStatus
 * UnmatchedReason4Code.TaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#VariableRateSupport
 * UnmatchedReason4Code.VariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#PositionEffect
 * UnmatchedReason4Code.PositionEffect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#BorrowingRate
 * UnmatchedReason4Code.BorrowingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ConsumptionTax
 * UnmatchedReason4Code.ConsumptionTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#OtherFinancialInstrumentIdentification
 * UnmatchedReason4Code.OtherFinancialInstrumentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#BorrowingFee
 * UnmatchedReason4Code.BorrowingFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#AccruedInterestTax1
 * UnmatchedReason4Code.AccruedInterestTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SettlementDate2
 * UnmatchedReason4Code.SettlementDate2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#CommonIdentification
 * UnmatchedReason4Code.CommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#StandardCollateralRatio
 * UnmatchedReason4Code.StandardCollateralRatio}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#AccruedInterestAmount1
 * UnmatchedReason4Code.AccruedInterestAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#SecuritiesHaircut
 * UnmatchedReason4Code.SecuritiesHaircut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#AccruedInterestAmount2
 * UnmatchedReason4Code.AccruedInterestAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#DealAmount2
 * UnmatchedReason4Code.DealAmount2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#CallableTradeIndicator
 * UnmatchedReason4Code.CallableTradeIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#AccruedInterestTax2
 * UnmatchedReason4Code.AccruedInterestTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#StandingSettlementInstruction
 * UnmatchedReason4Code.StandingSettlementInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#MaturityDate
 * UnmatchedReason4Code.MaturityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ClientOrderLinkIdentification
 * UnmatchedReason4Code.ClientOrderLinkIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ClosingSettlementAmount
 * UnmatchedReason4Code.ClosingSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#TypeOfFinancingClosing
 * UnmatchedReason4Code.TypeOfFinancingClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#BorrowingInterestAmount
 * UnmatchedReason4Code.BorrowingInterestAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#OpeningLegIdentification
 * UnmatchedReason4Code.OpeningLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#TradeTransactionType
 * UnmatchedReason4Code.TradeTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#LendingWithCollateral
 * UnmatchedReason4Code.LendingWithCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#InterestType
 * UnmatchedReason4Code.InterestType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#CurrentFactor
 * UnmatchedReason4Code.CurrentFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#LendingTransactionMethod
 * UnmatchedReason4Code.LendingTransactionMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#EndFactor
 * UnmatchedReason4Code.EndFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code#ClearingSegment
 * UnmatchedReason4Code.ClearingSegment}</li>
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
 * <li>"ADEA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedReason4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction, transfer or settlement instruction is unmatched."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedReason4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code AccountServicerDeadlineMissed = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCallDelay"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RepurchaseCallDelay = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCallDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargesAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ChargesAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargesAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ChargesAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code NoMatch = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelled"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code CounterpartyCancelled = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SettlementDate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code DealPrice = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDealAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code TransactionDealAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDealAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.TransactionDealAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDirection"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code TransactionDirection = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDirection";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.TransactionDirection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ReceivingDeliveringDepository = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SettlementAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code FinancialInstrumentQuantity = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code FinancialInstrument = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code TradeDate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExecutionBrokerCommission"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ExecutionBrokerCommission = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExecutionBrokerCommission";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ExecutionBrokerCommission.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ForfeitRepurchaseAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitRepurchaseAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ForfeitRepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code MarketDeadlineMissed = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code LetterOfGuarantee = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.LetterOfGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingRecordCancelled"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code MatchingRecordCancelled = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingRecordCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.MatchingRecordCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code NarrativeReason = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.NarrativeReason.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code PhysicalSettlement = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.PhysicalSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code PlaceOfTrade = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code PossibleDuplicate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.PossibleDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RepurchaseAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RepurchaseRate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchasePremiumAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RepurchasePremiumAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchasePremiumAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchasePremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RepurchaseRateType = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseSpreadRate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RepurchaseSpreadRate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseSpreadRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseSpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code RTGSSystem = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.RTGSSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SafekeepingAccount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SettlementTransaction = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SettlementSystemMethod = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementSystemMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTime"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ClosingDateTime = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ClosingDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code TaxStatus = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.TaxStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code VariableRateSupport = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.VariableRateSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionEffect"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code PositionEffect = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionEffect";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.PositionEffect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingRate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code BorrowingRate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.BorrowingRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConsumptionTax"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ConsumptionTax = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConsumptionTax";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ConsumptionTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherFinancialInstrumentIdentification"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code OtherFinancialInstrumentIdentification = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherFinancialInstrumentIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.OtherFinancialInstrumentIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingFee"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code BorrowingFee = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingFee";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.BorrowingFee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestTax1"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code AccruedInterestTax1 = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax1";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.AccruedInterestTax1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate2"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SettlementDate2 = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate2";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementDate2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code CommonIdentification = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.CommonIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardCollateralRatio"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code StandardCollateralRatio = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardCollateralRatio";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.StandardCollateralRatio.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount1"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code AccruedInterestAmount1 = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount1";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.AccruedInterestAmount1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHaircut"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code SecuritiesHaircut = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHaircut";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.SecuritiesHaircut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount2"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code AccruedInterestAmount2 = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount2";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.AccruedInterestAmount2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealAmount2"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code DealAmount2 = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealAmount2";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.DealAmount2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallableTradeIndicator"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code CallableTradeIndicator = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallableTradeIndicator";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.CallableTradeIndicator.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestTax2"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code AccruedInterestTax2 = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestTax2";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.AccruedInterestTax2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstruction"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code StandingSettlementInstruction = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.StandingSettlementInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code MaturityDate = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.MaturityDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientOrderLinkIdentification"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ClientOrderLinkIdentification = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientOrderLinkIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ClientOrderLinkIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingSettlementAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ClosingSettlementAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingSettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ClosingSettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfFinancingClosing"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code TypeOfFinancingClosing = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfFinancingClosing";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.TypeOfFinancingClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingInterestAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code BorrowingInterestAmount = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingInterestAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.BorrowingInterestAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningLegIdentification"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code OpeningLegIdentification = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningLegIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.OpeningLegIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeTransactionType"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code TradeTransactionType = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeTransactionType";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.TradeTransactionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingWithCollateral"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code LendingWithCollateral = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingWithCollateral";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.LendingWithCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestType"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code InterestType = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestType";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.InterestType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentFactor"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code CurrentFactor = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentFactor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.CurrentFactor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingTransactionMethod"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code LendingTransactionMethod = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingTransactionMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.LendingTransactionMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndFactor"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code EndFactor = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndFactor";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.EndFactor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason4Code
	 * UnmatchedReason4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingSegment"</li>
	 * </ul>
	 */
	public static final UnmatchedReason4Code ClearingSegment = new UnmatchedReason4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingSegment";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason4Code.mmObject();
			codeName = UnmatchedReasonCode.ClearingSegment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnmatchedReason4Code> codesByName = new LinkedHashMap<>();

	protected UnmatchedReason4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADEA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedReason4Code";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				trace_lazy = () -> UnmatchedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedReason4Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.UnmatchedReason4Code.RepurchaseCallDelay,
						com.tools20022.repository.codeset.UnmatchedReason4Code.ChargesAmount, com.tools20022.repository.codeset.UnmatchedReason4Code.NoMatch, com.tools20022.repository.codeset.UnmatchedReason4Code.CounterpartyCancelled,
						com.tools20022.repository.codeset.UnmatchedReason4Code.SettlementDate, com.tools20022.repository.codeset.UnmatchedReason4Code.DealPrice, com.tools20022.repository.codeset.UnmatchedReason4Code.TransactionDealAmount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.TransactionDirection, com.tools20022.repository.codeset.UnmatchedReason4Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.UnmatchedReason4Code.SettlementAmount, com.tools20022.repository.codeset.UnmatchedReason4Code.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.UnmatchedReason4Code.FinancialInstrument, com.tools20022.repository.codeset.UnmatchedReason4Code.TradeDate,
						com.tools20022.repository.codeset.UnmatchedReason4Code.ExecutionBrokerCommission, com.tools20022.repository.codeset.UnmatchedReason4Code.ForfeitRepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.MarketDeadlineMissed, com.tools20022.repository.codeset.UnmatchedReason4Code.LetterOfGuarantee,
						com.tools20022.repository.codeset.UnmatchedReason4Code.MatchingRecordCancelled, com.tools20022.repository.codeset.UnmatchedReason4Code.NarrativeReason,
						com.tools20022.repository.codeset.UnmatchedReason4Code.PhysicalSettlement, com.tools20022.repository.codeset.UnmatchedReason4Code.PlaceOfTrade,
						com.tools20022.repository.codeset.UnmatchedReason4Code.PossibleDuplicate, com.tools20022.repository.codeset.UnmatchedReason4Code.RepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.RepurchaseRate, com.tools20022.repository.codeset.UnmatchedReason4Code.RepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.RepurchaseRateType, com.tools20022.repository.codeset.UnmatchedReason4Code.RepurchaseSpreadRate,
						com.tools20022.repository.codeset.UnmatchedReason4Code.RTGSSystem, com.tools20022.repository.codeset.UnmatchedReason4Code.SafekeepingAccount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedReason4Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.UnmatchedReason4Code.ClosingDateTime, com.tools20022.repository.codeset.UnmatchedReason4Code.TaxStatus, com.tools20022.repository.codeset.UnmatchedReason4Code.VariableRateSupport,
						com.tools20022.repository.codeset.UnmatchedReason4Code.PositionEffect, com.tools20022.repository.codeset.UnmatchedReason4Code.BorrowingRate, com.tools20022.repository.codeset.UnmatchedReason4Code.ConsumptionTax,
						com.tools20022.repository.codeset.UnmatchedReason4Code.OtherFinancialInstrumentIdentification, com.tools20022.repository.codeset.UnmatchedReason4Code.BorrowingFee,
						com.tools20022.repository.codeset.UnmatchedReason4Code.AccruedInterestTax1, com.tools20022.repository.codeset.UnmatchedReason4Code.SettlementDate2,
						com.tools20022.repository.codeset.UnmatchedReason4Code.CommonIdentification, com.tools20022.repository.codeset.UnmatchedReason4Code.StandardCollateralRatio,
						com.tools20022.repository.codeset.UnmatchedReason4Code.AccruedInterestAmount1, com.tools20022.repository.codeset.UnmatchedReason4Code.SecuritiesHaircut,
						com.tools20022.repository.codeset.UnmatchedReason4Code.AccruedInterestAmount2, com.tools20022.repository.codeset.UnmatchedReason4Code.DealAmount2,
						com.tools20022.repository.codeset.UnmatchedReason4Code.CallableTradeIndicator, com.tools20022.repository.codeset.UnmatchedReason4Code.AccruedInterestTax2,
						com.tools20022.repository.codeset.UnmatchedReason4Code.StandingSettlementInstruction, com.tools20022.repository.codeset.UnmatchedReason4Code.MaturityDate,
						com.tools20022.repository.codeset.UnmatchedReason4Code.ClientOrderLinkIdentification, com.tools20022.repository.codeset.UnmatchedReason4Code.ClosingSettlementAmount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.TypeOfFinancingClosing, com.tools20022.repository.codeset.UnmatchedReason4Code.BorrowingInterestAmount,
						com.tools20022.repository.codeset.UnmatchedReason4Code.OpeningLegIdentification, com.tools20022.repository.codeset.UnmatchedReason4Code.TradeTransactionType,
						com.tools20022.repository.codeset.UnmatchedReason4Code.LendingWithCollateral, com.tools20022.repository.codeset.UnmatchedReason4Code.InterestType,
						com.tools20022.repository.codeset.UnmatchedReason4Code.CurrentFactor, com.tools20022.repository.codeset.UnmatchedReason4Code.LendingTransactionMethod,
						com.tools20022.repository.codeset.UnmatchedReason4Code.EndFactor, com.tools20022.repository.codeset.UnmatchedReason4Code.ClearingSegment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(RepurchaseCallDelay.getCodeName().get(), RepurchaseCallDelay);
		codesByName.put(ChargesAmount.getCodeName().get(), ChargesAmount);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(CounterpartyCancelled.getCodeName().get(), CounterpartyCancelled);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(TransactionDealAmount.getCodeName().get(), TransactionDealAmount);
		codesByName.put(TransactionDirection.getCodeName().get(), TransactionDirection);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(FinancialInstrument.getCodeName().get(), FinancialInstrument);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(ExecutionBrokerCommission.getCodeName().get(), ExecutionBrokerCommission);
		codesByName.put(ForfeitRepurchaseAmount.getCodeName().get(), ForfeitRepurchaseAmount);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(LetterOfGuarantee.getCodeName().get(), LetterOfGuarantee);
		codesByName.put(MatchingRecordCancelled.getCodeName().get(), MatchingRecordCancelled);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(RepurchaseAmount.getCodeName().get(), RepurchaseAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(RepurchasePremiumAmount.getCodeName().get(), RepurchasePremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(RepurchaseSpreadRate.getCodeName().get(), RepurchaseSpreadRate);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(VariableRateSupport.getCodeName().get(), VariableRateSupport);
		codesByName.put(PositionEffect.getCodeName().get(), PositionEffect);
		codesByName.put(BorrowingRate.getCodeName().get(), BorrowingRate);
		codesByName.put(ConsumptionTax.getCodeName().get(), ConsumptionTax);
		codesByName.put(OtherFinancialInstrumentIdentification.getCodeName().get(), OtherFinancialInstrumentIdentification);
		codesByName.put(BorrowingFee.getCodeName().get(), BorrowingFee);
		codesByName.put(AccruedInterestTax1.getCodeName().get(), AccruedInterestTax1);
		codesByName.put(SettlementDate2.getCodeName().get(), SettlementDate2);
		codesByName.put(CommonIdentification.getCodeName().get(), CommonIdentification);
		codesByName.put(StandardCollateralRatio.getCodeName().get(), StandardCollateralRatio);
		codesByName.put(AccruedInterestAmount1.getCodeName().get(), AccruedInterestAmount1);
		codesByName.put(SecuritiesHaircut.getCodeName().get(), SecuritiesHaircut);
		codesByName.put(AccruedInterestAmount2.getCodeName().get(), AccruedInterestAmount2);
		codesByName.put(DealAmount2.getCodeName().get(), DealAmount2);
		codesByName.put(CallableTradeIndicator.getCodeName().get(), CallableTradeIndicator);
		codesByName.put(AccruedInterestTax2.getCodeName().get(), AccruedInterestTax2);
		codesByName.put(StandingSettlementInstruction.getCodeName().get(), StandingSettlementInstruction);
		codesByName.put(MaturityDate.getCodeName().get(), MaturityDate);
		codesByName.put(ClientOrderLinkIdentification.getCodeName().get(), ClientOrderLinkIdentification);
		codesByName.put(ClosingSettlementAmount.getCodeName().get(), ClosingSettlementAmount);
		codesByName.put(TypeOfFinancingClosing.getCodeName().get(), TypeOfFinancingClosing);
		codesByName.put(BorrowingInterestAmount.getCodeName().get(), BorrowingInterestAmount);
		codesByName.put(OpeningLegIdentification.getCodeName().get(), OpeningLegIdentification);
		codesByName.put(TradeTransactionType.getCodeName().get(), TradeTransactionType);
		codesByName.put(LendingWithCollateral.getCodeName().get(), LendingWithCollateral);
		codesByName.put(InterestType.getCodeName().get(), InterestType);
		codesByName.put(CurrentFactor.getCodeName().get(), CurrentFactor);
		codesByName.put(LendingTransactionMethod.getCodeName().get(), LendingTransactionMethod);
		codesByName.put(EndFactor.getCodeName().get(), EndFactor);
		codesByName.put(ClearingSegment.getCodeName().get(), ClearingSegment);
	}

	public static UnmatchedReason4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedReason4Code[] values() {
		UnmatchedReason4Code[] values = new UnmatchedReason4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedReason4Code> {
		@Override
		public UnmatchedReason4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedReason4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}