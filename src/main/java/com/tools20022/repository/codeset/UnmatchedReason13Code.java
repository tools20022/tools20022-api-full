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
import com.tools20022.repository.codeset.UnmatchedReason13Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#AccountServicerDeadlineMissed
 * UnmatchedReason13Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#AccruedInterestAmount1
 * UnmatchedReason13Code.AccruedInterestAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#ClosingDateTime
 * UnmatchedReason13Code.ClosingDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#CommonReference
 * UnmatchedReason13Code.CommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#CounterpartyCancelled
 * UnmatchedReason13Code.CounterpartyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#CounterpartyTooLateForMatching
 * UnmatchedReason13Code.CounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#CurrencySettlementAmount
 * UnmatchedReason13Code.CurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#DealPrice
 * UnmatchedReason13Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#FinancialInstrument
 * UnmatchedReason13Code.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#FinancialInstrumentQuantity
 * UnmatchedReason13Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#ForfeitRepurchaseAmount
 * UnmatchedReason13Code.ForfeitRepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#InvestorParty
 * UnmatchedReason13Code.InvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#LetterOfGuarantee
 * UnmatchedReason13Code.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#MarketDeadlineMissed
 * UnmatchedReason13Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#NoMatch
 * UnmatchedReason13Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#NoMatchingStarted
 * UnmatchedReason13Code.NoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#NotRecognised
 * UnmatchedReason13Code.NotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#Other
 * UnmatchedReason13Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#PaymentCode
 * UnmatchedReason13Code.PaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#PhysicalSettlement
 * UnmatchedReason13Code.PhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#PlaceOfListing
 * UnmatchedReason13Code.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#PlaceOfSafekeeping
 * UnmatchedReason13Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#PlaceOfTrade
 * UnmatchedReason13Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#PossibleDuplicate
 * UnmatchedReason13Code.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#ReceivingDeliveringDepository
 * UnmatchedReason13Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#ReceivingDeliveringParty1
 * UnmatchedReason13Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#ReceivingDeliveringParty2
 * UnmatchedReason13Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#ReceivingDeliveringParty3
 * UnmatchedReason13Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RegistrationDetails
 * UnmatchedReason13Code.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RepurchaseAmount
 * UnmatchedReason13Code.RepurchaseAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RepurchaseCallDelay
 * UnmatchedReason13Code.RepurchaseCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RepurchasePremiumAmount
 * UnmatchedReason13Code.RepurchasePremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RepurchaseRate
 * UnmatchedReason13Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RepurchaseRateType
 * UnmatchedReason13Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#RTGSSystem
 * UnmatchedReason13Code.RTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#SafekeepingAccount
 * UnmatchedReason13Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#SettlementAmount
 * UnmatchedReason13Code.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#SettlementDate
 * UnmatchedReason13Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#SettlementSystemMethod
 * UnmatchedReason13Code.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#SettlementTransaction
 * UnmatchedReason13Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#TaxStatus
 * UnmatchedReason13Code.TaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#TradeDate
 * UnmatchedReason13Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#TransactionDirection
 * UnmatchedReason13Code.TransactionDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#VariableRateSupport
 * UnmatchedReason13Code.VariableRateSupport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#AutomaticGeneration
 * UnmatchedReason13Code.AutomaticGeneration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code#CumEx
 * UnmatchedReason13Code.CumEx}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UnmatchedReason13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction, transfer or settlement instruction is unmatched."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedReason13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code AccountServicerDeadlineMissed = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount1"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code AccruedInterestAmount1 = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount1";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.AccruedInterestAmount1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTime"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code ClosingDateTime = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.ClosingDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code CommonReference = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.CommonReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelled"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code CounterpartyCancelled = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code CounterpartyTooLateForMatching = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyTooLateForMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencySettlementAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code CurrencySettlementAmount = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencySettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.CurrencySettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code DealPrice = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code FinancialInstrument = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code FinancialInstrumentQuantity = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitRepurchaseAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code ForfeitRepurchaseAmount = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitRepurchaseAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.ForfeitRepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorParty"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code InvestorParty = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorParty";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.InvestorParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code LetterOfGuarantee = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.LetterOfGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code MarketDeadlineMissed = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code NoMatch = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code NoMatchingStarted = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingStarted";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatchingStarted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code NotRecognised = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotRecognised";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.NotRecognised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code Other = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code PaymentCode = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.PaymentCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code PhysicalSettlement = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.PhysicalSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code PlaceOfListing = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code PlaceOfSafekeeping = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code PlaceOfTrade = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code PossibleDuplicate = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.PossibleDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code ReceivingDeliveringDepository = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code ReceivingDeliveringParty1 = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code ReceivingDeliveringParty2 = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code ReceivingDeliveringParty3 = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RegistrationDetails = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RegistrationDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RepurchaseAmount = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseCallDelay"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RepurchaseCallDelay = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseCallDelay";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchasePremiumAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RepurchasePremiumAmount = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchasePremiumAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchasePremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RepurchaseRate = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RepurchaseRateType = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code RTGSSystem = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.RTGSSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code SafekeepingAccount = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code SettlementAmount = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code SettlementDate = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code SettlementSystemMethod = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementSystemMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code SettlementTransaction = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code TaxStatus = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.TaxStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code TradeDate = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDirection"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code TransactionDirection = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDirection";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.TransactionDirection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupport"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code VariableRateSupport = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupport";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.VariableRateSupport.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutomaticGeneration"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code AutomaticGeneration = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutomaticGeneration";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.AutomaticGeneration.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason13Code
	 * UnmatchedReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumEx"</li>
	 * </ul>
	 */
	public static final UnmatchedReason13Code CumEx = new UnmatchedReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumEx";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason13Code.mmObject();
			codeName = UnmatchedReasonCode.CumEx.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnmatchedReason13Code> codesByName = new LinkedHashMap<>();

	protected UnmatchedReason13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedReason13Code";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				trace_lazy = () -> UnmatchedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedReason13Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.UnmatchedReason13Code.AccruedInterestAmount1,
						com.tools20022.repository.codeset.UnmatchedReason13Code.ClosingDateTime, com.tools20022.repository.codeset.UnmatchedReason13Code.CommonReference,
						com.tools20022.repository.codeset.UnmatchedReason13Code.CounterpartyCancelled, com.tools20022.repository.codeset.UnmatchedReason13Code.CounterpartyTooLateForMatching,
						com.tools20022.repository.codeset.UnmatchedReason13Code.CurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedReason13Code.DealPrice,
						com.tools20022.repository.codeset.UnmatchedReason13Code.FinancialInstrument, com.tools20022.repository.codeset.UnmatchedReason13Code.FinancialInstrumentQuantity,
						com.tools20022.repository.codeset.UnmatchedReason13Code.ForfeitRepurchaseAmount, com.tools20022.repository.codeset.UnmatchedReason13Code.InvestorParty,
						com.tools20022.repository.codeset.UnmatchedReason13Code.LetterOfGuarantee, com.tools20022.repository.codeset.UnmatchedReason13Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReason13Code.NoMatch, com.tools20022.repository.codeset.UnmatchedReason13Code.NoMatchingStarted, com.tools20022.repository.codeset.UnmatchedReason13Code.NotRecognised,
						com.tools20022.repository.codeset.UnmatchedReason13Code.Other, com.tools20022.repository.codeset.UnmatchedReason13Code.PaymentCode, com.tools20022.repository.codeset.UnmatchedReason13Code.PhysicalSettlement,
						com.tools20022.repository.codeset.UnmatchedReason13Code.PlaceOfListing, com.tools20022.repository.codeset.UnmatchedReason13Code.PlaceOfSafekeeping,
						com.tools20022.repository.codeset.UnmatchedReason13Code.PlaceOfTrade, com.tools20022.repository.codeset.UnmatchedReason13Code.PossibleDuplicate,
						com.tools20022.repository.codeset.UnmatchedReason13Code.ReceivingDeliveringDepository, com.tools20022.repository.codeset.UnmatchedReason13Code.ReceivingDeliveringParty1,
						com.tools20022.repository.codeset.UnmatchedReason13Code.ReceivingDeliveringParty2, com.tools20022.repository.codeset.UnmatchedReason13Code.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.UnmatchedReason13Code.RegistrationDetails, com.tools20022.repository.codeset.UnmatchedReason13Code.RepurchaseAmount,
						com.tools20022.repository.codeset.UnmatchedReason13Code.RepurchaseCallDelay, com.tools20022.repository.codeset.UnmatchedReason13Code.RepurchasePremiumAmount,
						com.tools20022.repository.codeset.UnmatchedReason13Code.RepurchaseRate, com.tools20022.repository.codeset.UnmatchedReason13Code.RepurchaseRateType, com.tools20022.repository.codeset.UnmatchedReason13Code.RTGSSystem,
						com.tools20022.repository.codeset.UnmatchedReason13Code.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedReason13Code.SettlementAmount,
						com.tools20022.repository.codeset.UnmatchedReason13Code.SettlementDate, com.tools20022.repository.codeset.UnmatchedReason13Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.UnmatchedReason13Code.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedReason13Code.TaxStatus, com.tools20022.repository.codeset.UnmatchedReason13Code.TradeDate,
						com.tools20022.repository.codeset.UnmatchedReason13Code.TransactionDirection, com.tools20022.repository.codeset.UnmatchedReason13Code.VariableRateSupport,
						com.tools20022.repository.codeset.UnmatchedReason13Code.AutomaticGeneration, com.tools20022.repository.codeset.UnmatchedReason13Code.CumEx);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(AccruedInterestAmount1.getCodeName().get(), AccruedInterestAmount1);
		codesByName.put(ClosingDateTime.getCodeName().get(), ClosingDateTime);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(CounterpartyCancelled.getCodeName().get(), CounterpartyCancelled);
		codesByName.put(CounterpartyTooLateForMatching.getCodeName().get(), CounterpartyTooLateForMatching);
		codesByName.put(CurrencySettlementAmount.getCodeName().get(), CurrencySettlementAmount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(FinancialInstrument.getCodeName().get(), FinancialInstrument);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(ForfeitRepurchaseAmount.getCodeName().get(), ForfeitRepurchaseAmount);
		codesByName.put(InvestorParty.getCodeName().get(), InvestorParty);
		codesByName.put(LetterOfGuarantee.getCodeName().get(), LetterOfGuarantee);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(NoMatchingStarted.getCodeName().get(), NoMatchingStarted);
		codesByName.put(NotRecognised.getCodeName().get(), NotRecognised);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PaymentCode.getCodeName().get(), PaymentCode);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(RegistrationDetails.getCodeName().get(), RegistrationDetails);
		codesByName.put(RepurchaseAmount.getCodeName().get(), RepurchaseAmount);
		codesByName.put(RepurchaseCallDelay.getCodeName().get(), RepurchaseCallDelay);
		codesByName.put(RepurchasePremiumAmount.getCodeName().get(), RepurchasePremiumAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(TransactionDirection.getCodeName().get(), TransactionDirection);
		codesByName.put(VariableRateSupport.getCodeName().get(), VariableRateSupport);
		codesByName.put(AutomaticGeneration.getCodeName().get(), AutomaticGeneration);
		codesByName.put(CumEx.getCodeName().get(), CumEx);
	}

	public static UnmatchedReason13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedReason13Code[] values() {
		UnmatchedReason13Code[] values = new UnmatchedReason13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedReason13Code> {
		@Override
		public UnmatchedReason13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedReason13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}