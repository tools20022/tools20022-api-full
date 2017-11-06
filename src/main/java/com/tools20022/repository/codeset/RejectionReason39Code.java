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
import com.tools20022.repository.codeset.RejectionReasonV2Code;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV2Code
 * RejectionReasonV2Code}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInvalidReference
 * RejectionReason39Code.mmInvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSafekeepingAccountRejection
 * RejectionReason39Code.mmSafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmQuantityRejection
 * RejectionReason39Code.mmQuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmAccountServicerDeadlineMissed
 * RejectionReason39Code.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmImpossibleToUseTheRTGSSystemInstructed
 * RejectionReason39Code.mmImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSettlementAmountCurrencyRejection
 * RejectionReason39Code.mmSettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInvalidSecurity
 * RejectionReason39Code.mmInvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmAddressDetailsRejection
 * RejectionReason39Code.mmAddressDetailsRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInstructionIrrevocable
 * RejectionReason39Code.mmInstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmOptionCancelled
 * RejectionReason39Code.mmOptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmOptionInactive
 * RejectionReason39Code.mmOptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInvalidForTaxAuthorities
 * RejectionReason39Code.mmInvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmRefusedByTaxAuthorities
 * RejectionReason39Code.mmRefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmPhysicalSettlementImpossible
 * RejectionReason39Code.mmPhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmReferenceRejection
 * RejectionReason39Code.mmReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmLackofSecurities
 * RejectionReason39Code.mmLackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMarketDeadlineMissed
 * RejectionReason39Code.mmMarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMismatch
 * RejectionReason39Code.mmMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmOptionNumberRejection
 * RejectionReason39Code.mmOptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSettlementAmountRejection
 * RejectionReason39Code.mmSettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInvalidOptionType
 * RejectionReason39Code.mmInvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmRejectedSinceAlreadyCancelled
 * RejectionReason39Code.mmRejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmRejectedSinceInProgress
 * RejectionReason39Code.mmRejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmUnrecognisedIdentification
 * RejectionReason39Code.mmUnrecognisedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMissingStatutes
 * RejectionReason39Code.mmMissingStatutes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmNotStampedOrSigned
 * RejectionReason39Code.mmNotStampedOrSigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInvalidSignature
 * RejectionReason39Code.mmInvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmShareholderNumberRejection
 * RejectionReason39Code.mmShareholderNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMinimumSettlementQuantity
 * RejectionReason39Code.mmMinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmNoMatch
 * RejectionReason39Code.mmNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMissingLegalPower
 * RejectionReason39Code.mmMissingLegalPower}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmProcessingBatchRejection
 * RejectionReason39Code.mmProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmTransactionCallDelay
 * RejectionReason39Code.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmCashAccount
 * RejectionReason39Code.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmDealPrice
 * RejectionReason39Code.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmTypeOfOwnershipRejection
 * RejectionReason39Code.mmTypeOfOwnershipRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmNotFoundRejection
 * RejectionReason39Code.mmNotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMultipleSettlementQuantity
 * RejectionReason39Code.mmMultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmWrongRegistrationRequest
 * RejectionReason39Code.mmWrongRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmTaxStatusRejection
 * RejectionReason39Code.mmTaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmTerminationTransactionAmount
 * RejectionReason39Code.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmRepurchaseRate
 * RejectionReason39Code.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmPremiumAmount
 * RejectionReason39Code.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmDisagreementInRegistrationReason
 * RejectionReason39Code.mmDisagreementInRegistrationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmMissingRegistrationRequest
 * RejectionReason39Code.mmMissingRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmRepurchaseRateType
 * RejectionReason39Code.mmRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSpreadRate
 * RejectionReason39Code.mmSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSettlementSystemMethodRejection
 * RejectionReason39Code.mmSettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmTradeDate
 * RejectionReason39Code.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmCommonReferenceRejection
 * RejectionReason39Code.mmCommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmPlaceOfTrade
 * RejectionReason39Code.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmNarrativeInformationRejection
 * RejectionReason39Code.mmNarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInsufficientCollateral
 * RejectionReason39Code.mmInsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmBusinessPartnerNumberRejection
 * RejectionReason39Code.mmBusinessPartnerNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmBankReferenceNumberRejection
 * RejectionReason39Code.mmBankReferenceNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmTypeOfOrderRejection
 * RejectionReason39Code.mmTypeOfOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmCorporateActionRejection
 * RejectionReason39Code.mmCorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmImpossibleCashSettlementSystem
 * RejectionReason39Code.mmImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmCommercializationContractRejection
 * RejectionReason39Code.mmCommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmConcentrationLimitExceeded
 * RejectionReason39Code.mmConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmUnknownDealExposure
 * RejectionReason39Code.mmUnknownDealExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSettlementDateRejection
 * RejectionReason39Code.mmSettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmDisagreeWithCallAmount
 * RejectionReason39Code.mmDisagreeWithCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmDisagreeWithExposureAmount
 * RejectionReason39Code.mmDisagreeWithExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmRegistrationRequestDataAndOrderRejection
 * RejectionReason39Code.mmRegistrationRequestDataAndOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmFeeCommissionRejection
 * RejectionReason39Code.mmFeeCommissionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmSettlementTransactionRejection
 * RejectionReason39Code.mmSettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmClosingDateTimeRejection
 * RejectionReason39Code.mmClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmVariableRateSupportRejection
 * RejectionReason39Code.mmVariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmPlaceOfSafekeeping
 * RejectionReason39Code.mmPlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmLackOfStampDuty
 * RejectionReason39Code.mmLackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmForfeitAmount
 * RejectionReason39Code.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmReceivingDeliveringParty2
 * RejectionReason39Code.mmReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmReceivingDeliveringParty1
 * RejectionReason39Code.mmReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmReceivingDeliveringDepository
 * RejectionReason39Code.mmReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmOther
 * RejectionReason39Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmReceivingDeliveringParty3
 * RejectionReason39Code.mmReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmInvalidInvestorParty
 * RejectionReason39Code.mmInvalidInvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code#mmPlaceOfListing
 * RejectionReason39Code.mmPlaceOfListing}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
 * "RejectionReason39Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code
 * RejectionReason16Code}</li>
 * </ul>
 */
public class RejectionReason39Code extends RejectionReasonV2Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInvalidReference
	 * RejectionReason16Code.mmInvalidReference}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInvalidReference;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSafekeepingAccountRejection
	 * RejectionReason16Code.mmSafekeepingAccountRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmSafekeepingAccountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSafekeepingAccountRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmQuantityRejection
	 * RejectionReason16Code.mmQuantityRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmQuantityRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmQuantityRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmAccountServicerDeadlineMissed
	 * RejectionReason16Code.mmAccountServicerDeadlineMissed}</li>
	 * </ul>
	 */
	public static final MMCode mmAccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmAccountServicerDeadlineMissed;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmImpossibleToUseTheRTGSSystemInstructed
	 * RejectionReason16Code.mmImpossibleToUseTheRTGSSystemInstructed}</li>
	 * </ul>
	 */
	public static final MMCode mmImpossibleToUseTheRTGSSystemInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmImpossibleToUseTheRTGSSystemInstructed;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSettlementAmountCurrencyRejection
	 * RejectionReason16Code.mmSettlementAmountCurrencyRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementAmountCurrencyRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSettlementAmountCurrencyRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInvalidSecurity
	 * RejectionReason16Code.mmInvalidSecurity}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInvalidSecurity;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressDetailsRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmAddressDetailsRejection
	 * RejectionReason16Code.mmAddressDetailsRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmAddressDetailsRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressDetailsRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmAddressDetailsRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIrrevocable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInstructionIrrevocable
	 * RejectionReason16Code.mmInstructionIrrevocable}</li>
	 * </ul>
	 */
	public static final MMCode mmInstructionIrrevocable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInstructionIrrevocable;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmOptionCancelled
	 * RejectionReason16Code.mmOptionCancelled}</li>
	 * </ul>
	 */
	public static final MMCode mmOptionCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmOptionCancelled;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionInactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmOptionInactive
	 * RejectionReason16Code.mmOptionInactive}</li>
	 * </ul>
	 */
	public static final MMCode mmOptionInactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmOptionInactive;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInvalidForTaxAuthorities
	 * RejectionReason16Code.mmInvalidForTaxAuthorities}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidForTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInvalidForTaxAuthorities;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedByTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmRefusedByTaxAuthorities
	 * RejectionReason16Code.mmRefusedByTaxAuthorities}</li>
	 * </ul>
	 */
	public static final MMCode mmRefusedByTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmRefusedByTaxAuthorities;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmPhysicalSettlementImpossible
	 * RejectionReason16Code.mmPhysicalSettlementImpossible}</li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalSettlementImpossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmPhysicalSettlementImpossible;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmReferenceRejection
	 * RejectionReason16Code.mmReferenceRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmReferenceRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmLackofSecurities
	 * RejectionReason16Code.mmLackofSecurities}</li>
	 * </ul>
	 */
	public static final MMCode mmLackofSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmLackofSecurities;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMarketDeadlineMissed
	 * RejectionReason16Code.mmMarketDeadlineMissed}</li>
	 * </ul>
	 */
	public static final MMCode mmMarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMarketDeadlineMissed;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMismatch
	 * RejectionReason16Code.mmMismatch}</li>
	 * </ul>
	 */
	public static final MMCode mmMismatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMismatch;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmOptionNumberRejection
	 * RejectionReason16Code.mmOptionNumberRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmOptionNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmOptionNumberRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSettlementAmountRejection
	 * RejectionReason16Code.mmSettlementAmountRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementAmountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSettlementAmountRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInvalidOptionType
	 * RejectionReason16Code.mmInvalidOptionType}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOptionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInvalidOptionType;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmRejectedSinceAlreadyCancelled
	 * RejectionReason16Code.mmRejectedSinceAlreadyCancelled}</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedSinceAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmRejectedSinceAlreadyCancelled;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmRejectedSinceInProgress
	 * RejectionReason16Code.mmRejectedSinceInProgress}</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedSinceInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmRejectedSinceInProgress;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmUnrecognisedIdentification
	 * RejectionReason16Code.mmUnrecognisedIdentification}</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmUnrecognisedIdentification;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingStatutes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMissingStatutes
	 * RejectionReason16Code.mmMissingStatutes}</li>
	 * </ul>
	 */
	public static final MMCode mmMissingStatutes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingStatutes";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMissingStatutes;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStampedOrSigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmNotStampedOrSigned
	 * RejectionReason16Code.mmNotStampedOrSigned}</li>
	 * </ul>
	 */
	public static final MMCode mmNotStampedOrSigned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStampedOrSigned";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmNotStampedOrSigned;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInvalidSignature
	 * RejectionReason16Code.mmInvalidSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInvalidSignature;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareholderNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmShareholderNumberRejection
	 * RejectionReason16Code.mmShareholderNumberRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmShareholderNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareholderNumberRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmShareholderNumberRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMinimumSettlementQuantity
	 * RejectionReason16Code.mmMinimumSettlementQuantity}</li>
	 * </ul>
	 */
	public static final MMCode mmMinimumSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMinimumSettlementQuantity;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmNoMatch
	 * RejectionReason16Code.mmNoMatch}</li>
	 * </ul>
	 */
	public static final MMCode mmNoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmNoMatch;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingLegalPower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMissingLegalPower
	 * RejectionReason16Code.mmMissingLegalPower}</li>
	 * </ul>
	 */
	public static final MMCode mmMissingLegalPower = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingLegalPower";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMissingLegalPower;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmProcessingBatchRejection
	 * RejectionReason16Code.mmProcessingBatchRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmProcessingBatchRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmProcessingBatchRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmTransactionCallDelay
	 * RejectionReason16Code.mmTransactionCallDelay}</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionCallDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmTransactionCallDelay;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmCashAccount
	 * RejectionReason16Code.mmCashAccount}</li>
	 * </ul>
	 */
	public static final MMCode mmCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmCashAccount;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmDealPrice
	 * RejectionReason16Code.mmDealPrice}</li>
	 * </ul>
	 */
	public static final MMCode mmDealPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmDealPrice;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOwnershipRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmTypeOfOwnershipRejection
	 * RejectionReason16Code.mmTypeOfOwnershipRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmTypeOfOwnershipRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOwnershipRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmTypeOfOwnershipRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmNotFoundRejection
	 * RejectionReason16Code.mmNotFoundRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmNotFoundRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmNotFoundRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMultipleSettlementQuantity
	 * RejectionReason16Code.mmMultipleSettlementQuantity}</li>
	 * </ul>
	 */
	public static final MMCode mmMultipleSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMultipleSettlementQuantity;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmWrongRegistrationRequest
	 * RejectionReason16Code.mmWrongRegistrationRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmWrongRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRegistrationRequest";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmWrongRegistrationRequest;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmTaxStatusRejection
	 * RejectionReason16Code.mmTaxStatusRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmTaxStatusRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmTaxStatusRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmTerminationTransactionAmount
	 * RejectionReason16Code.mmTerminationTransactionAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmTerminationTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmTerminationTransactionAmount;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmRepurchaseRate
	 * RejectionReason16Code.mmRepurchaseRate}</li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmRepurchaseRate;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmPremiumAmount
	 * RejectionReason16Code.mmPremiumAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmPremiumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmPremiumAmount;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementInRegistrationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmDisagreementInRegistrationReason
	 * RejectionReason16Code.mmDisagreementInRegistrationReason}</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementInRegistrationReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementInRegistrationReason";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmDisagreementInRegistrationReason;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmMissingRegistrationRequest
	 * RejectionReason16Code.mmMissingRegistrationRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmMissingRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRegistrationRequest";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmMissingRegistrationRequest;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmRepurchaseRateType
	 * RejectionReason16Code.mmRepurchaseRateType}</li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseRateType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmRepurchaseRateType;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSpreadRate
	 * RejectionReason16Code.mmSpreadRate}</li>
	 * </ul>
	 */
	public static final MMCode mmSpreadRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSpreadRate;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSettlementSystemMethodRejection
	 * RejectionReason16Code.mmSettlementSystemMethodRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementSystemMethodRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSettlementSystemMethodRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmTradeDate
	 * RejectionReason16Code.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMCode mmTradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmTradeDate;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmCommonReferenceRejection
	 * RejectionReason16Code.mmCommonReferenceRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmCommonReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmCommonReferenceRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmPlaceOfTrade
	 * RejectionReason16Code.mmPlaceOfTrade}</li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmPlaceOfTrade;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmNarrativeInformationRejection
	 * RejectionReason16Code.mmNarrativeInformationRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmNarrativeInformationRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmNarrativeInformationRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmInsufficientCollateral
	 * RejectionReason16Code.mmInsufficientCollateral}</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmInsufficientCollateral;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessPartnerNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmBusinessPartnerNumberRejection
	 * RejectionReason16Code.mmBusinessPartnerNumberRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmBusinessPartnerNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessPartnerNumberRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmBusinessPartnerNumberRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReferenceNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmBankReferenceNumberRejection
	 * RejectionReason16Code.mmBankReferenceNumberRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmBankReferenceNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReferenceNumberRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmBankReferenceNumberRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmTypeOfOrderRejection
	 * RejectionReason16Code.mmTypeOfOrderRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmTypeOfOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmTypeOfOrderRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmCorporateActionRejection
	 * RejectionReason16Code.mmCorporateActionRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateActionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmCorporateActionRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmImpossibleCashSettlementSystem
	 * RejectionReason16Code.mmImpossibleCashSettlementSystem}</li>
	 * </ul>
	 */
	public static final MMCode mmImpossibleCashSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmImpossibleCashSettlementSystem;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmCommercializationContractRejection
	 * RejectionReason16Code.mmCommercializationContractRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmCommercializationContractRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmCommercializationContractRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcentrationLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmConcentrationLimitExceeded
	 * RejectionReason16Code.mmConcentrationLimitExceeded}</li>
	 * </ul>
	 */
	public static final MMCode mmConcentrationLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmConcentrationLimitExceeded;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownDealExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmUnknownDealExposure
	 * RejectionReason16Code.mmUnknownDealExposure}</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownDealExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownDealExposure";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmUnknownDealExposure;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSettlementDateRejection
	 * RejectionReason16Code.mmSettlementDateRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementDateRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSettlementDateRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmDisagreeWithCallAmount
	 * RejectionReason16Code.mmDisagreeWithCallAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreeWithCallAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithCallAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmDisagreeWithCallAmount;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithExposureAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmDisagreeWithExposureAmount
	 * RejectionReason16Code.mmDisagreeWithExposureAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreeWithExposureAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithExposureAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmDisagreeWithExposureAmount;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationRequestDataAndOrderRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmRegistrationRequestDataAndOrderRejection
	 * RejectionReason16Code.mmRegistrationRequestDataAndOrderRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmRegistrationRequestDataAndOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmRegistrationRequestDataAndOrderRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmFeeCommissionRejection
	 * RejectionReason16Code.mmFeeCommissionRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmFeeCommissionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmFeeCommissionRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmSettlementTransactionRejection
	 * RejectionReason16Code.mmSettlementTransactionRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementTransactionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmSettlementTransactionRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmClosingDateTimeRejection
	 * RejectionReason16Code.mmClosingDateTimeRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmClosingDateTimeRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmClosingDateTimeRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupportRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmVariableRateSupportRejection
	 * RejectionReason16Code.mmVariableRateSupportRejection}</li>
	 * </ul>
	 */
	public static final MMCode mmVariableRateSupportRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmVariableRateSupportRejection;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmPlaceOfSafekeeping
	 * RejectionReason16Code.mmPlaceOfSafekeeping}</li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfSafekeeping = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmPlaceOfSafekeeping;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmLackOfStampDuty
	 * RejectionReason16Code.mmLackOfStampDuty}</li>
	 * </ul>
	 */
	public static final MMCode mmLackOfStampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmLackOfStampDuty;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmForfeitAmount
	 * RejectionReason16Code.mmForfeitAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmForfeitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmForfeitAmount;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmReceivingDeliveringParty2
	 * RejectionReason16Code.mmReceivingDeliveringParty2}</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringParty2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmReceivingDeliveringParty2;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmReceivingDeliveringParty1
	 * RejectionReason16Code.mmReceivingDeliveringParty1}</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringParty1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmReceivingDeliveringParty1;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmReceivingDeliveringDepository
	 * RejectionReason16Code.mmReceivingDeliveringDepository}</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmReceivingDeliveringDepository;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmOther
	 * RejectionReason16Code.mmOther}</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmOther;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason16Code#mmReceivingDeliveringParty3
	 * RejectionReason16Code.mmReceivingDeliveringParty3}</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringParty3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.RejectionReason16Code.mmReceivingDeliveringParty3;
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInvestorParty"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidInvestorParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReason39Code
	 * RejectionReason39Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfListing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			owner_lazy = () -> RejectionReason39Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ULNK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectionReason39Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				previousVersion_lazy = () -> RejectionReason16Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReason39Code.mmInvalidReference, com.tools20022.repository.codeset.RejectionReason39Code.mmSafekeepingAccountRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmQuantityRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmAccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReason39Code.mmImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RejectionReason39Code.mmSettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmInvalidSecurity, com.tools20022.repository.codeset.RejectionReason39Code.mmAddressDetailsRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmInstructionIrrevocable, com.tools20022.repository.codeset.RejectionReason39Code.mmOptionCancelled,
						com.tools20022.repository.codeset.RejectionReason39Code.mmOptionInactive, com.tools20022.repository.codeset.RejectionReason39Code.mmInvalidForTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReason39Code.mmRefusedByTaxAuthorities, com.tools20022.repository.codeset.RejectionReason39Code.mmPhysicalSettlementImpossible,
						com.tools20022.repository.codeset.RejectionReason39Code.mmReferenceRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmLackofSecurities,
						com.tools20022.repository.codeset.RejectionReason39Code.mmMarketDeadlineMissed, com.tools20022.repository.codeset.RejectionReason39Code.mmMismatch,
						com.tools20022.repository.codeset.RejectionReason39Code.mmOptionNumberRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmSettlementAmountRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmInvalidOptionType, com.tools20022.repository.codeset.RejectionReason39Code.mmRejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReason39Code.mmRejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReason39Code.mmUnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReason39Code.mmMissingStatutes, com.tools20022.repository.codeset.RejectionReason39Code.mmNotStampedOrSigned,
						com.tools20022.repository.codeset.RejectionReason39Code.mmInvalidSignature, com.tools20022.repository.codeset.RejectionReason39Code.mmShareholderNumberRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmMinimumSettlementQuantity, com.tools20022.repository.codeset.RejectionReason39Code.mmNoMatch,
						com.tools20022.repository.codeset.RejectionReason39Code.mmMissingLegalPower, com.tools20022.repository.codeset.RejectionReason39Code.mmProcessingBatchRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmTransactionCallDelay, com.tools20022.repository.codeset.RejectionReason39Code.mmCashAccount,
						com.tools20022.repository.codeset.RejectionReason39Code.mmDealPrice, com.tools20022.repository.codeset.RejectionReason39Code.mmTypeOfOwnershipRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmNotFoundRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmMultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReason39Code.mmWrongRegistrationRequest, com.tools20022.repository.codeset.RejectionReason39Code.mmTaxStatusRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmTerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReason39Code.mmRepurchaseRate,
						com.tools20022.repository.codeset.RejectionReason39Code.mmPremiumAmount, com.tools20022.repository.codeset.RejectionReason39Code.mmDisagreementInRegistrationReason,
						com.tools20022.repository.codeset.RejectionReason39Code.mmMissingRegistrationRequest, com.tools20022.repository.codeset.RejectionReason39Code.mmRepurchaseRateType,
						com.tools20022.repository.codeset.RejectionReason39Code.mmSpreadRate, com.tools20022.repository.codeset.RejectionReason39Code.mmSettlementSystemMethodRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmTradeDate, com.tools20022.repository.codeset.RejectionReason39Code.mmCommonReferenceRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmPlaceOfTrade, com.tools20022.repository.codeset.RejectionReason39Code.mmNarrativeInformationRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmInsufficientCollateral, com.tools20022.repository.codeset.RejectionReason39Code.mmBusinessPartnerNumberRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmBankReferenceNumberRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmTypeOfOrderRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmCorporateActionRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RejectionReason39Code.mmCommercializationContractRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmConcentrationLimitExceeded,
						com.tools20022.repository.codeset.RejectionReason39Code.mmUnknownDealExposure, com.tools20022.repository.codeset.RejectionReason39Code.mmSettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmDisagreeWithCallAmount, com.tools20022.repository.codeset.RejectionReason39Code.mmDisagreeWithExposureAmount,
						com.tools20022.repository.codeset.RejectionReason39Code.mmRegistrationRequestDataAndOrderRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmFeeCommissionRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmSettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmClosingDateTimeRejection,
						com.tools20022.repository.codeset.RejectionReason39Code.mmVariableRateSupportRejection, com.tools20022.repository.codeset.RejectionReason39Code.mmPlaceOfSafekeeping,
						com.tools20022.repository.codeset.RejectionReason39Code.mmLackOfStampDuty, com.tools20022.repository.codeset.RejectionReason39Code.mmForfeitAmount,
						com.tools20022.repository.codeset.RejectionReason39Code.mmReceivingDeliveringParty2, com.tools20022.repository.codeset.RejectionReason39Code.mmReceivingDeliveringParty1,
						com.tools20022.repository.codeset.RejectionReason39Code.mmReceivingDeliveringDepository, com.tools20022.repository.codeset.RejectionReason39Code.mmOther,
						com.tools20022.repository.codeset.RejectionReason39Code.mmReceivingDeliveringParty3, com.tools20022.repository.codeset.RejectionReason39Code.mmInvalidInvestorParty,
						com.tools20022.repository.codeset.RejectionReason39Code.mmPlaceOfListing);
				trace_lazy = () -> RejectionReasonV2Code.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}