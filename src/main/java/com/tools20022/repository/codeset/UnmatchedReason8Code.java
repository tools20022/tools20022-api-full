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
import com.tools20022.repository.codeset.UnmatchedReason8Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#NoMatch
 * UnmatchedReason8Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#SettlementDate
 * UnmatchedReason8Code.SettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#TransactionDirection
 * UnmatchedReason8Code.TransactionDirection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#ReceivingDeliveringDepository
 * UnmatchedReason8Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#SettlementAmount
 * UnmatchedReason8Code.SettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#DealPrice
 * UnmatchedReason8Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#FinancialInstrumentQuantity
 * UnmatchedReason8Code.FinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#AccountServicerDeadlineMissed
 * UnmatchedReason8Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#SettlementTransaction
 * UnmatchedReason8Code.SettlementTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#SettlementSystemMethod
 * UnmatchedReason8Code.SettlementSystemMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#FinancialInstrument
 * UnmatchedReason8Code.FinancialInstrument}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#NotRecognised
 * UnmatchedReason8Code.NotRecognised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#CounterpartyTooLateForMatching
 * UnmatchedReason8Code.CounterpartyTooLateForMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#PhysicalSettlement
 * UnmatchedReason8Code.PhysicalSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#CommonReference
 * UnmatchedReason8Code.CommonReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#PaymentCode
 * UnmatchedReason8Code.PaymentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#PlaceOfTrade
 * UnmatchedReason8Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#PossibleDuplicate
 * UnmatchedReason8Code.PossibleDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#RegistrationDetails
 * UnmatchedReason8Code.RegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#RTGSSystem
 * UnmatchedReason8Code.RTGSSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#ReceivingDeliveringParty1
 * UnmatchedReason8Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#CounterpartyCancelled
 * UnmatchedReason8Code.CounterpartyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#ReceivingDeliveringParty3
 * UnmatchedReason8Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#CurrencySettlementAmount
 * UnmatchedReason8Code.CurrencySettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#LetterOfGuarantee
 * UnmatchedReason8Code.LetterOfGuarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#NoMatchingStarted
 * UnmatchedReason8Code.NoMatchingStarted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#SafekeepingAccount
 * UnmatchedReason8Code.SafekeepingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#TradeDate
 * UnmatchedReason8Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#MarketDeadlineMissed
 * UnmatchedReason8Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#TaxStatus
 * UnmatchedReason8Code.TaxStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#ReceivingDeliveringParty2
 * UnmatchedReason8Code.ReceivingDeliveringParty2}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#Other
 * UnmatchedReason8Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#MissingMarketSide
 * UnmatchedReason8Code.MissingMarketSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#UnmatchedMarketSide
 * UnmatchedReason8Code.UnmatchedMarketSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#PlaceOfSafekeeping
 * UnmatchedReason8Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#AccruedInterestAmount1
 * UnmatchedReason8Code.AccruedInterestAmount1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#InvestorParty
 * UnmatchedReason8Code.InvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code#PlaceOfListing
 * UnmatchedReason8Code.PlaceOfListing}</li>
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
 * "UnmatchedReason8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason the transaction, transfer or settlement instruction is unmatched."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code
 * UnmatchedReason5Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UnmatchedReason8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#NoMatch
	 * UnmatchedReason5Code.NoMatch}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code NoMatch = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			previousVersion_lazy = () -> UnmatchedReason5Code.NoMatch;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#SettlementDate
	 * UnmatchedReason5Code.SettlementDate}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code SettlementDate = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			previousVersion_lazy = () -> UnmatchedReason5Code.SettlementDate;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDirection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#TransactionDirection
	 * UnmatchedReason5Code.TransactionDirection}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code TransactionDirection = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDirection";
			previousVersion_lazy = () -> UnmatchedReason5Code.TransactionDirection;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.TransactionDirection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#ReceivingDeliveringDepository
	 * UnmatchedReason5Code.ReceivingDeliveringDepository}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code ReceivingDeliveringDepository = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			previousVersion_lazy = () -> UnmatchedReason5Code.ReceivingDeliveringDepository;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#SettlementAmount
	 * UnmatchedReason5Code.SettlementAmount}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code SettlementAmount = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			previousVersion_lazy = () -> UnmatchedReason5Code.SettlementAmount;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#DealPrice
	 * UnmatchedReason5Code.DealPrice}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code DealPrice = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			previousVersion_lazy = () -> UnmatchedReason5Code.DealPrice;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#FinancialInstrumentQuantity
	 * UnmatchedReason5Code.FinancialInstrumentQuantity}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code FinancialInstrumentQuantity = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentQuantity";
			previousVersion_lazy = () -> UnmatchedReason5Code.FinancialInstrumentQuantity;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrumentQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#AccountServicerDeadlineMissed
	 * UnmatchedReason5Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code AccountServicerDeadlineMissed = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			previousVersion_lazy = () -> UnmatchedReason5Code.AccountServicerDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#SettlementTransaction
	 * UnmatchedReason5Code.SettlementTransaction}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code SettlementTransaction = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransaction";
			previousVersion_lazy = () -> UnmatchedReason5Code.SettlementTransaction;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#SettlementSystemMethod
	 * UnmatchedReason5Code.SettlementSystemMethod}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code SettlementSystemMethod = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethod";
			previousVersion_lazy = () -> UnmatchedReason5Code.SettlementSystemMethod;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.SettlementSystemMethod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrument"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#FinancialInstrument
	 * UnmatchedReason5Code.FinancialInstrument}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code FinancialInstrument = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrument";
			previousVersion_lazy = () -> UnmatchedReason5Code.FinancialInstrument;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.FinancialInstrument.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotRecognised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#NotRecognised
	 * UnmatchedReason5Code.NotRecognised}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code NotRecognised = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotRecognised";
			previousVersion_lazy = () -> UnmatchedReason5Code.NotRecognised;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.NotRecognised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyTooLateForMatching"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#CounterpartyTooLateForMatching
	 * UnmatchedReason5Code.CounterpartyTooLateForMatching}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code CounterpartyTooLateForMatching = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyTooLateForMatching";
			previousVersion_lazy = () -> UnmatchedReason5Code.CounterpartyTooLateForMatching;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyTooLateForMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#PhysicalSettlement
	 * UnmatchedReason5Code.PhysicalSettlement}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code PhysicalSettlement = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlement";
			previousVersion_lazy = () -> UnmatchedReason5Code.PhysicalSettlement;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.PhysicalSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#CommonReference
	 * UnmatchedReason5Code.CommonReference}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code CommonReference = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReference";
			previousVersion_lazy = () -> UnmatchedReason5Code.CommonReference;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.CommonReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#PaymentCode
	 * UnmatchedReason5Code.PaymentCode}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code PaymentCode = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentCode";
			previousVersion_lazy = () -> UnmatchedReason5Code.PaymentCode;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.PaymentCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#PlaceOfTrade
	 * UnmatchedReason5Code.PlaceOfTrade}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code PlaceOfTrade = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			previousVersion_lazy = () -> UnmatchedReason5Code.PlaceOfTrade;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PossibleDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#PossibleDuplicate
	 * UnmatchedReason5Code.PossibleDuplicate}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code PossibleDuplicate = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PossibleDuplicate";
			previousVersion_lazy = () -> UnmatchedReason5Code.PossibleDuplicate;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.PossibleDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#RegistrationDetails
	 * UnmatchedReason5Code.RegistrationDetails}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code RegistrationDetails = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			previousVersion_lazy = () -> UnmatchedReason5Code.RegistrationDetails;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.RegistrationDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTGSSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#RTGSSystem
	 * UnmatchedReason5Code.RTGSSystem}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code RTGSSystem = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTGSSystem";
			previousVersion_lazy = () -> UnmatchedReason5Code.RTGSSystem;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.RTGSSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#ReceivingDeliveringParty1
	 * UnmatchedReason5Code.ReceivingDeliveringParty1}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code ReceivingDeliveringParty1 = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			previousVersion_lazy = () -> UnmatchedReason5Code.ReceivingDeliveringParty1;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#CounterpartyCancelled
	 * UnmatchedReason5Code.CounterpartyCancelled}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code CounterpartyCancelled = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyCancelled";
			previousVersion_lazy = () -> UnmatchedReason5Code.CounterpartyCancelled;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.CounterpartyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#ReceivingDeliveringParty3
	 * UnmatchedReason5Code.ReceivingDeliveringParty3}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code ReceivingDeliveringParty3 = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			previousVersion_lazy = () -> UnmatchedReason5Code.ReceivingDeliveringParty3;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencySettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#CurrencySettlementAmount
	 * UnmatchedReason5Code.CurrencySettlementAmount}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code CurrencySettlementAmount = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencySettlementAmount";
			previousVersion_lazy = () -> UnmatchedReason5Code.CurrencySettlementAmount;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.CurrencySettlementAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#LetterOfGuarantee
	 * UnmatchedReason5Code.LetterOfGuarantee}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code LetterOfGuarantee = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuarantee";
			previousVersion_lazy = () -> UnmatchedReason5Code.LetterOfGuarantee;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.LetterOfGuarantee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingStarted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#NoMatchingStarted
	 * UnmatchedReason5Code.NoMatchingStarted}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code NoMatchingStarted = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingStarted";
			previousVersion_lazy = () -> UnmatchedReason5Code.NoMatchingStarted;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.NoMatchingStarted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#SafekeepingAccount
	 * UnmatchedReason5Code.SafekeepingAccount}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code SafekeepingAccount = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccount";
			previousVersion_lazy = () -> UnmatchedReason5Code.SafekeepingAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.SafekeepingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#TradeDate
	 * UnmatchedReason5Code.TradeDate}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code TradeDate = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			previousVersion_lazy = () -> UnmatchedReason5Code.TradeDate;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#MarketDeadlineMissed
	 * UnmatchedReason5Code.MarketDeadlineMissed}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code MarketDeadlineMissed = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			previousVersion_lazy = () -> UnmatchedReason5Code.MarketDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#TaxStatus
	 * UnmatchedReason5Code.TaxStatus}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code TaxStatus = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatus";
			previousVersion_lazy = () -> UnmatchedReason5Code.TaxStatus;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.TaxStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#ReceivingDeliveringParty2
	 * UnmatchedReason5Code.ReceivingDeliveringParty2}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code ReceivingDeliveringParty2 = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			previousVersion_lazy = () -> UnmatchedReason5Code.ReceivingDeliveringParty2;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#Other
	 * UnmatchedReason5Code.Other}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code Other = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> UnmatchedReason5Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMarketSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#MissingMarketSide
	 * UnmatchedReason5Code.MissingMarketSide}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code MissingMarketSide = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMarketSide";
			previousVersion_lazy = () -> UnmatchedReason5Code.MissingMarketSide;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.MissingMarketSide.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedMarketSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#UnmatchedMarketSide
	 * UnmatchedReason5Code.UnmatchedMarketSide}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code UnmatchedMarketSide = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedMarketSide";
			previousVersion_lazy = () -> UnmatchedReason5Code.UnmatchedMarketSide;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.UnmatchedMarketSide.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#PlaceOfSafekeeping
	 * UnmatchedReason5Code.PlaceOfSafekeeping}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code PlaceOfSafekeeping = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			previousVersion_lazy = () -> UnmatchedReason5Code.PlaceOfSafekeeping;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason5Code#AccruedInterestAmount1
	 * UnmatchedReason5Code.AccruedInterestAmount1}</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code AccruedInterestAmount1 = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount1";
			previousVersion_lazy = () -> UnmatchedReason5Code.AccruedInterestAmount1;
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.AccruedInterestAmount1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorParty"</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code InvestorParty = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorParty";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.InvestorParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UnmatchedReason8Code
	 * UnmatchedReason8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * </ul>
	 */
	public static final UnmatchedReason8Code PlaceOfListing = new UnmatchedReason8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			owner_lazy = () -> com.tools20022.repository.codeset.UnmatchedReason8Code.mmObject();
			codeName = UnmatchedReasonCode.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UnmatchedReason8Code> codesByName = new LinkedHashMap<>();

	protected UnmatchedReason8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CMIS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UnmatchedReason8Code";
				definition = "Specifies the reason the transaction, transfer or settlement instruction is unmatched.";
				previousVersion_lazy = () -> UnmatchedReason5Code.mmObject();
				trace_lazy = () -> UnmatchedReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UnmatchedReason8Code.NoMatch, com.tools20022.repository.codeset.UnmatchedReason8Code.SettlementDate,
						com.tools20022.repository.codeset.UnmatchedReason8Code.TransactionDirection, com.tools20022.repository.codeset.UnmatchedReason8Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.UnmatchedReason8Code.SettlementAmount, com.tools20022.repository.codeset.UnmatchedReason8Code.DealPrice,
						com.tools20022.repository.codeset.UnmatchedReason8Code.FinancialInstrumentQuantity, com.tools20022.repository.codeset.UnmatchedReason8Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.UnmatchedReason8Code.SettlementTransaction, com.tools20022.repository.codeset.UnmatchedReason8Code.SettlementSystemMethod,
						com.tools20022.repository.codeset.UnmatchedReason8Code.FinancialInstrument, com.tools20022.repository.codeset.UnmatchedReason8Code.NotRecognised,
						com.tools20022.repository.codeset.UnmatchedReason8Code.CounterpartyTooLateForMatching, com.tools20022.repository.codeset.UnmatchedReason8Code.PhysicalSettlement,
						com.tools20022.repository.codeset.UnmatchedReason8Code.CommonReference, com.tools20022.repository.codeset.UnmatchedReason8Code.PaymentCode, com.tools20022.repository.codeset.UnmatchedReason8Code.PlaceOfTrade,
						com.tools20022.repository.codeset.UnmatchedReason8Code.PossibleDuplicate, com.tools20022.repository.codeset.UnmatchedReason8Code.RegistrationDetails,
						com.tools20022.repository.codeset.UnmatchedReason8Code.RTGSSystem, com.tools20022.repository.codeset.UnmatchedReason8Code.ReceivingDeliveringParty1,
						com.tools20022.repository.codeset.UnmatchedReason8Code.CounterpartyCancelled, com.tools20022.repository.codeset.UnmatchedReason8Code.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.UnmatchedReason8Code.CurrencySettlementAmount, com.tools20022.repository.codeset.UnmatchedReason8Code.LetterOfGuarantee,
						com.tools20022.repository.codeset.UnmatchedReason8Code.NoMatchingStarted, com.tools20022.repository.codeset.UnmatchedReason8Code.SafekeepingAccount, com.tools20022.repository.codeset.UnmatchedReason8Code.TradeDate,
						com.tools20022.repository.codeset.UnmatchedReason8Code.MarketDeadlineMissed, com.tools20022.repository.codeset.UnmatchedReason8Code.TaxStatus,
						com.tools20022.repository.codeset.UnmatchedReason8Code.ReceivingDeliveringParty2, com.tools20022.repository.codeset.UnmatchedReason8Code.Other,
						com.tools20022.repository.codeset.UnmatchedReason8Code.MissingMarketSide, com.tools20022.repository.codeset.UnmatchedReason8Code.UnmatchedMarketSide,
						com.tools20022.repository.codeset.UnmatchedReason8Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.UnmatchedReason8Code.AccruedInterestAmount1,
						com.tools20022.repository.codeset.UnmatchedReason8Code.InvestorParty, com.tools20022.repository.codeset.UnmatchedReason8Code.PlaceOfListing);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(SettlementDate.getCodeName().get(), SettlementDate);
		codesByName.put(TransactionDirection.getCodeName().get(), TransactionDirection);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(SettlementAmount.getCodeName().get(), SettlementAmount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(FinancialInstrumentQuantity.getCodeName().get(), FinancialInstrumentQuantity);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SettlementTransaction.getCodeName().get(), SettlementTransaction);
		codesByName.put(SettlementSystemMethod.getCodeName().get(), SettlementSystemMethod);
		codesByName.put(FinancialInstrument.getCodeName().get(), FinancialInstrument);
		codesByName.put(NotRecognised.getCodeName().get(), NotRecognised);
		codesByName.put(CounterpartyTooLateForMatching.getCodeName().get(), CounterpartyTooLateForMatching);
		codesByName.put(PhysicalSettlement.getCodeName().get(), PhysicalSettlement);
		codesByName.put(CommonReference.getCodeName().get(), CommonReference);
		codesByName.put(PaymentCode.getCodeName().get(), PaymentCode);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(PossibleDuplicate.getCodeName().get(), PossibleDuplicate);
		codesByName.put(RegistrationDetails.getCodeName().get(), RegistrationDetails);
		codesByName.put(RTGSSystem.getCodeName().get(), RTGSSystem);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(CounterpartyCancelled.getCodeName().get(), CounterpartyCancelled);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(CurrencySettlementAmount.getCodeName().get(), CurrencySettlementAmount);
		codesByName.put(LetterOfGuarantee.getCodeName().get(), LetterOfGuarantee);
		codesByName.put(NoMatchingStarted.getCodeName().get(), NoMatchingStarted);
		codesByName.put(SafekeepingAccount.getCodeName().get(), SafekeepingAccount);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(TaxStatus.getCodeName().get(), TaxStatus);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(MissingMarketSide.getCodeName().get(), MissingMarketSide);
		codesByName.put(UnmatchedMarketSide.getCodeName().get(), UnmatchedMarketSide);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(AccruedInterestAmount1.getCodeName().get(), AccruedInterestAmount1);
		codesByName.put(InvestorParty.getCodeName().get(), InvestorParty);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
	}

	public static UnmatchedReason8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UnmatchedReason8Code[] values() {
		UnmatchedReason8Code[] values = new UnmatchedReason8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UnmatchedReason8Code> {
		@Override
		public UnmatchedReason8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UnmatchedReason8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}