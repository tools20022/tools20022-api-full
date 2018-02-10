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
import com.tools20022.repository.codeset.RejectionReasonV3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InsufficientMoney
 * RejectionReasonV3Code.InsufficientMoney}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidReference
 * RejectionReasonV3Code.InvalidReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SafekeepingAccountRejection
 * RejectionReasonV3Code.SafekeepingAccountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InsufficientTresholdPosition
 * RejectionReasonV3Code.InsufficientTresholdPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#QuantityRejection
 * RejectionReasonV3Code.QuantityRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#AccountServicerDeadlineMissed
 * RejectionReasonV3Code.AccountServicerDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SplitVoteNotAllowed
 * RejectionReasonV3Code.SplitVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PartialVoteNotAllowed
 * RejectionReasonV3Code.PartialVoteNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingOrInvalidPOA
 * RejectionReasonV3Code.MissingOrInvalidPOA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ProxyCardDiscrepancy
 * RejectionReasonV3Code.ProxyCardDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RegistrationDiscrepancy
 * RejectionReasonV3Code.RegistrationDiscrepancy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RejectedByIssuerOrRegistrar
 * RejectionReasonV3Code.RejectedByIssuerOrRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidSecurity
 * RejectionReasonV3Code.InvalidSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InstructionIrrevocable
 * RejectionReasonV3Code.InstructionIrrevocable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#OptionCancelled
 * RejectionReasonV3Code.OptionCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#OptionInactive
 * RejectionReasonV3Code.OptionInactive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidForTaxAuthorities
 * RejectionReasonV3Code.InvalidForTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RefusedByTaxAuthorities
 * RejectionReasonV3Code.RefusedByTaxAuthorities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#LackofSecurities
 * RejectionReasonV3Code.LackofSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MarketDeadlineMissed
 * RejectionReasonV3Code.MarketDeadlineMissed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#Mismatch
 * RejectionReasonV3Code.Mismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#OptionNumberRejection
 * RejectionReasonV3Code.OptionNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidOptionType
 * RejectionReasonV3Code.InvalidOptionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RejectedSinceAlreadyCancelled
 * RejectionReasonV3Code.RejectedSinceAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RejectedSinceInProgress
 * RejectionReasonV3Code.RejectedSinceInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#UnrecognisedIdentification
 * RejectionReasonV3Code.UnrecognisedIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#UnknownSymbol
 * RejectionReasonV3Code.UnknownSymbol}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ClosedExchange
 * RejectionReasonV3Code.ClosedExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ExceedsLimit
 * RejectionReasonV3Code.ExceedsLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TooLate
 * RejectionReasonV3Code.TooLate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidPrice
 * RejectionReasonV3Code.InvalidPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotAuthorised
 * RejectionReasonV3Code.NotAuthorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoMatchInquiry
 * RejectionReasonV3Code.NoMatchInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoInstrumentMarket
 * RejectionReasonV3Code.NoInstrumentMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoInventory
 * RejectionReasonV3Code.NoInventory}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#Pass
 * RejectionReasonV3Code.Pass}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PriceExceeds
 * RejectionReasonV3Code.PriceExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#QuantityExceeds
 * RejectionReasonV3Code.QuantityExceeds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#WrongSide
 * RejectionReasonV3Code.WrongSide}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CalculationDifference
 * RejectionReasonV3Code.CalculationDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InsufficientCredit
 * RejectionReasonV3Code.InsufficientCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#AgreementStartDate
 * RejectionReasonV3Code.AgreementStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TransactionCallDelay
 * RejectionReasonV3Code.TransactionCallDelay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CashAccount
 * RejectionReasonV3Code.CashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#DealPrice
 * RejectionReasonV3Code.DealPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ForfeitAmount
 * RejectionReasonV3Code.ForfeitAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#DeliveringCustodian
 * RejectionReasonV3Code.DeliveringCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReceivingCustodian
 * RejectionReasonV3Code.ReceivingCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotFoundRejection
 * RejectionReasonV3Code.NotFoundRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#QuantityUnitType
 * RejectionReasonV3Code.QuantityUnitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TerminationTransactionAmount
 * RejectionReasonV3Code.TerminationTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RepurchaseRate
 * RejectionReasonV3Code.RepurchaseRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PremiumAmount
 * RejectionReasonV3Code.PremiumAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RepurchaseRateType
 * RejectionReasonV3Code.RepurchaseRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SpreadRate
 * RejectionReasonV3Code.SpreadRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TradedSecuritiesQuantity
 * RejectionReasonV3Code.TradedSecuritiesQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TradeDate
 * RejectionReasonV3Code.TradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReceivingAgent
 * RejectionReasonV3Code.ReceivingAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#Intermediary
 * RejectionReasonV3Code.Intermediary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PlaceOfTrade
 * RejectionReasonV3Code.PlaceOfTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvestorNameAddressUnknown
 * RejectionReasonV3Code.InvestorNameAddressUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ImpossibleToUseTheRTGSSystemInstructed
 * RejectionReasonV3Code.ImpossibleToUseTheRTGSSystemInstructed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SettlementAmountCurrencyRejection
 * RejectionReasonV3Code.SettlementAmountCurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#LetterOfGuaranteeIndicatorRejection
 * RejectionReasonV3Code.LetterOfGuaranteeIndicatorRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingCreditAuthorisation
 * RejectionReasonV3Code.MissingCreditAuthorisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#AddressDetailsRejection
 * RejectionReasonV3Code.AddressDetailsRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PhysicalSettlementImpossible
 * RejectionReasonV3Code.PhysicalSettlementImpossible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReferenceRejection
 * RejectionReasonV3Code.ReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SettlementAmountRejection
 * RejectionReasonV3Code.SettlementAmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingStatutes
 * RejectionReasonV3Code.MissingStatutes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotStampedOrSigned
 * RejectionReasonV3Code.NotStampedOrSigned}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidSignature
 * RejectionReasonV3Code.InvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ShareholderNumberRejection
 * RejectionReasonV3Code.ShareholderNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MinimumSettlementQuantity
 * RejectionReasonV3Code.MinimumSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoMatch
 * RejectionReasonV3Code.NoMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingLegalPower
 * RejectionReasonV3Code.MissingLegalPower}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ProcessingBatchRejection
 * RejectionReasonV3Code.ProcessingBatchRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TypeOfOwnershipRejection
 * RejectionReasonV3Code.TypeOfOwnershipRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MultipleSettlementQuantity
 * RejectionReasonV3Code.MultipleSettlementQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#WrongRegistrationRequest
 * RejectionReasonV3Code.WrongRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TaxStatusRejection
 * RejectionReasonV3Code.TaxStatusRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#DisagreementInRegistrationReason
 * RejectionReasonV3Code.DisagreementInRegistrationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingRegistrationRequest
 * RejectionReasonV3Code.MissingRegistrationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SettlementSystemMethodRejection
 * RejectionReasonV3Code.SettlementSystemMethodRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CommonReferenceRejection
 * RejectionReasonV3Code.CommonReferenceRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NarrativeInformationRejection
 * RejectionReasonV3Code.NarrativeInformationRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#IncorrectProgramConversion
 * RejectionReasonV3Code.IncorrectProgramConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InsufficientCollateral
 * RejectionReasonV3Code.InsufficientCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#BusinessPartnerNumberRejection
 * RejectionReasonV3Code.BusinessPartnerNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#BankReferenceNumberRejection
 * RejectionReasonV3Code.BankReferenceNumberRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TypeOfOrderRejection
 * RejectionReasonV3Code.TypeOfOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CorporateActionRejection
 * RejectionReasonV3Code.CorporateActionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ImpossibleCashSettlementSystem
 * RejectionReasonV3Code.ImpossibleCashSettlementSystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CommercializationContractRejection
 * RejectionReasonV3Code.CommercializationContractRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ConcentrationLimitExceeded
 * RejectionReasonV3Code.ConcentrationLimitExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#UnknownDealExposure
 * RejectionReasonV3Code.UnknownDealExposure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SettlementDateRejection
 * RejectionReasonV3Code.SettlementDateRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#DisagreeWithCallAmount
 * RejectionReasonV3Code.DisagreeWithCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#DisagreeWithExposureAmount
 * RejectionReasonV3Code.DisagreeWithExposureAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RegistrationRequestDataAndOrderRejection
 * RejectionReasonV3Code.RegistrationRequestDataAndOrderRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#FeeCommissionRejection
 * RejectionReasonV3Code.FeeCommissionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#IncorrectActivityType
 * RejectionReasonV3Code.IncorrectActivityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SettlementTransactionRejection
 * RejectionReasonV3Code.SettlementTransactionRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ClosingDateTimeRejection
 * RejectionReasonV3Code.ClosingDateTimeRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#VariableRateSupportRejection
 * RejectionReasonV3Code.VariableRateSupportRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingOption
 * RejectionReasonV3Code.MissingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotDefinedAgent
 * RejectionReasonV3Code.NotDefinedAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingPeriodEndDate
 * RejectionReasonV3Code.MissingPeriodEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingPeriodStartDate
 * RejectionReasonV3Code.MissingPeriodStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingResultingAmount
 * RejectionReasonV3Code.MissingResultingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#WrongSecurityType
 * RejectionReasonV3Code.WrongSecurityType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotEligibleDisperseSecurity
 * RejectionReasonV3Code.NotEligibleDisperseSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NonEligibleSecurity
 * RejectionReasonV3Code.NonEligibleSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingExchangeRate
 * RejectionReasonV3Code.MissingExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ValueDateBeforePaymentDate
 * RejectionReasonV3Code.ValueDateBeforePaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#UnexpectedAccruedInterest
 * RejectionReasonV3Code.UnexpectedAccruedInterest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoAccessToService
 * RejectionReasonV3Code.NoAccessToService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#IncorrectCertification
 * RejectionReasonV3Code.IncorrectCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotBusinessDay
 * RejectionReasonV3Code.NotBusinessDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#EffectiveDayAfterPaymentDate
 * RejectionReasonV3Code.EffectiveDayAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#GrossAmountLessThanNetAmount
 * RejectionReasonV3Code.GrossAmountLessThanNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingDefaultOption
 * RejectionReasonV3Code.MissingDefaultOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NonActiveParty
 * RejectionReasonV3Code.NonActiveParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PeriodEndDateBeforeStartDate
 * RejectionReasonV3Code.PeriodEndDateBeforeStartDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#RecordDateAfterPaymentDate
 * RejectionReasonV3Code.RecordDateAfterPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#FailedValidation
 * RejectionReasonV3Code.FailedValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#EventAlreadyDeactivated
 * RejectionReasonV3Code.EventAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoPendingDeactivationInstruction
 * RejectionReasonV3Code.NoPendingDeactivationInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#AmendmentNotAllowed
 * RejectionReasonV3Code.AmendmentNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CancellationNotAllowed
 * RejectionReasonV3Code.CancellationNotAllowed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#Late
 * RejectionReasonV3Code.Late}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ElectionAlreadyCancelled
 * RejectionReasonV3Code.ElectionAlreadyCancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ElectionAlreadyAmended
 * RejectionReasonV3Code.ElectionAlreadyAmended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SameCAIdentification
 * RejectionReasonV3Code.SameCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidCAIdentification
 * RejectionReasonV3Code.InvalidCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidAgent
 * RejectionReasonV3Code.InvalidAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotMainAgent
 * RejectionReasonV3Code.NotMainAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidOption
 * RejectionReasonV3Code.InvalidOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PendingDeactivation
 * RejectionReasonV3Code.PendingDeactivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotIdentifiedCashAccount
 * RejectionReasonV3Code.NotIdentifiedCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotIdentifiedCorrespondentBank
 * RejectionReasonV3Code.NotIdentifiedCorrespondentBank}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidStandingInstructionType
 * RejectionReasonV3Code.InvalidStandingInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoHolding
 * RejectionReasonV3Code.NoHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InsufficientBalance
 * RejectionReasonV3Code.InsufficientBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#SameIdentification
 * RejectionReasonV3Code.SameIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#OptionAlreadyDeactivated
 * RejectionReasonV3Code.OptionAlreadyDeactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidEventType
 * RejectionReasonV3Code.InvalidEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidUnderlyingSecurity
 * RejectionReasonV3Code.InvalidUnderlyingSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidEventProcessingType
 * RejectionReasonV3Code.InvalidEventProcessingType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidMandatoryVoluntaryEventType
 * RejectionReasonV3Code.InvalidMandatoryVoluntaryEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidCorporateActionInformation
 * RejectionReasonV3Code.InvalidCorporateActionInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidDetails
 * RejectionReasonV3Code.InvalidDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NoRemainingOption
 * RejectionReasonV3Code.NoRemainingOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MismatchedCAIdentification
 * RejectionReasonV3Code.MismatchedCAIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotApplicable
 * RejectionReasonV3Code.NotApplicable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidMovementInformation
 * RejectionReasonV3Code.InvalidMovementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MovementAlreadySettled
 * RejectionReasonV3Code.MovementAlreadySettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NarrativeReason
 * RejectionReasonV3Code.NarrativeReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidIdentification
 * RejectionReasonV3Code.InvalidIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingCertification
 * RejectionReasonV3Code.MissingCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#LackOfStampDuty
 * RejectionReasonV3Code.LackOfStampDuty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidRequest
 * RejectionReasonV3Code.InvalidRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PlaceOfSafekeeping
 * RejectionReasonV3Code.PlaceOfSafekeeping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#Other
 * RejectionReasonV3Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReceivingDeliveringParty3
 * RejectionReasonV3Code.ReceivingDeliveringParty3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReceivingDeliveringParty2
 * RejectionReasonV3Code.ReceivingDeliveringParty2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReceivingDeliveringParty1
 * RejectionReasonV3Code.ReceivingDeliveringParty1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ReceivingDeliveringDepository
 * RejectionReasonV3Code.ReceivingDeliveringDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidModificationRequest
 * RejectionReasonV3Code.InvalidModificationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidLink
 * RejectionReasonV3Code.InvalidLink}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidBalance
 * RejectionReasonV3Code.InvalidBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidLotNumber
 * RejectionReasonV3Code.InvalidLotNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidRule
 * RejectionReasonV3Code.InvalidRule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#PlaceOfListing
 * RejectionReasonV3Code.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InvalidInvestorParty
 * RejectionReasonV3Code.InvalidInvestorParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#MissingBeneficiaryOwnerDetails
 * RejectionReasonV3Code.MissingBeneficiaryOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#ClosingTransactionAmount
 * RejectionReasonV3Code.ClosingTransactionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#OrderDateNotProvided
 * RejectionReasonV3Code.OrderDateNotProvided}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TradedQuantityHigherThanOriginalOrderQuantity
 * RejectionReasonV3Code.TradedQuantityHigherThanOriginalOrderQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TransactionNoticeAlreadyAcceptedOrRejected
 * RejectionReasonV3Code.TransactionNoticeAlreadyAcceptedOrRejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#TransactionNoticeIDUnknown
 * RejectionReasonV3Code.TransactionNoticeIDUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#NotAvailable
 * RejectionReasonV3Code.NotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#AmountRejection
 * RejectionReasonV3Code.AmountRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#CurrencyRejection
 * RejectionReasonV3Code.CurrencyRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV3Code#InstructionTypeRejection
 * RejectionReasonV3Code.InstructionTypeRejection}</li>
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
 * "RejectionReasonV3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the reason why the instruction/cancellation request has a rejected status."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class RejectionReasonV3Code extends MMCode {

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
	public static final RejectionReasonV3Code InsufficientMoney = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientMoney";
			definition = "Insufficient money in your account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidReference = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidReference";
			definition = "Linked reference is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SafekeepingAccountRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SafekeepingAccountRejection";
			definition = "Unrecognised or invalid message sender's safekeeping account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InsufficientTresholdPosition = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientTresholdPosition";
			definition = "Position is less than required threshold.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code QuantityRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityRejection";
			definition = "Unrecognised or invalid instructed quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code AccountServicerDeadlineMissed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerDeadlineMissed";
			definition = "Transaction/instruction received after the account servicer's specified deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SplitVoteNotAllowed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitVoteNotAllowed";
			definition = "Split voting is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PartialVoteNotAllowed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialVoteNotAllowed";
			definition = "Partial voting is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingOrInvalidPOA = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOrInvalidPOA";
			definition = "Missing or invalid power of attorney.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ProxyCardDiscrepancy = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyCardDiscrepancy";
			definition = "Invalid proxy information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RegistrationDiscrepancy = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDiscrepancy";
			definition = "Invalid registration information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RejectedByIssuerOrRegistrar = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedByIssuerOrRegistrar";
			definition = "Issuer or registrar has rejected the instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidSecurity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurity";
			definition = "Unrecognised or invalid financial instrument identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Instruction is irrevocable.
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
	 * definition} = "Instruction is irrevocable."</li>
	 * </ul>
	 */
	public static final RejectionReasonV3Code InstructionIrrevocable = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionIrrevocable";
			definition = "Instruction is irrevocable.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
			codeName = "INIR";
		}
	};
	/**
	 * Option is not valid; it has been cancelled by the market or service
	 * provider, and cannot be responded to. Any responses already processed
	 * against this option are considered void and new responses will be
	 * required.
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
	 * "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonV3Code OptionCancelled = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionCancelled";
			definition = "Option is not valid; it has been cancelled by the market or service provider, and cannot be responded to. Any responses already processed against this option are considered void and new responses will be required.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code OptionInactive = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionInactive";
			definition = "Option is not active and can no longer be responded to. Any responses already processed against this option will remain valid, for example, expired option.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidForTaxAuthorities = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidForTaxAuthorities";
			definition = "For tax reclaim, the reclaim is invalid for the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RefusedByTaxAuthorities = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefusedByTaxAuthorities";
			definition = "Reclaim is refused by the tax authorities.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code LackofSecurities = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackofSecurities";
			definition = "Instructed position exceeds the eligible balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MarketDeadlineMissed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketDeadlineMissed";
			definition = "Received after market deadline.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code Mismatch = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatch";
			definition = "Mismatch between option number and option type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code OptionNumberRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionNumberRejection";
			definition = "Unrecognised option number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidOptionType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOptionType";
			definition = "Invalid option type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RejectedSinceAlreadyCancelled = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceAlreadyCancelled";
			definition = "Cancellation request was rejected since the instruction has already been cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RejectedSinceInProgress = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedSinceInProgress";
			definition = "Cancellation request has been rejected because the instruction process is in progress or has been processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code UnrecognisedIdentification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIdentification";
			definition = "Unrecognised event number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code UnknownSymbol = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownSymbol";
			definition = "Financial instrument's symbol has not been recognized.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ClosedExchange = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedExchange";
			definition = "Exchange on which the financial instrument is traded is closed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ExceedsLimit = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceedsLimit";
			definition = "Countervalue of the order exceeds the allowed trading limit or quote exceeds limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TooLate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TooLate";
			definition = "Request has exceeded the allowed time frame.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidPrice = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPrice";
			definition = "Price does not comply with the financial instrument's characteristics.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotAuthorised = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAuthorised";
			definition = "Permission to be processed is not granted.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoMatchInquiry = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchInquiry";
			definition = "No counterparty order has been identified.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoInstrumentMarket = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInstrumentMarket";
			definition = "Referred instrument does not exist in combination with the mentioned market.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoInventory = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoInventory";
			definition = "Requested financial instrument is not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code Pass = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pass";
			definition = "Counterparty is not interested in the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PriceExceeds = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceExceeds";
			definition = "Price in the execution exceeds the order price.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code QuantityExceeds = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityExceeds";
			definition = "Quantity in the execution exceeds the ordered quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code WrongSide = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSide";
			definition = "Order is for the wrong side.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	 * "Primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations. Buy-side may reject the trade if they feel that the difference in calculations is too high."
	 * </li>
	 * </ul>
	 */
	public static final RejectionReasonV3Code CalculationDifference = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationDifference";
			definition = "Primarily used when the Notice of Execution received by the buy-side contains fees, gross trade amount, net trade amount, etc., values that differ from the buy-side's calculations. Buy-side may reject the trade if they feel that the difference in calculations is too high.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InsufficientCredit = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCredit";
			definition = "Requestor has no insufficient credit to make the trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code AgreementStartDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgreementStartDate";
			definition = "Agreement start date is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TransactionCallDelay = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionCallDelay";
			definition = "Unrecognised or invalid transaction call delay.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code CashAccount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Unrecognised or invalid cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code DealPrice = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealPrice";
			definition = "Unrecognised or invalid deal price.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ForfeitAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForfeitAmount";
			definition = "Unrecognised or invalid forfeit amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code DeliveringCustodian = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringCustodian";
			definition = "Unrecognised or invalid delivering custodian.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReceivingCustodian = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingCustodian";
			definition = "Unrecognised or invalid receiving agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotFoundRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotFoundRejection";
			definition = "Instruction could not be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code QuantityUnitType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnitType";
			definition = "Quantity unit type is not provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TerminationTransactionAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationTransactionAmount";
			definition = "Unrecognised or invalid termination transaction amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RepurchaseRate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRate";
			definition = "Unrecognised or invalid repurchase rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PremiumAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PremiumAmount";
			definition = "Unrecognised or invalid premium amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RepurchaseRateType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseRateType";
			definition = "Unrecognised or invalid repurchase rate type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SpreadRate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpreadRate";
			definition = "Unrecognised or invalid spread rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TradedSecuritiesQuantity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedSecuritiesQuantity";
			definition = "Traded securities quantity not provided.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TradeDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Unrecognised or invalid trade date or requested trade date or future trade date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReceivingAgent = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgent";
			definition = "Receiving agent is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code Intermediary = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Intermediary";
			definition = "Intermediary is not recognised or is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PlaceOfTrade = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfTrade";
			definition = "Unrecognised or invalid place of trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvestorNameAddressUnknown = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestorNameAddressUnknown";
			definition = "Investor name and address is not recognised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ImpossibleToUseTheRTGSSystemInstructed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleToUseTheRTGSSystemInstructed";
			definition = "Not possible to use the RTGS system instructed (NRTG or YRTG).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SettlementAmountCurrencyRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountCurrencyRejection";
			definition = "Unrecognised or invalid settlement amount currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code LetterOfGuaranteeIndicatorRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterOfGuaranteeIndicatorRejection";
			definition = "Unrecognised or invalid letter of guarantee indicator instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingCreditAuthorisation = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCreditAuthorisation";
			definition = "Missing credit authorisation (for pre-release transactions).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code AddressDetailsRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressDetailsRejection";
			definition = "Address details are incorrect or cannot be recognised.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PhysicalSettlementImpossible = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalSettlementImpossible";
			definition = "Physical settlement is impossible for the instructed financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReferenceRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceRejection";
			definition = "Instruction has a reference identical to another previously received instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SettlementAmountRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmountRejection";
			definition = "Unrecognised or invalid settlement amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingStatutes = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingStatutes";
			definition = "Missing statutes or commercial register or other legal documents.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotStampedOrSigned = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotStampedOrSigned";
			definition = "Financial instrument has not been stamped and/or duly signed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidSignature = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			definition = "Registration request does not have a valid signature of the owner of the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ShareholderNumberRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareholderNumberRejection";
			definition = "Unrecognised or invalid shareholder number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MinimumSettlementQuantity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MinimumSettlementQuantity";
			definition = "Quantity instructed is lower than the minimum existing settlement quantity for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoMatch = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatch";
			definition = "More than one instruction match the criteria.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingLegalPower = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingLegalPower";
			definition = "Missing legal power for transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ProcessingBatchRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingBatchRejection";
			definition = "Unrecognised or invalid processing batch, that is, daytime/real-time while only possible to settle in overnight batch.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TypeOfOwnershipRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOwnershipRejection";
			definition = "Type of ownership indicated is not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MultipleSettlementQuantity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MultipleSettlementQuantity";
			definition = "Quantity instructed is not a multiple of an existing settlement quantity lot for the financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code WrongRegistrationRequest = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is wrong. You have used the registration request of a different issuer/registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TaxStatusRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxStatusRejection";
			definition = "Unrecognised or invalid tax status of the securities instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code DisagreementInRegistrationReason = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreementInRegistrationReason";
			definition = "Registration reason indicated is not correct.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingRegistrationRequest = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingRegistrationRequest";
			definition = "Registration request to be completed by the buyer and to be forwarded to the issuer is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SettlementSystemMethodRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementSystemMethodRejection";
			definition = "Unrecognised or invalid settlement system/method instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code CommonReferenceRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonReferenceRejection";
			definition = "Unrecognised, invalid or missing common reference.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NarrativeInformationRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeInformationRejection";
			definition = "Unrecognised or invalid service level agreement pre-agreed narrative information.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code IncorrectProgramConversion = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectProgramConversion";
			definition = "Invalid or incorrect programme conversion specified.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InsufficientCollateral = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientCollateral";
			definition = "Insufficient collateral proposed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code BusinessPartnerNumberRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessPartnerNumberRejection";
			definition = "Unrecognised or invalid business partner number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code BankReferenceNumberRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankReferenceNumberRejection";
			definition = "Unrecognised or invalid bank reference number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TypeOfOrderRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeOfOrderRejection";
			definition = "Unrecognised or invalid type of order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code CorporateActionRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionRejection";
			definition = "Corporate action pending on the financial instrument instructed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ImpossibleCashSettlementSystem = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImpossibleCashSettlementSystem";
			definition = "Impossible standing arrangements override instruction for the cash settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code CommercializationContractRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommercializationContractRejection";
			definition = "Unrecognised or invalid commercialisation contract.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ConcentrationLimitExceeded = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConcentrationLimitExceeded";
			definition = "Concentration limit was exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code UnknownDealExposure = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownDealExposure";
			definition = "Deal or exposure is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SettlementDateRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDateRejection";
			definition = "Unrecognised or invalid settlement date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code DisagreeWithCallAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithCallAmount";
			definition = "Party does not agree with the call amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code DisagreeWithExposureAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisagreeWithExposureAmount";
			definition = "Party does not agree with the exposure amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RegistrationRequestDataAndOrderRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationRequestDataAndOrderRejection";
			definition = "Disagreement between the data on the registration request and the order.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code FeeCommissionRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FeeCommissionRejection";
			definition = "Unrecognised or invalid fee or commission.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code IncorrectActivityType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectActivityType";
			definition = "Incorrect activity type specified, for example, pre-release conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SettlementTransactionRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTransactionRejection";
			definition = "Unrecognised or invalid settlement transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ClosingDateTimeRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingDateTimeRejection";
			definition = "Unrecognised or invalid closing date/time.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code VariableRateSupportRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VariableRateSupportRejection";
			definition = "Unrecognised or invalid variable rate support (repurchase agreement).";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingOption = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingOption";
			definition = "Second option is mandatory.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotDefinedAgent = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotDefinedAgent";
			definition = "Party is not defined as an agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingPeriodEndDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodEndDate";
			definition = "Period ending date or code is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingPeriodStartDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingPeriodStartDate";
			definition = "Period starting date or code is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingResultingAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingResultingAmount";
			definition = "Resulting amount must be filled in as exchange rate is present.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code WrongSecurityType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongSecurityType";
			definition = "Security type does not match with the type of corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotEligibleDisperseSecurity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotEligibleDisperseSecurity";
			definition = "Disperse security is not eligible in the (ICSD) service provider owner.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NonEligibleSecurity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonEligibleSecurity";
			definition = "Security is not eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingExchangeRate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingExchangeRate";
			definition = "Resulting amount is not allowed without an exchange rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ValueDateBeforePaymentDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDateBeforePaymentDate";
			definition = "Value date is before payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code UnexpectedAccruedInterest = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedAccruedInterest";
			definition = "Accrued interest is not applicable for this type of security.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoAccessToService = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAccessToService";
			definition = "Agent has no access to the service.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code IncorrectCertification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectCertification";
			definition = "Instruction is rejected since the provided certification is incorrect or incomplete.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotBusinessDay = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotBusinessDay";
			definition = "Date is not a business day for the security market.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code EffectiveDayAfterPaymentDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveDayAfterPaymentDate";
			definition = "Effective date is after the payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code GrossAmountLessThanNetAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmountLessThanNetAmount";
			definition = "Gross amount is less than net amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingDefaultOption = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingDefaultOption";
			definition = "One option must be marked as the default.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NonActiveParty = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonActiveParty";
			definition = "Party is not active.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PeriodEndDateBeforeStartDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PeriodEndDateBeforeStartDate";
			definition = "Period ending date is before period starting date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code RecordDateAfterPaymentDate = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDateAfterPaymentDate";
			definition = "Record date is after payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code FailedValidation = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailedValidation";
			definition = "Validation of the advice/instruction/request failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code EventAlreadyDeactivated = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventAlreadyDeactivated";
			definition = "Rejected as the deactivation of the event is already completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoPendingDeactivationInstruction = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoPendingDeactivationInstruction";
			definition = "Cancellation request is rejected as there is no pending deactivation instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code AmendmentNotAllowed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentNotAllowed";
			definition = "Amendment is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code CancellationNotAllowed = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationNotAllowed";
			definition = "Cancellation is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code Late = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Late";
			definition = "Instruction/Request arrives too late.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ElectionAlreadyCancelled = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyCancelled";
			definition = "Election advice is already cancelled.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ElectionAlreadyAmended = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectionAlreadyAmended";
			definition = "Election advice is already amended.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SameCAIdentification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameCAIdentification";
			definition = "Agent corporate action deactivation instruction with the same identification already exists.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidCAIdentification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCAIdentification";
			definition = "Invalid corporate action identification supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidAgent = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAgent";
			definition = "Invalid agent identification supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotMainAgent = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotMainAgent";
			definition = "Agent identification specified does not correspond to the main agent of the relating event.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidOption = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOption";
			definition = "Invalid combination of corporate action option code and corporate action option number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PendingDeactivation = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingDeactivation";
			definition = "Specified corporate action option already has a pending deactivation instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotIdentifiedCashAccount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCashAccount";
			definition = "Unable to identify cash account.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotIdentifiedCorrespondentBank = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotIdentifiedCorrespondentBank";
			definition = "Unable to identify correspondent bank.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidStandingInstructionType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidStandingInstructionType";
			definition = "Invalid standing instruction type for the specified underlying security.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoHolding = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoHolding";
			definition = "No holding for the specified underlying security.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InsufficientBalance = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientBalance";
			definition = "Insufficient balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code SameIdentification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SameIdentification";
			definition = "Several messages with the same identification.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code OptionAlreadyDeactivated = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionAlreadyDeactivated";
			definition = "Rejected as the deactivation of the option is already completed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidEventType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventType";
			definition = "Corporate action event type does not correspond with the relating corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidUnderlyingSecurity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidUnderlyingSecurity";
			definition = "Underlying security identification does not correspond with the corporate action reference supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidEventProcessingType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidEventProcessingType";
			definition = "Event processing type does not correspond with the relating corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidMandatoryVoluntaryEventType = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMandatoryVoluntaryEventType";
			definition = "Mandatory/voluntary event type does not correspond with the relating corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidCorporateActionInformation = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCorporateActionInformation";
			definition = "Details specified in the corporate action general information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidDetails = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDetails";
			definition = "Message details specified in the instruction/request are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NoRemainingOption = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoRemainingOption";
			definition = "Specified corporate action has no remaining option to disable.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MismatchedCAIdentification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MismatchedCAIdentification";
			definition = "Issuer corporate action identification does not correspond with the corporate action identification supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotApplicable = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotApplicable";
			definition = "Instruction type is not applicable for mandatory events.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidMovementInformation = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMovementInformation";
			definition = "Details specified in the movement general information block are inconsistent with those that were specified in the relating original message.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MovementAlreadySettled = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementAlreadySettled";
			definition = "One or more of the underlying movements have already settled.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NarrativeReason = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NarrativeReason";
			definition = "See narrative field for reason.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidIdentification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidIdentification";
			definition = "Instruction contains an invalid message identification, identification is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingCertification = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingCertification";
			definition = "Certification has not been filled in.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code LackOfStampDuty = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LackOfStampDuty";
			definition = "Required stamp duty information is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidRequest = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRequest";
			definition = "Statement/status advice request cannot be executed. The message type requested is not valid for the message reference or statement period concerned.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PlaceOfSafekeeping = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfSafekeeping";
			definition = "Unrecognised, invalid or missing place of safekeeping.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code Other = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Other. See Narrative.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReceivingDeliveringParty3 = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty3";
			definition = "Unrecognised or invalid client of delivering or receiving party 2.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReceivingDeliveringParty2 = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty2";
			definition = "Unrecognised or invalid client of delivering or receiving party 1.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReceivingDeliveringParty1 = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringParty1";
			definition = "Unrecognised or invalid participant of delivering or receiving depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ReceivingDeliveringDepository = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingDeliveringDepository";
			definition = "Unrecognised or invalid depository.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidModificationRequest = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidModificationRequest";
			definition = "Invalid or unrecognized modification request.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidLink = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLink";
			definition = "Invalid or unrecognized link.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	 * definition} = "Instruction aims at using an invalid balance."</li>
	 * </ul>
	 */
	public static final RejectionReasonV3Code InvalidBalance = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBalance";
			definition = "Instruction aims at using an invalid balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidLotNumber = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidLotNumber";
			definition = "Invalid or unrecognized lot number.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidRule = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidRule";
			definition = "Account servicer validation rule rejection.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code PlaceOfListing = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			definition = "Unrecognised or invalid place of listing. Used when the security identified is not listed on the market supplied.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InvalidInvestorParty = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidInvestorParty";
			definition = "Unrecognised or invalid investor party. May be used by an executing party to reject an instruction for an investor (or portfolio) for which it is not authorised to act.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code MissingBeneficiaryOwnerDetails = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingBeneficiaryOwnerDetails";
			definition = "Rejected due to missing beneficiary owner details.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code ClosingTransactionAmount = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingTransactionAmount";
			definition = "Unrecognised or invalid closing closing amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code OrderDateNotProvided = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateNotProvided";
			definition = "Order entry date is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TradedQuantityHigherThanOriginalOrderQuantity = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradedQuantityHigherThanOriginalOrderQuantity";
			definition = "Market member executed the order exceeding the requested quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TransactionNoticeAlreadyAcceptedOrRejected = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeAlreadyAcceptedOrRejected";
			definition = "A message with the same Transaction Notice Reference, Market Member, and Intermediary has already been processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code TransactionNoticeIDUnknown = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionNoticeIDUnknown";
			definition = "The combination of the Transaction Notice Reference, Market Member, and Intermediary is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code NotAvailable = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAvailable";
			definition = "Reason is not available or unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code AmountRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountRejection";
			definition = "Unrecognised or invalid instructed cash amount.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code CurrencyRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyRejection";
			definition = "Invalid instructed currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
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
	public static final RejectionReasonV3Code InstructionTypeRejection = new RejectionReasonV3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionTypeRejection";
			definition = "Invalid use of instructed amount (QCAS) or of instructed quantity (QINS) qualifiers.";
			owner_lazy = () -> com.tools20022.repository.codeset.RejectionReasonV3Code.mmObject();
			codeName = "DQAM";
		}
	};
	final static private LinkedHashMap<String, RejectionReasonV3Code> codesByName = new LinkedHashMap<>();

	protected RejectionReasonV3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ULNK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReasonV3Code";
				definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
				derivation_lazy = () -> Arrays.asList(PendingCancellationReason5Code.mmObject(), RejectionReason46Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.RejectionReasonV3Code.InsufficientMoney, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidReference,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SafekeepingAccountRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.InsufficientTresholdPosition,
						com.tools20022.repository.codeset.RejectionReasonV3Code.QuantityRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.AccountServicerDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SplitVoteNotAllowed, com.tools20022.repository.codeset.RejectionReasonV3Code.PartialVoteNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MissingOrInvalidPOA, com.tools20022.repository.codeset.RejectionReasonV3Code.ProxyCardDiscrepancy,
						com.tools20022.repository.codeset.RejectionReasonV3Code.RegistrationDiscrepancy, com.tools20022.repository.codeset.RejectionReasonV3Code.RejectedByIssuerOrRegistrar,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidSecurity, com.tools20022.repository.codeset.RejectionReasonV3Code.InstructionIrrevocable,
						com.tools20022.repository.codeset.RejectionReasonV3Code.OptionCancelled, com.tools20022.repository.codeset.RejectionReasonV3Code.OptionInactive,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidForTaxAuthorities, com.tools20022.repository.codeset.RejectionReasonV3Code.RefusedByTaxAuthorities,
						com.tools20022.repository.codeset.RejectionReasonV3Code.LackofSecurities, com.tools20022.repository.codeset.RejectionReasonV3Code.MarketDeadlineMissed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.Mismatch, com.tools20022.repository.codeset.RejectionReasonV3Code.OptionNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidOptionType, com.tools20022.repository.codeset.RejectionReasonV3Code.RejectedSinceAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReasonV3Code.RejectedSinceInProgress, com.tools20022.repository.codeset.RejectionReasonV3Code.UnrecognisedIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.UnknownSymbol, com.tools20022.repository.codeset.RejectionReasonV3Code.ClosedExchange, com.tools20022.repository.codeset.RejectionReasonV3Code.ExceedsLimit,
						com.tools20022.repository.codeset.RejectionReasonV3Code.TooLate, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidPrice, com.tools20022.repository.codeset.RejectionReasonV3Code.NotAuthorised,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NoMatchInquiry, com.tools20022.repository.codeset.RejectionReasonV3Code.NoInstrumentMarket,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NoInventory, com.tools20022.repository.codeset.RejectionReasonV3Code.Pass, com.tools20022.repository.codeset.RejectionReasonV3Code.PriceExceeds,
						com.tools20022.repository.codeset.RejectionReasonV3Code.QuantityExceeds, com.tools20022.repository.codeset.RejectionReasonV3Code.WrongSide,
						com.tools20022.repository.codeset.RejectionReasonV3Code.CalculationDifference, com.tools20022.repository.codeset.RejectionReasonV3Code.InsufficientCredit,
						com.tools20022.repository.codeset.RejectionReasonV3Code.AgreementStartDate, com.tools20022.repository.codeset.RejectionReasonV3Code.TransactionCallDelay,
						com.tools20022.repository.codeset.RejectionReasonV3Code.CashAccount, com.tools20022.repository.codeset.RejectionReasonV3Code.DealPrice, com.tools20022.repository.codeset.RejectionReasonV3Code.ForfeitAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.DeliveringCustodian, com.tools20022.repository.codeset.RejectionReasonV3Code.ReceivingCustodian,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotFoundRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.QuantityUnitType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.TerminationTransactionAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.RepurchaseRate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.PremiumAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.RepurchaseRateType, com.tools20022.repository.codeset.RejectionReasonV3Code.SpreadRate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.TradedSecuritiesQuantity, com.tools20022.repository.codeset.RejectionReasonV3Code.TradeDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ReceivingAgent, com.tools20022.repository.codeset.RejectionReasonV3Code.Intermediary, com.tools20022.repository.codeset.RejectionReasonV3Code.PlaceOfTrade,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvestorNameAddressUnknown, com.tools20022.repository.codeset.RejectionReasonV3Code.ImpossibleToUseTheRTGSSystemInstructed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SettlementAmountCurrencyRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.LetterOfGuaranteeIndicatorRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MissingCreditAuthorisation, com.tools20022.repository.codeset.RejectionReasonV3Code.AddressDetailsRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.PhysicalSettlementImpossible, com.tools20022.repository.codeset.RejectionReasonV3Code.ReferenceRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SettlementAmountRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingStatutes,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotStampedOrSigned, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidSignature,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ShareholderNumberRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.MinimumSettlementQuantity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NoMatch, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingLegalPower,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ProcessingBatchRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.TypeOfOwnershipRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MultipleSettlementQuantity, com.tools20022.repository.codeset.RejectionReasonV3Code.WrongRegistrationRequest,
						com.tools20022.repository.codeset.RejectionReasonV3Code.TaxStatusRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.DisagreementInRegistrationReason,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MissingRegistrationRequest, com.tools20022.repository.codeset.RejectionReasonV3Code.SettlementSystemMethodRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.CommonReferenceRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.NarrativeInformationRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.IncorrectProgramConversion, com.tools20022.repository.codeset.RejectionReasonV3Code.InsufficientCollateral,
						com.tools20022.repository.codeset.RejectionReasonV3Code.BusinessPartnerNumberRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.BankReferenceNumberRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.TypeOfOrderRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.CorporateActionRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ImpossibleCashSettlementSystem, com.tools20022.repository.codeset.RejectionReasonV3Code.CommercializationContractRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ConcentrationLimitExceeded, com.tools20022.repository.codeset.RejectionReasonV3Code.UnknownDealExposure,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SettlementDateRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.DisagreeWithCallAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.DisagreeWithExposureAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.RegistrationRequestDataAndOrderRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.FeeCommissionRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.IncorrectActivityType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SettlementTransactionRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.ClosingDateTimeRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.VariableRateSupportRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingOption,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotDefinedAgent, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingPeriodEndDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MissingPeriodStartDate, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingResultingAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.WrongSecurityType, com.tools20022.repository.codeset.RejectionReasonV3Code.NotEligibleDisperseSecurity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NonEligibleSecurity, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingExchangeRate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ValueDateBeforePaymentDate, com.tools20022.repository.codeset.RejectionReasonV3Code.UnexpectedAccruedInterest,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NoAccessToService, com.tools20022.repository.codeset.RejectionReasonV3Code.IncorrectCertification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotBusinessDay, com.tools20022.repository.codeset.RejectionReasonV3Code.EffectiveDayAfterPaymentDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.GrossAmountLessThanNetAmount, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingDefaultOption,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NonActiveParty, com.tools20022.repository.codeset.RejectionReasonV3Code.PeriodEndDateBeforeStartDate,
						com.tools20022.repository.codeset.RejectionReasonV3Code.RecordDateAfterPaymentDate, com.tools20022.repository.codeset.RejectionReasonV3Code.FailedValidation,
						com.tools20022.repository.codeset.RejectionReasonV3Code.EventAlreadyDeactivated, com.tools20022.repository.codeset.RejectionReasonV3Code.NoPendingDeactivationInstruction,
						com.tools20022.repository.codeset.RejectionReasonV3Code.AmendmentNotAllowed, com.tools20022.repository.codeset.RejectionReasonV3Code.CancellationNotAllowed,
						com.tools20022.repository.codeset.RejectionReasonV3Code.Late, com.tools20022.repository.codeset.RejectionReasonV3Code.ElectionAlreadyCancelled,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ElectionAlreadyAmended, com.tools20022.repository.codeset.RejectionReasonV3Code.SameCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidCAIdentification, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidAgent,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotMainAgent, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidOption,
						com.tools20022.repository.codeset.RejectionReasonV3Code.PendingDeactivation, com.tools20022.repository.codeset.RejectionReasonV3Code.NotIdentifiedCashAccount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotIdentifiedCorrespondentBank, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidStandingInstructionType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NoHolding, com.tools20022.repository.codeset.RejectionReasonV3Code.InsufficientBalance,
						com.tools20022.repository.codeset.RejectionReasonV3Code.SameIdentification, com.tools20022.repository.codeset.RejectionReasonV3Code.OptionAlreadyDeactivated,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidEventType, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidUnderlyingSecurity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidEventProcessingType, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidMandatoryVoluntaryEventType,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidCorporateActionInformation, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidDetails,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NoRemainingOption, com.tools20022.repository.codeset.RejectionReasonV3Code.MismatchedCAIdentification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotApplicable, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidMovementInformation,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MovementAlreadySettled, com.tools20022.repository.codeset.RejectionReasonV3Code.NarrativeReason,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidIdentification, com.tools20022.repository.codeset.RejectionReasonV3Code.MissingCertification,
						com.tools20022.repository.codeset.RejectionReasonV3Code.LackOfStampDuty, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidRequest,
						com.tools20022.repository.codeset.RejectionReasonV3Code.PlaceOfSafekeeping, com.tools20022.repository.codeset.RejectionReasonV3Code.Other,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ReceivingDeliveringParty3, com.tools20022.repository.codeset.RejectionReasonV3Code.ReceivingDeliveringParty2,
						com.tools20022.repository.codeset.RejectionReasonV3Code.ReceivingDeliveringParty1, com.tools20022.repository.codeset.RejectionReasonV3Code.ReceivingDeliveringDepository,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidModificationRequest, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidLink,
						com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidBalance, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidLotNumber, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidRule,
						com.tools20022.repository.codeset.RejectionReasonV3Code.PlaceOfListing, com.tools20022.repository.codeset.RejectionReasonV3Code.InvalidInvestorParty,
						com.tools20022.repository.codeset.RejectionReasonV3Code.MissingBeneficiaryOwnerDetails, com.tools20022.repository.codeset.RejectionReasonV3Code.ClosingTransactionAmount,
						com.tools20022.repository.codeset.RejectionReasonV3Code.OrderDateNotProvided, com.tools20022.repository.codeset.RejectionReasonV3Code.TradedQuantityHigherThanOriginalOrderQuantity,
						com.tools20022.repository.codeset.RejectionReasonV3Code.TransactionNoticeAlreadyAcceptedOrRejected, com.tools20022.repository.codeset.RejectionReasonV3Code.TransactionNoticeIDUnknown,
						com.tools20022.repository.codeset.RejectionReasonV3Code.NotAvailable, com.tools20022.repository.codeset.RejectionReasonV3Code.AmountRejection,
						com.tools20022.repository.codeset.RejectionReasonV3Code.CurrencyRejection, com.tools20022.repository.codeset.RejectionReasonV3Code.InstructionTypeRejection);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(InsufficientMoney.getCodeName().get(), InsufficientMoney);
		codesByName.put(InvalidReference.getCodeName().get(), InvalidReference);
		codesByName.put(SafekeepingAccountRejection.getCodeName().get(), SafekeepingAccountRejection);
		codesByName.put(InsufficientTresholdPosition.getCodeName().get(), InsufficientTresholdPosition);
		codesByName.put(QuantityRejection.getCodeName().get(), QuantityRejection);
		codesByName.put(AccountServicerDeadlineMissed.getCodeName().get(), AccountServicerDeadlineMissed);
		codesByName.put(SplitVoteNotAllowed.getCodeName().get(), SplitVoteNotAllowed);
		codesByName.put(PartialVoteNotAllowed.getCodeName().get(), PartialVoteNotAllowed);
		codesByName.put(MissingOrInvalidPOA.getCodeName().get(), MissingOrInvalidPOA);
		codesByName.put(ProxyCardDiscrepancy.getCodeName().get(), ProxyCardDiscrepancy);
		codesByName.put(RegistrationDiscrepancy.getCodeName().get(), RegistrationDiscrepancy);
		codesByName.put(RejectedByIssuerOrRegistrar.getCodeName().get(), RejectedByIssuerOrRegistrar);
		codesByName.put(InvalidSecurity.getCodeName().get(), InvalidSecurity);
		codesByName.put(InstructionIrrevocable.getCodeName().get(), InstructionIrrevocable);
		codesByName.put(OptionCancelled.getCodeName().get(), OptionCancelled);
		codesByName.put(OptionInactive.getCodeName().get(), OptionInactive);
		codesByName.put(InvalidForTaxAuthorities.getCodeName().get(), InvalidForTaxAuthorities);
		codesByName.put(RefusedByTaxAuthorities.getCodeName().get(), RefusedByTaxAuthorities);
		codesByName.put(LackofSecurities.getCodeName().get(), LackofSecurities);
		codesByName.put(MarketDeadlineMissed.getCodeName().get(), MarketDeadlineMissed);
		codesByName.put(Mismatch.getCodeName().get(), Mismatch);
		codesByName.put(OptionNumberRejection.getCodeName().get(), OptionNumberRejection);
		codesByName.put(InvalidOptionType.getCodeName().get(), InvalidOptionType);
		codesByName.put(RejectedSinceAlreadyCancelled.getCodeName().get(), RejectedSinceAlreadyCancelled);
		codesByName.put(RejectedSinceInProgress.getCodeName().get(), RejectedSinceInProgress);
		codesByName.put(UnrecognisedIdentification.getCodeName().get(), UnrecognisedIdentification);
		codesByName.put(UnknownSymbol.getCodeName().get(), UnknownSymbol);
		codesByName.put(ClosedExchange.getCodeName().get(), ClosedExchange);
		codesByName.put(ExceedsLimit.getCodeName().get(), ExceedsLimit);
		codesByName.put(TooLate.getCodeName().get(), TooLate);
		codesByName.put(InvalidPrice.getCodeName().get(), InvalidPrice);
		codesByName.put(NotAuthorised.getCodeName().get(), NotAuthorised);
		codesByName.put(NoMatchInquiry.getCodeName().get(), NoMatchInquiry);
		codesByName.put(NoInstrumentMarket.getCodeName().get(), NoInstrumentMarket);
		codesByName.put(NoInventory.getCodeName().get(), NoInventory);
		codesByName.put(Pass.getCodeName().get(), Pass);
		codesByName.put(PriceExceeds.getCodeName().get(), PriceExceeds);
		codesByName.put(QuantityExceeds.getCodeName().get(), QuantityExceeds);
		codesByName.put(WrongSide.getCodeName().get(), WrongSide);
		codesByName.put(CalculationDifference.getCodeName().get(), CalculationDifference);
		codesByName.put(InsufficientCredit.getCodeName().get(), InsufficientCredit);
		codesByName.put(AgreementStartDate.getCodeName().get(), AgreementStartDate);
		codesByName.put(TransactionCallDelay.getCodeName().get(), TransactionCallDelay);
		codesByName.put(CashAccount.getCodeName().get(), CashAccount);
		codesByName.put(DealPrice.getCodeName().get(), DealPrice);
		codesByName.put(ForfeitAmount.getCodeName().get(), ForfeitAmount);
		codesByName.put(DeliveringCustodian.getCodeName().get(), DeliveringCustodian);
		codesByName.put(ReceivingCustodian.getCodeName().get(), ReceivingCustodian);
		codesByName.put(NotFoundRejection.getCodeName().get(), NotFoundRejection);
		codesByName.put(QuantityUnitType.getCodeName().get(), QuantityUnitType);
		codesByName.put(TerminationTransactionAmount.getCodeName().get(), TerminationTransactionAmount);
		codesByName.put(RepurchaseRate.getCodeName().get(), RepurchaseRate);
		codesByName.put(PremiumAmount.getCodeName().get(), PremiumAmount);
		codesByName.put(RepurchaseRateType.getCodeName().get(), RepurchaseRateType);
		codesByName.put(SpreadRate.getCodeName().get(), SpreadRate);
		codesByName.put(TradedSecuritiesQuantity.getCodeName().get(), TradedSecuritiesQuantity);
		codesByName.put(TradeDate.getCodeName().get(), TradeDate);
		codesByName.put(ReceivingAgent.getCodeName().get(), ReceivingAgent);
		codesByName.put(Intermediary.getCodeName().get(), Intermediary);
		codesByName.put(PlaceOfTrade.getCodeName().get(), PlaceOfTrade);
		codesByName.put(InvestorNameAddressUnknown.getCodeName().get(), InvestorNameAddressUnknown);
		codesByName.put(ImpossibleToUseTheRTGSSystemInstructed.getCodeName().get(), ImpossibleToUseTheRTGSSystemInstructed);
		codesByName.put(SettlementAmountCurrencyRejection.getCodeName().get(), SettlementAmountCurrencyRejection);
		codesByName.put(LetterOfGuaranteeIndicatorRejection.getCodeName().get(), LetterOfGuaranteeIndicatorRejection);
		codesByName.put(MissingCreditAuthorisation.getCodeName().get(), MissingCreditAuthorisation);
		codesByName.put(AddressDetailsRejection.getCodeName().get(), AddressDetailsRejection);
		codesByName.put(PhysicalSettlementImpossible.getCodeName().get(), PhysicalSettlementImpossible);
		codesByName.put(ReferenceRejection.getCodeName().get(), ReferenceRejection);
		codesByName.put(SettlementAmountRejection.getCodeName().get(), SettlementAmountRejection);
		codesByName.put(MissingStatutes.getCodeName().get(), MissingStatutes);
		codesByName.put(NotStampedOrSigned.getCodeName().get(), NotStampedOrSigned);
		codesByName.put(InvalidSignature.getCodeName().get(), InvalidSignature);
		codesByName.put(ShareholderNumberRejection.getCodeName().get(), ShareholderNumberRejection);
		codesByName.put(MinimumSettlementQuantity.getCodeName().get(), MinimumSettlementQuantity);
		codesByName.put(NoMatch.getCodeName().get(), NoMatch);
		codesByName.put(MissingLegalPower.getCodeName().get(), MissingLegalPower);
		codesByName.put(ProcessingBatchRejection.getCodeName().get(), ProcessingBatchRejection);
		codesByName.put(TypeOfOwnershipRejection.getCodeName().get(), TypeOfOwnershipRejection);
		codesByName.put(MultipleSettlementQuantity.getCodeName().get(), MultipleSettlementQuantity);
		codesByName.put(WrongRegistrationRequest.getCodeName().get(), WrongRegistrationRequest);
		codesByName.put(TaxStatusRejection.getCodeName().get(), TaxStatusRejection);
		codesByName.put(DisagreementInRegistrationReason.getCodeName().get(), DisagreementInRegistrationReason);
		codesByName.put(MissingRegistrationRequest.getCodeName().get(), MissingRegistrationRequest);
		codesByName.put(SettlementSystemMethodRejection.getCodeName().get(), SettlementSystemMethodRejection);
		codesByName.put(CommonReferenceRejection.getCodeName().get(), CommonReferenceRejection);
		codesByName.put(NarrativeInformationRejection.getCodeName().get(), NarrativeInformationRejection);
		codesByName.put(IncorrectProgramConversion.getCodeName().get(), IncorrectProgramConversion);
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
		codesByName.put(IncorrectActivityType.getCodeName().get(), IncorrectActivityType);
		codesByName.put(SettlementTransactionRejection.getCodeName().get(), SettlementTransactionRejection);
		codesByName.put(ClosingDateTimeRejection.getCodeName().get(), ClosingDateTimeRejection);
		codesByName.put(VariableRateSupportRejection.getCodeName().get(), VariableRateSupportRejection);
		codesByName.put(MissingOption.getCodeName().get(), MissingOption);
		codesByName.put(NotDefinedAgent.getCodeName().get(), NotDefinedAgent);
		codesByName.put(MissingPeriodEndDate.getCodeName().get(), MissingPeriodEndDate);
		codesByName.put(MissingPeriodStartDate.getCodeName().get(), MissingPeriodStartDate);
		codesByName.put(MissingResultingAmount.getCodeName().get(), MissingResultingAmount);
		codesByName.put(WrongSecurityType.getCodeName().get(), WrongSecurityType);
		codesByName.put(NotEligibleDisperseSecurity.getCodeName().get(), NotEligibleDisperseSecurity);
		codesByName.put(NonEligibleSecurity.getCodeName().get(), NonEligibleSecurity);
		codesByName.put(MissingExchangeRate.getCodeName().get(), MissingExchangeRate);
		codesByName.put(ValueDateBeforePaymentDate.getCodeName().get(), ValueDateBeforePaymentDate);
		codesByName.put(UnexpectedAccruedInterest.getCodeName().get(), UnexpectedAccruedInterest);
		codesByName.put(NoAccessToService.getCodeName().get(), NoAccessToService);
		codesByName.put(IncorrectCertification.getCodeName().get(), IncorrectCertification);
		codesByName.put(NotBusinessDay.getCodeName().get(), NotBusinessDay);
		codesByName.put(EffectiveDayAfterPaymentDate.getCodeName().get(), EffectiveDayAfterPaymentDate);
		codesByName.put(GrossAmountLessThanNetAmount.getCodeName().get(), GrossAmountLessThanNetAmount);
		codesByName.put(MissingDefaultOption.getCodeName().get(), MissingDefaultOption);
		codesByName.put(NonActiveParty.getCodeName().get(), NonActiveParty);
		codesByName.put(PeriodEndDateBeforeStartDate.getCodeName().get(), PeriodEndDateBeforeStartDate);
		codesByName.put(RecordDateAfterPaymentDate.getCodeName().get(), RecordDateAfterPaymentDate);
		codesByName.put(FailedValidation.getCodeName().get(), FailedValidation);
		codesByName.put(EventAlreadyDeactivated.getCodeName().get(), EventAlreadyDeactivated);
		codesByName.put(NoPendingDeactivationInstruction.getCodeName().get(), NoPendingDeactivationInstruction);
		codesByName.put(AmendmentNotAllowed.getCodeName().get(), AmendmentNotAllowed);
		codesByName.put(CancellationNotAllowed.getCodeName().get(), CancellationNotAllowed);
		codesByName.put(Late.getCodeName().get(), Late);
		codesByName.put(ElectionAlreadyCancelled.getCodeName().get(), ElectionAlreadyCancelled);
		codesByName.put(ElectionAlreadyAmended.getCodeName().get(), ElectionAlreadyAmended);
		codesByName.put(SameCAIdentification.getCodeName().get(), SameCAIdentification);
		codesByName.put(InvalidCAIdentification.getCodeName().get(), InvalidCAIdentification);
		codesByName.put(InvalidAgent.getCodeName().get(), InvalidAgent);
		codesByName.put(NotMainAgent.getCodeName().get(), NotMainAgent);
		codesByName.put(InvalidOption.getCodeName().get(), InvalidOption);
		codesByName.put(PendingDeactivation.getCodeName().get(), PendingDeactivation);
		codesByName.put(NotIdentifiedCashAccount.getCodeName().get(), NotIdentifiedCashAccount);
		codesByName.put(NotIdentifiedCorrespondentBank.getCodeName().get(), NotIdentifiedCorrespondentBank);
		codesByName.put(InvalidStandingInstructionType.getCodeName().get(), InvalidStandingInstructionType);
		codesByName.put(NoHolding.getCodeName().get(), NoHolding);
		codesByName.put(InsufficientBalance.getCodeName().get(), InsufficientBalance);
		codesByName.put(SameIdentification.getCodeName().get(), SameIdentification);
		codesByName.put(OptionAlreadyDeactivated.getCodeName().get(), OptionAlreadyDeactivated);
		codesByName.put(InvalidEventType.getCodeName().get(), InvalidEventType);
		codesByName.put(InvalidUnderlyingSecurity.getCodeName().get(), InvalidUnderlyingSecurity);
		codesByName.put(InvalidEventProcessingType.getCodeName().get(), InvalidEventProcessingType);
		codesByName.put(InvalidMandatoryVoluntaryEventType.getCodeName().get(), InvalidMandatoryVoluntaryEventType);
		codesByName.put(InvalidCorporateActionInformation.getCodeName().get(), InvalidCorporateActionInformation);
		codesByName.put(InvalidDetails.getCodeName().get(), InvalidDetails);
		codesByName.put(NoRemainingOption.getCodeName().get(), NoRemainingOption);
		codesByName.put(MismatchedCAIdentification.getCodeName().get(), MismatchedCAIdentification);
		codesByName.put(NotApplicable.getCodeName().get(), NotApplicable);
		codesByName.put(InvalidMovementInformation.getCodeName().get(), InvalidMovementInformation);
		codesByName.put(MovementAlreadySettled.getCodeName().get(), MovementAlreadySettled);
		codesByName.put(NarrativeReason.getCodeName().get(), NarrativeReason);
		codesByName.put(InvalidIdentification.getCodeName().get(), InvalidIdentification);
		codesByName.put(MissingCertification.getCodeName().get(), MissingCertification);
		codesByName.put(LackOfStampDuty.getCodeName().get(), LackOfStampDuty);
		codesByName.put(InvalidRequest.getCodeName().get(), InvalidRequest);
		codesByName.put(PlaceOfSafekeeping.getCodeName().get(), PlaceOfSafekeeping);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(ReceivingDeliveringParty3.getCodeName().get(), ReceivingDeliveringParty3);
		codesByName.put(ReceivingDeliveringParty2.getCodeName().get(), ReceivingDeliveringParty2);
		codesByName.put(ReceivingDeliveringParty1.getCodeName().get(), ReceivingDeliveringParty1);
		codesByName.put(ReceivingDeliveringDepository.getCodeName().get(), ReceivingDeliveringDepository);
		codesByName.put(InvalidModificationRequest.getCodeName().get(), InvalidModificationRequest);
		codesByName.put(InvalidLink.getCodeName().get(), InvalidLink);
		codesByName.put(InvalidBalance.getCodeName().get(), InvalidBalance);
		codesByName.put(InvalidLotNumber.getCodeName().get(), InvalidLotNumber);
		codesByName.put(InvalidRule.getCodeName().get(), InvalidRule);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(InvalidInvestorParty.getCodeName().get(), InvalidInvestorParty);
		codesByName.put(MissingBeneficiaryOwnerDetails.getCodeName().get(), MissingBeneficiaryOwnerDetails);
		codesByName.put(ClosingTransactionAmount.getCodeName().get(), ClosingTransactionAmount);
		codesByName.put(OrderDateNotProvided.getCodeName().get(), OrderDateNotProvided);
		codesByName.put(TradedQuantityHigherThanOriginalOrderQuantity.getCodeName().get(), TradedQuantityHigherThanOriginalOrderQuantity);
		codesByName.put(TransactionNoticeAlreadyAcceptedOrRejected.getCodeName().get(), TransactionNoticeAlreadyAcceptedOrRejected);
		codesByName.put(TransactionNoticeIDUnknown.getCodeName().get(), TransactionNoticeIDUnknown);
		codesByName.put(NotAvailable.getCodeName().get(), NotAvailable);
		codesByName.put(AmountRejection.getCodeName().get(), AmountRejection);
		codesByName.put(CurrencyRejection.getCodeName().get(), CurrencyRejection);
		codesByName.put(InstructionTypeRejection.getCodeName().get(), InstructionTypeRejection);
	}

	public static RejectionReasonV3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static RejectionReasonV3Code[] values() {
		RejectionReasonV3Code[] values = new RejectionReasonV3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, RejectionReasonV3Code> {
		@Override
		public RejectionReasonV3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(RejectionReasonV3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}