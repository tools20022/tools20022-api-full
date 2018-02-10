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
import com.tools20022.repository.codeset.InstructionRejectionReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Reason for rejection of a corporate action instruction or of an instruction
 * cancellation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#AcknowledgementNotAgreed
 * InstructionRejectionReason1Code.AcknowledgementNotAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#AcknowledgmentIndicatorMissing
 * InstructionRejectionReason1Code.AcknowledgmentIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BidPriceMissingOrInvalid
 * InstructionRejectionReason1Code.BidPriceMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BidPriceOverflow
 * InstructionRejectionReason1Code.BidPriceOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BidPriceUnderMinimumAllowed
 * InstructionRejectionReason1Code.BidPriceUnderMinimumAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BondCheckOnMasterTableNotAvailable
 * InstructionRejectionReason1Code.BondCheckOnMasterTableNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition1InvalidMustBeNo
 * InstructionRejectionReason1Code.Condition1InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition2InvalidMustBeNo
 * InstructionRejectionReason1Code.Condition2InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition1Required
 * InstructionRejectionReason1Code.Condition1Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition1InvalidMustBeYes
 * InstructionRejectionReason1Code.Condition1InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BidPriceZeroesRequired
 * InstructionRejectionReason1Code.BidPriceZeroesRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BidPriceOverMaximumAllowed
 * InstructionRejectionReason1Code.BidPriceOverMaximumAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition2InvalidMustBeYes
 * InstructionRejectionReason1Code.Condition2InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition2Required
 * InstructionRejectionReason1Code.Condition2Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition3InvalidMustBeNo
 * InstructionRejectionReason1Code.Condition3InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition3InvalidMustBeYes
 * InstructionRejectionReason1Code.Condition3InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition3Required
 * InstructionRejectionReason1Code.Condition3Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition4InvalidMustBeNo
 * InstructionRejectionReason1Code.Condition4InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition4InvalidMustBeYes
 * InstructionRejectionReason1Code.Condition4InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition4Required
 * InstructionRejectionReason1Code.Condition4Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition5InvalidMustBeYes
 * InstructionRejectionReason1Code.Condition5InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition5InvalidMustBeNo
 * InstructionRejectionReason1Code.Condition5InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition5Required
 * InstructionRejectionReason1Code.Condition5Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition6InvalidMustBeNo
 * InstructionRejectionReason1Code.Condition6InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition6InvalidMustBeYes
 * InstructionRejectionReason1Code.Condition6InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#Condition6Required
 * InstructionRejectionReason1Code.Condition6Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ConditionalQuantityCannotBeZero
 * InstructionRejectionReason1Code.ConditionalQuantityCannotBeZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ConditionalQuantityDoesNotEqualTransactionQuantity
 * InstructionRejectionReason1Code.
 * ConditionalQuantityDoesNotEqualTransactionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ConditionalQuantityExceedsTransactionQuantity
 * InstructionRejectionReason1Code.ConditionalQuantityExceedsTransactionQuantity
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ConditionalQuantityMissingOrInvalid
 * InstructionRejectionReason1Code.ConditionalQuantityMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ConditionalQuantityZeroesRequired
 * InstructionRejectionReason1Code.ConditionalQuantityZeroesRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ContactNameMissing
 * InstructionRejectionReason1Code.ContactNameMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ContactNameNotUsedWithEvent
 * InstructionRejectionReason1Code.ContactNameNotUsedWithEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ContactPhoneNumberMissing
 * InstructionRejectionReason1Code.ContactPhoneNumberMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ContactPhoneNumberNotUsedWithEvent
 * InstructionRejectionReason1Code.ContactPhoneNumberNotUsedWithEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CoverQuantityGreaterThanProtectQuantity
 * InstructionRejectionReason1Code.CoverQuantityGreaterThanProtectQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CUSIPDepositoryDeliverChilled
 * InstructionRejectionReason1Code.CUSIPDepositoryDeliverChilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CUSIPNotDTCEligible
 * InstructionRejectionReason1Code.CUSIPNotDTCEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CustomerIdentificationMissingOrInvalid
 * InstructionRejectionReason1Code.CustomerIdentificationMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CustomerQuantitiesAndTotalRightsQuantitiesMismatch
 * InstructionRejectionReason1Code.
 * CustomerQuantitiesAndTotalRightsQuantitiesMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CommentAreaInvalid
 * InstructionRejectionReason1Code.CommentAreaInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CorporateActionEventInvalid
 * InstructionRejectionReason1Code.CorporateActionEventInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CustomerSequenceNumberInvalid
 * InstructionRejectionReason1Code.CustomerSequenceNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OfferNotATOPEligible
 * InstructionRejectionReason1Code.OfferNotATOPEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid
 * InstructionRejectionReason1Code.
 * AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing
 * InstructionRejectionReason1Code.
 * AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BeneficialOwnerDeathDateMissing
 * InstructionRejectionReason1Code.BeneficialOwnerDeathDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#BeneficialOwnerNameMissing
 * InstructionRejectionReason1Code.BeneficialOwnerNameMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CertificateNameMissing
 * InstructionRejectionReason1Code.CertificateNameMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CertificateNumberInvalid
 * InstructionRejectionReason1Code.CertificateNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CertificateSequenceNumberInvalid
 * InstructionRejectionReason1Code.CertificateSequenceNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference
 * InstructionRejectionReason1Code.
 * CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CoreInstructionQuantityAndExtensionTransactionDetailsDifference
 * InstructionRejectionReason1Code.
 * CoreInstructionQuantityAndExtensionTransactionDetailsDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CurrentDatePassedProtectSubmissionEndDate
 * InstructionRejectionReason1Code.CurrentDatePassedProtectSubmissionEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CurrentDatePrecedesProtectSubmissionStartDate
 * InstructionRejectionReason1Code.CurrentDatePrecedesProtectSubmissionStartDate
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CUSIPMissingOrInvalid
 * InstructionRejectionReason1Code.CUSIPMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CustomerAndTotalOversubscriptionQuantitiesMismatch
 * InstructionRejectionReason1Code.
 * CustomerAndTotalOversubscriptionQuantitiesMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CustomerSequenceNumberAllZero
 * InstructionRejectionReason1Code.CustomerSequenceNumberAllZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CutoffTimeCheckFailed
 * InstructionRejectionReason1Code.CutoffTimeCheckFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#CutoffTimePassed
 * InstructionRejectionReason1Code.CutoffTimePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#DeathCertificateMissing
 * InstructionRejectionReason1Code.DeathCertificateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#DuplicateTransactionSequenceNumber
 * InstructionRejectionReason1Code.DuplicateTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#EntryDateInvalid
 * InstructionRejectionReason1Code.EntryDateInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#EntryDatePassed
 * InstructionRejectionReason1Code.EntryDatePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#FractionalUnderlyingQuantity
 * InstructionRejectionReason1Code.FractionalUnderlyingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#FunctionNotAvailable
 * InstructionRejectionReason1Code.FunctionNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#FunctionQuiesced
 * InstructionRejectionReason1Code.FunctionQuiesced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#InstructionDeletionAcknowledgementIndicatorInvalid
 * InstructionRejectionReason1Code.
 * InstructionDeletionAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#InstructionDeletionAcknowledgementIndicatorMissing
 * InstructionRejectionReason1Code.
 * InstructionDeletionAcknowledgementIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#InsufficientPosition
 * InstructionRejectionReason1Code.InsufficientPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RecordTypeInvalid
 * InstructionRejectionReason1Code.RecordTypeInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RightsQuantityInvalid
 * InstructionRejectionReason1Code.RightsQuantityInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionTypeInvalid
 * InstructionRejectionReason1Code.TransactionTypeInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#IssuingJurisdictionMissing
 * InstructionRejectionReason1Code.IssuingJurisdictionMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#KayDataNotFound
 * InstructionRejectionReason1Code.KayDataNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#KeyInformationMissing
 * InstructionRejectionReason1Code.KeyInformationMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid
 * InstructionRejectionReason1Code.
 * LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing
 * InstructionRejectionReason1Code.
 * LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#MasterTablesNotAvailable
 * InstructionRejectionReason1Code.MasterTablesNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#NoWithdrawalPrivilege
 * InstructionRejectionReason1Code.NoWithdrawalPrivilege}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OddLotIndicatorMissingOrInvalid
 * InstructionRejectionReason1Code.OddLotIndicatorMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OfferInDatabase
 * InstructionRejectionReason1Code.OfferInDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OfferNotEligibleForPuts
 * InstructionRejectionReason1Code.OfferNotEligibleForPuts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OversubscriptionNotAllowed
 * InstructionRejectionReason1Code.OversubscriptionNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OversubscriptionQuantityExceeded
 * InstructionRejectionReason1Code.OversubscriptionQuantityExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OversubscriptionQuantityInvalid
 * InstructionRejectionReason1Code.OversubscriptionQuantityInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OversubscriptionQuantityNotUsed
 * InstructionRejectionReason1Code.OversubscriptionQuantityNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ParticipantDOChilled
 * InstructionRejectionReason1Code.ParticipantDOChilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#OddLotIndicatorYesInvalid
 * InstructionRejectionReason1Code.OddLotIndicatorYesInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#WithdrawError
 * InstructionRejectionReason1Code.WithdrawError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#WithdrawalTransactionQuantityCannotBeZero
 * InstructionRejectionReason1Code.WithdrawalTransactionQuantityCannotBeZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#WithdrawalQuantityGreaterThanProtectQuantity
 * InstructionRejectionReason1Code.WithdrawalQuantityGreaterThanProtectQuantity}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#WithdrawalQuantityExceedsRemainingQuantity
 * InstructionRejectionReason1Code.WithdrawalQuantityExceedsRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#WarrantSubscriptionChargeAmountInvalid
 * InstructionRejectionReason1Code.WarrantSubscriptionChargeAmountInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#UnknownErrorCondition
 * InstructionRejectionReason1Code.UnknownErrorCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#UnderlyingShareQuantityMismatch
 * InstructionRejectionReason1Code.UnderlyingShareQuantityMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#UnderlyingShareQuantityInvalid
 * InstructionRejectionReason1Code.UnderlyingShareQuantityInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#UnderlyingSecurityCUSIPMismatch
 * InstructionRejectionReason1Code.UnderlyingSecurityCUSIPMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#UnderlyingSecurityCUSIPInvalid
 * InstructionRejectionReason1Code.UnderlyingSecurityCUSIPInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionTypeMissing
 * InstructionRejectionReason1Code.TransactionTypeMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionTypeAndEventIncompatible
 * InstructionRejectionReason1Code.TransactionTypeAndEventIncompatible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionSequenceNumberInvalid
 * InstructionRejectionReason1Code.TransactionSequenceNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionQuantityLessThanTransactionMinimum
 * InstructionRejectionReason1Code.TransactionQuantityLessThanTransactionMinimum
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SubmissionDatePassed
 * InstructionRejectionReason1Code.SubmissionDatePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SolicitationFeeCommentsRequired
 * InstructionRejectionReason1Code.SolicitationFeeCommentsRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SequenceNumberOutOfSync
 * InstructionRejectionReason1Code.SequenceNumberOutOfSync}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SequenceNumberMissing
 * InstructionRejectionReason1Code.SequenceNumberMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SequenceNumberInvalidBounds
 * InstructionRejectionReason1Code.SequenceNumberInvalidBounds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RTSProcessingInProgress
 * InstructionRejectionReason1Code.RTSProcessingInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RightsRatioNotFound
 * InstructionRejectionReason1Code.RightsRatioNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RightsQuantityDivisibleByRights
 * InstructionRejectionReason1Code.RightsQuantityDivisibleByRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RightsCUSIPInsufficientPosition
 * InstructionRejectionReason1Code.RightsCUSIPInsufficientPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionQuantityMissingOrInvalid
 * InstructionRejectionReason1Code.TransactionQuantityMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionQuantityCannotBeZero
 * InstructionRejectionReason1Code.TransactionQuantityCannotBeZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#TransactionIdentificationInvalid
 * InstructionRejectionReason1Code.TransactionIdentificationInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SubmissionDateNotReached
 * InstructionRejectionReason1Code.SubmissionDateNotReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SolicitationFeeIndicatorNotUsed
 * InstructionRejectionReason1Code.SolicitationFeeIndicatorNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#SolicitationFeeIndicatorRequired
 * InstructionRejectionReason1Code.SolicitationFeeIndicatorRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#RightsPositionCheckInvalid
 * InstructionRejectionReason1Code.RightsPositionCheckInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ProvidedByProtect
 * InstructionRejectionReason1Code.ProvidedByProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ProtectIdentificationNotUsed
 * InstructionRejectionReason1Code.ProtectIdentificationNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ProtectIdentificationMissingOrInvalid
 * InstructionRejectionReason1Code.ProtectIdentificationMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ProtectDateZero
 * InstructionRejectionReason1Code.ProtectDateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ProtectDatePassed
 * InstructionRejectionReason1Code.ProtectDatePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ProtectDateInvalidOrMissing
 * InstructionRejectionReason1Code.ProtectDateInvalidOrMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#PotentiaLossAcknowledgementIndicatorMissing
 * InstructionRejectionReason1Code.PotentiaLossAcknowledgementIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#PotentiaLossAcknowledgementIndicatorInvalid
 * InstructionRejectionReason1Code.PotentiaLossAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ParticipantNumberInvalid
 * InstructionRejectionReason1Code.ParticipantNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ParticipantNoMatchOnProtectIdentification
 * InstructionRejectionReason1Code.ParticipantNoMatchOnProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ParticipantLocked
 * InstructionRejectionReason1Code.ParticipantLocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ParticipantNotEligible
 * InstructionRejectionReason1Code.ParticipantNotEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#ParticipantEligibilityCheckNotAvailable
 * InstructionRejectionReason1Code.ParticipantEligibilityCheckNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code#WithdrawalTransactionTypeInvalid
 * InstructionRejectionReason1Code.WithdrawalTransactionTypeInvalid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
 * InstructionRejectionReasonCode}</li>
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
 * "InstructionRejectionReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason for rejection of a corporate action instruction or of an instruction cancellation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionRejectionReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementNotAgreed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code AcknowledgementNotAgreed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementNotAgreed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.AcknowledgementNotAgreed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgmentIndicatorMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code AcknowledgmentIndicatorMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgmentIndicatorMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.AcknowledgmentIndicatorMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BidPriceMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BidPriceMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceOverflow"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BidPriceOverflow = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceOverflow";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BidPriceOverflow.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceUnderMinimumAllowed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BidPriceUnderMinimumAllowed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceUnderMinimumAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BidPriceUnderMinimumAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondCheckOnMasterTableNotAvailable"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BondCheckOnMasterTableNotAvailable = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondCheckOnMasterTableNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BondCheckOnMasterTableNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1InvalidMustBeNo"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition1InvalidMustBeNo = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1InvalidMustBeNo";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition1InvalidMustBeNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2InvalidMustBeNo"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition2InvalidMustBeNo = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2InvalidMustBeNo";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition2InvalidMustBeNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1Required"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition1Required = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1Required";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition1Required.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1InvalidMustBeYes"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition1InvalidMustBeYes = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1InvalidMustBeYes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition1InvalidMustBeYes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceZeroesRequired"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BidPriceZeroesRequired = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceZeroesRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BidPriceZeroesRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceOverMaximumAllowed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BidPriceOverMaximumAllowed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceOverMaximumAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BidPriceOverMaximumAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2InvalidMustBeYes"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition2InvalidMustBeYes = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2InvalidMustBeYes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition2InvalidMustBeYes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2Required"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition2Required = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2Required";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition2Required.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3InvalidMustBeNo"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition3InvalidMustBeNo = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3InvalidMustBeNo";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition3InvalidMustBeNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3InvalidMustBeYes"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition3InvalidMustBeYes = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3InvalidMustBeYes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition3InvalidMustBeYes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3Required"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition3Required = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3Required";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition3Required.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4InvalidMustBeNo"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition4InvalidMustBeNo = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4InvalidMustBeNo";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition4InvalidMustBeNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4InvalidMustBeYes"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition4InvalidMustBeYes = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4InvalidMustBeYes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition4InvalidMustBeYes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4Required"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition4Required = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4Required";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition4Required.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5InvalidMustBeYes"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition5InvalidMustBeYes = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5InvalidMustBeYes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition5InvalidMustBeYes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5InvalidMustBeNo"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition5InvalidMustBeNo = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5InvalidMustBeNo";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition5InvalidMustBeNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5Required"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition5Required = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5Required";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition5Required.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6InvalidMustBeNo"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition6InvalidMustBeNo = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6InvalidMustBeNo";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition6InvalidMustBeNo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6InvalidMustBeYes"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition6InvalidMustBeYes = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6InvalidMustBeYes";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition6InvalidMustBeYes.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6Required"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code Condition6Required = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6Required";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.Condition6Required.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityCannotBeZero"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ConditionalQuantityCannotBeZero = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityCannotBeZero";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ConditionalQuantityCannotBeZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityDoesNotEqualTransactionQuantity"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ConditionalQuantityDoesNotEqualTransactionQuantity = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityDoesNotEqualTransactionQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ConditionalQuantityDoesNotEqualTransactionQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityExceedsTransactionQuantity"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ConditionalQuantityExceedsTransactionQuantity = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityExceedsTransactionQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ConditionalQuantityExceedsTransactionQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ConditionalQuantityMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ConditionalQuantityMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityZeroesRequired"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ConditionalQuantityZeroesRequired = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityZeroesRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ConditionalQuantityZeroesRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactNameMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ContactNameMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactNameMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ContactNameMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactNameNotUsedWithEvent"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ContactNameNotUsedWithEvent = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactNameNotUsedWithEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ContactNameNotUsedWithEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPhoneNumberMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ContactPhoneNumberMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPhoneNumberMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ContactPhoneNumberMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPhoneNumberNotUsedWithEvent"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ContactPhoneNumberNotUsedWithEvent = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPhoneNumberNotUsedWithEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ContactPhoneNumberNotUsedWithEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverQuantityGreaterThanProtectQuantity"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CoverQuantityGreaterThanProtectQuantity = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverQuantityGreaterThanProtectQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CoverQuantityGreaterThanProtectQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPDepositoryDeliverChilled"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CUSIPDepositoryDeliverChilled = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPDepositoryDeliverChilled";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CUSIPDepositoryDeliverChilled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPNotDTCEligible"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CUSIPNotDTCEligible = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPNotDTCEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CUSIPNotDTCEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentificationMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CustomerIdentificationMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentificationMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CustomerIdentificationMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerQuantitiesAndTotalRightsQuantitiesMismatch"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CustomerQuantitiesAndTotalRightsQuantitiesMismatch = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerQuantitiesAndTotalRightsQuantitiesMismatch";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CustomerQuantitiesAndTotalRightsQuantitiesMismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommentAreaInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CommentAreaInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommentAreaInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CommentAreaInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CorporateActionEventInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CorporateActionEventInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerSequenceNumberInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CustomerSequenceNumberInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerSequenceNumberInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CustomerSequenceNumberInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferNotATOPEligible"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OfferNotATOPEligible = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferNotATOPEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OfferNotATOPEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDeathDateMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BeneficialOwnerDeathDateMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDeathDateMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BeneficialOwnerDeathDateMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerNameMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code BeneficialOwnerNameMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerNameMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.BeneficialOwnerNameMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNameMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CertificateNameMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNameMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CertificateNameMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumberInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CertificateNumberInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumberInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CertificateNumberInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateSequenceNumberInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CertificateSequenceNumberInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateSequenceNumberInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CertificateSequenceNumberInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference"
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoreInstructionQuantityAndExtensionTransactionDetailsDifference"
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CoreInstructionQuantityAndExtensionTransactionDetailsDifference = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoreInstructionQuantityAndExtensionTransactionDetailsDifference";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CoreInstructionQuantityAndExtensionTransactionDetailsDifference.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentDatePassedProtectSubmissionEndDate"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CurrentDatePassedProtectSubmissionEndDate = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentDatePassedProtectSubmissionEndDate";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CurrentDatePassedProtectSubmissionEndDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentDatePrecedesProtectSubmissionStartDate"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CurrentDatePrecedesProtectSubmissionStartDate = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentDatePrecedesProtectSubmissionStartDate";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CurrentDatePrecedesProtectSubmissionStartDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CUSIPMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CUSIPMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerAndTotalOversubscriptionQuantitiesMismatch"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CustomerAndTotalOversubscriptionQuantitiesMismatch = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerAndTotalOversubscriptionQuantitiesMismatch";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CustomerAndTotalOversubscriptionQuantitiesMismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerSequenceNumberAllZero"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CustomerSequenceNumberAllZero = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerSequenceNumberAllZero";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CustomerSequenceNumberAllZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoffTimeCheckFailed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CutoffTimeCheckFailed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoffTimeCheckFailed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CutoffTimeCheckFailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoffTimePassed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code CutoffTimePassed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoffTimePassed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.CutoffTimePassed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathCertificateMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code DeathCertificateMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathCertificateMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.DeathCertificateMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateTransactionSequenceNumber"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code DuplicateTransactionSequenceNumber = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateTransactionSequenceNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.DuplicateTransactionSequenceNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDateInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code EntryDateInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDateInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.EntryDateInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDatePassed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code EntryDatePassed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDatePassed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.EntryDatePassed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalUnderlyingQuantity"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code FractionalUnderlyingQuantity = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalUnderlyingQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.FractionalUnderlyingQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FunctionNotAvailable"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code FunctionNotAvailable = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FunctionNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.FunctionNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FunctionQuiesced"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code FunctionQuiesced = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FunctionQuiesced";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.FunctionQuiesced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDeletionAcknowledgementIndicatorInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code InstructionDeletionAcknowledgementIndicatorInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDeletionAcknowledgementIndicatorInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.InstructionDeletionAcknowledgementIndicatorInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDeletionAcknowledgementIndicatorMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code InstructionDeletionAcknowledgementIndicatorMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDeletionAcknowledgementIndicatorMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.InstructionDeletionAcknowledgementIndicatorMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientPosition"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code InsufficientPosition = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.InsufficientPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordTypeInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RecordTypeInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordTypeInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RecordTypeInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsQuantityInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RightsQuantityInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsQuantityInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RightsQuantityInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionTypeInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionTypeInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingJurisdictionMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code IssuingJurisdictionMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingJurisdictionMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.IssuingJurisdictionMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KayDataNotFound"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code KayDataNotFound = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KayDataNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.KayDataNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyInformationMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code KeyInformationMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyInformationMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.KeyInformationMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTablesNotAvailable"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code MasterTablesNotAvailable = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTablesNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.MasterTablesNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoWithdrawalPrivilege"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code NoWithdrawalPrivilege = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoWithdrawalPrivilege";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.NoWithdrawalPrivilege.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotIndicatorMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OddLotIndicatorMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotIndicatorMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OddLotIndicatorMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferInDatabase"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OfferInDatabase = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferInDatabase";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OfferInDatabase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferNotEligibleForPuts"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OfferNotEligibleForPuts = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferNotEligibleForPuts";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OfferNotEligibleForPuts.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionNotAllowed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OversubscriptionNotAllowed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OversubscriptionNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantityExceeded"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OversubscriptionQuantityExceeded = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantityExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OversubscriptionQuantityExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantityInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OversubscriptionQuantityInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantityInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OversubscriptionQuantityInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantityNotUsed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OversubscriptionQuantityNotUsed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantityNotUsed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OversubscriptionQuantityNotUsed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantDOChilled"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ParticipantDOChilled = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantDOChilled";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ParticipantDOChilled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotIndicatorYesInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code OddLotIndicatorYesInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotIndicatorYesInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.OddLotIndicatorYesInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawError"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code WithdrawError = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawError";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.WithdrawError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransactionQuantityCannotBeZero"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code WithdrawalTransactionQuantityCannotBeZero = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransactionQuantityCannotBeZero";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.WithdrawalTransactionQuantityCannotBeZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalQuantityGreaterThanProtectQuantity"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code WithdrawalQuantityGreaterThanProtectQuantity = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalQuantityGreaterThanProtectQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.WithdrawalQuantityGreaterThanProtectQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalQuantityExceedsRemainingQuantity"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code WithdrawalQuantityExceedsRemainingQuantity = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalQuantityExceedsRemainingQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.WithdrawalQuantityExceedsRemainingQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantSubscriptionChargeAmountInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code WarrantSubscriptionChargeAmountInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantSubscriptionChargeAmountInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.WarrantSubscriptionChargeAmountInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownErrorCondition"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code UnknownErrorCondition = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownErrorCondition";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.UnknownErrorCondition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingShareQuantityMismatch"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code UnderlyingShareQuantityMismatch = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingShareQuantityMismatch";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.UnderlyingShareQuantityMismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingShareQuantityInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code UnderlyingShareQuantityInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingShareQuantityInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.UnderlyingShareQuantityInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurityCUSIPMismatch"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code UnderlyingSecurityCUSIPMismatch = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurityCUSIPMismatch";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.UnderlyingSecurityCUSIPMismatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurityCUSIPInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code UnderlyingSecurityCUSIPInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurityCUSIPInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.UnderlyingSecurityCUSIPInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionTypeMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionTypeMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeAndEventIncompatible"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionTypeAndEventIncompatible = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndEventIncompatible";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionTypeAndEventIncompatible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumberInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionSequenceNumberInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumberInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionSequenceNumberInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantityLessThanTransactionMinimum"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionQuantityLessThanTransactionMinimum = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantityLessThanTransactionMinimum";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionQuantityLessThanTransactionMinimum.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDatePassed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SubmissionDatePassed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDatePassed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SubmissionDatePassed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeCommentsRequired"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SolicitationFeeCommentsRequired = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeCommentsRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SolicitationFeeCommentsRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberOutOfSync"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SequenceNumberOutOfSync = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberOutOfSync";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SequenceNumberOutOfSync.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SequenceNumberMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SequenceNumberMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberInvalidBounds"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SequenceNumberInvalidBounds = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberInvalidBounds";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SequenceNumberInvalidBounds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTSProcessingInProgress"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RTSProcessingInProgress = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTSProcessingInProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RTSProcessingInProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsRatioNotFound"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RightsRatioNotFound = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsRatioNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RightsRatioNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsQuantityDivisibleByRights"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RightsQuantityDivisibleByRights = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsQuantityDivisibleByRights";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RightsQuantityDivisibleByRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsCUSIPInsufficientPosition"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RightsCUSIPInsufficientPosition = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsCUSIPInsufficientPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RightsCUSIPInsufficientPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantityMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionQuantityMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantityMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionQuantityMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantityCannotBeZero"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionQuantityCannotBeZero = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantityCannotBeZero";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionQuantityCannotBeZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code TransactionIdentificationInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.TransactionIdentificationInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateNotReached"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SubmissionDateNotReached = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDateNotReached";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SubmissionDateNotReached.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeIndicatorNotUsed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SolicitationFeeIndicatorNotUsed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeIndicatorNotUsed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SolicitationFeeIndicatorNotUsed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeIndicatorRequired"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code SolicitationFeeIndicatorRequired = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeIndicatorRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.SolicitationFeeIndicatorRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsPositionCheckInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code RightsPositionCheckInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsPositionCheckInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.RightsPositionCheckInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvidedByProtect"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ProvidedByProtect = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvidedByProtect";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ProvidedByProtect.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationNotUsed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ProtectIdentificationNotUsed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationNotUsed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ProtectIdentificationNotUsed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationMissingOrInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ProtectIdentificationMissingOrInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationMissingOrInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ProtectIdentificationMissingOrInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDateZero"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ProtectDateZero = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDateZero";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ProtectDateZero.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDatePassed"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ProtectDatePassed = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDatePassed";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ProtectDatePassed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDateInvalidOrMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ProtectDateInvalidOrMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDateInvalidOrMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ProtectDateInvalidOrMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentiaLossAcknowledgementIndicatorMissing"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code PotentiaLossAcknowledgementIndicatorMissing = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentiaLossAcknowledgementIndicatorMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.PotentiaLossAcknowledgementIndicatorMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentiaLossAcknowledgementIndicatorInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code PotentiaLossAcknowledgementIndicatorInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentiaLossAcknowledgementIndicatorInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.PotentiaLossAcknowledgementIndicatorInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNumberInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ParticipantNumberInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNumberInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ParticipantNumberInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNoMatchOnProtectIdentification"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ParticipantNoMatchOnProtectIdentification = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNoMatchOnProtectIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ParticipantNoMatchOnProtectIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantLocked"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ParticipantLocked = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantLocked";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ParticipantLocked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNotEligible"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ParticipantNotEligible = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNotEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ParticipantNotEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantEligibilityCheckNotAvailable"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code ParticipantEligibilityCheckNotAvailable = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantEligibilityCheckNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.ParticipantEligibilityCheckNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
	 * InstructionRejectionReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransactionTypeInvalid"</li>
	 * </ul>
	 */
	public static final InstructionRejectionReason1Code WithdrawalTransactionTypeInvalid = new InstructionRejectionReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransactionTypeInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReason1Code.mmObject();
			codeName = InstructionRejectionReasonCode.WithdrawalTransactionTypeInvalid.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InstructionRejectionReason1Code> codesByName = new LinkedHashMap<>();

	protected InstructionRejectionReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionRejectionReason1Code";
				definition = "Reason for rejection of a corporate action instruction or of an instruction cancellation.";
				trace_lazy = () -> InstructionRejectionReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionRejectionReason1Code.AcknowledgementNotAgreed, com.tools20022.repository.codeset.InstructionRejectionReason1Code.AcknowledgmentIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.BidPriceMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.BidPriceOverflow,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.BidPriceUnderMinimumAllowed, com.tools20022.repository.codeset.InstructionRejectionReason1Code.BondCheckOnMasterTableNotAvailable,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition1InvalidMustBeNo, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition2InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition1Required, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition1InvalidMustBeYes,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.BidPriceZeroesRequired, com.tools20022.repository.codeset.InstructionRejectionReason1Code.BidPriceOverMaximumAllowed,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition2InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition2Required,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition3InvalidMustBeNo, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition3InvalidMustBeYes,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition3Required, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition4InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition4InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition4Required,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition5InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition5InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition5Required, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition6InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition6InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReason1Code.Condition6Required,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ConditionalQuantityCannotBeZero,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ConditionalQuantityDoesNotEqualTransactionQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ConditionalQuantityExceedsTransactionQuantity, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ConditionalQuantityMissingOrInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ConditionalQuantityZeroesRequired, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ContactNameMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ContactNameNotUsedWithEvent, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ContactPhoneNumberMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ContactPhoneNumberNotUsedWithEvent, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CoverQuantityGreaterThanProtectQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CUSIPDepositoryDeliverChilled, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CUSIPNotDTCEligible,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CustomerIdentificationMissingOrInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CustomerQuantitiesAndTotalRightsQuantitiesMismatch, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CommentAreaInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CorporateActionEventInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CustomerSequenceNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.OfferNotATOPEligible, com.tools20022.repository.codeset.InstructionRejectionReason1Code.AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.BeneficialOwnerDeathDateMissing, com.tools20022.repository.codeset.InstructionRejectionReason1Code.BeneficialOwnerNameMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CertificateNameMissing, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CertificateNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CertificateSequenceNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CoreInstructionQuantityAndExtensionTransactionDetailsDifference,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CurrentDatePassedProtectSubmissionEndDate,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CurrentDatePrecedesProtectSubmissionStartDate, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CUSIPMissingOrInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CustomerAndTotalOversubscriptionQuantitiesMismatch, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CustomerSequenceNumberAllZero,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.CutoffTimeCheckFailed, com.tools20022.repository.codeset.InstructionRejectionReason1Code.CutoffTimePassed,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.DeathCertificateMissing, com.tools20022.repository.codeset.InstructionRejectionReason1Code.DuplicateTransactionSequenceNumber,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.EntryDateInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.EntryDatePassed,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.FractionalUnderlyingQuantity, com.tools20022.repository.codeset.InstructionRejectionReason1Code.FunctionNotAvailable,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.FunctionQuiesced, com.tools20022.repository.codeset.InstructionRejectionReason1Code.InstructionDeletionAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.InstructionDeletionAcknowledgementIndicatorMissing, com.tools20022.repository.codeset.InstructionRejectionReason1Code.InsufficientPosition,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.RecordTypeInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.RightsQuantityInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionTypeInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.IssuingJurisdictionMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.KayDataNotFound, com.tools20022.repository.codeset.InstructionRejectionReason1Code.KeyInformationMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.MasterTablesNotAvailable, com.tools20022.repository.codeset.InstructionRejectionReason1Code.NoWithdrawalPrivilege,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.OddLotIndicatorMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.OfferInDatabase,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.OfferNotEligibleForPuts, com.tools20022.repository.codeset.InstructionRejectionReason1Code.OversubscriptionNotAllowed,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.OversubscriptionQuantityExceeded, com.tools20022.repository.codeset.InstructionRejectionReason1Code.OversubscriptionQuantityInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.OversubscriptionQuantityNotUsed, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ParticipantDOChilled,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.OddLotIndicatorYesInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.WithdrawError,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.WithdrawalTransactionQuantityCannotBeZero,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.WithdrawalQuantityGreaterThanProtectQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.WithdrawalQuantityExceedsRemainingQuantity, com.tools20022.repository.codeset.InstructionRejectionReason1Code.WarrantSubscriptionChargeAmountInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.UnknownErrorCondition, com.tools20022.repository.codeset.InstructionRejectionReason1Code.UnderlyingShareQuantityMismatch,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.UnderlyingShareQuantityInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.UnderlyingSecurityCUSIPMismatch,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.UnderlyingSecurityCUSIPInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionTypeMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionTypeAndEventIncompatible, com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionSequenceNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionQuantityLessThanTransactionMinimum, com.tools20022.repository.codeset.InstructionRejectionReason1Code.SubmissionDatePassed,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.SolicitationFeeCommentsRequired, com.tools20022.repository.codeset.InstructionRejectionReason1Code.SequenceNumberOutOfSync,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.SequenceNumberMissing, com.tools20022.repository.codeset.InstructionRejectionReason1Code.SequenceNumberInvalidBounds,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.RTSProcessingInProgress, com.tools20022.repository.codeset.InstructionRejectionReason1Code.RightsRatioNotFound,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.RightsQuantityDivisibleByRights, com.tools20022.repository.codeset.InstructionRejectionReason1Code.RightsCUSIPInsufficientPosition,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionQuantityMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionQuantityCannotBeZero,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.TransactionIdentificationInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.SubmissionDateNotReached,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.SolicitationFeeIndicatorNotUsed, com.tools20022.repository.codeset.InstructionRejectionReason1Code.SolicitationFeeIndicatorRequired,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.RightsPositionCheckInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ProvidedByProtect,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ProtectIdentificationNotUsed, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ProtectIdentificationMissingOrInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ProtectDateZero, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ProtectDatePassed,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ProtectDateInvalidOrMissing, com.tools20022.repository.codeset.InstructionRejectionReason1Code.PotentiaLossAcknowledgementIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.PotentiaLossAcknowledgementIndicatorInvalid, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ParticipantNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ParticipantNoMatchOnProtectIdentification, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ParticipantLocked,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.ParticipantNotEligible, com.tools20022.repository.codeset.InstructionRejectionReason1Code.ParticipantEligibilityCheckNotAvailable,
						com.tools20022.repository.codeset.InstructionRejectionReason1Code.WithdrawalTransactionTypeInvalid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcknowledgementNotAgreed.getCodeName().get(), AcknowledgementNotAgreed);
		codesByName.put(AcknowledgmentIndicatorMissing.getCodeName().get(), AcknowledgmentIndicatorMissing);
		codesByName.put(BidPriceMissingOrInvalid.getCodeName().get(), BidPriceMissingOrInvalid);
		codesByName.put(BidPriceOverflow.getCodeName().get(), BidPriceOverflow);
		codesByName.put(BidPriceUnderMinimumAllowed.getCodeName().get(), BidPriceUnderMinimumAllowed);
		codesByName.put(BondCheckOnMasterTableNotAvailable.getCodeName().get(), BondCheckOnMasterTableNotAvailable);
		codesByName.put(Condition1InvalidMustBeNo.getCodeName().get(), Condition1InvalidMustBeNo);
		codesByName.put(Condition2InvalidMustBeNo.getCodeName().get(), Condition2InvalidMustBeNo);
		codesByName.put(Condition1Required.getCodeName().get(), Condition1Required);
		codesByName.put(Condition1InvalidMustBeYes.getCodeName().get(), Condition1InvalidMustBeYes);
		codesByName.put(BidPriceZeroesRequired.getCodeName().get(), BidPriceZeroesRequired);
		codesByName.put(BidPriceOverMaximumAllowed.getCodeName().get(), BidPriceOverMaximumAllowed);
		codesByName.put(Condition2InvalidMustBeYes.getCodeName().get(), Condition2InvalidMustBeYes);
		codesByName.put(Condition2Required.getCodeName().get(), Condition2Required);
		codesByName.put(Condition3InvalidMustBeNo.getCodeName().get(), Condition3InvalidMustBeNo);
		codesByName.put(Condition3InvalidMustBeYes.getCodeName().get(), Condition3InvalidMustBeYes);
		codesByName.put(Condition3Required.getCodeName().get(), Condition3Required);
		codesByName.put(Condition4InvalidMustBeNo.getCodeName().get(), Condition4InvalidMustBeNo);
		codesByName.put(Condition4InvalidMustBeYes.getCodeName().get(), Condition4InvalidMustBeYes);
		codesByName.put(Condition4Required.getCodeName().get(), Condition4Required);
		codesByName.put(Condition5InvalidMustBeYes.getCodeName().get(), Condition5InvalidMustBeYes);
		codesByName.put(Condition5InvalidMustBeNo.getCodeName().get(), Condition5InvalidMustBeNo);
		codesByName.put(Condition5Required.getCodeName().get(), Condition5Required);
		codesByName.put(Condition6InvalidMustBeNo.getCodeName().get(), Condition6InvalidMustBeNo);
		codesByName.put(Condition6InvalidMustBeYes.getCodeName().get(), Condition6InvalidMustBeYes);
		codesByName.put(Condition6Required.getCodeName().get(), Condition6Required);
		codesByName.put(ConditionalQuantityCannotBeZero.getCodeName().get(), ConditionalQuantityCannotBeZero);
		codesByName.put(ConditionalQuantityDoesNotEqualTransactionQuantity.getCodeName().get(), ConditionalQuantityDoesNotEqualTransactionQuantity);
		codesByName.put(ConditionalQuantityExceedsTransactionQuantity.getCodeName().get(), ConditionalQuantityExceedsTransactionQuantity);
		codesByName.put(ConditionalQuantityMissingOrInvalid.getCodeName().get(), ConditionalQuantityMissingOrInvalid);
		codesByName.put(ConditionalQuantityZeroesRequired.getCodeName().get(), ConditionalQuantityZeroesRequired);
		codesByName.put(ContactNameMissing.getCodeName().get(), ContactNameMissing);
		codesByName.put(ContactNameNotUsedWithEvent.getCodeName().get(), ContactNameNotUsedWithEvent);
		codesByName.put(ContactPhoneNumberMissing.getCodeName().get(), ContactPhoneNumberMissing);
		codesByName.put(ContactPhoneNumberNotUsedWithEvent.getCodeName().get(), ContactPhoneNumberNotUsedWithEvent);
		codesByName.put(CoverQuantityGreaterThanProtectQuantity.getCodeName().get(), CoverQuantityGreaterThanProtectQuantity);
		codesByName.put(CUSIPDepositoryDeliverChilled.getCodeName().get(), CUSIPDepositoryDeliverChilled);
		codesByName.put(CUSIPNotDTCEligible.getCodeName().get(), CUSIPNotDTCEligible);
		codesByName.put(CustomerIdentificationMissingOrInvalid.getCodeName().get(), CustomerIdentificationMissingOrInvalid);
		codesByName.put(CustomerQuantitiesAndTotalRightsQuantitiesMismatch.getCodeName().get(), CustomerQuantitiesAndTotalRightsQuantitiesMismatch);
		codesByName.put(CommentAreaInvalid.getCodeName().get(), CommentAreaInvalid);
		codesByName.put(CorporateActionEventInvalid.getCodeName().get(), CorporateActionEventInvalid);
		codesByName.put(CustomerSequenceNumberInvalid.getCodeName().get(), CustomerSequenceNumberInvalid);
		codesByName.put(OfferNotATOPEligible.getCodeName().get(), OfferNotATOPEligible);
		codesByName.put(AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid.getCodeName().get(), AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid);
		codesByName.put(AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing.getCodeName().get(), AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing);
		codesByName.put(BeneficialOwnerDeathDateMissing.getCodeName().get(), BeneficialOwnerDeathDateMissing);
		codesByName.put(BeneficialOwnerNameMissing.getCodeName().get(), BeneficialOwnerNameMissing);
		codesByName.put(CertificateNameMissing.getCodeName().get(), CertificateNameMissing);
		codesByName.put(CertificateNumberInvalid.getCodeName().get(), CertificateNumberInvalid);
		codesByName.put(CertificateSequenceNumberInvalid.getCodeName().get(), CertificateSequenceNumberInvalid);
		codesByName.put(CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference.getCodeName().get(), CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference);
		codesByName.put(CoreInstructionQuantityAndExtensionTransactionDetailsDifference.getCodeName().get(), CoreInstructionQuantityAndExtensionTransactionDetailsDifference);
		codesByName.put(CurrentDatePassedProtectSubmissionEndDate.getCodeName().get(), CurrentDatePassedProtectSubmissionEndDate);
		codesByName.put(CurrentDatePrecedesProtectSubmissionStartDate.getCodeName().get(), CurrentDatePrecedesProtectSubmissionStartDate);
		codesByName.put(CUSIPMissingOrInvalid.getCodeName().get(), CUSIPMissingOrInvalid);
		codesByName.put(CustomerAndTotalOversubscriptionQuantitiesMismatch.getCodeName().get(), CustomerAndTotalOversubscriptionQuantitiesMismatch);
		codesByName.put(CustomerSequenceNumberAllZero.getCodeName().get(), CustomerSequenceNumberAllZero);
		codesByName.put(CutoffTimeCheckFailed.getCodeName().get(), CutoffTimeCheckFailed);
		codesByName.put(CutoffTimePassed.getCodeName().get(), CutoffTimePassed);
		codesByName.put(DeathCertificateMissing.getCodeName().get(), DeathCertificateMissing);
		codesByName.put(DuplicateTransactionSequenceNumber.getCodeName().get(), DuplicateTransactionSequenceNumber);
		codesByName.put(EntryDateInvalid.getCodeName().get(), EntryDateInvalid);
		codesByName.put(EntryDatePassed.getCodeName().get(), EntryDatePassed);
		codesByName.put(FractionalUnderlyingQuantity.getCodeName().get(), FractionalUnderlyingQuantity);
		codesByName.put(FunctionNotAvailable.getCodeName().get(), FunctionNotAvailable);
		codesByName.put(FunctionQuiesced.getCodeName().get(), FunctionQuiesced);
		codesByName.put(InstructionDeletionAcknowledgementIndicatorInvalid.getCodeName().get(), InstructionDeletionAcknowledgementIndicatorInvalid);
		codesByName.put(InstructionDeletionAcknowledgementIndicatorMissing.getCodeName().get(), InstructionDeletionAcknowledgementIndicatorMissing);
		codesByName.put(InsufficientPosition.getCodeName().get(), InsufficientPosition);
		codesByName.put(RecordTypeInvalid.getCodeName().get(), RecordTypeInvalid);
		codesByName.put(RightsQuantityInvalid.getCodeName().get(), RightsQuantityInvalid);
		codesByName.put(TransactionTypeInvalid.getCodeName().get(), TransactionTypeInvalid);
		codesByName.put(IssuingJurisdictionMissing.getCodeName().get(), IssuingJurisdictionMissing);
		codesByName.put(KayDataNotFound.getCodeName().get(), KayDataNotFound);
		codesByName.put(KeyInformationMissing.getCodeName().get(), KeyInformationMissing);
		codesByName.put(LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid.getCodeName().get(), LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid);
		codesByName.put(LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing.getCodeName().get(), LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing);
		codesByName.put(MasterTablesNotAvailable.getCodeName().get(), MasterTablesNotAvailable);
		codesByName.put(NoWithdrawalPrivilege.getCodeName().get(), NoWithdrawalPrivilege);
		codesByName.put(OddLotIndicatorMissingOrInvalid.getCodeName().get(), OddLotIndicatorMissingOrInvalid);
		codesByName.put(OfferInDatabase.getCodeName().get(), OfferInDatabase);
		codesByName.put(OfferNotEligibleForPuts.getCodeName().get(), OfferNotEligibleForPuts);
		codesByName.put(OversubscriptionNotAllowed.getCodeName().get(), OversubscriptionNotAllowed);
		codesByName.put(OversubscriptionQuantityExceeded.getCodeName().get(), OversubscriptionQuantityExceeded);
		codesByName.put(OversubscriptionQuantityInvalid.getCodeName().get(), OversubscriptionQuantityInvalid);
		codesByName.put(OversubscriptionQuantityNotUsed.getCodeName().get(), OversubscriptionQuantityNotUsed);
		codesByName.put(ParticipantDOChilled.getCodeName().get(), ParticipantDOChilled);
		codesByName.put(OddLotIndicatorYesInvalid.getCodeName().get(), OddLotIndicatorYesInvalid);
		codesByName.put(WithdrawError.getCodeName().get(), WithdrawError);
		codesByName.put(WithdrawalTransactionQuantityCannotBeZero.getCodeName().get(), WithdrawalTransactionQuantityCannotBeZero);
		codesByName.put(WithdrawalQuantityGreaterThanProtectQuantity.getCodeName().get(), WithdrawalQuantityGreaterThanProtectQuantity);
		codesByName.put(WithdrawalQuantityExceedsRemainingQuantity.getCodeName().get(), WithdrawalQuantityExceedsRemainingQuantity);
		codesByName.put(WarrantSubscriptionChargeAmountInvalid.getCodeName().get(), WarrantSubscriptionChargeAmountInvalid);
		codesByName.put(UnknownErrorCondition.getCodeName().get(), UnknownErrorCondition);
		codesByName.put(UnderlyingShareQuantityMismatch.getCodeName().get(), UnderlyingShareQuantityMismatch);
		codesByName.put(UnderlyingShareQuantityInvalid.getCodeName().get(), UnderlyingShareQuantityInvalid);
		codesByName.put(UnderlyingSecurityCUSIPMismatch.getCodeName().get(), UnderlyingSecurityCUSIPMismatch);
		codesByName.put(UnderlyingSecurityCUSIPInvalid.getCodeName().get(), UnderlyingSecurityCUSIPInvalid);
		codesByName.put(TransactionTypeMissing.getCodeName().get(), TransactionTypeMissing);
		codesByName.put(TransactionTypeAndEventIncompatible.getCodeName().get(), TransactionTypeAndEventIncompatible);
		codesByName.put(TransactionSequenceNumberInvalid.getCodeName().get(), TransactionSequenceNumberInvalid);
		codesByName.put(TransactionQuantityLessThanTransactionMinimum.getCodeName().get(), TransactionQuantityLessThanTransactionMinimum);
		codesByName.put(SubmissionDatePassed.getCodeName().get(), SubmissionDatePassed);
		codesByName.put(SolicitationFeeCommentsRequired.getCodeName().get(), SolicitationFeeCommentsRequired);
		codesByName.put(SequenceNumberOutOfSync.getCodeName().get(), SequenceNumberOutOfSync);
		codesByName.put(SequenceNumberMissing.getCodeName().get(), SequenceNumberMissing);
		codesByName.put(SequenceNumberInvalidBounds.getCodeName().get(), SequenceNumberInvalidBounds);
		codesByName.put(RTSProcessingInProgress.getCodeName().get(), RTSProcessingInProgress);
		codesByName.put(RightsRatioNotFound.getCodeName().get(), RightsRatioNotFound);
		codesByName.put(RightsQuantityDivisibleByRights.getCodeName().get(), RightsQuantityDivisibleByRights);
		codesByName.put(RightsCUSIPInsufficientPosition.getCodeName().get(), RightsCUSIPInsufficientPosition);
		codesByName.put(TransactionQuantityMissingOrInvalid.getCodeName().get(), TransactionQuantityMissingOrInvalid);
		codesByName.put(TransactionQuantityCannotBeZero.getCodeName().get(), TransactionQuantityCannotBeZero);
		codesByName.put(TransactionIdentificationInvalid.getCodeName().get(), TransactionIdentificationInvalid);
		codesByName.put(SubmissionDateNotReached.getCodeName().get(), SubmissionDateNotReached);
		codesByName.put(SolicitationFeeIndicatorNotUsed.getCodeName().get(), SolicitationFeeIndicatorNotUsed);
		codesByName.put(SolicitationFeeIndicatorRequired.getCodeName().get(), SolicitationFeeIndicatorRequired);
		codesByName.put(RightsPositionCheckInvalid.getCodeName().get(), RightsPositionCheckInvalid);
		codesByName.put(ProvidedByProtect.getCodeName().get(), ProvidedByProtect);
		codesByName.put(ProtectIdentificationNotUsed.getCodeName().get(), ProtectIdentificationNotUsed);
		codesByName.put(ProtectIdentificationMissingOrInvalid.getCodeName().get(), ProtectIdentificationMissingOrInvalid);
		codesByName.put(ProtectDateZero.getCodeName().get(), ProtectDateZero);
		codesByName.put(ProtectDatePassed.getCodeName().get(), ProtectDatePassed);
		codesByName.put(ProtectDateInvalidOrMissing.getCodeName().get(), ProtectDateInvalidOrMissing);
		codesByName.put(PotentiaLossAcknowledgementIndicatorMissing.getCodeName().get(), PotentiaLossAcknowledgementIndicatorMissing);
		codesByName.put(PotentiaLossAcknowledgementIndicatorInvalid.getCodeName().get(), PotentiaLossAcknowledgementIndicatorInvalid);
		codesByName.put(ParticipantNumberInvalid.getCodeName().get(), ParticipantNumberInvalid);
		codesByName.put(ParticipantNoMatchOnProtectIdentification.getCodeName().get(), ParticipantNoMatchOnProtectIdentification);
		codesByName.put(ParticipantLocked.getCodeName().get(), ParticipantLocked);
		codesByName.put(ParticipantNotEligible.getCodeName().get(), ParticipantNotEligible);
		codesByName.put(ParticipantEligibilityCheckNotAvailable.getCodeName().get(), ParticipantEligibilityCheckNotAvailable);
		codesByName.put(WithdrawalTransactionTypeInvalid.getCodeName().get(), WithdrawalTransactionTypeInvalid);
	}

	public static InstructionRejectionReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionRejectionReason1Code[] values() {
		InstructionRejectionReason1Code[] values = new InstructionRejectionReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionRejectionReason1Code> {
		@Override
		public InstructionRejectionReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionRejectionReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}