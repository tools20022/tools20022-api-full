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
import com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReorganizationRelatedAdjustment
 * DTCAdjustmentPaymentSubReason1Code.ReorganizationRelatedAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RepPaymentCharge
 * DTCAdjustmentPaymentSubReason1Code.RepPaymentCharge}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReversalOfACODWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.ReversalOfACODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReversalOfADeposit
 * DTCAdjustmentPaymentSubReason1Code.ReversalOfADeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReversalOfAnAccrualClaimPayment
 * DTCAdjustmentPaymentSubReason1Code.ReversalOfAnAccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReversalOfaWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReason1Code.ReversalOfaWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReverseOfEscheatedAmountOfClaim
 * DTCAdjustmentPaymentSubReason1Code.ReverseOfEscheatedAmountOfClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReverseOfTheSharesEscheatedToNYStateInError
 * DTCAdjustmentPaymentSubReason1Code.
 * ReverseOfTheSharesEscheatedToNYStateInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RevisionOfChargeForWithholdingTax
 * DTCAdjustmentPaymentSubReason1Code.RevisionOfChargeForWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ScriptSharesExited
 * DTCAdjustmentPaymentSubReason1Code.ScriptSharesExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReason1Code.
 * ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReason1Code.
 * ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#SpinOffAllocation
 * DTCAdjustmentPaymentSubReason1Code.SpinOffAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#StockLoanAdjustment
 * DTCAdjustmentPaymentSubReason1Code.StockLoanAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#StockLoanOrRepoPaymentOrder
 * DTCAdjustmentPaymentSubReason1Code.StockLoanOrRepoPaymentOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#SupplementalInterimActivity
 * DTCAdjustmentPaymentSubReason1Code.SupplementalInterimActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#SupplementalInterimActivityFromMidwest
 * DTCAdjustmentPaymentSubReason1Code.SupplementalInterimActivityFromMidwest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#SupplementalInterimActivityFromPhiladelphia
 * DTCAdjustmentPaymentSubReason1Code.
 * SupplementalInterimActivityFromPhiladelphia}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#SupplementaryInterimOn
 * DTCAdjustmentPaymentSubReason1Code.SupplementaryInterimOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AccrualClaimPayment
 * DTCAdjustmentPaymentSubReason1Code.AccrualClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AccruedInterestNotPaid
 * DTCAdjustmentPaymentSubReason1Code.AccruedInterestNotPaid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AccruedInterestWrongRate
 * DTCAdjustmentPaymentSubReason1Code.AccruedInterestWrongRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdditionalRightsForBeneficialOwner
 * DTCAdjustmentPaymentSubReason1Code.AdditionalRightsForBeneficialOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName
 * DTCAdjustmentPaymentSubReason1Code.
 * AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentForCashInLieuOfFractionalShares
 * DTCAdjustmentPaymentSubReason1Code.AdjustmentForCashInLieuOfFractionalShares}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentForCashOnIncreasedShares
 * DTCAdjustmentPaymentSubReason1Code.AdjustmentForCashOnIncreasedShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentForWrittenInquiry
 * DTCAdjustmentPaymentSubReason1Code.AdjustmentForWrittenInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentIsInResponseToYourInquiry
 * DTCAdjustmentPaymentSubReason1Code.AdjustmentIsInResponseToYourInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName
 * DTCAdjustmentPaymentSubReason1Code.
 * AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentToAvoidFiscalPayment
 * DTCAdjustmentPaymentSubReason1Code.AdjustmentToAvoidFiscalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AdjustmentToYourDividendReinvestmentPosition
 * DTCAdjustmentPaymentSubReason1Code.
 * AdjustmentToYourDividendReinvestmentPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AgentPaidBasedOnCombinedFractions
 * DTCAdjustmentPaymentSubReason1Code.AgentPaidBasedOnCombinedFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AllocationAdjustment
 * DTCAdjustmentPaymentSubReason1Code.AllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AllocationAdjustmentDueToFractionsRoundedUpByTheAgent
 * DTCAdjustmentPaymentSubReason1Code.
 * AllocationAdjustmentDueToFractionsRoundedUpByTheAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AllocationOfBabyBondsAmountToBeExited
 * DTCAdjustmentPaymentSubReason1Code.AllocationOfBabyBondsAmountToBeExited}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AllocationOfDRPTEDSInstruction
 * DTCAdjustmentPaymentSubReason1Code.AllocationOfDRPTEDSInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AnnouncementDeletedOrFailTracking
 * DTCAdjustmentPaymentSubReason1Code.AnnouncementDeletedOrFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#AssumedByYourGoodselves
 * DTCAdjustmentPaymentSubReason1Code.AssumedByYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#BabyBondPayment
 * DTCAdjustmentPaymentSubReason1Code.BabyBondPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CalledCertificatesAccruedErroneousInterestChargeBack
 * DTCAdjustmentPaymentSubReason1Code.
 * CalledCertificatesAccruedErroneousInterestChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CalledCertificatesCheckInParticipantsNameChargeBack
 * DTCAdjustmentPaymentSubReason1Code.
 * CalledCertificatesCheckInParticipantsNameChargeBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CashDueOnAnAccruedStockPayment
 * DTCAdjustmentPaymentSubReason1Code.CashDueOnAnAccruedStockPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ChargeForFrenchAvoidFiscalTaxCredit
 * DTCAdjustmentPaymentSubReason1Code.ChargeForFrenchAvoidFiscalTaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ChargeInLieuOfReceiptOfDividendReinvestment
 * DTCAdjustmentPaymentSubReason1Code.
 * ChargeInLieuOfReceiptOfDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CODWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.CODWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CompanyInDefault
 * DTCAdjustmentPaymentSubReason1Code.CompanyInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CompanyDidNotDeclareDividend
 * DTCAdjustmentPaymentSubReason1Code.CompanyDidNotDeclareDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReason1Code.
 * CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CODBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.CODBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ChargeAtWithholdingRate
 * DTCAdjustmentPaymentSubReason1Code.ChargeAtWithholdingRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CashDueOnDRPShareAllocation
 * DTCAdjustmentPaymentSubReason1Code.CashDueOnDRPShareAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CashDueOnStockDividend
 * DTCAdjustmentPaymentSubReason1Code.CashDueOnStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ChangeInTheRecordDate
 * DTCAdjustmentPaymentSubReason1Code.ChangeInTheRecordDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason1Code.
 * CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CouponCollectionService
 * DTCAdjustmentPaymentSubReason1Code.CouponCollectionService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless
 * DTCAdjustmentPaymentSubReason1Code.
 * CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#CustodyPayment
 * DTCAdjustmentPaymentSubReason1Code.CustodyPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DateRevision
 * DTCAdjustmentPaymentSubReason1Code.DateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#Delete
 * DTCAdjustmentPaymentSubReason1Code.Delete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DeliverOrder
 * DTCAdjustmentPaymentSubReason1Code.DeliverOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DeliverOrderActivity
 * DTCAdjustmentPaymentSubReason1Code.DeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DepositAdjustment
 * DTCAdjustmentPaymentSubReason1Code.DepositAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour
 * DTCAdjustmentPaymentSubReason1Code.
 * DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DepositTransferredIntoTheNameOfTheCEDEAndCo
 * DTCAdjustmentPaymentSubReason1Code.
 * DepositTransferredIntoTheNameOfTheCEDEAndCo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DividendReinvestmentAllocation
 * DTCAdjustmentPaymentSubReason1Code.DividendReinvestmentAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent
 * DTCAdjustmentPaymentSubReason1Code.
 * DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DividendReinvestmentAllocationOfCashInLieuOfFractions
 * DTCAdjustmentPaymentSubReason1Code.
 * DividendReinvestmentAllocationOfCashInLieuOfFractions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason1Code.
 * DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DueBill
 * DTCAdjustmentPaymentSubReason1Code.DueBill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DueBillFailTracking
 * DTCAdjustmentPaymentSubReason1Code.DueBillFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DueBillReversal
 * DTCAdjustmentPaymentSubReason1Code.DueBillReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DWACAdjustment
 * DTCAdjustmentPaymentSubReason1Code.DWACAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#DWACBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.DWACBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ForeignCashDividendsOrBondInterestAllocationAtExemptRate
 * DTCAdjustmentPaymentSubReason1Code.
 * ForeignCashDividendsOrBondInterestAllocationAtExemptRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate
 * DTCAdjustmentPaymentSubReason1Code.
 * ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate
 * DTCAdjustmentPaymentSubReason1Code.
 * ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ForeignCashDividendUnfavorableRate
 * DTCAdjustmentPaymentSubReason1Code.ForeignCashDividendUnfavorableRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#FractionalRights
 * DTCAdjustmentPaymentSubReason1Code.FractionalRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#FrenchWithholdingTax10Percent
 * DTCAdjustmentPaymentSubReason1Code.FrenchWithholdingTax10Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#FrenchWithholdingTax15Percent
 * DTCAdjustmentPaymentSubReason1Code.FrenchWithholdingTax15Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#FrenchWithholdingTax25Percent
 * DTCAdjustmentPaymentSubReason1Code.FrenchWithholdingTax25Percent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#FrozenLetterMovement
 * DTCAdjustmentPaymentSubReason1Code.FrozenLetterMovement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#GracePeriod
 * DTCAdjustmentPaymentSubReason1Code.GracePeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InLieuOfReorgDepositActivity
 * DTCAdjustmentPaymentSubReason1Code.InLieuOfReorgDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InSettlementOfATradeDTCCReorgAccount
 * DTCAdjustmentPaymentSubReason1Code.InSettlementOfATradeDTCCReorgAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestAdjustedDueToEarlyWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.InterestAdjustedDueToEarlyWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestAllocatedInError
 * DTCAdjustmentPaymentSubReason1Code.InterestAllocatedInError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestDueWasErroneouslyPaidToYouByTheIssuer
 * DTCAdjustmentPaymentSubReason1Code.
 * InterestDueWasErroneouslyPaidToYouByTheIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestorDividendDueOnConversion
 * DTCAdjustmentPaymentSubReason1Code.InterestorDividendDueOnConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestOrDividendDueOnMerger
 * DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestOrDividendDueOnRedemption
 * DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestOrDividendDueOnRepaymentOption
 * DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnRepaymentOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestOrDividendDueOnTender
 * DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterestPaysAtMaturity
 * DTCAdjustmentPaymentSubReason1Code.InterestPaysAtMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InterimPositionAdjustedForDeliverOrderActivity
 * DTCAdjustmentPaymentSubReason1Code.
 * InterimPositionAdjustedForDeliverOrderActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#InvestmentIdAdjustment
 * DTCAdjustmentPaymentSubReason1Code.InvestmentIdAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#IssueInDefault
 * DTCAdjustmentPaymentSubReason1Code.IssueInDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#LateAnnouncement
 * DTCAdjustmentPaymentSubReason1Code.LateAnnouncement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#LateAnnouncementActivityDueBillActivity
 * DTCAdjustmentPaymentSubReason1Code.LateAnnouncementActivityDueBillActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#LostCertificateRegisteredInTheNameOfYourGoodselves
 * DTCAdjustmentPaymentSubReason1Code.
 * LostCertificateRegisteredInTheNameOfYourGoodselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#LostCertificateWasRegisteredInTheNameOfYourCustomer
 * DTCAdjustmentPaymentSubReason1Code.
 * LostCertificateWasRegisteredInTheNameOfYourCustomer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#LostCertificateWasRegisteredInTheNameOfYourNominee
 * DTCAdjustmentPaymentSubReason1Code.
 * LostCertificateWasRegisteredInTheNameOfYourNominee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MidwestDepository
 * DTCAdjustmentPaymentSubReason1Code.MidwestDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBond
 * DTCAdjustmentPaymentSubReason1Code.MuniBearerBond}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBondCoupon
 * DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCoupon}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn
 * DTCAdjustmentPaymentSubReason1Code.
 * MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn
 * DTCAdjustmentPaymentSubReason1Code.
 * MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit
 * DTCAdjustmentPaymentSubReason1Code.
 * MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.
 * MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#MuniBearerBondCouponPositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReason1Code.
 * MuniBearerBondCouponPositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#NonAllocation
 * DTCAdjustmentPaymentSubReason1Code.NonAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#OptionalDividendAllocationAdjustment
 * DTCAdjustmentPaymentSubReason1Code.OptionalDividendAllocationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#Other
 * DTCAdjustmentPaymentSubReason1Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PacificDepository
 * DTCAdjustmentPaymentSubReason1Code.PacificDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PartClaimPayment
 * DTCAdjustmentPaymentSubReason1Code.PartClaimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PartClaimReversal
 * DTCAdjustmentPaymentSubReason1Code.PartClaimReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PaymentOfFullAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReason1Code.PaymentOfFullAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PaymentOfPartialAvoidFiscalTaxRefund
 * DTCAdjustmentPaymentSubReason1Code.PaymentOfPartialAvoidFiscalTaxRefund}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PaynInKindDistribution
 * DTCAdjustmentPaymentSubReason1Code.PaynInKindDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PhiladelphiaDepository
 * DTCAdjustmentPaymentSubReason1Code.PhiladelphiaDepository}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PledgeAdjustment
 * DTCAdjustmentPaymentSubReason1Code.PledgeAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PledgeReleaseAdjustment
 * DTCAdjustmentPaymentSubReason1Code.PledgeReleaseAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PositionAdjustedForDepositActivity
 * DTCAdjustmentPaymentSubReason1Code.PositionAdjustedForDepositActivity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers
 * DTCAdjustmentPaymentSubReason1Code.
 * PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PostDateChangeForFailTracking
 * DTCAdjustmentPaymentSubReason1Code.PostDateChangeForFailTracking}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PreviouslyCalledCertificatesFundsDelivery
 * DTCAdjustmentPaymentSubReason1Code.PreviouslyCalledCertificatesFundsDelivery}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#PriceCorrectionDividendReinvestment
 * DTCAdjustmentPaymentSubReason1Code.PriceCorrectionDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReason1Code.
 * ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ProceedsFromSaleOf
 * DTCAdjustmentPaymentSubReason1Code.ProceedsFromSaleOf}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount
 * DTCAdjustmentPaymentSubReason1Code.
 * ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RateChange
 * DTCAdjustmentPaymentSubReason1Code.RateChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RateRevision
 * DTCAdjustmentPaymentSubReason1Code.RateRevision}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RateUnknown
 * DTCAdjustmentPaymentSubReason1Code.RateUnknown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RecordDatePositionAdjustedForaWithdrawalByTransfer
 * DTCAdjustmentPaymentSubReason1Code.
 * RecordDatePositionAdjustedForaWithdrawalByTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RedemptionAdjustment
 * DTCAdjustmentPaymentSubReason1Code.RedemptionAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RedemptionCash
 * DTCAdjustmentPaymentSubReason1Code.RedemptionCash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RedemptionPaymentDueToPledgeRelease
 * DTCAdjustmentPaymentSubReason1Code.RedemptionPaymentDueToPledgeRelease}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RefundedTaxRate
 * DTCAdjustmentPaymentSubReason1Code.RefundedTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RefundOfFrenchTaxJuly
 * DTCAdjustmentPaymentSubReason1Code.RefundOfFrenchTaxJuly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#RefundOfFrenchTaxJune
 * DTCAdjustmentPaymentSubReason1Code.RefundOfFrenchTaxJune}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#Reinstate
 * DTCAdjustmentPaymentSubReason1Code.Reinstate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#ReorganizationAdjustment
 * DTCAdjustmentPaymentSubReason1Code.ReorganizationAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#TaxExemptInstructions
 * DTCAdjustmentPaymentSubReason1Code.TaxExemptInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#TenderFeeDeduction
 * DTCAdjustmentPaymentSubReason1Code.TenderFeeDeduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#UnfavorableRateMerger
 * DTCAdjustmentPaymentSubReason1Code.UnfavorableRateMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#UninsuredInterestWithheld
 * DTCAdjustmentPaymentSubReason1Code.UninsuredInterestWithheld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#VodaphoneADR
 * DTCAdjustmentPaymentSubReason1Code.VodaphoneADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#WithdrawalTransferAdjustment
 * DTCAdjustmentPaymentSubReason1Code.WithdrawalTransferAdjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#WithdrawalTransferBuyBackWithdrawal
 * DTCAdjustmentPaymentSubReason1Code.WithdrawalTransferBuyBackWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#WithholdingTaxAdjustmentInUserDefinedCountry
 * DTCAdjustmentPaymentSubReason1Code.
 * WithholdingTaxAdjustmentInUserDefinedCountry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#WriteOffReorganization
 * DTCAdjustmentPaymentSubReason1Code.WriteOffReorganization}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code#WrongRatePrincipal
 * DTCAdjustmentPaymentSubReason1Code.WrongRatePrincipal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReasonCode
 * DTCAdjustmentPaymentSubReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCAdjustmentPaymentSubReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the subtype of the payment adjustment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCAdjustmentPaymentSubReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganizationRelatedAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReorganizationRelatedAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganizationRelatedAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReorganizationRelatedAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepPaymentCharge"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RepPaymentCharge = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepPaymentCharge";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RepPaymentCharge.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfACODWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReversalOfACODWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfACODWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReversalOfACODWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfADeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReversalOfADeposit = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfADeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReversalOfADeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfAnAccrualClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReversalOfAnAccrualClaimPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfAnAccrualClaimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReversalOfAnAccrualClaimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalOfaWithdrawalByTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReversalOfaWithdrawalByTransfer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalOfaWithdrawalByTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReversalOfaWithdrawalByTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfEscheatedAmountOfClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReverseOfEscheatedAmountOfClaim = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfEscheatedAmountOfClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReverseOfEscheatedAmountOfClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseOfTheSharesEscheatedToNYStateInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReverseOfTheSharesEscheatedToNYStateInError = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseOfTheSharesEscheatedToNYStateInError";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReverseOfTheSharesEscheatedToNYStateInError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RevisionOfChargeForWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RevisionOfChargeForWithholdingTax = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RevisionOfChargeForWithholdingTax";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RevisionOfChargeForWithholdingTax.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScriptSharesExited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ScriptSharesExited = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScriptSharesExited";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ScriptSharesExited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOffAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code SpinOffAllocation = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOffAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.SpinOffAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code StockLoanAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.StockLoanAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockLoanOrRepoPaymentOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code StockLoanOrRepoPaymentOrder = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockLoanOrRepoPaymentOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.StockLoanOrRepoPaymentOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code SupplementalInterimActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromMidwest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code SupplementalInterimActivityFromMidwest = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromMidwest";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivityFromMidwest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementalInterimActivityFromPhiladelphia"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code SupplementalInterimActivityFromPhiladelphia = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementalInterimActivityFromPhiladelphia";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.SupplementalInterimActivityFromPhiladelphia.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryInterimOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code SupplementaryInterimOn = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryInterimOn";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.SupplementaryInterimOn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccrualClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AccrualClaimPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccrualClaimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AccrualClaimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestNotPaid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AccruedInterestNotPaid = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestNotPaid";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AccruedInterestNotPaid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestWrongRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AccruedInterestWrongRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestWrongRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AccruedInterestWrongRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRightsForBeneficialOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdditionalRightsForBeneficialOwner = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRightsForBeneficialOwner";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdditionalRightsForBeneficialOwner.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentForCashInLieuOfFractionalShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentForCashInLieuOfFractionalShares = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForCashInLieuOfFractionalShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentForCashInLieuOfFractionalShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentForCashOnIncreasedShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentForCashOnIncreasedShares = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForCashOnIncreasedShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentForCashOnIncreasedShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentForWrittenInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentForWrittenInquiry = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentForWrittenInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentForWrittenInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentIsInResponseToYourInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentIsInResponseToYourInquiry = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentIsInResponseToYourInquiry";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentIsInResponseToYourInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentToAvoidFiscalPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentToAvoidFiscalPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToAvoidFiscalPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentToAvoidFiscalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjustmentToYourDividendReinvestmentPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AdjustmentToYourDividendReinvestmentPosition = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjustmentToYourDividendReinvestmentPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AdjustmentToYourDividendReinvestmentPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentPaidBasedOnCombinedFractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AgentPaidBasedOnCombinedFractions = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentPaidBasedOnCombinedFractions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AgentPaidBasedOnCombinedFractions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AllocationAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AllocationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationAdjustmentDueToFractionsRoundedUpByTheAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AllocationAdjustmentDueToFractionsRoundedUpByTheAgent = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationAdjustmentDueToFractionsRoundedUpByTheAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AllocationAdjustmentDueToFractionsRoundedUpByTheAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfBabyBondsAmountToBeExited"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AllocationOfBabyBondsAmountToBeExited = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfBabyBondsAmountToBeExited";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AllocationOfBabyBondsAmountToBeExited.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllocationOfDRPTEDSInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AllocationOfDRPTEDSInstruction = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllocationOfDRPTEDSInstruction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AllocationOfDRPTEDSInstruction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnouncementDeletedOrFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AnnouncementDeletedOrFailTracking = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnouncementDeletedOrFailTracking";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AnnouncementDeletedOrFailTracking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssumedByYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code AssumedByYourGoodselves = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssumedByYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.AssumedByYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BabyBondPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code BabyBondPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BabyBondPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.BabyBondPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesAccruedErroneousInterestChargeBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CalledCertificatesAccruedErroneousInterestChargeBack = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesAccruedErroneousInterestChargeBack";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CalledCertificatesAccruedErroneousInterestChargeBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalledCertificatesCheckInParticipantsNameChargeBack"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CalledCertificatesCheckInParticipantsNameChargeBack = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalledCertificatesCheckInParticipantsNameChargeBack";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CalledCertificatesCheckInParticipantsNameChargeBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnAnAccruedStockPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CashDueOnAnAccruedStockPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnAnAccruedStockPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CashDueOnAnAccruedStockPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeForFrenchAvoidFiscalTaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ChargeForFrenchAvoidFiscalTaxCredit = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeForFrenchAvoidFiscalTaxCredit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ChargeForFrenchAvoidFiscalTaxCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeInLieuOfReceiptOfDividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ChargeInLieuOfReceiptOfDividendReinvestment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeInLieuOfReceiptOfDividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ChargeInLieuOfReceiptOfDividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CODWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CODWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyInDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CompanyInDefault = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyInDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CompanyInDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyDidNotDeclareDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CompanyDidNotDeclareDividend = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyDidNotDeclareDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CompanyDidNotDeclareDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CODBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CODBuyBackWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODBuyBackWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CODBuyBackWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeAtWithholdingRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ChargeAtWithholdingRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAtWithholdingRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ChargeAtWithholdingRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnDRPShareAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CashDueOnDRPShareAllocation = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnDRPShareAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CashDueOnDRPShareAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDueOnStockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CashDueOnStockDividend = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDueOnStockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CashDueOnStockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChangeInTheRecordDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ChangeInTheRecordDate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChangeInTheRecordDate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ChangeInTheRecordDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponCollectionService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CouponCollectionService = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponCollectionService";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CouponCollectionService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodyPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code CustodyPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodyPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.CustodyPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateRevision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DateRevision = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateRevision";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DateRevision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Delete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code Delete = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Delete";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.Delete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DeliverOrder = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DeliverOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliverOrderActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DeliverOrderActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliverOrderActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DeliverOrderActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DepositAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DepositAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositTransferredIntoTheNameOfTheCEDEAndCo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DepositTransferredIntoTheNameOfTheCEDEAndCo = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositTransferredIntoTheNameOfTheCEDEAndCo";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DepositTransferredIntoTheNameOfTheCEDEAndCo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DividendReinvestmentAllocation = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentAllocationOfCashInLieuOfFractions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DividendReinvestmentAllocationOfCashInLieuOfFractions = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentAllocationOfCashInLieuOfFractions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DividendReinvestmentAllocationOfCashInLieuOfFractions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DueBill = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBill";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DueBill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DueBillFailTracking = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillFailTracking";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DueBillFailTracking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DueBillReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DueBillReversal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DueBillReversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DueBillReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DWACAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DWACAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DWACBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code DWACBuyBackWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DWACBuyBackWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.DWACBuyBackWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ForeignCashDividendsOrBondInterestAllocationAtExemptRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtExemptRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendsOrBondInterestAllocationAtExemptRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignCashDividendUnfavorableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ForeignCashDividendUnfavorableRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignCashDividendUnfavorableRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ForeignCashDividendUnfavorableRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code FractionalRights = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalRights";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.FractionalRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax10Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code FrenchWithholdingTax10Percent = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax10Percent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax10Percent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax15Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code FrenchWithholdingTax15Percent = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax15Percent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax15Percent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrenchWithholdingTax25Percent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code FrenchWithholdingTax25Percent = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrenchWithholdingTax25Percent";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.FrenchWithholdingTax25Percent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FrozenLetterMovement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code FrozenLetterMovement = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FrozenLetterMovement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.FrozenLetterMovement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GracePeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code GracePeriod = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GracePeriod";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.GracePeriod.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InLieuOfReorgDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InLieuOfReorgDepositActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InLieuOfReorgDepositActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InLieuOfReorgDepositActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InSettlementOfATradeDTCCReorgAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InSettlementOfATradeDTCCReorgAccount = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InSettlementOfATradeDTCCReorgAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InSettlementOfATradeDTCCReorgAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAdjustedDueToEarlyWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestAdjustedDueToEarlyWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAdjustedDueToEarlyWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestAdjustedDueToEarlyWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestAllocatedInError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestAllocatedInError = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestAllocatedInError";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestAllocatedInError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestDueWasErroneouslyPaidToYouByTheIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestDueWasErroneouslyPaidToYouByTheIssuer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestDueWasErroneouslyPaidToYouByTheIssuer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestDueWasErroneouslyPaidToYouByTheIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestorDividendDueOnConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestorDividendDueOnConversion = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestorDividendDueOnConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestorDividendDueOnConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestOrDividendDueOnMerger = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnMerger";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnMerger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestOrDividendDueOnRedemption = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnRepaymentOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestOrDividendDueOnRepaymentOption = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnRepaymentOption";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnRepaymentOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestOrDividendDueOnTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestOrDividendDueOnTender = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestOrDividendDueOnTender";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestOrDividendDueOnTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaysAtMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterestPaysAtMaturity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaysAtMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterestPaysAtMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimPositionAdjustedForDeliverOrderActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InterimPositionAdjustedForDeliverOrderActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPositionAdjustedForDeliverOrderActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InterimPositionAdjustedForDeliverOrderActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentIdAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code InvestmentIdAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentIdAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.InvestmentIdAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssueInDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code IssueInDefault = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssueInDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.IssueInDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code LateAnnouncement = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncement";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.LateAnnouncement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LateAnnouncementActivityDueBillActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code LateAnnouncementActivityDueBillActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LateAnnouncementActivityDueBillActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.LateAnnouncementActivityDueBillActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateRegisteredInTheNameOfYourGoodselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code LostCertificateRegisteredInTheNameOfYourGoodselves = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateRegisteredInTheNameOfYourGoodselves";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.LostCertificateRegisteredInTheNameOfYourGoodselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourCustomer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code LostCertificateWasRegisteredInTheNameOfYourCustomer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourCustomer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.LostCertificateWasRegisteredInTheNameOfYourCustomer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCertificateWasRegisteredInTheNameOfYourNominee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code LostCertificateWasRegisteredInTheNameOfYourNominee = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCertificateWasRegisteredInTheNameOfYourNominee";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.LostCertificateWasRegisteredInTheNameOfYourNominee.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MidwestDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MidwestDepository = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MidwestDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MidwestDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBond"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBond = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBond";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBond.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCoupon"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBondCoupon = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCoupon";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCoupon.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MuniBearerBondCouponPositionAdjustedForDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code MuniBearerBondCouponPositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MuniBearerBondCouponPositionAdjustedForDepositActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.MuniBearerBondCouponPositionAdjustedForDepositActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonAllocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code NonAllocation = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonAllocation";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.NonAllocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptionalDividendAllocationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code OptionalDividendAllocationAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptionalDividendAllocationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.OptionalDividendAllocationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code Other = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PacificDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PacificDepository = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PacificDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PacificDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PartClaimPayment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PartClaimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartClaimReversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PartClaimReversal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartClaimReversal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PartClaimReversal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfFullAvoidFiscalTaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PaymentOfFullAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfFullAvoidFiscalTaxRefund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PaymentOfFullAvoidFiscalTaxRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentOfPartialAvoidFiscalTaxRefund"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PaymentOfPartialAvoidFiscalTaxRefund = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentOfPartialAvoidFiscalTaxRefund";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PaymentOfPartialAvoidFiscalTaxRefund.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaynInKindDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PaynInKindDistribution = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaynInKindDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PaynInKindDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhiladelphiaDepository"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PhiladelphiaDepository = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhiladelphiaDepository";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PhiladelphiaDepository.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PledgeAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PledgeAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PledgeReleaseAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PledgeReleaseAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PledgeReleaseAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PledgeReleaseAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PositionAdjustedForDepositActivity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PositionAdjustedForDepositActivity = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionAdjustedForDepositActivity";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PositionAdjustedForDepositActivity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostDateChangeForFailTracking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PostDateChangeForFailTracking = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostDateChangeForFailTracking";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PostDateChangeForFailTracking.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviouslyCalledCertificatesFundsDelivery"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PreviouslyCalledCertificatesFundsDelivery = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviouslyCalledCertificatesFundsDelivery";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PreviouslyCalledCertificatesFundsDelivery.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCorrectionDividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code PriceCorrectionDividendReinvestment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceCorrectionDividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.PriceCorrectionDividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsFromSaleOf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ProceedsFromSaleOf = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsFromSaleOf";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ProceedsFromSaleOf.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RateChange = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateChange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RateChange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateRevision"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RateRevision = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateRevision";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RateRevision.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RateUnknown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RateUnknown = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RateUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RateUnknown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDatePositionAdjustedForaWithdrawalByTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RecordDatePositionAdjustedForaWithdrawalByTransfer = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDatePositionAdjustedForaWithdrawalByTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RecordDatePositionAdjustedForaWithdrawalByTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RedemptionAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RedemptionAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionCash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RedemptionCash = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionCash";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RedemptionCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RedemptionPaymentDueToPledgeRelease"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RedemptionPaymentDueToPledgeRelease = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RedemptionPaymentDueToPledgeRelease";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RedemptionPaymentDueToPledgeRelease.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundedTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RefundedTaxRate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundedTaxRate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RefundedTaxRate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJuly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RefundOfFrenchTaxJuly = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJuly";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RefundOfFrenchTaxJuly.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RefundOfFrenchTaxJune"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code RefundOfFrenchTaxJune = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RefundOfFrenchTaxJune";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.RefundOfFrenchTaxJune.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reinstate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code Reinstate = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reinstate";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.Reinstate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReorganizationAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code ReorganizationAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReorganizationAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.ReorganizationAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxExemptInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code TaxExemptInstructions = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxExemptInstructions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.TaxExemptInstructions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderFeeDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code TenderFeeDeduction = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderFeeDeduction";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.TenderFeeDeduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnfavorableRateMerger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code UnfavorableRateMerger = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnfavorableRateMerger";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.UnfavorableRateMerger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UninsuredInterestWithheld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code UninsuredInterestWithheld = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UninsuredInterestWithheld";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.UninsuredInterestWithheld.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VodaphoneADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code VodaphoneADR = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VodaphoneADR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.VodaphoneADR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferAdjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code WithdrawalTransferAdjustment = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferAdjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.WithdrawalTransferAdjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransferBuyBackWithdrawal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code WithdrawalTransferBuyBackWithdrawal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransferBuyBackWithdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.WithdrawalTransferBuyBackWithdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAdjustmentInUserDefinedCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code WithholdingTaxAdjustmentInUserDefinedCountry = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAdjustmentInUserDefinedCountry";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.WithholdingTaxAdjustmentInUserDefinedCountry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WriteOffReorganization"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code WriteOffReorganization = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WriteOffReorganization";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.WriteOffReorganization.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code
	 * DTCAdjustmentPaymentSubReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongRatePrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DTCAdjustmentPaymentSubReason1Code WrongRatePrincipal = new DTCAdjustmentPaymentSubReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongRatePrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.mmObject();
			codeName = DTCAdjustmentPaymentSubReasonCode.WrongRatePrincipal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCAdjustmentPaymentSubReason1Code> codesByName = new LinkedHashMap<>();

	protected DTCAdjustmentPaymentSubReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCAdjustmentPaymentSubReason1Code";
				definition = "Specifies the subtype of the payment adjustment.";
				trace_lazy = () -> DTCAdjustmentPaymentSubReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReorganizationRelatedAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RepPaymentCharge,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReversalOfACODWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReversalOfADeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReversalOfAnAccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReversalOfaWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReverseOfEscheatedAmountOfClaim, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReverseOfTheSharesEscheatedToNYStateInError,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RevisionOfChargeForWithholdingTax, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ScriptSharesExited,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.SpinOffAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.StockLoanAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.StockLoanOrRepoPaymentOrder, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.SupplementalInterimActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.SupplementalInterimActivityFromMidwest,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.SupplementalInterimActivityFromPhiladelphia, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.SupplementaryInterimOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AccrualClaimPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AccruedInterestNotPaid,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AccruedInterestWrongRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdditionalRightsForBeneficialOwner,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentForCashInLieuOfFractionalShares,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentForCashOnIncreasedShares, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentForWrittenInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentIsInResponseToYourInquiry,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentToAvoidFiscalPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AdjustmentToYourDividendReinvestmentPosition,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AgentPaidBasedOnCombinedFractions, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AllocationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AllocationAdjustmentDueToFractionsRoundedUpByTheAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AllocationOfBabyBondsAmountToBeExited, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AllocationOfDRPTEDSInstruction,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AnnouncementDeletedOrFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.AssumedByYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.BabyBondPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CalledCertificatesAccruedErroneousInterestChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CalledCertificatesCheckInParticipantsNameChargeBack,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CashDueOnAnAccruedStockPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ChargeForFrenchAvoidFiscalTaxCredit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ChargeInLieuOfReceiptOfDividendReinvestment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CODWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CompanyInDefault, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CompanyDidNotDeclareDividend,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CODBuyBackWithdrawal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ChargeAtWithholdingRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CashDueOnDRPShareAllocation, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CashDueOnStockDividend,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ChangeInTheRecordDate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CouponCollectionService,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.CustodyPayment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DateRevision,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.Delete, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DeliverOrder,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DeliverOrderActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DepositAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DepositTransferredIntoTheNameOfTheCEDEAndCo, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DividendReinvestmentAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DividendReinvestmentAllocationOfCashInLieuOfFractions,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DueBill,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DueBillFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DueBillReversal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DWACAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.DWACBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ForeignCashDividendsOrBondInterestAllocationAtExemptRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ForeignCashDividendUnfavorableRate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.FractionalRights,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.FrenchWithholdingTax10Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.FrenchWithholdingTax15Percent,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.FrenchWithholdingTax25Percent, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.FrozenLetterMovement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.GracePeriod, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InLieuOfReorgDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InSettlementOfATradeDTCCReorgAccount, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestAdjustedDueToEarlyWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestAllocatedInError, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestDueWasErroneouslyPaidToYouByTheIssuer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestorDividendDueOnConversion, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnMerger,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnRedemption, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnRepaymentOption,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestOrDividendDueOnTender, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterestPaysAtMaturity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InterimPositionAdjustedForDeliverOrderActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.InvestmentIdAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.IssueInDefault, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.LateAnnouncement,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.LateAnnouncementActivityDueBillActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.LostCertificateRegisteredInTheNameOfYourGoodselves,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.LostCertificateWasRegisteredInTheNameOfYourCustomer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.LostCertificateWasRegisteredInTheNameOfYourNominee, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MidwestDepository,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBond, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCoupon,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.MuniBearerBondCouponPositionAdjustedForDepositActivity, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.NonAllocation,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.OptionalDividendAllocationAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.Other,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PacificDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PartClaimPayment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PartClaimReversal, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PaymentOfFullAvoidFiscalTaxRefund,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PaymentOfPartialAvoidFiscalTaxRefund, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PaynInKindDistribution,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PhiladelphiaDepository, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PledgeAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PledgeReleaseAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PositionAdjustedForDepositActivity,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PostDateChangeForFailTracking, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PreviouslyCalledCertificatesFundsDelivery,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.PriceCorrectionDividendReinvestment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ProceedsFromSaleOf,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RateChange, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RateRevision,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RateUnknown, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RecordDatePositionAdjustedForaWithdrawalByTransfer,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RedemptionAdjustment, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RedemptionCash,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RedemptionPaymentDueToPledgeRelease, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RefundedTaxRate,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RefundOfFrenchTaxJuly, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.RefundOfFrenchTaxJune,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.Reinstate, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.ReorganizationAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.TaxExemptInstructions, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.TenderFeeDeduction,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.UnfavorableRateMerger, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.UninsuredInterestWithheld,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.VodaphoneADR, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.WithdrawalTransferAdjustment,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.WithdrawalTransferBuyBackWithdrawal,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.WithholdingTaxAdjustmentInUserDefinedCountry, com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.WriteOffReorganization,
						com.tools20022.repository.codeset.DTCAdjustmentPaymentSubReason1Code.WrongRatePrincipal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ReorganizationRelatedAdjustment.getCodeName().get(), ReorganizationRelatedAdjustment);
		codesByName.put(RepPaymentCharge.getCodeName().get(), RepPaymentCharge);
		codesByName.put(ReversalOfACODWithdrawal.getCodeName().get(), ReversalOfACODWithdrawal);
		codesByName.put(ReversalOfADeposit.getCodeName().get(), ReversalOfADeposit);
		codesByName.put(ReversalOfAnAccrualClaimPayment.getCodeName().get(), ReversalOfAnAccrualClaimPayment);
		codesByName.put(ReversalOfaWithdrawalByTransfer.getCodeName().get(), ReversalOfaWithdrawalByTransfer);
		codesByName.put(ReverseOfEscheatedAmountOfClaim.getCodeName().get(), ReverseOfEscheatedAmountOfClaim);
		codesByName.put(ReverseOfTheSharesEscheatedToNYStateInError.getCodeName().get(), ReverseOfTheSharesEscheatedToNYStateInError);
		codesByName.put(RevisionOfChargeForWithholdingTax.getCodeName().get(), RevisionOfChargeForWithholdingTax);
		codesByName.put(ScriptSharesExited.getCodeName().get(), ScriptSharesExited);
		codesByName.put(ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount.getCodeName().get(), ShareAdjustmentFromABuyTransactionInOurDTCCDividendTradingAccount);
		codesByName.put(ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount.getCodeName().get(), ShareAdjustmentResultingFromASellTransactionAffectedInOurDTCCDividendTradingAccount);
		codesByName.put(SpinOffAllocation.getCodeName().get(), SpinOffAllocation);
		codesByName.put(StockLoanAdjustment.getCodeName().get(), StockLoanAdjustment);
		codesByName.put(StockLoanOrRepoPaymentOrder.getCodeName().get(), StockLoanOrRepoPaymentOrder);
		codesByName.put(SupplementalInterimActivity.getCodeName().get(), SupplementalInterimActivity);
		codesByName.put(SupplementalInterimActivityFromMidwest.getCodeName().get(), SupplementalInterimActivityFromMidwest);
		codesByName.put(SupplementalInterimActivityFromPhiladelphia.getCodeName().get(), SupplementalInterimActivityFromPhiladelphia);
		codesByName.put(SupplementaryInterimOn.getCodeName().get(), SupplementaryInterimOn);
		codesByName.put(AccrualClaimPayment.getCodeName().get(), AccrualClaimPayment);
		codesByName.put(AccruedInterestNotPaid.getCodeName().get(), AccruedInterestNotPaid);
		codesByName.put(AccruedInterestWrongRate.getCodeName().get(), AccruedInterestWrongRate);
		codesByName.put(AdditionalRightsForBeneficialOwner.getCodeName().get(), AdditionalRightsForBeneficialOwner);
		codesByName.put(AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName.getCodeName().get(), AdjustmentForAWithdrawalByTransferNotTransferredIntoYourClientsName);
		codesByName.put(AdjustmentForCashInLieuOfFractionalShares.getCodeName().get(), AdjustmentForCashInLieuOfFractionalShares);
		codesByName.put(AdjustmentForCashOnIncreasedShares.getCodeName().get(), AdjustmentForCashOnIncreasedShares);
		codesByName.put(AdjustmentForWrittenInquiry.getCodeName().get(), AdjustmentForWrittenInquiry);
		codesByName.put(AdjustmentIsInResponseToYourInquiry.getCodeName().get(), AdjustmentIsInResponseToYourInquiry);
		codesByName.put(AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName.getCodeName().get(), AdjustmentMadeForAWithdrawalByTransferSetUpAfterTheCutOffDateMadeTransferIntoYourClientsName);
		codesByName.put(AdjustmentToAvoidFiscalPayment.getCodeName().get(), AdjustmentToAvoidFiscalPayment);
		codesByName.put(AdjustmentToYourDividendReinvestmentPosition.getCodeName().get(), AdjustmentToYourDividendReinvestmentPosition);
		codesByName.put(AgentPaidBasedOnCombinedFractions.getCodeName().get(), AgentPaidBasedOnCombinedFractions);
		codesByName.put(AllocationAdjustment.getCodeName().get(), AllocationAdjustment);
		codesByName.put(AllocationAdjustmentDueToFractionsRoundedUpByTheAgent.getCodeName().get(), AllocationAdjustmentDueToFractionsRoundedUpByTheAgent);
		codesByName.put(AllocationOfBabyBondsAmountToBeExited.getCodeName().get(), AllocationOfBabyBondsAmountToBeExited);
		codesByName.put(AllocationOfDRPTEDSInstruction.getCodeName().get(), AllocationOfDRPTEDSInstruction);
		codesByName.put(AnnouncementDeletedOrFailTracking.getCodeName().get(), AnnouncementDeletedOrFailTracking);
		codesByName.put(AssumedByYourGoodselves.getCodeName().get(), AssumedByYourGoodselves);
		codesByName.put(BabyBondPayment.getCodeName().get(), BabyBondPayment);
		codesByName.put(CalledCertificatesAccruedErroneousInterestChargeBack.getCodeName().get(), CalledCertificatesAccruedErroneousInterestChargeBack);
		codesByName.put(CalledCertificatesCheckInParticipantsNameChargeBack.getCodeName().get(), CalledCertificatesCheckInParticipantsNameChargeBack);
		codesByName.put(CashDueOnAnAccruedStockPayment.getCodeName().get(), CashDueOnAnAccruedStockPayment);
		codesByName.put(ChargeForFrenchAvoidFiscalTaxCredit.getCodeName().get(), ChargeForFrenchAvoidFiscalTaxCredit);
		codesByName.put(ChargeInLieuOfReceiptOfDividendReinvestment.getCodeName().get(), ChargeInLieuOfReceiptOfDividendReinvestment);
		codesByName.put(CODWithdrawal.getCodeName().get(), CODWithdrawal);
		codesByName.put(CompanyInDefault.getCodeName().get(), CompanyInDefault);
		codesByName.put(CompanyDidNotDeclareDividend.getCodeName().get(), CompanyDidNotDeclareDividend);
		codesByName.put(CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee.getCodeName().get(), CODWithdrawalNotDeliveredAndCertificatesIssuedInTheNameOfYourNominee);
		codesByName.put(CODBuyBackWithdrawal.getCodeName().get(), CODBuyBackWithdrawal);
		codesByName.put(ChargeAtWithholdingRate.getCodeName().get(), ChargeAtWithholdingRate);
		codesByName.put(CashDueOnDRPShareAllocation.getCodeName().get(), CashDueOnDRPShareAllocation);
		codesByName.put(CashDueOnStockDividend.getCodeName().get(), CashDueOnStockDividend);
		codesByName.put(ChangeInTheRecordDate.getCodeName().get(), ChangeInTheRecordDate);
		codesByName.put(CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves.getCodeName().get(), CODWithdrawalNotDeliveredAndCertificatesInTheNameOfYourGoodselves);
		codesByName.put(CouponCollectionService.getCodeName().get(), CouponCollectionService);
		codesByName.put(CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless.getCodeName().get(), CTFSHeldOverRecordDateOnWhichWeGuaranteeToHoldYouFreeAndHarmless);
		codesByName.put(CustodyPayment.getCodeName().get(), CustodyPayment);
		codesByName.put(DateRevision.getCodeName().get(), DateRevision);
		codesByName.put(Delete.getCodeName().get(), Delete);
		codesByName.put(DeliverOrder.getCodeName().get(), DeliverOrder);
		codesByName.put(DeliverOrderActivity.getCodeName().get(), DeliverOrderActivity);
		codesByName.put(DepositAdjustment.getCodeName().get(), DepositAdjustment);
		codesByName.put(DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour.getCodeName().get(), DepositLostCertificateOverTheRecordDateWasRegisteredInTheNameOfYour);
		codesByName.put(DepositTransferredIntoTheNameOfTheCEDEAndCo.getCodeName().get(), DepositTransferredIntoTheNameOfTheCEDEAndCo);
		codesByName.put(DividendReinvestmentAllocation.getCodeName().get(), DividendReinvestmentAllocation);
		codesByName.put(DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent.getCodeName().get(), DividendReinvestmentAllocationAdjustmentDueToYourSubAccountingInstructionsToTheAgent);
		codesByName.put(DividendReinvestmentAllocationOfCashInLieuOfFractions.getCodeName().get(), DividendReinvestmentAllocationOfCashInLieuOfFractions);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomer);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourCustomerLateTransfer);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselves);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourGoodselvesLateTransfer);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourNominee);
		codesByName.put(DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer.getCodeName().get(), DTCCClaimAgainstRegisteredHolderInTheNameOfYourNomineeLateTransfer);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourCustomer);
		codesByName.put(DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves.getCodeName().get(), DTCCClaimOnRegisteredHolderInTheNameOfYourGoodselves);
		codesByName.put(DueBill.getCodeName().get(), DueBill);
		codesByName.put(DueBillFailTracking.getCodeName().get(), DueBillFailTracking);
		codesByName.put(DueBillReversal.getCodeName().get(), DueBillReversal);
		codesByName.put(DWACAdjustment.getCodeName().get(), DWACAdjustment);
		codesByName.put(DWACBuyBackWithdrawal.getCodeName().get(), DWACBuyBackWithdrawal);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtExemptRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtExemptRate);
		codesByName.put(ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate.getCodeName().get(), ForeignCashDividendsOrBondInterestAllocationAtUnfavorableRate);
		codesByName.put(ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate.getCodeName().get(), ForeignCashDividendsOrBondsInterestAllocationAtFavorableRate);
		codesByName.put(ForeignCashDividendUnfavorableRate.getCodeName().get(), ForeignCashDividendUnfavorableRate);
		codesByName.put(FractionalRights.getCodeName().get(), FractionalRights);
		codesByName.put(FrenchWithholdingTax10Percent.getCodeName().get(), FrenchWithholdingTax10Percent);
		codesByName.put(FrenchWithholdingTax15Percent.getCodeName().get(), FrenchWithholdingTax15Percent);
		codesByName.put(FrenchWithholdingTax25Percent.getCodeName().get(), FrenchWithholdingTax25Percent);
		codesByName.put(FrozenLetterMovement.getCodeName().get(), FrozenLetterMovement);
		codesByName.put(GracePeriod.getCodeName().get(), GracePeriod);
		codesByName.put(InLieuOfReorgDepositActivity.getCodeName().get(), InLieuOfReorgDepositActivity);
		codesByName.put(InSettlementOfATradeDTCCReorgAccount.getCodeName().get(), InSettlementOfATradeDTCCReorgAccount);
		codesByName.put(InterestAdjustedDueToEarlyWithdrawal.getCodeName().get(), InterestAdjustedDueToEarlyWithdrawal);
		codesByName.put(InterestAllocatedInError.getCodeName().get(), InterestAllocatedInError);
		codesByName.put(InterestDueWasErroneouslyPaidToYouByTheIssuer.getCodeName().get(), InterestDueWasErroneouslyPaidToYouByTheIssuer);
		codesByName.put(InterestorDividendDueOnConversion.getCodeName().get(), InterestorDividendDueOnConversion);
		codesByName.put(InterestOrDividendDueOnMerger.getCodeName().get(), InterestOrDividendDueOnMerger);
		codesByName.put(InterestOrDividendDueOnRedemption.getCodeName().get(), InterestOrDividendDueOnRedemption);
		codesByName.put(InterestOrDividendDueOnRepaymentOption.getCodeName().get(), InterestOrDividendDueOnRepaymentOption);
		codesByName.put(InterestOrDividendDueOnTender.getCodeName().get(), InterestOrDividendDueOnTender);
		codesByName.put(InterestPaysAtMaturity.getCodeName().get(), InterestPaysAtMaturity);
		codesByName.put(InterimPositionAdjustedForDeliverOrderActivity.getCodeName().get(), InterimPositionAdjustedForDeliverOrderActivity);
		codesByName.put(InvestmentIdAdjustment.getCodeName().get(), InvestmentIdAdjustment);
		codesByName.put(IssueInDefault.getCodeName().get(), IssueInDefault);
		codesByName.put(LateAnnouncement.getCodeName().get(), LateAnnouncement);
		codesByName.put(LateAnnouncementActivityDueBillActivity.getCodeName().get(), LateAnnouncementActivityDueBillActivity);
		codesByName.put(LostCertificateRegisteredInTheNameOfYourGoodselves.getCodeName().get(), LostCertificateRegisteredInTheNameOfYourGoodselves);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourCustomer.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourCustomer);
		codesByName.put(LostCertificateWasRegisteredInTheNameOfYourNominee.getCodeName().get(), LostCertificateWasRegisteredInTheNameOfYourNominee);
		codesByName.put(MidwestDepository.getCodeName().get(), MidwestDepository);
		codesByName.put(MuniBearerBond.getCodeName().get(), MuniBearerBond);
		codesByName.put(MuniBearerBondCoupon.getCodeName().get(), MuniBearerBondCoupon);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsDepositedOn);
		codesByName.put(MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn.getCodeName().get(), MuniBearerBondCouponAdjustmentExcessCouponsWithdrawnOn);
		codesByName.put(MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit.getCodeName().get(), MuniBearerBondCouponAdjustmentForCouponsMissingFromaDeposit);
		codesByName.put(MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal.getCodeName().get(), MuniBearerBondCouponAdjustmentForCouponsMissingFromaWithdrawal);
		codesByName.put(MuniBearerBondCouponPositionAdjustedForDepositActivity.getCodeName().get(), MuniBearerBondCouponPositionAdjustedForDepositActivity);
		codesByName.put(NonAllocation.getCodeName().get(), NonAllocation);
		codesByName.put(OptionalDividendAllocationAdjustment.getCodeName().get(), OptionalDividendAllocationAdjustment);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(PacificDepository.getCodeName().get(), PacificDepository);
		codesByName.put(PartClaimPayment.getCodeName().get(), PartClaimPayment);
		codesByName.put(PartClaimReversal.getCodeName().get(), PartClaimReversal);
		codesByName.put(PaymentOfFullAvoidFiscalTaxRefund.getCodeName().get(), PaymentOfFullAvoidFiscalTaxRefund);
		codesByName.put(PaymentOfPartialAvoidFiscalTaxRefund.getCodeName().get(), PaymentOfPartialAvoidFiscalTaxRefund);
		codesByName.put(PaynInKindDistribution.getCodeName().get(), PaynInKindDistribution);
		codesByName.put(PhiladelphiaDepository.getCodeName().get(), PhiladelphiaDepository);
		codesByName.put(PledgeAdjustment.getCodeName().get(), PledgeAdjustment);
		codesByName.put(PledgeReleaseAdjustment.getCodeName().get(), PledgeReleaseAdjustment);
		codesByName.put(PositionAdjustedForDepositActivity.getCodeName().get(), PositionAdjustedForDepositActivity);
		codesByName.put(PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers.getCodeName().get(), PositionReinstatedCertificatesIssuedAndOutstandingInTheNameOfYourCustomers);
		codesByName.put(PostDateChangeForFailTracking.getCodeName().get(), PostDateChangeForFailTracking);
		codesByName.put(PreviouslyCalledCertificatesFundsDelivery.getCodeName().get(), PreviouslyCalledCertificatesFundsDelivery);
		codesByName.put(PriceCorrectionDividendReinvestment.getCodeName().get(), PriceCorrectionDividendReinvestment);
		codesByName.put(ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount.getCodeName().get(), ProceedsFromBuyTransactionInOurDTCCDividendTradingAccount);
		codesByName.put(ProceedsFromSaleOf.getCodeName().get(), ProceedsFromSaleOf);
		codesByName.put(ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount.getCodeName().get(), ProceedsResultingFromaASellTransactionAffectedInOurDTCCDividendTradingAccount);
		codesByName.put(RateChange.getCodeName().get(), RateChange);
		codesByName.put(RateRevision.getCodeName().get(), RateRevision);
		codesByName.put(RateUnknown.getCodeName().get(), RateUnknown);
		codesByName.put(RecordDatePositionAdjustedForaWithdrawalByTransfer.getCodeName().get(), RecordDatePositionAdjustedForaWithdrawalByTransfer);
		codesByName.put(RedemptionAdjustment.getCodeName().get(), RedemptionAdjustment);
		codesByName.put(RedemptionCash.getCodeName().get(), RedemptionCash);
		codesByName.put(RedemptionPaymentDueToPledgeRelease.getCodeName().get(), RedemptionPaymentDueToPledgeRelease);
		codesByName.put(RefundedTaxRate.getCodeName().get(), RefundedTaxRate);
		codesByName.put(RefundOfFrenchTaxJuly.getCodeName().get(), RefundOfFrenchTaxJuly);
		codesByName.put(RefundOfFrenchTaxJune.getCodeName().get(), RefundOfFrenchTaxJune);
		codesByName.put(Reinstate.getCodeName().get(), Reinstate);
		codesByName.put(ReorganizationAdjustment.getCodeName().get(), ReorganizationAdjustment);
		codesByName.put(TaxExemptInstructions.getCodeName().get(), TaxExemptInstructions);
		codesByName.put(TenderFeeDeduction.getCodeName().get(), TenderFeeDeduction);
		codesByName.put(UnfavorableRateMerger.getCodeName().get(), UnfavorableRateMerger);
		codesByName.put(UninsuredInterestWithheld.getCodeName().get(), UninsuredInterestWithheld);
		codesByName.put(VodaphoneADR.getCodeName().get(), VodaphoneADR);
		codesByName.put(WithdrawalTransferAdjustment.getCodeName().get(), WithdrawalTransferAdjustment);
		codesByName.put(WithdrawalTransferBuyBackWithdrawal.getCodeName().get(), WithdrawalTransferBuyBackWithdrawal);
		codesByName.put(WithholdingTaxAdjustmentInUserDefinedCountry.getCodeName().get(), WithholdingTaxAdjustmentInUserDefinedCountry);
		codesByName.put(WriteOffReorganization.getCodeName().get(), WriteOffReorganization);
		codesByName.put(WrongRatePrincipal.getCodeName().get(), WrongRatePrincipal);
	}

	public static DTCAdjustmentPaymentSubReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCAdjustmentPaymentSubReason1Code[] values() {
		DTCAdjustmentPaymentSubReason1Code[] values = new DTCAdjustmentPaymentSubReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCAdjustmentPaymentSubReason1Code> {
		@Override
		public DTCAdjustmentPaymentSubReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCAdjustmentPaymentSubReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}