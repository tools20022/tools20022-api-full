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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the reason why the instruction/cancellation request has a rejected
 * status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInsufficientMoney
 * RejectionReasonV3Code.mmInsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidReference
 * RejectionReasonV3Code.mmInvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSafekeepingAccountRejection
 * RejectionReasonV3Code.mmSafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInsufficientTresholdPosition
 * RejectionReasonV3Code.mmInsufficientTresholdPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmQuantityRejection
 * RejectionReasonV3Code.mmQuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmAccountServicerDeadlineMissed
 * RejectionReasonV3Code.mmAccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSplitVoteNotAllowed
 * RejectionReasonV3Code.mmSplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPartialVoteNotAllowed
 * RejectionReasonV3Code.mmPartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingOrInvalidPOA
 * RejectionReasonV3Code.mmMissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmProxyCardDiscrepancy
 * RejectionReasonV3Code.mmProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRegistrationDiscrepancy
 * RejectionReasonV3Code.mmRegistrationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRejectedByIssuerOrRegistrar
 * RejectionReasonV3Code.mmRejectedByIssuerOrRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidSecurity
 * RejectionReasonV3Code.mmInvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInstructionIrrevocable
 * RejectionReasonV3Code.mmInstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmOptionCancelled
 * RejectionReasonV3Code.mmOptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmOptionInactive
 * RejectionReasonV3Code.mmOptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidForTaxAuthorities
 * RejectionReasonV3Code.mmInvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRefusedByTaxAuthorities
 * RejectionReasonV3Code.mmRefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmLackofSecurities
 * RejectionReasonV3Code.mmLackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMarketDeadlineMissed
 * RejectionReasonV3Code.mmMarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMismatch
 * RejectionReasonV3Code.mmMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmOptionNumberRejection
 * RejectionReasonV3Code.mmOptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidOptionType
 * RejectionReasonV3Code.mmInvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRejectedSinceAlreadyCancelled
 * RejectionReasonV3Code.mmRejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRejectedSinceInProgress
 * RejectionReasonV3Code.mmRejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmUnrecognisedIdentification
 * RejectionReasonV3Code.mmUnrecognisedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmUnknownSymbol
 * RejectionReasonV3Code.mmUnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmClosedExchange
 * RejectionReasonV3Code.mmClosedExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmExceedsLimit
 * RejectionReasonV3Code.mmExceedsLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTooLate
 * RejectionReasonV3Code.mmTooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidPrice
 * RejectionReasonV3Code.mmInvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotAuthorised
 * RejectionReasonV3Code.mmNotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoMatchInquiry
 * RejectionReasonV3Code.mmNoMatchInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoInstrumentMarket
 * RejectionReasonV3Code.mmNoInstrumentMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoInventory
 * RejectionReasonV3Code.mmNoInventory}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPass
 * RejectionReasonV3Code.mmPass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPriceExceeds
 * RejectionReasonV3Code.mmPriceExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmQuantityExceeds
 * RejectionReasonV3Code.mmQuantityExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmWrongSide
 * RejectionReasonV3Code.mmWrongSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCalculationDifference
 * RejectionReasonV3Code.mmCalculationDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInsufficientCredit
 * RejectionReasonV3Code.mmInsufficientCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmAgreementStartDate
 * RejectionReasonV3Code.mmAgreementStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTransactionCallDelay
 * RejectionReasonV3Code.mmTransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCashAccount
 * RejectionReasonV3Code.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmDealPrice
 * RejectionReasonV3Code.mmDealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmForfeitAmount
 * RejectionReasonV3Code.mmForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmDeliveringCustodian
 * RejectionReasonV3Code.mmDeliveringCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReceivingCustodian
 * RejectionReasonV3Code.mmReceivingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotFoundRejection
 * RejectionReasonV3Code.mmNotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmQuantityUnitType
 * RejectionReasonV3Code.mmQuantityUnitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTerminationTransactionAmount
 * RejectionReasonV3Code.mmTerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRepurchaseRate
 * RejectionReasonV3Code.mmRepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPremiumAmount
 * RejectionReasonV3Code.mmPremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRepurchaseRateType
 * RejectionReasonV3Code.mmRepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSpreadRate
 * RejectionReasonV3Code.mmSpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTradedSecuritiesQuantity
 * RejectionReasonV3Code.mmTradedSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTradeDate
 * RejectionReasonV3Code.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReceivingAgent
 * RejectionReasonV3Code.mmReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmIntermediary
 * RejectionReasonV3Code.mmIntermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPlaceOfTrade
 * RejectionReasonV3Code.mmPlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvestorNameAddressUnknown
 * RejectionReasonV3Code.mmInvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmImpossibleToUseTheRTGSSystemInstructed
 * RejectionReasonV3Code.mmImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSettlementAmountCurrencyRejection
 * RejectionReasonV3Code.mmSettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmLetterOfGuaranteeIndicatorRejection
 * RejectionReasonV3Code.mmLetterOfGuaranteeIndicatorRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingCreditAuthorisation
 * RejectionReasonV3Code.mmMissingCreditAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmAddressDetailsRejection
 * RejectionReasonV3Code.mmAddressDetailsRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPhysicalSettlementImpossible
 * RejectionReasonV3Code.mmPhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReferenceRejection
 * RejectionReasonV3Code.mmReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSettlementAmountRejection
 * RejectionReasonV3Code.mmSettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingStatutes
 * RejectionReasonV3Code.mmMissingStatutes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotStampedOrSigned
 * RejectionReasonV3Code.mmNotStampedOrSigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidSignature
 * RejectionReasonV3Code.mmInvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmShareholderNumberRejection
 * RejectionReasonV3Code.mmShareholderNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMinimumSettlementQuantity
 * RejectionReasonV3Code.mmMinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoMatch
 * RejectionReasonV3Code.mmNoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingLegalPower
 * RejectionReasonV3Code.mmMissingLegalPower}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmProcessingBatchRejection
 * RejectionReasonV3Code.mmProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTypeOfOwnershipRejection
 * RejectionReasonV3Code.mmTypeOfOwnershipRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMultipleSettlementQuantity
 * RejectionReasonV3Code.mmMultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmWrongRegistrationRequest
 * RejectionReasonV3Code.mmWrongRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTaxStatusRejection
 * RejectionReasonV3Code.mmTaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmDisagreementInRegistrationReason
 * RejectionReasonV3Code.mmDisagreementInRegistrationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingRegistrationRequest
 * RejectionReasonV3Code.mmMissingRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSettlementSystemMethodRejection
 * RejectionReasonV3Code.mmSettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCommonReferenceRejection
 * RejectionReasonV3Code.mmCommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNarrativeInformationRejection
 * RejectionReasonV3Code.mmNarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmIncorrectProgramConversion
 * RejectionReasonV3Code.mmIncorrectProgramConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInsufficientCollateral
 * RejectionReasonV3Code.mmInsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmBusinessPartnerNumberRejection
 * RejectionReasonV3Code.mmBusinessPartnerNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmBankReferenceNumberRejection
 * RejectionReasonV3Code.mmBankReferenceNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTypeOfOrderRejection
 * RejectionReasonV3Code.mmTypeOfOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCorporateActionRejection
 * RejectionReasonV3Code.mmCorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmImpossibleCashSettlementSystem
 * RejectionReasonV3Code.mmImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCommercializationContractRejection
 * RejectionReasonV3Code.mmCommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmConcentrationLimitExceeded
 * RejectionReasonV3Code.mmConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmUnknownDealExposure
 * RejectionReasonV3Code.mmUnknownDealExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSettlementDateRejection
 * RejectionReasonV3Code.mmSettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmDisagreeWithCallAmount
 * RejectionReasonV3Code.mmDisagreeWithCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmDisagreeWithExposureAmount
 * RejectionReasonV3Code.mmDisagreeWithExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRegistrationRequestDataAndOrderRejection
 * RejectionReasonV3Code.mmRegistrationRequestDataAndOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmFeeCommissionRejection
 * RejectionReasonV3Code.mmFeeCommissionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmIncorrectActivityType
 * RejectionReasonV3Code.mmIncorrectActivityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSettlementTransactionRejection
 * RejectionReasonV3Code.mmSettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmClosingDateTimeRejection
 * RejectionReasonV3Code.mmClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmVariableRateSupportRejection
 * RejectionReasonV3Code.mmVariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingOption
 * RejectionReasonV3Code.mmMissingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotDefinedAgent
 * RejectionReasonV3Code.mmNotDefinedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingPeriodEndDate
 * RejectionReasonV3Code.mmMissingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingPeriodStartDate
 * RejectionReasonV3Code.mmMissingPeriodStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingResultingAmount
 * RejectionReasonV3Code.mmMissingResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmWrongSecurityType
 * RejectionReasonV3Code.mmWrongSecurityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotEligibleDisperseSecurity
 * RejectionReasonV3Code.mmNotEligibleDisperseSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNonEligibleSecurity
 * RejectionReasonV3Code.mmNonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingExchangeRate
 * RejectionReasonV3Code.mmMissingExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmValueDateBeforePaymentDate
 * RejectionReasonV3Code.mmValueDateBeforePaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmUnexpectedAccruedInterest
 * RejectionReasonV3Code.mmUnexpectedAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoAccessToService
 * RejectionReasonV3Code.mmNoAccessToService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmIncorrectCertification
 * RejectionReasonV3Code.mmIncorrectCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotBusinessDay
 * RejectionReasonV3Code.mmNotBusinessDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmEffectiveDayAfterPaymentDate
 * RejectionReasonV3Code.mmEffectiveDayAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmGrossAmountLessThanNetAmount
 * RejectionReasonV3Code.mmGrossAmountLessThanNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingDefaultOption
 * RejectionReasonV3Code.mmMissingDefaultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNonActiveParty
 * RejectionReasonV3Code.mmNonActiveParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPeriodEndDateBeforeStartDate
 * RejectionReasonV3Code.mmPeriodEndDateBeforeStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmRecordDateAfterPaymentDate
 * RejectionReasonV3Code.mmRecordDateAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmFailedValidation
 * RejectionReasonV3Code.mmFailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmEventAlreadyDeactivated
 * RejectionReasonV3Code.mmEventAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoPendingDeactivationInstruction
 * RejectionReasonV3Code.mmNoPendingDeactivationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmAmendmentNotAllowed
 * RejectionReasonV3Code.mmAmendmentNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCancellationNotAllowed
 * RejectionReasonV3Code.mmCancellationNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmLate
 * RejectionReasonV3Code.mmLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmElectionAlreadyCancelled
 * RejectionReasonV3Code.mmElectionAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmElectionAlreadyAmended
 * RejectionReasonV3Code.mmElectionAlreadyAmended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSameCAIdentification
 * RejectionReasonV3Code.mmSameCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidCAIdentification
 * RejectionReasonV3Code.mmInvalidCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidAgent
 * RejectionReasonV3Code.mmInvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotMainAgent
 * RejectionReasonV3Code.mmNotMainAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidOption
 * RejectionReasonV3Code.mmInvalidOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPendingDeactivation
 * RejectionReasonV3Code.mmPendingDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotIdentifiedCashAccount
 * RejectionReasonV3Code.mmNotIdentifiedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotIdentifiedCorrespondentBank
 * RejectionReasonV3Code.mmNotIdentifiedCorrespondentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidStandingInstructionType
 * RejectionReasonV3Code.mmInvalidStandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoHolding
 * RejectionReasonV3Code.mmNoHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInsufficientBalance
 * RejectionReasonV3Code.mmInsufficientBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmSameIdentification
 * RejectionReasonV3Code.mmSameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmOptionAlreadyDeactivated
 * RejectionReasonV3Code.mmOptionAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidEventType
 * RejectionReasonV3Code.mmInvalidEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidUnderlyingSecurity
 * RejectionReasonV3Code.mmInvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidEventProcessingType
 * RejectionReasonV3Code.mmInvalidEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidMandatoryVoluntaryEventType
 * RejectionReasonV3Code.mmInvalidMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidCorporateActionInformation
 * RejectionReasonV3Code.mmInvalidCorporateActionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidDetails
 * RejectionReasonV3Code.mmInvalidDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNoRemainingOption
 * RejectionReasonV3Code.mmNoRemainingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMismatchedCAIdentification
 * RejectionReasonV3Code.mmMismatchedCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotApplicable
 * RejectionReasonV3Code.mmNotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidMovementInformation
 * RejectionReasonV3Code.mmInvalidMovementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMovementAlreadySettled
 * RejectionReasonV3Code.mmMovementAlreadySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNarrativeReason
 * RejectionReasonV3Code.mmNarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidIdentification
 * RejectionReasonV3Code.mmInvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingCertification
 * RejectionReasonV3Code.mmMissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmLackOfStampDuty
 * RejectionReasonV3Code.mmLackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidRequest
 * RejectionReasonV3Code.mmInvalidRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPlaceOfSafekeeping
 * RejectionReasonV3Code.mmPlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmOther
 * RejectionReasonV3Code.mmOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReceivingDeliveringParty3
 * RejectionReasonV3Code.mmReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReceivingDeliveringParty2
 * RejectionReasonV3Code.mmReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReceivingDeliveringParty1
 * RejectionReasonV3Code.mmReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmReceivingDeliveringDepository
 * RejectionReasonV3Code.mmReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidModificationRequest
 * RejectionReasonV3Code.mmInvalidModificationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidLink
 * RejectionReasonV3Code.mmInvalidLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidBalance
 * RejectionReasonV3Code.mmInvalidBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidLotNumber
 * RejectionReasonV3Code.mmInvalidLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidRule
 * RejectionReasonV3Code.mmInvalidRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmPlaceOfListing
 * RejectionReasonV3Code.mmPlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInvalidInvestorParty
 * RejectionReasonV3Code.mmInvalidInvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmMissingBeneficiaryOwnerDetails
 * RejectionReasonV3Code.mmMissingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmClosingTransactionAmount
 * RejectionReasonV3Code.mmClosingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmOrderDateNotProvided
 * RejectionReasonV3Code.mmOrderDateNotProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTradedQuantityHigherThanOriginalOrderQuantity
 * RejectionReasonV3Code.mmTradedQuantityHigherThanOriginalOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTransactionNoticeAlreadyAcceptedOrRejected
 * RejectionReasonV3Code.mmTransactionNoticeAlreadyAcceptedOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmTransactionNoticeIDUnknown
 * RejectionReasonV3Code.mmTransactionNoticeIDUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmNotAvailable
 * RejectionReasonV3Code.mmNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmAmountRejection
 * RejectionReasonV3Code.mmAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmCurrencyRejection
 * RejectionReasonV3Code.mmCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#mmInstructionTypeRejection
 * RejectionReasonV3Code.mmInstructionTypeRejection}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingCancellationReason5Code
 * PendingCancellationReason5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReason46Code
 * RejectionReason46Code}</li>
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
 * "RejectionReasonV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
public class RejectionReasonV3Code {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Insufficient money in your account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MONY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientMoney"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient money in your account."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientMoney = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MONY";
		}
	};
	/**
	 * Linked reference is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ULNK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Linked reference is unknown."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidReference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			definition = "Linked reference is unknown.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ULNK";
		}
	};
	/**
	 * Unrecognised or invalid message sender's safekeeping account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SafekeepingAccountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid message sender's safekeeping account."</li>
	 * </ul>
	 */
	public static final MMCode mmSafekeepingAccountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			definition = "Unrecognised or invalid message sender's safekeeping account.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SAFE";
		}
	};
	/**
	 * Position is less than required threshold.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientTresholdPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position is less than required threshold."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientTresholdPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientTresholdPosition";
			definition = "Position is less than required threshold.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IPOS";
		}
	};
	/**
	 * Unrecognised or invalid instructed quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQUA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid instructed quantity."</li>
	 * </ul>
	 */
	public static final MMCode mmQuantityRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			definition = "Unrecognised or invalid instructed quantity.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DQUA";
		}
	};
	/**
	 * Transaction/instruction received after the account servicer's specified
	 * deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction/instruction received after the account servicer's specified deadline."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccountServicerDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Transaction/instruction received after the account servicer's specified deadline.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ADEA";
		}
	};
	/**
	 * Split voting is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Split voting is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmSplitVoteNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SPLT";
		}
	};
	/**
	 * Partial voting is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialVoteNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Partial voting is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmPartialVoteNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Missing or invalid power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOrInvalidPOA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing or invalid power of attorney."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingOrInvalidPOA = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IPOA";
		}
	};
	/**
	 * Invalid proxy information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRXY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyCardDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid proxy information."</li>
	 * </ul>
	 */
	public static final MMCode mmProxyCardDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PRXY";
		}
	};
	/**
	 * Invalid registration information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDiscrepancy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid registration information."</li>
	 * </ul>
	 */
	public static final MMCode mmRegistrationDiscrepancy = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDiscrepancy";
			definition = "Invalid registration information.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IREG";
		}
	};
	/**
	 * Issuer or registrar has rejected the instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RBIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedByIssuerOrRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer or registrar has rejected the instruction."</li>
	 * </ul>
	 */
	public static final MMCode mmRejectedByIssuerOrRegistrar = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuerOrRegistrar";
			definition = "Issuer or registrar has rejected the instruction.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RBIS";
		}
	};
	/**
	 * Unrecognised or invalid financial instrument identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid financial instrument identification."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Instruction is irrevocable
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INIR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionIrrevocable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction is irrevocable"</li>
	 * </ul>
	 */
	public static final MMCode mmInstructionIrrevocable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			definition = "Instruction is irrevocable";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INIR";
		}
	};
	/**
	 * Option is not valid; it has been cancelled by the market or service
	 * provider, and cannot be responded to. Any responses already processed
	 * against this option are considered void and new responses will be
	 * required .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOptionCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			definition = "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required .";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CANC";
		}
	};
	/**
	 * Option is not active and can no longer be responded to. Any responses
	 * already processed against this option will remain valid, for example,
	 * expired option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionInactive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOptionInactive = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INTV";
		}
	};
	/**
	 * For tax reclaim, the reclaim is invalid for the tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidForTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For tax reclaim, the reclaim is invalid for the tax authorities."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidForTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			definition = "For tax reclaim, the reclaim is invalid for the tax authorities.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INVA";
		}
	};
	/**
	 * Reclaim is refused by the tax authorities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefusedByTaxAuthorities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reclaim is refused by the tax authorities."</li>
	 * </ul>
	 */
	public static final MMCode mmRefusedByTaxAuthorities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			definition = "Reclaim is refused by the tax authorities.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REFT";
		}
	};
	/**
	 * Instructed position exceeds the eligible balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackofSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructed position exceeds the eligible balance."</li>
	 * </ul>
	 */
	public static final MMCode mmLackofSecurities = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			definition = "Instructed position exceeds the eligible balance.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Received after market deadline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketDeadlineMissed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Received after market deadline."</li>
	 * </ul>
	 */
	public static final MMCode mmMarketDeadlineMissed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "LATE";
		}
	};
	/**
	 * Mismatch between option number and option type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Mismatch between option number and option type."</li>
	 * </ul>
	 */
	public static final MMCode mmMismatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			definition = "Mismatch between option number and option type.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NMTY";
		}
	};
	/**
	 * Unrecognised option number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised option number."</li>
	 * </ul>
	 */
	public static final MMCode mmOptionNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			definition = "Unrecognised option number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "OPNM";
		}
	};
	/**
	 * Invalid option type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOptionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid option type."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOptionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			definition = "Invalid option type.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "OPTY";
		}
	};
	/**
	 * Cancellation request was rejected since the instruction has already been
	 * cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceAlreadyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request was rejected since the instruction has already been cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRejectedSinceAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			definition = "Cancellation request was rejected since the instruction has already been cancelled.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DCAN";
		}
	};
	/**
	 * Cancellation request has been rejected because the instruction process is
	 * in progress or has been processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedSinceInProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request has been rejected because the instruction process is in progress or has been processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRejectedSinceInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			definition = "Cancellation request has been rejected because the instruction process is in progress or has been processed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DPRG";
		}
	};
	/**
	 * Unrecognised event number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EVNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised event number."</li>
	 * </ul>
	 */
	public static final MMCode mmUnrecognisedIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			definition = "Unrecognised event number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "EVNM";
		}
	};
	/**
	 * Financial instrument's symbol has not been recognized.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UKWN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownSymbol"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Financial instrument's symbol has not been recognized."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownSymbol = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			definition = "Financial instrument's symbol has not been recognized.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "UKWN";
		}
	};
	/**
	 * Exchange on which the financial instrument is traded is closed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange on which the financial instrument is traded is closed."</li>
	 * </ul>
	 */
	public static final MMCode mmClosedExchange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedExchange";
			definition = "Exchange on which the financial instrument is traded is closed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "EXCL";
		}
	};
	/**
	 * Countervalue of the order exceeds the allowed trading limit or quote
	 * exceeds limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceedsLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExceedsLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceedsLimit";
			definition = "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "EXLI";
		}
	};
	/**
	 * Request has exceeded the allowed time frame.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TOLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TooLate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request has exceeded the allowed time frame."</li>
	 * </ul>
	 */
	public static final MMCode mmTooLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			definition = "Request has exceeded the allowed time frame.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TOLA";
		}
	};
	/**
	 * Price does not comply with the financial instrument's characteristics.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price does not comply with the financial instrument's characteristics."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			definition = "Price does not comply with the financial instrument's characteristics.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INPR";
		}
	};
	/**
	 * Permission to be processed is not granted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAuthorised"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Permission to be processed is not granted."</li>
	 * </ul>
	 */
	public static final MMCode mmNotAuthorised = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			definition = "Permission to be processed is not granted.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NAUT";
		}
	};
	/**
	 * No counterparty order has been identified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No counterparty order has been identified."</li>
	 * </ul>
	 */
	public static final MMCode mmNoMatchInquiry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchInquiry";
			definition = "No counterparty order has been identified.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NMAT";
		}
	};
	/**
	 * Referred instrument does not exist in combination with the mentioned
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NINS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInstrumentMarket"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Referred instrument does not exist in combination with the mentioned market."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoInstrumentMarket = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstrumentMarket";
			definition = "Referred instrument does not exist in combination with the mentioned market.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NINS";
		}
	};
	/**
	 * Requested financial instrument is not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NINV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoInventory"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested financial instrument is not available."</li>
	 * </ul>
	 */
	public static final MMCode mmNoInventory = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInventory";
			definition = "Requested financial instrument is not available.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NINV";
		}
	};
	/**
	 * Counterparty is not interested in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PASS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pass"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Counterparty is not interested in the transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmPass = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			definition = "Counterparty is not interested in the transaction.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PASS";
		}
	};
	/**
	 * Price in the execution exceeds the order price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceExceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price in the execution exceeds the order price."</li>
	 * </ul>
	 */
	public static final MMCode mmPriceExceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceExceeds";
			definition = "Price in the execution exceeds the order price.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PRIC";
		}
	};
	/**
	 * Quantity in the execution exceeds the ordered quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EQTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityExceeds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity in the execution exceeds the ordered quantity."</li>
	 * </ul>
	 */
	public static final MMCode mmQuantityExceeds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityExceeds";
			definition = "Quantity in the execution exceeds the ordered quantity.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "EQTY";
		}
	};
	/**
	 * Order is for the wrong side.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSide"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order is for the wrong side."</li>
	 * </ul>
	 */
	public static final MMCode mmWrongSide = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSide";
			definition = "Order is for the wrong side.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SIDE";
		}
	};
	/**
	 * Primarily used when the Notice of Execution received by the buy-side
	 * contains fees, gross trade amount, net trade amount, etc., values that
	 * differ from the buy-side's calculations. Buy-side may reject the trade if
	 * they feel that the difference in calculations is too high.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationDifference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCalculationDifference = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDifference";
			definition = "Primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations.  Buy-side may reject the trade if they feel that the difference in calculations is too high.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CADI";
		}
	};
	/**
	 * Requestor has no insufficient credit to make the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requestor has no insufficient credit to make the trade."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCredit";
			definition = "Requestor has no insufficient credit to make the trade.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Agreement start date is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ASTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgreementStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreement start date is missing or invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmAgreementStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementStartDate";
			definition = "Agreement start date is missing or invalid.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ASTM";
		}
	};
	/**
	 * Unrecognised or invalid transaction call delay.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CADE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionCallDelay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid transaction call delay."</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionCallDelay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Unrecognised or invalid transaction call delay.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CADE";
		}
	};
	/**
	 * Unrecognised or invalid cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid cash account."</li>
	 * </ul>
	 */
	public static final MMCode mmCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Unrecognised or invalid cash account.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CASH";
		}
	};
	/**
	 * Unrecognised or invalid deal price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid deal price."</li>
	 * </ul>
	 */
	public static final MMCode mmDealPrice = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Unrecognised or invalid deal price.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DDEA";
		}
	};
	/**
	 * Unrecognised or invalid forfeit amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FORF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForfeitAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid forfeit amount."</li>
	 * </ul>
	 */
	public static final MMCode mmForfeitAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Unrecognised or invalid forfeit amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "FORF";
		}
	};
	/**
	 * Unrecognised or invalid delivering custodian.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid delivering custodian."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliveringCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringCustodian";
			definition = "Unrecognised or invalid delivering custodian.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DCUS";
		}
	};
	/**
	 * Unrecognised or invalid receiving agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid receiving agent."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingCustodian = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingCustodian";
			definition = "Unrecognised or invalid receiving agent.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RCUS";
		}
	};
	/**
	 * Instruction could not be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotFoundRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction could not be found."</li>
	 * </ul>
	 */
	public static final MMCode mmNotFoundRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			definition = "Instruction could not be found.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NRGN";
		}
	};
	/**
	 * Quantity unit type is not provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityUnitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity unit type is not provided."</li>
	 * </ul>
	 */
	public static final MMCode mmQuantityUnitType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnitType";
			definition = "Quantity unit type is not provided.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "QUNP";
		}
	};
	/**
	 * Unrecognised or invalid termination transaction amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid termination transaction amount."</li>
	 * </ul>
	 */
	public static final MMCode mmTerminationTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Unrecognised or invalid termination transaction amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REPA";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid repurchase rate."</li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Unrecognised or invalid repurchase rate.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REPO";
		}
	};
	/**
	 * Unrecognised or invalid premium amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PremiumAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid premium amount."</li>
	 * </ul>
	 */
	public static final MMCode mmPremiumAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Unrecognised or invalid premium amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REPP";
		}
	};
	/**
	 * Unrecognised or invalid repurchase rate type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseRateType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid repurchase rate type."</li>
	 * </ul>
	 */
	public static final MMCode mmRepurchaseRateType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			definition = "Unrecognised or invalid repurchase rate type.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RERT";
		}
	};
	/**
	 * Unrecognised or invalid spread rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RSPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpreadRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid spread rate."</li>
	 * </ul>
	 */
	public static final MMCode mmSpreadRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Unrecognised or invalid spread rate.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RSPR";
		}
	};
	/**
	 * Traded securities quantity not provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TQNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedSecuritiesQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Traded securities quantity not provided."</li>
	 * </ul>
	 */
	public static final MMCode mmTradedSecuritiesQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedSecuritiesQuantity";
			definition = "Traded securities quantity not provided.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TQNP";
		}
	};
	/**
	 * Unrecognised or invalid trade date or requested trade date or future
	 * trade date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTRD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid trade date or requested trade date or future trade date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTradeDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DTRD";
		}
	};
	/**
	 * Receiving agent is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IVAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Receiving agent is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IVAG";
		}
	};
	/**
	 * Intermediary is not recognised or is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Intermediary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Intermediary is not recognised or is invalid."</li>
	 * </ul>
	 */
	public static final MMCode mmIntermediary = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INTE";
		}
	};
	/**
	 * Unrecognised or invalid place of trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLCE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid place of trade."</li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfTrade = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid place of trade.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PLCE";
		}
	};
	/**
	 * Investor name and address is not recognised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INUK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestorNameAddressUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Investor name and address is not recognised."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestorNameAddressUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INUK";
		}
	};
	/**
	 * Not possible to use the RTGS system instructed (NRTG or YRTG).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTGS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleToUseTheRTGSSystemInstructed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Not possible to use the RTGS system instructed (NRTG or YRTG)."</li>
	 * </ul>
	 */
	public static final MMCode mmImpossibleToUseTheRTGSSystemInstructed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "Not possible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RTGS";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountCurrencyRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement amount currency."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementAmountCurrencyRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NCRR";
		}
	};
	/**
	 * Unrecognised or invalid letter of guarantee indicator instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEOG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterOfGuaranteeIndicatorRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid letter of guarantee indicator instructed."</li>
	 * </ul>
	 */
	public static final MMCode mmLetterOfGuaranteeIndicatorRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIndicatorRejection";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "LEOG";
		}
	};
	/**
	 * Missing credit authorisation (for pre-release transactions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCreditAuthorisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Missing credit authorisation (for pre-release transactions)."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingCreditAuthorisation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditAuthorisation";
			definition = "Missing credit authorisation (for pre-release transactions).";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MCRA";
		}
	};
	/**
	 * Address details are incorrect or cannot be recognised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressDetailsRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Address details are incorrect or cannot be recognised."</li>
	 * </ul>
	 */
	public static final MMCode mmAddressDetailsRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressDetailsRejection";
			definition = "Address details are incorrect or cannot be recognised.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DADR";
		}
	};
	/**
	 * Physical settlement is impossible for the instructed financial
	 * instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PHYS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalSettlementImpossible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Physical settlement is impossible for the instructed financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPhysicalSettlementImpossible = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			definition = "Physical settlement is impossible for the instructed financial instrument.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PHYS";
		}
	};
	/**
	 * Instruction has a reference identical to another previously received
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has a reference identical to another previously received instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REFE";
		}
	};
	/**
	 * Unrecognised or invalid settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DMON"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement amount."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementAmountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DMON";
		}
	};
	/**
	 * Missing statutes or commercial register or other legal documents.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingStatutes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Missing statutes or commercial register or other legal documents."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingStatutes = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingStatutes";
			definition = "Missing statutes or commercial register or other legal documents.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "STAT";
		}
	};
	/**
	 * Financial instrument has not been stamped and/or duly signed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotStampedOrSigned"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument has not been stamped and/or duly signed."</li>
	 * </ul>
	 */
	public static final MMCode mmNotStampedOrSigned = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStampedOrSigned";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "STAM";
		}
	};
	/**
	 * Registration request does not have a valid signature of the owner of the
	 * financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration request does not have a valid signature of the owner of the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			definition = "Registration request does not have a valid signature of the owner of the financial instrument.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SIGN";
		}
	};
	/**
	 * Unrecognised or invalid shareholder number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareholderNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid shareholder number."</li>
	 * </ul>
	 */
	public static final MMCode mmShareholderNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareholderNumberRejection";
			definition = "Unrecognised or invalid shareholder number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SHAR";
		}
	};
	/**
	 * Quantity instructed is lower than the minimum existing settlement
	 * quantity for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMinimumSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MINO";
		}
	};
	/**
	 * More than one instruction match the criteria.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRGM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "More than one instruction match the criteria."</li>
	 * </ul>
	 */
	public static final MMCode mmNoMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "More than one instruction match the criteria.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NRGM";
		}
	};
	/**
	 * Missing legal power for transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MLEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingLegalPower"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Missing legal power for transfer."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingLegalPower = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingLegalPower";
			definition = "Missing legal power for transfer.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MLEG";
		}
	};
	/**
	 * Unrecognised or invalid processing batch, that is, daytime/real-time
	 * while only possible to settle in overnight batch.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BATC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingBatchRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProcessingBatchRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "BATC";
		}
	};
	/**
	 * Type of ownership indicated is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OWNT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOwnershipRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of ownership indicated is not correct."</li>
	 * </ul>
	 */
	public static final MMCode mmTypeOfOwnershipRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOwnershipRejection";
			definition = "Type of ownership indicated is not correct.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "OWNT";
		}
	};
	/**
	 * Quantity instructed is not a multiple of an existing settlement quantity
	 * lot for the financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MUNO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MultipleSettlementQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMultipleSettlementQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MUNO";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is wrong. You have used the registration request of a
	 * different issuer/registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWrongRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REQW";
		}
	};
	/**
	 * Unrecognised or invalid tax status of the securities instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxStatusRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid tax status of the securities instructed."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxStatusRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TXST";
		}
	};
	/**
	 * Registration reason indicated is not correct.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RREA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreementInRegistrationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Registration reason indicated is not correct."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreementInRegistrationReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementInRegistrationReason";
			definition = "Registration reason indicated is not correct.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RREA";
		}
	};
	/**
	 * Registration request to be completed by the buyer and to be forwarded to
	 * the issuer is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingRegistrationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Registration request to be completed by the buyer and to be forwarded to the issuer is missing."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMissingRegistrationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is missing.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REQM";
		}
	};
	/**
	 * Unrecognised or invalid settlement system/method instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementSystemMethodRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid settlement system/method instructed."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementSystemMethodRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SETS";
		}
	};
	/**
	 * Unrecognised, invalid or missing common reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IIND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonReferenceRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised, invalid or missing common reference."</li>
	 * </ul>
	 */
	public static final MMCode mmCommonReferenceRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IIND";
		}
	};
	/**
	 * Unrecognised or invalid service level agreement pre-agreed narrative
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INNA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeInformationRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid service level agreement pre-agreed narrative information."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNarrativeInformationRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			definition = "Unrecognised or invalid service level agreement pre-agreed narrative information.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INNA";
		}
	};
	/**
	 * Invalid or incorrect programme conversion specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectProgramConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid or incorrect programme conversion specified."</li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectProgramConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectProgramConversion";
			definition = "Invalid or incorrect programme conversion specified.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ICOP";
		}
	};
	/**
	 * Insufficient collateral proposed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICOL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient collateral proposed."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientCollateral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			definition = "Insufficient collateral proposed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ICOL";
		}
	};
	/**
	 * Unrecognised or invalid business partner number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BPAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessPartnerNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid business partner number."</li>
	 * </ul>
	 */
	public static final MMCode mmBusinessPartnerNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessPartnerNumberRejection";
			definition = "Unrecognised or invalid business partner number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "BPAR";
		}
	};
	/**
	 * Unrecognised or invalid bank reference number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BREF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankReferenceNumberRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid bank reference number."</li>
	 * </ul>
	 */
	public static final MMCode mmBankReferenceNumberRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReferenceNumberRejection";
			definition = "Unrecognised or invalid bank reference number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "BREF";
		}
	};
	/**
	 * Unrecognised or invalid type of order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BUSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfOrderRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid type of order."</li>
	 * </ul>
	 */
	public static final MMCode mmTypeOfOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRejection";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "BUSE";
		}
	};
	/**
	 * Corporate action pending on the financial instrument instructed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAEV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action pending on the financial instrument instructed."</li>
	 * </ul>
	 */
	public static final MMCode mmCorporateActionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CAEV";
		}
	};
	/**
	 * Impossible standing arrangements override instruction for the cash
	 * settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImpossibleCashSettlementSystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Impossible standing arrangements override instruction for the cash settlement system."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmImpossibleCashSettlementSystem = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			definition = "Impossible standing arrangements override instruction for the cash settlement system.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CASY";
		}
	};
	/**
	 * Unrecognised or invalid commercialisation contract.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommercializationContractRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid commercialisation contract."</li>
	 * </ul>
	 */
	public static final MMCode mmCommercializationContractRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			definition = "Unrecognised or invalid commercialisation contract.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "COMC";
		}
	};
	/**
	 * Concentration limit was exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConcentrationLimitExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Concentration limit was exceeded."</li>
	 * </ul>
	 */
	public static final MMCode mmConcentrationLimitExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			definition = "Concentration limit was exceeded.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CONL";
		}
	};
	/**
	 * Deal or exposure is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPTY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownDealExposure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deal or exposure is unknown."</li>
	 * </ul>
	 */
	public static final MMCode mmUnknownDealExposure = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownDealExposure";
			definition = "Deal or exposure is unknown.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CPTY";
		}
	};
	/**
	 * Unrecognised or invalid settlement date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DDAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDateRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement date."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementDateRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DDAT";
		}
	};
	/**
	 * Party does not agree with the call amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party does not agree with the call amount."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreeWithCallAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithCallAmount";
			definition = "Party does not agree with the call amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DISC";
		}
	};
	/**
	 * Party does not agree with the exposure amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisagreeWithExposureAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party does not agree with the exposure amount."</li>
	 * </ul>
	 */
	public static final MMCode mmDisagreeWithExposureAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithExposureAmount";
			definition = "Party does not agree with the exposure amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DISE";
		}
	};
	/**
	 * Disagreement between the data on the registration request and the order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DORD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationRequestDataAndOrderRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disagreement between the data on the registration request and the order."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRegistrationRequestDataAndOrderRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			definition = "Disagreement between the data on the registration request and the order.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DORD";
		}
	};
	/**
	 * Unrecognised or invalid fee or commission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FeeCommissionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid fee or commission."</li>
	 * </ul>
	 */
	public static final MMCode mmFeeCommissionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRejection";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "FEEE";
		}
	};
	/**
	 * Incorrect activity type specified, for example, pre-release conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectActivityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Incorrect activity type specified, for example, pre-release conversion."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectActivityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectActivityType";
			definition = "Incorrect activity type specified, for example, pre-release conversion.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IACT";
		}
	};
	/**
	 * Unrecognised or invalid settlement transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTransactionRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid settlement transaction type."</li>
	 * </ul>
	 */
	public static final MMCode mmSettlementTransactionRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SETR";
		}
	};
	/**
	 * Unrecognised or invalid closing date/time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TERM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingDateTimeRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid closing date/time."</li>
	 * </ul>
	 */
	public static final MMCode mmClosingDateTimeRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TERM";
		}
	};
	/**
	 * Unrecognised or invalid variable rate support (repurchase agreement).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VASU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VariableRateSupportRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid variable rate support (repurchase agreement)."</li>
	 * </ul>
	 */
	public static final MMCode mmVariableRateSupportRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "VASU";
		}
	};
	/**
	 * Second option is mandatory.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Second option is mandatory."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOption";
			definition = "Second option is mandatory.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SECO";
		}
	};
	/**
	 * Party is not defined as an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotDefinedAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party is not defined as an agent."</li>
	 * </ul>
	 */
	public static final MMCode mmNotDefinedAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDefinedAgent";
			definition = "Party is not defined as an agent.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "AGID";
		}
	};
	/**
	 * Period ending date or code is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period ending date or code is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingPeriodEndDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodEndDate";
			definition = "Period ending date or code is missing.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ENDP";
		}
	};
	/**
	 * Period starting date or code is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingPeriodStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period starting date or code is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingPeriodStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodStartDate";
			definition = "Period starting date or code is missing.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "STAR";
		}
	};
	/**
	 * Resulting amount must be filled in as exchange rate is present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingResultingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Resulting amount must be filled in as exchange rate is present."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingResultingAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResultingAmount";
			definition = "Resulting amount must be filled in as exchange rate is present.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RESU";
		}
	};
	/**
	 * Security type does not match with the type of corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongSecurityType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security type does not match with the type of corporate action."</li>
	 * </ul>
	 */
	public static final MMCode mmWrongSecurityType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSecurityType";
			definition = "Security type does not match with the type of corporate action.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SECT";
		}
	};
	/**
	 * Disperse security is not eligible in the (ICSD) service provider owner.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotEligibleDisperseSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Disperse security is not eligible in the (ICSD) service provider owner."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotEligibleDisperseSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleDisperseSecurity";
			definition = "Disperse security is not eligible in the (ICSD) service provider owner.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DISP";
		}
	};
	/**
	 * Security is not eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELIG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security is not eligible."</li>
	 * </ul>
	 */
	public static final MMCode mmNonEligibleSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleSecurity";
			definition = "Security is not eligible.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ELIG";
		}
	};
	/**
	 * Resulting amount is not allowed without an exchange rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XRAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Resulting amount is not allowed without an exchange rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMissingExchangeRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingExchangeRate";
			definition = "Resulting amount is not allowed without an exchange rate.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "XRAT";
		}
	};
	/**
	 * Value date is before payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDateBeforePaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value date is before payment date."</li>
	 * </ul>
	 */
	public static final MMCode mmValueDateBeforePaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateBeforePaymentDate";
			definition = "Value date is before payment date.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "VALU";
		}
	};
	/**
	 * Accrued interest is not applicable for this type of security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACRU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedAccruedInterest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accrued interest is not applicable for this type of security."</li>
	 * </ul>
	 */
	public static final MMCode mmUnexpectedAccruedInterest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedAccruedInterest";
			definition = "Accrued interest is not applicable for this type of security.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ACRU";
		}
	};
	/**
	 * Agent has no access to the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAccessToService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agent has no access to the service."</li>
	 * </ul>
	 */
	public static final MMCode mmNoAccessToService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccessToService";
			definition = "Agent has no access to the service.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * Instruction is rejected since the provided certification is incorrect or
	 * incomplete.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction is rejected since the provided certification is incorrect or incomplete."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIncorrectCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCertification";
			definition = "Instruction is rejected since the provided certification is incorrect or incomplete.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Date is not a business day for the security market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotBusinessDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date is not a business day for the security market."</li>
	 * </ul>
	 */
	public static final MMCode mmNotBusinessDay = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotBusinessDay";
			definition = "Date is not a business day for the security market.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "BDAY";
		}
	};
	/**
	 * Effective date is after the payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDAY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveDayAfterPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Effective date is after the payment date."</li>
	 * </ul>
	 */
	public static final MMCode mmEffectiveDayAfterPaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDayAfterPaymentDate";
			definition = "Effective date is after the payment date.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PDAY";
		}
	};
	/**
	 * Gross amount is less than net amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GAMN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmountLessThanNetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Gross amount is less than net amount."</li>
	 * </ul>
	 */
	public static final MMCode mmGrossAmountLessThanNetAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			definition = "Gross amount is less than net amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "GAMN";
		}
	};
	/**
	 * One option must be marked as the default.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingDefaultOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "One option must be marked as the default."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingDefaultOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDefaultOption";
			definition = "One option must be marked as the default.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Party is not active.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonActiveParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party is not active."</li>
	 * </ul>
	 */
	public static final MMCode mmNonActiveParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonActiveParty";
			definition = "Party is not active.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NPAT";
		}
	};
	/**
	 * Period ending date is before period starting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PeriodEndDateBeforeStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period ending date is before period starting date."</li>
	 * </ul>
	 */
	public static final MMCode mmPeriodEndDateBeforeStartDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			definition = "Period ending date is before period starting date.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PERI";
		}
	};
	/**
	 * Record date is after payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RDTE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateAfterPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record date is after payment date."</li>
	 * </ul>
	 */
	public static final MMCode mmRecordDateAfterPaymentDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDateAfterPaymentDate";
			definition = "Record date is after payment date.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "RDTE";
		}
	};
	/**
	 * Validation of the advice/instruction/request failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailedValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validation of the advice/instruction/request failed."</li>
	 * </ul>
	 */
	public static final MMCode mmFailedValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			definition = "Validation of the advice/instruction/request failed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "FAIL";
		}
	};
	/**
	 * Rejected as the deactivation of the event is already completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventAlreadyDeactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rejected as the deactivation of the event is already completed."</li>
	 * </ul>
	 */
	public static final MMCode mmEventAlreadyDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventAlreadyDeactivated";
			definition = "Rejected as the deactivation of the event is already completed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DEAC";
		}
	};
	/**
	 * Cancellation request is rejected as there is no pending deactivation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoPendingDeactivationInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cancellation request is rejected as there is no pending deactivation instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoPendingDeactivationInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPendingDeactivationInstruction";
			definition = "Cancellation request is rejected as there is no pending deactivation instruction.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PDEA";
		}
	};
	/**
	 * Amendment is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amendment is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmAmendmentNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentNotAllowed";
			definition = "Amendment is not allowed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NAMD";
		}
	};
	/**
	 * Cancellation is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cancellation is not allowed."</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationNotAllowed";
			definition = "Cancellation is not allowed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NCAN";
		}
	};
	/**
	 * Instruction/Request arrives too late.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Late"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction/Request arrives too late."</li>
	 * </ul>
	 */
	public static final MMCode mmLate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			definition = "Instruction/Request arrives too late.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "LATT";
		}
	};
	/**
	 * Election advice is already cancelled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAlreadyCancelled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election advice is already cancelled."</li>
	 * </ul>
	 */
	public static final MMCode mmElectionAlreadyCancelled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyCancelled";
			definition = "Election advice is already cancelled.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ELEC";
		}
	};
	/**
	 * Election advice is already amended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ELEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectionAlreadyAmended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Election advice is already amended."</li>
	 * </ul>
	 */
	public static final MMCode mmElectionAlreadyAmended = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyAmended";
			definition = "Election advice is already amended.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ELEA";
		}
	};
	/**
	 * Agent corporate action deactivation instruction with the same
	 * identification already exists.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameCAIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent corporate action deactivation instruction with the same identification already exists."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSameCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameCAIdentification";
			definition = "Agent corporate action deactivation instruction with the same identification already exists.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SAME";
		}
	};
	/**
	 * Invalid corporate action identification supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REFI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCAIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid corporate action identification supplied."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			definition = "Invalid corporate action identification supplied.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "REFI";
		}
	};
	/**
	 * Invalid agent identification supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AGIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid agent identification supplied."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			definition = "Invalid agent identification supplied.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "AGIN";
		}
	};
	/**
	 * Agent identification specified does not correspond to the main agent of
	 * the relating event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MAIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotMainAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent identification specified does not correspond to the main agent of the relating event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotMainAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotMainAgent";
			definition = "Agent identification specified does not correspond to the main agent of the relating event.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MAIN";
		}
	};
	/**
	 * Invalid combination of corporate action option code and corporate action
	 * option number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invalid combination of corporate action option code and corporate action option number."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOption";
			definition = "Invalid combination of corporate action option code and corporate action option number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "OPTI";
		}
	};
	/**
	 * Specified corporate action option already has a pending deactivation
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PEDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingDeactivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specified corporate action option already has a pending deactivation instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPendingDeactivation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeactivation";
			definition = "Specified corporate action option already has a pending deactivation instruction.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PEDA";
		}
	};
	/**
	 * Unable to identify cash account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CASA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to identify cash account."</li>
	 * </ul>
	 */
	public static final MMCode mmNotIdentifiedCashAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCashAccount";
			definition = "Unable to identify cash account.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CASA";
		}
	};
	/**
	 * Unable to identify correspondent bank.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotIdentifiedCorrespondentBank"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unable to identify correspondent bank."</li>
	 * </ul>
	 */
	public static final MMCode mmNotIdentifiedCorrespondentBank = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			definition = "Unable to identify correspondent bank.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CORR";
		}
	};
	/**
	 * Invalid standing instruction type for the specified underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidStandingInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invalid standing instruction type for the specified underlying security."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidStandingInstructionType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidStandingInstructionType";
			definition = "Invalid standing instruction type for the specified underlying security.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "STAN";
		}
	};
	/**
	 * No holding for the specified underlying security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No holding for the specified underlying security."</li>
	 * </ul>
	 */
	public static final MMCode mmNoHolding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoHolding";
			definition = "No holding for the specified underlying security.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NOHO";
		}
	};
	/**
	 * Insufficient balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INHO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Insufficient balance."</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientBalance";
			definition = "Insufficient balance.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INHO";
		}
	};
	/**
	 * Several messages with the same identification.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SameIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Several messages with the same identification."</li>
	 * </ul>
	 */
	public static final MMCode mmSameIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			definition = "Several messages with the same identification.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SAID";
		}
	};
	/**
	 * Rejected as the deactivation of the option is already completed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEAO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionAlreadyDeactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rejected as the deactivation of the option is already completed."</li>
	 * </ul>
	 */
	public static final MMCode mmOptionAlreadyDeactivated = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAlreadyDeactivated";
			definition = "Rejected as the deactivation of the option is already completed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DEAO";
		}
	};
	/**
	 * Corporate action event type does not correspond with the relating
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event type does not correspond with the relating corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidEventType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventType";
			definition = "Corporate action event type does not correspond with the relating corporate action.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INET";
		}
	};
	/**
	 * Underlying security identification does not correspond with the corporate
	 * action reference supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidUnderlyingSecurity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying security identification does not correspond with the corporate action reference supplied."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidUnderlyingSecurity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			definition = "Underlying security identification does not correspond with the corporate action reference supplied.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INUS";
		}
	};
	/**
	 * Event processing type does not correspond with the relating corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidEventProcessingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event processing type does not correspond with the relating corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidEventProcessingType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventProcessingType";
			definition = "Event processing type does not correspond with the relating corporate action.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INPT";
		}
	};
	/**
	 * Mandatory/voluntary event type does not correspond with the relating
	 * corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INMV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMandatoryVoluntaryEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Mandatory/voluntary event type does not correspond with the relating corporate action."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMandatoryVoluntaryEventType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			definition = "Mandatory/voluntary event type does not correspond with the relating corporate action.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INMV";
		}
	};
	/**
	 * Details specified in the corporate action general information block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCorporateActionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details specified in the corporate action general information block are inconsistent with those that were specified in the relating original message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCorporateActionInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCorporateActionInformation";
			definition = "Details specified in the corporate action general information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INDE";
		}
	};
	/**
	 * Message details specified in the instruction/request are inconsistent
	 * with those that were specified in the relating original message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDetails";
			definition = "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INDT";
		}
	};
	/**
	 * Specified corporate action has no remaining option to disable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NORO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoRemainingOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specified corporate action has no remaining option to disable."</li>
	 * </ul>
	 */
	public static final MMCode mmNoRemainingOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRemainingOption";
			definition = "Specified corporate action has no remaining option to disable.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NORO";
		}
	};
	/**
	 * Issuer corporate action identification does not correspond with the
	 * corporate action identification supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MICA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MismatchedCAIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Issuer corporate action identification does not correspond with the corporate action identification supplied."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMismatchedCAIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchedCAIdentification";
			definition = "Issuer corporate action identification does not correspond with the corporate action identification supplied.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MICA";
		}
	};
	/**
	 * Instruction type is not applicable for mandatory events.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotApplicable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction type is not applicable for mandatory events."</li>
	 * </ul>
	 */
	public static final MMCode mmNotApplicable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			definition = "Instruction type is not applicable for mandatory events.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NOAP";
		}
	};
	/**
	 * Details specified in the movement general information block are
	 * inconsistent with those that were specified in the relating original
	 * message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMovementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details specified in the movement general information block are inconsistent with those that were specified in the relating original message."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMovementInformation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMovementInformation";
			definition = "Details specified in the movement general information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INMO";
		}
	};
	/**
	 * One or more of the underlying movements have already settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MOSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementAlreadySettled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One or more of the underlying movements have already settled."</li>
	 * </ul>
	 */
	public static final MMCode mmMovementAlreadySettled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementAlreadySettled";
			definition = "One or more of the underlying movements have already settled.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MOSE";
		}
	};
	/**
	 * See narrative field for reason.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NARR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NarrativeReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "See narrative field for reason."</li>
	 * </ul>
	 */
	public static final MMCode mmNarrativeReason = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NARR";
		}
	};
	/**
	 * Instruction contains an invalid message identification, identification is
	 * unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction contains an invalid message identification, identification is unknown."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			definition = "Instruction contains an invalid message identification, identification is unknown.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INID";
		}
	};
	/**
	 * Certification has not been filled in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certification has not been filled in."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingCertification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			definition = "Certification has not been filled in.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MCER";
		}
	};
	/**
	 * Required stamp duty information is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LackOfStampDuty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Required stamp duty information is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmLackOfStampDuty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			definition = "Required stamp duty information is missing.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "SDUT";
		}
	};
	/**
	 * Statement/status advice request cannot be executed. The message type
	 * requested is not valid for the message reference or statement period
	 * concerned.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRequest";
			definition = "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "MISM";
		}
	};
	/**
	 * Unrecognised, invalid or missing place of safekeeping.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INPS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfSafekeeping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised, invalid or missing place of safekeeping."</li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfSafekeeping = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Unrecognised, invalid or missing place of safekeeping.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INPS";
		}
	};
	/**
	 * Other. See Narrative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other. See Narrative."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Unrecognised or invalid client of delivering or receiving party 2.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "IEXE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid client of delivering or receiving party 2."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringParty3 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Unrecognised or invalid client of delivering or receiving party 2.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "IEXE";
		}
	};
	/**
	 * Unrecognised or invalid client of delivering or receiving party 1.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICUS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid client of delivering or receiving party 1."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringParty2 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Unrecognised or invalid client of delivering or receiving party 1.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ICUS";
		}
	};
	/**
	 * Unrecognised or invalid participant of delivering or receiving
	 * depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICAG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringParty1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid participant of delivering or receiving depository."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringParty1 = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Unrecognised or invalid participant of delivering or receiving depository.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ICAG";
		}
	};
	/**
	 * Unrecognised or invalid depository.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DEPT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingDeliveringDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid depository."</li>
	 * </ul>
	 */
	public static final MMCode mmReceivingDeliveringDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Unrecognised or invalid depository.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DEPT";
		}
	};
	/**
	 * Invalid or unrecognized modification request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidModificationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid or unrecognized modification request."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidModificationRequest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidModificationRequest";
			definition = "Invalid or unrecognized modification request.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INVM";
		}
	};
	/**
	 * Invalid or unrecognized link.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLink"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid or unrecognized link."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidLink = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLink";
			definition = "Invalid or unrecognized link.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INVL";
		}
	};
	/**
	 * Instruction aims at using an invalid balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction aims at using  an invalid balance."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBalance";
			definition = "Instruction aims at using  an invalid balance.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INVB";
		}
	};
	/**
	 * Invalid or unrecognized lot number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidLotNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid or unrecognized lot number."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidLotNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLotNumber";
			definition = "Invalid or unrecognized lot number.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INVN";
		}
	};
	/**
	 * Account servicer validation rule rejection.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VALR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account servicer validation rule rejection."</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidRule = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRule";
			definition = "Account servicer validation rule rejection.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "VALR";
		}
	};
	/**
	 * Unrecognised or invalid place of listing. Used when the security
	 * identified is not listed on the market supplied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLIS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid place of listing. Used when the security identified is not listed on the market supplied."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPlaceOfListing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Unrecognised or invalid place of listing. Used when the security identified is not listed on the market supplied.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "PLIS";
		}
	};
	/**
	 * Unrecognised or invalid investor party. May be used by an executing party
	 * to reject an instruction for an investor (or portfolio) for which it is
	 * not authorised to act.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INVE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidInvestorParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unrecognised or invalid investor party. May be used by an executing party to reject an instruction for an investor (or portfolio) for which it is not authorised to act."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidInvestorParty = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			definition = "Unrecognised or invalid investor party. May be used by an executing party to reject an instruction for an investor (or portfolio) for which it is not authorised to act.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "INVE";
		}
	};
	/**
	 * Rejected due to missing beneficiary owner details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingBeneficiaryOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejected due to missing beneficiary owner details."</li>
	 * </ul>
	 */
	public static final MMCode mmMissingBeneficiaryOwnerDetails = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingBeneficiaryOwnerDetails";
			definition = "Rejected due to missing beneficiary owner details.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "FULL";
		}
	};
	/**
	 * Unrecognised or invalid closing closing amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingTransactionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid closing closing amount."</li>
	 * </ul>
	 */
	public static final MMCode mmClosingTransactionAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing closing amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "CTRA";
		}
	};
	/**
	 * Order entry date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateNotProvided"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order entry date is missing."</li>
	 * </ul>
	 */
	public static final MMCode mmOrderDateNotProvided = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateNotProvided";
			definition = "Order entry date is missing.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "ODNP";
		}
	};
	/**
	 * Market member executed the order exceeding the requested quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TQHI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradedQuantityHigherThanOriginalOrderQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Market member executed the order exceeding the requested quantity."</li>
	 * </ul>
	 */
	public static final MMCode mmTradedQuantityHigherThanOriginalOrderQuantity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedQuantityHigherThanOriginalOrderQuantity";
			definition = "Market member executed the order exceeding the requested quantity.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TQHI";
		}
	};
	/**
	 * A message with the same Transaction Notice Reference, Market Member, and
	 * Intermediary has already been processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNoticeAlreadyAcceptedOrRejected"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTransactionNoticeAlreadyAcceptedOrRejected = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeAlreadyAcceptedOrRejected";
			definition = "A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TNAR";
		}
	};
	/**
	 * The combination of the Transaction Notice Reference, Market Member, and
	 * Intermediary is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNIU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionNoticeIDUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTransactionNoticeIDUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeIDUnknown";
			definition = "The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "TNIU";
		}
	};
	/**
	 * Reason is not available or unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NTAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason is not available or unknown."</li>
	 * </ul>
	 */
	public static final MMCode mmNotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Reason is not available or unknown.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "NTAV";
		}
	};
	/**
	 * Unrecognised or invalid instructed cash amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQCS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unrecognised or invalid instructed cash amount."</li>
	 * </ul>
	 */
	public static final MMCode mmAmountRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountRejection";
			definition = "Unrecognised or invalid instructed cash amount.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DQCS";
		}
	};
	/**
	 * Invalid instructed currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid instructed currency."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyRejection";
			definition = "Invalid instructed currency.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DQCC";
		}
	};
	/**
	 * Invalid use of instructed amount (QCAS) or of instructed quantity (QINS)
	 * qualifiers.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code
	 * RejectionReasonV3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DQAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionTypeRejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Invalid use of instructed amount (QCAS) or of instructed quantity (QINS) qualifiers."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInstructionTypeRejection = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionTypeRejection";
			definition = "Invalid use of instructed amount (QCAS) or of instructed quantity (QINS) qualifiers.";
			owner_lazy = () -> RejectionReasonV3Code.mmObject();
			codeName = "DQAM";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("ULNK");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "RejectionReasonV3Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReasonV3Code.mmInsufficientMoney, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidReference,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmSafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInsufficientTresholdPosition,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmQuantityRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmAccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmSplitVoteNotAllowed, com.tools20022.repository.codeset.RejectionReasonV3Code.mmPartialVoteNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingOrInvalidPOA, com.tools20022.repository.codeset.RejectionReasonV3Code.mmProxyCardDiscrepancy,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmRegistrationDiscrepancy, com.tools20022.repository.codeset.RejectionReasonV3Code.mmRejectedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidSecurity, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInstructionIrrevocable,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmOptionCancelled, com.tools20022.repository.codeset.RejectionReasonV3Code.mmOptionInactive,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidForTaxAuthorities, com.tools20022.repository.codeset.RejectionReasonV3Code.mmRefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmLackofSecurities, com.tools20022.repository.codeset.RejectionReasonV3Code.mmMarketDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMismatch, com.tools20022.repository.codeset.RejectionReasonV3Code.mmOptionNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidOptionType, com.tools20022.repository.codeset.RejectionReasonV3Code.mmRejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmRejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReasonV3Code.mmUnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmUnknownSymbol, com.tools20022.repository.codeset.RejectionReasonV3Code.mmClosedExchange,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmExceedsLimit, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTooLate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidPrice,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotAuthorised, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoMatchInquiry,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoInstrumentMarket, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoInventory, com.tools20022.repository.codeset.RejectionReasonV3Code.mmPass,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmPriceExceeds, com.tools20022.repository.codeset.RejectionReasonV3Code.mmQuantityExceeds, com.tools20022.repository.codeset.RejectionReasonV3Code.mmWrongSide,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmCalculationDifference, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInsufficientCredit,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmAgreementStartDate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTransactionCallDelay,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmCashAccount, com.tools20022.repository.codeset.RejectionReasonV3Code.mmDealPrice, com.tools20022.repository.codeset.RejectionReasonV3Code.mmForfeitAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmDeliveringCustodian, com.tools20022.repository.codeset.RejectionReasonV3Code.mmReceivingCustodian,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotFoundRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmQuantityUnitType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmTerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.mmRepurchaseRate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmPremiumAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.mmRepurchaseRateType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmSpreadRate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTradedSecuritiesQuantity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmTradeDate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmReceivingAgent, com.tools20022.repository.codeset.RejectionReasonV3Code.mmIntermediary,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmPlaceOfTrade, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvestorNameAddressUnknown,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmImpossibleToUseTheRTGSSystemInstructed, com.tools20022.repository.codeset.RejectionReasonV3Code.mmSettlementAmountCurrencyRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmLetterOfGuaranteeIndicatorRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingCreditAuthorisation,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmAddressDetailsRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmPhysicalSettlementImpossible,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmReferenceRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmSettlementAmountRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingStatutes, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotStampedOrSigned,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidSignature, com.tools20022.repository.codeset.RejectionReasonV3Code.mmShareholderNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMinimumSettlementQuantity, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoMatch,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingLegalPower, com.tools20022.repository.codeset.RejectionReasonV3Code.mmProcessingBatchRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmTypeOfOwnershipRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmMultipleSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmWrongRegistrationRequest, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTaxStatusRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmDisagreementInRegistrationReason, com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmSettlementSystemMethodRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmCommonReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNarrativeInformationRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmIncorrectProgramConversion,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInsufficientCollateral, com.tools20022.repository.codeset.RejectionReasonV3Code.mmBusinessPartnerNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmBankReferenceNumberRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTypeOfOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmCorporateActionRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmImpossibleCashSettlementSystem,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmCommercializationContractRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmConcentrationLimitExceeded,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmUnknownDealExposure, com.tools20022.repository.codeset.RejectionReasonV3Code.mmSettlementDateRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmDisagreeWithCallAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.mmDisagreeWithExposureAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmRegistrationRequestDataAndOrderRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmFeeCommissionRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmIncorrectActivityType, com.tools20022.repository.codeset.RejectionReasonV3Code.mmSettlementTransactionRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmClosingDateTimeRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmVariableRateSupportRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingOption, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotDefinedAgent,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingPeriodEndDate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingPeriodStartDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingResultingAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.mmWrongSecurityType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotEligibleDisperseSecurity, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNonEligibleSecurity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingExchangeRate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmValueDateBeforePaymentDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmUnexpectedAccruedInterest, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoAccessToService,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmIncorrectCertification, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotBusinessDay,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmEffectiveDayAfterPaymentDate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmGrossAmountLessThanNetAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingDefaultOption, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNonActiveParty,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmPeriodEndDateBeforeStartDate, com.tools20022.repository.codeset.RejectionReasonV3Code.mmRecordDateAfterPaymentDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmFailedValidation, com.tools20022.repository.codeset.RejectionReasonV3Code.mmEventAlreadyDeactivated,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoPendingDeactivationInstruction, com.tools20022.repository.codeset.RejectionReasonV3Code.mmAmendmentNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmCancellationNotAllowed, com.tools20022.repository.codeset.RejectionReasonV3Code.mmLate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmElectionAlreadyCancelled, com.tools20022.repository.codeset.RejectionReasonV3Code.mmElectionAlreadyAmended,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmSameCAIdentification, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidAgent, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotMainAgent,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidOption, com.tools20022.repository.codeset.RejectionReasonV3Code.mmPendingDeactivation,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotIdentifiedCashAccount, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotIdentifiedCorrespondentBank,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidStandingInstructionType, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoHolding,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInsufficientBalance, com.tools20022.repository.codeset.RejectionReasonV3Code.mmSameIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmOptionAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidEventType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidUnderlyingSecurity, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidEventProcessingType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidMandatoryVoluntaryEventType, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidCorporateActionInformation,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidDetails, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNoRemainingOption,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMismatchedCAIdentification, com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotApplicable,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidMovementInformation, com.tools20022.repository.codeset.RejectionReasonV3Code.mmMovementAlreadySettled,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNarrativeReason, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingCertification, com.tools20022.repository.codeset.RejectionReasonV3Code.mmLackOfStampDuty,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidRequest, com.tools20022.repository.codeset.RejectionReasonV3Code.mmPlaceOfSafekeeping,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmOther, com.tools20022.repository.codeset.RejectionReasonV3Code.mmReceivingDeliveringParty3,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmReceivingDeliveringParty2, com.tools20022.repository.codeset.RejectionReasonV3Code.mmReceivingDeliveringParty1,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmReceivingDeliveringDepository, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidModificationRequest,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidLink, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidBalance,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidLotNumber, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidRule,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmPlaceOfListing, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInvalidInvestorParty,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmMissingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.RejectionReasonV3Code.mmClosingTransactionAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmOrderDateNotProvided, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTradedQuantityHigherThanOriginalOrderQuantity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmTransactionNoticeAlreadyAcceptedOrRejected, com.tools20022.repository.codeset.RejectionReasonV3Code.mmTransactionNoticeIDUnknown,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmNotAvailable, com.tools20022.repository.codeset.RejectionReasonV3Code.mmAmountRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.mmCurrencyRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.mmInstructionTypeRejection);
				derivation_lazy = () -> Arrays.asList(PendingCancellationReason5Code.mmObject(), RejectionReason46Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}