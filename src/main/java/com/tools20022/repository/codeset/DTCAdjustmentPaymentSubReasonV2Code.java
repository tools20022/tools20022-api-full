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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReorganisationRelatedAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.ReorganisationRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestDueWasErroneouslyPaidToYouByIssuer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * InterestDueWasErroneouslyPaidToYouByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AllocationOfBabyBondsAmountToBeExited
 * DTCAdjustmentPaymentSubReasonV2Code.AllocationOfBabyBondsAmountToBeExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestorDividendDueOnConversion
 * DTCAdjustmentPaymentSubReasonV2Code.InterestorDividendDueOnConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AccruedInterestWrongRate
 * DTCAdjustmentPaymentSubReasonV2Code.AccruedInterestWrongRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestAdjustedDueToEarlyWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.InterestAdjustedDueToEarlyWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AccruedInterestNotPaid
 * DTCAdjustmentPaymentSubReasonV2Code.AccruedInterestNotPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CompanyInDefault
 * DTCAdjustmentPaymentSubReasonV2Code.CompanyInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#IssueInDefault
 * DTCAdjustmentPaymentSubReasonV2Code.IssueInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestAllocatedInError
 * DTCAdjustmentPaymentSubReasonV2Code.InterestAllocatedInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#TenderFeeDeduction
 * DTCAdjustmentPaymentSubReasonV2Code.TenderFeeDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#SupplementaryInterimOn
 * DTCAdjustmentPaymentSubReasonV2Code.SupplementaryInterimOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#GracePeriod
 * DTCAdjustmentPaymentSubReasonV2Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PaymentOfFullAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReasonV2Code.PaymentOfFullAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AvoidFiscalPayment
 * DTCAdjustmentPaymentSubReasonV2Code.AvoidFiscalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RevisionOfChargeForWithholdingTax
 * DTCAdjustmentPaymentSubReasonV2Code.RevisionOfChargeForWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestOrDividendDueOnMerger
 * DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestPaysAtMaturity
 * DTCAdjustmentPaymentSubReasonV2Code.InterestPaysAtMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CompanyDidNotDeclareDividend
 * DTCAdjustmentPaymentSubReasonV2Code.CompanyDidNotDeclareDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestOrDividendDueOnRepaymentOption
 * DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnRepaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PaymentOfPartialAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReasonV2Code.PaymentOfPartialAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CalledCertificatesAccruedErroneousInterestChargeBack
 * DTCAdjustmentPaymentSubReasonV2Code.
 * CalledCertificatesAccruedErroneousInterestChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestOrDividendDueOnRedemption
 * DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AssumedByYourGoodselves
 * DTCAdjustmentPaymentSubReasonV2Code.AssumedByYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ScriptSharesExited
 * DTCAdjustmentPaymentSubReasonV2Code.ScriptSharesExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterestOrDividendDueOnTender
 * DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#UninsuredInterestWithheld
 * DTCAdjustmentPaymentSubReasonV2Code.UninsuredInterestWithheld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DWACBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.DWACBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CODBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.CODBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WithdrawalTransferBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.WithdrawalTransferBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CODWithdrawalNotDeliveredInNameOfGoodselves
 * DTCAdjustmentPaymentSubReasonV2Code.
 * CODWithdrawalNotDeliveredInNameOfGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CODWithdrawalNotDeliveredInNameOfNominee
 * DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawalNotDeliveredInNameOfNominee}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReversalOfCODWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.ReversalOfCODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CustodyPayment
 * DTCAdjustmentPaymentSubReasonV2Code.CustodyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CalledCertificatesCheckInParticipantsNameChargeBack
 * DTCAdjustmentPaymentSubReasonV2Code.
 * CalledCertificatesCheckInParticipantsNameChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PacificDepository
 * DTCAdjustmentPaymentSubReasonV2Code.PacificDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MidwestDepository
 * DTCAdjustmentPaymentSubReasonV2Code.MidwestDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PhiladelphiaDepository
 * DTCAdjustmentPaymentSubReasonV2Code.PhiladelphiaDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AccrualClaimPayment
 * DTCAdjustmentPaymentSubReasonV2Code.AccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PartClaimPayment
 * DTCAdjustmentPaymentSubReasonV2Code.PartClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReversalOfAccrualClaimPayment
 * DTCAdjustmentPaymentSubReasonV2Code.ReversalOfAccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PartClaimReversal
 * DTCAdjustmentPaymentSubReasonV2Code.PartClaimReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CouponCollectionService
 * DTCAdjustmentPaymentSubReasonV2Code.CouponCollectionService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReversalOfDeposit
 * DTCAdjustmentPaymentSubReasonV2Code.ReversalOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DeliverOrderActivity
 * DTCAdjustmentPaymentSubReasonV2Code.DeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReverseOfSharesEscheatedToNYStateInError
 * DTCAdjustmentPaymentSubReasonV2Code.ReverseOfSharesEscheatedToNYStateInError}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ChargeForFrenchAvoidFiscalTaxCredit
 * DTCAdjustmentPaymentSubReasonV2Code.ChargeForFrenchAvoidFiscalTaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReverseOfEscheatedAmountOfClaim
 * DTCAdjustmentPaymentSubReasonV2Code.ReverseOfEscheatedAmountOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ForeignCashDividendsOrBondInterestAllocationAtExemptRate
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ForeignCashDividendsOrBondInterestAllocationAtExemptRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#FrenchWithholdingTax15Percent
 * DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax15Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#FrenchWithholdingTax25Percent
 * DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax25Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DepositLostCertificateRegisteredInNameOfYour
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DepositLostCertificateRegisteredInNameOfYour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#LostCertificateRegisteredInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonV2Code.
 * LostCertificateRegisteredInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DepositTransferredIntoNameOfCEDEAndCo
 * DTCAdjustmentPaymentSubReasonV2Code.DepositTransferredIntoNameOfCEDEAndCo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReasonV2Code.PositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#LostCertificateWasRegisteredInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonV2Code.
 * LostCertificateWasRegisteredInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PreviouslyCalledCertificatesFundsDelivery
 * DTCAdjustmentPaymentSubReasonV2Code.PreviouslyCalledCertificatesFundsDelivery
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CTFSHeldOverRecordDate
 * DTCAdjustmentPaymentSubReasonV2Code.CTFSHeldOverRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#FrenchWithholdingTax10Percent
 * DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax10Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ChargeAtWithholdingRate
 * DTCAdjustmentPaymentSubReasonV2Code.ChargeAtWithholdingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RefundedTaxRate
 * DTCAdjustmentPaymentSubReasonV2Code.RefundedTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RateUnknown
 * DTCAdjustmentPaymentSubReasonV2Code.RateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#Delete
 * DTCAdjustmentPaymentSubReasonV2Code.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#Reinstate
 * DTCAdjustmentPaymentSubReasonV2Code.Reinstate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PostDateChangeForFailTracking
 * DTCAdjustmentPaymentSubReasonV2Code.PostDateChangeForFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AnnouncementDeletedOrFailTracking
 * DTCAdjustmentPaymentSubReasonV2Code.AnnouncementDeletedOrFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DueBill
 * DTCAdjustmentPaymentSubReasonV2Code.DueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#LateAnnouncement
 * DTCAdjustmentPaymentSubReasonV2Code.LateAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DateRevision
 * DTCAdjustmentPaymentSubReasonV2Code.DateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RateRevision
 * DTCAdjustmentPaymentSubReasonV2Code.RateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#NonAllocation
 * DTCAdjustmentPaymentSubReasonV2Code.NonAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RefundOfFrenchTaxJune
 * DTCAdjustmentPaymentSubReasonV2Code.RefundOfFrenchTaxJune}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RefundOfFrenchTaxJuly
 * DTCAdjustmentPaymentSubReasonV2Code.RefundOfFrenchTaxJuly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RedemptionCash
 * DTCAdjustmentPaymentSubReasonV2Code.RedemptionCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AllocationAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.AllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBond
 * DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RedemptionPaymentDueToPledgeRelease
 * DTCAdjustmentPaymentSubReasonV2Code.RedemptionPaymentDueToPledgeRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InSettlementOfTradeDTCCReorganisationAccount
 * DTCAdjustmentPaymentSubReasonV2Code.
 * InSettlementOfTradeDTCCReorganisationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InterimPositionAdjustedForDeliverOrderActivity
 * DTCAdjustmentPaymentSubReasonV2Code.
 * InterimPositionAdjustedForDeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#LateAnnouncementActivityDueBillActivity
 * DTCAdjustmentPaymentSubReasonV2Code.LateAnnouncementActivityDueBillActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CODWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DepositAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.DepositAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RedemptionAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.RedemptionAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PledgeReleaseAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.PledgeReleaseAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WriteOffReorganisation
 * DTCAdjustmentPaymentSubReasonV2Code.WriteOffReorganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InvestmentIdentificationAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.InvestmentIdentificationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PledgeAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.PledgeAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DeliverOrder
 * DTCAdjustmentPaymentSubReasonV2Code.DeliverOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReorganisationAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.ReorganisationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WithdrawalTransferAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.WithdrawalTransferAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimInTheNameOfYourCustomerLateTransfer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DTCCClaimInTheNameOfYourCustomerLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimInTheNameOfYourGoodselvesLateTransfer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DTCCClaimInTheNameOfYourGoodselvesLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBondCoupon
 * DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit
 * DTCAdjustmentPaymentSubReasonV2Code.
 * MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal
 * DTCAdjustmentPaymentSubReasonV2Code.
 * MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn
 * DTCAdjustmentPaymentSubReasonV2Code.
 * MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBondCouponAdjustmentExcessCouponsDeposited
 * DTCAdjustmentPaymentSubReasonV2Code.
 * MuniBearerBondCouponAdjustmentExcessCouponsDeposited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#MuniBearerBondCouponPositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReasonV2Code.
 * MuniBearerBondCouponPositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CashOnIncreasedShares
 * DTCAdjustmentPaymentSubReasonV2Code.CashOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#OptionalDividendAllocationAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.OptionalDividendAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ProceedsFromSaleOf
 * DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromSaleOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DTCCClaimInTheNameOfYourNomineeLateTransfer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DTCCClaimInTheNameOfYourNomineeLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WrongRatePrincipal
 * DTCAdjustmentPaymentSubReasonV2Code.WrongRatePrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WrittenInquiry
 * DTCAdjustmentPaymentSubReasonV2Code.WrittenInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ChangeInRecordDate
 * DTCAdjustmentPaymentSubReasonV2Code.ChangeInRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InResponseToYourInquiry
 * DTCAdjustmentPaymentSubReasonV2Code.InResponseToYourInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RepPaymentCharge
 * DTCAdjustmentPaymentSubReasonV2Code.RepPaymentCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#SupplementalInterimActivity
 * DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#InLieuOfReorganisationDepositActivity
 * DTCAdjustmentPaymentSubReasonV2Code.InLieuOfReorganisationDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RateChange
 * DTCAdjustmentPaymentSubReasonV2Code.RateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PriceCorrectionDividendReinvestment
 * DTCAdjustmentPaymentSubReasonV2Code.PriceCorrectionDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CashDueOnAccruedStockPayment
 * DTCAdjustmentPaymentSubReasonV2Code.CashDueOnAccruedStockPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DividendReinvestmentAllocation
 * DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CashDueOnStockDividend
 * DTCAdjustmentPaymentSubReasonV2Code.CashDueOnStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AdjustmentToYourDividendReinvestmentPosition
 * DTCAdjustmentPaymentSubReasonV2Code.
 * AdjustmentToYourDividendReinvestmentPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CashDueOnDRPShareAllocation
 * DTCAdjustmentPaymentSubReasonV2Code.CashDueOnDRPShareAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DividendReinvestmentAllocationOfCashInLieuOfFractions
 * DTCAdjustmentPaymentSubReasonV2Code.
 * DividendReinvestmentAllocationOfCashInLieuOfFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#CashInLieuOfFractionalShares
 * DTCAdjustmentPaymentSubReasonV2Code.CashInLieuOfFractionalShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#StockLoanAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.StockLoanAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#SupplementalInterimActivityFromMidwest
 * DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivityFromMidwest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ProceedsFromBuyTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ProceedsFromBuyTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#SupplementalInterimActivityFromPhiladelphia
 * DTCAdjustmentPaymentSubReasonV2Code.
 * SupplementalInterimActivityFromPhiladelphia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#StockLoanOrRepoPaymentOrder
 * DTCAdjustmentPaymentSubReasonV2Code.StockLoanOrRepoPaymentOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ShareAdjustmentFromBuyTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ShareAdjustmentFromBuyTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ShareAdjustmentFromSellTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ShareAdjustmentFromSellTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ChargeInLieuOfReceiptOfDividendReinvestment
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ChargeInLieuOfReceiptOfDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AllocationAdjustmentDueToFractionsRoundedUpByAgent
 * DTCAdjustmentPaymentSubReasonV2Code.
 * AllocationAdjustmentDueToFractionsRoundedUpByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ProceedsFromSellTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReasonV2Code.
 * ProceedsFromSellTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DividendReinvestmentAllocationAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocationAdjustment}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AllocationOfDRPTEDSInstruction
 * DTCAdjustmentPaymentSubReasonV2Code.AllocationOfDRPTEDSInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#TaxExemptInstructions
 * DTCAdjustmentPaymentSubReasonV2Code.TaxExemptInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#LostCertificateWasRegisteredInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * LostCertificateWasRegisteredInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#RecordDatePositionAdjustedForWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReasonV2Code.
 * RecordDatePositionAdjustedForWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WithdrawalByTransferNotTransferredIntoClientsName
 * DTCAdjustmentPaymentSubReasonV2Code.
 * WithdrawalByTransferNotTransferredIntoClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName
 * DTCAdjustmentPaymentSubReasonV2Code.
 * WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PositionReinstatedCertificatesIssuedAndOutstanding
 * DTCAdjustmentPaymentSubReasonV2Code.
 * PositionReinstatedCertificatesIssuedAndOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ReversalOfWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReasonV2Code.ReversalOfWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#WithholdingTaxAdjustmentInUserDefinedCountry
 * DTCAdjustmentPaymentSubReasonV2Code.
 * WithholdingTaxAdjustmentInUserDefinedCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#UnfavourableRateMerger
 * DTCAdjustmentPaymentSubReasonV2Code.UnfavourableRateMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#FractionalRights
 * DTCAdjustmentPaymentSubReasonV2Code.FractionalRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DWACAdjustment
 * DTCAdjustmentPaymentSubReasonV2Code.DWACAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#ForeignCashDividendUnfavourableRate
 * DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendUnfavourableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#FrozenLetterMovement
 * DTCAdjustmentPaymentSubReasonV2Code.FrozenLetterMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#VodaphoneADR
 * DTCAdjustmentPaymentSubReasonV2Code.VodaphoneADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AdditionalRightsForBeneficialOwner
 * DTCAdjustmentPaymentSubReasonV2Code.AdditionalRightsForBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#BabyBondPayment
 * DTCAdjustmentPaymentSubReasonV2Code.BabyBondPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DueBillReversal
 * DTCAdjustmentPaymentSubReasonV2Code.DueBillReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#DueBillFailTracking
 * DTCAdjustmentPaymentSubReasonV2Code.DueBillFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#SpinOffAllocation
 * DTCAdjustmentPaymentSubReasonV2Code.SpinOffAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#AgentPaidBasedOnCombinedFractions
 * DTCAdjustmentPaymentSubReasonV2Code.AgentPaidBasedOnCombinedFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#PaynInKindDistribution
 * DTCAdjustmentPaymentSubReasonV2Code.PaynInKindDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code#Other
 * DTCAdjustmentPaymentSubReasonV2Code.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
 * DTCAdjustmentPaymentSubReason2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentSubReasonV2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the subtype of the payment adjustment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentSubReasonV2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Adjustment sub-reason is for reorganisation related adjustment on user
	 * defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S777"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationRelatedAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for reorganisation related adjustment on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReorganisationRelatedAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationRelatedAdjustment";
			definition = "Adjustment sub-reason is for reorganisation related adjustment on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "S777";
		}
	};
	/**
	 * Adjustment sub-reason is that the interest due on the above CUSIP was
	 * erroneously paid to you by the issuer although the certificate of deposit
	 * was transferred to CEDE (DTCC) prior to the interest payment date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "S66P"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueWasErroneouslyPaidToYouByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that the interest due on the above CUSIP was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestDueWasErroneouslyPaidToYouByIssuer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueWasErroneouslyPaidToYouByIssuer";
			definition = "Adjustment sub-reason is that the interest due on the above CUSIP was erroneously paid to you by the issuer although the certificate of deposit was transferred to CEDE (DTCC) prior to the interest payment date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "S66P";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation of baby bonds amount to be
	 * exited in USD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SABA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfBabyBondsAmountToBeExited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation of baby bonds amount to be exited in USD."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AllocationOfBabyBondsAmountToBeExited = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfBabyBondsAmountToBeExited";
			definition = "Adjustment sub-reason is for an allocation of baby bonds amount to be exited in USD.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SABA";
		}
	};
	/**
	 * Adjustment sub-reason is for interest or dividend due on conversion
	 * related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAC7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestorDividendDueOnConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest or dividend due on conversion related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestorDividendDueOnConversion = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestorDividendDueOnConversion";
			definition = "Adjustment sub-reason is for interest or dividend due on conversion related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAC7";
		}
	};
	/**
	 * Adjustment sub-reason is for the accrued interest previously paid to you
	 * was at the wrong rate. This adjustment is to correct that erroneous
	 * payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestWrongRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for the accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AccruedInterestWrongRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestWrongRate";
			definition = "Adjustment sub-reason is for the accrued interest previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SACA";
		}
	};
	/**
	 * Adjustment sub-reason is for Interest adjusted due to early withdrawal
	 * (certificate of deposit).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAdjustedDueToEarlyWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for Interest adjusted due to early withdrawal (certificate of deposit)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestAdjustedDueToEarlyWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAdjustedDueToEarlyWithdrawal";
			definition = "Adjustment sub-reason is for Interest adjusted due to early withdrawal (certificate of deposit).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SACB";
		}
	};
	/**
	 * Adjustment sub-reason is that accrued interest was not previously paid to
	 * you for the redemption in this issue. This adjustment is to pay you for
	 * this accrued interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SACP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestNotPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AccruedInterestNotPaid = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestNotPaid";
			definition = "Adjustment sub-reason is that accrued interest was not previously paid to you for the redemption in this issue. This adjustment is to pay you for this accrued interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SACP";
		}
	};
	/**
	 * Adjustment sub-reason is that the Company in default related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SADA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyInDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that the Company in default related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CompanyInDefault = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyInDefault";
			definition = "Adjustment sub-reason is that the Company in default related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SADA";
		}
	};
	/**
	 * Adjustment sub-reason is for issue in default related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SADM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueInDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for issue in default related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code IssueInDefault = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueInDefault";
			definition = "Adjustment sub-reason is for issue in default related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SADM";
		}
	};
	/**
	 * Adjustment sub-reason is for interest allocated in error first payment on
	 * "date user defined".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAEA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAllocatedInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest allocated in error first payment on \"date user defined\"."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestAllocatedInError = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAllocatedInError";
			definition = "Adjustment sub-reason is for interest allocated in error first payment on \"date user defined\".";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAEA";
		}
	};
	/**
	 * Adjustment sub-reason is for interest adjusted due to tender fee
	 * deduction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAF7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderFeeDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest adjusted due to tender fee deduction."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code TenderFeeDeduction = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderFeeDeduction";
			definition = "Adjustment sub-reason is for interest adjusted due to tender fee deduction.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAF7";
		}
	};
	/**
	 * Adjustment sub-reason is for supplementary interim on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryInterimOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for supplementary interim on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code SupplementaryInterimOn = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryInterimOn";
			definition = "Adjustment sub-reason is for supplementary interim on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAFA";
		}
	};
	/**
	 * Adjustment sub-reason is that company is taking 30 day grace period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAGA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that company is taking 30 day grace period."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code GracePeriod = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			definition = "Adjustment sub-reason is that company is taking 30 day grace period.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAGA";
		}
	};
	/**
	 * Adjustment sub-reason is that payment of full avoid fiscal tax refund
	 * (equal to 42.5% of the dividend).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAHA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfFullAvoidFiscalTaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that payment of full avoid fiscal tax refund (equal to 42.5% of the dividend)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PaymentOfFullAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfFullAvoidFiscalTaxRefund";
			definition = "Adjustment sub-reason is that payment of full avoid fiscal tax refund (equal to 42.5% of the dividend).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAHA";
		}
	};
	/**
	 * Adjustment sub-reason is for an adjustment to avoid fiscal payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAIA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvoidFiscalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an adjustment to avoid fiscal payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AvoidFiscalPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvoidFiscalPayment";
			definition = "Adjustment sub-reason is for an adjustment to avoid fiscal payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAIA";
		}
	};
	/**
	 * Adjustment sub-reason is for revision of charge for withholding tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAJA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevisionOfChargeForWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for revision of charge for withholding tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RevisionOfChargeForWithholdingTax = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevisionOfChargeForWithholdingTax";
			definition = "Adjustment sub-reason is for revision of charge for withholding tax.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAJA";
		}
	};
	/**
	 * Adjustment sub-reason is for interest or dividend due on merger related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAM7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest or dividend due on merger related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestOrDividendDueOnMerger = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnMerger";
			definition = "Adjustment sub-reason is for interest or dividend due on merger related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAM7";
		}
	};
	/**
	 * Adjustment sub-reason is that interest pays at maturity. Allocated in
	 * error on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAMA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaysAtMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that interest pays at maturity. Allocated in error on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestPaysAtMaturity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaysAtMaturity";
			definition = "Adjustment sub-reason is that interest pays at maturity. Allocated in error on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAMA";
		}
	};
	/**
	 * Adjustment sub-reason is that the company never declared dividend adjust
	 * allocation on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SANA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyDidNotDeclareDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that the company never declared dividend adjust allocation on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CompanyDidNotDeclareDividend = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyDidNotDeclareDividend";
			definition = "Adjustment sub-reason is that the company never declared dividend adjust allocation on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SANA";
		}
	};
	/**
	 * Adjustment sub-reason is for interest or dividend due on repayment
	 * option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAP7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRepaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest or dividend due on repayment option."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestOrDividendDueOnRepaymentOption = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRepaymentOption";
			definition = "Adjustment sub-reason is for interest or dividend due on repayment option.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAP7";
		}
	};
	/**
	 * Adjustment sub-reason is that payment of partial avoid fiscal tax refund
	 * (equal to 15% of the dividend).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfPartialAvoidFiscalTaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that payment of partial avoid fiscal tax refund (equal to 15% of the dividend)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PaymentOfPartialAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfPartialAvoidFiscalTaxRefund";
			definition = "Adjustment sub-reason is that payment of partial avoid fiscal tax refund (equal to 15% of the dividend).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAPA";
		}
	};
	/**
	 * Adjustment sub-reason is for certificates you deposited prior to
	 * publication date were subsequently called. The agent paid DTCC the
	 * principal redemption proceeds but erroneously paid you the accrued
	 * interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesAccruedErroneousInterestChargeBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for certificates you deposited prior to publication date were subsequently called. The agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CalledCertificatesAccruedErroneousInterestChargeBack = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesAccruedErroneousInterestChargeBack";
			definition = "Adjustment sub-reason is for certificates you deposited prior to publication date were subsequently called. The agent paid DTCC the principal redemption proceeds but erroneously paid you the accrued interest.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAPP";
		}
	};
	/**
	 * Adjustment sub-reason is for interest or dividend due on redemption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAR7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest or dividend due on redemption."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestOrDividendDueOnRedemption = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRedemption";
			definition = "Adjustment sub-reason is for interest or dividend due on redemption.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAR7";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation for a participant position
	 * that was assumed by your good selves paid on retired Participant number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SARA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssumedByYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation for a participant position that was assumed by your good selves paid on retired Participant number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AssumedByYourGoodselves = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssumedByYourGoodselves";
			definition = "Adjustment sub-reason is for an allocation for a participant position that was assumed by your good selves paid on retired Participant number.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SARA";
		}
	};
	/**
	 * Adjustment sub-reason is for allocation of script shares amount to be
	 * exited in dollar value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SASA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScriptSharesExited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for allocation of script shares amount to be exited in dollar value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ScriptSharesExited = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScriptSharesExited";
			definition = "Adjustment sub-reason is for allocation of script shares amount to be exited in dollar value.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SASA";
		}
	};
	/**
	 * Adjustment sub-reason is for interest or dividend due on tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAT7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for interest or dividend due on tender."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterestOrDividendDueOnTender = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnTender";
			definition = "Adjustment sub-reason is for interest or dividend due on tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAT7";
		}
	};
	/**
	 * Adjustment sub-reason is for uninsured interest withheld as per FSLICN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAWA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninsuredInterestWithheld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for uninsured interest withheld as per FSLICN."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code UninsuredInterestWithheld = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninsuredInterestWithheld";
			definition = "Adjustment sub-reason is for uninsured interest withheld as per FSLICN.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAWA";
		}
	};
	/**
	 * Adjustment sub-reason is that your record date position was adjusted for
	 * a DWAC buy back withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your record date position was adjusted for a DWAC buy back withdrawal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DWACBuyBackWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACBuyBackWithdrawal";
			definition = "Adjustment sub-reason is that your record date position was adjusted for a DWAC buy back withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSBB";
		}
	};
	/**
	 * Adjustment sub-reason is that your record date position was adjusted for
	 * a COD buy back withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBB1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your record date position was adjusted for a COD buy back withdrawal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CODBuyBackWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODBuyBackWithdrawal";
			definition = "Adjustment sub-reason is that your record date position was adjusted for a COD buy back withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SBB1";
		}
	};
	/**
	 * Adjustment sub-reason is that your record date position was adjusted for
	 * a w/t buy back withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBB2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your record date position was adjusted for a w/t buy back withdrawal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WithdrawalTransferBuyBackWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferBuyBackWithdrawal";
			definition = "Adjustment sub-reason is that your record date position was adjusted for a w/t buy back withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SBB2";
		}
	};
	/**
	 * Adjustment sub-reason is that your COD withdrawal was not delivered,
	 * however the certificate(s) were issued and outstanding over the record
	 * date in the name of your good selves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBDB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawalNotDeliveredInNameOfGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your good selves."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CODWithdrawalNotDeliveredInNameOfGoodselves = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredInNameOfGoodselves";
			definition = "Adjustment sub-reason is that your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your good selves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SBDB";
		}
	};
	/**
	 * Adjustment sub-reason is that your COD withdrawal was not delivered,
	 * however the certificate(s) were issued and outstanding over the record
	 * date in the name of your nominee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBEB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawalNotDeliveredInNameOfNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CODWithdrawalNotDeliveredInNameOfNominee = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredInNameOfNominee";
			definition = "Adjustment sub-reason is that your COD withdrawal was not delivered, however the certificate(s) were issued and outstanding over the record date in the name of your nominee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SBEB";
		}
	};
	/**
	 * Adjustment sub-reason is for a reversal of a COD withdrawal related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBRH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfCODWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for a reversal of a COD withdrawal related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReversalOfCODWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfCODWithdrawal";
			definition = "Adjustment sub-reason is for a reversal of a COD withdrawal related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SBRH";
		}
	};
	/**
	 * Adjustment sub-reason is for Custody payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCDP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for Custody payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CustodyPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyPayment";
			definition = "Adjustment sub-reason is for Custody payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCDP";
		}
	};
	/**
	 * Adjustment sub-reason is for certificates you deposited prior to
	 * publication date were subsequently called. The agent paid DTCC the
	 * principal proceeds via check, but in your customer’s name. We are
	 * forwarding the check today. This adjustment is to charge you for the
	 * funds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCKS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesCheckInParticipantsNameChargeBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for certificates you deposited prior to publication date were subsequently called. The agent paid DTCC the principal proceeds via check, but in your customer’s name. We are forwarding the check today. This adjustment is to charge you for the funds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CalledCertificatesCheckInParticipantsNameChargeBack = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesCheckInParticipantsNameChargeBack";
			definition = "Adjustment sub-reason is for certificates you deposited prior to publication date were subsequently called. The agent paid DTCC the principal proceeds via check, but in your customer’s name. We are forwarding the check today. This adjustment is to charge you for the funds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCKS";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment made for the Pacific depository
	 * (3097).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCLU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PacificDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment made for the Pacific depository (3097)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PacificDepository = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PacificDepository";
			definition = "Adjustment sub-reason is for adjustment made for the Pacific depository (3097).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCLU";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment made for the Midwest depository
	 * (6942).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCMU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidwestDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment made for the Midwest depository (6942)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MidwestDepository = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidwestDepository";
			definition = "Adjustment sub-reason is for adjustment made for the Midwest depository (6942).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCMU";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment made for the Philadelphia
	 * depository (6070).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCNU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhiladelphiaDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment made for the Philadelphia depository (6070)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PhiladelphiaDepository = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhiladelphiaDepository";
			definition = "Adjustment sub-reason is for adjustment made for the Philadelphia depository (6070).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCNU";
		}
	};
	/**
	 * Adjustment sub-reason is for an accrual claim payment related to a stock
	 * distribution payable on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccrualClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an accrual claim payment related to a stock distribution payable on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AccrualClaimPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccrualClaimPayment";
			definition = "Adjustment sub-reason is for an accrual claim payment related to a stock distribution payable on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCPK";
		}
	};
	/**
	 * Adjustment sub-reason is for part claim payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for part claim payment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PartClaimPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimPayment";
			definition = "Adjustment sub-reason is for part claim payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCPP";
		}
	};
	/**
	 * Adjustment sub-reason is for a reversal of an accrual claim payment
	 * related to a stock distribution payable on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfAccrualClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for a reversal of an accrual claim payment related to a stock distribution payable on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReversalOfAccrualClaimPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfAccrualClaimPayment";
			definition = "Adjustment sub-reason is for a reversal of an accrual claim payment related to a stock distribution payable on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCRK";
		}
	};
	/**
	 * Adjustment sub-reason is for part-claim reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCRP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for part-claim reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PartClaimReversal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimReversal";
			definition = "Adjustment sub-reason is for part-claim reversal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCRP";
		}
	};
	/**
	 * Adjustment sub-reason code is for the coupon collection service
	 * adjustment for coupon deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCSM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponCollectionService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason code is for the coupon collection service adjustment for coupon deposit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CouponCollectionService = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponCollectionService";
			definition = "Adjustment sub-reason code is for the coupon collection service adjustment for coupon deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SCSM";
		}
	};
	/**
	 * Adjustment sub-reason is for a reversal of a deposit adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDRH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for a reversal of a deposit adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReversalOfDeposit = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfDeposit";
			definition = "Adjustment sub-reason is for a reversal of a deposit adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDRH";
		}
	};
	/**
	 * Adjustment sub-reason is that your record date position was adjusted for
	 * deliver order (DO) activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEEE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrderActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your record date position was adjusted for deliver order (DO) activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DeliverOrderActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrderActivity";
			definition = "Adjustment sub-reason is that your record date position was adjusted for deliver order (DO) activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SEEE";
		}
	};
	/**
	 * Adjustment sub-reason is due to shares escheated to New York state in
	 * error. This is to reverse.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SETO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfSharesEscheatedToNYStateInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is due to shares escheated to New York state in error. This is to reverse."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReverseOfSharesEscheatedToNYStateInError = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfSharesEscheatedToNYStateInError";
			definition = "Adjustment sub-reason is due to shares escheated to New York state in error. This is to reverse.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SETO";
		}
	};
	/**
	 * Adjustment sub-reason is that, as per agent, this charge is for French
	 * avoid fiscal tax credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFAF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeForFrenchAvoidFiscalTaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that, as per agent, this charge is for French avoid fiscal tax credit."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ChargeForFrenchAvoidFiscalTaxCredit = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeForFrenchAvoidFiscalTaxCredit";
			definition = "Adjustment sub-reason is that, as per agent, this charge is for French avoid fiscal tax credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFAF";
		}
	};
	/**
	 * Adjustment sub-reason is due to a reverse of escheated amount of claim.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFAP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfEscheatedAmountOfClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is due to a reverse of escheated amount of claim."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReverseOfEscheatedAmountOfClaim = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfEscheatedAmountOfClaim";
			definition = "Adjustment sub-reason is due to a reverse of escheated amount of claim.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFAP";
		}
	};
	/**
	 * Adjustment sub-reason is for foreign cash dividends/bond interest
	 * allocation at exempt rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFE8"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for foreign cash dividends/bond interest allocation at exempt rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ForeignCashDividendsOrBondInterestAllocationAtExemptRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate";
			definition = "Adjustment sub-reason is for foreign cash dividends/bond interest allocation at exempt rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFE8";
		}
	};
	/**
	 * Adjustment sub-reason is for foreign cash dividends/bonds interest
	 * allocation at favourable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFF8"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for foreign cash dividends/bonds interest allocation at favourable rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate";
			definition = "Adjustment sub-reason is for foreign cash dividends/bonds interest allocation at favourable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFF8";
		}
	};
	/**
	 * Adjustment sub-reason is for fifteen percent French withholding tax,
	 * based on your option election of 100% ADRs at the favourable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFG8"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax15Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for fifteen percent French withholding tax, based on your option election of 100% ADRs at the favourable rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code FrenchWithholdingTax15Percent = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax15Percent";
			definition = "Adjustment sub-reason is for fifteen percent French withholding tax, based on your option election of 100% ADRs at the favourable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFG8";
		}
	};
	/**
	 * Adjustment sub-reason is for twenty five percent French withholding tax,
	 * based on your option election of 100% ADRs at the unfavourable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFG9"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax25Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for twenty five percent French withholding tax, based on your option election of 100% ADRs at the unfavourable rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code FrenchWithholdingTax25Percent = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax25Percent";
			definition = "Adjustment sub-reason is for twenty five percent French withholding tax, based on your option election of 100% ADRs at the unfavourable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFG9";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment related to the deposit of lost
	 * certificate over the record date that was registered in the name of your
	 * [user defined].
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDAD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositLostCertificateRegisteredInNameOfYour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment related to the deposit of lost certificate over the record date that was registered in the name of your [user defined]."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DepositLostCertificateRegisteredInNameOfYour = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLostCertificateRegisteredInNameOfYour";
			definition = "Adjustment sub-reason is for adjustment related to the deposit of lost certificate over the record date that was registered in the name of your [user defined].";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDAD";
		}
	};
	/**
	 * Adjustment sub-reason is for that the adjustment related to the deposit
	 * of lost certificate over the record date was registered in the name of
	 * your good selves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDBD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateRegisteredInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for that the adjustment related to the deposit of lost certificate over the record date was registered in the name of your good selves."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code LostCertificateRegisteredInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateRegisteredInTheNameOfYourGoodselves";
			definition = "Adjustment sub-reason is for that the adjustment related to the deposit of lost certificate over the record date was registered in the name of your good selves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDBD";
		}
	};
	/**
	 * Adjustment sub-reason is for deposit after cut off date transferred into
	 * the name of the CEDE on record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDCD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositTransferredIntoNameOfCEDEAndCo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for deposit after cut off date transferred into the name of the CEDE on record date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DepositTransferredIntoNameOfCEDEAndCo = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositTransferredIntoNameOfCEDEAndCo";
			definition = "Adjustment sub-reason is for deposit after cut off date transferred into the name of the CEDE on record date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDCD";
		}
	};
	/**
	 * Adjustment sub-reason is that your record date position was adjusted for
	 * deposit activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDDD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAdjustedForDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your record date position was adjusted for deposit activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAdjustedForDepositActivity";
			definition = "Adjustment sub-reason is that your record date position was adjusted for deposit activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDDD";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment related to the deposit of lost
	 * certificate over the record date that was registered in the name of your
	 * nominee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDED"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment related to the deposit of lost certificate over the record date that was registered in the name of your nominee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code LostCertificateWasRegisteredInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourNominee";
			definition = "Adjustment sub-reason is for adjustment related to the deposit of lost certificate over the record date that was registered in the name of your nominee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDED";
		}
	};
	/**
	 * Adjustment sub-reason is for that you deposited securities that were
	 * previously called. The agent paid DTCC the redemption proceeds. This
	 * adjustment is to pass these proceeds on to you. Your free account
	 * security position will be adjusted (shorted) today for the called
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDEP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyCalledCertificatesFundsDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for that you deposited securities that were previously called. The agent paid DTCC the redemption proceeds. This adjustment is to pass these proceeds on to you. Your free account security position will be adjusted (shorted) today for the called quantity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PreviouslyCalledCertificatesFundsDelivery = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCalledCertificatesFundsDelivery";
			definition = "Adjustment sub-reason is for that you deposited securities that were previously called. The agent paid DTCC the redemption proceeds. This adjustment is to pass these proceeds on to you. Your free account security position will be adjusted (shorted) today for the called quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDEP";
		}
	};
	/**
	 * Adjustment sub-reason is for CTF(s) held over record date on which we
	 * guarantee to hold you free and harmless of any further claim on this
	 * dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SDMT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTFSHeldOverRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CTFSHeldOverRecordDate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTFSHeldOverRecordDate";
			definition = "Adjustment sub-reason is for CTF(s) held over record date on which we guarantee to hold you free and harmless of any further claim on this dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SDMT";
		}
	};
	/**
	 * Adjustment sub-reason is for ten percent French withholding tax, based on
	 * your revised instructions to reduce favourable tax status to
	 * unfavourable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFH9"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax10Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for ten percent French withholding tax, based on your revised instructions to reduce favourable tax status to unfavourable."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code FrenchWithholdingTax10Percent = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax10Percent";
			definition = "Adjustment sub-reason is for ten percent French withholding tax, based on your revised instructions to reduce favourable tax status to unfavourable.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFH9";
		}
	};
	/**
	 * Adjustment sub-reason is for required lists containing discrepancies or
	 * which were not forwarded to French paying agent. This charge is at user
	 * defined withholding rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFI9"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeAtWithholdingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for required lists containing discrepancies or which were not forwarded to French paying agent. This charge is at user defined withholding rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ChargeAtWithholdingRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAtWithholdingRate";
			definition = "Adjustment sub-reason is for required lists containing discrepancies or which were not forwarded to French paying agent. This charge is at user defined withholding rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFI9";
		}
	};
	/**
	 * Adjustment sub-reason is that the 25% French withholding rate has been
	 * revised. This adjustment is based on the refunded tax rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFJ9"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that the 25% French withholding rate has been revised. This adjustment is based on the refunded tax rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RefundedTaxRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedTaxRate";
			definition = "Adjustment sub-reason is that the 25% French withholding rate has been revised. This adjustment is based on the refunded tax rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFJ9";
		}
	};
	/**
	 * Adjustment sub-reason is for rate unknown for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL0"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for rate unknown for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RateUnknown = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateUnknown";
			definition = "Adjustment sub-reason is for rate unknown for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFL0";
		}
	};
	/**
	 * Adjustment sub-reason is for delete for fail tracking related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for delete for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code Delete = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			definition = "Adjustment sub-reason is for delete for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFL1";
		}
	};
	/**
	 * Adjustment sub-reason is for reinstate for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinstate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for reinstate for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code Reinstate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinstate";
			definition = "Adjustment sub-reason is for reinstate for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFL2";
		}
	};
	/**
	 * Adjustment sub-reason is for post date change for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostDateChangeForFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for post date change for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PostDateChangeForFailTracking = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostDateChangeForFailTracking";
			definition = "Adjustment sub-reason is for post date change for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFL3";
		}
	};
	/**
	 * Adjustment sub-reason is for an announcement deleted for fail tracking
	 * related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDeletedOrFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an announcement deleted for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AnnouncementDeletedOrFailTracking = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDeletedOrFailTracking";
			definition = "Adjustment sub-reason is for an announcement deleted for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFLD";
		}
	};
	/**
	 * Adjustment sub-reason is for due bill for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for due bill for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DueBill = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBill";
			definition = "Adjustment sub-reason is for due bill for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFLE";
		}
	};
	/**
	 * Adjustment sub-reason is for fail tracking for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for fail tracking for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code LateAnnouncement = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncement";
			definition = "Adjustment sub-reason is for fail tracking for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFLL";
		}
	};
	/**
	 * Adjustment sub-reason is for date revision for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateRevision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for date revision for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DateRevision = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRevision";
			definition = "Adjustment sub-reason is for date revision for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFLN";
		}
	};
	/**
	 * Adjustment sub-reason is for rate revision for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateRevision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for rate revision for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RateRevision = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateRevision";
			definition = "Adjustment sub-reason is for rate revision for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFLR";
		}
	};
	/**
	 * Adjustment sub-reason is for non allocation for fail tracking related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFLS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for non allocation for fail tracking related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code NonAllocation = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonAllocation";
			definition = "Adjustment sub-reason is for non allocation for fail tracking related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFLS";
		}
	};
	/**
	 * Adjustment sub-reason is for refund of French tax based on acceptance of
	 * global reclamation for the June 1992 distribution refer to important
	 * notice b # 1352‑93.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJune"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for refund of French tax based on acceptance of global reclamation for the June 1992 distribution refer to important notice b # 1352‑93."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RefundOfFrenchTaxJune = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJune";
			definition = "Adjustment sub-reason is for refund of French tax based on acceptance of global reclamation for the June 1992 distribution refer to important notice b # 1352‑93.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFRA";
		}
	};
	/**
	 * Adjustment sub-reason is for refund of French tax based on acceptance of
	 * global reclamation for the July 1992 distribution refer to important
	 * notice b # 1352‑93.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJuly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for refund of French tax based on acceptance of global reclamation for the July 1992 distribution refer to important notice b # 1352‑93."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RefundOfFrenchTaxJuly = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJuly";
			definition = "Adjustment sub-reason is for refund of French tax based on acceptance of global reclamation for the July 1992 distribution refer to important notice b # 1352‑93.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFRB";
		}
	};
	/**
	 * Adjustment sub-reason is for foreign cash dividends or bond interest
	 * allocation at unfavourable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFU9"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for foreign cash dividends or bond interest allocation at unfavourable rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate";
			definition = "Adjustment sub-reason is for foreign cash dividends or bond interest allocation at unfavourable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFU9";
		}
	};
	/**
	 * Adjustment sub-reason is for redemption cash settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGL7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for redemption cash settlement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RedemptionCash = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCash";
			definition = "Adjustment sub-reason is for redemption cash settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGL7";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for an allocation adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AllocationAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustment";
			definition = "Adjustment sub-reason is for an allocation adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGLA";
		}
	};
	/**
	 * Adjustment sub-reason is for muni bearer bond coupon adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for muni bearer bond coupon adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBond = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBond";
			definition = "Adjustment sub-reason is for muni bearer bond coupon adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGLM";
		}
	};
	/**
	 * Adjustment sub-reason is for redemption payment due to pledge release.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentDueToPledgeRelease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for redemption payment due to pledge release."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RedemptionPaymentDueToPledgeRelease = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentDueToPledgeRelease";
			definition = "Adjustment sub-reason is for redemption payment due to pledge release.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGLP";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim on registered holder in the name
	 * of your good selves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLQ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim on registered holder in the name of your good selves."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves";
			definition = "Adjustment sub-reason is for DTCC claim on registered holder in the name of your good selves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGLQ";
		}
	};
	/**
	 * Adjustment sub-reason is for in settlement of a trade - DTCC
	 * reorganisation account 428-10271-1-2-039.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSettlementOfTradeDTCCReorganisationAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for in settlement of a trade - DTCC reorganisation account 428-10271-1-2-039."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InSettlementOfTradeDTCCReorganisationAccount = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSettlementOfTradeDTCCReorganisationAccount";
			definition = "Adjustment sub-reason is for in settlement of a trade - DTCC reorganisation account 428-10271-1-2-039.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGLT";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim on registered holder in the name
	 * of your customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGLZ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim on registered holder in the name of your customer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer";
			definition = "Adjustment sub-reason is for DTCC claim on registered holder in the name of your customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SGLZ";
		}
	};
	/**
	 * Adjustment sub-reason is for that your interim position was adjusted for
	 * deliver order activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SIGE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimPositionAdjustedForDeliverOrderActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for that your interim position was adjusted for deliver order activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InterimPositionAdjustedForDeliverOrderActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPositionAdjustedForDeliverOrderActivity";
			definition = "Adjustment sub-reason is for that your interim position was adjusted for deliver order activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SIGE";
		}
	};
	/**
	 * Adjustment sub-reason is for late announcement activity due bill activity
	 * related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SILL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncementActivityDueBillActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for late announcement activity due bill activity related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code LateAnnouncementActivityDueBillActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementActivityDueBillActivity";
			definition = "Adjustment sub-reason is for late announcement activity due bill activity related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SILL";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC COD withdrawal adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJCB"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC COD withdrawal adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CODWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawal";
			definition = "Adjustment sub-reason is for DTCC COD withdrawal adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJCB";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJDD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC deposit related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DepositAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAdjustment";
			definition = "Adjustment sub-reason is for DTCC deposit related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJDD";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC redemption related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJE7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC redemption related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RedemptionAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAdjustment";
			definition = "Adjustment sub-reason is for DTCC redemption related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJE7";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC pledge release related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeReleaseAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC pledge release related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PledgeReleaseAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeReleaseAdjustment";
			definition = "Adjustment sub-reason is for DTCC pledge release related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJEE";
		}
	};
	/**
	 * Adjustment sub-reason is for write off reorganisation related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WriteOffReorganisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for write off reorganisation related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WriteOffReorganisation = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WriteOffReorganisation";
			definition = "Adjustment sub-reason is for write off reorganisation related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJEW";
		}
	};
	/**
	 * Adjustment sub-reason is that DTCC investment identification related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJIE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentIdentificationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that DTCC investment identification related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InvestmentIdentificationAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentIdentificationAdjustment";
			definition = "Adjustment sub-reason is that DTCC investment identification related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJIE";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC pledge related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC pledge related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PledgeAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeAdjustment";
			definition = "Adjustment sub-reason is for DTCC pledge related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJEF";
		}
	};
	/**
	 * Adjustment sub-reason is that DTCC deliver order related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJEG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that DTCC deliver order related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DeliverOrder = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrder";
			definition = "Adjustment sub-reason is that DTCC deliver order related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJEG";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC reorganisation related adjustment.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJR7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC reorganisation related adjustment.\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReorganisationAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationAdjustment";
			definition = "Adjustment sub-reason is for DTCC reorganisation related adjustment.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJR7";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC WT related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SJWT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for DTCC WT related adjustment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WithdrawalTransferAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferAdjustment";
			definition = "Adjustment sub-reason is for DTCC WT related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SJWT";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim against registered holder in the
	 * name of your customer. Late identification of missed transfer by Transfer
	 * Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourCustomerLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimInTheNameOfYourCustomerLateTransfer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourCustomerLateTransfer";
			definition = "Adjustment sub-reason is for DTCC claim against registered holder in the name of your customer. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SLCP";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim against registered holder in the
	 * name of your good selves. Late identification of missed transfer by
	 * Transfer Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLGP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourGoodselvesLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim against registered holder in the name of your good selves. Late identification of missed transfer by Transfer Agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimInTheNameOfYourGoodselvesLateTransfer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourGoodselvesLateTransfer";
			definition = "Adjustment sub-reason is for DTCC claim against registered holder in the name of your good selves. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SLGP";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim against registered holder in the
	 * name of your nominee. Late identification of missed transfer by Transfer
	 * Agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLNP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourNominee";
			definition = "Adjustment sub-reason is for DTCC claim against registered holder in the name of your nominee. Late identification of missed transfer by Transfer Agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SLNP";
		}
	};
	/**
	 * Adjustment sub-reason is for muni bearer bond coupon related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for muni bearer bond coupon related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBondCoupon = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCoupon";
			definition = "Adjustment sub-reason is for muni bearer bond coupon related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SMAM";
		}
	};
	/**
	 * Adjustment sub-reason is for uni bearer bond coupon adjustment for
	 * coupon(s) missing from a deposit related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMBM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for uni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit";
			definition = "Adjustment sub-reason is for uni bearer bond coupon adjustment for coupon(s) missing from a deposit related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SMBM";
		}
	};
	/**
	 * Adjustment sub-reason is for muni bearer bond coupon adjustment for
	 * coupon(s) missing from a withdrawal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMCM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal";
			definition = "Adjustment sub-reason is for muni bearer bond coupon adjustment for coupon(s) missing from a withdrawal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SMCM";
		}
	};
	/**
	 * Adjustment sub-reason is for muni bearer bond coupon adjustment excess
	 * coupon(s) withdrawn on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMDM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn";
			definition = "Adjustment sub-reason is for muni bearer bond coupon adjustment excess coupon(s) withdrawn on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SMDM";
		}
	};
	/**
	 * Adjustment sub-reason is for muni bearer bond coupon adjustment excess
	 * coupon(s) deposited on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMEM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsDeposited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBondCouponAdjustmentExcessCouponsDeposited = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsDeposited";
			definition = "Adjustment sub-reason is for muni bearer bond coupon adjustment excess coupon(s) deposited on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SMEM";
		}
	};
	/**
	 * Adjustment sub-reason is for muni bearer bond coupon adjustment. Your
	 * interim position was adjusted for deposit activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMMM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponPositionAdjustedForDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for muni bearer bond coupon adjustment. Your interim position was adjusted for deposit activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code MuniBearerBondCouponPositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponPositionAdjustedForDepositActivity";
			definition = "Adjustment sub-reason is for muni bearer bond coupon adjustment. Your interim position was adjusted for deposit activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SMMM";
		}
	};
	/**
	 * Adjustment sub-reason is for an adjustment for cash on increased shares
	 * due to a stock distribution payable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SNNG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOnIncreasedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an adjustment for cash on increased shares due to a stock distribution payable."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CashOnIncreasedShares = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOnIncreasedShares";
			definition = "Adjustment sub-reason is for an adjustment for cash on increased shares due to a stock distribution payable.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SNNG";
		}
	};
	/**
	 * Adjustment sub-reason is for optional dividend (ops) allocation related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOP2"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividendAllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for optional dividend (ops) allocation related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code OptionalDividendAllocationAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendAllocationAdjustment";
			definition = "Adjustment sub-reason is for optional dividend (ops) allocation related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SOP2";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim against registered holder in the
	 * name of your customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim against registered holder in the name of your customer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourCustomer";
			definition = "Adjustment sub-reason is for DTCC claim against registered holder in the name of your customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SPCP";
		}
	};
	/**
	 * Adjustment sub-reason is for proceeds from sale of.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPFS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromSaleOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for proceeds from sale of."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ProceedsFromSaleOf = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSaleOf";
			definition = "Adjustment sub-reason is for proceeds from sale of.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SPFS";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim against registered holder in the
	 * name of your good selves.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPGP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim against registered holder in the name of your good selves."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourGoodselves";
			definition = "Adjustment sub-reason is for DTCC claim against registered holder in the name of your good selves.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SPGP";
		}
	};
	/**
	 * Adjustment sub-reason is for DTCC claim against registered holder in the
	 * name of your nominee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPNP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourNomineeLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for DTCC claim against registered holder in the name of your nominee."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DTCCClaimInTheNameOfYourNomineeLateTransfer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourNomineeLateTransfer";
			definition = "Adjustment sub-reason is for DTCC claim against registered holder in the name of your nominee.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SPNP";
		}
	};
	/**
	 * Adjustment sub-reason is that the principal previously paid to you was at
	 * the wrong rate. This adjustment is to correct that erroneous payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRatePrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that the principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WrongRatePrincipal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRatePrincipal";
			definition = "Adjustment sub-reason is that the principal previously paid to you was at the wrong rate. This adjustment is to correct that erroneous payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SPRA";
		}
	};
	/**
	 * Adjustment sub-reason is in response to your written inquiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRAH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrittenInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is in response to your written inquiry."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WrittenInquiry = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrittenInquiry";
			definition = "Adjustment sub-reason is in response to your written inquiry.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRAH";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation adjustment due to a change in
	 * the record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRDA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation adjustment due to a change in the record date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ChangeInRecordDate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInRecordDate";
			definition = "Adjustment sub-reason is for an allocation adjustment due to a change in the record date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRDA";
		}
	};
	/**
	 * Adjustment sub-reason is that adjustment is in response to your inquiry.
	 * Refer to control number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRIH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InResponseToYourInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that adjustment is in response to your inquiry. Refer to control number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InResponseToYourInquiry = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InResponseToYourInquiry";
			definition = "Adjustment sub-reason is that adjustment is in response to your inquiry. Refer to control number.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRIH";
		}
	};
	/**
	 * Adjustment sub-reason is for Rep payment / charge.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRPO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepPaymentCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for Rep payment / charge."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RepPaymentCharge = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepPaymentCharge";
			definition = "Adjustment sub-reason is for Rep payment / charge.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRPO";
		}
	};
	/**
	 * Adjustment sub-reason is for supplemental interim activity related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRPP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for supplemental interim activity related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code SupplementalInterimActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivity";
			definition = "Adjustment sub-reason is for supplemental interim activity related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRPP";
		}
	};
	/**
	 * Adjustment sub-reason is that this adjustment represents credits/debits
	 * to your account in lieu of reorganisation deposit activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPRG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InLieuOfReorganisationDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that this adjustment represents credits/debits to your account in lieu of reorganisation deposit activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code InLieuOfReorganisationDepositActivity = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InLieuOfReorganisationDepositActivity";
			definition = "Adjustment sub-reason is that this adjustment represents credits/debits to your account in lieu of reorganisation deposit activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SPRG";
		}
	};
	/**
	 * Adjustment sub-reason is that this allocation was adjusted for a rate
	 * change. Please refer to DIVA comment field for additional information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRTA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that this allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RateChange = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChange";
			definition = "Adjustment sub-reason is that this allocation was adjusted for a rate change. Please refer to DIVA comment field for additional information.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRTA";
		}
	};
	/**
	 * Adjustment sub-reason is for allocation adjustment for dividend
	 * reinvestment due to price correction by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSA6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCorrectionDividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for allocation adjustment for dividend reinvestment due to price correction by the agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PriceCorrectionDividendReinvestment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionDividendReinvestment";
			definition = "Adjustment sub-reason is for allocation adjustment for dividend reinvestment due to price correction by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSA6";
		}
	};
	/**
	 * Adjustment sub-reason is for an adjustment for cash due on an accrued
	 * stock payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSBK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnAccruedStockPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an adjustment for cash due on an accrued stock payment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CashDueOnAccruedStockPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnAccruedStockPayment";
			definition = "Adjustment sub-reason is for an adjustment for cash due on an accrued stock payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSBK";
		}
	};
	/**
	 * Adjustment sub-reason is for dividend reinvestment allocation why not on
	 * normal event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSC6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for dividend reinvestment allocation why not on normal event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DividendReinvestmentAllocation = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocation";
			definition = "Adjustment sub-reason is for dividend reinvestment allocation why not on normal event.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSC6";
		}
	};
	/**
	 * Adjustment sub-reason is for accrued cash due on a stock dividend
	 * adjustment made on user defined date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSCK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnStockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for accrued cash due on a stock dividend adjustment made on user defined date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CashDueOnStockDividend = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnStockDividend";
			definition = "Adjustment sub-reason is for accrued cash due on a stock dividend adjustment made on user defined date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSCK";
		}
	};
	/**
	 * Adjustment sub-reason is for an adjustment to your dividend reinvestment
	 * (DRP) position related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSD6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentToYourDividendReinvestmentPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an adjustment to your dividend reinvestment (DRP) position related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AdjustmentToYourDividendReinvestmentPosition = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToYourDividendReinvestmentPosition";
			definition = "Adjustment sub-reason is for an adjustment to your dividend reinvestment (DRP) position related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSD6";
		}
	};
	/**
	 * Adjustment sub-reason is for accrued cash due on DRP share allocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSDK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnDRPShareAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for accrued cash due on DRP share allocation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CashDueOnDRPShareAllocation = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnDRPShareAllocation";
			definition = "Adjustment sub-reason is for accrued cash due on DRP share allocation.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSDK";
		}
	};
	/**
	 * Adjustment sub-reason is for dividend reinvestment allocation of cash in
	 * lieu of fractions related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSE6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocationOfCashInLieuOfFractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for dividend reinvestment allocation of cash in lieu of fractions related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DividendReinvestmentAllocationOfCashInLieuOfFractions = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationOfCashInLieuOfFractions";
			definition = "Adjustment sub-reason is for dividend reinvestment allocation of cash in lieu of fractions related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSE6";
		}
	};
	/**
	 * Adjustment sub-reason is for an adjustment for cash-in-lieu of fractional
	 * shares related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSJJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFractionalShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an adjustment for cash-in-lieu of fractional shares related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code CashInLieuOfFractionalShares = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfFractionalShares";
			definition = "Adjustment sub-reason is for an adjustment for cash-in-lieu of fractional shares related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSJJ";
		}
	};
	/**
	 * Adjustment sub-reason is for stock loan related payment or charge.<br>
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSLA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for stock loan related payment or charge.\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code StockLoanAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanAdjustment";
			definition = "Adjustment sub-reason is for stock loan related payment or charge.\r\n";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSLA";
		}
	};
	/**
	 * Adjustment sub-reason is for supplemental interim activity from Midwest
	 * (6942).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSME"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromMidwest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for supplemental interim activity from Midwest (6942)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code SupplementalInterimActivityFromMidwest = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromMidwest";
			definition = "Adjustment sub-reason is for supplemental interim activity from Midwest (6942).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSME";
		}
	};
	/**
	 * Adjustment sub-reason is for proceeds resulting from a (buy) transaction
	 * affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSP4"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromBuyTransactionInDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for proceeds resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ProceedsFromBuyTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromBuyTransactionInDividendTradingAccount";
			definition = "Adjustment sub-reason is for proceeds resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSP4";
		}
	};
	/**
	 * Adjustment sub-reason is for supplemental interim activity from
	 * Philadelphia (6070).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromPhiladelphia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for supplemental interim activity from Philadelphia (6070)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code SupplementalInterimActivityFromPhiladelphia = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromPhiladelphia";
			definition = "Adjustment sub-reason is for supplemental interim activity from Philadelphia (6070).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSPE";
		}
	};
	/**
	 * Adjustment sub-reason is for stock loan or repo payment order related
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanOrRepoPaymentOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for stock loan or repo payment order related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code StockLoanOrRepoPaymentOrder = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanOrRepoPaymentOrder";
			definition = "Adjustment sub-reason is for stock loan or repo payment order related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSPO";
		}
	};
	/**
	 * Adjustment sub-reason is for share adjustment resulting from a (buy)
	 * transaction affected in our DTCC/dividend trading account
	 * (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSR4"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareAdjustmentFromBuyTransactionInDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ShareAdjustmentFromBuyTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromBuyTransactionInDividendTradingAccount";
			definition = "Adjustment sub-reason is for share adjustment resulting from a (buy) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSR4";
		}
	};
	/**
	 * Adjustment sub-reason is for share adjustment resulting from a (sell)
	 * transaction affected in our DTCC/dividend trading account
	 * (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSR5"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareAdjustmentFromSellTransactionInDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ShareAdjustmentFromSellTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromSellTransactionInDividendTradingAccount";
			definition = "Adjustment sub-reason is for share adjustment resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSR5";
		}
	};
	/**
	 * Adjustment sub-reason is that, as per your authorization, we are charging
	 * your account in lieu of receipt of dividend reinvestment related shares
	 * related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSR6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeInLieuOfReceiptOfDividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that, as per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ChargeInLieuOfReceiptOfDividendReinvestment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeInLieuOfReceiptOfDividendReinvestment";
			definition = "Adjustment sub-reason is that, as per your authorization, we are charging your account in lieu of receipt of dividend reinvestment related shares related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSR6";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation adjustment due to fractions
	 * rounded up by the agent related adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSRJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustmentDueToFractionsRoundedUpByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation adjustment due to fractions rounded up by the agent related adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AllocationAdjustmentDueToFractionsRoundedUpByAgent = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustmentDueToFractionsRoundedUpByAgent";
			definition = "Adjustment sub-reason is for an allocation adjustment due to fractions rounded up by the agent related adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSRJ";
		}
	};
	/**
	 * Adjustment sub-reason is for proceeds resulting from a (sell) transaction
	 * affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSS5"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromSellTransactionInDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ProceedsFromSellTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSellTransactionInDividendTradingAccount";
			definition = "Adjustment sub-reason is for proceeds resulting from a (sell) transaction affected in our DTCC/dividend trading account (#428‑10288‑1‑3‑039).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSS5";
		}
	};
	/**
	 * Adjustment sub-reason is for dividend allocation adjustment due to your
	 * sub accounting instructions to the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSS6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for dividend allocation adjustment due to your sub accounting instructions to the agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DividendReinvestmentAllocationAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationAdjustment";
			definition = "Adjustment sub-reason is for dividend allocation adjustment due to your sub accounting instructions to the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSS6";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation of dividend reinvestment
	 * shares - DRP/TEDS instruction @100%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SST6"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfDRPTEDSInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation of dividend reinvestment shares - DRP/TEDS instruction @100%."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AllocationOfDRPTEDSInstruction = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfDRPTEDSInstruction";
			definition = "Adjustment sub-reason is for an allocation of dividend reinvestment shares - DRP/TEDS instruction @100%.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SST6";
		}
	};
	/**
	 * Adjustment sub-reason is to adjust allocation at 100% on your tax exempt
	 * instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STEA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is to adjust allocation at 100% on your tax exempt instructions."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code TaxExemptInstructions = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptInstructions";
			definition = "Adjustment sub-reason is to adjust allocation at 100% on your tax exempt instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "STEA";
		}
	};
	/**
	 * Adjustment sub-reason is for withdrawal by transfer - lost certificate
	 * over the record date was registered in the name of your customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWG1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for withdrawal by transfer - lost certificate over the record date was registered in the name of your customer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code LostCertificateWasRegisteredInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourCustomer";
			definition = "Adjustment sub-reason is for withdrawal by transfer - lost certificate over the record date was registered in the name of your customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWG1";
		}
	};
	/**
	 * Adjustment sub-reason is that our record date position was adjusted for a
	 * withdrawal by transfer activity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWHT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDatePositionAdjustedForWithdrawalByTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that our record date position was adjusted for a withdrawal by transfer activity."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code RecordDatePositionAdjustedForWithdrawalByTransfer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDatePositionAdjustedForWithdrawalByTransfer";
			definition = "Adjustment sub-reason is that our record date position was adjusted for a withdrawal by transfer activity.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWHT";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment made for a withdrawal by transfer
	 * that was not transferred into your clients name by the record date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWL1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalByTransferNotTransferredIntoClientsName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WithdrawalByTransferNotTransferredIntoClientsName = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalByTransferNotTransferredIntoClientsName";
			definition = "Adjustment sub-reason is for adjustment made for a withdrawal by transfer that was not transferred into your clients name by the record date.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWL1";
		}
	};
	/**
	 * Adjustment sub-reason code is for adjustment made for a withdrawal by
	 * transfer set up after the cut off date made transfer into your clients
	 * name.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWM1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason code is for adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName";
			definition = "Adjustment sub-reason code is for adjustment made for a withdrawal by transfer set up after the cut off date made transfer into your clients name.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWM1";
		}
	};
	/**
	 * Adjustment sub-reason is that your position was reinstated for a
	 * withdrawal by transfer. However the certificates(s) were issued and
	 * outstanding over the record date in the name of your customer(s).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWN1"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionReinstatedCertificatesIssuedAndOutstanding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PositionReinstatedCertificatesIssuedAndOutstanding = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionReinstatedCertificatesIssuedAndOutstanding";
			definition = "Adjustment sub-reason is that your position was reinstated for a withdrawal by transfer. However the certificates(s) were issued and outstanding over the record date in the name of your customer(s).";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWN1";
		}
	};
	/**
	 * Adjustment sub-reason is for a reversal of a withdrawal by transfer
	 * adjustment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWRH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfWithdrawalByTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for a reversal of a withdrawal by transfer adjustment."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ReversalOfWithdrawalByTransfer = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfWithdrawalByTransfer";
			definition = "Adjustment sub-reason is for a reversal of a withdrawal by transfer adjustment.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWRH";
		}
	};
	/**
	 * Adjustment sub-reason is for adjustment to allocation to charge (user
	 * defined percentage) withholding tax in (user defined) country.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SWTA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAdjustmentInUserDefinedCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code WithholdingTaxAdjustmentInUserDefinedCountry = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAdjustmentInUserDefinedCountry";
			definition = "Adjustment sub-reason is for adjustment to allocation to charge (user defined percentage) withholding tax in (user defined) country.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SWTA";
		}
	};
	/**
	 * Adjustment sub-reason is that your account is being credited at the
	 * unfavourable rate (20%) as a result of the reorg merger paid on 4/2/93
	 * (Armstrong Pharm to Medeva plc, effective 1/15/93). If entitled to
	 * favourable rate(15%), you must follow attached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAA7"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfavourableRateMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your account is being credited at the unfavourable rate (20%) as a result of the reorg merger paid on 4/2/93 (Armstrong Pharm to Medeva plc, effective 1/15/93). If entitled to favourable rate(15%), you must follow attached."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code UnfavourableRateMerger = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfavourableRateMerger";
			definition = "Adjustment sub-reason is that your account is being credited at the unfavourable rate (20%) as a result of the reorg merger paid on 4/2/93 (Armstrong Pharm to Medeva plc, effective 1/15/93). If entitled to favourable rate(15%), you must follow attached.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAA7";
		}
	};
	/**
	 * Adjustment sub-reason is for allocation of fractional rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SAFR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for allocation of fractional rights."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code FractionalRights = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalRights";
			definition = "Adjustment sub-reason is for allocation of fractional rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SAFR";
		}
	};
	/**
	 * Adjustment sub-reason is that your record date position was adjusted for
	 * a DWAC withdrawal to effect a buy back/treasury purchase.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SBB3"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DWACAdjustment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACAdjustment";
			definition = "Adjustment sub-reason is that your record date position was adjusted for a DWAC withdrawal to effect a buy back/treasury purchase.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SBB3";
		}
	};
	/**
	 * Adjustment sub-reason is for foreign cash dividends allocation at
	 * unfavourable rate.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFL9"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendUnfavourableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for foreign cash dividends allocation at unfavourable rate."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code ForeignCashDividendUnfavourableRate = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendUnfavourableRate";
			definition = "Adjustment sub-reason is for foreign cash dividends allocation at unfavourable rate.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFL9";
		}
	};
	/**
	 * Adjustment sub-reason is as per memo requesting a frozen letter movement
	 * from part number.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFRO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrozenLetterMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is as per memo requesting a frozen letter movement from part number."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code FrozenLetterMovement = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrozenLetterMovement";
			definition = "Adjustment sub-reason is as per memo requesting a frozen letter movement from part number.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SFRO";
		}
	};
	/**
	 * Adjustment sub-reason is for option to receive Vodafone Group American
	 * Depository Receipt at 11.354392 for every 100 adrs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VodaphoneADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for option to receive Vodafone Group American Depository Receipt at 11.354392 for every 100 adrs."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code VodaphoneADR = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VodaphoneADR";
			definition = "Adjustment sub-reason is for option to receive Vodafone Group American Depository Receipt at 11.354392 for every 100 adrs.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRRA";
		}
	};
	/**
	 * Adjustment sub-reason is for a distribution of additional rights for
	 * round up of fractions as requested for your beneficial owners.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRTJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightsForBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for a distribution of additional rights for round up of fractions as requested for your beneficial owners."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AdditionalRightsForBeneficialOwner = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightsForBeneficialOwner";
			definition = "Adjustment sub-reason is for a distribution of additional rights for round up of fractions as requested for your beneficial owners.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SRTJ";
		}
	};
	/**
	 * Adjustment sub-reason is for a bond paying in baby bonds that are issued
	 * in minimum/incremental denominations. This is to adjust for the amount of
	 * pending unissued bonds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSDJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BabyBondPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for a bond paying in baby bonds that are issued in minimum/incremental denominations. This is to adjust for the amount of pending unissued bonds."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code BabyBondPayment = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondPayment";
			definition = "Adjustment sub-reason is for a bond paying in baby bonds that are issued in minimum/incremental denominations. This is to adjust for the amount of pending unissued bonds.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSDJ";
		}
	};
	/**
	 * Adjustment sub-reason is for due bill fail tracking reversal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSFR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for due bill fail tracking reversal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DueBillReversal = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillReversal";
			definition = "Adjustment sub-reason is for due bill fail tracking reversal.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSFR";
		}
	};
	/**
	 * Adjustment sub-reason is for due bill fail tracking.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSFF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Adjustment sub-reason is for due bill fail tracking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code DueBillFailTracking = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillFailTracking";
			definition = "Adjustment sub-reason is for due bill fail tracking.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSFF";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation of spinoff security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSOS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOffAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation of spinoff security."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code SpinOffAllocation = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOffAllocation";
			definition = "Adjustment sub-reason is for an allocation of spinoff security.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSOS";
		}
	};
	/**
	 * Adjustment sub-reason is that an agent paid DTC based on combined
	 * fractions for all public service New Hampshire. New spinoffs distributed
	 * on July 25, 1991.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPJ"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentPaidBasedOnCombinedFractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is that an agent paid DTC based on combined fractions for all public service New Hampshire. New spinoffs distributed on July 25, 1991."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code AgentPaidBasedOnCombinedFractions = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentPaidBasedOnCombinedFractions";
			definition = "Adjustment sub-reason is that an agent paid DTC based on combined fractions for all public service New Hampshire. New spinoffs distributed on July 25, 1991.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSPJ";
		}
	};
	/**
	 * Adjustment sub-reason is for an allocation of a pay in kind distribution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSPA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaynInKindDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjustment sub-reason is for an allocation of a pay in kind distribution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code PaynInKindDistribution = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaynInKindDistribution";
			definition = "Adjustment sub-reason is for an allocation of a pay in kind distribution.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "SSPA";
		}
	};
	/**
	 * Reserved for new user defined reason codes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
	 * DTCAdjustmentPaymentSubReasonV2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reserved for new user defined reason codes."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReasonV2Code Other = new DTCAdjustmentPaymentSubReasonV2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			definition = "Reserved for new user defined reason codes.";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.mmObject();
			codeName = "OTHR";
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentSubReasonV2Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentSubReasonV2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentSubReasonV2Code";
				definition = "Specifies the subtype of the payment adjustment.";
				derivation_lazy = () -> Arrays.asList(DTCAdjustmentPaymentSubReason2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReorganisationRelatedAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestDueWasErroneouslyPaidToYouByIssuer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AllocationOfBabyBondsAmountToBeExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestorDividendDueOnConversion,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AccruedInterestWrongRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestAdjustedDueToEarlyWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AccruedInterestNotPaid, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CompanyInDefault,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.IssueInDefault, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestAllocatedInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.TenderFeeDeduction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.SupplementaryInterimOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.GracePeriod, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PaymentOfFullAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AvoidFiscalPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RevisionOfChargeForWithholdingTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnMerger, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestPaysAtMaturity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CompanyDidNotDeclareDividend, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnRepaymentOption,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PaymentOfPartialAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CalledCertificatesAccruedErroneousInterestChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnRedemption, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AssumedByYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ScriptSharesExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnTender,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.UninsuredInterestWithheld, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DWACBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CODBuyBackWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WithdrawalTransferBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawalNotDeliveredInNameOfGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawalNotDeliveredInNameOfNominee, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReversalOfCODWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CustodyPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CalledCertificatesCheckInParticipantsNameChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PacificDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MidwestDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PhiladelphiaDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AccrualClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PartClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReversalOfAccrualClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PartClaimReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CouponCollectionService,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReversalOfDeposit, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DeliverOrderActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReverseOfSharesEscheatedToNYStateInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ChargeForFrenchAvoidFiscalTaxCredit, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReverseOfEscheatedAmountOfClaim,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendsOrBondInterestAllocationAtExemptRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax15Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax25Percent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DepositLostCertificateRegisteredInNameOfYour,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.LostCertificateRegisteredInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DepositTransferredIntoNameOfCEDEAndCo, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.LostCertificateWasRegisteredInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PreviouslyCalledCertificatesFundsDelivery, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CTFSHeldOverRecordDate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax10Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ChargeAtWithholdingRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RefundedTaxRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RateUnknown,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.Delete, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.Reinstate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PostDateChangeForFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AnnouncementDeletedOrFailTracking,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DueBill, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.LateAnnouncement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DateRevision, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RateRevision,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.NonAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RefundOfFrenchTaxJune,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RefundOfFrenchTaxJuly,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RedemptionCash, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBond, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RedemptionPaymentDueToPledgeRelease,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InSettlementOfTradeDTCCReorganisationAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InterimPositionAdjustedForDeliverOrderActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.LateAnnouncementActivityDueBillActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DepositAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RedemptionAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PledgeReleaseAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WriteOffReorganisation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InvestmentIdentificationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PledgeAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DeliverOrder, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReorganisationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WithdrawalTransferAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourCustomerLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourGoodselvesLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourNominee, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCoupon,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentExcessCouponsDeposited,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponPositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CashOnIncreasedShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.OptionalDividendAllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourCustomer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromSaleOf,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourNomineeLateTransfer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WrongRatePrincipal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WrittenInquiry, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ChangeInRecordDate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InResponseToYourInquiry, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RepPaymentCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.InLieuOfReorganisationDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RateChange, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PriceCorrectionDividendReinvestment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CashDueOnAccruedStockPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CashDueOnStockDividend, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AdjustmentToYourDividendReinvestmentPosition,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CashDueOnDRPShareAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocationOfCashInLieuOfFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.CashInLieuOfFractionalShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.StockLoanAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivityFromMidwest,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromBuyTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivityFromPhiladelphia, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.StockLoanOrRepoPaymentOrder,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ShareAdjustmentFromBuyTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ShareAdjustmentFromSellTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ChargeInLieuOfReceiptOfDividendReinvestment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AllocationAdjustmentDueToFractionsRoundedUpByAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromSellTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AllocationOfDRPTEDSInstruction,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.TaxExemptInstructions, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.LostCertificateWasRegisteredInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.RecordDatePositionAdjustedForWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WithdrawalByTransferNotTransferredIntoClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PositionReinstatedCertificatesIssuedAndOutstanding,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ReversalOfWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.WithholdingTaxAdjustmentInUserDefinedCountry, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.UnfavourableRateMerger,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.FractionalRights, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DWACAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendUnfavourableRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.FrozenLetterMovement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.VodaphoneADR, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AdditionalRightsForBeneficialOwner,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.BabyBondPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DueBillReversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.DueBillFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.SpinOffAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.AgentPaidBasedOnCombinedFractions, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.PaynInKindDistribution,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReorganisationRelatedAdjustment.getCodeName().get(), ReorganisationRelatedAdjustment);
		codesByName.put(InterestDueWasErroneouslyPaidToYouByIssuer.getCodeName().get(), InterestDueWasErroneouslyPaidToYouByIssuer);
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
		codesByName.put(AvoidFiscalPayment.getCodeName().get(), AvoidFiscalPayment);
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
		codesByName.put(CODWithdrawalNotDeliveredInNameOfGoodselves.getCodeName().get(), CODWithdrawalNotDeliveredInNameOfGoodselves);
		codesByName.put(CODWithdrawalNotDeliveredInNameOfNominee.getCodeName().get(), CODWithdrawalNotDeliveredInNameOfNominee);
		codesByName.put(ReversalOfCODWithdrawal.getCodeName().get(), ReversalOfCODWithdrawal);
		codesByName.put(CustodyPayment.getCodeName().get(), CustodyPayment);
		codesByName.put(CalledCertificatesCheckInParticipantsNameChargeBack.getCodeName().get(), CalledCertificatesCheckInParticipantsNameChargeBack);
		codesByName.put(PacificDepository.getCodeName().get(), PacificDepository);
		codesByName.put(MidwestDepository.getCodeName().get(), MidwestDepository);
		codesByName.put(PhiladelphiaDepository.getCodeName().get(), PhiladelphiaDepository);
		codesByName.put(AccrualClaimPayment.getCodeName().get(), AccrualClaimPayment);
		codesByName.put(PartClaimPayment.getCodeName().get(), PartClaimPayment);
		codesByName.put(ReversalOfAccrualClaimPayment.getCodeName().get(), ReversalOfAccrualClaimPayment);
		codesByName.put(PartClaimReversal.getCodeName().get(), PartClaimReversal);
		codesByName.put(CouponCollectionService.getCodeName().get(), CouponCollectionService);
		codesByName.put(ReversalOfDeposit.getCodeName().get(), ReversalOfDeposit);
		codesByName.put(DeliverOrderActivity.getCodeName().get(), DeliverOrderActivity);
		codesByName.put(ReverseOfSharesEscheatedToNYStateInError.getCodeName().get(), ReverseOfSharesEscheatedToNYStateInError);
		codesByName.put(ChargeForFrenchAvoidFiscalTaxCredit.getCodeName().get(), ChargeForFrenchAvoidFiscalTaxCredit);
		codesByName.put(ReverseOfEscheatedAmountOfClaim.getCodeName().get(), ReverseOfEscheatedAmountOfClaim);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtExemptRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtExemptRate);
		codesByName.put(ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate.getCodeName().get(), ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate);
		codesByName.put(FrenchWithholdingTax15Percent.getCodeName().get(), FrenchWithholdingTax15Percent);
		codesByName.put(FrenchWithholdingTax25Percent.getCodeName().get(), FrenchWithholdingTax25Percent);
		codesByName.put(DepositLostCertificateRegisteredInNameOfYour.getCodeName().get(), DepositLostCertificateRegisteredInNameOfYour);
		codesByName.put(LostCertificateRegisteredInTheNameOfYourGoodselves.getCodeName().get(), LostCertificateRegisteredInTheNameOfYourGoodselves);
		codesByName.put(DepositTransferredIntoNameOfCEDEAndCo.getCodeName().get(), DepositTransferredIntoNameOfCEDEAndCo);
		codesByName.put(PositionAdjustedForDepositActivity.getCodeName().get(), PositionAdjustedForDepositActivity);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourNominee.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourNominee);
		codesByName.put(PreviouslyCalledCertificatesFundsDelivery.getCodeName().get(), PreviouslyCalledCertificatesFundsDelivery);
		codesByName.put(CTFSHeldOverRecordDate.getCodeName().get(), CTFSHeldOverRecordDate);
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
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate);
		codesByName.put(RedemptionCash.getCodeName().get(), RedemptionCash);
		codesByName.put(AllocationAdjustment.getCodeName().get(), AllocationAdjustment);
		codesByName.put(MuniBearerBond.getCodeName().get(), MuniBearerBond);
		codesByName.put(RedemptionPaymentDueToPledgeRelease.getCodeName().get(), RedemptionPaymentDueToPledgeRelease);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves);
		codesByName.put(InSettlementOfTradeDTCCReorganisationAccount.getCodeName().get(), InSettlementOfTradeDTCCReorganisationAccount);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer);
		codesByName.put(InterimPositionAdjustedForDeliverOrderActivity.getCodeName().get(), InterimPositionAdjustedForDeliverOrderActivity);
		codesByName.put(LateAnnouncementActivityDueBillActivity.getCodeName().get(), LateAnnouncementActivityDueBillActivity);
		codesByName.put(CODWithdrawal.getCodeName().get(), CODWithdrawal);
		codesByName.put(DepositAdjustment.getCodeName().get(), DepositAdjustment);
		codesByName.put(RedemptionAdjustment.getCodeName().get(), RedemptionAdjustment);
		codesByName.put(PledgeReleaseAdjustment.getCodeName().get(), PledgeReleaseAdjustment);
		codesByName.put(WriteOffReorganisation.getCodeName().get(), WriteOffReorganisation);
		codesByName.put(InvestmentIdentificationAdjustment.getCodeName().get(), InvestmentIdentificationAdjustment);
		codesByName.put(PledgeAdjustment.getCodeName().get(), PledgeAdjustment);
		codesByName.put(DeliverOrder.getCodeName().get(), DeliverOrder);
		codesByName.put(ReorganisationAdjustment.getCodeName().get(), ReorganisationAdjustment);
		codesByName.put(WithdrawalTransferAdjustment.getCodeName().get(), WithdrawalTransferAdjustment);
		codesByName.put(DTCCClaimInTheNameOfYourCustomerLateTransfer.getCodeName().get(), DTCCClaimInTheNameOfYourCustomerLateTransfer);
		codesByName.put(DTCCClaimInTheNameOfYourGoodselvesLateTransfer.getCodeName().get(), DTCCClaimInTheNameOfYourGoodselvesLateTransfer);
		codesByName.put(DTCCClaimInTheNameOfYourNominee.getCodeName().get(), DTCCClaimInTheNameOfYourNominee);
		codesByName.put(MuniBearerBondCoupon.getCodeName().get(), MuniBearerBondCoupon);
		codesByName.put(MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit.getCodeName().get(), MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit);
		codesByName.put(MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal.getCodeName().get(), MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsDeposited.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsDeposited);
		codesByName.put(MuniBearerBondCouponPositionAdjustedForDepositActivity.getCodeName().get(), MuniBearerBondCouponPositionAdjustedForDepositActivity);
		codesByName.put(CashOnIncreasedShares.getCodeName().get(), CashOnIncreasedShares);
		codesByName.put(OptionalDividendAllocationAdjustment.getCodeName().get(), OptionalDividendAllocationAdjustment);
		codesByName.put(DTCCClaimInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimInTheNameOfYourCustomer);
		codesByName.put(ProceedsFromSaleOf.getCodeName().get(), ProceedsFromSaleOf);
		codesByName.put(DTCCClaimInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimInTheNameOfYourGoodselves);
		codesByName.put(DTCCClaimInTheNameOfYourNomineeLateTransfer.getCodeName().get(), DTCCClaimInTheNameOfYourNomineeLateTransfer);
		codesByName.put(WrongRatePrincipal.getCodeName().get(), WrongRatePrincipal);
		codesByName.put(WrittenInquiry.getCodeName().get(), WrittenInquiry);
		codesByName.put(ChangeInRecordDate.getCodeName().get(), ChangeInRecordDate);
		codesByName.put(InResponseToYourInquiry.getCodeName().get(), InResponseToYourInquiry);
		codesByName.put(RepPaymentCharge.getCodeName().get(), RepPaymentCharge);
		codesByName.put(SupplementalInterimActivity.getCodeName().get(), SupplementalInterimActivity);
		codesByName.put(InLieuOfReorganisationDepositActivity.getCodeName().get(), InLieuOfReorganisationDepositActivity);
		codesByName.put(RateChange.getCodeName().get(), RateChange);
		codesByName.put(PriceCorrectionDividendReinvestment.getCodeName().get(), PriceCorrectionDividendReinvestment);
		codesByName.put(CashDueOnAccruedStockPayment.getCodeName().get(), CashDueOnAccruedStockPayment);
		codesByName.put(DividendReinvestmentAllocation.getCodeName().get(), DividendReinvestmentAllocation);
		codesByName.put(CashDueOnStockDividend.getCodeName().get(), CashDueOnStockDividend);
		codesByName.put(AdjustmentToYourDividendReinvestmentPosition.getCodeName().get(), AdjustmentToYourDividendReinvestmentPosition);
		codesByName.put(CashDueOnDRPShareAllocation.getCodeName().get(), CashDueOnDRPShareAllocation);
		codesByName.put(DividendReinvestmentAllocationOfCashInLieuOfFractions.getCodeName().get(), DividendReinvestmentAllocationOfCashInLieuOfFractions);
		codesByName.put(CashInLieuOfFractionalShares.getCodeName().get(), CashInLieuOfFractionalShares);
		codesByName.put(StockLoanAdjustment.getCodeName().get(), StockLoanAdjustment);
		codesByName.put(SupplementalInterimActivityFromMidwest.getCodeName().get(), SupplementalInterimActivityFromMidwest);
		codesByName.put(ProceedsFromBuyTransactionInDividendTradingAccount.getCodeName().get(), ProceedsFromBuyTransactionInDividendTradingAccount);
		codesByName.put(SupplementalInterimActivityFromPhiladelphia.getCodeName().get(), SupplementalInterimActivityFromPhiladelphia);
		codesByName.put(StockLoanOrRepoPaymentOrder.getCodeName().get(), StockLoanOrRepoPaymentOrder);
		codesByName.put(ShareAdjustmentFromBuyTransactionInDividendTradingAccount.getCodeName().get(), ShareAdjustmentFromBuyTransactionInDividendTradingAccount);
		codesByName.put(ShareAdjustmentFromSellTransactionInDividendTradingAccount.getCodeName().get(), ShareAdjustmentFromSellTransactionInDividendTradingAccount);
		codesByName.put(ChargeInLieuOfReceiptOfDividendReinvestment.getCodeName().get(), ChargeInLieuOfReceiptOfDividendReinvestment);
		codesByName.put(AllocationAdjustmentDueToFractionsRoundedUpByAgent.getCodeName().get(), AllocationAdjustmentDueToFractionsRoundedUpByAgent);
		codesByName.put(ProceedsFromSellTransactionInDividendTradingAccount.getCodeName().get(), ProceedsFromSellTransactionInDividendTradingAccount);
		codesByName.put(DividendReinvestmentAllocationAdjustment.getCodeName().get(), DividendReinvestmentAllocationAdjustment);
		codesByName.put(AllocationOfDRPTEDSInstruction.getCodeName().get(), AllocationOfDRPTEDSInstruction);
		codesByName.put(TaxExemptInstructions.getCodeName().get(), TaxExemptInstructions);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourCustomer.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourCustomer);
		codesByName.put(RecordDatePositionAdjustedForWithdrawalByTransfer.getCodeName().get(), RecordDatePositionAdjustedForWithdrawalByTransfer);
		codesByName.put(WithdrawalByTransferNotTransferredIntoClientsName.getCodeName().get(), WithdrawalByTransferNotTransferredIntoClientsName);
		codesByName.put(WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName.getCodeName().get(), WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName);
		codesByName.put(PositionReinstatedCertificatesIssuedAndOutstanding.getCodeName().get(), PositionReinstatedCertificatesIssuedAndOutstanding);
		codesByName.put(ReversalOfWithdrawalByTransfer.getCodeName().get(), ReversalOfWithdrawalByTransfer);
		codesByName.put(WithholdingTaxAdjustmentInUserDefinedCountry.getCodeName().get(), WithholdingTaxAdjustmentInUserDefinedCountry);
		codesByName.put(UnfavourableRateMerger.getCodeName().get(), UnfavourableRateMerger);
		codesByName.put(FractionalRights.getCodeName().get(), FractionalRights);
		codesByName.put(DWACAdjustment.getCodeName().get(), DWACAdjustment);
		codesByName.put(ForeignCashDividendUnfavourableRate.getCodeName().get(), ForeignCashDividendUnfavourableRate);
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

	public static DTCAdjustmentPaymentSubReasonV2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentSubReasonV2Code[] values() {
		DTCAdjustmentPaymentSubReasonV2Code[] values = new DTCAdjustmentPaymentSubReasonV2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentSubReasonV2Code> {
		@Override
		public DTCAdjustmentPaymentSubReasonV2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentSubReasonV2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}