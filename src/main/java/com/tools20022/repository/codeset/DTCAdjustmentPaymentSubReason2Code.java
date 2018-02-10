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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AccrualClaimPayment
 * DTCAdjustmentPaymentSubReason2Code.AccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AccruedInterestNotPaid
 * DTCAdjustmentPaymentSubReason2Code.AccruedInterestNotPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AccruedInterestWrongRate
 * DTCAdjustmentPaymentSubReason2Code.AccruedInterestWrongRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AdditionalRightsForBeneficialOwner
 * DTCAdjustmentPaymentSubReason2Code.AdditionalRightsForBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AllocationAdjustmentDueToFractionsRoundedUpByAgent
 * DTCAdjustmentPaymentSubReason2Code.
 * AllocationAdjustmentDueToFractionsRoundedUpByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AllocationOfDRPTEDSInstruction
 * DTCAdjustmentPaymentSubReason2Code.AllocationOfDRPTEDSInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AssumedByYourGoodselves
 * DTCAdjustmentPaymentSubReason2Code.AssumedByYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AvoidFiscalPayment
 * DTCAdjustmentPaymentSubReason2Code.AvoidFiscalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CalledCertificatesAccruedErroneousInterestChargeBack
 * DTCAdjustmentPaymentSubReason2Code.
 * CalledCertificatesAccruedErroneousInterestChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CalledCertificatesCheckInParticipantsNameChargeBack
 * DTCAdjustmentPaymentSubReason2Code.
 * CalledCertificatesCheckInParticipantsNameChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CashDueOnDRPShareAllocation
 * DTCAdjustmentPaymentSubReason2Code.CashDueOnDRPShareAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CashDueOnStockDividend
 * DTCAdjustmentPaymentSubReason2Code.CashDueOnStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CashInLieuOfFractionalShares
 * DTCAdjustmentPaymentSubReason2Code.CashInLieuOfFractionalShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CashOnIncreasedShares
 * DTCAdjustmentPaymentSubReason2Code.CashOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ChargeInLieuOfReceiptOfDividendReinvestment
 * DTCAdjustmentPaymentSubReason2Code.
 * ChargeInLieuOfReceiptOfDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AnnouncementDeletedOrFailTracking
 * DTCAdjustmentPaymentSubReason2Code.AnnouncementDeletedOrFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AllocationOfBabyBondsAmountToBeExited
 * DTCAdjustmentPaymentSubReason2Code.AllocationOfBabyBondsAmountToBeExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AllocationAdjustment
 * DTCAdjustmentPaymentSubReason2Code.AllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AgentPaidBasedOnCombinedFractions
 * DTCAdjustmentPaymentSubReason2Code.AgentPaidBasedOnCombinedFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#AdjustmentToYourDividendReinvestmentPosition
 * DTCAdjustmentPaymentSubReason2Code.
 * AdjustmentToYourDividendReinvestmentPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#BabyBondPayment
 * DTCAdjustmentPaymentSubReason2Code.BabyBondPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CashDueOnAccruedStockPayment
 * DTCAdjustmentPaymentSubReason2Code.CashDueOnAccruedStockPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ChangeInRecordDate
 * DTCAdjustmentPaymentSubReason2Code.ChangeInRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ChargeAtWithholdingRate
 * DTCAdjustmentPaymentSubReason2Code.ChargeAtWithholdingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ChargeForFrenchAvoidFiscalTaxCredit
 * DTCAdjustmentPaymentSubReason2Code.ChargeForFrenchAvoidFiscalTaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CODBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.CODBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CODWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.CODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CODWithdrawalNotDeliveredInNameOfGoodselves
 * DTCAdjustmentPaymentSubReason2Code.
 * CODWithdrawalNotDeliveredInNameOfGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CODWithdrawalNotDeliveredInNameOfNominee
 * DTCAdjustmentPaymentSubReason2Code.CODWithdrawalNotDeliveredInNameOfNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CompanyDidNotDeclareDividend
 * DTCAdjustmentPaymentSubReason2Code.CompanyDidNotDeclareDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CompanyInDefault
 * DTCAdjustmentPaymentSubReason2Code.CompanyInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CouponCollectionService
 * DTCAdjustmentPaymentSubReason2Code.CouponCollectionService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CustodyPayment
 * DTCAdjustmentPaymentSubReason2Code.CustodyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DeliverOrder
 * DTCAdjustmentPaymentSubReason2Code.DeliverOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DepositAdjustment
 * DTCAdjustmentPaymentSubReason2Code.DepositAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DividendReinvestmentAllocation
 * DTCAdjustmentPaymentSubReason2Code.DividendReinvestmentAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DateRevision
 * DTCAdjustmentPaymentSubReason2Code.DateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#Delete
 * DTCAdjustmentPaymentSubReason2Code.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DeliverOrderActivity
 * DTCAdjustmentPaymentSubReason2Code.DeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DepositLostCertificateRegisteredInNameOfYour
 * DTCAdjustmentPaymentSubReason2Code.
 * DepositLostCertificateRegisteredInNameOfYour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DepositTransferredIntoNameOfCEDEAndCo
 * DTCAdjustmentPaymentSubReason2Code.DepositTransferredIntoNameOfCEDEAndCo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DividendReinvestmentAllocationAdjustment
 * DTCAdjustmentPaymentSubReason2Code.DividendReinvestmentAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DividendReinvestmentAllocationOfCashInLieuOfFractions
 * DTCAdjustmentPaymentSubReason2Code.
 * DividendReinvestmentAllocationOfCashInLieuOfFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#CTFSHeldOverRecordDate
 * DTCAdjustmentPaymentSubReason2Code.CTFSHeldOverRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimInTheNameOfYourCustomerLateTransfer
 * DTCAdjustmentPaymentSubReason2Code.
 * DTCCClaimInTheNameOfYourCustomerLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimInTheNameOfYourNomineeLateTransfer
 * DTCAdjustmentPaymentSubReason2Code.
 * DTCCClaimInTheNameOfYourNomineeLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReason2Code.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DueBill
 * DTCAdjustmentPaymentSubReason2Code.DueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DueBillFailTracking
 * DTCAdjustmentPaymentSubReason2Code.DueBillFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DueBillReversal
 * DTCAdjustmentPaymentSubReason2Code.DueBillReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DWACAdjustment
 * DTCAdjustmentPaymentSubReason2Code.DWACAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate
 * DTCAdjustmentPaymentSubReason2Code.
 * ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#FrenchWithholdingTax10Percent
 * DTCAdjustmentPaymentSubReason2Code.FrenchWithholdingTax10Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate
 * DTCAdjustmentPaymentSubReason2Code.
 * ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ForeignCashDividendsOrBondInterestAllocationAtExemptRate
 * DTCAdjustmentPaymentSubReason2Code.
 * ForeignCashDividendsOrBondInterestAllocationAtExemptRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DWACBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.DWACBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason2Code.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#DTCCClaimInTheNameOfYourGoodselvesLateTransfer
 * DTCAdjustmentPaymentSubReason2Code.
 * DTCCClaimInTheNameOfYourGoodselvesLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ForeignCashDividendUnfavourableRate
 * DTCAdjustmentPaymentSubReason2Code.ForeignCashDividendUnfavourableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#FractionalRights
 * DTCAdjustmentPaymentSubReason2Code.FractionalRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#FrenchWithholdingTax15Percent
 * DTCAdjustmentPaymentSubReason2Code.FrenchWithholdingTax15Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#FrenchWithholdingTax25Percent
 * DTCAdjustmentPaymentSubReason2Code.FrenchWithholdingTax25Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#FrozenLetterMovement
 * DTCAdjustmentPaymentSubReason2Code.FrozenLetterMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#GracePeriod
 * DTCAdjustmentPaymentSubReason2Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InLieuOfReorganisationDepositActivity
 * DTCAdjustmentPaymentSubReason2Code.InLieuOfReorganisationDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InResponseToYourInquiry
 * DTCAdjustmentPaymentSubReason2Code.InResponseToYourInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InSettlementOfTradeDTCCReorganisationAccount
 * DTCAdjustmentPaymentSubReason2Code.
 * InSettlementOfTradeDTCCReorganisationAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestAdjustedDueToEarlyWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.InterestAdjustedDueToEarlyWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestAllocatedInError
 * DTCAdjustmentPaymentSubReason2Code.InterestAllocatedInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestDueWasErroneouslyPaidToYouByIssuer
 * DTCAdjustmentPaymentSubReason2Code.InterestDueWasErroneouslyPaidToYouByIssuer
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestorDividendDueOnConversion
 * DTCAdjustmentPaymentSubReason2Code.InterestorDividendDueOnConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestOrDividendDueOnMerger
 * DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestOrDividendDueOnRedemption
 * DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestOrDividendDueOnRepaymentOption
 * DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnRepaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestOrDividendDueOnTender
 * DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterestPaysAtMaturity
 * DTCAdjustmentPaymentSubReason2Code.InterestPaysAtMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InterimPositionAdjustedForDeliverOrderActivity
 * DTCAdjustmentPaymentSubReason2Code.
 * InterimPositionAdjustedForDeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#InvestmentIdentificationAdjustment
 * DTCAdjustmentPaymentSubReason2Code.InvestmentIdentificationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#IssueInDefault
 * DTCAdjustmentPaymentSubReason2Code.IssueInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#LateAnnouncement
 * DTCAdjustmentPaymentSubReason2Code.LateAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#LateAnnouncementActivityDueBillActivity
 * DTCAdjustmentPaymentSubReason2Code.LateAnnouncementActivityDueBillActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#LostCertificateRegisteredInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason2Code.
 * LostCertificateRegisteredInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#LostCertificateWasRegisteredInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReason2Code.
 * LostCertificateWasRegisteredInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#LostCertificateWasRegisteredInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReason2Code.
 * LostCertificateWasRegisteredInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MidwestDepository
 * DTCAdjustmentPaymentSubReason2Code.MidwestDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBond
 * DTCAdjustmentPaymentSubReason2Code.MuniBearerBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBondCoupon
 * DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn
 * DTCAdjustmentPaymentSubReason2Code.
 * MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#NonAllocation
 * DTCAdjustmentPaymentSubReason2Code.NonAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#OptionalDividendAllocationAdjustment
 * DTCAdjustmentPaymentSubReason2Code.OptionalDividendAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PartClaimPayment
 * DTCAdjustmentPaymentSubReason2Code.PartClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PledgeReleaseAdjustment
 * DTCAdjustmentPaymentSubReason2Code.PledgeReleaseAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReason2Code.PositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PositionReinstatedCertificatesIssuedAndOutstanding
 * DTCAdjustmentPaymentSubReason2Code.
 * PositionReinstatedCertificatesIssuedAndOutstanding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#Other
 * DTCAdjustmentPaymentSubReason2Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PacificDepository
 * DTCAdjustmentPaymentSubReason2Code.PacificDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PaymentOfFullAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReason2Code.PaymentOfFullAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PaymentOfPartialAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReason2Code.PaymentOfPartialAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PhiladelphiaDepository
 * DTCAdjustmentPaymentSubReason2Code.PhiladelphiaDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PledgeAdjustment
 * DTCAdjustmentPaymentSubReason2Code.PledgeAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PostDateChangeForFailTracking
 * DTCAdjustmentPaymentSubReason2Code.PostDateChangeForFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PartClaimReversal
 * DTCAdjustmentPaymentSubReason2Code.PartClaimReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBondCouponPositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReason2Code.
 * MuniBearerBondCouponPositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBondCouponAdjustmentExcessCouponsDeposited
 * DTCAdjustmentPaymentSubReason2Code.
 * MuniBearerBondCouponAdjustmentExcessCouponsDeposited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.
 * MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit
 * DTCAdjustmentPaymentSubReason2Code.
 * MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PaynInKindDistribution
 * DTCAdjustmentPaymentSubReason2Code.PaynInKindDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PreviouslyCalledCertificatesFundsDelivery
 * DTCAdjustmentPaymentSubReason2Code.PreviouslyCalledCertificatesFundsDelivery}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#PriceCorrectionDividendReinvestment
 * DTCAdjustmentPaymentSubReason2Code.PriceCorrectionDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ProceedsFromSaleOf
 * DTCAdjustmentPaymentSubReason2Code.ProceedsFromSaleOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ProceedsFromBuyTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReason2Code.
 * ProceedsFromBuyTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ProceedsFromSellTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReason2Code.
 * ProceedsFromSellTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RateChange
 * DTCAdjustmentPaymentSubReason2Code.RateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RateRevision
 * DTCAdjustmentPaymentSubReason2Code.RateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RateUnknown
 * DTCAdjustmentPaymentSubReason2Code.RateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RecordDatePositionAdjustedForWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReason2Code.
 * RecordDatePositionAdjustedForWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RedemptionAdjustment
 * DTCAdjustmentPaymentSubReason2Code.RedemptionAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RedemptionPaymentDueToPledgeRelease
 * DTCAdjustmentPaymentSubReason2Code.RedemptionPaymentDueToPledgeRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RefundedTaxRate
 * DTCAdjustmentPaymentSubReason2Code.RefundedTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RefundOfFrenchTaxJuly
 * DTCAdjustmentPaymentSubReason2Code.RefundOfFrenchTaxJuly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RefundOfFrenchTaxJune
 * DTCAdjustmentPaymentSubReason2Code.RefundOfFrenchTaxJune}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#Reinstate
 * DTCAdjustmentPaymentSubReason2Code.Reinstate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReorganisationAdjustment
 * DTCAdjustmentPaymentSubReason2Code.ReorganisationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReorganisationRelatedAdjustment
 * DTCAdjustmentPaymentSubReason2Code.ReorganisationRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RepPaymentCharge
 * DTCAdjustmentPaymentSubReason2Code.RepPaymentCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RedemptionCash
 * DTCAdjustmentPaymentSubReason2Code.RedemptionCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReversalOfAccrualClaimPayment
 * DTCAdjustmentPaymentSubReason2Code.ReversalOfAccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReversalOfCODWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.ReversalOfCODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReversalOfDeposit
 * DTCAdjustmentPaymentSubReason2Code.ReversalOfDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ScriptSharesExited
 * DTCAdjustmentPaymentSubReason2Code.ScriptSharesExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ShareAdjustmentFromBuyTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReason2Code.
 * ShareAdjustmentFromBuyTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ShareAdjustmentFromSellTransactionInDividendTradingAccount
 * DTCAdjustmentPaymentSubReason2Code.
 * ShareAdjustmentFromSellTransactionInDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#SpinOffAllocation
 * DTCAdjustmentPaymentSubReason2Code.SpinOffAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#StockLoanAdjustment
 * DTCAdjustmentPaymentSubReason2Code.StockLoanAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#StockLoanOrRepoPaymentOrder
 * DTCAdjustmentPaymentSubReason2Code.StockLoanOrRepoPaymentOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#SupplementalInterimActivityFromMidwest
 * DTCAdjustmentPaymentSubReason2Code.SupplementalInterimActivityFromMidwest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#SupplementaryInterimOn
 * DTCAdjustmentPaymentSubReason2Code.SupplementaryInterimOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#SupplementalInterimActivityFromPhiladelphia
 * DTCAdjustmentPaymentSubReason2Code.
 * SupplementalInterimActivityFromPhiladelphia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#SupplementalInterimActivity
 * DTCAdjustmentPaymentSubReason2Code.SupplementalInterimActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#RevisionOfChargeForWithholdingTax
 * DTCAdjustmentPaymentSubReason2Code.RevisionOfChargeForWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReverseOfSharesEscheatedToNYStateInError
 * DTCAdjustmentPaymentSubReason2Code.ReverseOfSharesEscheatedToNYStateInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReverseOfEscheatedAmountOfClaim
 * DTCAdjustmentPaymentSubReason2Code.ReverseOfEscheatedAmountOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#ReversalOfWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReason2Code.ReversalOfWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#TaxExemptInstructions
 * DTCAdjustmentPaymentSubReason2Code.TaxExemptInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#TenderFeeDeduction
 * DTCAdjustmentPaymentSubReason2Code.TenderFeeDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#UnfavourableRateMerger
 * DTCAdjustmentPaymentSubReason2Code.UnfavourableRateMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#UninsuredInterestWithheld
 * DTCAdjustmentPaymentSubReason2Code.UninsuredInterestWithheld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#VodaphoneADR
 * DTCAdjustmentPaymentSubReason2Code.VodaphoneADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WithdrawalByTransferNotTransferredIntoClientsName
 * DTCAdjustmentPaymentSubReason2Code.
 * WithdrawalByTransferNotTransferredIntoClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName
 * DTCAdjustmentPaymentSubReason2Code.
 * WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WithdrawalTransferAdjustment
 * DTCAdjustmentPaymentSubReason2Code.WithdrawalTransferAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WithdrawalTransferBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReason2Code.WithdrawalTransferBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WithholdingTaxAdjustmentInUserDefinedCountry
 * DTCAdjustmentPaymentSubReason2Code.
 * WithholdingTaxAdjustmentInUserDefinedCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WrittenInquiry
 * DTCAdjustmentPaymentSubReason2Code.WrittenInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WriteOffReorganisation
 * DTCAdjustmentPaymentSubReason2Code.WriteOffReorganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code#WrongRatePrincipal
 * DTCAdjustmentPaymentSubReason2Code.WrongRatePrincipal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonV2Code
 * DTCAdjustmentPaymentSubReasonV2Code}</li>
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
 * "DTCAdjustmentPaymentSubReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the subtype of the payment adjustment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentSubReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccrualClaimPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AccrualClaimPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccrualClaimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AccrualClaimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestNotPaid"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AccruedInterestNotPaid = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestNotPaid";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AccruedInterestNotPaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestWrongRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AccruedInterestWrongRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestWrongRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AccruedInterestWrongRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightsForBeneficialOwner"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AdditionalRightsForBeneficialOwner = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightsForBeneficialOwner";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AdditionalRightsForBeneficialOwner.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustmentDueToFractionsRoundedUpByAgent"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AllocationAdjustmentDueToFractionsRoundedUpByAgent = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustmentDueToFractionsRoundedUpByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AllocationAdjustmentDueToFractionsRoundedUpByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfDRPTEDSInstruction"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AllocationOfDRPTEDSInstruction = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfDRPTEDSInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AllocationOfDRPTEDSInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssumedByYourGoodselves"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AssumedByYourGoodselves = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssumedByYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AssumedByYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AvoidFiscalPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AvoidFiscalPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AvoidFiscalPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AvoidFiscalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesAccruedErroneousInterestChargeBack"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CalledCertificatesAccruedErroneousInterestChargeBack = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesAccruedErroneousInterestChargeBack";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CalledCertificatesAccruedErroneousInterestChargeBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesCheckInParticipantsNameChargeBack"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CalledCertificatesCheckInParticipantsNameChargeBack = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesCheckInParticipantsNameChargeBack";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CalledCertificatesCheckInParticipantsNameChargeBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnDRPShareAllocation"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CashDueOnDRPShareAllocation = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnDRPShareAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CashDueOnDRPShareAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnStockDividend"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CashDueOnStockDividend = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnStockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CashDueOnStockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfFractionalShares"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CashInLieuOfFractionalShares = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashInLieuOfFractionalShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CashInLieuOfFractionalShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashOnIncreasedShares"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CashOnIncreasedShares = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashOnIncreasedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CashOnIncreasedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeInLieuOfReceiptOfDividendReinvestment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ChargeInLieuOfReceiptOfDividendReinvestment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeInLieuOfReceiptOfDividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ChargeInLieuOfReceiptOfDividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDeletedOrFailTracking"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AnnouncementDeletedOrFailTracking = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDeletedOrFailTracking";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AnnouncementDeletedOrFailTracking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfBabyBondsAmountToBeExited"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AllocationOfBabyBondsAmountToBeExited = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfBabyBondsAmountToBeExited";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AllocationOfBabyBondsAmountToBeExited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AllocationAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AllocationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentPaidBasedOnCombinedFractions"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AgentPaidBasedOnCombinedFractions = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentPaidBasedOnCombinedFractions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AgentPaidBasedOnCombinedFractions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentToYourDividendReinvestmentPosition"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code AdjustmentToYourDividendReinvestmentPosition = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToYourDividendReinvestmentPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.AdjustmentToYourDividendReinvestmentPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BabyBondPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code BabyBondPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.BabyBondPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnAccruedStockPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CashDueOnAccruedStockPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnAccruedStockPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CashDueOnAccruedStockPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInRecordDate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ChangeInRecordDate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInRecordDate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ChangeInRecordDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeAtWithholdingRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ChargeAtWithholdingRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAtWithholdingRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ChargeAtWithholdingRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeForFrenchAvoidFiscalTaxCredit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ChargeForFrenchAvoidFiscalTaxCredit = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeForFrenchAvoidFiscalTaxCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ChargeForFrenchAvoidFiscalTaxCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODBuyBackWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CODBuyBackWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODBuyBackWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CODBuyBackWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CODWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawalNotDeliveredInNameOfGoodselves"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CODWithdrawalNotDeliveredInNameOfGoodselves = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredInNameOfGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawalNotDeliveredInNameOfGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawalNotDeliveredInNameOfNominee"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CODWithdrawalNotDeliveredInNameOfNominee = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredInNameOfNominee";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CODWithdrawalNotDeliveredInNameOfNominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyDidNotDeclareDividend"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CompanyDidNotDeclareDividend = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyDidNotDeclareDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CompanyDidNotDeclareDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyInDefault"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CompanyInDefault = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyInDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CompanyInDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponCollectionService"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CouponCollectionService = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponCollectionService";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CouponCollectionService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CustodyPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CustodyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrder"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DeliverOrder = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DeliverOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DepositAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DepositAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocation"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DividendReinvestmentAllocation = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateRevision"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DateRevision = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRevision";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DateRevision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code Delete = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.Delete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrderActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DeliverOrderActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrderActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DeliverOrderActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositLostCertificateRegisteredInNameOfYour"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DepositLostCertificateRegisteredInNameOfYour = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLostCertificateRegisteredInNameOfYour";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DepositLostCertificateRegisteredInNameOfYour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositTransferredIntoNameOfCEDEAndCo"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DepositTransferredIntoNameOfCEDEAndCo = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositTransferredIntoNameOfCEDEAndCo";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DepositTransferredIntoNameOfCEDEAndCo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocationAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DividendReinvestmentAllocationAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocationOfCashInLieuOfFractions"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DividendReinvestmentAllocationOfCashInLieuOfFractions = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationOfCashInLieuOfFractions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DividendReinvestmentAllocationOfCashInLieuOfFractions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CTFSHeldOverRecordDate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code CTFSHeldOverRecordDate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTFSHeldOverRecordDate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.CTFSHeldOverRecordDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourCustomer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourCustomerLateTransfer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimInTheNameOfYourCustomerLateTransfer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourCustomerLateTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourCustomerLateTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourGoodselves"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourNominee"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourNominee";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourNominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourNomineeLateTransfer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimInTheNameOfYourNomineeLateTransfer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourNomineeLateTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourNomineeLateTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBill"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DueBill = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBill";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DueBill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillFailTracking"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DueBillFailTracking = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillFailTracking";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DueBillFailTracking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillReversal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DueBillReversal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillReversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DueBillReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DWACAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DWACAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax10Percent"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code FrenchWithholdingTax10Percent = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax10Percent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax10Percent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ForeignCashDividendsOrBondInterestAllocationAtExemptRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendsOrBondInterestAllocationAtExemptRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACBuyBackWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DWACBuyBackWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACBuyBackWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DWACBuyBackWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimInTheNameOfYourGoodselvesLateTransfer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code DTCCClaimInTheNameOfYourGoodselvesLateTransfer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimInTheNameOfYourGoodselvesLateTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.DTCCClaimInTheNameOfYourGoodselvesLateTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendUnfavourableRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ForeignCashDividendUnfavourableRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendUnfavourableRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ForeignCashDividendUnfavourableRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalRights"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code FractionalRights = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalRights";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.FractionalRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax15Percent"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code FrenchWithholdingTax15Percent = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax15Percent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax15Percent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax25Percent"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code FrenchWithholdingTax25Percent = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax25Percent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.FrenchWithholdingTax25Percent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrozenLetterMovement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code FrozenLetterMovement = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrozenLetterMovement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.FrozenLetterMovement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code GracePeriod = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.GracePeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InLieuOfReorganisationDepositActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InLieuOfReorganisationDepositActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InLieuOfReorganisationDepositActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InLieuOfReorganisationDepositActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InResponseToYourInquiry"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InResponseToYourInquiry = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InResponseToYourInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InResponseToYourInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSettlementOfTradeDTCCReorganisationAccount"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InSettlementOfTradeDTCCReorganisationAccount = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSettlementOfTradeDTCCReorganisationAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InSettlementOfTradeDTCCReorganisationAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAdjustedDueToEarlyWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestAdjustedDueToEarlyWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAdjustedDueToEarlyWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestAdjustedDueToEarlyWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAllocatedInError"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestAllocatedInError = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAllocatedInError";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestAllocatedInError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueWasErroneouslyPaidToYouByIssuer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestDueWasErroneouslyPaidToYouByIssuer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueWasErroneouslyPaidToYouByIssuer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestDueWasErroneouslyPaidToYouByIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestorDividendDueOnConversion"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestorDividendDueOnConversion = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestorDividendDueOnConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestorDividendDueOnConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnMerger"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestOrDividendDueOnMerger = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnMerger";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnMerger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRedemption"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestOrDividendDueOnRedemption = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRepaymentOption"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestOrDividendDueOnRepaymentOption = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRepaymentOption";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnRepaymentOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnTender"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestOrDividendDueOnTender = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnTender";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestOrDividendDueOnTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaysAtMaturity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterestPaysAtMaturity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaysAtMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterestPaysAtMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimPositionAdjustedForDeliverOrderActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InterimPositionAdjustedForDeliverOrderActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPositionAdjustedForDeliverOrderActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InterimPositionAdjustedForDeliverOrderActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentIdentificationAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code InvestmentIdentificationAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentIdentificationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.InvestmentIdentificationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueInDefault"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code IssueInDefault = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueInDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.IssueInDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncement"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code LateAnnouncement = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.LateAnnouncement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncementActivityDueBillActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code LateAnnouncementActivityDueBillActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementActivityDueBillActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.LateAnnouncementActivityDueBillActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateRegisteredInTheNameOfYourGoodselves"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code LostCertificateRegisteredInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateRegisteredInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.LostCertificateRegisteredInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourCustomer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code LostCertificateWasRegisteredInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.LostCertificateWasRegisteredInTheNameOfYourCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourNominee"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code LostCertificateWasRegisteredInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourNominee";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.LostCertificateWasRegisteredInTheNameOfYourNominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidwestDepository"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MidwestDepository = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidwestDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MidwestDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBond"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBond = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCoupon"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBondCoupon = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonAllocation"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code NonAllocation = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.NonAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividendAllocationAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code OptionalDividendAllocationAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendAllocationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.OptionalDividendAllocationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PartClaimPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PartClaimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeReleaseAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PledgeReleaseAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeReleaseAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PledgeReleaseAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAdjustedForDepositActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAdjustedForDepositActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PositionAdjustedForDepositActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionReinstatedCertificatesIssuedAndOutstanding"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PositionReinstatedCertificatesIssuedAndOutstanding = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionReinstatedCertificatesIssuedAndOutstanding";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PositionReinstatedCertificatesIssuedAndOutstanding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code Other = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PacificDepository"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PacificDepository = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PacificDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PacificDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfFullAvoidFiscalTaxRefund"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PaymentOfFullAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfFullAvoidFiscalTaxRefund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PaymentOfFullAvoidFiscalTaxRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfPartialAvoidFiscalTaxRefund"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PaymentOfPartialAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfPartialAvoidFiscalTaxRefund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PaymentOfPartialAvoidFiscalTaxRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhiladelphiaDepository"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PhiladelphiaDepository = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhiladelphiaDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PhiladelphiaDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PledgeAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PledgeAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostDateChangeForFailTracking"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PostDateChangeForFailTracking = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostDateChangeForFailTracking";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PostDateChangeForFailTracking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimReversal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PartClaimReversal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimReversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PartClaimReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponPositionAdjustedForDepositActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBondCouponPositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponPositionAdjustedForDepositActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponPositionAdjustedForDepositActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsDeposited"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBondCouponAdjustmentExcessCouponsDeposited = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsDeposited";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentExcessCouponsDeposited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaynInKindDistribution"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PaynInKindDistribution = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaynInKindDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PaynInKindDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyCalledCertificatesFundsDelivery"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PreviouslyCalledCertificatesFundsDelivery = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCalledCertificatesFundsDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PreviouslyCalledCertificatesFundsDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCorrectionDividendReinvestment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code PriceCorrectionDividendReinvestment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionDividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.PriceCorrectionDividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromSaleOf"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ProceedsFromSaleOf = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSaleOf";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromSaleOf.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromBuyTransactionInDividendTradingAccount"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ProceedsFromBuyTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromBuyTransactionInDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromBuyTransactionInDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromSellTransactionInDividendTradingAccount"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ProceedsFromSellTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSellTransactionInDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ProceedsFromSellTransactionInDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChange"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RateChange = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RateChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateRevision"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RateRevision = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateRevision";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RateRevision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateUnknown"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RateUnknown = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RateUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDatePositionAdjustedForWithdrawalByTransfer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RecordDatePositionAdjustedForWithdrawalByTransfer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDatePositionAdjustedForWithdrawalByTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RecordDatePositionAdjustedForWithdrawalByTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RedemptionAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RedemptionAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentDueToPledgeRelease"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RedemptionPaymentDueToPledgeRelease = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentDueToPledgeRelease";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RedemptionPaymentDueToPledgeRelease.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedTaxRate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RefundedTaxRate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedTaxRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RefundedTaxRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJuly"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RefundOfFrenchTaxJuly = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJuly";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RefundOfFrenchTaxJuly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJune"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RefundOfFrenchTaxJune = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJune";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RefundOfFrenchTaxJune.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinstate"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code Reinstate = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinstate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.Reinstate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReorganisationAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReorganisationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganisationRelatedAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReorganisationRelatedAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganisationRelatedAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReorganisationRelatedAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepPaymentCharge"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RepPaymentCharge = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepPaymentCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RepPaymentCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionCash"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RedemptionCash = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCash";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RedemptionCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfAccrualClaimPayment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReversalOfAccrualClaimPayment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfAccrualClaimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReversalOfAccrualClaimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfCODWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReversalOfCODWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfCODWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReversalOfCODWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfDeposit"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReversalOfDeposit = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReversalOfDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScriptSharesExited"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ScriptSharesExited = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScriptSharesExited";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ScriptSharesExited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareAdjustmentFromBuyTransactionInDividendTradingAccount"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ShareAdjustmentFromBuyTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromBuyTransactionInDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ShareAdjustmentFromBuyTransactionInDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareAdjustmentFromSellTransactionInDividendTradingAccount"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ShareAdjustmentFromSellTransactionInDividendTradingAccount = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromSellTransactionInDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ShareAdjustmentFromSellTransactionInDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOffAllocation"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code SpinOffAllocation = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOffAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.SpinOffAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code StockLoanAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.StockLoanAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanOrRepoPaymentOrder"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code StockLoanOrRepoPaymentOrder = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanOrRepoPaymentOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.StockLoanOrRepoPaymentOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromMidwest"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code SupplementalInterimActivityFromMidwest = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromMidwest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivityFromMidwest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryInterimOn"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code SupplementaryInterimOn = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryInterimOn";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.SupplementaryInterimOn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromPhiladelphia"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code SupplementalInterimActivityFromPhiladelphia = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromPhiladelphia";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivityFromPhiladelphia.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivity"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code SupplementalInterimActivity = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.SupplementalInterimActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevisionOfChargeForWithholdingTax"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code RevisionOfChargeForWithholdingTax = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevisionOfChargeForWithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.RevisionOfChargeForWithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfSharesEscheatedToNYStateInError"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReverseOfSharesEscheatedToNYStateInError = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfSharesEscheatedToNYStateInError";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReverseOfSharesEscheatedToNYStateInError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfEscheatedAmountOfClaim"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReverseOfEscheatedAmountOfClaim = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfEscheatedAmountOfClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReverseOfEscheatedAmountOfClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfWithdrawalByTransfer"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code ReversalOfWithdrawalByTransfer = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfWithdrawalByTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.ReversalOfWithdrawalByTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptInstructions"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code TaxExemptInstructions = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptInstructions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.TaxExemptInstructions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderFeeDeduction"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code TenderFeeDeduction = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderFeeDeduction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.TenderFeeDeduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfavourableRateMerger"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code UnfavourableRateMerger = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfavourableRateMerger";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.UnfavourableRateMerger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninsuredInterestWithheld"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code UninsuredInterestWithheld = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninsuredInterestWithheld";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.UninsuredInterestWithheld.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VodaphoneADR"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code VodaphoneADR = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VodaphoneADR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.VodaphoneADR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalByTransferNotTransferredIntoClientsName"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WithdrawalByTransferNotTransferredIntoClientsName = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalByTransferNotTransferredIntoClientsName";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WithdrawalByTransferNotTransferredIntoClientsName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName"
	 * </li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferAdjustment"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WithdrawalTransferAdjustment = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WithdrawalTransferAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferBuyBackWithdrawal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WithdrawalTransferBuyBackWithdrawal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferBuyBackWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WithdrawalTransferBuyBackWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAdjustmentInUserDefinedCountry"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WithholdingTaxAdjustmentInUserDefinedCountry = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAdjustmentInUserDefinedCountry";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WithholdingTaxAdjustmentInUserDefinedCountry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrittenInquiry"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WrittenInquiry = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrittenInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WrittenInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WriteOffReorganisation"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WriteOffReorganisation = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WriteOffReorganisation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WriteOffReorganisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code
	 * DTCAdjustmentPaymentSubReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRatePrincipal"</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason2Code WrongRatePrincipal = new DTCAdjustmentPaymentSubReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRatePrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonV2Code.WrongRatePrincipal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentSubReason2Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentSubReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentSubReason2Code";
				definition = "Specifies the subtype of the payment adjustment.";
				trace_lazy = () -> DTCAdjustmentPaymentSubReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AccruedInterestNotPaid,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AccruedInterestWrongRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AdditionalRightsForBeneficialOwner,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AllocationAdjustmentDueToFractionsRoundedUpByAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AllocationOfDRPTEDSInstruction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AssumedByYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AvoidFiscalPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CalledCertificatesAccruedErroneousInterestChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CalledCertificatesCheckInParticipantsNameChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CashDueOnDRPShareAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CashDueOnStockDividend,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CashInLieuOfFractionalShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CashOnIncreasedShares,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ChargeInLieuOfReceiptOfDividendReinvestment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AnnouncementDeletedOrFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AllocationOfBabyBondsAmountToBeExited,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AllocationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AgentPaidBasedOnCombinedFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.AdjustmentToYourDividendReinvestmentPosition, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.BabyBondPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CashDueOnAccruedStockPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ChangeInRecordDate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ChargeAtWithholdingRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ChargeForFrenchAvoidFiscalTaxCredit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CODBuyBackWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CODWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CODWithdrawalNotDeliveredInNameOfGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CODWithdrawalNotDeliveredInNameOfNominee, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CompanyDidNotDeclareDividend,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CompanyInDefault, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CouponCollectionService,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CustodyPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DeliverOrder,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DepositAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DividendReinvestmentAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DateRevision, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.Delete,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DeliverOrderActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DepositLostCertificateRegisteredInNameOfYour,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DepositTransferredIntoNameOfCEDEAndCo,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DividendReinvestmentAllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DividendReinvestmentAllocationOfCashInLieuOfFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.CTFSHeldOverRecordDate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourCustomerLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourGoodselves, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourNomineeLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DueBill,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DueBillFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DueBillReversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DWACAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.FrenchWithholdingTax10Percent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ForeignCashDividendsOrBondInterestAllocationAtExemptRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DWACBuyBackWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.DTCCClaimInTheNameOfYourGoodselvesLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ForeignCashDividendUnfavourableRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.FractionalRights,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.FrenchWithholdingTax15Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.FrenchWithholdingTax25Percent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.FrozenLetterMovement, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.GracePeriod,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InLieuOfReorganisationDepositActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InResponseToYourInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InSettlementOfTradeDTCCReorganisationAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestAdjustedDueToEarlyWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestAllocatedInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestDueWasErroneouslyPaidToYouByIssuer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestorDividendDueOnConversion, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnMerger,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnRedemption, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnRepaymentOption,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestOrDividendDueOnTender, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterestPaysAtMaturity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InterimPositionAdjustedForDeliverOrderActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.InvestmentIdentificationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.IssueInDefault,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.LateAnnouncement, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.LateAnnouncementActivityDueBillActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.LostCertificateRegisteredInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.LostCertificateWasRegisteredInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.LostCertificateWasRegisteredInTheNameOfYourNominee, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MidwestDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBond, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCoupon,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.NonAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.OptionalDividendAllocationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PartClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PledgeReleaseAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PositionReinstatedCertificatesIssuedAndOutstanding, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.Other,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PacificDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PaymentOfFullAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PaymentOfPartialAvoidFiscalTaxRefund, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PhiladelphiaDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PledgeAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PostDateChangeForFailTracking,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PartClaimReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCouponPositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCouponAdjustmentExcessCouponsDeposited,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PaynInKindDistribution, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PreviouslyCalledCertificatesFundsDelivery,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.PriceCorrectionDividendReinvestment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ProceedsFromSaleOf,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ProceedsFromBuyTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ProceedsFromSellTransactionInDividendTradingAccount, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RateChange,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RateRevision, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RateUnknown,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RecordDatePositionAdjustedForWithdrawalByTransfer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RedemptionAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RedemptionPaymentDueToPledgeRelease, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RefundedTaxRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RefundOfFrenchTaxJuly, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RefundOfFrenchTaxJune,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.Reinstate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReorganisationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReorganisationRelatedAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RepPaymentCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RedemptionCash, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReversalOfAccrualClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReversalOfCODWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReversalOfDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ScriptSharesExited,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ShareAdjustmentFromBuyTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ShareAdjustmentFromSellTransactionInDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.SpinOffAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.StockLoanAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.StockLoanOrRepoPaymentOrder, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.SupplementalInterimActivityFromMidwest,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.SupplementaryInterimOn, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.SupplementalInterimActivityFromPhiladelphia,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.SupplementalInterimActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.RevisionOfChargeForWithholdingTax,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReverseOfSharesEscheatedToNYStateInError, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReverseOfEscheatedAmountOfClaim,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.ReversalOfWithdrawalByTransfer, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.TaxExemptInstructions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.TenderFeeDeduction, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.UnfavourableRateMerger,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.UninsuredInterestWithheld, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.VodaphoneADR,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WithdrawalByTransferNotTransferredIntoClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WithdrawalTransferAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WithdrawalTransferBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WithholdingTaxAdjustmentInUserDefinedCountry, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WrittenInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WriteOffReorganisation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason2Code.WrongRatePrincipal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccrualClaimPayment.getCodeName().get(), AccrualClaimPayment);
		codesByName.put(AccruedInterestNotPaid.getCodeName().get(), AccruedInterestNotPaid);
		codesByName.put(AccruedInterestWrongRate.getCodeName().get(), AccruedInterestWrongRate);
		codesByName.put(AdditionalRightsForBeneficialOwner.getCodeName().get(), AdditionalRightsForBeneficialOwner);
		codesByName.put(AllocationAdjustmentDueToFractionsRoundedUpByAgent.getCodeName().get(), AllocationAdjustmentDueToFractionsRoundedUpByAgent);
		codesByName.put(AllocationOfDRPTEDSInstruction.getCodeName().get(), AllocationOfDRPTEDSInstruction);
		codesByName.put(AssumedByYourGoodselves.getCodeName().get(), AssumedByYourGoodselves);
		codesByName.put(AvoidFiscalPayment.getCodeName().get(), AvoidFiscalPayment);
		codesByName.put(CalledCertificatesAccruedErroneousInterestChargeBack.getCodeName().get(), CalledCertificatesAccruedErroneousInterestChargeBack);
		codesByName.put(CalledCertificatesCheckInParticipantsNameChargeBack.getCodeName().get(), CalledCertificatesCheckInParticipantsNameChargeBack);
		codesByName.put(CashDueOnDRPShareAllocation.getCodeName().get(), CashDueOnDRPShareAllocation);
		codesByName.put(CashDueOnStockDividend.getCodeName().get(), CashDueOnStockDividend);
		codesByName.put(CashInLieuOfFractionalShares.getCodeName().get(), CashInLieuOfFractionalShares);
		codesByName.put(CashOnIncreasedShares.getCodeName().get(), CashOnIncreasedShares);
		codesByName.put(ChargeInLieuOfReceiptOfDividendReinvestment.getCodeName().get(), ChargeInLieuOfReceiptOfDividendReinvestment);
		codesByName.put(AnnouncementDeletedOrFailTracking.getCodeName().get(), AnnouncementDeletedOrFailTracking);
		codesByName.put(AllocationOfBabyBondsAmountToBeExited.getCodeName().get(), AllocationOfBabyBondsAmountToBeExited);
		codesByName.put(AllocationAdjustment.getCodeName().get(), AllocationAdjustment);
		codesByName.put(AgentPaidBasedOnCombinedFractions.getCodeName().get(), AgentPaidBasedOnCombinedFractions);
		codesByName.put(AdjustmentToYourDividendReinvestmentPosition.getCodeName().get(), AdjustmentToYourDividendReinvestmentPosition);
		codesByName.put(BabyBondPayment.getCodeName().get(), BabyBondPayment);
		codesByName.put(CashDueOnAccruedStockPayment.getCodeName().get(), CashDueOnAccruedStockPayment);
		codesByName.put(ChangeInRecordDate.getCodeName().get(), ChangeInRecordDate);
		codesByName.put(ChargeAtWithholdingRate.getCodeName().get(), ChargeAtWithholdingRate);
		codesByName.put(ChargeForFrenchAvoidFiscalTaxCredit.getCodeName().get(), ChargeForFrenchAvoidFiscalTaxCredit);
		codesByName.put(CODBuyBackWithdrawal.getCodeName().get(), CODBuyBackWithdrawal);
		codesByName.put(CODWithdrawal.getCodeName().get(), CODWithdrawal);
		codesByName.put(CODWithdrawalNotDeliveredInNameOfGoodselves.getCodeName().get(), CODWithdrawalNotDeliveredInNameOfGoodselves);
		codesByName.put(CODWithdrawalNotDeliveredInNameOfNominee.getCodeName().get(), CODWithdrawalNotDeliveredInNameOfNominee);
		codesByName.put(CompanyDidNotDeclareDividend.getCodeName().get(), CompanyDidNotDeclareDividend);
		codesByName.put(CompanyInDefault.getCodeName().get(), CompanyInDefault);
		codesByName.put(CouponCollectionService.getCodeName().get(), CouponCollectionService);
		codesByName.put(CustodyPayment.getCodeName().get(), CustodyPayment);
		codesByName.put(DeliverOrder.getCodeName().get(), DeliverOrder);
		codesByName.put(DepositAdjustment.getCodeName().get(), DepositAdjustment);
		codesByName.put(DividendReinvestmentAllocation.getCodeName().get(), DividendReinvestmentAllocation);
		codesByName.put(DateRevision.getCodeName().get(), DateRevision);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(DeliverOrderActivity.getCodeName().get(), DeliverOrderActivity);
		codesByName.put(DepositLostCertificateRegisteredInNameOfYour.getCodeName().get(), DepositLostCertificateRegisteredInNameOfYour);
		codesByName.put(DepositTransferredIntoNameOfCEDEAndCo.getCodeName().get(), DepositTransferredIntoNameOfCEDEAndCo);
		codesByName.put(DividendReinvestmentAllocationAdjustment.getCodeName().get(), DividendReinvestmentAllocationAdjustment);
		codesByName.put(DividendReinvestmentAllocationOfCashInLieuOfFractions.getCodeName().get(), DividendReinvestmentAllocationOfCashInLieuOfFractions);
		codesByName.put(CTFSHeldOverRecordDate.getCodeName().get(), CTFSHeldOverRecordDate);
		codesByName.put(DTCCClaimInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimInTheNameOfYourCustomer);
		codesByName.put(DTCCClaimInTheNameOfYourCustomerLateTransfer.getCodeName().get(), DTCCClaimInTheNameOfYourCustomerLateTransfer);
		codesByName.put(DTCCClaimInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimInTheNameOfYourGoodselves);
		codesByName.put(DTCCClaimInTheNameOfYourNominee.getCodeName().get(), DTCCClaimInTheNameOfYourNominee);
		codesByName.put(DTCCClaimInTheNameOfYourNomineeLateTransfer.getCodeName().get(), DTCCClaimInTheNameOfYourNomineeLateTransfer);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer);
		codesByName.put(DueBill.getCodeName().get(), DueBill);
		codesByName.put(DueBillFailTracking.getCodeName().get(), DueBillFailTracking);
		codesByName.put(DueBillReversal.getCodeName().get(), DueBillReversal);
		codesByName.put(DWACAdjustment.getCodeName().get(), DWACAdjustment);
		codesByName.put(ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate.getCodeName().get(), ForeignCashDividendsOrBondsInterestAllocationAtFavourableRate);
		codesByName.put(FrenchWithholdingTax10Percent.getCodeName().get(), FrenchWithholdingTax10Percent);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtUnfavourableRate);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtExemptRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtExemptRate);
		codesByName.put(DWACBuyBackWithdrawal.getCodeName().get(), DWACBuyBackWithdrawal);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves);
		codesByName.put(DTCCClaimInTheNameOfYourGoodselvesLateTransfer.getCodeName().get(), DTCCClaimInTheNameOfYourGoodselvesLateTransfer);
		codesByName.put(ForeignCashDividendUnfavourableRate.getCodeName().get(), ForeignCashDividendUnfavourableRate);
		codesByName.put(FractionalRights.getCodeName().get(), FractionalRights);
		codesByName.put(FrenchWithholdingTax15Percent.getCodeName().get(), FrenchWithholdingTax15Percent);
		codesByName.put(FrenchWithholdingTax25Percent.getCodeName().get(), FrenchWithholdingTax25Percent);
		codesByName.put(FrozenLetterMovement.getCodeName().get(), FrozenLetterMovement);
		codesByName.put(GracePeriod.getCodeName().get(), GracePeriod);
		codesByName.put(InLieuOfReorganisationDepositActivity.getCodeName().get(), InLieuOfReorganisationDepositActivity);
		codesByName.put(InResponseToYourInquiry.getCodeName().get(), InResponseToYourInquiry);
		codesByName.put(InSettlementOfTradeDTCCReorganisationAccount.getCodeName().get(), InSettlementOfTradeDTCCReorganisationAccount);
		codesByName.put(InterestAdjustedDueToEarlyWithdrawal.getCodeName().get(), InterestAdjustedDueToEarlyWithdrawal);
		codesByName.put(InterestAllocatedInError.getCodeName().get(), InterestAllocatedInError);
		codesByName.put(InterestDueWasErroneouslyPaidToYouByIssuer.getCodeName().get(), InterestDueWasErroneouslyPaidToYouByIssuer);
		codesByName.put(InterestorDividendDueOnConversion.getCodeName().get(), InterestorDividendDueOnConversion);
		codesByName.put(InterestOrDividendDueOnMerger.getCodeName().get(), InterestOrDividendDueOnMerger);
		codesByName.put(InterestOrDividendDueOnRedemption.getCodeName().get(), InterestOrDividendDueOnRedemption);
		codesByName.put(InterestOrDividendDueOnRepaymentOption.getCodeName().get(), InterestOrDividendDueOnRepaymentOption);
		codesByName.put(InterestOrDividendDueOnTender.getCodeName().get(), InterestOrDividendDueOnTender);
		codesByName.put(InterestPaysAtMaturity.getCodeName().get(), InterestPaysAtMaturity);
		codesByName.put(InterimPositionAdjustedForDeliverOrderActivity.getCodeName().get(), InterimPositionAdjustedForDeliverOrderActivity);
		codesByName.put(InvestmentIdentificationAdjustment.getCodeName().get(), InvestmentIdentificationAdjustment);
		codesByName.put(IssueInDefault.getCodeName().get(), IssueInDefault);
		codesByName.put(LateAnnouncement.getCodeName().get(), LateAnnouncement);
		codesByName.put(LateAnnouncementActivityDueBillActivity.getCodeName().get(), LateAnnouncementActivityDueBillActivity);
		codesByName.put(LostCertificateRegisteredInTheNameOfYourGoodselves.getCodeName().get(), LostCertificateRegisteredInTheNameOfYourGoodselves);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourCustomer.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourCustomer);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourNominee.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourNominee);
		codesByName.put(MidwestDepository.getCodeName().get(), MidwestDepository);
		codesByName.put(MuniBearerBond.getCodeName().get(), MuniBearerBond);
		codesByName.put(MuniBearerBondCoupon.getCodeName().get(), MuniBearerBondCoupon);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsWithdrawn);
		codesByName.put(NonAllocation.getCodeName().get(), NonAllocation);
		codesByName.put(OptionalDividendAllocationAdjustment.getCodeName().get(), OptionalDividendAllocationAdjustment);
		codesByName.put(PartClaimPayment.getCodeName().get(), PartClaimPayment);
		codesByName.put(PledgeReleaseAdjustment.getCodeName().get(), PledgeReleaseAdjustment);
		codesByName.put(PositionAdjustedForDepositActivity.getCodeName().get(), PositionAdjustedForDepositActivity);
		codesByName.put(PositionReinstatedCertificatesIssuedAndOutstanding.getCodeName().get(), PositionReinstatedCertificatesIssuedAndOutstanding);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PacificDepository.getCodeName().get(), PacificDepository);
		codesByName.put(PaymentOfFullAvoidFiscalTaxRefund.getCodeName().get(), PaymentOfFullAvoidFiscalTaxRefund);
		codesByName.put(PaymentOfPartialAvoidFiscalTaxRefund.getCodeName().get(), PaymentOfPartialAvoidFiscalTaxRefund);
		codesByName.put(PhiladelphiaDepository.getCodeName().get(), PhiladelphiaDepository);
		codesByName.put(PledgeAdjustment.getCodeName().get(), PledgeAdjustment);
		codesByName.put(PostDateChangeForFailTracking.getCodeName().get(), PostDateChangeForFailTracking);
		codesByName.put(PartClaimReversal.getCodeName().get(), PartClaimReversal);
		codesByName.put(MuniBearerBondCouponPositionAdjustedForDepositActivity.getCodeName().get(), MuniBearerBondCouponPositionAdjustedForDepositActivity);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsDeposited.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsDeposited);
		codesByName.put(MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal.getCodeName().get(), MuniBearerBondCouponAdjustmentCouponsMissingFromWithdrawal);
		codesByName.put(MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit.getCodeName().get(), MuniBearerBondCouponAdjustmentCouponsMissingFromDeposit);
		codesByName.put(PaynInKindDistribution.getCodeName().get(), PaynInKindDistribution);
		codesByName.put(PreviouslyCalledCertificatesFundsDelivery.getCodeName().get(), PreviouslyCalledCertificatesFundsDelivery);
		codesByName.put(PriceCorrectionDividendReinvestment.getCodeName().get(), PriceCorrectionDividendReinvestment);
		codesByName.put(ProceedsFromSaleOf.getCodeName().get(), ProceedsFromSaleOf);
		codesByName.put(ProceedsFromBuyTransactionInDividendTradingAccount.getCodeName().get(), ProceedsFromBuyTransactionInDividendTradingAccount);
		codesByName.put(ProceedsFromSellTransactionInDividendTradingAccount.getCodeName().get(), ProceedsFromSellTransactionInDividendTradingAccount);
		codesByName.put(RateChange.getCodeName().get(), RateChange);
		codesByName.put(RateRevision.getCodeName().get(), RateRevision);
		codesByName.put(RateUnknown.getCodeName().get(), RateUnknown);
		codesByName.put(RecordDatePositionAdjustedForWithdrawalByTransfer.getCodeName().get(), RecordDatePositionAdjustedForWithdrawalByTransfer);
		codesByName.put(RedemptionAdjustment.getCodeName().get(), RedemptionAdjustment);
		codesByName.put(RedemptionPaymentDueToPledgeRelease.getCodeName().get(), RedemptionPaymentDueToPledgeRelease);
		codesByName.put(RefundedTaxRate.getCodeName().get(), RefundedTaxRate);
		codesByName.put(RefundOfFrenchTaxJuly.getCodeName().get(), RefundOfFrenchTaxJuly);
		codesByName.put(RefundOfFrenchTaxJune.getCodeName().get(), RefundOfFrenchTaxJune);
		codesByName.put(Reinstate.getCodeName().get(), Reinstate);
		codesByName.put(ReorganisationAdjustment.getCodeName().get(), ReorganisationAdjustment);
		codesByName.put(ReorganisationRelatedAdjustment.getCodeName().get(), ReorganisationRelatedAdjustment);
		codesByName.put(RepPaymentCharge.getCodeName().get(), RepPaymentCharge);
		codesByName.put(RedemptionCash.getCodeName().get(), RedemptionCash);
		codesByName.put(ReversalOfAccrualClaimPayment.getCodeName().get(), ReversalOfAccrualClaimPayment);
		codesByName.put(ReversalOfCODWithdrawal.getCodeName().get(), ReversalOfCODWithdrawal);
		codesByName.put(ReversalOfDeposit.getCodeName().get(), ReversalOfDeposit);
		codesByName.put(ScriptSharesExited.getCodeName().get(), ScriptSharesExited);
		codesByName.put(ShareAdjustmentFromBuyTransactionInDividendTradingAccount.getCodeName().get(), ShareAdjustmentFromBuyTransactionInDividendTradingAccount);
		codesByName.put(ShareAdjustmentFromSellTransactionInDividendTradingAccount.getCodeName().get(), ShareAdjustmentFromSellTransactionInDividendTradingAccount);
		codesByName.put(SpinOffAllocation.getCodeName().get(), SpinOffAllocation);
		codesByName.put(StockLoanAdjustment.getCodeName().get(), StockLoanAdjustment);
		codesByName.put(StockLoanOrRepoPaymentOrder.getCodeName().get(), StockLoanOrRepoPaymentOrder);
		codesByName.put(SupplementalInterimActivityFromMidwest.getCodeName().get(), SupplementalInterimActivityFromMidwest);
		codesByName.put(SupplementaryInterimOn.getCodeName().get(), SupplementaryInterimOn);
		codesByName.put(SupplementalInterimActivityFromPhiladelphia.getCodeName().get(), SupplementalInterimActivityFromPhiladelphia);
		codesByName.put(SupplementalInterimActivity.getCodeName().get(), SupplementalInterimActivity);
		codesByName.put(RevisionOfChargeForWithholdingTax.getCodeName().get(), RevisionOfChargeForWithholdingTax);
		codesByName.put(ReverseOfSharesEscheatedToNYStateInError.getCodeName().get(), ReverseOfSharesEscheatedToNYStateInError);
		codesByName.put(ReverseOfEscheatedAmountOfClaim.getCodeName().get(), ReverseOfEscheatedAmountOfClaim);
		codesByName.put(ReversalOfWithdrawalByTransfer.getCodeName().get(), ReversalOfWithdrawalByTransfer);
		codesByName.put(TaxExemptInstructions.getCodeName().get(), TaxExemptInstructions);
		codesByName.put(TenderFeeDeduction.getCodeName().get(), TenderFeeDeduction);
		codesByName.put(UnfavourableRateMerger.getCodeName().get(), UnfavourableRateMerger);
		codesByName.put(UninsuredInterestWithheld.getCodeName().get(), UninsuredInterestWithheld);
		codesByName.put(VodaphoneADR.getCodeName().get(), VodaphoneADR);
		codesByName.put(WithdrawalByTransferNotTransferredIntoClientsName.getCodeName().get(), WithdrawalByTransferNotTransferredIntoClientsName);
		codesByName.put(WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName.getCodeName().get(), WithdrawalByTransferSetUpAfterCutOffDateTransferIntoClientsName);
		codesByName.put(WithdrawalTransferAdjustment.getCodeName().get(), WithdrawalTransferAdjustment);
		codesByName.put(WithdrawalTransferBuyBackWithdrawal.getCodeName().get(), WithdrawalTransferBuyBackWithdrawal);
		codesByName.put(WithholdingTaxAdjustmentInUserDefinedCountry.getCodeName().get(), WithholdingTaxAdjustmentInUserDefinedCountry);
		codesByName.put(WrittenInquiry.getCodeName().get(), WrittenInquiry);
		codesByName.put(WriteOffReorganisation.getCodeName().get(), WriteOffReorganisation);
		codesByName.put(WrongRatePrincipal.getCodeName().get(), WrongRatePrincipal);
	}

	public static DTCAdjustmentPaymentSubReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentSubReason2Code[] values() {
		DTCAdjustmentPaymentSubReason2Code[] values = new DTCAdjustmentPaymentSubReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentSubReason2Code> {
		@Override
		public DTCAdjustmentPaymentSubReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentSubReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}