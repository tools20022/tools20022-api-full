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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the subtype of the payment adjustment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReorganizationRelatedAdjustment
 * DTCAdjustmentPaymentSubReasonCode.ReorganizationRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestDueWasErroneouslyPaidToYouByTheIssuer
 * DTCAdjustmentPaymentSubReasonCode.
 * InterestDueWasErroneouslyPaidToYouByTheIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AllocationOfBabyBondsAmountToBeExited
 * DTCAdjustmentPaymentSubReasonCode.AllocationOfBabyBondsAmountToBeExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestorDividendDueOnConversion
 * DTCAdjustmentPaymentSubReasonCode.InterestorDividendDueOnConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AccruedInterestWrongRate
 * DTCAdjustmentPaymentSubReasonCode.AccruedInterestWrongRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestAdjustedDueToEarlyWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.InterestAdjustedDueToEarlyWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AccruedInterestNotPaid
 * DTCAdjustmentPaymentSubReasonCode.AccruedInterestNotPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CompanyInDefault
 * DTCAdjustmentPaymentSubReasonCode.CompanyInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#IssueInDefault
 * DTCAdjustmentPaymentSubReasonCode.IssueInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestAllocatedInError
 * DTCAdjustmentPaymentSubReasonCode.InterestAllocatedInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#TenderFeeDeduction
 * DTCAdjustmentPaymentSubReasonCode.TenderFeeDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#SupplementaryInterimOn
 * DTCAdjustmentPaymentSubReasonCode.SupplementaryInterimOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#GracePeriod
 * DTCAdjustmentPaymentSubReasonCode.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PaymentOfFullAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReasonCode.PaymentOfFullAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentToAvoidFiscalPayment
 * DTCAdjustmentPaymentSubReasonCode.AdjustmentToAvoidFiscalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RevisionOfChargeForWithholdingTax
 * DTCAdjustmentPaymentSubReasonCode.RevisionOfChargeForWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestOrDividendDueOnMerger
 * DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestPaysAtMaturity
 * DTCAdjustmentPaymentSubReasonCode.InterestPaysAtMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CompanyDidNotDeclareDividend
 * DTCAdjustmentPaymentSubReasonCode.CompanyDidNotDeclareDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestOrDividendDueOnRepaymentOption
 * DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnRepaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PaymentOfPartialAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReasonCode.PaymentOfPartialAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CalledCertificatesAccruedErroneousInterestChargeBack
 * DTCAdjustmentPaymentSubReasonCode.
 * CalledCertificatesAccruedErroneousInterestChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestOrDividendDueOnRedemption
 * DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AssumedByYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.AssumedByYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ScriptSharesExited
 * DTCAdjustmentPaymentSubReasonCode.ScriptSharesExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterestOrDividendDueOnTender
 * DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#UninsuredInterestWithheld
 * DTCAdjustmentPaymentSubReasonCode.UninsuredInterestWithheld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DWACBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.DWACBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CODBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.CODBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#WithdrawalTransferBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.WithdrawalTransferBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonCode.
 * CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReversalOfACODWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.ReversalOfACODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CustodyPayment
 * DTCAdjustmentPaymentSubReasonCode.CustodyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CalledCertificatesCheckInParticipantsNameChargeBack
 * DTCAdjustmentPaymentSubReasonCode.
 * CalledCertificatesCheckInParticipantsNameChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PacificDepository
 * DTCAdjustmentPaymentSubReasonCode.PacificDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MidwestDepository
 * DTCAdjustmentPaymentSubReasonCode.MidwestDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PhiladelphiaDepository
 * DTCAdjustmentPaymentSubReasonCode.PhiladelphiaDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AccrualClaimPayment
 * DTCAdjustmentPaymentSubReasonCode.AccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PartClaimPayment
 * DTCAdjustmentPaymentSubReasonCode.PartClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReversalOfAnAccrualClaimPayment
 * DTCAdjustmentPaymentSubReasonCode.ReversalOfAnAccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PartClaimReversal
 * DTCAdjustmentPaymentSubReasonCode.PartClaimReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CouponCollectionService
 * DTCAdjustmentPaymentSubReasonCode.CouponCollectionService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReversalOfADeposit
 * DTCAdjustmentPaymentSubReasonCode.ReversalOfADeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DeliverOrderActivity
 * DTCAdjustmentPaymentSubReasonCode.DeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReverseOfTheSharesEscheatedToNYStateInError
 * DTCAdjustmentPaymentSubReasonCode.ReverseOfTheSharesEscheatedToNYStateInError
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ChargeForFrenchAvoidFiscalTaxCredit
 * DTCAdjustmentPaymentSubReasonCode.ChargeForFrenchAvoidFiscalTaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReverseOfEscheatedAmountOfClaim
 * DTCAdjustmentPaymentSubReasonCode.ReverseOfEscheatedAmountOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ForeignCashDividendsOrBondInterestAllocationAtExemptRate
 * DTCAdjustmentPaymentSubReasonCode.
 * ForeignCashDividendsOrBondInterestAllocationAtExemptRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate
 * DTCAdjustmentPaymentSubReasonCode.
 * ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#FrenchWithholdingTax15Percent
 * DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax15Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#FrenchWithholdingTax25Percent
 * DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax25Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour
 * DTCAdjustmentPaymentSubReasonCode.
 * DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#LostCertificateRegisteredInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * LostCertificateRegisteredInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DepositTransferredIntoTheNameOfTheCEDEAndCo
 * DTCAdjustmentPaymentSubReasonCode.DepositTransferredIntoTheNameOfTheCEDEAndCo
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReasonCode.PositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#LostCertificateWasRegisteredInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonCode.
 * LostCertificateWasRegisteredInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PreviouslyCalledCertificatesFundsDelivery
 * DTCAdjustmentPaymentSubReasonCode.PreviouslyCalledCertificatesFundsDelivery}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless
 * DTCAdjustmentPaymentSubReasonCode.
 * CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#FrenchWithholdingTax10Percent
 * DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax10Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ChargeAtWithholdingRate
 * DTCAdjustmentPaymentSubReasonCode.ChargeAtWithholdingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RefundedTaxRate
 * DTCAdjustmentPaymentSubReasonCode.RefundedTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RateUnknown
 * DTCAdjustmentPaymentSubReasonCode.RateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#Delete
 * DTCAdjustmentPaymentSubReasonCode.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#Reinstate
 * DTCAdjustmentPaymentSubReasonCode.Reinstate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PostDateChangeForFailTracking
 * DTCAdjustmentPaymentSubReasonCode.PostDateChangeForFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AnnouncementDeletedOrFailTracking
 * DTCAdjustmentPaymentSubReasonCode.AnnouncementDeletedOrFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DueBill
 * DTCAdjustmentPaymentSubReasonCode.DueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#LateAnnouncement
 * DTCAdjustmentPaymentSubReasonCode.LateAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DateRevision
 * DTCAdjustmentPaymentSubReasonCode.DateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RateRevision
 * DTCAdjustmentPaymentSubReasonCode.RateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#NonAllocation
 * DTCAdjustmentPaymentSubReasonCode.NonAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RefundOfFrenchTaxJune
 * DTCAdjustmentPaymentSubReasonCode.RefundOfFrenchTaxJune}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RefundOfFrenchTaxJuly
 * DTCAdjustmentPaymentSubReasonCode.RefundOfFrenchTaxJuly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate
 * DTCAdjustmentPaymentSubReasonCode.
 * ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RedemptionCash
 * DTCAdjustmentPaymentSubReasonCode.RedemptionCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AllocationAdjustment
 * DTCAdjustmentPaymentSubReasonCode.AllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBond
 * DTCAdjustmentPaymentSubReasonCode.MuniBearerBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RedemptionPaymentDueToPledgeRelease
 * DTCAdjustmentPaymentSubReasonCode.RedemptionPaymentDueToPledgeRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InSettlementOfATradeDTCCReorgAccount
 * DTCAdjustmentPaymentSubReasonCode.InSettlementOfATradeDTCCReorgAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InterimPositionAdjustedForDeliverOrderActivity
 * DTCAdjustmentPaymentSubReasonCode.
 * InterimPositionAdjustedForDeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#LateAnnouncementActivityDueBillActivity
 * DTCAdjustmentPaymentSubReasonCode.LateAnnouncementActivityDueBillActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CODWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.CODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DepositAdjustment
 * DTCAdjustmentPaymentSubReasonCode.DepositAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RedemptionAdjustment
 * DTCAdjustmentPaymentSubReasonCode.RedemptionAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PledgeReleaseAdjustment
 * DTCAdjustmentPaymentSubReasonCode.PledgeReleaseAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#WriteOffReorganization
 * DTCAdjustmentPaymentSubReasonCode.WriteOffReorganization}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InvestmentIdAdjustment
 * DTCAdjustmentPaymentSubReasonCode.InvestmentIdAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PledgeAdjustment
 * DTCAdjustmentPaymentSubReasonCode.PledgeAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DeliverOrder
 * DTCAdjustmentPaymentSubReasonCode.DeliverOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReorganizationAdjustment
 * DTCAdjustmentPaymentSubReasonCode.ReorganizationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#WithdrawalTransferAdjustment
 * DTCAdjustmentPaymentSubReasonCode.WithdrawalTransferAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBondCoupon
 * DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit
 * DTCAdjustmentPaymentSubReasonCode.
 * MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal
 * DTCAdjustmentPaymentSubReasonCode.
 * MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn
 * DTCAdjustmentPaymentSubReasonCode.
 * MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn
 * DTCAdjustmentPaymentSubReasonCode.
 * MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#MuniBearerBondCouponPositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReasonCode.
 * MuniBearerBondCouponPositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentForCashOnIncreasedShares
 * DTCAdjustmentPaymentSubReasonCode.AdjustmentForCashOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#OptionalDividendAllocationAdjustment
 * DTCAdjustmentPaymentSubReasonCode.OptionalDividendAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ProceedsFromSaleOf
 * DTCAdjustmentPaymentSubReasonCode.ProceedsFromSaleOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#WrongRatePrincipal
 * DTCAdjustmentPaymentSubReasonCode.WrongRatePrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentForWrittenInquiry
 * DTCAdjustmentPaymentSubReasonCode.AdjustmentForWrittenInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ChangeInTheRecordDate
 * DTCAdjustmentPaymentSubReasonCode.ChangeInTheRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentIsInResponseToYourInquiry
 * DTCAdjustmentPaymentSubReasonCode.AdjustmentIsInResponseToYourInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RepPaymentCharge
 * DTCAdjustmentPaymentSubReasonCode.RepPaymentCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#SupplementalInterimActivity
 * DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#InLieuOfReorgDepositActivity
 * DTCAdjustmentPaymentSubReasonCode.InLieuOfReorgDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RateChange
 * DTCAdjustmentPaymentSubReasonCode.RateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PriceCorrectionDividendReinvestment
 * DTCAdjustmentPaymentSubReasonCode.PriceCorrectionDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CashDueOnAnAccruedStockPayment
 * DTCAdjustmentPaymentSubReasonCode.CashDueOnAnAccruedStockPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DividendReinvestmentAllocation
 * DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CashDueOnStockDividend
 * DTCAdjustmentPaymentSubReasonCode.CashDueOnStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentToYourDividendReinvestmentPosition
 * DTCAdjustmentPaymentSubReasonCode.
 * AdjustmentToYourDividendReinvestmentPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#CashDueOnDRPShareAllocation
 * DTCAdjustmentPaymentSubReasonCode.CashDueOnDRPShareAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DividendReinvestmentAllocationOfCashInLieuOfFractions
 * DTCAdjustmentPaymentSubReasonCode.
 * DividendReinvestmentAllocationOfCashInLieuOfFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentForCashInLieuOfFractionalShares
 * DTCAdjustmentPaymentSubReasonCode.AdjustmentForCashInLieuOfFractionalShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#StockLoanAdjustment
 * DTCAdjustmentPaymentSubReasonCode.StockLoanAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#SupplementalInterimActivityFromMidwest
 * DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivityFromMidwest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#SupplementalInterimActivityFromPhiladelphia
 * DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivityFromPhiladelphia
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#StockLoanOrRepoPaymentOrder
 * DTCAdjustmentPaymentSubReasonCode.StockLoanOrRepoPaymentOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ChargeInLieuOfReceiptOfDividendReinvestment
 * DTCAdjustmentPaymentSubReasonCode.ChargeInLieuOfReceiptOfDividendReinvestment
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AllocationAdjustmentDueToFractionsRoundedUpByTheAgent
 * DTCAdjustmentPaymentSubReasonCode.
 * AllocationAdjustmentDueToFractionsRoundedUpByTheAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonCode.
 * ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent
 * DTCAdjustmentPaymentSubReasonCode.
 * DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AllocationOfDRPTEDSInstruction
 * DTCAdjustmentPaymentSubReasonCode.AllocationOfDRPTEDSInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#TaxExemptInstructions
 * DTCAdjustmentPaymentSubReasonCode.TaxExemptInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#LostCertificateWasRegisteredInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonCode.
 * LostCertificateWasRegisteredInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#RecordDatePositionAdjustedForaWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReasonCode.
 * RecordDatePositionAdjustedForaWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName
 * DTCAdjustmentPaymentSubReasonCode.
 * AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName
 * DTCAdjustmentPaymentSubReasonCode.
 * AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers
 * DTCAdjustmentPaymentSubReasonCode.
 * PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ReversalOfaWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReasonCode.ReversalOfaWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#WithholdingTaxAdjustmentInUserDefinedCountry
 * DTCAdjustmentPaymentSubReasonCode.
 * WithholdingTaxAdjustmentInUserDefinedCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#UnfavorableRateMerger
 * DTCAdjustmentPaymentSubReasonCode.UnfavorableRateMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#FractionalRights
 * DTCAdjustmentPaymentSubReasonCode.FractionalRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DWACAdjustment
 * DTCAdjustmentPaymentSubReasonCode.DWACAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#ForeignCashDividendUnfavorableRate
 * DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendUnfavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#FrozenLetterMovement
 * DTCAdjustmentPaymentSubReasonCode.FrozenLetterMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#VodaphoneADR
 * DTCAdjustmentPaymentSubReasonCode.VodaphoneADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AdditionalRightsForBeneficialOwner
 * DTCAdjustmentPaymentSubReasonCode.AdditionalRightsForBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#BabyBondPayment
 * DTCAdjustmentPaymentSubReasonCode.BabyBondPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DueBillReversal
 * DTCAdjustmentPaymentSubReasonCode.DueBillReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#DueBillFailTracking
 * DTCAdjustmentPaymentSubReasonCode.DueBillFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#SpinOffAllocation
 * DTCAdjustmentPaymentSubReasonCode.SpinOffAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#AgentPaidBasedOnCombinedFractions
 * DTCAdjustmentPaymentSubReasonCode.AgentPaidBasedOnCombinedFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#PaynInKindDistribution
 * DTCAdjustmentPaymentSubReasonCode.PaynInKindDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode#Other
 * DTCAdjustmentPaymentSubReasonCode.Other}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentSubReasonCode extends MMCode {

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
	public static final DTCAdjustmentPaymentSubReasonCode ReorganizationRelatedAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganizationRelatedAdjustment";
			definition = "Reorganization related adjustment on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestDueWasErroneouslyPaidToYouByTheIssuer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueWasErroneouslyPaidToYouByTheIssuer";
			definition = "The interest due on the above cusip was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AllocationOfBabyBondsAmountToBeExited = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfBabyBondsAmountToBeExited";
			definition = "Allocation of baby bonds amount to be exited in USD.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestorDividendDueOnConversion = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestorDividendDueOnConversion";
			definition = "Interest or dividend due on conversion related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AccruedInterestWrongRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestWrongRate";
			definition = "The accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestAdjustedDueToEarlyWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAdjustedDueToEarlyWithdrawal";
			definition = "Interest adjusted due to early withdrawal (certificate of deposit).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AccruedInterestNotPaid = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestNotPaid";
			definition = "Accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CompanyInDefault = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyInDefault";
			definition = "Company in default related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode IssueInDefault = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueInDefault";
			definition = "Issue in default related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestAllocatedInError = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAllocatedInError";
			definition = "Interest allocated in error first payment on \"date user defined\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode TenderFeeDeduction = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderFeeDeduction";
			definition = "Interest adjusted due to tender fee deduction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "Supplementary interim on user defined date."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode SupplementaryInterimOn = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryInterimOn";
			definition = "Supplementary interim on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode GracePeriod = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			definition = "Company is taking 30 day grace period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PaymentOfFullAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfFullAvoidFiscalTaxRefund";
			definition = "Payment of full avoid fiscal tax refund (equal to 42.5% of the dividend).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentToAvoidFiscalPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToAvoidFiscalPayment";
			definition = "Adjustment to avoid fiscal payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RevisionOfChargeForWithholdingTax = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevisionOfChargeForWithholdingTax";
			definition = "Revision of charge for withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestOrDividendDueOnMerger = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnMerger";
			definition = "Interest or dividend due on merger related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestPaysAtMaturity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaysAtMaturity";
			definition = "Interest pays at maturity. Allocated in error onn user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CompanyDidNotDeclareDividend = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyDidNotDeclareDividend";
			definition = "Company never declared dividend adjust allocation on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestOrDividendDueOnRepaymentOption = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRepaymentOption";
			definition = "Interest or dividend due on repayment option.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PaymentOfPartialAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfPartialAvoidFiscalTaxRefund";
			definition = "Payment of partial avoid fiscal tax refund (equal to 15% of the dividend).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CalledCertificatesAccruedErroneousInterestChargeBack = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesAccruedErroneousInterestChargeBack";
			definition = "Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestOrDividendDueOnRedemption = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRedemption";
			definition = "Interest or dividend due on redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AssumedByYourGoodselves = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssumedByYourGoodselves";
			definition = "Allocation for a Participant position that was assumed by your goodselves paid on - retired Participant number.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ScriptSharesExited = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScriptSharesExited";
			definition = "Allocation of script shares amount to be exited in dollar value.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InterestOrDividendDueOnTender = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnTender";
			definition = "Interestor dividend due on tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode UninsuredInterestWithheld = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninsuredInterestWithheld";
			definition = "Uninsured interest withheld as per FSLICN.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DWACBuyBackWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACBuyBackWithdrawal";
			definition = "Your record date position was adjusted for a DWAC buy back withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CODBuyBackWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODBuyBackWithdrawal";
			definition = "Your record date position was adjusted for a COD buy back withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode WithdrawalTransferBuyBackWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferBuyBackWithdrawal";
			definition = "Your record date position was adjusted for a w/t buy back withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves";
			definition = "Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your goodselves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee";
			definition = "Your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ReversalOfACODWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfACODWithdrawal";
			definition = "Reversal of a COD withdrawal related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CustodyPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyPayment";
			definition = "Custody payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CalledCertificatesCheckInParticipantsNameChargeBack = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesCheckInParticipantsNameChargeBack";
			definition = "Certificates you deposited prior to publication date were subsequently called. the agent paid DTCC the principal proceeds via check, but in your customer’s name. we are forwarding the check today. this adjustment is to charge you for the funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PacificDepository = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PacificDepository";
			definition = "Adjustment made for the Pacific depository (3097).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode MidwestDepository = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidwestDepository";
			definition = "Adjustment made for the Midwest depository (6942).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PhiladelphiaDepository = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhiladelphiaDepository";
			definition = "Adjustment made for the Philadelphia depository (6070).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AccrualClaimPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccrualClaimPayment";
			definition = "Accrual claim payment related to a stock distribution payable on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PartClaimPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimPayment";
			definition = "Part claim payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ReversalOfAnAccrualClaimPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfAnAccrualClaimPayment";
			definition = "Reversal of an accrual claim payment related to a stock distribution payable on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PartClaimReversal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimReversal";
			definition = "Part-claim reversal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CouponCollectionService = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponCollectionService";
			definition = "Coupon collection service adjustment for coupon deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ReversalOfADeposit = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfADeposit";
			definition = "Reversal of a deposit adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DeliverOrderActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrderActivity";
			definition = "Your record date position was adjusted for deliver order (DO) activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ReverseOfTheSharesEscheatedToNYStateInError = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfTheSharesEscheatedToNYStateInError";
			definition = "Shares escheated to New York state in error; affidavit to follow. This is to reverse.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ChargeForFrenchAvoidFiscalTaxCredit = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeForFrenchAvoidFiscalTaxCredit";
			definition = "As per agent, this charge is for french avoid fiscal tax credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ReverseOfEscheatedAmountOfClaim = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfEscheatedAmountOfClaim";
			definition = "Funds previously escheated to ny state, affidavit to follow this is to reverse escheated amount of claim paid on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ForeignCashDividendsOrBondInterestAllocationAtExemptRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate";
			definition = "Foreign cash dividends/bond interest allocation at exempt rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate";
			definition = "Foreign cash dividends/bonds interest allocation at favorable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode FrenchWithholdingTax15Percent = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax15Percent";
			definition = "Fifteen percent french withholding tax, based on your option election of 100% ADRs at the favorable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode FrenchWithholdingTax25Percent = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax25Percent";
			definition = "Twenty five percent french withholding tax, based on your option election of 100% ADRs at the unfavorable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour";
			definition = "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your [user defined].";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode LostCertificateRegisteredInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateRegisteredInTheNameOfYourGoodselves";
			definition = "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your goodselves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Deposit after cut off date transferred into the name of the CEDE on record date."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode DepositTransferredIntoTheNameOfTheCEDEAndCo = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositTransferredIntoTheNameOfTheCEDEAndCo";
			definition = "Deposit after cut off date transferred into the name of the CEDE on record date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAdjustedForDepositActivity";
			definition = "Your record date position was adjusted for deposit activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode LostCertificateWasRegisteredInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourNominee";
			definition = "Adjustment related to the deposit of lost certificate over the record date was registered in the name of your nominee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PreviouslyCalledCertificatesFundsDelivery = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCalledCertificatesFundsDelivery";
			definition = "You deposited securities that were previously called. the agent paid DTCC the redemption proceeds. this adjustment is to pass these proceeds on to you. your free account security position will be adjusted (shorted) today for the called quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless";
			definition = "CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode FrenchWithholdingTax10Percent = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax10Percent";
			definition = "Ten percent french withholding tax, based on your revised instructions to reduce favorable tax status to unfavorable.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ChargeAtWithholdingRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAtWithholdingRate";
			definition = "Required lists contained discrepancies or were not forwarded to french paying agent. This charge is at user defined withholding rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RefundedTaxRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedTaxRate";
			definition = "The 25% french withholding rate has been revised. This adjustment is based on the refunded tax rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RateUnknown = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateUnknown";
			definition = "Rate unknown for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode Delete = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			definition = "Deletefor fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode Reinstate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinstate";
			definition = "Reinstate for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PostDateChangeForFailTracking = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostDateChangeForFailTracking";
			definition = "Post date changefor fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AnnouncementDeletedOrFailTracking = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDeletedOrFailTracking";
			definition = "Announcement deleted for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DueBill = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBill";
			definition = "Due bill for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode LateAnnouncement = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncement";
			definition = "Fail tracking for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DateRevision = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRevision";
			definition = "Date revision for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RateRevision = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateRevision";
			definition = "Rate revisionfor fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode NonAllocation = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonAllocation";
			definition = "Non allocation for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Refund of french tax based on acceptance of global reclamation for the june 1992 distribution refer to important notice b # 1352‑93."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode RefundOfFrenchTaxJune = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJune";
			definition = "Refund of french tax based on acceptance of global reclamation for the june 1992 distribution refer to important notice b # 1352‑93.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SFRA";
		}
	};
	/**
	 * Refund of french tax based on acceptance of global reclamation for the
	 * july 1992 distribution refer to important notice b # 1352‑93.
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
	 * "Refund of french tax based on acceptance of global reclamation for the july 1992 distribution refer to important notice b # 1352‑93."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode RefundOfFrenchTaxJuly = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJuly";
			definition = "Refund of french tax based on acceptance of global reclamation for the july 1992 distribution refer to important notice b # 1352‑93.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate";
			definition = "Foreign cash dividends or bond interest allocation at unfavorable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RedemptionCash = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCash";
			definition = "Redemption cash settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "Allocation adjustment."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode AllocationAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustment";
			definition = "Allocation adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBond = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBond";
			definition = "Muni bearer bond coupon adjustment (same as line 118).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RedemptionPaymentDueToPledgeRelease = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentDueToPledgeRelease";
			definition = "Redemption payment due to pledge release.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves";
			definition = "DTCC claim on registered holder in the name of your goodselves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InSettlementOfATradeDTCCReorgAccount = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSettlementOfATradeDTCCReorgAccount";
			definition = "In settlement of a trade - DTCC reorg account 428-10271-1-2-039.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer";
			definition = "DTCC claim on registered holder in the name of your customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Your interim position was adjusted for deliver orderactivity."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode InterimPositionAdjustedForDeliverOrderActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPositionAdjustedForDeliverOrderActivity";
			definition = "Your interim position was adjusted for deliver orderactivity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode LateAnnouncementActivityDueBillActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementActivityDueBillActivity";
			definition = "Late announcement activity due bill activity related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CODWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawal";
			definition = "DTCC COD withdrawal adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "DTCC deposit related adjustment."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode DepositAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAdjustment";
			definition = "DTCC deposit related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RedemptionAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAdjustment";
			definition = "DTCC redemption related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PledgeReleaseAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeReleaseAdjustment";
			definition = "DTCC pledge release related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode WriteOffReorganization = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WriteOffReorganization";
			definition = "Write off reorganization related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "DTCC investment id related adjustment."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode InvestmentIdAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentIdAdjustment";
			definition = "DTCC investment id related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PledgeAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeAdjustment";
			definition = "DTCC pledge related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DeliverOrder = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrder";
			definition = "DTCC deliver order related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "DTCC reorganization related adjustment.\r\n"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode ReorganizationAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganizationAdjustment";
			definition = "DTCC reorganization related adjustment.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "DTCC WT related adjustment."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode WithdrawalTransferAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferAdjustment";
			definition = "DTCC WT related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer";
			definition = "DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer";
			definition = "DTCC claim against registered holder in the name of your goodselves. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee";
			definition = "DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * definition} = "Muni bearer bond coupon related adjustment."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBondCoupon = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCoupon";
			definition = "Muni bearer bond coupon related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit";
			definition = "Muni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SMBM";
		}
	};
	/**
	 * Muni bearer bond coupon adjustment for coupon(s) missing from a
	 * withdrawal.
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
	 * "Muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal";
			definition = "Muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn";
			definition = "Muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn";
			definition = "Muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode MuniBearerBondCouponPositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponPositionAdjustedForDepositActivity";
			definition = "Muni bearer bond coupon adjustment your interim position was adjusted for deposit activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentForCashOnIncreasedShares = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForCashOnIncreasedShares";
			definition = "Adjustment for cash on increased shares due to a stock distribution payable.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode OptionalDividendAllocationAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendAllocationAdjustment";
			definition = "Optional dividend (ops) allocation related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer";
			definition = "DTCC claim against registered holder in the name of your customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ProceedsFromSaleOf = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSaleOf";
			definition = "Proceeds from sale of.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves";
			definition = "DTCC claim against registered holder in the name of your goodselves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer";
			definition = "DTCC claim against registered holder in the name of your nominee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode WrongRatePrincipal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRatePrincipal";
			definition = "The principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentForWrittenInquiry = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForWrittenInquiry";
			definition = "This adjustment is in responve to your written inquiry.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ChangeInTheRecordDate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInTheRecordDate";
			definition = "Allocation adjustment due to a change in the record date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "This adjustment is in response to your inquiry. refer to control number:"
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentIsInResponseToYourInquiry = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentIsInResponseToYourInquiry";
			definition = "This adjustment is in response to your inquiry. refer to control number:";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RepPaymentCharge = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepPaymentCharge";
			definition = "Rep payment/charge.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode SupplementalInterimActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivity";
			definition = "Supplemental interim activity related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode InLieuOfReorgDepositActivity = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InLieuOfReorgDepositActivity";
			definition = "This adjustment represents credits/debits to your account in lieu of reorg deposit activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "This allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode RateChange = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChange";
			definition = "This allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PriceCorrectionDividendReinvestment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionDividendReinvestment";
			definition = "Allocation adjustment for dividend reinvestment due to price correction by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CashDueOnAnAccruedStockPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnAnAccruedStockPayment";
			definition = "Adjustment for cash due on an accrued stock payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DividendReinvestmentAllocation = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocation";
			definition = "Dividend reinvestment allocation why not on normal event.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CashDueOnStockDividend = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnStockDividend";
			definition = "Accrued cash due on a stock dividend adjustment made on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentToYourDividendReinvestmentPosition = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToYourDividendReinvestmentPosition";
			definition = "Adjustment to your dividend reinvestment (DRP) position related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode CashDueOnDRPShareAllocation = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnDRPShareAllocation";
			definition = "Accrued cash due on DRP share allocation.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Dividend reinvestment (DRP) allocation of cash in lieu of fractions related adjustment."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode DividendReinvestmentAllocationOfCashInLieuOfFractions = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationOfCashInLieuOfFractions";
			definition = "Dividend reinvestment (DRP) allocation of cash in lieu of fractions related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentForCashInLieuOfFractionalShares = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForCashInLieuOfFractionalShares";
			definition = "Adjustment for cash-in-lieu of fractional shares related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode StockLoanAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanAdjustment";
			definition = "Stock loan related payment or charge.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode SupplementalInterimActivityFromMidwest = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromMidwest";
			definition = "Supplemental interim activity from midwest (6942).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Proceeds resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount";
			definition = "Proceeds resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode SupplementalInterimActivityFromPhiladelphia = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromPhiladelphia";
			definition = "Supplemental interim activity from Philadelphia (6070).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode StockLoanOrRepoPaymentOrder = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanOrRepoPaymentOrder";
			definition = "Stock loan or repo payment order related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount";
			definition = "Share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SSR4";
		}
	};
	/**
	 * Share adjustment resulting from a (sell) transaction affected in our
	 * DTCC/dividend trading account (#428‑10288‑1‑3‑039).
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
	 * "Share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount";
			definition = "Share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ChargeInLieuOfReceiptOfDividendReinvestment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeInLieuOfReceiptOfDividendReinvestment";
			definition = "As per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AllocationAdjustmentDueToFractionsRoundedUpByTheAgent = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustmentDueToFractionsRoundedUpByTheAgent";
			definition = "Allocation adjustment due to fractions rounded up by the agent related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount";
			definition = "Proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent";
			definition = "DRP allocation adjustment due to your sub accounting instructions to the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Allocation of dividend reinvestment shares - DRP/TEDS instruction @100%."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode AllocationOfDRPTEDSInstruction = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfDRPTEDSInstruction";
			definition = "Allocation of dividend reinvestment shares - DRP/TEDS instruction @100%.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode TaxExemptInstructions = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptInstructions";
			definition = "To adjust allocation at 100% on your tax exempt instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode LostCertificateWasRegisteredInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourCustomer";
			definition = "Withdrawal by transfer - lost certificate over the record date was registered in the name of your customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode RecordDatePositionAdjustedForaWithdrawalByTransfer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDatePositionAdjustedForaWithdrawalByTransfer";
			definition = "Our record date position was adjusted for a withdrawal by transfer activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	 * "Adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date."
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName";
			definition = "Adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName";
			definition = "Adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers";
			definition = "Your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode ReversalOfaWithdrawalByTransfer = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfaWithdrawalByTransfer";
			definition = "Reversal of a withdrawal by transfer adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode WithholdingTaxAdjustmentInUserDefinedCountry = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAdjustmentInUserDefinedCountry";
			definition = "Adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode UnfavorableRateMerger = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfavorableRateMerger";
			definition = "Your account is being credited at the unfav rate (20%) as a result of the reorg merger pd on 4/2/93 (Armstrong Pharm to Medeva plc, eff 1/15/93; if entitled to fav rate(15%), you must follow attached.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode FractionalRights = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalRights";
			definition = "Allocation of fractional rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DWACAdjustment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACAdjustment";
			definition = "Your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "SBB3";
		}
	};
	/**
	 * Foreign cash dividends allocation at unfavorable rate.
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
	 * definition} = "Foreign cash dividends allocation at unfavorable rate."</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonCode ForeignCashDividendUnfavorableRate = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendUnfavorableRate";
			definition = "Foreign cash dividends allocation at unfavorable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode FrozenLetterMovement = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrozenLetterMovement";
			definition = "As per memo requesting a frozen letter movement from part number.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode VodaphoneADR = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VodaphoneADR";
			definition = "Option to receive Vodafone Group adrs at 11.354392 for every 100 adrs.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AdditionalRightsForBeneficialOwner = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightsForBeneficialOwner";
			definition = "Distribution of additional rights for round up of fractions as requested for your beneficial owners.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode BabyBondPayment = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondPayment";
			definition = "Bond pays in baby bonds that are issued in minimum/incre-mental denominations; this is to adjust for the amount of pending unissued bonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DueBillReversal = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillReversal";
			definition = "Due bill fail tracking reversal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode DueBillFailTracking = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillFailTracking";
			definition = "Due bill fail tracking.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode SpinOffAllocation = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOffAllocation";
			definition = "Allocation of spinoff security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode AgentPaidBasedOnCombinedFractions = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentPaidBasedOnCombinedFractions";
			definition = "Agent paid DTC based on combined fractions for all public service–new hamp.(new) spinoffs distributed on july 25, 1991.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode PaynInKindDistribution = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaynInKindDistribution";
			definition = "Allocation of a Pay in Kind distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
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
	public static final DTCAdjustmentPaymentSubReasonCode Other = new DTCAdjustmentPaymentSubReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentSubReasonCode> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentSubReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentSubReasonCode";
				definition = "Specifies the subtype of the payment adjustment.";
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentSubReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReorganizationRelatedAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestDueWasErroneouslyPaidToYouByTheIssuer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AllocationOfBabyBondsAmountToBeExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestorDividendDueOnConversion,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AccruedInterestWrongRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestAdjustedDueToEarlyWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AccruedInterestNotPaid, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CompanyInDefault,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.IssueInDefault, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestAllocatedInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.TenderFeeDeduction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.SupplementaryInterimOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.GracePeriod, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PaymentOfFullAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentToAvoidFiscalPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RevisionOfChargeForWithholdingTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnMerger, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestPaysAtMaturity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CompanyDidNotDeclareDividend, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnRepaymentOption,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PaymentOfPartialAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CalledCertificatesAccruedErroneousInterestChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnRedemption, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AssumedByYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ScriptSharesExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnTender,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.UninsuredInterestWithheld, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DWACBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CODBuyBackWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.WithdrawalTransferBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReversalOfACODWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CustodyPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CalledCertificatesCheckInParticipantsNameChargeBack, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PacificDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MidwestDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PhiladelphiaDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PartClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReversalOfAnAccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PartClaimReversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CouponCollectionService, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReversalOfADeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DeliverOrderActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReverseOfTheSharesEscheatedToNYStateInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ChargeForFrenchAvoidFiscalTaxCredit, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReverseOfEscheatedAmountOfClaim,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendsOrBondInterestAllocationAtExemptRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax15Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax25Percent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.LostCertificateRegisteredInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DepositTransferredIntoTheNameOfTheCEDEAndCo,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.LostCertificateWasRegisteredInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PreviouslyCalledCertificatesFundsDelivery,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax10Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ChargeAtWithholdingRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RefundedTaxRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RateUnknown,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.Delete, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.Reinstate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PostDateChangeForFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AnnouncementDeletedOrFailTracking,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DueBill, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.LateAnnouncement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DateRevision, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RateRevision,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.NonAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RefundOfFrenchTaxJune,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RefundOfFrenchTaxJuly,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RedemptionCash,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AllocationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBond,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RedemptionPaymentDueToPledgeRelease,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InSettlementOfATradeDTCCReorgAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InterimPositionAdjustedForDeliverOrderActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.LateAnnouncementActivityDueBillActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CODWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DepositAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RedemptionAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PledgeReleaseAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.WriteOffReorganization,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InvestmentIdAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PledgeAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DeliverOrder, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReorganizationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.WithdrawalTransferAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCoupon,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponPositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentForCashOnIncreasedShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.OptionalDividendAllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ProceedsFromSaleOf,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.WrongRatePrincipal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentForWrittenInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ChangeInTheRecordDate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentIsInResponseToYourInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RepPaymentCharge, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.InLieuOfReorgDepositActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PriceCorrectionDividendReinvestment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CashDueOnAnAccruedStockPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CashDueOnStockDividend,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentToYourDividendReinvestmentPosition, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.CashDueOnDRPShareAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocationOfCashInLieuOfFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentForCashInLieuOfFractionalShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.StockLoanAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivityFromMidwest,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivityFromPhiladelphia, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.StockLoanOrRepoPaymentOrder,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ChargeInLieuOfReceiptOfDividendReinvestment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AllocationAdjustmentDueToFractionsRoundedUpByTheAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AllocationOfDRPTEDSInstruction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.TaxExemptInstructions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.LostCertificateWasRegisteredInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.RecordDatePositionAdjustedForaWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ReversalOfaWithdrawalByTransfer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.WithholdingTaxAdjustmentInUserDefinedCountry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.UnfavorableRateMerger, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.FractionalRights,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DWACAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendUnfavorableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.FrozenLetterMovement, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.VodaphoneADR,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AdditionalRightsForBeneficialOwner, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.BabyBondPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DueBillReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.DueBillFailTracking,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.SpinOffAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.AgentPaidBasedOnCombinedFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.PaynInKindDistribution, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReorganizationRelatedAdjustment.getCodeName().get(), ReorganizationRelatedAdjustment);
		codesByName.put(InterestDueWasErroneouslyPaidToYouByTheIssuer.getCodeName().get(), InterestDueWasErroneouslyPaidToYouByTheIssuer);
		codesByName.put(AllocationOfBabyBondsAmountToBeExited.getCodeName().get(), AllocationOfBabyBondsAmountToBeExited);
		codesByName.put(InterestorDividendDueOnConversion.getCodeName().get(), InterestorDividendDueOnConversion);
		codesByName.put(AccruedInterestWrongRate.getCodeName().get(), AccruedInterestWrongRate);
		codesByName.put(InterestAdjustedDueToEarlyWithdrawal.getCodeName().get(), InterestAdjustedDueToEarlyWithdrawal);
		codesByName.put(AccruedInterestNotPaid.getCodeName().get(), AccruedInterestNotPaid);
		codesByName.put(CompanyInDefault.getCodeName().get(), CompanyInDefault);
		codesByName.put(IssueInDefault.getCodeName().get(), IssueInDefault);
		codesByName.put(InterestAllocatedInError.getCodeName().get(), InterestAllocatedInError);
		codesByName.put(TenderFeeDeduction.getCodeName().get(), TenderFeeDeduction);
		codesByName.put(SupplementaryInterimOn.getCodeName().get(), SupplementaryInterimOn);
		codesByName.put(GracePeriod.getCodeName().get(), GracePeriod);
		codesByName.put(PaymentOfFullAvoidFiscalTaxRefund.getCodeName().get(), PaymentOfFullAvoidFiscalTaxRefund);
		codesByName.put(AdjustmentToAvoidFiscalPayment.getCodeName().get(), AdjustmentToAvoidFiscalPayment);
		codesByName.put(RevisionOfChargeForWithholdingTax.getCodeName().get(), RevisionOfChargeForWithholdingTax);
		codesByName.put(InterestOrDividendDueOnMerger.getCodeName().get(), InterestOrDividendDueOnMerger);
		codesByName.put(InterestPaysAtMaturity.getCodeName().get(), InterestPaysAtMaturity);
		codesByName.put(CompanyDidNotDeclareDividend.getCodeName().get(), CompanyDidNotDeclareDividend);
		codesByName.put(InterestOrDividendDueOnRepaymentOption.getCodeName().get(), InterestOrDividendDueOnRepaymentOption);
		codesByName.put(PaymentOfPartialAvoidFiscalTaxRefund.getCodeName().get(), PaymentOfPartialAvoidFiscalTaxRefund);
		codesByName.put(CalledCertificatesAccruedErroneousInterestChargeBack.getCodeName().get(), CalledCertificatesAccruedErroneousInterestChargeBack);
		codesByName.put(InterestOrDividendDueOnRedemption.getCodeName().get(), InterestOrDividendDueOnRedemption);
		codesByName.put(AssumedByYourGoodselves.getCodeName().get(), AssumedByYourGoodselves);
		codesByName.put(ScriptSharesExited.getCodeName().get(), ScriptSharesExited);
		codesByName.put(InterestOrDividendDueOnTender.getCodeName().get(), InterestOrDividendDueOnTender);
		codesByName.put(UninsuredInterestWithheld.getCodeName().get(), UninsuredInterestWithheld);
		codesByName.put(DWACBuyBackWithdrawal.getCodeName().get(), DWACBuyBackWithdrawal);
		codesByName.put(CODBuyBackWithdrawal.getCodeName().get(), CODBuyBackWithdrawal);
		codesByName.put(WithdrawalTransferBuyBackWithdrawal.getCodeName().get(), WithdrawalTransferBuyBackWithdrawal);
		codesByName.put(CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves.getCodeName().get(), CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves);
		codesByName.put(CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee.getCodeName().get(), CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee);
		codesByName.put(ReversalOfACODWithdrawal.getCodeName().get(), ReversalOfACODWithdrawal);
		codesByName.put(CustodyPayment.getCodeName().get(), CustodyPayment);
		codesByName.put(CalledCertificatesCheckInParticipantsNameChargeBack.getCodeName().get(), CalledCertificatesCheckInParticipantsNameChargeBack);
		codesByName.put(PacificDepository.getCodeName().get(), PacificDepository);
		codesByName.put(MidwestDepository.getCodeName().get(), MidwestDepository);
		codesByName.put(PhiladelphiaDepository.getCodeName().get(), PhiladelphiaDepository);
		codesByName.put(AccrualClaimPayment.getCodeName().get(), AccrualClaimPayment);
		codesByName.put(PartClaimPayment.getCodeName().get(), PartClaimPayment);
		codesByName.put(ReversalOfAnAccrualClaimPayment.getCodeName().get(), ReversalOfAnAccrualClaimPayment);
		codesByName.put(PartClaimReversal.getCodeName().get(), PartClaimReversal);
		codesByName.put(CouponCollectionService.getCodeName().get(), CouponCollectionService);
		codesByName.put(ReversalOfADeposit.getCodeName().get(), ReversalOfADeposit);
		codesByName.put(DeliverOrderActivity.getCodeName().get(), DeliverOrderActivity);
		codesByName.put(ReverseOfTheSharesEscheatedToNYStateInError.getCodeName().get(), ReverseOfTheSharesEscheatedToNYStateInError);
		codesByName.put(ChargeForFrenchAvoidFiscalTaxCredit.getCodeName().get(), ChargeForFrenchAvoidFiscalTaxCredit);
		codesByName.put(ReverseOfEscheatedAmountOfClaim.getCodeName().get(), ReverseOfEscheatedAmountOfClaim);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtExemptRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtExemptRate);
		codesByName.put(ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate.getCodeName().get(), ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate);
		codesByName.put(FrenchWithholdingTax15Percent.getCodeName().get(), FrenchWithholdingTax15Percent);
		codesByName.put(FrenchWithholdingTax25Percent.getCodeName().get(), FrenchWithholdingTax25Percent);
		codesByName.put(DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour.getCodeName().get(), DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour);
		codesByName.put(LostCertificateRegisteredInTheNameOfYourGoodselves.getCodeName().get(), LostCertificateRegisteredInTheNameOfYourGoodselves);
		codesByName.put(DepositTransferredIntoTheNameOfTheCEDEAndCo.getCodeName().get(), DepositTransferredIntoTheNameOfTheCEDEAndCo);
		codesByName.put(PositionAdjustedForDepositActivity.getCodeName().get(), PositionAdjustedForDepositActivity);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourNominee.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourNominee);
		codesByName.put(PreviouslyCalledCertificatesFundsDelivery.getCodeName().get(), PreviouslyCalledCertificatesFundsDelivery);
		codesByName.put(CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless.getCodeName().get(), CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless);
		codesByName.put(FrenchWithholdingTax10Percent.getCodeName().get(), FrenchWithholdingTax10Percent);
		codesByName.put(ChargeAtWithholdingRate.getCodeName().get(), ChargeAtWithholdingRate);
		codesByName.put(RefundedTaxRate.getCodeName().get(), RefundedTaxRate);
		codesByName.put(RateUnknown.getCodeName().get(), RateUnknown);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(Reinstate.getCodeName().get(), Reinstate);
		codesByName.put(PostDateChangeForFailTracking.getCodeName().get(), PostDateChangeForFailTracking);
		codesByName.put(AnnouncementDeletedOrFailTracking.getCodeName().get(), AnnouncementDeletedOrFailTracking);
		codesByName.put(DueBill.getCodeName().get(), DueBill);
		codesByName.put(LateAnnouncement.getCodeName().get(), LateAnnouncement);
		codesByName.put(DateRevision.getCodeName().get(), DateRevision);
		codesByName.put(RateRevision.getCodeName().get(), RateRevision);
		codesByName.put(NonAllocation.getCodeName().get(), NonAllocation);
		codesByName.put(RefundOfFrenchTaxJune.getCodeName().get(), RefundOfFrenchTaxJune);
		codesByName.put(RefundOfFrenchTaxJuly.getCodeName().get(), RefundOfFrenchTaxJuly);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate);
		codesByName.put(RedemptionCash.getCodeName().get(), RedemptionCash);
		codesByName.put(AllocationAdjustment.getCodeName().get(), AllocationAdjustment);
		codesByName.put(MuniBearerBond.getCodeName().get(), MuniBearerBond);
		codesByName.put(RedemptionPaymentDueToPledgeRelease.getCodeName().get(), RedemptionPaymentDueToPledgeRelease);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves);
		codesByName.put(InSettlementOfATradeDTCCReorgAccount.getCodeName().get(), InSettlementOfATradeDTCCReorgAccount);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer);
		codesByName.put(InterimPositionAdjustedForDeliverOrderActivity.getCodeName().get(), InterimPositionAdjustedForDeliverOrderActivity);
		codesByName.put(LateAnnouncementActivityDueBillActivity.getCodeName().get(), LateAnnouncementActivityDueBillActivity);
		codesByName.put(CODWithdrawal.getCodeName().get(), CODWithdrawal);
		codesByName.put(DepositAdjustment.getCodeName().get(), DepositAdjustment);
		codesByName.put(RedemptionAdjustment.getCodeName().get(), RedemptionAdjustment);
		codesByName.put(PledgeReleaseAdjustment.getCodeName().get(), PledgeReleaseAdjustment);
		codesByName.put(WriteOffReorganization.getCodeName().get(), WriteOffReorganization);
		codesByName.put(InvestmentIdAdjustment.getCodeName().get(), InvestmentIdAdjustment);
		codesByName.put(PledgeAdjustment.getCodeName().get(), PledgeAdjustment);
		codesByName.put(DeliverOrder.getCodeName().get(), DeliverOrder);
		codesByName.put(ReorganizationAdjustment.getCodeName().get(), ReorganizationAdjustment);
		codesByName.put(WithdrawalTransferAdjustment.getCodeName().get(), WithdrawalTransferAdjustment);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee);
		codesByName.put(MuniBearerBondCoupon.getCodeName().get(), MuniBearerBondCoupon);
		codesByName.put(MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit.getCodeName().get(), MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit);
		codesByName.put(MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal.getCodeName().get(), MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn);
		codesByName.put(MuniBearerBondCouponPositionAdjustedForDepositActivity.getCodeName().get(), MuniBearerBondCouponPositionAdjustedForDepositActivity);
		codesByName.put(AdjustmentForCashOnIncreasedShares.getCodeName().get(), AdjustmentForCashOnIncreasedShares);
		codesByName.put(OptionalDividendAllocationAdjustment.getCodeName().get(), OptionalDividendAllocationAdjustment);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer);
		codesByName.put(ProceedsFromSaleOf.getCodeName().get(), ProceedsFromSaleOf);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer);
		codesByName.put(WrongRatePrincipal.getCodeName().get(), WrongRatePrincipal);
		codesByName.put(AdjustmentForWrittenInquiry.getCodeName().get(), AdjustmentForWrittenInquiry);
		codesByName.put(ChangeInTheRecordDate.getCodeName().get(), ChangeInTheRecordDate);
		codesByName.put(AdjustmentIsInResponseToYourInquiry.getCodeName().get(), AdjustmentIsInResponseToYourInquiry);
		codesByName.put(RepPaymentCharge.getCodeName().get(), RepPaymentCharge);
		codesByName.put(SupplementalInterimActivity.getCodeName().get(), SupplementalInterimActivity);
		codesByName.put(InLieuOfReorgDepositActivity.getCodeName().get(), InLieuOfReorgDepositActivity);
		codesByName.put(RateChange.getCodeName().get(), RateChange);
		codesByName.put(PriceCorrectionDividendReinvestment.getCodeName().get(), PriceCorrectionDividendReinvestment);
		codesByName.put(CashDueOnAnAccruedStockPayment.getCodeName().get(), CashDueOnAnAccruedStockPayment);
		codesByName.put(DividendReinvestmentAllocation.getCodeName().get(), DividendReinvestmentAllocation);
		codesByName.put(CashDueOnStockDividend.getCodeName().get(), CashDueOnStockDividend);
		codesByName.put(AdjustmentToYourDividendReinvestmentPosition.getCodeName().get(), AdjustmentToYourDividendReinvestmentPosition);
		codesByName.put(CashDueOnDRPShareAllocation.getCodeName().get(), CashDueOnDRPShareAllocation);
		codesByName.put(DividendReinvestmentAllocationOfCashInLieuOfFractions.getCodeName().get(), DividendReinvestmentAllocationOfCashInLieuOfFractions);
		codesByName.put(AdjustmentForCashInLieuOfFractionalShares.getCodeName().get(), AdjustmentForCashInLieuOfFractionalShares);
		codesByName.put(StockLoanAdjustment.getCodeName().get(), StockLoanAdjustment);
		codesByName.put(SupplementalInterimActivityFromMidwest.getCodeName().get(), SupplementalInterimActivityFromMidwest);
		codesByName.put(ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount.getCodeName().get(), ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount);
		codesByName.put(SupplementalInterimActivityFromPhiladelphia.getCodeName().get(), SupplementalInterimActivityFromPhiladelphia);
		codesByName.put(StockLoanOrRepoPaymentOrder.getCodeName().get(), StockLoanOrRepoPaymentOrder);
		codesByName.put(ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount.getCodeName().get(), ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount);
		codesByName.put(ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount.getCodeName().get(), ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount);
		codesByName.put(ChargeInLieuOfReceiptOfDividendReinvestment.getCodeName().get(), ChargeInLieuOfReceiptOfDividendReinvestment);
		codesByName.put(AllocationAdjustmentDueToFractionsRoundedUpByTheAgent.getCodeName().get(), AllocationAdjustmentDueToFractionsRoundedUpByTheAgent);
		codesByName.put(ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount.getCodeName().get(), ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount);
		codesByName.put(DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent.getCodeName().get(), DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent);
		codesByName.put(AllocationOfDRPTEDSInstruction.getCodeName().get(), AllocationOfDRPTEDSInstruction);
		codesByName.put(TaxExemptInstructions.getCodeName().get(), TaxExemptInstructions);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourCustomer.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourCustomer);
		codesByName.put(RecordDatePositionAdjustedForaWithdrawalByTransfer.getCodeName().get(), RecordDatePositionAdjustedForaWithdrawalByTransfer);
		codesByName.put(AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName.getCodeName().get(), AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName);
		codesByName.put(AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName.getCodeName().get(), AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName);
		codesByName.put(PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers.getCodeName().get(), PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers);
		codesByName.put(ReversalOfaWithdrawalByTransfer.getCodeName().get(), ReversalOfaWithdrawalByTransfer);
		codesByName.put(WithholdingTaxAdjustmentInUserDefinedCountry.getCodeName().get(), WithholdingTaxAdjustmentInUserDefinedCountry);
		codesByName.put(UnfavorableRateMerger.getCodeName().get(), UnfavorableRateMerger);
		codesByName.put(FractionalRights.getCodeName().get(), FractionalRights);
		codesByName.put(DWACAdjustment.getCodeName().get(), DWACAdjustment);
		codesByName.put(ForeignCashDividendUnfavorableRate.getCodeName().get(), ForeignCashDividendUnfavorableRate);
		codesByName.put(FrozenLetterMovement.getCodeName().get(), FrozenLetterMovement);
		codesByName.put(VodaphoneADR.getCodeName().get(), VodaphoneADR);
		codesByName.put(AdditionalRightsForBeneficialOwner.getCodeName().get(), AdditionalRightsForBeneficialOwner);
		codesByName.put(BabyBondPayment.getCodeName().get(), BabyBondPayment);
		codesByName.put(DueBillReversal.getCodeName().get(), DueBillReversal);
		codesByName.put(DueBillFailTracking.getCodeName().get(), DueBillFailTracking);
		codesByName.put(SpinOffAllocation.getCodeName().get(), SpinOffAllocation);
		codesByName.put(AgentPaidBasedOnCombinedFractions.getCodeName().get(), AgentPaidBasedOnCombinedFractions);
		codesByName.put(PaynInKindDistribution.getCodeName().get(), PaynInKindDistribution);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static DTCAdjustmentPaymentSubReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentSubReasonCode[] values() {
		DTCAdjustmentPaymentSubReasonCode[] values = new DTCAdjustmentPaymentSubReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentSubReasonCode> {
		@Override
		public DTCAdjustmentPaymentSubReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentSubReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}