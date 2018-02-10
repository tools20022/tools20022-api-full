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
import com.tools20022.repository.codeset.RejectionReason16Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InvalidReference
 * RejectionReason16Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SafekeepingAccountRejection
 * RejectionReason16Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#QuantityRejection
 * RejectionReason16Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#AccountServicerDeadlineMissed
 * RejectionReason16Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ImpossibleToUseTheRTGSSystemInstructed
 * RejectionReason16Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SettlementAmountCurrencyRejection
 * RejectionReason16Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InvalidSecurity
 * RejectionReason16Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#AddressDetailsRejection
 * RejectionReason16Code.AddressDetailsRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InstructionIrrevocable
 * RejectionReason16Code.InstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#OptionCancelled
 * RejectionReason16Code.OptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#OptionInactive
 * RejectionReason16Code.OptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InvalidForTaxAuthorities
 * RejectionReason16Code.InvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#RefusedByTaxAuthorities
 * RejectionReason16Code.RefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#PhysicalSettlementImpossible
 * RejectionReason16Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ReferenceRejection
 * RejectionReason16Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#LackofSecurities
 * RejectionReason16Code.LackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#MarketDeadlineMissed
 * RejectionReason16Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#Mismatch
 * RejectionReason16Code.Mismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#OptionNumberRejection
 * RejectionReason16Code.OptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SettlementAmountRejection
 * RejectionReason16Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InvalidOptionType
 * RejectionReason16Code.InvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#RejectedSinceAlreadyCancelled
 * RejectionReason16Code.RejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#RejectedSinceInProgress
 * RejectionReason16Code.RejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#UnrecognisedIdentification
 * RejectionReason16Code.UnrecognisedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#MissingStatutes
 * RejectionReason16Code.MissingStatutes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#NotStampedOrSigned
 * RejectionReason16Code.NotStampedOrSigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InvalidSignature
 * RejectionReason16Code.InvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ShareholderNumberRejection
 * RejectionReason16Code.ShareholderNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#MinimumSettlementQuantity
 * RejectionReason16Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#NoMatch
 * RejectionReason16Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#MissingLegalPower
 * RejectionReason16Code.MissingLegalPower}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ProcessingBatchRejection
 * RejectionReason16Code.ProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#TransactionCallDelay
 * RejectionReason16Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#CashAccount
 * RejectionReason16Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#DealPrice
 * RejectionReason16Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#TypeOfOwnershipRejection
 * RejectionReason16Code.TypeOfOwnershipRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#NotFoundRejection
 * RejectionReason16Code.NotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#MultipleSettlementQuantity
 * RejectionReason16Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#WrongRegistrationRequest
 * RejectionReason16Code.WrongRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#TaxStatusRejection
 * RejectionReason16Code.TaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#TerminationTransactionAmount
 * RejectionReason16Code.TerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#RepurchaseRate
 * RejectionReason16Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#PremiumAmount
 * RejectionReason16Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#DisagreementInRegistrationReason
 * RejectionReason16Code.DisagreementInRegistrationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#MissingRegistrationRequest
 * RejectionReason16Code.MissingRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#RepurchaseRateType
 * RejectionReason16Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SpreadRate
 * RejectionReason16Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SettlementSystemMethodRejection
 * RejectionReason16Code.SettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#TradeDate
 * RejectionReason16Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#CommonReferenceRejection
 * RejectionReason16Code.CommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#PlaceOfTrade
 * RejectionReason16Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#NarrativeInformationRejection
 * RejectionReason16Code.NarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#InsufficientCollateral
 * RejectionReason16Code.InsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#BusinessPartnerNumberRejection
 * RejectionReason16Code.BusinessPartnerNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#BankReferenceNumberRejection
 * RejectionReason16Code.BankReferenceNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#TypeOfOrderRejection
 * RejectionReason16Code.TypeOfOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#CorporateActionRejection
 * RejectionReason16Code.CorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ImpossibleCashSettlementSystem
 * RejectionReason16Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#CommercializationContractRejection
 * RejectionReason16Code.CommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ConcentrationLimitExceeded
 * RejectionReason16Code.ConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#UnknownDealExposure
 * RejectionReason16Code.UnknownDealExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SettlementDateRejection
 * RejectionReason16Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#DisagreeWithCallAmount
 * RejectionReason16Code.DisagreeWithCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#DisagreeWithExposureAmount
 * RejectionReason16Code.DisagreeWithExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#RegistrationRequestDataAndOrderRejection
 * RejectionReason16Code.RegistrationRequestDataAndOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#FeeCommissionRejection
 * RejectionReason16Code.FeeCommissionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#SettlementTransactionRejection
 * RejectionReason16Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ClosingDateTimeRejection
 * RejectionReason16Code.ClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#VariableRateSupportRejection
 * RejectionReason16Code.VariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#PlaceOfSafekeeping
 * RejectionReason16Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#LackOfStampDuty
 * RejectionReason16Code.LackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ForfeitAmount
 * RejectionReason16Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ReceivingDeliveringParty2
 * RejectionReason16Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ReceivingDeliveringParty1
 * RejectionReason16Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ReceivingDeliveringDepository
 * RejectionReason16Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#Other
 * RejectionReason16Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#ReceivingDeliveringParty3
 * RejectionReason16Code.ReceivingDeliveringParty3}</li>
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
 * <li>"ULNK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason16Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReason39Code
 * RejectionReason39Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReason16Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InvalidReference
	 * RejectionReason39Code.InvalidReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InvalidReference = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InvalidReference);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidReference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SafekeepingAccountRejection
	 * RejectionReason39Code.SafekeepingAccountRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SafekeepingAccountRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SafekeepingAccountRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SafekeepingAccountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#QuantityRejection
	 * RejectionReason39Code.QuantityRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code QuantityRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.QuantityRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.QuantityRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#AccountServicerDeadlineMissed
	 * RejectionReason39Code.AccountServicerDeadlineMissed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code AccountServicerDeadlineMissed = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.AccountServicerDeadlineMissed);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.AccountServicerDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ImpossibleToUseTheRTGSSystemInstructed
	 * RejectionReason39Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ImpossibleToUseTheRTGSSystemInstructed = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ImpossibleToUseTheRTGSSystemInstructed);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleToUseTheRTGSSystemInstructed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SettlementAmountCurrencyRejection
	 * RejectionReason39Code.SettlementAmountCurrencyRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SettlementAmountCurrencyRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SettlementAmountCurrencyRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountCurrencyRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InvalidSecurity
	 * RejectionReason39Code.InvalidSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InvalidSecurity = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InvalidSecurity);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSecurity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressDetailsRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#AddressDetailsRejection
	 * RejectionReason39Code.AddressDetailsRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code AddressDetailsRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressDetailsRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.AddressDetailsRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.AddressDetailsRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIrrevocable"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InstructionIrrevocable
	 * RejectionReason39Code.InstructionIrrevocable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InstructionIrrevocable = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InstructionIrrevocable);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InstructionIrrevocable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionCancelled"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#OptionCancelled
	 * RejectionReason39Code.OptionCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code OptionCancelled = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.OptionCancelled);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.OptionCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionInactive"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#OptionInactive
	 * RejectionReason39Code.OptionInactive}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code OptionInactive = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.OptionInactive);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.OptionInactive.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InvalidForTaxAuthorities
	 * RejectionReason39Code.InvalidForTaxAuthorities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InvalidForTaxAuthorities = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InvalidForTaxAuthorities);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidForTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedByTaxAuthorities"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#RefusedByTaxAuthorities
	 * RejectionReason39Code.RefusedByTaxAuthorities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code RefusedByTaxAuthorities = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.RefusedByTaxAuthorities);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.RefusedByTaxAuthorities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#PhysicalSettlementImpossible
	 * RejectionReason39Code.PhysicalSettlementImpossible}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code PhysicalSettlementImpossible = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.PhysicalSettlementImpossible);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.PhysicalSettlementImpossible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ReferenceRejection
	 * RejectionReason39Code.ReferenceRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ReferenceRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ReferenceRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#LackofSecurities
	 * RejectionReason39Code.LackofSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code LackofSecurities = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.LackofSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.LackofSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#MarketDeadlineMissed
	 * RejectionReason39Code.MarketDeadlineMissed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code MarketDeadlineMissed = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.MarketDeadlineMissed);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.MarketDeadlineMissed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#Mismatch
	 * RejectionReason39Code.Mismatch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code Mismatch = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.Mismatch);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.Mismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#OptionNumberRejection
	 * RejectionReason39Code.OptionNumberRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code OptionNumberRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.OptionNumberRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.OptionNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SettlementAmountRejection
	 * RejectionReason39Code.SettlementAmountRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SettlementAmountRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SettlementAmountRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementAmountRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InvalidOptionType
	 * RejectionReason39Code.InvalidOptionType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InvalidOptionType = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InvalidOptionType);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidOptionType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#RejectedSinceAlreadyCancelled
	 * RejectionReason39Code.RejectedSinceAlreadyCancelled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code RejectedSinceAlreadyCancelled = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.RejectedSinceAlreadyCancelled);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.RejectedSinceAlreadyCancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#RejectedSinceInProgress
	 * RejectionReason39Code.RejectedSinceInProgress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code RejectedSinceInProgress = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.RejectedSinceInProgress);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.RejectedSinceInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIdentification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#UnrecognisedIdentification
	 * RejectionReason39Code.UnrecognisedIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code UnrecognisedIdentification = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.UnrecognisedIdentification);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.UnrecognisedIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingStatutes"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#MissingStatutes
	 * RejectionReason39Code.MissingStatutes}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code MissingStatutes = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingStatutes";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.MissingStatutes);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.MissingStatutes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStampedOrSigned"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#NotStampedOrSigned
	 * RejectionReason39Code.NotStampedOrSigned}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code NotStampedOrSigned = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStampedOrSigned";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.NotStampedOrSigned);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.NotStampedOrSigned.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InvalidSignature
	 * RejectionReason39Code.InvalidSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InvalidSignature = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InvalidSignature);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InvalidSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareholderNumberRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ShareholderNumberRejection
	 * RejectionReason39Code.ShareholderNumberRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ShareholderNumberRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareholderNumberRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ShareholderNumberRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ShareholderNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#MinimumSettlementQuantity
	 * RejectionReason39Code.MinimumSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code MinimumSettlementQuantity = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.MinimumSettlementQuantity);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.MinimumSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#NoMatch
	 * RejectionReason39Code.NoMatch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code NoMatch = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.NoMatch);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.NoMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingLegalPower"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#MissingLegalPower
	 * RejectionReason39Code.MissingLegalPower}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code MissingLegalPower = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingLegalPower";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.MissingLegalPower);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.MissingLegalPower.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ProcessingBatchRejection
	 * RejectionReason39Code.ProcessingBatchRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ProcessingBatchRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ProcessingBatchRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ProcessingBatchRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#TransactionCallDelay
	 * RejectionReason39Code.TransactionCallDelay}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code TransactionCallDelay = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.TransactionCallDelay);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.TransactionCallDelay.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#CashAccount
	 * RejectionReason39Code.CashAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code CashAccount = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.CashAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.CashAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#DealPrice
	 * RejectionReason39Code.DealPrice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code DealPrice = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.DealPrice);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.DealPrice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOwnershipRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#TypeOfOwnershipRejection
	 * RejectionReason39Code.TypeOfOwnershipRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code TypeOfOwnershipRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOwnershipRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.TypeOfOwnershipRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.TypeOfOwnershipRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#NotFoundRejection
	 * RejectionReason39Code.NotFoundRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code NotFoundRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.NotFoundRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.NotFoundRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#MultipleSettlementQuantity
	 * RejectionReason39Code.MultipleSettlementQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code MultipleSettlementQuantity = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.MultipleSettlementQuantity);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.MultipleSettlementQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRegistrationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#WrongRegistrationRequest
	 * RejectionReason39Code.WrongRegistrationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code WrongRegistrationRequest = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRegistrationRequest";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.WrongRegistrationRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.WrongRegistrationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#TaxStatusRejection
	 * RejectionReason39Code.TaxStatusRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code TaxStatusRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.TaxStatusRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.TaxStatusRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#TerminationTransactionAmount
	 * RejectionReason39Code.TerminationTransactionAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code TerminationTransactionAmount = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.TerminationTransactionAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.TerminationTransactionAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#RepurchaseRate
	 * RejectionReason39Code.RepurchaseRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code RepurchaseRate = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.RepurchaseRate);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.RepurchaseRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#PremiumAmount
	 * RejectionReason39Code.PremiumAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code PremiumAmount = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.PremiumAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.PremiumAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementInRegistrationReason"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#DisagreementInRegistrationReason
	 * RejectionReason39Code.DisagreementInRegistrationReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code DisagreementInRegistrationReason = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementInRegistrationReason";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.DisagreementInRegistrationReason);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.DisagreementInRegistrationReason.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRegistrationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#MissingRegistrationRequest
	 * RejectionReason39Code.MissingRegistrationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code MissingRegistrationRequest = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRegistrationRequest";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.MissingRegistrationRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.MissingRegistrationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#RepurchaseRateType
	 * RejectionReason39Code.RepurchaseRateType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code RepurchaseRateType = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.RepurchaseRateType);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.RepurchaseRateType.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SpreadRate
	 * RejectionReason39Code.SpreadRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SpreadRate = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SpreadRate);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SpreadRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SettlementSystemMethodRejection
	 * RejectionReason39Code.SettlementSystemMethodRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SettlementSystemMethodRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SettlementSystemMethodRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementSystemMethodRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#TradeDate
	 * RejectionReason39Code.TradeDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code TradeDate = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.TradeDate);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.TradeDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#CommonReferenceRejection
	 * RejectionReason39Code.CommonReferenceRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code CommonReferenceRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.CommonReferenceRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.CommonReferenceRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#PlaceOfTrade
	 * RejectionReason39Code.PlaceOfTrade}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code PlaceOfTrade = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.PlaceOfTrade);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfTrade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#NarrativeInformationRejection
	 * RejectionReason39Code.NarrativeInformationRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code NarrativeInformationRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.NarrativeInformationRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.NarrativeInformationRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCollateral"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#InsufficientCollateral
	 * RejectionReason39Code.InsufficientCollateral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code InsufficientCollateral = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.InsufficientCollateral);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.InsufficientCollateral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessPartnerNumberRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#BusinessPartnerNumberRejection
	 * RejectionReason39Code.BusinessPartnerNumberRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code BusinessPartnerNumberRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessPartnerNumberRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.BusinessPartnerNumberRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.BusinessPartnerNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReferenceNumberRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#BankReferenceNumberRejection
	 * RejectionReason39Code.BankReferenceNumberRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code BankReferenceNumberRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReferenceNumberRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.BankReferenceNumberRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.BankReferenceNumberRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#TypeOfOrderRejection
	 * RejectionReason39Code.TypeOfOrderRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code TypeOfOrderRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.TypeOfOrderRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.TypeOfOrderRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#CorporateActionRejection
	 * RejectionReason39Code.CorporateActionRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code CorporateActionRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.CorporateActionRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.CorporateActionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ImpossibleCashSettlementSystem
	 * RejectionReason39Code.ImpossibleCashSettlementSystem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ImpossibleCashSettlementSystem = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ImpossibleCashSettlementSystem);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ImpossibleCashSettlementSystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#CommercializationContractRejection
	 * RejectionReason39Code.CommercializationContractRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code CommercializationContractRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.CommercializationContractRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.CommercializationContractRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcentrationLimitExceeded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ConcentrationLimitExceeded
	 * RejectionReason39Code.ConcentrationLimitExceeded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ConcentrationLimitExceeded = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ConcentrationLimitExceeded);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ConcentrationLimitExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownDealExposure"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#UnknownDealExposure
	 * RejectionReason39Code.UnknownDealExposure}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code UnknownDealExposure = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownDealExposure";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.UnknownDealExposure);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.UnknownDealExposure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SettlementDateRejection
	 * RejectionReason39Code.SettlementDateRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SettlementDateRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SettlementDateRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementDateRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithCallAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#DisagreeWithCallAmount
	 * RejectionReason39Code.DisagreeWithCallAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code DisagreeWithCallAmount = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithCallAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.DisagreeWithCallAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.DisagreeWithCallAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithExposureAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#DisagreeWithExposureAmount
	 * RejectionReason39Code.DisagreeWithExposureAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code DisagreeWithExposureAmount = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithExposureAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.DisagreeWithExposureAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.DisagreeWithExposureAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationRequestDataAndOrderRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#RegistrationRequestDataAndOrderRejection
	 * RejectionReason39Code.RegistrationRequestDataAndOrderRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code RegistrationRequestDataAndOrderRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.RegistrationRequestDataAndOrderRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.RegistrationRequestDataAndOrderRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#FeeCommissionRejection
	 * RejectionReason39Code.FeeCommissionRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code FeeCommissionRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.FeeCommissionRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.FeeCommissionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#SettlementTransactionRejection
	 * RejectionReason39Code.SettlementTransactionRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code SettlementTransactionRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.SettlementTransactionRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.SettlementTransactionRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ClosingDateTimeRejection
	 * RejectionReason39Code.ClosingDateTimeRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ClosingDateTimeRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ClosingDateTimeRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ClosingDateTimeRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#VariableRateSupportRejection
	 * RejectionReason39Code.VariableRateSupportRejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code VariableRateSupportRejection = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.VariableRateSupportRejection);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.VariableRateSupportRejection.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#PlaceOfSafekeeping
	 * RejectionReason39Code.PlaceOfSafekeeping}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code PlaceOfSafekeeping = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.PlaceOfSafekeeping);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.PlaceOfSafekeeping.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#LackOfStampDuty
	 * RejectionReason39Code.LackOfStampDuty}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code LackOfStampDuty = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.LackOfStampDuty);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.LackOfStampDuty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ForfeitAmount
	 * RejectionReason39Code.ForfeitAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ForfeitAmount = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ForfeitAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ForfeitAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ReceivingDeliveringParty2
	 * RejectionReason39Code.ReceivingDeliveringParty2}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ReceivingDeliveringParty2 = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ReceivingDeliveringParty2);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty2.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ReceivingDeliveringParty1
	 * RejectionReason39Code.ReceivingDeliveringParty1}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ReceivingDeliveringParty1 = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ReceivingDeliveringParty1);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty1.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ReceivingDeliveringDepository
	 * RejectionReason39Code.ReceivingDeliveringDepository}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ReceivingDeliveringDepository = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ReceivingDeliveringDepository);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#Other
	 * RejectionReason39Code.Other}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code Other = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.Other);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
	 * RejectionReason16Code}</li>
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
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#ReceivingDeliveringParty3
	 * RejectionReason39Code.ReceivingDeliveringParty3}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final RejectionReason16Code ReceivingDeliveringParty3 = new RejectionReason16Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.ReceivingDeliveringParty3);
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmObject();
			codeName = RejectionReasonV2Code.ReceivingDeliveringParty3.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, RejectionReason16Code> codesByName = new LinkedHashMap<>();

	protected RejectionReason16Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ULNK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason16Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				nextVersions_lazy = () -> Arrays.asList(RejectionReason39Code.mmObject());
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason16Code.InvalidReference, com.tools20022.repository.codeset.RejectionReason16Code.SafekeepingAccountRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReason16Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReason16Code.ImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RejectionReason16Code.SettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.InvalidSecurity, com.tools20022.repository.codeset.RejectionReason16Code.AddressDetailsRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.InstructionIrrevocable, com.tools20022.repository.codeset.RejectionReason16Code.OptionCancelled,
						com.tools20022.repository.codeset.RejectionReason16Code.OptionInactive, com.tools20022.repository.codeset.RejectionReason16Code.InvalidForTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReason16Code.RefusedByTaxAuthorities, com.tools20022.repository.codeset.RejectionReason16Code.PhysicalSettlementImpossible,
						com.tools20022.repository.codeset.RejectionReason16Code.ReferenceRejection, com.tools20022.repository.codeset.RejectionReason16Code.LackofSecurities,
						com.tools20022.repository.codeset.RejectionReason16Code.MarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason16Code.Mismatch,
						com.tools20022.repository.codeset.RejectionReason16Code.OptionNumberRejection, com.tools20022.repository.codeset.RejectionReason16Code.SettlementAmountRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.InvalidOptionType, com.tools20022.repository.codeset.RejectionReason16Code.RejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReason16Code.RejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReason16Code.UnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReason16Code.MissingStatutes, com.tools20022.repository.codeset.RejectionReason16Code.NotStampedOrSigned,
						com.tools20022.repository.codeset.RejectionReason16Code.InvalidSignature, com.tools20022.repository.codeset.RejectionReason16Code.ShareholderNumberRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.MinimumSettlementQuantity, com.tools20022.repository.codeset.RejectionReason16Code.NoMatch,
						com.tools20022.repository.codeset.RejectionReason16Code.MissingLegalPower, com.tools20022.repository.codeset.RejectionReason16Code.ProcessingBatchRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.TransactionCallDelay, com.tools20022.repository.codeset.RejectionReason16Code.CashAccount, com.tools20022.repository.codeset.RejectionReason16Code.DealPrice,
						com.tools20022.repository.codeset.RejectionReason16Code.TypeOfOwnershipRejection, com.tools20022.repository.codeset.RejectionReason16Code.NotFoundRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.MultipleSettlementQuantity, com.tools20022.repository.codeset.RejectionReason16Code.WrongRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReason16Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReason16Code.TerminationTransactionAmount,
						com.tools20022.repository.codeset.RejectionReason16Code.RepurchaseRate, com.tools20022.repository.codeset.RejectionReason16Code.PremiumAmount,
						com.tools20022.repository.codeset.RejectionReason16Code.DisagreementInRegistrationReason, com.tools20022.repository.codeset.RejectionReason16Code.MissingRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReason16Code.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReason16Code.SpreadRate,
						com.tools20022.repository.codeset.RejectionReason16Code.SettlementSystemMethodRejection, com.tools20022.repository.codeset.RejectionReason16Code.TradeDate,
						com.tools20022.repository.codeset.RejectionReason16Code.CommonReferenceRejection, com.tools20022.repository.codeset.RejectionReason16Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReason16Code.NarrativeInformationRejection, com.tools20022.repository.codeset.RejectionReason16Code.InsufficientCollateral,
						com.tools20022.repository.codeset.RejectionReason16Code.BusinessPartnerNumberRejection, com.tools20022.repository.codeset.RejectionReason16Code.BankReferenceNumberRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.TypeOfOrderRejection, com.tools20022.repository.codeset.RejectionReason16Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RejectionReason16Code.CommercializationContractRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.ConcentrationLimitExceeded, com.tools20022.repository.codeset.RejectionReason16Code.UnknownDealExposure,
						com.tools20022.repository.codeset.RejectionReason16Code.SettlementDateRejection, com.tools20022.repository.codeset.RejectionReason16Code.DisagreeWithCallAmount,
						com.tools20022.repository.codeset.RejectionReason16Code.DisagreeWithExposureAmount, com.tools20022.repository.codeset.RejectionReason16Code.RegistrationRequestDataAndOrderRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.FeeCommissionRejection, com.tools20022.repository.codeset.RejectionReason16Code.SettlementTransactionRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.ClosingDateTimeRejection, com.tools20022.repository.codeset.RejectionReason16Code.VariableRateSupportRejection,
						com.tools20022.repository.codeset.RejectionReason16Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RejectionReason16Code.LackOfStampDuty,
						com.tools20022.repository.codeset.RejectionReason16Code.ForfeitAmount, com.tools20022.repository.codeset.RejectionReason16Code.ReceivingDeliveringParty2,
						com.tools20022.repository.codeset.RejectionReason16Code.ReceivingDeliveringParty1, com.tools20022.repository.codeset.RejectionReason16Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RejectionReason16Code.Other, com.tools20022.repository.codeset.RejectionReason16Code.ReceivingDeliveringParty3);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(AddressDetailsRejection.getCodeName().get(), AddressDetailsRejection);
		codesByName.put(InstructionIrrevocable.getCodeName().get(), InstructionIrrevocable);
		codesByName.put(OptionCancelled.getCodeName().get(), OptionCancelled);
		codesByName.put(OptionInactive.getCodeName().get(), OptionInactive);
		codesByName.put(InvalidForTaxAuthorities.getCodeName().get(), InvalidForTaxAuthorities);
		codesByName.put(RefusedByTaxAuthorities.getCodeName().get(), RefusedByTaxAuthorities);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(LackofSecurities.getCodeName().get(), LackofSecurities);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Mismatch.getCodeName().get(), Mismatch);
		codesByName.put(OptionNumberRejection.getCodeName().get(), OptionNumberRejection);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(InvalidOptionType.getCodeName().get(), InvalidOptionType);
		codesByName.put(RejectedSinceAlreadyCancelled.getCodeName().get(), RejectedSinceAlreadyCancelled);
		codesByName.put(RejectedSinceInProgress.getCodeName().get(), RejectedSinceInProgress);
		codesByName.put(UnrecognisedIdentification.getCodeName().get(), UnrecognisedIdentification);
		codesByName.put(MissingStatutes.getCodeName().get(), MissingStatutes);
		codesByName.put(NotStampedOrSigned.getCodeName().get(), NotStampedOrSigned);
		codesByName.put(InvalidSignature.getCodeName().get(), InvalidSignature);
		codesByName.put(ShareholderNumberRejection.getCodeName().get(), ShareholderNumberRejection);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(MissingLegalPower.getCodeName().get(), MissingLegalPower);
		codesByName.put(ProcessingBatchRejection.getCodeName().get(), ProcessingBatchRejection);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(TypeOfOwnershipRejection.getCodeName().get(), TypeOfOwnershipRejection);
		codesByName.put(NotFoundRejection.getCodeName().get(), NotFoundRejection);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(WrongRegistrationRequest.getCodeName().get(), WrongRegistrationRequest);
		codesByName.put(TaxStatusRejection.getCodeName().get(), TaxStatusRejection);
		codesByName.put(TerminationTransactionAmount.getCodeName().get(), TerminationTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(DisagreementInRegistrationReason.getCodeName().get(), DisagreementInRegistrationReason);
		codesByName.put(MissingRegistrationRequest.getCodeName().get(), MissingRegistrationRequest);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(SettlementSystemMethodRejection.getCodeName().get(), SettlementSystemMethodRejection);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(CommonReferenceRejection.getCodeName().get(), CommonReferenceRejection);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(NarrativeInformationRejection.getCodeName().get(), NarrativeInformationRejection);
		codesByName.put(InsufficientCollateral.getCodeName().get(), InsufficientCollateral);
		codesByName.put(BusinessPartnerNumberRejection.getCodeName().get(), BusinessPartnerNumberRejection);
		codesByName.put(BankReferenceNumberRejection.getCodeName().get(), BankReferenceNumberRejection);
		codesByName.put(TypeOfOrderRejection.getCodeName().get(), TypeOfOrderRejection);
		codesByName.put(CorporateActionRejection.getCodeName().get(), CorporateActionRejection);
		codesByName.put(ImpossibleCashSettlementSystem.getCodeName().get(), ImpossibleCashSettlementSystem);
		codesByName.put(CommercializationContractRejection.getCodeName().get(), CommercializationContractRejection);
		codesByName.put(ConcentrationLimitExceeded.getCodeName().get(), ConcentrationLimitExceeded);
		codesByName.put(UnknownDealExposure.getCodeName().get(), UnknownDealExposure);
		codesByName.put(SettlementDateRejection.getCodeName().get(), SettlementDateRejection);
		codesByName.put(DisagreeWithCallAmount.getCodeName().get(), DisagreeWithCallAmount);
		codesByName.put(DisagreeWithExposureAmount.getCodeName().get(), DisagreeWithExposureAmount);
		codesByName.put(RegistrationRequestDataAndOrderRejection.getCodeName().get(), RegistrationRequestDataAndOrderRejection);
		codesByName.put(FeeCommissionRejection.getCodeName().get(), FeeCommissionRejection);
		codesByName.put(SettlementTransactionRejection.getCodeName().get(), SettlementTransactionRejection);
		codesByName.put(ClosingDateTimeRejection.getCodeName().get(), ClosingDateTimeRejection);
		codesByName.put(VariableRateSupportRejection.getCodeName().get(), VariableRateSupportRejection);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(LackOfStampDuty.getCodeName().get(), LackOfStampDuty);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
	}

	public static RejectionReason16Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReason16Code[] values() {
		RejectionReason16Code[] values = new RejectionReason16Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReason16Code> {
		@Override
		public RejectionReason16Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReason16Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}