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
 * Specifies the subtype of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReorganizationRelatedAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmReorganizationRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestDueWasErroneouslyPaidToYouByTheIssuer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmInterestDueWasErroneouslyPaidToYouByTheIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAllocationOfBabyBondsAmountToBeExited
 * DTCAdjustmentPaymentSubReasonCode.mmAllocationOfBabyBondsAmountToBeExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestorDividendDueOnConversion
 * DTCAdjustmentPaymentSubReasonCode.mmInterestorDividendDueOnConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAccruedInterestWrongRate
 * DTCAdjustmentPaymentSubReasonCode.mmAccruedInterestWrongRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestAdjustedDueToEarlyWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.mmInterestAdjustedDueToEarlyWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAccruedInterestNotPaid
 * DTCAdjustmentPaymentSubReasonCode.mmAccruedInterestNotPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCompanyInDefault
 * DTCAdjustmentPaymentSubReasonCode.mmCompanyInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmIssueInDefault
 * DTCAdjustmentPaymentSubReasonCode.mmIssueInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestAllocatedInError
 * DTCAdjustmentPaymentSubReasonCode.mmInterestAllocatedInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmTenderFeeDeduction
 * DTCAdjustmentPaymentSubReasonCode.mmTenderFeeDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmSupplementaryInterimOn
 * DTCAdjustmentPaymentSubReasonCode.mmSupplementaryInterimOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmGracePeriod
 * DTCAdjustmentPaymentSubReasonCode.mmGracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPaymentOfFullAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReasonCode.mmPaymentOfFullAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentToAvoidFiscalPayment
 * DTCAdjustmentPaymentSubReasonCode.mmAdjustmentToAvoidFiscalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRevisionOfChargeForWithholdingTax
 * DTCAdjustmentPaymentSubReasonCode.mmRevisionOfChargeForWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestOrDividendDueOnMerger
 * DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestPaysAtMaturity
 * DTCAdjustmentPaymentSubReasonCode.mmInterestPaysAtMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCompanyDidNotDeclareDividend
 * DTCAdjustmentPaymentSubReasonCode.mmCompanyDidNotDeclareDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestOrDividendDueOnRepaymentOption
 * DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnRepaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPaymentOfPartialAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReasonCode.mmPaymentOfPartialAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCalledCertificatesAccruedErroneousInterestChargeBack
 * DTCAdjustmentPaymentSubReasonCode.
 * mmCalledCertificatesAccruedErroneousInterestChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestOrDividendDueOnRedemption
 * DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAssumedByYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.mmAssumedByYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmScriptSharesExited
 * DTCAdjustmentPaymentSubReasonCode.mmScriptSharesExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterestOrDividendDueOnTender
 * DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmUninsuredInterestWithheld
 * DTCAdjustmentPaymentSubReasonCode.mmUninsuredInterestWithheld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDWACBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.mmDWACBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCODBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.mmCODBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmWithdrawalTransferBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.mmWithdrawalTransferBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * mmCODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonCode.
 * mmCODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReversalOfACODWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.mmReversalOfACODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCustodyPayment
 * DTCAdjustmentPaymentSubReasonCode.mmCustodyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCalledCertificatesCheckInParticipantsNameChargeBack
 * DTCAdjustmentPaymentSubReasonCode.
 * mmCalledCertificatesCheckInParticipantsNameChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPacificDepository
 * DTCAdjustmentPaymentSubReasonCode.mmPacificDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMidwestDepository
 * DTCAdjustmentPaymentSubReasonCode.mmMidwestDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPhiladelphiaDepository
 * DTCAdjustmentPaymentSubReasonCode.mmPhiladelphiaDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAccrualClaimPayment
 * DTCAdjustmentPaymentSubReasonCode.mmAccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPartClaimPayment
 * DTCAdjustmentPaymentSubReasonCode.mmPartClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReversalOfAnAccrualClaimPayment
 * DTCAdjustmentPaymentSubReasonCode.mmReversalOfAnAccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPartClaimReversal
 * DTCAdjustmentPaymentSubReasonCode.mmPartClaimReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCouponCollectionService
 * DTCAdjustmentPaymentSubReasonCode.mmCouponCollectionService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReversalOfADeposit
 * DTCAdjustmentPaymentSubReasonCode.mmReversalOfADeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDeliverOrderActivity
 * DTCAdjustmentPaymentSubReasonCode.mmDeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReverseOfTheSharesEscheatedToNYStateInError
 * DTCAdjustmentPaymentSubReasonCode.
 * mmReverseOfTheSharesEscheatedToNYStateInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmChargeForFrenchAvoidFiscalTaxCredit
 * DTCAdjustmentPaymentSubReasonCode.mmChargeForFrenchAvoidFiscalTaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReverseOfEscheatedAmountOfClaim
 * DTCAdjustmentPaymentSubReasonCode.mmReverseOfEscheatedAmountOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmForeignCashDividendsOrBondInterestAllocationAtExemptRate
 * DTCAdjustmentPaymentSubReasonCode.
 * mmForeignCashDividendsOrBondInterestAllocationAtExemptRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmForeignCashDividendsOrBondsInterestAllocationAtFavorableRate
 * DTCAdjustmentPaymentSubReasonCode.
 * mmForeignCashDividendsOrBondsInterestAllocationAtFavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmFrenchWithholdingTax15Percent
 * DTCAdjustmentPaymentSubReasonCode.mmFrenchWithholdingTax15Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmFrenchWithholdingTax25Percent
 * DTCAdjustmentPaymentSubReasonCode.mmFrenchWithholdingTax25Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmLostCertificateRegisteredInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * mmLostCertificateRegisteredInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDepositTransferredIntoTheNameOfTheCEDEAndCo
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDepositTransferredIntoTheNameOfTheCEDEAndCo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReasonCode.mmPositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmLostCertificateWasRegisteredInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonCode.
 * mmLostCertificateWasRegisteredInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPreviouslyCalledCertificatesFundsDelivery
 * DTCAdjustmentPaymentSubReasonCode.mmPreviouslyCalledCertificatesFundsDelivery
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless
 * DTCAdjustmentPaymentSubReasonCode.
 * mmCTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmFrenchWithholdingTax10Percent
 * DTCAdjustmentPaymentSubReasonCode.mmFrenchWithholdingTax10Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmChargeAtWithholdingRate
 * DTCAdjustmentPaymentSubReasonCode.mmChargeAtWithholdingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRefundedTaxRate
 * DTCAdjustmentPaymentSubReasonCode.mmRefundedTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRateUnknown
 * DTCAdjustmentPaymentSubReasonCode.mmRateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDelete
 * DTCAdjustmentPaymentSubReasonCode.mmDelete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReinstate
 * DTCAdjustmentPaymentSubReasonCode.mmReinstate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPostDateChangeForFailTracking
 * DTCAdjustmentPaymentSubReasonCode.mmPostDateChangeForFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAnnouncementDeletedOrFailTracking
 * DTCAdjustmentPaymentSubReasonCode.mmAnnouncementDeletedOrFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDueBill
 * DTCAdjustmentPaymentSubReasonCode.mmDueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmLateAnnouncement
 * DTCAdjustmentPaymentSubReasonCode.mmLateAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDateRevision
 * DTCAdjustmentPaymentSubReasonCode.mmDateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRateRevision
 * DTCAdjustmentPaymentSubReasonCode.mmRateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmNonAllocation
 * DTCAdjustmentPaymentSubReasonCode.mmNonAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRefundOfFrenchTaxJune
 * DTCAdjustmentPaymentSubReasonCode.mmRefundOfFrenchTaxJune}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRefundOfFrenchTaxJuly
 * DTCAdjustmentPaymentSubReasonCode.mmRefundOfFrenchTaxJuly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate
 * DTCAdjustmentPaymentSubReasonCode.
 * mmForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRedemptionCash
 * DTCAdjustmentPaymentSubReasonCode.mmRedemptionCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAllocationAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBond
 * DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRedemptionPaymentDueToPledgeRelease
 * DTCAdjustmentPaymentSubReasonCode.mmRedemptionPaymentDueToPledgeRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInSettlementOfATradeDTCCReorgAccount
 * DTCAdjustmentPaymentSubReasonCode.mmInSettlementOfATradeDTCCReorgAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimOnRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimOnRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInterimPositionAdjustedForDeliverOrderActivity
 * DTCAdjustmentPaymentSubReasonCode.
 * mmInterimPositionAdjustedForDeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmLateAnnouncementActivityDueBillActivity
 * DTCAdjustmentPaymentSubReasonCode.mmLateAnnouncementActivityDueBillActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCODWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.mmCODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDepositAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmDepositAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRedemptionAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmRedemptionAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPledgeReleaseAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmPledgeReleaseAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmWriteOffReorganization
 * DTCAdjustmentPaymentSubReasonCode.mmWriteOffReorganization}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInvestmentIdAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmInvestmentIdAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPledgeAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmPledgeAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDeliverOrder
 * DTCAdjustmentPaymentSubReasonCode.mmDeliverOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReorganizationAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmReorganizationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmWithdrawalTransferAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmWithdrawalTransferAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBondCoupon
 * DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit
 * DTCAdjustmentPaymentSubReasonCode.
 * mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.
 * mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn
 * DTCAdjustmentPaymentSubReasonCode.
 * mmMuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBondCouponAdjustmentExcessCouponsDepositedOn
 * DTCAdjustmentPaymentSubReasonCode.
 * mmMuniBearerBondCouponAdjustmentExcessCouponsDepositedOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmMuniBearerBondCouponPositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReasonCode.
 * mmMuniBearerBondCouponPositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentForCashOnIncreasedShares
 * DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForCashOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmOptionalDividendAllocationAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmOptionalDividendAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmProceedsFromSaleOf
 * DTCAdjustmentPaymentSubReasonCode.mmProceedsFromSaleOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmWrongRatePrincipal
 * DTCAdjustmentPaymentSubReasonCode.mmWrongRatePrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentForWrittenInquiry
 * DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForWrittenInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmChangeInTheRecordDate
 * DTCAdjustmentPaymentSubReasonCode.mmChangeInTheRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentIsInResponseToYourInquiry
 * DTCAdjustmentPaymentSubReasonCode.mmAdjustmentIsInResponseToYourInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRepPaymentCharge
 * DTCAdjustmentPaymentSubReasonCode.mmRepPaymentCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmSupplementalInterimActivity
 * DTCAdjustmentPaymentSubReasonCode.mmSupplementalInterimActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmInLieuOfReorgDepositActivity
 * DTCAdjustmentPaymentSubReasonCode.mmInLieuOfReorgDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRateChange
 * DTCAdjustmentPaymentSubReasonCode.mmRateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPriceCorrectionDividendReinvestment
 * DTCAdjustmentPaymentSubReasonCode.mmPriceCorrectionDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCashDueOnAnAccruedStockPayment
 * DTCAdjustmentPaymentSubReasonCode.mmCashDueOnAnAccruedStockPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDividendReinvestmentAllocation
 * DTCAdjustmentPaymentSubReasonCode.mmDividendReinvestmentAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCashDueOnStockDividend
 * DTCAdjustmentPaymentSubReasonCode.mmCashDueOnStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentToYourDividendReinvestmentPosition
 * DTCAdjustmentPaymentSubReasonCode.
 * mmAdjustmentToYourDividendReinvestmentPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmCashDueOnDRPShareAllocation
 * DTCAdjustmentPaymentSubReasonCode.mmCashDueOnDRPShareAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDividendReinvestmentAllocationOfCashInLieuOfFractions
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDividendReinvestmentAllocationOfCashInLieuOfFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentForCashInLieuOfFractionalShares
 * DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForCashInLieuOfFractionalShares
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmStockLoanAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmStockLoanAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmSupplementalInterimActivityFromMidwest
 * DTCAdjustmentPaymentSubReasonCode.mmSupplementalInterimActivityFromMidwest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmProceedsFromBuyTransactionInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * mmProceedsFromBuyTransactionInOurDTCCDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmSupplementalInterimActivityFromPhiladelphia
 * DTCAdjustmentPaymentSubReasonCode.
 * mmSupplementalInterimActivityFromPhiladelphia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmStockLoanOrRepoPaymentOrder
 * DTCAdjustmentPaymentSubReasonCode.mmStockLoanOrRepoPaymentOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * mmShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * mmShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmChargeInLieuOfReceiptOfDividendReinvestment
 * DTCAdjustmentPaymentSubReasonCode.
 * mmChargeInLieuOfReceiptOfDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAllocationAdjustmentDueToFractionsRoundedUpByTheAgent
 * DTCAdjustmentPaymentSubReasonCode.
 * mmAllocationAdjustmentDueToFractionsRoundedUpByTheAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * mmProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent
 * DTCAdjustmentPaymentSubReasonCode.
 * mmDividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAllocationOfDRPTEDSInstruction
 * DTCAdjustmentPaymentSubReasonCode.mmAllocationOfDRPTEDSInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmTaxExemptInstructions
 * DTCAdjustmentPaymentSubReasonCode.mmTaxExemptInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmLostCertificateWasRegisteredInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmLostCertificateWasRegisteredInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmRecordDatePositionAdjustedForaWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * mmRecordDatePositionAdjustedForaWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName
 * DTCAdjustmentPaymentSubReasonCode.
 * mmAdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName
 * DTCAdjustmentPaymentSubReasonCode.
 * mmAdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers
 * DTCAdjustmentPaymentSubReasonCode.
 * mmPositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmReversalOfaWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReasonCode.mmReversalOfaWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmWithholdingTaxAdjustmentInUserDefinedCountry
 * DTCAdjustmentPaymentSubReasonCode.
 * mmWithholdingTaxAdjustmentInUserDefinedCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmUnfavorableRateMerger
 * DTCAdjustmentPaymentSubReasonCode.mmUnfavorableRateMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmFractionalRights
 * DTCAdjustmentPaymentSubReasonCode.mmFractionalRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDWACAdjustment
 * DTCAdjustmentPaymentSubReasonCode.mmDWACAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmForeignCashDividendUnfavorableRate
 * DTCAdjustmentPaymentSubReasonCode.mmForeignCashDividendUnfavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmFrozenLetterMovement
 * DTCAdjustmentPaymentSubReasonCode.mmFrozenLetterMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmVodaphoneADR
 * DTCAdjustmentPaymentSubReasonCode.mmVodaphoneADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAdditionalRightsForBeneficialOwner
 * DTCAdjustmentPaymentSubReasonCode.mmAdditionalRightsForBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmBabyBondPayment
 * DTCAdjustmentPaymentSubReasonCode.mmBabyBondPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDueBillReversal
 * DTCAdjustmentPaymentSubReasonCode.mmDueBillReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmDueBillFailTracking
 * DTCAdjustmentPaymentSubReasonCode.mmDueBillFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmSpinOffAllocation
 * DTCAdjustmentPaymentSubReasonCode.mmSpinOffAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmAgentPaidBasedOnCombinedFractions
 * DTCAdjustmentPaymentSubReasonCode.mmAgentPaidBasedOnCombinedFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmPaynInKindDistribution
 * DTCAdjustmentPaymentSubReasonCode.mmPaynInKindDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#mmOther
 * DTCAdjustmentPaymentSubReasonCode.mmOther}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
 * DTCAdjustmentPaymentSubReason1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentSubReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the subtype of the payment adjustment."</li>
 * </ul>
 */
public class DTCAdjustmentPaymentSubReasonCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Reorganization related adjustment on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S777"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganizationRelatedAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reorganization related adjustment on user defined date."</li>
	 * </ul>
	 */
	public static final MMCode mmReorganizationRelatedAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganizationRelatedAdjustment";
			definition = "Reorganization related adjustment on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "S777";
		}
	};
	/**
	 * The interest due on the above cusip was erroneously paid to you by the
	 * issuer although the certificate of deposit was transferred to CEDE (DTCC)
	 * prior to the interest payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S66P"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueWasErroneouslyPaidToYouByTheIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The interest due on the above cusip was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInterestDueWasErroneouslyPaidToYouByTheIssuer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueWasErroneouslyPaidToYouByTheIssuer";
			definition = "The interest due on the above cusip was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "S66P";
		}
	};
	/**
	 * Allocation of baby bonds amount to be exited in USD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SABA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfBabyBondsAmountToBeExited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation of baby bonds amount to be exited in USD."</li>
	 * </ul>
	 */
	public static final MMCode mmAllocationOfBabyBondsAmountToBeExited = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfBabyBondsAmountToBeExited";
			definition = "Allocation of baby bonds amount to be exited in USD.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SABA";
		}
	};
	/**
	 * Interest or dividend due on conversion related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAC7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestorDividendDueOnConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest or dividend due on conversion related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestorDividendDueOnConversion = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestorDividendDueOnConversion";
			definition = "Interest or dividend due on conversion related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAC7";
		}
	};
	/**
	 * The accrued interest previously paid to you was at the wrong rate. This
	 * adjustment is to correct that erroneous payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestWrongRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccruedInterestWrongRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestWrongRate";
			definition = "The accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SACA";
		}
	};
	/**
	 * Interest adjusted due to early withdrawal (certificate of deposit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAdjustedDueToEarlyWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest adjusted due to early withdrawal (certificate of deposit)."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestAdjustedDueToEarlyWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAdjustedDueToEarlyWithdrawal";
			definition = "Interest adjusted due to early withdrawal (certificate of deposit).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SACB";
		}
	};
	/**
	 * Accrued interest was not previously paid to you for the redemption in
	 * this issue. This adjustment is to pay you for this accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestNotPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccruedInterestNotPaid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestNotPaid";
			definition = "Accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SACP";
		}
	};
	/**
	 * Company in default related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SADA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyInDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company in default related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmCompanyInDefault = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyInDefault";
			definition = "Company in default related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SADA";
		}
	};
	/**
	 * Issue in default related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SADM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueInDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issue in default related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmIssueInDefault = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueInDefault";
			definition = "Issue in default related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SADM";
		}
	};
	/**
	 * Interest allocated in error first payment on "date user defined".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAllocatedInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest allocated in error first payment on \"date user defined\"."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestAllocatedInError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAllocatedInError";
			definition = "Interest allocated in error first payment on \"date user defined\".";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAEA";
		}
	};
	/**
	 * Interest adjusted due to tender fee deduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAF7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderFeeDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest adjusted due to tender fee deduction."</li>
	 * </ul>
	 */
	public static final MMCode mmTenderFeeDeduction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderFeeDeduction";
			definition = "Interest adjusted due to tender fee deduction.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAF7";
		}
	};
	/**
	 * Supplementary interim on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryInterimOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplementary interim on  user defined date."</li>
	 * </ul>
	 */
	public static final MMCode mmSupplementaryInterimOn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryInterimOn";
			definition = "Supplementary interim on  user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAFA";
		}
	};
	/**
	 * Company is taking 30 day grace period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAGA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Company is taking 30 day grace period."</li>
	 * </ul>
	 */
	public static final MMCode mmGracePeriod = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			definition = "Company is taking 30 day grace period.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAGA";
		}
	};
	/**
	 * Payment of full avoid fiscal tax refund (equal to 42.5% of the dividend).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAHA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfFullAvoidFiscalTaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of full avoid fiscal tax refund (equal to 42.5% of the dividend)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPaymentOfFullAvoidFiscalTaxRefund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfFullAvoidFiscalTaxRefund";
			definition = "Payment of full avoid fiscal tax refund (equal to 42.5% of the dividend).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAHA";
		}
	};
	/**
	 * Adjustment to avoid fiscal payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAIA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentToAvoidFiscalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment to avoid fiscal payment."</li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentToAvoidFiscalPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToAvoidFiscalPayment";
			definition = "Adjustment to avoid fiscal payment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAIA";
		}
	};
	/**
	 * Revision of charge for withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAJA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevisionOfChargeForWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Revision of charge for withholding tax."</li>
	 * </ul>
	 */
	public static final MMCode mmRevisionOfChargeForWithholdingTax = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevisionOfChargeForWithholdingTax";
			definition = "Revision of charge for withholding tax.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAJA";
		}
	};
	/**
	 * Interest or dividend due on merger related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAM7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest or dividend due on merger related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestOrDividendDueOnMerger = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnMerger";
			definition = "Interest or dividend due on merger related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAM7";
		}
	};
	/**
	 * Interest pays at maturity. Allocated in error onn user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAMA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaysAtMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest pays at maturity. Allocated in error onn user defined date."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestPaysAtMaturity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaysAtMaturity";
			definition = "Interest pays at maturity. Allocated in error onn user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAMA";
		}
	};
	/**
	 * Company never declared dividend adjust allocation on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SANA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyDidNotDeclareDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Company never declared dividend adjust allocation on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCompanyDidNotDeclareDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyDidNotDeclareDividend";
			definition = "Company never declared dividend adjust allocation on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SANA";
		}
	};
	/**
	 * Interest or dividend due on repayment option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAP7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRepaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest or dividend due on repayment option."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestOrDividendDueOnRepaymentOption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRepaymentOption";
			definition = "Interest or dividend due on repayment option.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAP7";
		}
	};
	/**
	 * Payment of partial avoid fiscal tax refund (equal to 15% of the
	 * dividend).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfPartialAvoidFiscalTaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment of partial avoid fiscal tax refund (equal to 15% of the dividend)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPaymentOfPartialAvoidFiscalTaxRefund = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfPartialAvoidFiscalTaxRefund";
			definition = "Payment of partial avoid fiscal tax refund (equal to 15% of the dividend).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAPA";
		}
	};
	/**
	 * Certificates you deposited prior to publication date were subsequently
	 * called. the agent paid DTCC the principal redemption proceeds but
	 * erroneously paid you the accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesAccruedErroneousInterestChargeBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCalledCertificatesAccruedErroneousInterestChargeBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesAccruedErroneousInterestChargeBack";
			definition = "Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAPP";
		}
	};
	/**
	 * Interest or dividend due on redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAR7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interest or dividend due on redemption."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestOrDividendDueOnRedemption = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRedemption";
			definition = "Interest or dividend due on redemption.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAR7";
		}
	};
	/**
	 * Allocation for a Participant position that was assumed by your goodselves
	 * paid on - retired Participant number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SARA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssumedByYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocation for a Participant position that was assumed by your goodselves paid on - retired Participant number."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAssumedByYourGoodselves = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssumedByYourGoodselves";
			definition = "Allocation for a Participant position that was assumed by your goodselves paid on - retired Participant number.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SARA";
		}
	};
	/**
	 * Allocation of script shares amount to be exited in dollar value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SASA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScriptSharesExited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocation of script shares amount to be exited in dollar value."</li>
	 * </ul>
	 */
	public static final MMCode mmScriptSharesExited = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScriptSharesExited";
			definition = "Allocation of script shares amount to be exited in dollar value.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SASA";
		}
	};
	/**
	 * Interestor dividend due on tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAT7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Interestor dividend due on tender."</li>
	 * </ul>
	 */
	public static final MMCode mmInterestOrDividendDueOnTender = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnTender";
			definition = "Interestor dividend due on tender.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAT7";
		}
	};
	/**
	 * Uninsured interest withheld as per FSLICN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninsuredInterestWithheld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Uninsured interest withheld as per FSLICN."</li>
	 * </ul>
	 */
	public static final MMCode mmUninsuredInterestWithheld = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninsuredInterestWithheld";
			definition = "Uninsured interest withheld as per FSLICN.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAWA";
		}
	};
	/**
	 * Your record date position was adjusted for a DWAC buy back withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your record date position was adjusted for a DWAC buy back withdrawal."</li>
	 * </ul>
	 */
	public static final MMCode mmDWACBuyBackWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACBuyBackWithdrawal";
			definition = "Your record date position was adjusted for a DWAC buy back withdrawal.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSBB";
		}
	};
	/**
	 * Your record date position was adjusted for a COD buy back withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBB1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your record date position was adjusted for a COD buy back withdrawal."</li>
	 * </ul>
	 */
	public static final MMCode mmCODBuyBackWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODBuyBackWithdrawal";
			definition = "Your record date position was adjusted for a COD buy back withdrawal.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBB1";
		}
	};
	/**
	 * Your record date position was adjusted for a w/t buy back withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBB2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your record date position was adjusted for a w/t buy back withdrawal."</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalTransferBuyBackWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferBuyBackWithdrawal";
			definition = "Your record date position was adjusted for a w/t buy back withdrawal.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBB2";
		}
	};
	/**
	 * Your COD withdrawal was not delivered, however the certificate(s) were
	 * issued and outstanding over the record date in the name of your
	 * goodselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBDB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your goodselves."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves";
			definition = "Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your goodselves.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBDB";
		}
	};
	/**
	 * Your COD withdrawal was not delivered, however the certificate(s) were
	 * issued and outstanding over the record date in the name of your nominee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBEB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee";
			definition = "Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBEB";
		}
	};
	/**
	 * Reversal of a COD withdrawal related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBRH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfACODWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal of a COD withdrawal related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalOfACODWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfACODWithdrawal";
			definition = "Reversal of a COD withdrawal related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBRH";
		}
	};
	/**
	 * Custody payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Custody payment."</li>
	 * </ul>
	 */
	public static final MMCode mmCustodyPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyPayment";
			definition = "Custody payment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCDP";
		}
	};
	/**
	 * Certificates you deposited prior to publication date were subsequently
	 * called. the agent paid DTCC the principal proceeds via check, but in your
	 * customer’s name. we are forwarding the check today. this adjustment is to
	 * charge you for the funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCKS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesCheckInParticipantsNameChargeBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal proceeds via check, but in your customer’s name. we are forwarding the check today. this adjustment is to charge you for the funds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCalledCertificatesCheckInParticipantsNameChargeBack = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesCheckInParticipantsNameChargeBack";
			definition = "Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal proceeds via check, but in your customer’s name. we are forwarding the check today. this adjustment is to charge you for the funds.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCKS";
		}
	};
	/**
	 * Adjustment made for the Pacific depository (3097).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCLU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PacificDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment made for the Pacific depository (3097)."</li>
	 * </ul>
	 */
	public static final MMCode mmPacificDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PacificDepository";
			definition = "Adjustment made for the Pacific depository (3097).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCLU";
		}
	};
	/**
	 * Adjustment made for the Midwest depository (6942).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCMU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidwestDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment made for the Midwest depository (6942)."</li>
	 * </ul>
	 */
	public static final MMCode mmMidwestDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidwestDepository";
			definition = "Adjustment made for the Midwest depository (6942).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCMU";
		}
	};
	/**
	 * Adjustment made for the Philadelphia depository (6070).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhiladelphiaDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment made for the Philadelphia depository (6070)."</li>
	 * </ul>
	 */
	public static final MMCode mmPhiladelphiaDepository = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhiladelphiaDepository";
			definition = "Adjustment made for the Philadelphia depository (6070).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCNU";
		}
	};
	/**
	 * Accrual claim payment related to a stock distribution payable on user
	 * defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccrualClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accrual claim payment related to a stock distribution payable on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccrualClaimPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccrualClaimPayment";
			definition = "Accrual claim payment related to a stock distribution payable on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCPK";
		}
	};
	/**
	 * Part claim payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Part claim payment."</li>
	 * </ul>
	 */
	public static final MMCode mmPartClaimPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimPayment";
			definition = "Part claim payment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCPP";
		}
	};
	/**
	 * Reversal of an accrual claim payment related to a stock distribution
	 * payable on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfAnAccrualClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reversal of an accrual claim payment related to a stock distribution payable on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReversalOfAnAccrualClaimPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfAnAccrualClaimPayment";
			definition = "Reversal of an accrual claim payment related to a stock distribution payable on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCRK";
		}
	};
	/**
	 * Part-claim reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Part-claim reversal."</li>
	 * </ul>
	 */
	public static final MMCode mmPartClaimReversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimReversal";
			definition = "Part-claim reversal.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCRP";
		}
	};
	/**
	 * Coupon collection service adjustment for coupon deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCSM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponCollectionService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Coupon collection service adjustment for coupon deposit."</li>
	 * </ul>
	 */
	public static final MMCode mmCouponCollectionService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponCollectionService";
			definition = "Coupon collection service adjustment for coupon deposit.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SCSM";
		}
	};
	/**
	 * Reversal of a deposit adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfADeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal of a deposit adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalOfADeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfADeposit";
			definition = "Reversal of a deposit adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDRH";
		}
	};
	/**
	 * Your record date position was adjusted for deliver order (DO) activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrderActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your record date position was adjusted for deliver order (DO) activity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDeliverOrderActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrderActivity";
			definition = "Your record date position was adjusted for deliver order (DO) activity.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SEEE";
		}
	};
	/**
	 * Shares escheated to New York state in error; affidavit to follow. This is
	 * to reverse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfTheSharesEscheatedToNYStateInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Shares escheated to New York state in error; affidavit to follow. This is to reverse."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReverseOfTheSharesEscheatedToNYStateInError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfTheSharesEscheatedToNYStateInError";
			definition = "Shares escheated to New York state in error; affidavit to follow. This is to reverse.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SETO";
		}
	};
	/**
	 * As per agent, this charge is for french avoid fiscal tax credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFAF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeForFrenchAvoidFiscalTaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per agent, this charge is for french avoid fiscal tax credit."</li>
	 * </ul>
	 */
	public static final MMCode mmChargeForFrenchAvoidFiscalTaxCredit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeForFrenchAvoidFiscalTaxCredit";
			definition = "As per agent, this charge is for french avoid fiscal tax credit.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFAF";
		}
	};
	/**
	 * Funds previously escheated to ny state, affidavit to follow this is to
	 * reverse escheated amount of claim paid on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfEscheatedAmountOfClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds previously escheated to ny state, affidavit to follow this is to reverse escheated amount of claim paid on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmReverseOfEscheatedAmountOfClaim = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfEscheatedAmountOfClaim";
			definition = "Funds previously escheated to ny state, affidavit to follow this is to reverse escheated amount of claim paid on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFAP";
		}
	};
	/**
	 * Foreign cash dividends/bond interest allocation at exempt rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFE8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign cash dividends/bond interest allocation at exempt rate."</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCashDividendsOrBondInterestAllocationAtExemptRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate";
			definition = "Foreign cash dividends/bond interest allocation at exempt rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFE8";
		}
	};
	/**
	 * Foreign cash dividends/bonds interest allocation at favorable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFF8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign cash dividends/bonds interest allocation at favorable rate."</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCashDividendsOrBondsInterestAllocationAtFavorableRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate";
			definition = "Foreign cash dividends/bonds interest allocation at favorable rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFF8";
		}
	};
	/**
	 * Fifteen percent french withholding tax, based on your option election of
	 * 100% ADRs at the favorable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFG8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax15Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fifteen percent french withholding tax, based on your option election of 100% ADRs at the favorable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFrenchWithholdingTax15Percent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax15Percent";
			definition = "Fifteen percent french withholding tax, based on your option election of 100% ADRs at the favorable rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFG8";
		}
	};
	/**
	 * Twenty five percent french withholding tax, based on your option election
	 * of 100% ADRs at the unfavorable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFG9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax25Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Twenty five percent french withholding tax, based on your option election of 100% ADRs at the unfavorable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFrenchWithholdingTax25Percent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax25Percent";
			definition = "Twenty five percent french withholding tax, based on your option election of 100% ADRs at the unfavorable rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFG9";
		}
	};
	/**
	 * Adjustment related to the deposit of lost certificate over the record
	 * date was registered in the name of your [user defined].
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDAD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your [user defined]."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour";
			definition = "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your [user defined].";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDAD";
		}
	};
	/**
	 * Adjustment related to the deposit of lost certificate over the record
	 * date was registered in the name of your goodselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDBD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateRegisteredInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your goodselves."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLostCertificateRegisteredInTheNameOfYourGoodselves = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateRegisteredInTheNameOfYourGoodselves";
			definition = "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your goodselves.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDBD";
		}
	};
	/**
	 * Deposit after cut off date transferred into the name of the CEDE on
	 * record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDCD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositTransferredIntoTheNameOfTheCEDEAndCo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Deposit after cut off date  transferred into the name of the CEDE on record date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDepositTransferredIntoTheNameOfTheCEDEAndCo = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositTransferredIntoTheNameOfTheCEDEAndCo";
			definition = "Deposit after cut off date  transferred into the name of the CEDE on record date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDCD";
		}
	};
	/**
	 * Your record date position was adjusted for deposit activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAdjustedForDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your record date position was adjusted for deposit activity."</li>
	 * </ul>
	 */
	public static final MMCode mmPositionAdjustedForDepositActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAdjustedForDepositActivity";
			definition = "Your record date position was adjusted for deposit activity.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDDD";
		}
	};
	/**
	 * Adjustment related to the deposit of lost certificate over the record
	 * date was registered in the name of your nominee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your nominee."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLostCertificateWasRegisteredInTheNameOfYourNominee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourNominee";
			definition = "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your nominee.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDED";
		}
	};
	/**
	 * You deposited securities that were previously called. the agent paid DTCC
	 * the redemption proceeds. this adjustment is to pass these proceeds on to
	 * you. your free account security position will be adjusted (shorted) today
	 * for the called quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDEP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyCalledCertificatesFundsDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "You deposited securities that were previously called. the agent paid DTCC the redemption proceeds. this adjustment is to pass these proceeds on to you. your free account security position will be adjusted (shorted) today for the called quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPreviouslyCalledCertificatesFundsDelivery = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCalledCertificatesFundsDelivery";
			definition = "You deposited securities that were previously called. the agent paid DTCC the redemption proceeds. this adjustment is to pass these proceeds on to you. your free account security position will be adjusted (shorted) today for the called quantity.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDEP";
		}
	};
	/**
	 * CTF(s) held over record date on which we guarantee to hold you free and
	 * harmless of any further claim on this dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless";
			definition = "CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SDMT";
		}
	};
	/**
	 * Ten percent french withholding tax, based on your revised instructions to
	 * reduce favorable tax status to unfavorable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFH9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax10Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ten percent french withholding tax, based on your revised instructions to reduce favorable tax status to unfavorable."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFrenchWithholdingTax10Percent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax10Percent";
			definition = "Ten percent french withholding tax, based on your revised instructions to reduce favorable tax status to unfavorable.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFH9";
		}
	};
	/**
	 * Required lists contained discrepancies or were not forwarded to french
	 * paying agent. This charge is at user defined withholding rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFI9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeAtWithholdingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Required lists contained discrepancies or were not forwarded to french paying agent. This charge is at user defined withholding rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChargeAtWithholdingRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAtWithholdingRate";
			definition = "Required lists contained discrepancies or were not forwarded to french paying agent. This charge is at user defined withholding rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFI9";
		}
	};
	/**
	 * The 25% french withholding rate has been revised. This adjustment is
	 * based on the refunded tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFJ9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The 25% french withholding rate has been revised. This adjustment is based on the refunded tax rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRefundedTaxRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedTaxRate";
			definition = "The 25% french withholding rate has been revised. This adjustment is based on the refunded tax rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFJ9";
		}
	};
	/**
	 * Rate unknown for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate unknown for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmRateUnknown = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateUnknown";
			definition = "Rate unknown for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFL0";
		}
	};
	/**
	 * Deletefor fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Deletefor fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmDelete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			definition = "Deletefor fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFL1";
		}
	};
	/**
	 * Reinstate for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinstate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reinstate for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmReinstate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinstate";
			definition = "Reinstate for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFL2";
		}
	};
	/**
	 * Post date changefor fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostDateChangeForFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Post date changefor fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmPostDateChangeForFailTracking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostDateChangeForFailTracking";
			definition = "Post date changefor fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFL3";
		}
	};
	/**
	 * Announcement deleted for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDeletedOrFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Announcement deleted for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmAnnouncementDeletedOrFailTracking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDeletedOrFailTracking";
			definition = "Announcement deleted for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFLD";
		}
	};
	/**
	 * Due bill for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due bill for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmDueBill = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBill";
			definition = "Due bill for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFLE";
		}
	};
	/**
	 * Fail tracking for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fail tracking for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmLateAnnouncement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncement";
			definition = "Fail tracking for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFLL";
		}
	};
	/**
	 * Date revision for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateRevision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date revision for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmDateRevision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRevision";
			definition = "Date revision for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFLN";
		}
	};
	/**
	 * Rate revisionfor fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateRevision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate revisionfor fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmRateRevision = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateRevision";
			definition = "Rate revisionfor fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFLR";
		}
	};
	/**
	 * Non allocation for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Non allocation for fail tracking related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmNonAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonAllocation";
			definition = "Non allocation for fail tracking related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFLS";
		}
	};
	/**
	 * Refund of french tax based on acceptance of global reclamation for the
	 * june 1992 distribution refer to important notice b # 1352‑93.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJune"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refund of french tax based on acceptance of global reclamation for the june 1992 distribution refer to important notice  b # 1352‑93."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRefundOfFrenchTaxJune = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJune";
			definition = "Refund of french tax based on acceptance of global reclamation for the june 1992 distribution refer to important notice  b # 1352‑93.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFRA";
		}
	};
	/**
	 * Refund of french tax based on acceptance of global reclamation for the
	 * july 1992 distribution refer to important notice b # 1352‑93
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJuly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Refund of french tax based on acceptance of global reclamation for the july 1992 distribution refer to important notice  b # 1352‑93"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRefundOfFrenchTaxJuly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJuly";
			definition = "Refund of french tax based on acceptance of global reclamation for the july 1992 distribution refer to important notice  b # 1352‑93";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFRB";
		}
	};
	/**
	 * Foreign cash dividends or bond interest allocation at unfavorable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFU9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Foreign cash dividends or bond interest allocation at unfavorable rate."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate";
			definition = "Foreign cash dividends or bond interest allocation at unfavorable rate.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFU9";
		}
	};
	/**
	 * Redemption cash settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGL7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption cash settlement."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemptionCash = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCash";
			definition = "Redemption cash settlement.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGL7";
		}
	};
	/**
	 * Allocation adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation adjustment. "</li>
	 * </ul>
	 */
	public static final MMCode mmAllocationAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustment";
			definition = "Allocation adjustment. ";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGLA";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment (same as line 118).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Muni bearer bond coupon adjustment (same as line 118)."</li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBond = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBond";
			definition = "Muni bearer bond coupon adjustment (same as line 118).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGLM";
		}
	};
	/**
	 * Redemption payment due to pledge release.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentDueToPledgeRelease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption payment due to pledge release."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemptionPaymentDueToPledgeRelease = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentDueToPledgeRelease";
			definition = "Redemption payment due to pledge release.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGLP";
		}
	};
	/**
	 * DTCC claim on registered holder in the name of your goodselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim on registered holder in the name of your goodselves."</li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves";
			definition = "DTCC claim on registered holder in the name of your goodselves.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGLQ";
		}
	};
	/**
	 * In settlement of a trade - DTCC reorg account 428-10271-1-2-039.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSettlementOfATradeDTCCReorgAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "In settlement of a trade - DTCC reorg account 428-10271-1-2-039."</li>
	 * </ul>
	 */
	public static final MMCode mmInSettlementOfATradeDTCCReorgAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSettlementOfATradeDTCCReorgAccount";
			definition = "In settlement of a trade - DTCC reorg account 428-10271-1-2-039.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGLT";
		}
	};
	/**
	 * DTCC claim on registered holder in the name of your customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim on registered holder in the name of your customer."</li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimOnRegisteredHolderInTheNameOfYourCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer";
			definition = "DTCC claim on registered holder in the name of your customer.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SGLZ";
		}
	};
	/**
	 * Your interim position was adjusted for deliver orderactivity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimPositionAdjustedForDeliverOrderActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your interim position was adjusted for deliver orderactivity. "</li>
	 * </ul>
	 */
	public static final MMCode mmInterimPositionAdjustedForDeliverOrderActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPositionAdjustedForDeliverOrderActivity";
			definition = "Your interim position was adjusted for deliver orderactivity. ";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SIGE";
		}
	};
	/**
	 * Late announcement activity due bill activity related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SILL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncementActivityDueBillActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Late announcement activity due bill activity related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmLateAnnouncementActivityDueBillActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementActivityDueBillActivity";
			definition = "Late announcement activity due bill activity related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SILL";
		}
	};
	/**
	 * DTCC COD withdrawal adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJCB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC COD withdrawal adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmCODWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawal";
			definition = "DTCC COD withdrawal adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJCB";
		}
	};
	/**
	 * DTCC deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJDD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC deposit  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmDepositAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAdjustment";
			definition = "DTCC deposit  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJDD";
		}
	};
	/**
	 * DTCC redemption related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJE7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC redemption related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmRedemptionAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAdjustment";
			definition = "DTCC redemption related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJE7";
		}
	};
	/**
	 * DTCC pledge release related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeReleaseAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC pledge release related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmPledgeReleaseAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeReleaseAdjustment";
			definition = "DTCC pledge release related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJEE";
		}
	};
	/**
	 * Write off reorganization related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WriteOffReorganization"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Write off reorganization related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmWriteOffReorganization = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WriteOffReorganization";
			definition = "Write off reorganization related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJEW";
		}
	};
	/**
	 * DTCC investment id related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJIE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentIdAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC investment id  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmInvestmentIdAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentIdAdjustment";
			definition = "DTCC investment id  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJIE";
		}
	};
	/**
	 * DTCC pledge related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC pledge related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmPledgeAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeAdjustment";
			definition = "DTCC pledge related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJEF";
		}
	};
	/**
	 * DTCC deliver order related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC deliver order related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmDeliverOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrder";
			definition = "DTCC deliver order related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJEG";
		}
	};
	/**
	 * DTCC reorganization related adjustment.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJR7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganizationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC reorganization  related adjustment.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmReorganizationAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganizationAdjustment";
			definition = "DTCC reorganization  related adjustment.\r\n";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJR7";
		}
	};
	/**
	 * DTCC WT related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJWT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "DTCC WT related adjustment.   "</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalTransferAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferAdjustment";
			definition = "DTCC WT related adjustment.   ";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SJWT";
		}
	};
	/**
	 * DTCC claim against registered holder in the name of your customer. Late
	 * identification of missed transfer by Transfer Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer";
			definition = "DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SLCP";
		}
	};
	/**
	 * DTCC claim against registered holder in the name of your goodselves. Late
	 * identification of missed transfer by Transfer Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim against registered holder in the name of your goodselves. Late identification of missed transfer by Transfer Agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer";
			definition = "DTCC claim against registered holder in the name of your goodselves. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SLGP";
		}
	};
	/**
	 * DTCC claim against registered holder in the name of your nominee. Late
	 * identification of missed transfer by Transfer Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee";
			definition = "DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SLNP";
		}
	};
	/**
	 * Muni bearer bond coupon related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Muni bearer bond coupon  related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBondCoupon = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCoupon";
			definition = "Muni bearer bond coupon  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMAM";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment for coupon(s) missing from a deposit
	 * related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMBM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Muni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit";
			definition = "Muni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMBM";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment for coupon(s) missing from a
	 * withdrawal
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMCM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal"
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal";
			definition = "Muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMCM";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment excess coupon(s) withdrawn on user
	 * defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn";
			definition = "Muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMDM";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment excess coupon(s) deposited on user
	 * defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMEM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBondCouponAdjustmentExcessCouponsDepositedOn = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn";
			definition = "Muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMEM";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment your interim position was adjusted for
	 * deposit activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponPositionAdjustedForDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Muni bearer bond coupon adjustment your interim position was adjusted for deposit activity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMuniBearerBondCouponPositionAdjustedForDepositActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponPositionAdjustedForDepositActivity";
			definition = "Muni bearer bond coupon adjustment your interim position was adjusted for deposit activity.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMMM";
		}
	};
	/**
	 * Adjustment for cash on increased shares due to a stock distribution
	 * payable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentForCashOnIncreasedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment for cash on increased shares due to a stock distribution payable."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentForCashOnIncreasedShares = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForCashOnIncreasedShares";
			definition = "Adjustment for cash on increased shares due to a stock distribution payable.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SNNG";
		}
	};
	/**
	 * Optional dividend (ops) allocation related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOP2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividendAllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Optional dividend (ops) allocation related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmOptionalDividendAllocationAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendAllocationAdjustment";
			definition = "Optional dividend (ops) allocation related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SOP2";
		}
	};
	/**
	 * DTCC claim against registered holder in the name of your customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim against registered holder in the name of your customer."</li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer";
			definition = "DTCC claim against registered holder in the name of your customer.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SPCP";
		}
	};
	/**
	 * Proceeds from sale of.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromSaleOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proceeds from sale of."</li>
	 * </ul>
	 */
	public static final MMCode mmProceedsFromSaleOf = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSaleOf";
			definition = "Proceeds from sale of.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SPFS";
		}
	};
	/**
	 * DTCC claim against registered holder in the name of your goodselves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPGP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim against registered holder in the name of your goodselves."</li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves";
			definition = "DTCC claim against registered holder in the name of your goodselves.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SPGP";
		}
	};
	/**
	 * DTCC claim against registered holder in the name of your nominee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DTCC claim against registered holder in the name of your nominee."</li>
	 * </ul>
	 */
	public static final MMCode mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer";
			definition = "DTCC claim against registered holder in the name of your nominee.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SPNP";
		}
	};
	/**
	 * The principal previously paid to you was at the wrong rate. This
	 * adjustment is to correct that erroneous payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRatePrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWrongRatePrincipal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRatePrincipal";
			definition = "The principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SPRA";
		}
	};
	/**
	 * This adjustment is in responve to your written inquiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRAH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentForWrittenInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "This adjustment is in responve to your written inquiry."</li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentForWrittenInquiry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForWrittenInquiry";
			definition = "This adjustment is in responve to your written inquiry.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRAH";
		}
	};
	/**
	 * Allocation adjustment due to a change in the record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRDA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInTheRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation adjustment due to a change in the record date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChangeInTheRecordDate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInTheRecordDate";
			definition = "Allocation adjustment due to a change in the record date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRDA";
		}
	};
	/**
	 * This adjustment is in response to your inquiry. refer to control number:
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRIH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentIsInResponseToYourInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This adjustment is in response to your inquiry. refer to control number: "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentIsInResponseToYourInquiry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentIsInResponseToYourInquiry";
			definition = "This adjustment is in response to your inquiry. refer to control number: ";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRIH";
		}
	};
	/**
	 * Rep payment/charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepPaymentCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rep payment/charge."</li>
	 * </ul>
	 */
	public static final MMCode mmRepPaymentCharge = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepPaymentCharge";
			definition = "Rep payment/charge.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRPO";
		}
	};
	/**
	 * Supplemental interim activity related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplemental interim activity related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmSupplementalInterimActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivity";
			definition = "Supplemental interim activity related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRPP";
		}
	};
	/**
	 * This adjustment represents credits/debits to your account in lieu of
	 * reorg deposit activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InLieuOfReorgDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This adjustment represents credits/debits to your account in lieu of reorg deposit activity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInLieuOfReorgDepositActivity = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InLieuOfReorgDepositActivity";
			definition = "This adjustment represents credits/debits to your account in lieu of reorg deposit activity.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SPRG";
		}
	};
	/**
	 * This allocation was adjusted for a rate change. Please refer to DIVA
	 * comment field for additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRateChange = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChange";
			definition = "This allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information. ";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRTA";
		}
	};
	/**
	 * Allocation adjustment for dividend reinvestment due to price correction
	 * by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSA6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCorrectionDividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocation adjustment for dividend reinvestment due to price correction by the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPriceCorrectionDividendReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionDividendReinvestment";
			definition = "Allocation adjustment for dividend reinvestment due to price correction by the agent.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSA6";
		}
	};
	/**
	 * Adjustment for cash due on an accrued stock payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnAnAccruedStockPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment for cash due on an accrued stock payment."</li>
	 * </ul>
	 */
	public static final MMCode mmCashDueOnAnAccruedStockPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnAnAccruedStockPayment";
			definition = "Adjustment for cash due on an accrued stock payment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSBK";
		}
	};
	/**
	 * Dividend reinvestment allocation why not on normal event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSC6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend reinvestment allocation why not on normal event."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividendReinvestmentAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocation";
			definition = "Dividend reinvestment allocation why not on normal event.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSC6";
		}
	};
	/**
	 * Accrued cash due on a stock dividend adjustment made on user defined
	 * date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnStockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Accrued cash due on a stock dividend adjustment made on user defined date."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCashDueOnStockDividend = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnStockDividend";
			definition = "Accrued cash due on a stock dividend adjustment made on user defined date.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSCK";
		}
	};
	/**
	 * Adjustment to your dividend reinvestment (DRP) position related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSD6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentToYourDividendReinvestmentPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment to your dividend reinvestment (DRP) position related adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentToYourDividendReinvestmentPosition = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToYourDividendReinvestmentPosition";
			definition = "Adjustment to your dividend reinvestment (DRP) position related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSD6";
		}
	};
	/**
	 * Accrued cash due on DRP share allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSDK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnDRPShareAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Accrued cash due on DRP share allocation."</li>
	 * </ul>
	 */
	public static final MMCode mmCashDueOnDRPShareAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnDRPShareAllocation";
			definition = "Accrued cash due on DRP share allocation.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSDK";
		}
	};
	/**
	 * Dividend reinvestment (DRP) allocation of cash in lieu of fractions
	 * related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSE6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocationOfCashInLieuOfFractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend reinvestment (DRP) allocation of cash in lieu of fractions  related adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividendReinvestmentAllocationOfCashInLieuOfFractions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationOfCashInLieuOfFractions";
			definition = "Dividend reinvestment (DRP) allocation of cash in lieu of fractions  related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSE6";
		}
	};
	/**
	 * Adjustment for cash-in-lieu of fractional shares related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSJJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentForCashInLieuOfFractionalShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment for cash-in-lieu of fractional shares related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentForCashInLieuOfFractionalShares = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForCashInLieuOfFractionalShares";
			definition = "Adjustment for cash-in-lieu of fractional shares related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSJJ";
		}
	};
	/**
	 * Stock loan related payment or charge.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSLA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock loan related payment or charge.\r\n"</li>
	 * </ul>
	 */
	public static final MMCode mmStockLoanAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanAdjustment";
			definition = "Stock loan related payment or charge.\r\n";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSLA";
		}
	};
	/**
	 * Supplemental interim activity from midwest (6942).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromMidwest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplemental interim activity from midwest (6942)."</li>
	 * </ul>
	 */
	public static final MMCode mmSupplementalInterimActivityFromMidwest = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromMidwest";
			definition = "Supplemental interim activity from midwest (6942).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSME";
		}
	};
	/**
	 * Proceeds resulting from a (buy) transaction affected in our DTCC/dividend
	 * trading account (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSP4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds resulting from a (buy) transaction affected in our  DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProceedsFromBuyTransactionInOurDTCCDividendTradingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount";
			definition = "Proceeds resulting from a (buy) transaction affected in our  DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSP4";
		}
	};
	/**
	 * Supplemental interim activity from Philadelphia (6070).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromPhiladelphia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Supplemental interim activity from Philadelphia (6070)."</li>
	 * </ul>
	 */
	public static final MMCode mmSupplementalInterimActivityFromPhiladelphia = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromPhiladelphia";
			definition = "Supplemental interim activity from Philadelphia (6070).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSPE";
		}
	};
	/**
	 * Stock loan or repo payment order related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanOrRepoPaymentOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stock loan or repo payment order related adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmStockLoanOrRepoPaymentOrder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanOrRepoPaymentOrder";
			definition = "Stock loan or repo payment order related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSPO";
		}
	};
	/**
	 * Share adjustment resulting from a (buy) transaction affected in our
	 * DTCC/dividend trading account (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSR4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount";
			definition = "Share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSR4";
		}
	};
	/**
	 * Share adjustment resulting from a (sell) transaction affected in our
	 * DTCC/dividend trading account (#428‑10288‑1‑3‑039) .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSR5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039) ."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount";
			definition = "Share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039) .";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSR5";
		}
	};
	/**
	 * As per your authorization, we are charging your account in lieu of
	 * receipt of dividend reinvestment related shares related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSR6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeInLieuOfReceiptOfDividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmChargeInLieuOfReceiptOfDividendReinvestment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeInLieuOfReceiptOfDividendReinvestment";
			definition = "As per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSR6";
		}
	};
	/**
	 * Allocation adjustment due to fractions rounded up by the agent related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSRJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustmentDueToFractionsRoundedUpByTheAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocation adjustment due to fractions rounded up by the agent related adjustment."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAllocationAdjustmentDueToFractionsRoundedUpByTheAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustmentDueToFractionsRoundedUpByTheAgent";
			definition = "Allocation adjustment due to fractions rounded up by the agent related adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSRJ";
		}
	};
	/**
	 * Proceeds resulting from a (sell) transaction affected in our
	 * DTCC/dividend trading account (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSS5"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount";
			definition = "Proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSS5";
		}
	};
	/**
	 * DRP allocation adjustment due to your sub accounting instructions to the
	 * agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSS6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "DRP allocation adjustment due to your sub accounting instructions to the agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent";
			definition = "DRP allocation adjustment due to your sub accounting instructions to the agent.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSS6";
		}
	};
	/**
	 * Allocation of dividend reinvestment shares - DRP/TEDS instruction @100%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SST6"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfDRPTEDSInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allocation of dividend reinvestment shares - DRP/TEDS  instruction @100%."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAllocationOfDRPTEDSInstruction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfDRPTEDSInstruction";
			definition = "Allocation of dividend reinvestment shares - DRP/TEDS  instruction @100%.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SST6";
		}
	};
	/**
	 * To adjust allocation at 100% on your tax exempt instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "To adjust allocation at 100% on your tax exempt instructions."</li>
	 * </ul>
	 */
	public static final MMCode mmTaxExemptInstructions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptInstructions";
			definition = "To adjust allocation at 100% on your tax exempt instructions.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "STEA";
		}
	};
	/**
	 * Withdrawal by transfer - lost certificate over the record date was
	 * registered in the name of your customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWG1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withdrawal by transfer - lost certificate over the record date was registered in the name of your customer."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLostCertificateWasRegisteredInTheNameOfYourCustomer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourCustomer";
			definition = "Withdrawal by transfer - lost certificate over the record date was registered in the name of your customer.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWG1";
		}
	};
	/**
	 * Our record date position was adjusted for a withdrawal by transfer
	 * activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWHT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDatePositionAdjustedForaWithdrawalByTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Our record date position was adjusted for a withdrawal by transfer activity."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRecordDatePositionAdjustedForaWithdrawalByTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDatePositionAdjustedForaWithdrawalByTransfer";
			definition = "Our record date position was adjusted for a withdrawal by transfer activity.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWHT";
		}
	};
	/**
	 * Adjustment made for a withdrawal by transfer that was not transferred
	 * into your clients name by the record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWL1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date. "
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName";
			definition = "Adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date. ";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWL1";
		}
	};
	/**
	 * Adjustment made for a withdrawal by transfer set up after the cut off
	 * date made transfer into your clients name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWM1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName";
			definition = "Adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWM1";
		}
	};
	/**
	 * Your position was reinstated for a withdrawal by transfer. However the
	 * certificates(s) were issued and outstanding over the record date in the
	 * name of your customer(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWN1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s)."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers";
			definition = "Your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s).";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWN1";
		}
	};
	/**
	 * Reversal of a withdrawal by transfer adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWRH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfaWithdrawalByTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reversal of a withdrawal by transfer adjustment."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalOfaWithdrawalByTransfer = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfaWithdrawalByTransfer";
			definition = "Reversal of a withdrawal by transfer adjustment.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWRH";
		}
	};
	/**
	 * Adjustment to allocation to charge (user defined percentage) withholding
	 * tax in (user defined) country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWTA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAdjustmentInUserDefinedCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithholdingTaxAdjustmentInUserDefinedCountry = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAdjustmentInUserDefinedCountry";
			definition = "Adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SWTA";
		}
	};
	/**
	 * Your account is being credited at the unfav rate (20%) as a result of the
	 * reorg merger pd on 4/2/93 (Armstrong Pharm to Medeva plc, eff 1/15/93; if
	 * entitled to fav rate(15%), you must follow attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAA7"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfavorableRateMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your account is being credited at the unfav rate (20%) as a result of the reorg merger pd on 4/2/93 (Armstrong Pharm to Medeva plc, eff 1/15/93; if entitled to fav rate(15%), you must follow attached."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnfavorableRateMerger = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfavorableRateMerger";
			definition = "Your account is being credited at the unfav rate (20%) as a result of the reorg merger pd on 4/2/93 (Armstrong Pharm to Medeva plc, eff 1/15/93; if entitled to fav rate(15%), you must follow attached.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAA7";
		}
	};
	/**
	 * Allocation of fractional rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation of fractional rights."</li>
	 * </ul>
	 */
	public static final MMCode mmFractionalRights = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalRights";
			definition = "Allocation of fractional rights.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SAFR";
		}
	};
	/**
	 * Your record date position was adjusted for a DWAC withdrawal to effect a
	 * buy back/treasury purchase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBB3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDWACAdjustment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACAdjustment";
			definition = "Your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBB3";
		}
	};
	/**
	 * Foreign cash dividends allocation at unfavorable rate
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL9"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendUnfavorableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Foreign cash dividends allocation at unfavorable rate"</li>
	 * </ul>
	 */
	public static final MMCode mmForeignCashDividendUnfavorableRate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendUnfavorableRate";
			definition = "Foreign cash dividends allocation at unfavorable rate";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFL9";
		}
	};
	/**
	 * As per memo requesting a frozen letter movement from part number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrozenLetterMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As per memo requesting a frozen letter movement from part number."</li>
	 * </ul>
	 */
	public static final MMCode mmFrozenLetterMovement = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrozenLetterMovement";
			definition = "As per memo requesting a frozen letter movement from part number.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFRO";
		}
	};
	/**
	 * Option to receive Vodafone Group adrs at 11.354392 for every 100 adrs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VodaphoneADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option to receive Vodafone Group adrs at 11.354392 for every 100 adrs."</li>
	 * </ul>
	 */
	public static final MMCode mmVodaphoneADR = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VodaphoneADR";
			definition = "Option to receive Vodafone Group adrs at 11.354392 for every 100 adrs.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRRA";
		}
	};
	/**
	 * Distribution of additional rights for round up of fractions as requested
	 * for your beneficial owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRTJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightsForBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of additional rights for round up of fractions as requested for your beneficial owners."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAdditionalRightsForBeneficialOwner = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightsForBeneficialOwner";
			definition = "Distribution of additional rights for round up of fractions as requested for your beneficial owners.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SRTJ";
		}
	};
	/**
	 * Bond pays in baby bonds that are issued in minimum/incre-mental
	 * denominations; this is to adjust for the amount of pending unissued
	 * bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSDJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BabyBondPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bond pays in baby bonds that are issued in minimum/incre-mental denominations; this is to adjust for the amount of pending unissued bonds."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBabyBondPayment = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondPayment";
			definition = "Bond pays in baby bonds that are issued in minimum/incre-mental denominations; this is to adjust for the amount of pending unissued bonds.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSDJ";
		}
	};
	/**
	 * Due bill fail tracking reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSFR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due bill fail tracking reversal."</li>
	 * </ul>
	 */
	public static final MMCode mmDueBillReversal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillReversal";
			definition = "Due bill fail tracking reversal.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSFR";
		}
	};
	/**
	 * Due bill fail tracking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Due bill fail tracking."</li>
	 * </ul>
	 */
	public static final MMCode mmDueBillFailTracking = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillFailTracking";
			definition = "Due bill fail tracking.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSFF";
		}
	};
	/**
	 * Allocation of spinoff security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSOS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOffAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation of spinoff security."</li>
	 * </ul>
	 */
	public static final MMCode mmSpinOffAllocation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOffAllocation";
			definition = "Allocation of spinoff security.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSOS";
		}
	};
	/**
	 * Agent paid DTC based on combined fractions for all public service–new
	 * hamp.(new) spinoffs distributed on july 25, 1991.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentPaidBasedOnCombinedFractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agent paid DTC based on combined fractions for all public service–new hamp.(new) spinoffs distributed on july 25, 1991."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAgentPaidBasedOnCombinedFractions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentPaidBasedOnCombinedFractions";
			definition = "Agent paid DTC based on combined fractions for all public service–new hamp.(new) spinoffs distributed on july 25, 1991.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSPJ";
		}
	};
	/**
	 * Allocation of a Pay in Kind distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaynInKindDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation of a Pay in Kind distribution."</li>
	 * </ul>
	 */
	public static final MMCode mmPaynInKindDistribution = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaynInKindDistribution";
			definition = "Allocation of a Pay in Kind distribution.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSPA";
		}
	};
	/**
	 * Reserved for new user defined reason codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
	 * DTCAdjustmentPaymentSubReasonCode}</li>
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
	 * definition} = "Reserved for new user defined reason codes."</li>
	 * </ul>
	 */
	public static final MMCode mmOther = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "OTHR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentSubReasonCode";
				definition = "Specifies the subtype of the payment adjustment.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReorganizationRelatedAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestDueWasErroneouslyPaidToYouByTheIssuer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAllocationOfBabyBondsAmountToBeExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestorDividendDueOnConversion,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAccruedInterestWrongRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestAdjustedDueToEarlyWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAccruedInterestNotPaid, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCompanyInDefault,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmIssueInDefault, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestAllocatedInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmTenderFeeDeduction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmSupplementaryInterimOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmGracePeriod, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPaymentOfFullAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentToAvoidFiscalPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRevisionOfChargeForWithholdingTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnMerger, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestPaysAtMaturity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCompanyDidNotDeclareDividend, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnRepaymentOption,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPaymentOfPartialAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCalledCertificatesAccruedErroneousInterestChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnRedemption, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAssumedByYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmScriptSharesExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterestOrDividendDueOnTender,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmUninsuredInterestWithheld, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDWACBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCODBuyBackWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmWithdrawalTransferBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReversalOfACODWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCustodyPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCalledCertificatesCheckInParticipantsNameChargeBack, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPacificDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMidwestDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPhiladelphiaDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPartClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReversalOfAnAccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPartClaimReversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCouponCollectionService, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReversalOfADeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDeliverOrderActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReverseOfTheSharesEscheatedToNYStateInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmChargeForFrenchAvoidFiscalTaxCredit, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReverseOfEscheatedAmountOfClaim,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmForeignCashDividendsOrBondInterestAllocationAtExemptRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmForeignCashDividendsOrBondsInterestAllocationAtFavorableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmFrenchWithholdingTax15Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmFrenchWithholdingTax25Percent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmLostCertificateRegisteredInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDepositTransferredIntoTheNameOfTheCEDEAndCo,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmLostCertificateWasRegisteredInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPreviouslyCalledCertificatesFundsDelivery,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmFrenchWithholdingTax10Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmChargeAtWithholdingRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRefundedTaxRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRateUnknown,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDelete, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReinstate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPostDateChangeForFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAnnouncementDeletedOrFailTracking,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDueBill, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmLateAnnouncement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDateRevision, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRateRevision,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmNonAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRefundOfFrenchTaxJune,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRefundOfFrenchTaxJuly,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRedemptionCash, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBond, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRedemptionPaymentDueToPledgeRelease,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInSettlementOfATradeDTCCReorgAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimOnRegisteredHolderInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInterimPositionAdjustedForDeliverOrderActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmLateAnnouncementActivityDueBillActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCODWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDepositAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRedemptionAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPledgeReleaseAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmWriteOffReorganization,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInvestmentIdAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPledgeAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDeliverOrder, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReorganizationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmWithdrawalTransferAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCoupon,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCouponAdjustmentExcessCouponsDepositedOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmMuniBearerBondCouponPositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForCashOnIncreasedShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmOptionalDividendAllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmProceedsFromSaleOf,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmWrongRatePrincipal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForWrittenInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmChangeInTheRecordDate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentIsInResponseToYourInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRepPaymentCharge, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmSupplementalInterimActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmInLieuOfReorgDepositActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPriceCorrectionDividendReinvestment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCashDueOnAnAccruedStockPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDividendReinvestmentAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCashDueOnStockDividend,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentToYourDividendReinvestmentPosition, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmCashDueOnDRPShareAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDividendReinvestmentAllocationOfCashInLieuOfFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForCashInLieuOfFractionalShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmStockLoanAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmSupplementalInterimActivityFromMidwest,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmProceedsFromBuyTransactionInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmSupplementalInterimActivityFromPhiladelphia, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmStockLoanOrRepoPaymentOrder,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmChargeInLieuOfReceiptOfDividendReinvestment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAllocationAdjustmentDueToFractionsRoundedUpByTheAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAllocationOfDRPTEDSInstruction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmTaxExemptInstructions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmLostCertificateWasRegisteredInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmRecordDatePositionAdjustedForaWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmReversalOfaWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmWithholdingTaxAdjustmentInUserDefinedCountry, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmUnfavorableRateMerger,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmFractionalRights, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDWACAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmForeignCashDividendUnfavorableRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmFrozenLetterMovement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmVodaphoneADR, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAdditionalRightsForBeneficialOwner,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmBabyBondPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDueBillReversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmDueBillFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmSpinOffAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmAgentPaidBasedOnCombinedFractions, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmPaynInKindDistribution,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmOther);
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentSubReason1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}