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
import com.tools20022.repository.codeset.RejectionReason37Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the settlement instruction has a rejected status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#SafekeepingAccountRejection
 * RejectionReason37Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#QuantityRejection
 * RejectionReason37Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#AccountServicerDeadlineMissed
 * RejectionReason37Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#InvalidSecurity
 * RejectionReason37Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#MarketDeadlineMissed
 * RejectionReason37Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#CashAccount
 * RejectionReason37Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#DealPrice
 * RejectionReason37Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#TradeDate
 * RejectionReason37Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#PlaceOfTrade
 * RejectionReason37Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ImpossibleToUseTheRTGSSystemInstructed
 * RejectionReason37Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#SettlementAmountCurrencyRejection
 * RejectionReason37Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#PhysicalSettlementImpossible
 * RejectionReason37Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ReferenceRejection
 * RejectionReason37Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#SettlementAmountRejection
 * RejectionReason37Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#MinimumSettlementQuantity
 * RejectionReason37Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ProcessingBatchRejection
 * RejectionReason37Code.ProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#MultipleSettlementQuantity
 * RejectionReason37Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#TaxStatusRejection
 * RejectionReason37Code.TaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#SettlementSystemMethodRejection
 * RejectionReason37Code.SettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#CommonReferenceRejection
 * RejectionReason37Code.CommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#CorporateActionRejection
 * RejectionReason37Code.CorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ImpossibleCashSettlementSystem
 * RejectionReason37Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#SettlementDateRejection
 * RejectionReason37Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#SettlementTransactionRejection
 * RejectionReason37Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#LackOfStampDuty
 * RejectionReason37Code.LackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#PlaceOfSafekeeping
 * RejectionReason37Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#Other
 * RejectionReason37Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ReceivingDeliveringParty2
 * RejectionReason37Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ReceivingDeliveringParty1
 * RejectionReason37Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ReceivingDeliveringDepository
 * RejectionReason37Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#ReceivingDeliveringParty3
 * RejectionReason37Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#InvalidBalance
 * RejectionReason37Code.InvalidBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#InvalidLink
 * RejectionReason37Code.InvalidLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#InvalidLotNumber
 * RejectionReason37Code.InvalidLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#InvalidRule
 * RejectionReason37Code.InvalidRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#InvalidInvestorParty
 * RejectionReason37Code.InvalidInvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code#PlaceOfListing
 * RejectionReason37Code.PlaceOfListing}</li>
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
 * "RejectionReason37Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the settlement instruction has a rejected status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code
 * RejectionReason30Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason37Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#SafekeepingAccountRejection
	 * RejectionReason30Code.SafekeepingAccountRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code SafekeepingAccountRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			previousVersion_lazy = () -> RejectionReason30Code.SafekeepingAccountRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#QuantityRejection
	 * RejectionReason30Code.QuantityRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code QuantityRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			previousVersion_lazy = () -> RejectionReason30Code.QuantityRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#AccountServicerDeadlineMissed
	 * RejectionReason30Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code AccountServicerDeadlineMissed = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			previousVersion_lazy = () -> RejectionReason30Code.AccountServicerDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#InvalidSecurity
	 * RejectionReason30Code.InvalidSecurity}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code InvalidSecurity = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			previousVersion_lazy = () -> RejectionReason30Code.InvalidSecurity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#MarketDeadlineMissed
	 * RejectionReason30Code.MarketDeadlineMissed}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code MarketDeadlineMissed = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			previousVersion_lazy = () -> RejectionReason30Code.MarketDeadlineMissed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#CashAccount
	 * RejectionReason30Code.CashAccount}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code CashAccount = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			previousVersion_lazy = () -> RejectionReason30Code.CashAccount;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#DealPrice
	 * RejectionReason30Code.DealPrice}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code DealPrice = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			previousVersion_lazy = () -> RejectionReason30Code.DealPrice;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#TradeDate
	 * RejectionReason30Code.TradeDate}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code TradeDate = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			previousVersion_lazy = () -> RejectionReason30Code.TradeDate;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#PlaceOfTrade
	 * RejectionReason30Code.PlaceOfTrade}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code PlaceOfTrade = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			previousVersion_lazy = () -> RejectionReason30Code.PlaceOfTrade;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ImpossibleToUseTheRTGSSystemInstructed
	 * RejectionReason30Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ImpossibleToUseTheRTGSSystemInstructed = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			previousVersion_lazy = () -> RejectionReason30Code.ImpossibleToUseTheRTGSSystemInstructed;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#SettlementAmountCurrencyRejection
	 * RejectionReason30Code.SettlementAmountCurrencyRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code SettlementAmountCurrencyRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			previousVersion_lazy = () -> RejectionReason30Code.SettlementAmountCurrencyRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#PhysicalSettlementImpossible
	 * RejectionReason30Code.PhysicalSettlementImpossible}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code PhysicalSettlementImpossible = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			previousVersion_lazy = () -> RejectionReason30Code.PhysicalSettlementImpossible;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.PhysicalSettlementImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ReferenceRejection
	 * RejectionReason30Code.ReferenceRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ReferenceRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			previousVersion_lazy = () -> RejectionReason30Code.ReferenceRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#SettlementAmountRejection
	 * RejectionReason30Code.SettlementAmountRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code SettlementAmountRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			previousVersion_lazy = () -> RejectionReason30Code.SettlementAmountRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#MinimumSettlementQuantity
	 * RejectionReason30Code.MinimumSettlementQuantity}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code MinimumSettlementQuantity = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			previousVersion_lazy = () -> RejectionReason30Code.MinimumSettlementQuantity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ProcessingBatchRejection
	 * RejectionReason30Code.ProcessingBatchRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ProcessingBatchRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			previousVersion_lazy = () -> RejectionReason30Code.ProcessingBatchRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ProcessingBatchRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#MultipleSettlementQuantity
	 * RejectionReason30Code.MultipleSettlementQuantity}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code MultipleSettlementQuantity = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			previousVersion_lazy = () -> RejectionReason30Code.MultipleSettlementQuantity;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#TaxStatusRejection
	 * RejectionReason30Code.TaxStatusRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code TaxStatusRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			previousVersion_lazy = () -> RejectionReason30Code.TaxStatusRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.TaxStatusRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#SettlementSystemMethodRejection
	 * RejectionReason30Code.SettlementSystemMethodRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code SettlementSystemMethodRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			previousVersion_lazy = () -> RejectionReason30Code.SettlementSystemMethodRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementSystemMethodRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#CommonReferenceRejection
	 * RejectionReason30Code.CommonReferenceRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code CommonReferenceRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			previousVersion_lazy = () -> RejectionReason30Code.CommonReferenceRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.CommonReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#CorporateActionRejection
	 * RejectionReason30Code.CorporateActionRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code CorporateActionRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			previousVersion_lazy = () -> RejectionReason30Code.CorporateActionRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.CorporateActionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ImpossibleCashSettlementSystem
	 * RejectionReason30Code.ImpossibleCashSettlementSystem}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ImpossibleCashSettlementSystem = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			previousVersion_lazy = () -> RejectionReason30Code.ImpossibleCashSettlementSystem;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleCashSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#SettlementDateRejection
	 * RejectionReason30Code.SettlementDateRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code SettlementDateRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			previousVersion_lazy = () -> RejectionReason30Code.SettlementDateRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementDateRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#SettlementTransactionRejection
	 * RejectionReason30Code.SettlementTransactionRejection}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code SettlementTransactionRejection = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			previousVersion_lazy = () -> RejectionReason30Code.SettlementTransactionRejection;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementTransactionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#LackOfStampDuty
	 * RejectionReason30Code.LackOfStampDuty}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code LackOfStampDuty = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			previousVersion_lazy = () -> RejectionReason30Code.LackOfStampDuty;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.LackOfStampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#PlaceOfSafekeeping
	 * RejectionReason30Code.PlaceOfSafekeeping}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code PlaceOfSafekeeping = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			previousVersion_lazy = () -> RejectionReason30Code.PlaceOfSafekeeping;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#Other
	 * RejectionReason30Code.Other}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code Other = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> RejectionReason30Code.Other;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ReceivingDeliveringParty2
	 * RejectionReason30Code.ReceivingDeliveringParty2}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ReceivingDeliveringParty2 = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			previousVersion_lazy = () -> RejectionReason30Code.ReceivingDeliveringParty2;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ReceivingDeliveringParty1
	 * RejectionReason30Code.ReceivingDeliveringParty1}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ReceivingDeliveringParty1 = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			previousVersion_lazy = () -> RejectionReason30Code.ReceivingDeliveringParty1;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ReceivingDeliveringDepository
	 * RejectionReason30Code.ReceivingDeliveringDepository}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ReceivingDeliveringDepository = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			previousVersion_lazy = () -> RejectionReason30Code.ReceivingDeliveringDepository;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#ReceivingDeliveringParty3
	 * RejectionReason30Code.ReceivingDeliveringParty3}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code ReceivingDeliveringParty3 = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			previousVersion_lazy = () -> RejectionReason30Code.ReceivingDeliveringParty3;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#InvalidBalance
	 * RejectionReason30Code.InvalidBalance}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code InvalidBalance = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBalance";
			previousVersion_lazy = () -> RejectionReason30Code.InvalidBalance;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#InvalidLink
	 * RejectionReason30Code.InvalidLink}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code InvalidLink = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLink";
			previousVersion_lazy = () -> RejectionReason30Code.InvalidLink;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidLink.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#InvalidLotNumber
	 * RejectionReason30Code.InvalidLotNumber}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code InvalidLotNumber = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLotNumber";
			previousVersion_lazy = () -> RejectionReason30Code.InvalidLotNumber;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidLotNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason30Code#InvalidRule
	 * RejectionReason30Code.InvalidRule}</li>
	 * </ul>
	 */
	public static final RejectionReason37Code InvalidRule = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRule";
			previousVersion_lazy = () -> RejectionReason30Code.InvalidRule;
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidRule.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInvestorParty"</li>
	 * </ul>
	 */
	public static final RejectionReason37Code InvalidInvestorParty = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidInvestorParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason37Code
	 * RejectionReason37Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * </ul>
	 */
	public static final RejectionReason37Code PlaceOfListing = new RejectionReason37Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason37Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason37Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason37Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SAFE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason37Code";
				definition = "Specifies the reason why the settlement instruction has a rejected status.";
				previousVersion_lazy = () -> RejectionReason30Code.mmObject();
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason37Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReason37Code.QuantityRejection,
						com.tools20022.repository.codeset.RejectionReason37Code.AccountServicerDeadlineMissed, com.tools20022.repository.codeset.RejectionReason37Code.InvalidSecurity,
						com.tools20022.repository.codeset.RejectionReason37Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason37Code.CashAccount, com.tools20022.repository.codeset.RejectionReason37Code.DealPrice,
						com.tools20022.repository.codeset.RejectionReason37Code.TradeDate, com.tools20022.repository.codeset.RejectionReason37Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReason37Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RejectionReason37Code.SettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason37Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReason37Code.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReason37Code.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReason37Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason37Code.ProcessingBatchRejection, com.tools20022.repository.codeset.RejectionReason37Code.MultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason37Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReason37Code.SettlementSystemMethodRejection,
						com.tools20022.repository.codeset.RejectionReason37Code.CommonReferenceRejection, com.tools20022.repository.codeset.RejectionReason37Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReason37Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RejectionReason37Code.SettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReason37Code.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReason37Code.LackOfStampDuty,
						com.tools20022.repository.codeset.RejectionReason37Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RejectionReason37Code.Other,
						com.tools20022.repository.codeset.RejectionReason37Code.ReceivingDeliveringParty2, com.tools20022.repository.codeset.RejectionReason37Code.ReceivingDeliveringParty1,
						com.tools20022.repository.codeset.RejectionReason37Code.ReceivingDeliveringDepository, com.tools20022.repository.codeset.RejectionReason37Code.ReceivingDeliveringParty3,
						com.tools20022.repository.codeset.RejectionReason37Code.InvalidBalance, com.tools20022.repository.codeset.RejectionReason37Code.InvalidLink, com.tools20022.repository.codeset.RejectionReason37Code.InvalidLotNumber,
						com.tools20022.repository.codeset.RejectionReason37Code.InvalidRule, com.tools20022.repository.codeset.RejectionReason37Code.InvalidInvestorParty,
						com.tools20022.repository.codeset.RejectionReason37Code.PlaceOfListing);
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
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(InvalidBalance.getCodeName().get(), InvalidBalance);
		codesByName.put(InvalidLink.getCodeName().get(), InvalidLink);
		codesByName.put(InvalidLotNumber.getCodeName().get(), InvalidLotNumber);
		codesByName.put(InvalidRule.getCodeName().get(), InvalidRule);
		codesByName.put(InvalidInvestorParty.getCodeName().get(), InvalidInvestorParty);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
	}

	public static RejectionReason37Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason37Code[] values() {
		RejectionReason37Code[] values = new RejectionReason37Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason37Code> {
		@Override
		public RejectionReason37Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason37Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}