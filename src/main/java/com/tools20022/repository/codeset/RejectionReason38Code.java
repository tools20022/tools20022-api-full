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
import com.tools20022.repository.codeset.RejectionReason38Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SafekeepingAccountRejection
 * RejectionReason38Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#QuantityRejection
 * RejectionReason38Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#AccountServicerDeadlineMissed
 * RejectionReason38Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#InvalidSecurity
 * RejectionReason38Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#MarketDeadlineMissed
 * RejectionReason38Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#CashAccount
 * RejectionReason38Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#DealPrice
 * RejectionReason38Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TradeDate
 * RejectionReason38Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PlaceOfTrade
 * RejectionReason38Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ImpossibleToUseTheRTGSSystemInstructed
 * RejectionReason38Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementAmountCurrencyRejection
 * RejectionReason38Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PhysicalSettlementImpossible
 * RejectionReason38Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReferenceRejection
 * RejectionReason38Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementAmountRejection
 * RejectionReason38Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#MinimumSettlementQuantity
 * RejectionReason38Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ProcessingBatchRejection
 * RejectionReason38Code.ProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#MultipleSettlementQuantity
 * RejectionReason38Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TaxStatusRejection
 * RejectionReason38Code.TaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementSystemMethodRejection
 * RejectionReason38Code.SettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#CommonReferenceRejection
 * RejectionReason38Code.CommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#CorporateActionRejection
 * RejectionReason38Code.CorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ImpossibleCashSettlementSystem
 * RejectionReason38Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementDateRejection
 * RejectionReason38Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SettlementTransactionRejection
 * RejectionReason38Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#LackOfStampDuty
 * RejectionReason38Code.LackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TransactionCallDelay
 * RejectionReason38Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ForfeitAmount
 * RejectionReason38Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ClosingDateTimeRejection
 * RejectionReason38Code.ClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#VariableRateSupportRejection
 * RejectionReason38Code.VariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#TerminationTransactionAmount
 * RejectionReason38Code.TerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#RepurchaseRate
 * RejectionReason38Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PremiumAmount
 * RejectionReason38Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#RepurchaseRateType
 * RejectionReason38Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#SpreadRate
 * RejectionReason38Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringParty1
 * RejectionReason38Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PlaceOfSafekeeping
 * RejectionReason38Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringParty2
 * RejectionReason38Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringDepository
 * RejectionReason38Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#Other
 * RejectionReason38Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#ReceivingDeliveringParty3
 * RejectionReason38Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#InvalidInvestorParty
 * RejectionReason38Code.InvalidInvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code#PlaceOfListing
 * RejectionReason38Code.PlaceOfListing}</li>
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
 * "RejectionReason38Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the securities financing instruction has a rejected status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code
 * RejectionReason26Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason38Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SafekeepingAccountRejection
	 * RejectionReason26Code.SafekeepingAccountRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SafekeepingAccountRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			previousVersion_lazy = () -> RejectionReason26Code.SafekeepingAccountRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#QuantityRejection
	 * RejectionReason26Code.QuantityRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code QuantityRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			previousVersion_lazy = () -> RejectionReason26Code.QuantityRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#AccountServicerDeadlineMissed
	 * RejectionReason26Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code AccountServicerDeadlineMissed = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			previousVersion_lazy = () -> RejectionReason26Code.AccountServicerDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#InvalidSecurity
	 * RejectionReason26Code.InvalidSecurity}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code InvalidSecurity = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			previousVersion_lazy = () -> RejectionReason26Code.InvalidSecurity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#MarketDeadlineMissed
	 * RejectionReason26Code.MarketDeadlineMissed}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code MarketDeadlineMissed = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			previousVersion_lazy = () -> RejectionReason26Code.MarketDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#CashAccount
	 * RejectionReason26Code.CashAccount}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code CashAccount = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			previousVersion_lazy = () -> RejectionReason26Code.CashAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#DealPrice
	 * RejectionReason26Code.DealPrice}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code DealPrice = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			previousVersion_lazy = () -> RejectionReason26Code.DealPrice;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TradeDate
	 * RejectionReason26Code.TradeDate}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code TradeDate = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			previousVersion_lazy = () -> RejectionReason26Code.TradeDate;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PlaceOfTrade
	 * RejectionReason26Code.PlaceOfTrade}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code PlaceOfTrade = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			previousVersion_lazy = () -> RejectionReason26Code.PlaceOfTrade;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ImpossibleToUseTheRTGSSystemInstructed
	 * RejectionReason26Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ImpossibleToUseTheRTGSSystemInstructed = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			previousVersion_lazy = () -> RejectionReason26Code.ImpossibleToUseTheRTGSSystemInstructed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementAmountCurrencyRejection
	 * RejectionReason26Code.SettlementAmountCurrencyRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SettlementAmountCurrencyRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			previousVersion_lazy = () -> RejectionReason26Code.SettlementAmountCurrencyRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PhysicalSettlementImpossible
	 * RejectionReason26Code.PhysicalSettlementImpossible}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code PhysicalSettlementImpossible = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			previousVersion_lazy = () -> RejectionReason26Code.PhysicalSettlementImpossible;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.PhysicalSettlementImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReferenceRejection
	 * RejectionReason26Code.ReferenceRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ReferenceRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			previousVersion_lazy = () -> RejectionReason26Code.ReferenceRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementAmountRejection
	 * RejectionReason26Code.SettlementAmountRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SettlementAmountRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			previousVersion_lazy = () -> RejectionReason26Code.SettlementAmountRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#MinimumSettlementQuantity
	 * RejectionReason26Code.MinimumSettlementQuantity}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code MinimumSettlementQuantity = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			previousVersion_lazy = () -> RejectionReason26Code.MinimumSettlementQuantity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ProcessingBatchRejection
	 * RejectionReason26Code.ProcessingBatchRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ProcessingBatchRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			previousVersion_lazy = () -> RejectionReason26Code.ProcessingBatchRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ProcessingBatchRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#MultipleSettlementQuantity
	 * RejectionReason26Code.MultipleSettlementQuantity}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code MultipleSettlementQuantity = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			previousVersion_lazy = () -> RejectionReason26Code.MultipleSettlementQuantity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TaxStatusRejection
	 * RejectionReason26Code.TaxStatusRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code TaxStatusRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			previousVersion_lazy = () -> RejectionReason26Code.TaxStatusRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.TaxStatusRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementSystemMethodRejection
	 * RejectionReason26Code.SettlementSystemMethodRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SettlementSystemMethodRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			previousVersion_lazy = () -> RejectionReason26Code.SettlementSystemMethodRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementSystemMethodRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#CommonReferenceRejection
	 * RejectionReason26Code.CommonReferenceRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code CommonReferenceRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			previousVersion_lazy = () -> RejectionReason26Code.CommonReferenceRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.CommonReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#CorporateActionRejection
	 * RejectionReason26Code.CorporateActionRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code CorporateActionRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			previousVersion_lazy = () -> RejectionReason26Code.CorporateActionRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.CorporateActionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ImpossibleCashSettlementSystem
	 * RejectionReason26Code.ImpossibleCashSettlementSystem}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ImpossibleCashSettlementSystem = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			previousVersion_lazy = () -> RejectionReason26Code.ImpossibleCashSettlementSystem;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleCashSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementDateRejection
	 * RejectionReason26Code.SettlementDateRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SettlementDateRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			previousVersion_lazy = () -> RejectionReason26Code.SettlementDateRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementDateRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SettlementTransactionRejection
	 * RejectionReason26Code.SettlementTransactionRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SettlementTransactionRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			previousVersion_lazy = () -> RejectionReason26Code.SettlementTransactionRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementTransactionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#LackOfStampDuty
	 * RejectionReason26Code.LackOfStampDuty}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code LackOfStampDuty = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			previousVersion_lazy = () -> RejectionReason26Code.LackOfStampDuty;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.LackOfStampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TransactionCallDelay
	 * RejectionReason26Code.TransactionCallDelay}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code TransactionCallDelay = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			previousVersion_lazy = () -> RejectionReason26Code.TransactionCallDelay;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.TransactionCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ForfeitAmount
	 * RejectionReason26Code.ForfeitAmount}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ForfeitAmount = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			previousVersion_lazy = () -> RejectionReason26Code.ForfeitAmount;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ForfeitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ClosingDateTimeRejection
	 * RejectionReason26Code.ClosingDateTimeRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ClosingDateTimeRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			previousVersion_lazy = () -> RejectionReason26Code.ClosingDateTimeRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ClosingDateTimeRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupportRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#VariableRateSupportRejection
	 * RejectionReason26Code.VariableRateSupportRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code VariableRateSupportRejection = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			previousVersion_lazy = () -> RejectionReason26Code.VariableRateSupportRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.VariableRateSupportRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#TerminationTransactionAmount
	 * RejectionReason26Code.TerminationTransactionAmount}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code TerminationTransactionAmount = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			previousVersion_lazy = () -> RejectionReason26Code.TerminationTransactionAmount;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.TerminationTransactionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#RepurchaseRate
	 * RejectionReason26Code.RepurchaseRate}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code RepurchaseRate = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			previousVersion_lazy = () -> RejectionReason26Code.RepurchaseRate;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PremiumAmount
	 * RejectionReason26Code.PremiumAmount}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code PremiumAmount = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			previousVersion_lazy = () -> RejectionReason26Code.PremiumAmount;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.PremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#RepurchaseRateType
	 * RejectionReason26Code.RepurchaseRateType}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code RepurchaseRateType = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			previousVersion_lazy = () -> RejectionReason26Code.RepurchaseRateType;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#SpreadRate
	 * RejectionReason26Code.SpreadRate}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code SpreadRate = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			previousVersion_lazy = () -> RejectionReason26Code.SpreadRate;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.SpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringParty1
	 * RejectionReason26Code.ReceivingDeliveringParty1}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ReceivingDeliveringParty1 = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			previousVersion_lazy = () -> RejectionReason26Code.ReceivingDeliveringParty1;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#PlaceOfSafekeeping
	 * RejectionReason26Code.PlaceOfSafekeeping}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code PlaceOfSafekeeping = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			previousVersion_lazy = () -> RejectionReason26Code.PlaceOfSafekeeping;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringParty2
	 * RejectionReason26Code.ReceivingDeliveringParty2}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ReceivingDeliveringParty2 = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			previousVersion_lazy = () -> RejectionReason26Code.ReceivingDeliveringParty2;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringDepository
	 * RejectionReason26Code.ReceivingDeliveringDepository}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ReceivingDeliveringDepository = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			previousVersion_lazy = () -> RejectionReason26Code.ReceivingDeliveringDepository;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#Other
	 * RejectionReason26Code.Other}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code Other = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> RejectionReason26Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason26Code#ReceivingDeliveringParty3
	 * RejectionReason26Code.ReceivingDeliveringParty3}</li>
	 * </ul>
	 */
	public static final RejectionReason38Code ReceivingDeliveringParty3 = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			previousVersion_lazy = () -> RejectionReason26Code.ReceivingDeliveringParty3;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInvestorParty"</li>
	 * </ul>
	 */
	public static final RejectionReason38Code InvalidInvestorParty = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidInvestorParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason38Code
	 * RejectionReason38Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * </ul>
	 */
	public static final RejectionReason38Code PlaceOfListing = new RejectionReason38Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason38Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason38Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason38Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SAFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason38Code";
				definition = "Specifies the reason why the securities financing instruction has a rejected status.";
				previousVersion_lazy = () -> RejectionReason26Code.mmObject();
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason38Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason38Code.QuantityRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RejectionReason38Code.InvalidSecurity,
						com.tools20022.repository.codeset.RejectionReason38Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason38Code.CashAccount, com.tools20022.repository.codeset.RejectionReason38Code.DealPrice,
						com.tools20022.repository.codeset.RejectionReason38Code.TradeDate, com.tools20022.repository.codeset.RejectionReason38Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReason38Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RejectionReason38Code.SettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReason38Code.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReason38Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason38Code.ProcessingBatchRejection, com.tools20022.repository.codeset.RejectionReason38Code.MultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason38Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReason38Code.SettlementSystemMethodRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.CommonReferenceRejection, com.tools20022.repository.codeset.RejectionReason38Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RejectionReason38Code.SettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReason38Code.LackOfStampDuty,
						com.tools20022.repository.codeset.RejectionReason38Code.TransactionCallDelay, com.tools20022.repository.codeset.RejectionReason38Code.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReason38Code.ClosingDateTimeRejection, com.tools20022.repository.codeset.RejectionReason38Code.VariableRateSupportRejection,
						com.tools20022.repository.codeset.RejectionReason38Code.TerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReason38Code.RepurchaseRate,
						com.tools20022.repository.codeset.RejectionReason38Code.PremiumAmount, com.tools20022.repository.codeset.RejectionReason38Code.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReason38Code.SpreadRate,
						com.tools20022.repository.codeset.RejectionReason38Code.ReceivingDeliveringParty1, com.tools20022.repository.codeset.RejectionReason38Code.PlaceOfSafekeeping,
						com.tools20022.repository.codeset.RejectionReason38Code.ReceivingDeliveringParty2, com.tools20022.repository.codeset.RejectionReason38Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RejectionReason38Code.Other, com.tools20022.repository.codeset.RejectionReason38Code.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.RejectionReason38Code.InvalidInvestorParty, com.tools20022.repository.codeset.RejectionReason38Code.PlaceOfListing);
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
		codesByName.put(InvalidInvestorParty.getCodeName().get(), InvalidInvestorParty);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
	}

	public static RejectionReason38Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason38Code[] values() {
		RejectionReason38Code[] values = new RejectionReason38Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason38Code> {
		@Override
		public RejectionReason38Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason38Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}