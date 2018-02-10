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
import com.tools20022.repository.codeset.RejectionReason26Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the securities financing instruction has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SafekeepingAccountRejection
 * RejectionReason26Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#QuantityRejection
 * RejectionReason26Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#AccountServicerDeadlineMissed
 * RejectionReason26Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#InvalidSecurity
 * RejectionReason26Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#MarketDeadlineMissed
 * RejectionReason26Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#CashAccount
 * RejectionReason26Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#DealPrice
 * RejectionReason26Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TradeDate
 * RejectionReason26Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PlaceOfTrade
 * RejectionReason26Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ImpossibleToUseTheRTGSSystemInstructed
 * RejectionReason26Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementAmountCurrencyRejection
 * RejectionReason26Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PhysicalSettlementImpossible
 * RejectionReason26Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReferenceRejection
 * RejectionReason26Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementAmountRejection
 * RejectionReason26Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#MinimumSettlementQuantity
 * RejectionReason26Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ProcessingBatchRejection
 * RejectionReason26Code.ProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#MultipleSettlementQuantity
 * RejectionReason26Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TaxStatusRejection
 * RejectionReason26Code.TaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementSystemMethodRejection
 * RejectionReason26Code.SettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#CommonReferenceRejection
 * RejectionReason26Code.CommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#CorporateActionRejection
 * RejectionReason26Code.CorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ImpossibleCashSettlementSystem
 * RejectionReason26Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementDateRejection
 * RejectionReason26Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementTransactionRejection
 * RejectionReason26Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#LackOfStampDuty
 * RejectionReason26Code.LackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TransactionCallDelay
 * RejectionReason26Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ForfeitAmount
 * RejectionReason26Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ClosingDateTimeRejection
 * RejectionReason26Code.ClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#VariableRateSupportRejection
 * RejectionReason26Code.VariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TerminationTransactionAmount
 * RejectionReason26Code.TerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#RepurchaseRate
 * RejectionReason26Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PremiumAmount
 * RejectionReason26Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#RepurchaseRateType
 * RejectionReason26Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SpreadRate
 * RejectionReason26Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringParty1
 * RejectionReason26Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PlaceOfSafekeeping
 * RejectionReason26Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringParty2
 * RejectionReason26Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringDepository
 * RejectionReason26Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#Other
 * RejectionReason26Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringParty3
 * RejectionReason26Code.ReceivingDeliveringParty3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"SAFE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason26Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the securities financing instruction has a rejected status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReason38Code
 * RejectionReason38Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason26Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SafekeepingAccountRejection
	 * RejectionReason38Code.SafekeepingAccountRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SafekeepingAccountRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SafekeepingAccountRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#QuantityRejection
	 * RejectionReason38Code.QuantityRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code QuantityRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.QuantityRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#AccountServicerDeadlineMissed
	 * RejectionReason38Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code AccountServicerDeadlineMissed = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.AccountServicerDeadlineMissed);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#InvalidSecurity
	 * RejectionReason38Code.InvalidSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code InvalidSecurity = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.InvalidSecurity);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#MarketDeadlineMissed
	 * RejectionReason38Code.MarketDeadlineMissed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code MarketDeadlineMissed = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.MarketDeadlineMissed);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#CashAccount
	 * RejectionReason38Code.CashAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code CashAccount = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.CashAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#DealPrice
	 * RejectionReason38Code.DealPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code DealPrice = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.DealPrice);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TradeDate
	 * RejectionReason38Code.TradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code TradeDate = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.TradeDate);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PlaceOfTrade
	 * RejectionReason38Code.PlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code PlaceOfTrade = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.PlaceOfTrade);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ImpossibleToUseTheRTGSSystemInstructed
	 * RejectionReason38Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ImpossibleToUseTheRTGSSystemInstructed = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ImpossibleToUseTheRTGSSystemInstructed);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementAmountCurrencyRejection
	 * RejectionReason38Code.SettlementAmountCurrencyRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SettlementAmountCurrencyRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SettlementAmountCurrencyRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PhysicalSettlementImpossible
	 * RejectionReason38Code.PhysicalSettlementImpossible}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code PhysicalSettlementImpossible = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.PhysicalSettlementImpossible);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.PhysicalSettlementImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReferenceRejection
	 * RejectionReason38Code.ReferenceRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ReferenceRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ReferenceRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementAmountRejection
	 * RejectionReason38Code.SettlementAmountRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SettlementAmountRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SettlementAmountRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#MinimumSettlementQuantity
	 * RejectionReason38Code.MinimumSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code MinimumSettlementQuantity = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.MinimumSettlementQuantity);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ProcessingBatchRejection
	 * RejectionReason38Code.ProcessingBatchRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ProcessingBatchRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ProcessingBatchRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ProcessingBatchRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#MultipleSettlementQuantity
	 * RejectionReason38Code.MultipleSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code MultipleSettlementQuantity = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.MultipleSettlementQuantity);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TaxStatusRejection
	 * RejectionReason38Code.TaxStatusRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code TaxStatusRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.TaxStatusRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.TaxStatusRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementSystemMethodRejection
	 * RejectionReason38Code.SettlementSystemMethodRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SettlementSystemMethodRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SettlementSystemMethodRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementSystemMethodRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#CommonReferenceRejection
	 * RejectionReason38Code.CommonReferenceRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code CommonReferenceRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.CommonReferenceRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.CommonReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#CorporateActionRejection
	 * RejectionReason38Code.CorporateActionRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code CorporateActionRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.CorporateActionRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.CorporateActionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ImpossibleCashSettlementSystem
	 * RejectionReason38Code.ImpossibleCashSettlementSystem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ImpossibleCashSettlementSystem = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ImpossibleCashSettlementSystem);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleCashSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementDateRejection
	 * RejectionReason38Code.SettlementDateRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SettlementDateRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SettlementDateRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementDateRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementTransactionRejection
	 * RejectionReason38Code.SettlementTransactionRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SettlementTransactionRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SettlementTransactionRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementTransactionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDuty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#LackOfStampDuty
	 * RejectionReason38Code.LackOfStampDuty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code LackOfStampDuty = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.LackOfStampDuty);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.LackOfStampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TransactionCallDelay
	 * RejectionReason38Code.TransactionCallDelay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code TransactionCallDelay = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.TransactionCallDelay);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.TransactionCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ForfeitAmount
	 * RejectionReason38Code.ForfeitAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ForfeitAmount = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ForfeitAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ForfeitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ClosingDateTimeRejection
	 * RejectionReason38Code.ClosingDateTimeRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ClosingDateTimeRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ClosingDateTimeRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ClosingDateTimeRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupportRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#VariableRateSupportRejection
	 * RejectionReason38Code.VariableRateSupportRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code VariableRateSupportRejection = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.VariableRateSupportRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.VariableRateSupportRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TerminationTransactionAmount
	 * RejectionReason38Code.TerminationTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code TerminationTransactionAmount = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.TerminationTransactionAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.TerminationTransactionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#RepurchaseRate
	 * RejectionReason38Code.RepurchaseRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code RepurchaseRate = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.RepurchaseRate);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PremiumAmount
	 * RejectionReason38Code.PremiumAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code PremiumAmount = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.PremiumAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.PremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#RepurchaseRateType
	 * RejectionReason38Code.RepurchaseRateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code RepurchaseRateType = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.RepurchaseRateType);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SpreadRate
	 * RejectionReason38Code.SpreadRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code SpreadRate = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.SpreadRate);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.SpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringParty1
	 * RejectionReason38Code.ReceivingDeliveringParty1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ReceivingDeliveringParty1 = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ReceivingDeliveringParty1);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PlaceOfSafekeeping
	 * RejectionReason38Code.PlaceOfSafekeeping}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code PlaceOfSafekeeping = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.PlaceOfSafekeeping);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringParty2
	 * RejectionReason38Code.ReceivingDeliveringParty2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ReceivingDeliveringParty2 = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ReceivingDeliveringParty2);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringDepository
	 * RejectionReason38Code.ReceivingDeliveringDepository}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ReceivingDeliveringDepository = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ReceivingDeliveringDepository);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#Other
	 * RejectionReason38Code.Other}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code Other = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.Other);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
	 * RejectionReason26Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringParty3
	 * RejectionReason38Code.ReceivingDeliveringParty3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason26Code ReceivingDeliveringParty3 = new RejectionReason26Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.ReceivingDeliveringParty3);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason26Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason26Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason26Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SAFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason26Code";
				definition = "Specifies the reason why the securities financing instruction has a rejected status.";
				nextVersions_lazy = () -> Arrays.asList(RejectionReason38Code.mmObject());
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason26Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason26Code.QuantityRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RejectionReason26Code.InvalidSecurity,
						com.tools20022.repository.codeset.RejectionReason26Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason26Code.CashAccount, com.tools20022.repository.codeset.RejectionReason26Code.DealPrice,
						com.tools20022.repository.codeset.RejectionReason26Code.TradeDate, com.tools20022.repository.codeset.RejectionReason26Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReason26Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RejectionReason26Code.SettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReason26Code.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReason26Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason26Code.ProcessingBatchRejection, com.tools20022.repository.codeset.RejectionReason26Code.MultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason26Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReason26Code.SettlementSystemMethodRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.CommonReferenceRejection, com.tools20022.repository.codeset.RejectionReason26Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RejectionReason26Code.SettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReason26Code.LackOfStampDuty,
						com.tools20022.repository.codeset.RejectionReason26Code.TransactionCallDelay, com.tools20022.repository.codeset.RejectionReason26Code.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReason26Code.ClosingDateTimeRejection, com.tools20022.repository.codeset.RejectionReason26Code.VariableRateSupportRejection,
						com.tools20022.repository.codeset.RejectionReason26Code.TerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReason26Code.RepurchaseRate,
						com.tools20022.repository.codeset.RejectionReason26Code.PremiumAmount, com.tools20022.repository.codeset.RejectionReason26Code.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReason26Code.SpreadRate,
						com.tools20022.repository.codeset.RejectionReason26Code.ReceivingDeliveringParty1, com.tools20022.repository.codeset.RejectionReason26Code.PlaceOfSafekeeping,
						com.tools20022.repository.codeset.RejectionReason26Code.ReceivingDeliveringParty2, com.tools20022.repository.codeset.RejectionReason26Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RejectionReason26Code.Other, com.tools20022.repository.codeset.RejectionReason26Code.ReceivingDeliveringParty3);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(ProcessingBatchRejection.getCodeName().get(), ProcessingBatchRejection);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(TaxStatusRejection.getCodeName().get(), TaxStatusRejection);
		codesByName.put(SettlementSystemMethodRejection.getCodeName().get(), SettlementSystemMethodRejection);
		codesByName.put(CommonReferenceRejection.getCodeName().get(), CommonReferenceRejection);
		codesByName.put(CorporateActionRejection.getCodeName().get(), CorporateActionRejection);
		codesByName.put(ImpossibleCashSettlementSystem.getCodeName().get(), ImpossibleCashSettlementSystem);
		codesByName.put(SettlementDateRejection.getCodeName().get(), SettlementDateRejection);
		codesByName.put(SettlementTransactionRejection.getCodeName().get(), SettlementTransactionRejection);
		codesByName.put(LackOfStampDuty.getCodeName().get(), LackOfStampDuty);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(ClosingDateTimeRejection.getCodeName().get(), ClosingDateTimeRejection);
		codesByName.put(VariableRateSupportRejection.getCodeName().get(), VariableRateSupportRejection);
		codesByName.put(TerminationTransactionAmount.getCodeName().get(), TerminationTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
	}

	public static RejectionReason26Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason26Code[] values() {
		RejectionReason26Code[] values = new RejectionReason26Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason26Code> {
		@Override
		public RejectionReason26Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason26Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}