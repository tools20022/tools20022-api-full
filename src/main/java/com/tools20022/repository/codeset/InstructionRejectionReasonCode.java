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
import com.tools20022.repository.codeset.InstructionRejectionReasonCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#AcknowledgementNotAgreed
 * InstructionRejectionReasonCode.AcknowledgementNotAgreed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#AcknowledgmentIndicatorMissing
 * InstructionRejectionReasonCode.AcknowledgmentIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OfferNotATOPEligible
 * InstructionRejectionReasonCode.OfferNotATOPEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BidPriceZeroesRequired
 * InstructionRejectionReasonCode.BidPriceZeroesRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BidPriceOverMaximumAllowed
 * InstructionRejectionReasonCode.BidPriceOverMaximumAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BidPriceOverflow
 * InstructionRejectionReasonCode.BidPriceOverflow}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BidPriceMissingOrInvalid
 * InstructionRejectionReasonCode.BidPriceMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BidPriceUnderMinimumAllowed
 * InstructionRejectionReasonCode.BidPriceUnderMinimumAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BondCheckOnMasterTableNotAvailable
 * InstructionRejectionReasonCode.BondCheckOnMasterTableNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CorporateActionEventInvalid
 * InstructionRejectionReasonCode.CorporateActionEventInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CUSIPDepositoryDeliverChilled
 * InstructionRejectionReasonCode.CUSIPDepositoryDeliverChilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition1Required
 * InstructionRejectionReasonCode.Condition1Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition2Required
 * InstructionRejectionReasonCode.Condition2Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition3Required
 * InstructionRejectionReasonCode.Condition3Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition4Required
 * InstructionRejectionReasonCode.Condition4Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition5Required
 * InstructionRejectionReasonCode.Condition5Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition6Required
 * InstructionRejectionReasonCode.Condition6Required}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition1InvalidMustBeNo
 * InstructionRejectionReasonCode.Condition1InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition2InvalidMustBeNo
 * InstructionRejectionReasonCode.Condition2InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition3InvalidMustBeNo
 * InstructionRejectionReasonCode.Condition3InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition4InvalidMustBeNo
 * InstructionRejectionReasonCode.Condition4InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition5InvalidMustBeNo
 * InstructionRejectionReasonCode.Condition5InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition6InvalidMustBeNo
 * InstructionRejectionReasonCode.Condition6InvalidMustBeNo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition1InvalidMustBeYes
 * InstructionRejectionReasonCode.Condition1InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition2InvalidMustBeYes
 * InstructionRejectionReasonCode.Condition2InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition3InvalidMustBeYes
 * InstructionRejectionReasonCode.Condition3InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition4InvalidMustBeYes
 * InstructionRejectionReasonCode.Condition4InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition5InvalidMustBeYes
 * InstructionRejectionReasonCode.Condition5InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#Condition6InvalidMustBeYes
 * InstructionRejectionReasonCode.Condition6InvalidMustBeYes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ContactNameMissing
 * InstructionRejectionReasonCode.ContactNameMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ContactNameNotUsedWithEvent
 * InstructionRejectionReasonCode.ContactNameNotUsedWithEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ContactPhoneNumberMissing
 * InstructionRejectionReasonCode.ContactPhoneNumberMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ContactPhoneNumberNotUsedWithEvent
 * InstructionRejectionReasonCode.ContactPhoneNumberNotUsedWithEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CommentAreaInvalid
 * InstructionRejectionReasonCode.CommentAreaInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ConditionalQuantityZeroesRequired
 * InstructionRejectionReasonCode.ConditionalQuantityZeroesRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ConditionalQuantityExceedsTransactionQuantity
 * InstructionRejectionReasonCode.ConditionalQuantityExceedsTransactionQuantity}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ConditionalQuantityMissingOrInvalid
 * InstructionRejectionReasonCode.ConditionalQuantityMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ConditionalQuantityCannotBeZero
 * InstructionRejectionReasonCode.ConditionalQuantityCannotBeZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ConditionalQuantityDoesNotEqualTransactionQuantity
 * InstructionRejectionReasonCode.
 * ConditionalQuantityDoesNotEqualTransactionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CoverQuantityGreaterThanProtectQuantity
 * InstructionRejectionReasonCode.CoverQuantityGreaterThanProtectQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CustomerQuantitiesAndTotalRightsQuantitiesMismatch
 * InstructionRejectionReasonCode.
 * CustomerQuantitiesAndTotalRightsQuantitiesMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CustomerSequenceNumberInvalid
 * InstructionRejectionReasonCode.CustomerSequenceNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CustomerIdentificationMissingOrInvalid
 * InstructionRejectionReasonCode.CustomerIdentificationMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CUSIPNotDTCEligible
 * InstructionRejectionReasonCode.CUSIPNotDTCEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CUSIPMissingOrInvalid
 * InstructionRejectionReasonCode.CUSIPMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#UnderlyingSecurityCUSIPInvalid
 * InstructionRejectionReasonCode.UnderlyingSecurityCUSIPInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#UnderlyingSecurityCUSIPMismatch
 * InstructionRejectionReasonCode.UnderlyingSecurityCUSIPMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CutoffTimeCheckFailed
 * InstructionRejectionReasonCode.CutoffTimeCheckFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CutoffTimePassed
 * InstructionRejectionReasonCode.CutoffTimePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#EntryDatePassed
 * InstructionRejectionReasonCode.EntryDatePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#EntryDateInvalid
 * InstructionRejectionReasonCode.EntryDateInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#FractionalUnderlyingQuantity
 * InstructionRejectionReasonCode.FractionalUnderlyingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionTypeInvalid
 * InstructionRejectionReasonCode.TransactionTypeInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#FunctionNotAvailable
 * InstructionRejectionReasonCode.FunctionNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OfferInDatabase
 * InstructionRejectionReasonCode.OfferInDatabase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#KeyInformationMissing
 * InstructionRejectionReasonCode.KeyInformationMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#KayDataNotFound
 * InstructionRejectionReasonCode.KayDataNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#InsufficientPosition
 * InstructionRejectionReasonCode.InsufficientPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#MasterTablesNotAvailable
 * InstructionRejectionReasonCode.MasterTablesNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#NoWithdrawalPrivilege
 * InstructionRejectionReasonCode.NoWithdrawalPrivilege}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OddLotIndicatorMissingOrInvalid
 * InstructionRejectionReasonCode.OddLotIndicatorMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OddLotIndicatorYesInvalid
 * InstructionRejectionReasonCode.OddLotIndicatorYesInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OfferNotEligibleForPuts
 * InstructionRejectionReasonCode.OfferNotEligibleForPuts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#UnknownErrorCondition
 * InstructionRejectionReasonCode.UnknownErrorCondition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CustomerAndTotalOversubscriptionQuantitiesMismatch
 * InstructionRejectionReasonCode.
 * CustomerAndTotalOversubscriptionQuantitiesMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OversubscriptionQuantityExceeded
 * InstructionRejectionReasonCode.OversubscriptionQuantityExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OversubscriptionQuantityInvalid
 * InstructionRejectionReasonCode.OversubscriptionQuantityInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OversubscriptionNotAllowed
 * InstructionRejectionReasonCode.OversubscriptionNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#OversubscriptionQuantityNotUsed
 * InstructionRejectionReasonCode.OversubscriptionQuantityNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ParticipantDOChilled
 * InstructionRejectionReasonCode.ParticipantDOChilled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ParticipantEligibilityCheckNotAvailable
 * InstructionRejectionReasonCode.ParticipantEligibilityCheckNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ParticipantNoMatchOnProtectIdentification
 * InstructionRejectionReasonCode.ParticipantNoMatchOnProtectIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ParticipantLocked
 * InstructionRejectionReasonCode.ParticipantLocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ParticipantNumberInvalid
 * InstructionRejectionReasonCode.ParticipantNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ParticipantNotEligible
 * InstructionRejectionReasonCode.ParticipantNotEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ProtectDateZero
 * InstructionRejectionReasonCode.ProtectDateZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CurrentDatePassedProtectSubmissionEndDate
 * InstructionRejectionReasonCode.CurrentDatePassedProtectSubmissionEndDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ProtectDateInvalidOrMissing
 * InstructionRejectionReasonCode.ProtectDateInvalidOrMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ProtectDatePassed
 * InstructionRejectionReasonCode.ProtectDatePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CurrentDatePrecedesProtectSubmissionStartDate
 * InstructionRejectionReasonCode.CurrentDatePrecedesProtectSubmissionStartDate}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ProtectIdentificationMissingOrInvalid
 * InstructionRejectionReasonCode.ProtectIdentificationMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ProtectIdentificationNotUsed
 * InstructionRejectionReasonCode.ProtectIdentificationNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#FunctionQuiesced
 * InstructionRejectionReasonCode.FunctionQuiesced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RecordTypeInvalid
 * InstructionRejectionReasonCode.RecordTypeInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RightsCUSIPInsufficientPosition
 * InstructionRejectionReasonCode.RightsCUSIPInsufficientPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RightsPositionCheckInvalid
 * InstructionRejectionReasonCode.RightsPositionCheckInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RightsQuantityDivisibleByRights
 * InstructionRejectionReasonCode.RightsQuantityDivisibleByRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RightsQuantityInvalid
 * InstructionRejectionReasonCode.RightsQuantityInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RightsRatioNotFound
 * InstructionRejectionReasonCode.RightsRatioNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#RTSProcessingInProgress
 * InstructionRejectionReasonCode.RTSProcessingInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CustomerSequenceNumberAllZero
 * InstructionRejectionReasonCode.CustomerSequenceNumberAllZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#DuplicateTransactionSequenceNumber
 * InstructionRejectionReasonCode.DuplicateTransactionSequenceNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SequenceNumberMissing
 * InstructionRejectionReasonCode.SequenceNumberMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SequenceNumberOutOfSync
 * InstructionRejectionReasonCode.SequenceNumberOutOfSync}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SequenceNumberInvalidBounds
 * InstructionRejectionReasonCode.SequenceNumberInvalidBounds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#UnderlyingShareQuantityInvalid
 * InstructionRejectionReasonCode.UnderlyingShareQuantityInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#UnderlyingShareQuantityMismatch
 * InstructionRejectionReasonCode.UnderlyingShareQuantityMismatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SolicitationFeeCommentsRequired
 * InstructionRejectionReasonCode.SolicitationFeeCommentsRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SolicitationFeeIndicatorRequired
 * InstructionRejectionReasonCode.SolicitationFeeIndicatorRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SolicitationFeeIndicatorNotUsed
 * InstructionRejectionReasonCode.SolicitationFeeIndicatorNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SubmissionDateNotReached
 * InstructionRejectionReasonCode.SubmissionDateNotReached}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#SubmissionDatePassed
 * InstructionRejectionReasonCode.SubmissionDatePassed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionTypeAndEventIncompatible
 * InstructionRejectionReasonCode.TransactionTypeAndEventIncompatible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionIdentificationInvalid
 * InstructionRejectionReasonCode.TransactionIdentificationInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionTypeMissing
 * InstructionRejectionReasonCode.TransactionTypeMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionSequenceNumberInvalid
 * InstructionRejectionReasonCode.TransactionSequenceNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionQuantityCannotBeZero
 * InstructionRejectionReasonCode.TransactionQuantityCannotBeZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionQuantityMissingOrInvalid
 * InstructionRejectionReasonCode.TransactionQuantityMissingOrInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#TransactionQuantityLessThanTransactionMinimum
 * InstructionRejectionReasonCode.TransactionQuantityLessThanTransactionMinimum}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#ProvidedByProtect
 * InstructionRejectionReasonCode.ProvidedByProtect}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#WithdrawalTransactionQuantityCannotBeZero
 * InstructionRejectionReasonCode.WithdrawalTransactionQuantityCannotBeZero}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#WithdrawError
 * InstructionRejectionReasonCode.WithdrawError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#WithdrawalQuantityGreaterThanProtectQuantity
 * InstructionRejectionReasonCode.WithdrawalQuantityGreaterThanProtectQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#WithdrawalQuantityExceedsRemainingQuantity
 * InstructionRejectionReasonCode.WithdrawalQuantityExceedsRemainingQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BeneficialOwnerNameMissing
 * InstructionRejectionReasonCode.BeneficialOwnerNameMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#BeneficialOwnerDeathDateMissing
 * InstructionRejectionReasonCode.BeneficialOwnerDeathDateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#DeathCertificateMissing
 * InstructionRejectionReasonCode.DeathCertificateMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#IssuingJurisdictionMissing
 * InstructionRejectionReasonCode.IssuingJurisdictionMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CertificateNumberInvalid
 * InstructionRejectionReasonCode.CertificateNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CertificateSequenceNumberInvalid
 * InstructionRejectionReasonCode.CertificateSequenceNumberInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CertificateNameMissing
 * InstructionRejectionReasonCode.CertificateNameMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid
 * InstructionRejectionReasonCode.
 * AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing
 * InstructionRejectionReasonCode.
 * AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid
 * InstructionRejectionReasonCode.
 * LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing
 * InstructionRejectionReasonCode.
 * LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#InstructionDeletionAcknowledgementIndicatorInvalid
 * InstructionRejectionReasonCode.
 * InstructionDeletionAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#InstructionDeletionAcknowledgementIndicatorMissing
 * InstructionRejectionReasonCode.
 * InstructionDeletionAcknowledgementIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#PotentiaLossAcknowledgementIndicatorInvalid
 * InstructionRejectionReasonCode.PotentiaLossAcknowledgementIndicatorInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#PotentiaLossAcknowledgementIndicatorMissing
 * InstructionRejectionReasonCode.PotentiaLossAcknowledgementIndicatorMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#WarrantSubscriptionChargeAmountInvalid
 * InstructionRejectionReasonCode.WarrantSubscriptionChargeAmountInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CoreInstructionQuantityAndExtensionTransactionDetailsDifference
 * InstructionRejectionReasonCode.
 * CoreInstructionQuantityAndExtensionTransactionDetailsDifference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference
 * InstructionRejectionReasonCode.
 * CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode#WithdrawalTransactionTypeInvalid
 * InstructionRejectionReasonCode.WithdrawalTransactionTypeInvalid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReason1Code
 * InstructionRejectionReason1Code}</li>
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
 * "InstructionRejectionReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Reason for rejection of a corporate action instruction or of an instruction cancellation."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionRejectionReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Acknowledgement must be agreed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACKA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementNotAgreed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgement must be agreed."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode AcknowledgementNotAgreed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementNotAgreed";
			definition = "Acknowledgement must be agreed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ACKA";
		}
	};
	/**
	 * Acknowledgment indicator is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACKS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgmentIndicatorMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgment indicator is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode AcknowledgmentIndicatorMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgmentIndicatorMissing";
			definition = "Acknowledgment indicator is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ACKS";
		}
	};
	/**
	 * Offer is not ATOP eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferNotATOPEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offer is not ATOP eligible."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OfferNotATOPEligible = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferNotATOPEligible";
			definition = "Offer is not ATOP eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ATOP";
		}
	};
	/**
	 * Zeroes are required for bid price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BID0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceZeroesRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Zeroes are required for bid price."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BidPriceZeroesRequired = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceZeroesRequired";
			definition = "Zeroes are required for bid price.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BID0";
		}
	};
	/**
	 * Bid Price exceeds maximum bid price allowed for the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceOverMaximumAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bid Price exceeds maximum bid price allowed for the offer."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BidPriceOverMaximumAllowed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceOverMaximumAllowed";
			definition = "Bid Price exceeds maximum bid price allowed for the offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BIDE";
		}
	};
	/**
	 * Bid Price cannot be greater than 9999.99999.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceOverflow"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bid Price cannot be greater than 9999.99999."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BidPriceOverflow = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceOverflow";
			definition = "Bid Price cannot be greater than 9999.99999.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BIDG";
		}
	};
	/**
	 * Bid price is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bid price is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BidPriceMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceMissingOrInvalid";
			definition = "Bid price is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BIDI";
		}
	};
	/**
	 * Bid Price is less than the minimum bid price allowed for the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidPriceUnderMinimumAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bid Price is less than the minimum bid price allowed for the offer."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BidPriceUnderMinimumAllowed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidPriceUnderMinimumAllowed";
			definition = "Bid Price is less than the minimum bid price allowed for the offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BIDM";
		}
	};
	/**
	 * Bond check on master table is not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BNDU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondCheckOnMasterTableNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bond check on master table is not available."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BondCheckOnMasterTableNotAvailable = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondCheckOnMasterTableNotAvailable";
			definition = "Bond check on master table is not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BNDU";
		}
	};
	/**
	 * Corporate action event identification is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate action event identification is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CorporateActionEventInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventInvalid";
			definition = "Corporate action event identification is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CAID";
		}
	};
	/**
	 * CUSIP is depository deliver chilled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHIL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPDepositoryDeliverChilled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "CUSIP is depository deliver chilled."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CUSIPDepositoryDeliverChilled = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPDepositoryDeliverChilled";
			definition = "CUSIP is depository deliver chilled.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CHIL";
		}
	};
	/**
	 * Condition 1 indicator is must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN1R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 1 indicator is must be present."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition1Required = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1Required";
			definition = "Condition 1 indicator is must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN1R";
		}
	};
	/**
	 * Condition 2 indicator is must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN2R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 2 indicator is must be present."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition2Required = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2Required";
			definition = "Condition 2 indicator is must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN2R";
		}
	};
	/**
	 * Condition 3 indicator is must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN3R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 3 indicator is must be present."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition3Required = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3Required";
			definition = "Condition 3 indicator is must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN3R";
		}
	};
	/**
	 * Condition 4 indicator is must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN4R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 4 indicator is must be present."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition4Required = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4Required";
			definition = "Condition 4 indicator is must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN4R";
		}
	};
	/**
	 * Condition 5 indicator is must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN5R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 5 indicator is must be present."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition5Required = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5Required";
			definition = "Condition 5 indicator is must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN5R";
		}
	};
	/**
	 * Condition 6 indicator is must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN6R"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 6 indicator is must be present."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition6Required = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6Required";
			definition = "Condition 6 indicator is must be present.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN6R";
		}
	};
	/**
	 * Condition 1 indicator is invalid. It must be No.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN1N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1InvalidMustBeNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 1 indicator is invalid. It must be No."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition1InvalidMustBeNo = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1InvalidMustBeNo";
			definition = "Condition 1 indicator is invalid. It must be No.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN1N";
		}
	};
	/**
	 * Condition 2 indicator is invalid. It must be No.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN2N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2InvalidMustBeNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 2 indicator is invalid. It must be No."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition2InvalidMustBeNo = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2InvalidMustBeNo";
			definition = "Condition 2 indicator is invalid. It must be No.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN2N";
		}
	};
	/**
	 * Condition 3 indicator is invalid. It must be No.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN3N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3InvalidMustBeNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 3 indicator is invalid. It must be No."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition3InvalidMustBeNo = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3InvalidMustBeNo";
			definition = "Condition 3 indicator is invalid. It must be No.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN3N";
		}
	};
	/**
	 * Condition 4 indicator is invalid. It must be No.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN4N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4InvalidMustBeNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 4 indicator is invalid. It must be No."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition4InvalidMustBeNo = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4InvalidMustBeNo";
			definition = "Condition 4 indicator is invalid. It must be No.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN4N";
		}
	};
	/**
	 * Condition 5 indicator is invalid. It must be No.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN5N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5InvalidMustBeNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 5 indicator is invalid. It must be No."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition5InvalidMustBeNo = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5InvalidMustBeNo";
			definition = "Condition 5 indicator is invalid. It must be No.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN5N";
		}
	};
	/**
	 * Condition 6 indicator is invalid. It must be No.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN6N"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6InvalidMustBeNo"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 6 indicator is invalid. It must be No."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition6InvalidMustBeNo = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6InvalidMustBeNo";
			definition = "Condition 6 indicator is invalid. It must be No.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN6N";
		}
	};
	/**
	 * Condition 1 indicator is invalid. It must be Yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN1Y"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition1InvalidMustBeYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 1 indicator is invalid. It must be Yes."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition1InvalidMustBeYes = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition1InvalidMustBeYes";
			definition = "Condition 1 indicator is invalid. It must be Yes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN1Y";
		}
	};
	/**
	 * Condition 2 indicator is invalid. It must be Yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN2Y"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition2InvalidMustBeYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 2 indicator is invalid. It must be Yes."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition2InvalidMustBeYes = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition2InvalidMustBeYes";
			definition = "Condition 2 indicator is invalid. It must be Yes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN2Y";
		}
	};
	/**
	 * Condition 3 indicator is invalid. It must be Yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN3Y"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition3InvalidMustBeYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 3 indicator is invalid. It must be Yes."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition3InvalidMustBeYes = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition3InvalidMustBeYes";
			definition = "Condition 3 indicator is invalid. It must be Yes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN3Y";
		}
	};
	/**
	 * Condition 4 indicator is invalid. It must be Yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN4Y"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition4InvalidMustBeYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 4 indicator is invalid. It must be Yes."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition4InvalidMustBeYes = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition4InvalidMustBeYes";
			definition = "Condition 4 indicator is invalid. It must be Yes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN4Y";
		}
	};
	/**
	 * Condition 5 indicator is invalid. It must be Yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN5Y"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition5InvalidMustBeYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 5 indicator is invalid. It must be Yes."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition5InvalidMustBeYes = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition5InvalidMustBeYes";
			definition = "Condition 5 indicator is invalid. It must be Yes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN5Y";
		}
	};
	/**
	 * Condition 6 indicator is invalid. It must be Yes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CN6Y"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Condition6InvalidMustBeYes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Condition 6 indicator is invalid. It must be Yes."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode Condition6InvalidMustBeYes = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Condition6InvalidMustBeYes";
			definition = "Condition 6 indicator is invalid. It must be Yes.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CN6Y";
		}
	};
	/**
	 * Contact name is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNAM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactNameMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact name is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ContactNameMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactNameMissing";
			definition = "Contact name is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CNAM";
		}
	};
	/**
	 * Contact name is not used with this event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNAX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactNameNotUsedWithEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact name is not used with this event."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ContactNameNotUsedWithEvent = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactNameNotUsedWithEvent";
			definition = "Contact name is not used with this event.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CNAX";
		}
	};
	/**
	 * Contact phone number is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNPM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPhoneNumberMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact phone number is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ContactPhoneNumberMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPhoneNumberMissing";
			definition = "Contact phone number is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CNPM";
		}
	};
	/**
	 * Contact phone number is not used with this event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNPX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContactPhoneNumberNotUsedWithEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contact phone number is not used with this event."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ContactPhoneNumberNotUsedWithEvent = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContactPhoneNumberNotUsedWithEvent";
			definition = "Contact phone number is not used with this event.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CNPX";
		}
	};
	/**
	 * Comment area is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COMM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommentAreaInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Comment area is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CommentAreaInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommentAreaInvalid";
			definition = "Comment area is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COMM";
		}
	};
	/**
	 * Conditional quantity zeroes are required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COQ0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityZeroesRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity zeroes are required."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ConditionalQuantityZeroesRequired = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityZeroesRequired";
			definition = "Conditional quantity zeroes are required.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COQ0";
		}
	};
	/**
	 * Conditional quantity exceeds the transaction quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COQE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityExceedsTransactionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity exceeds the transaction quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ConditionalQuantityExceedsTransactionQuantity = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityExceedsTransactionQuantity";
			definition = "Conditional quantity exceeds the transaction quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COQE";
		}
	};
	/**
	 * Conditional quantity is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COQI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ConditionalQuantityMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityMissingOrInvalid";
			definition = "Conditional quantity is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COQI";
		}
	};
	/**
	 * Conditional quantity cannot be zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COQX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityCannotBeZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Conditional quantity cannot be zero."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ConditionalQuantityCannotBeZero = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityCannotBeZero";
			definition = "Conditional quantity cannot be zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COQX";
		}
	};
	/**
	 * Conditional quantity does not equal the transaction quantity whilst this
	 * offer accepts only full conditional quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COTQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConditionalQuantityDoesNotEqualTransactionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conditional quantity does not equal the transaction quantity whilst this offer accepts only full conditional quantity."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ConditionalQuantityDoesNotEqualTransactionQuantity = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConditionalQuantityDoesNotEqualTransactionQuantity";
			definition = "Conditional quantity does not equal the transaction quantity whilst this offer accepts only full conditional quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COTQ";
		}
	};
	/**
	 * Cover quantity is greater than the remaining protect quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverQuantityGreaterThanProtectQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cover quantity is greater than the remaining protect quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CoverQuantityGreaterThanProtectQuantity = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverQuantityGreaterThanProtectQuantity";
			definition = "Cover quantity is greater than the remaining protect quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "COVR";
		}
	};
	/**
	 * Customer quantities do not add up to total rights quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CQRQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerQuantitiesAndTotalRightsQuantitiesMismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer quantities do not add up to total rights quantities."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CustomerQuantitiesAndTotalRightsQuantitiesMismatch = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerQuantitiesAndTotalRightsQuantitiesMismatch";
			definition = "Customer quantities do not add up to total rights quantities.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CQRQ";
		}
	};
	/**
	 * Customer Sequence number is invalid or out of sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSEQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerSequenceNumberInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer Sequence number is invalid or out of sequence."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CustomerSequenceNumberInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerSequenceNumberInvalid";
			definition = "Customer Sequence number is invalid or out of sequence.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CSEQ";
		}
	};
	/**
	 * Customer identification is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUID"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerIdentificationMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer identification is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CustomerIdentificationMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerIdentificationMissingOrInvalid";
			definition = "Customer identification is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUID";
		}
	};
	/**
	 * Target CUSIP or contra CUSIP identification is not DTC eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPNotDTCEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Target CUSIP or contra CUSIP identification is not DTC eligible."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CUSIPNotDTCEligible = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPNotDTCEligible";
			definition = "Target CUSIP or contra CUSIP identification is not DTC eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUSD";
		}
	};
	/**
	 * Target CUSIP or contra CUSIP identification is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CUSIPMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Target CUSIP or contra CUSIP identification is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CUSIPMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CUSIPMissingOrInvalid";
			definition = "Target CUSIP or contra CUSIP identification is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUSI";
		}
	};
	/**
	 * Underlying security CUSIP is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurityCUSIPInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying security CUSIP is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode UnderlyingSecurityCUSIPInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurityCUSIPInvalid";
			definition = "Underlying security CUSIP is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUSP";
		}
	};
	/**
	 * Underlying security CUSIP does not match the original.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUSU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecurityCUSIPMismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying security CUSIP does not match the original."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode UnderlyingSecurityCUSIPMismatch = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecurityCUSIPMismatch";
			definition = "Underlying security CUSIP does not match the original.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUSU";
		}
	};
	/**
	 * Cut-off time check has failed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoffTimeCheckFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cut-off time check has failed."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CutoffTimeCheckFailed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoffTimeCheckFailed";
			definition = "Cut-off time check has failed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUTC";
		}
	};
	/**
	 * Cut-off time has passed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CUTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoffTimePassed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cut-off time has passed."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CutoffTimePassed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoffTimePassed";
			definition = "Cut-off time has passed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CUTT";
		}
	};
	/**
	 * Entry date must be less than or equal to current date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDatePassed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry date must be less than or equal to current date."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode EntryDatePassed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDatePassed";
			definition = "Entry date must be less than or equal to current date.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ENTL";
		}
	};
	/**
	 * Entry Date is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ENTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryDateInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entry Date is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode EntryDateInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntryDateInvalid";
			definition = "Entry Date is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ENTR";
		}
	};
	/**
	 * Customer has fractional underlying quantity, adjust quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FractionalUnderlyingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer has fractional underlying quantity, adjust quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode FractionalUnderlyingQuantity = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FractionalUnderlyingQuantity";
			definition = "Customer has fractional underlying quantity, adjust quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "FRAQ";
		}
	};
	/**
	 * Transaction type or withdrawal transaction type is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction type or withdrawal transaction type is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionTypeInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeInvalid";
			definition = "Transaction type or withdrawal transaction type is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRTI";
		}
	};
	/**
	 * Function is not available at this time. Please check expiration start and
	 * end times for the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FUNU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FunctionNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Function is not available at this time. Please check expiration start and end times for the event."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode FunctionNotAvailable = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FunctionNotAvailable";
			definition = "Function is not available at this time. Please check expiration start and end times for the event.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "FUNU";
		}
	};
	/**
	 * Offer is already on historical data base.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "HIST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferInDatabase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offer is already on historical data base."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OfferInDatabase = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferInDatabase";
			definition = "Offer is already on historical data base.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "HIST";
		}
	};
	/**
	 * Key Information is missing (tenders data).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyInformationMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key Information is missing (tenders data)."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode KeyInformationMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyInformationMissing";
			definition = "Key Information is missing (tenders data).";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "KEYM";
		}
	};
	/**
	 * Key data (VOI transaction) cannot be found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KayDataNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Key data (VOI transaction) cannot be found."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode KayDataNotFound = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KayDataNotFound";
			definition = "Key data (VOI transaction) cannot be found.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "KEYV";
		}
	};
	/**
	 * Participant has insufficient position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LACK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant has insufficient position."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode InsufficientPosition = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientPosition";
			definition = "Participant has insufficient position.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "LACK";
		}
	};
	/**
	 * Master tables are not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MSTB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterTablesNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Master tables are not available."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode MasterTablesNotAvailable = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterTablesNotAvailable";
			definition = "Master tables are not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "MSTB";
		}
	};
	/**
	 * There is no withdrawal privilege on this offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NWIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoWithdrawalPrivilege"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "There is no withdrawal privilege on this offer."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode NoWithdrawalPrivilege = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoWithdrawalPrivilege";
			definition = "There is no withdrawal privilege on this offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "NWIT";
		}
	};
	/**
	 * Odd lot indicator is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotIndicatorMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Odd lot indicator is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OddLotIndicatorMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotIndicatorMissingOrInvalid";
			definition = "Odd lot indicator is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ODLI";
		}
	};
	/**
	 * Cannot submit odd lot indicator 'Yes' for the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODLY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotIndicatorYesInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cannot submit odd lot indicator 'Yes' for the offer."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OddLotIndicatorYesInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotIndicatorYesInvalid";
			definition = "Cannot submit odd lot indicator 'Yes' for the offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ODLY";
		}
	};
	/**
	 * Offer is not eligible for the PUTS function.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferNotEligibleForPuts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offer is not eligible for the PUTS function."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OfferNotEligibleForPuts = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferNotEligibleForPuts";
			definition = "Offer is not eligible for the PUTS function.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OFFP";
		}
	};
	/**
	 * The rejection reason is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownErrorCondition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The rejection reason is unknown."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode UnknownErrorCondition = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownErrorCondition";
			definition = "The rejection reason is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Customer oversubscription quantities do not add up to total
	 * oversubscription quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerAndTotalOversubscriptionQuantitiesMismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer oversubscription quantities do not add up to total oversubscription quantity."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CustomerAndTotalOversubscriptionQuantitiesMismatch = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerAndTotalOversubscriptionQuantitiesMismatch";
			definition = "Customer oversubscription quantities do not add up to total oversubscription quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OVCU";
		}
	};
	/**
	 * Oversubscription quantity is greater than percentage of underlying
	 * shares.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVRG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantityExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Oversubscription quantity is greater than percentage of underlying shares."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OversubscriptionQuantityExceeded = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantityExceeded";
			definition = "Oversubscription quantity is greater than percentage of underlying shares.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OVRG";
		}
	};
	/**
	 * Oversubscription quantity is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantityInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Oversubscription quantity is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OversubscriptionQuantityInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantityInvalid";
			definition = "Oversubscription quantity is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OVRI";
		}
	};
	/**
	 * Oversubscription is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVRX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Oversubscription is not allowed."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OversubscriptionNotAllowed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionNotAllowed";
			definition = "Oversubscription is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OVRX";
		}
	};
	/**
	 * Oversubscription quantity not used with this transaction type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OVTT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantityNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Oversubscription quantity not used with this transaction type."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode OversubscriptionQuantityNotUsed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantityNotUsed";
			definition = "Oversubscription quantity not used with this transaction type.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "OVTT";
		}
	};
	/**
	 * Participant is DO chilled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PACH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantDOChilled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant is DO chilled."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ParticipantDOChilled = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantDOChilled";
			definition = "Participant is DO chilled.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PACH";
		}
	};
	/**
	 * Participant eligibility check on master table is not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantEligibilityCheckNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Participant eligibility check on master table is not available."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ParticipantEligibilityCheckNotAvailable = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantEligibilityCheckNotAvailable";
			definition = "Participant eligibility check on master table is not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PAEC";
		}
	};
	/**
	 * Participant does not match participant on Protect ID.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PAPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNoMatchOnProtectIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant does not match participant on Protect ID."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ParticipantNoMatchOnProtectIdentification = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNoMatchOnProtectIdentification";
			definition = "Participant does not match participant on Protect ID.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PAPI";
		}
	};
	/**
	 * Participant is globally locked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantLocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant is globally locked."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ParticipantLocked = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantLocked";
			definition = "Participant is globally locked.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PARL";
		}
	};
	/**
	 * Participant number is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNumberInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant number is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ParticipantNumberInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNumberInvalid";
			definition = "Participant number is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Participant is not DTC eligible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipantNotEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Participant is not DTC eligible."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ParticipantNotEligible = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipantNotEligible";
			definition = "Participant is not DTC eligible.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PARX";
		}
	};
	/**
	 * Protect date on file must be zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRO0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDateZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect date on file must be zero."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ProtectDateZero = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDateZero";
			definition = "Protect date on file must be zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PRO0";
		}
	};
	/**
	 * Current date is greater than protect submission end date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentDatePassedProtectSubmissionEndDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current date is greater than protect submission end date."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CurrentDatePassedProtectSubmissionEndDate = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentDatePassedProtectSubmissionEndDate";
			definition = "Current date is greater than protect submission end date.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PROE";
		}
	};
	/**
	 * Protect Date invalid or missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDateInvalidOrMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect Date invalid or missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ProtectDateInvalidOrMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDateInvalidOrMissing";
			definition = "Protect Date invalid or missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PROI";
		}
	};
	/**
	 * Protect date must be less than or equal to current date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectDatePassed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect date must be less than or equal to current date."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ProtectDatePassed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectDatePassed";
			definition = "Protect date must be less than or equal to current date.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PROL";
		}
	};
	/**
	 * Current date is less than protect submission start date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentDatePrecedesProtectSubmissionStartDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current date is less than protect submission start date."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CurrentDatePrecedesProtectSubmissionStartDate = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentDatePrecedesProtectSubmissionStartDate";
			definition = "Current date is less than protect submission start date.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PROS";
		}
	};
	/**
	 * Protect identification is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect identification is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ProtectIdentificationMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationMissingOrInvalid";
			definition = "Protect identification is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PROT";
		}
	};
	/**
	 * Protect identification is not used with this event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PROX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectIdentificationNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Protect identification is not used with this event."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ProtectIdentificationNotUsed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectIdentificationNotUsed";
			definition = "Protect identification is not used with this event.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "PROX";
		}
	};
	/**
	 * Function is quiesced (not available).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QUIE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FunctionQuiesced"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Function is quiesced (not available)."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode FunctionQuiesced = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FunctionQuiesced";
			definition = "Function is quiesced (not available).";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "QUIE";
		}
	};
	/**
	 * Record type is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordTypeInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Record type is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RecordTypeInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordTypeInvalid";
			definition = "Record type is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RECI";
		}
	};
	/**
	 * Rights CUSIP has insufficient position.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RILA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsCUSIPInsufficientPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights CUSIP has insufficient position."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RightsCUSIPInsufficientPosition = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsCUSIPInsufficientPosition";
			definition = "Rights CUSIP has insufficient position.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RILA";
		}
	};
	/**
	 * Not a good return code from rights position check.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPCI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsPositionCheckInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Not a good return code from rights position check."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RightsPositionCheckInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsPositionCheckInvalid";
			definition = "Not a good return code from rights position check.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RPCI";
		}
	};
	/**
	 * Rights quantity for this subscription must be divisible by rights.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQDV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsQuantityDivisibleByRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rights quantity for this subscription must be divisible by rights."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RightsQuantityDivisibleByRights = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsQuantityDivisibleByRights";
			definition = "Rights quantity for this subscription must be divisible by rights.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RQDV";
		}
	};
	/**
	 * Rights quantity is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RQIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsQuantityInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights quantity is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RightsQuantityInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsQuantityInvalid";
			definition = "Rights quantity is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RQIN";
		}
	};
	/**
	 * Rights ratio not found on data base.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsRatioNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rights ratio not found on data base."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RightsRatioNotFound = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsRatioNotFound";
			definition = "Rights ratio not found on data base.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RTIO";
		}
	};
	/**
	 * RTS processing is in progress. Submit later.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RTSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RTSProcessingInProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "RTS processing is in progress. Submit later."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode RTSProcessingInProgress = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RTSProcessingInProgress";
			definition = "RTS processing is in progress. Submit later.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "RTSP";
		}
	};
	/**
	 * Customer Sequence number must be all zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQ0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerSequenceNumberAllZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Customer Sequence number must be all zero."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CustomerSequenceNumberAllZero = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerSequenceNumberAllZero";
			definition = "Customer Sequence number must be all zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SEQ0";
		}
	};
	/**
	 * Transaction sequence number is duplicated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicateTransactionSequenceNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction sequence number is duplicated."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode DuplicateTransactionSequenceNumber = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicateTransactionSequenceNumber";
			definition = "Transaction sequence number is duplicated.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SEQD";
		}
	};
	/**
	 * Sequence number is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence number is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SequenceNumberMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberMissing";
			definition = "Sequence number is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SEQM";
		}
	};
	/**
	 * Sequence number is out of sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberOutOfSync"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Sequence number is out of sequence."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SequenceNumberOutOfSync = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberOutOfSync";
			definition = "Sequence number is out of sequence.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SEQO";
		}
	};
	/**
	 * Customer sequence number must be between 1 and 1 or for PUTS between
	 * 9999901 and 9999912.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SequenceNumberInvalidBounds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer sequence number must be between 1 and 1 or for PUTS between 9999901 and 9999912."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SequenceNumberInvalidBounds = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SequenceNumberInvalidBounds";
			definition = "Customer sequence number must be between 1 and 1 or for PUTS between 9999901 and 9999912.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SEQP";
		}
	};
	/**
	 * Underlying share quantity is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHQI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingShareQuantityInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Underlying share quantity is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode UnderlyingShareQuantityInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingShareQuantityInvalid";
			definition = "Underlying share quantity is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SHQI";
		}
	};
	/**
	 * Underlying share quantity does not match original share quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHQO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingShareQuantityMismatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Underlying share quantity does not match original share quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode UnderlyingShareQuantityMismatch = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingShareQuantityMismatch";
			definition = "Underlying share quantity does not match original share quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SHQO";
		}
	};
	/**
	 * Comments are required for solicitation fee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeCommentsRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Comments are required for solicitation fee."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SolicitationFeeCommentsRequired = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeCommentsRequired";
			definition = "Comments are required for solicitation fee.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SOCR";
		}
	};
	/**
	 * Solicitation fee indicator is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeIndicatorRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Solicitation fee indicator is required."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SolicitationFeeIndicatorRequired = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeIndicatorRequired";
			definition = "Solicitation fee indicator is required.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SOLI";
		}
	};
	/**
	 * Solicitation fee indicator is not used with this event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOLX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFeeIndicatorNotUsed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Solicitation fee indicator is not used with this event."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SolicitationFeeIndicatorNotUsed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFeeIndicatorNotUsed";
			definition = "Solicitation fee indicator is not used with this event.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SOLX";
		}
	};
	/**
	 * Submission date is not yet reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDateNotReached"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Submission date is not yet reached."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SubmissionDateNotReached = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDateNotReached";
			definition = "Submission date is not yet reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SUBE";
		}
	};
	/**
	 * Date of submission has passed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionDatePassed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date of submission has passed."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode SubmissionDatePassed = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionDatePassed";
			definition = "Date of submission has passed.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SUBL";
		}
	};
	/**
	 * Transaction type and event are incompatible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TNFN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeAndEventIncompatible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction type and event are incompatible."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionTypeAndEventIncompatible = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeAndEventIncompatible";
			definition = "Transaction type and event are incompatible.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TNFN";
		}
	};
	/**
	 * Transaction Identification is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentificationInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction Identification is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionIdentificationInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentificationInvalid";
			definition = "Transaction Identification is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRNI";
		}
	};
	/**
	 * Transaction type is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction type is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionTypeMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeMissing";
			definition = "Transaction type is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRNM";
		}
	};
	/**
	 * Transaction sequence number is invalid, not numeric.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRNS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionSequenceNumberInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction sequence number is invalid, not numeric."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionSequenceNumberInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionSequenceNumberInvalid";
			definition = "Transaction sequence number is invalid, not numeric.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRNS";
		}
	};
	/**
	 * Transaction Quantity cannot be zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRQ0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantityCannotBeZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction Quantity cannot be zero."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionQuantityCannotBeZero = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantityCannotBeZero";
			definition = "Transaction Quantity cannot be zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRQ0";
		}
	};
	/**
	 * Transaction Quantity is missing or invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRQI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantityMissingOrInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction Quantity is missing or invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionQuantityMissingOrInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantityMissingOrInvalid";
			definition = "Transaction Quantity is missing or invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRQI";
		}
	};
	/**
	 * Transaction quantity is less than the transaction minimum.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRQM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionQuantityLessThanTransactionMinimum"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction quantity is less than the transaction minimum."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode TransactionQuantityLessThanTransactionMinimum = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionQuantityLessThanTransactionMinimum";
			definition = "Transaction quantity is less than the transaction minimum.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRQM";
		}
	};
	/**
	 * Provided by protect, enter 0 for transaction quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRQP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvidedByProtect"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provided by protect, enter 0 for transaction quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode ProvidedByProtect = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvidedByProtect";
			definition = "Provided by protect, enter 0 for transaction quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "TRQP";
		}
	};
	/**
	 * Withdrawal transaction quantity cannot be zero.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WIT0"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransactionQuantityCannotBeZero"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal transaction quantity cannot be zero."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode WithdrawalTransactionQuantityCannotBeZero = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransactionQuantityCannotBeZero";
			definition = "Withdrawal transaction quantity cannot be zero.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "WIT0";
		}
	};
	/**
	 * Error in withdraw occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Error in withdraw occurred."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode WithdrawError = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawError";
			definition = "Error in withdraw occurred.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "WITE";
		}
	};
	/**
	 * Withdrawal quantity is greater than VOI / protect quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalQuantityGreaterThanProtectQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Withdrawal quantity is greater than VOI / protect quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode WithdrawalQuantityGreaterThanProtectQuantity = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalQuantityGreaterThanProtectQuantity";
			definition = "Withdrawal quantity is greater than VOI / protect quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "WITG";
		}
	};
	/**
	 * Withdrawal quantity exceeds the remaining quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalQuantityExceedsRemainingQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal quantity exceeds the remaining quantity."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode WithdrawalQuantityExceedsRemainingQuantity = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalQuantityExceedsRemainingQuantity";
			definition = "Withdrawal quantity exceeds the remaining quantity.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "WITQ";
		}
	};
	/**
	 * Beneficial owner name is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerNameMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficial owner name is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BeneficialOwnerNameMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerNameMissing";
			definition = "Beneficial owner name is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BONM";
		}
	};
	/**
	 * Beneficial owner death date is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BODD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDeathDateMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Beneficial owner death date is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode BeneficialOwnerDeathDateMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDeathDateMissing";
			definition = "Beneficial owner death date is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BODD";
		}
	};
	/**
	 * Death certificate details are missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BODC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeathCertificateMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Death certificate details are missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode DeathCertificateMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeathCertificateMissing";
			definition = "Death certificate details are missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BODC";
		}
	};
	/**
	 * Issuing jurisdiction is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOIJ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuingJurisdictionMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuing jurisdiction is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode IssuingJurisdictionMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuingJurisdictionMissing";
			definition = "Issuing jurisdiction is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "BOIJ";
		}
	};
	/**
	 * Certificate number is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNumberInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate number is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CertificateNumberInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNumberInvalid";
			definition = "Certificate number is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CERN";
		}
	};
	/**
	 * Certificate sequence number is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateSequenceNumberInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate sequence number is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CertificateSequenceNumberInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateSequenceNumberInvalid";
			definition = "Certificate sequence number is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CERS";
		}
	};
	/**
	 * Certificate number is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CENM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificateNameMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Certificate number is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CertificateNameMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificateNameMissing";
			definition = "Certificate number is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "CENM";
		}
	};
	/**
	 * Adjudication of incompetency acknowledgement indicator is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjudication of incompetency acknowledgement indicator is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid";
			definition = "Adjudication of incompetency acknowledgement indicator is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ADIN";
		}
	};
	/**
	 * Adjudication of incompetency acknowledgement indicator is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADIM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Adjudication of incompetency acknowledgement indicator is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing";
			definition = "Adjudication of incompetency acknowledgement indicator is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "ADIM";
		}
	};
	/**
	 * Legal documentation thirty months retention acknowledgement indicator is
	 * invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal documentation thirty months retention acknowledgement indicator is invalid."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid";
			definition = "Legal documentation thirty months retention acknowledgement indicator is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "LEGI";
		}
	};
	/**
	 * Legal documentation thirty Months retention acknowledgement indicator is
	 * missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LEGM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal documentation thirty Months retention acknowledgement indicator is missing."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing";
			definition = "Legal documentation thirty Months retention acknowledgement indicator is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "LEGM";
		}
	};
	/**
	 * Instruction deletion acknowledgement indicator is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDeletionAcknowledgementIndicatorInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction deletion acknowledgement indicator is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode InstructionDeletionAcknowledgementIndicatorInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDeletionAcknowledgementIndicatorInvalid";
			definition = "Instruction deletion acknowledgement indicator is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "INDI";
		}
	};
	/**
	 * Instruction deletion acknowledgement indicator is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionDeletionAcknowledgementIndicatorMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction deletion acknowledgement indicator is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode InstructionDeletionAcknowledgementIndicatorMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionDeletionAcknowledgementIndicatorMissing";
			definition = "Instruction deletion acknowledgement indicator is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "INDM";
		}
	};
	/**
	 * Potential loss acknowledgement indicator is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POLI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentiaLossAcknowledgementIndicatorInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Potential loss acknowledgement indicator is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode PotentiaLossAcknowledgementIndicatorInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentiaLossAcknowledgementIndicatorInvalid";
			definition = "Potential loss acknowledgement indicator is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "POLI";
		}
	};
	/**
	 * Potential loss acknowledgement indicator is missing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "POLM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PotentiaLossAcknowledgementIndicatorMissing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Potential loss acknowledgement indicator is missing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode PotentiaLossAcknowledgementIndicatorMissing = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PotentiaLossAcknowledgementIndicatorMissing";
			definition = "Potential loss acknowledgement indicator is missing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "POLM";
		}
	};
	/**
	 * Warrant subscription charge amount is not balancing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WARC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantSubscriptionChargeAmountInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant subscription charge amount is not balancing."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode WarrantSubscriptionChargeAmountInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantSubscriptionChargeAmountInvalid";
			definition = "Warrant subscription charge amount is not balancing.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "WARC";
		}
	};
	/**
	 * There is a summary difference between the core instruction quantity and
	 * the extension transaction details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoreInstructionQuantityAndExtensionTransactionDetailsDifference"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There is a summary difference between the core instruction quantity and the extension transaction details."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CoreInstructionQuantityAndExtensionTransactionDetailsDifference = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoreInstructionQuantityAndExtensionTransactionDetailsDifference";
			definition = "There is a summary difference between the core instruction quantity and the extension transaction details.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SUME";
		}
	};
	/**
	 * There is summary difference between core oversubscription quantity and
	 * extension transaction details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUMO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} =
	 * "CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "There is summary difference between core oversubscription quantity and extension transaction details."
	 * </li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference";
			definition = "There is summary difference between core oversubscription quantity and extension transaction details.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "SUMO";
		}
	};
	/**
	 * Withdrawal Transaction type is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionRejectionReasonCode
	 * InstructionRejectionReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalTransactionTypeInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Withdrawal Transaction type is invalid."</li>
	 * </ul>
	 */
	public static final InstructionRejectionReasonCode WithdrawalTransactionTypeInvalid = new InstructionRejectionReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalTransactionTypeInvalid";
			definition = "Withdrawal Transaction type is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionRejectionReasonCode.mmObject();
			codeName = "WITI";
		}
	};
	final static private LinkedHashMap<String, InstructionRejectionReasonCode> codesByName = new LinkedHashMap<>();

	protected InstructionRejectionReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionRejectionReasonCode";
				definition = "Reason for rejection of a corporate action instruction or of an instruction cancellation.";
				derivation_lazy = () -> Arrays.asList(InstructionRejectionReason1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionRejectionReasonCode.AcknowledgementNotAgreed, com.tools20022.repository.codeset.InstructionRejectionReasonCode.AcknowledgmentIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.OfferNotATOPEligible, com.tools20022.repository.codeset.InstructionRejectionReasonCode.BidPriceZeroesRequired,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.BidPriceOverMaximumAllowed, com.tools20022.repository.codeset.InstructionRejectionReasonCode.BidPriceOverflow,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.BidPriceMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.BidPriceUnderMinimumAllowed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.BondCheckOnMasterTableNotAvailable, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CorporateActionEventInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CUSIPDepositoryDeliverChilled, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition1Required,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition2Required, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition3Required,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition4Required, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition5Required,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition6Required, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition1InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition2InvalidMustBeNo, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition3InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition4InvalidMustBeNo, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition5InvalidMustBeNo,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition6InvalidMustBeNo, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition1InvalidMustBeYes,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition2InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition3InvalidMustBeYes,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition4InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition5InvalidMustBeYes,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.Condition6InvalidMustBeYes, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ContactNameMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ContactNameNotUsedWithEvent, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ContactPhoneNumberMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ContactPhoneNumberNotUsedWithEvent, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CommentAreaInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ConditionalQuantityZeroesRequired, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ConditionalQuantityExceedsTransactionQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ConditionalQuantityMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ConditionalQuantityCannotBeZero,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ConditionalQuantityDoesNotEqualTransactionQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CoverQuantityGreaterThanProtectQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CustomerQuantitiesAndTotalRightsQuantitiesMismatch, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CustomerSequenceNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CustomerIdentificationMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CUSIPNotDTCEligible,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CUSIPMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.UnderlyingSecurityCUSIPInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.UnderlyingSecurityCUSIPMismatch, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CutoffTimeCheckFailed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CutoffTimePassed, com.tools20022.repository.codeset.InstructionRejectionReasonCode.EntryDatePassed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.EntryDateInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.FractionalUnderlyingQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionTypeInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.FunctionNotAvailable,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.OfferInDatabase, com.tools20022.repository.codeset.InstructionRejectionReasonCode.KeyInformationMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.KayDataNotFound, com.tools20022.repository.codeset.InstructionRejectionReasonCode.InsufficientPosition,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.MasterTablesNotAvailable, com.tools20022.repository.codeset.InstructionRejectionReasonCode.NoWithdrawalPrivilege,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.OddLotIndicatorMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.OddLotIndicatorYesInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.OfferNotEligibleForPuts, com.tools20022.repository.codeset.InstructionRejectionReasonCode.UnknownErrorCondition,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CustomerAndTotalOversubscriptionQuantitiesMismatch, com.tools20022.repository.codeset.InstructionRejectionReasonCode.OversubscriptionQuantityExceeded,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.OversubscriptionQuantityInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.OversubscriptionNotAllowed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.OversubscriptionQuantityNotUsed, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ParticipantDOChilled,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ParticipantEligibilityCheckNotAvailable, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ParticipantNoMatchOnProtectIdentification,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ParticipantLocked, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ParticipantNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ParticipantNotEligible, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ProtectDateZero,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CurrentDatePassedProtectSubmissionEndDate, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ProtectDateInvalidOrMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ProtectDatePassed, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CurrentDatePrecedesProtectSubmissionStartDate,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.ProtectIdentificationMissingOrInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ProtectIdentificationNotUsed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.FunctionQuiesced, com.tools20022.repository.codeset.InstructionRejectionReasonCode.RecordTypeInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.RightsCUSIPInsufficientPosition, com.tools20022.repository.codeset.InstructionRejectionReasonCode.RightsPositionCheckInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.RightsQuantityDivisibleByRights, com.tools20022.repository.codeset.InstructionRejectionReasonCode.RightsQuantityInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.RightsRatioNotFound, com.tools20022.repository.codeset.InstructionRejectionReasonCode.RTSProcessingInProgress,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CustomerSequenceNumberAllZero, com.tools20022.repository.codeset.InstructionRejectionReasonCode.DuplicateTransactionSequenceNumber,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.SequenceNumberMissing, com.tools20022.repository.codeset.InstructionRejectionReasonCode.SequenceNumberOutOfSync,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.SequenceNumberInvalidBounds, com.tools20022.repository.codeset.InstructionRejectionReasonCode.UnderlyingShareQuantityInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.UnderlyingShareQuantityMismatch, com.tools20022.repository.codeset.InstructionRejectionReasonCode.SolicitationFeeCommentsRequired,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.SolicitationFeeIndicatorRequired, com.tools20022.repository.codeset.InstructionRejectionReasonCode.SolicitationFeeIndicatorNotUsed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.SubmissionDateNotReached, com.tools20022.repository.codeset.InstructionRejectionReasonCode.SubmissionDatePassed,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionTypeAndEventIncompatible, com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionIdentificationInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionTypeMissing, com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionSequenceNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionQuantityCannotBeZero, com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionQuantityMissingOrInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.TransactionQuantityLessThanTransactionMinimum, com.tools20022.repository.codeset.InstructionRejectionReasonCode.ProvidedByProtect,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.WithdrawalTransactionQuantityCannotBeZero, com.tools20022.repository.codeset.InstructionRejectionReasonCode.WithdrawError,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.WithdrawalQuantityGreaterThanProtectQuantity,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.WithdrawalQuantityExceedsRemainingQuantity, com.tools20022.repository.codeset.InstructionRejectionReasonCode.BeneficialOwnerNameMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.BeneficialOwnerDeathDateMissing, com.tools20022.repository.codeset.InstructionRejectionReasonCode.DeathCertificateMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.IssuingJurisdictionMissing, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CertificateNumberInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CertificateSequenceNumberInvalid, com.tools20022.repository.codeset.InstructionRejectionReasonCode.CertificateNameMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.InstructionDeletionAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.InstructionDeletionAcknowledgementIndicatorMissing,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.PotentiaLossAcknowledgementIndicatorInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.PotentiaLossAcknowledgementIndicatorMissing, com.tools20022.repository.codeset.InstructionRejectionReasonCode.WarrantSubscriptionChargeAmountInvalid,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CoreInstructionQuantityAndExtensionTransactionDetailsDifference,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference,
						com.tools20022.repository.codeset.InstructionRejectionReasonCode.WithdrawalTransactionTypeInvalid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcknowledgementNotAgreed.getCodeName().get(), AcknowledgementNotAgreed);
		codesByName.put(AcknowledgmentIndicatorMissing.getCodeName().get(), AcknowledgmentIndicatorMissing);
		codesByName.put(OfferNotATOPEligible.getCodeName().get(), OfferNotATOPEligible);
		codesByName.put(BidPriceZeroesRequired.getCodeName().get(), BidPriceZeroesRequired);
		codesByName.put(BidPriceOverMaximumAllowed.getCodeName().get(), BidPriceOverMaximumAllowed);
		codesByName.put(BidPriceOverflow.getCodeName().get(), BidPriceOverflow);
		codesByName.put(BidPriceMissingOrInvalid.getCodeName().get(), BidPriceMissingOrInvalid);
		codesByName.put(BidPriceUnderMinimumAllowed.getCodeName().get(), BidPriceUnderMinimumAllowed);
		codesByName.put(BondCheckOnMasterTableNotAvailable.getCodeName().get(), BondCheckOnMasterTableNotAvailable);
		codesByName.put(CorporateActionEventInvalid.getCodeName().get(), CorporateActionEventInvalid);
		codesByName.put(CUSIPDepositoryDeliverChilled.getCodeName().get(), CUSIPDepositoryDeliverChilled);
		codesByName.put(Condition1Required.getCodeName().get(), Condition1Required);
		codesByName.put(Condition2Required.getCodeName().get(), Condition2Required);
		codesByName.put(Condition3Required.getCodeName().get(), Condition3Required);
		codesByName.put(Condition4Required.getCodeName().get(), Condition4Required);
		codesByName.put(Condition5Required.getCodeName().get(), Condition5Required);
		codesByName.put(Condition6Required.getCodeName().get(), Condition6Required);
		codesByName.put(Condition1InvalidMustBeNo.getCodeName().get(), Condition1InvalidMustBeNo);
		codesByName.put(Condition2InvalidMustBeNo.getCodeName().get(), Condition2InvalidMustBeNo);
		codesByName.put(Condition3InvalidMustBeNo.getCodeName().get(), Condition3InvalidMustBeNo);
		codesByName.put(Condition4InvalidMustBeNo.getCodeName().get(), Condition4InvalidMustBeNo);
		codesByName.put(Condition5InvalidMustBeNo.getCodeName().get(), Condition5InvalidMustBeNo);
		codesByName.put(Condition6InvalidMustBeNo.getCodeName().get(), Condition6InvalidMustBeNo);
		codesByName.put(Condition1InvalidMustBeYes.getCodeName().get(), Condition1InvalidMustBeYes);
		codesByName.put(Condition2InvalidMustBeYes.getCodeName().get(), Condition2InvalidMustBeYes);
		codesByName.put(Condition3InvalidMustBeYes.getCodeName().get(), Condition3InvalidMustBeYes);
		codesByName.put(Condition4InvalidMustBeYes.getCodeName().get(), Condition4InvalidMustBeYes);
		codesByName.put(Condition5InvalidMustBeYes.getCodeName().get(), Condition5InvalidMustBeYes);
		codesByName.put(Condition6InvalidMustBeYes.getCodeName().get(), Condition6InvalidMustBeYes);
		codesByName.put(ContactNameMissing.getCodeName().get(), ContactNameMissing);
		codesByName.put(ContactNameNotUsedWithEvent.getCodeName().get(), ContactNameNotUsedWithEvent);
		codesByName.put(ContactPhoneNumberMissing.getCodeName().get(), ContactPhoneNumberMissing);
		codesByName.put(ContactPhoneNumberNotUsedWithEvent.getCodeName().get(), ContactPhoneNumberNotUsedWithEvent);
		codesByName.put(CommentAreaInvalid.getCodeName().get(), CommentAreaInvalid);
		codesByName.put(ConditionalQuantityZeroesRequired.getCodeName().get(), ConditionalQuantityZeroesRequired);
		codesByName.put(ConditionalQuantityExceedsTransactionQuantity.getCodeName().get(), ConditionalQuantityExceedsTransactionQuantity);
		codesByName.put(ConditionalQuantityMissingOrInvalid.getCodeName().get(), ConditionalQuantityMissingOrInvalid);
		codesByName.put(ConditionalQuantityCannotBeZero.getCodeName().get(), ConditionalQuantityCannotBeZero);
		codesByName.put(ConditionalQuantityDoesNotEqualTransactionQuantity.getCodeName().get(), ConditionalQuantityDoesNotEqualTransactionQuantity);
		codesByName.put(CoverQuantityGreaterThanProtectQuantity.getCodeName().get(), CoverQuantityGreaterThanProtectQuantity);
		codesByName.put(CustomerQuantitiesAndTotalRightsQuantitiesMismatch.getCodeName().get(), CustomerQuantitiesAndTotalRightsQuantitiesMismatch);
		codesByName.put(CustomerSequenceNumberInvalid.getCodeName().get(), CustomerSequenceNumberInvalid);
		codesByName.put(CustomerIdentificationMissingOrInvalid.getCodeName().get(), CustomerIdentificationMissingOrInvalid);
		codesByName.put(CUSIPNotDTCEligible.getCodeName().get(), CUSIPNotDTCEligible);
		codesByName.put(CUSIPMissingOrInvalid.getCodeName().get(), CUSIPMissingOrInvalid);
		codesByName.put(UnderlyingSecurityCUSIPInvalid.getCodeName().get(), UnderlyingSecurityCUSIPInvalid);
		codesByName.put(UnderlyingSecurityCUSIPMismatch.getCodeName().get(), UnderlyingSecurityCUSIPMismatch);
		codesByName.put(CutoffTimeCheckFailed.getCodeName().get(), CutoffTimeCheckFailed);
		codesByName.put(CutoffTimePassed.getCodeName().get(), CutoffTimePassed);
		codesByName.put(EntryDatePassed.getCodeName().get(), EntryDatePassed);
		codesByName.put(EntryDateInvalid.getCodeName().get(), EntryDateInvalid);
		codesByName.put(FractionalUnderlyingQuantity.getCodeName().get(), FractionalUnderlyingQuantity);
		codesByName.put(TransactionTypeInvalid.getCodeName().get(), TransactionTypeInvalid);
		codesByName.put(FunctionNotAvailable.getCodeName().get(), FunctionNotAvailable);
		codesByName.put(OfferInDatabase.getCodeName().get(), OfferInDatabase);
		codesByName.put(KeyInformationMissing.getCodeName().get(), KeyInformationMissing);
		codesByName.put(KayDataNotFound.getCodeName().get(), KayDataNotFound);
		codesByName.put(InsufficientPosition.getCodeName().get(), InsufficientPosition);
		codesByName.put(MasterTablesNotAvailable.getCodeName().get(), MasterTablesNotAvailable);
		codesByName.put(NoWithdrawalPrivilege.getCodeName().get(), NoWithdrawalPrivilege);
		codesByName.put(OddLotIndicatorMissingOrInvalid.getCodeName().get(), OddLotIndicatorMissingOrInvalid);
		codesByName.put(OddLotIndicatorYesInvalid.getCodeName().get(), OddLotIndicatorYesInvalid);
		codesByName.put(OfferNotEligibleForPuts.getCodeName().get(), OfferNotEligibleForPuts);
		codesByName.put(UnknownErrorCondition.getCodeName().get(), UnknownErrorCondition);
		codesByName.put(CustomerAndTotalOversubscriptionQuantitiesMismatch.getCodeName().get(), CustomerAndTotalOversubscriptionQuantitiesMismatch);
		codesByName.put(OversubscriptionQuantityExceeded.getCodeName().get(), OversubscriptionQuantityExceeded);
		codesByName.put(OversubscriptionQuantityInvalid.getCodeName().get(), OversubscriptionQuantityInvalid);
		codesByName.put(OversubscriptionNotAllowed.getCodeName().get(), OversubscriptionNotAllowed);
		codesByName.put(OversubscriptionQuantityNotUsed.getCodeName().get(), OversubscriptionQuantityNotUsed);
		codesByName.put(ParticipantDOChilled.getCodeName().get(), ParticipantDOChilled);
		codesByName.put(ParticipantEligibilityCheckNotAvailable.getCodeName().get(), ParticipantEligibilityCheckNotAvailable);
		codesByName.put(ParticipantNoMatchOnProtectIdentification.getCodeName().get(), ParticipantNoMatchOnProtectIdentification);
		codesByName.put(ParticipantLocked.getCodeName().get(), ParticipantLocked);
		codesByName.put(ParticipantNumberInvalid.getCodeName().get(), ParticipantNumberInvalid);
		codesByName.put(ParticipantNotEligible.getCodeName().get(), ParticipantNotEligible);
		codesByName.put(ProtectDateZero.getCodeName().get(), ProtectDateZero);
		codesByName.put(CurrentDatePassedProtectSubmissionEndDate.getCodeName().get(), CurrentDatePassedProtectSubmissionEndDate);
		codesByName.put(ProtectDateInvalidOrMissing.getCodeName().get(), ProtectDateInvalidOrMissing);
		codesByName.put(ProtectDatePassed.getCodeName().get(), ProtectDatePassed);
		codesByName.put(CurrentDatePrecedesProtectSubmissionStartDate.getCodeName().get(), CurrentDatePrecedesProtectSubmissionStartDate);
		codesByName.put(ProtectIdentificationMissingOrInvalid.getCodeName().get(), ProtectIdentificationMissingOrInvalid);
		codesByName.put(ProtectIdentificationNotUsed.getCodeName().get(), ProtectIdentificationNotUsed);
		codesByName.put(FunctionQuiesced.getCodeName().get(), FunctionQuiesced);
		codesByName.put(RecordTypeInvalid.getCodeName().get(), RecordTypeInvalid);
		codesByName.put(RightsCUSIPInsufficientPosition.getCodeName().get(), RightsCUSIPInsufficientPosition);
		codesByName.put(RightsPositionCheckInvalid.getCodeName().get(), RightsPositionCheckInvalid);
		codesByName.put(RightsQuantityDivisibleByRights.getCodeName().get(), RightsQuantityDivisibleByRights);
		codesByName.put(RightsQuantityInvalid.getCodeName().get(), RightsQuantityInvalid);
		codesByName.put(RightsRatioNotFound.getCodeName().get(), RightsRatioNotFound);
		codesByName.put(RTSProcessingInProgress.getCodeName().get(), RTSProcessingInProgress);
		codesByName.put(CustomerSequenceNumberAllZero.getCodeName().get(), CustomerSequenceNumberAllZero);
		codesByName.put(DuplicateTransactionSequenceNumber.getCodeName().get(), DuplicateTransactionSequenceNumber);
		codesByName.put(SequenceNumberMissing.getCodeName().get(), SequenceNumberMissing);
		codesByName.put(SequenceNumberOutOfSync.getCodeName().get(), SequenceNumberOutOfSync);
		codesByName.put(SequenceNumberInvalidBounds.getCodeName().get(), SequenceNumberInvalidBounds);
		codesByName.put(UnderlyingShareQuantityInvalid.getCodeName().get(), UnderlyingShareQuantityInvalid);
		codesByName.put(UnderlyingShareQuantityMismatch.getCodeName().get(), UnderlyingShareQuantityMismatch);
		codesByName.put(SolicitationFeeCommentsRequired.getCodeName().get(), SolicitationFeeCommentsRequired);
		codesByName.put(SolicitationFeeIndicatorRequired.getCodeName().get(), SolicitationFeeIndicatorRequired);
		codesByName.put(SolicitationFeeIndicatorNotUsed.getCodeName().get(), SolicitationFeeIndicatorNotUsed);
		codesByName.put(SubmissionDateNotReached.getCodeName().get(), SubmissionDateNotReached);
		codesByName.put(SubmissionDatePassed.getCodeName().get(), SubmissionDatePassed);
		codesByName.put(TransactionTypeAndEventIncompatible.getCodeName().get(), TransactionTypeAndEventIncompatible);
		codesByName.put(TransactionIdentificationInvalid.getCodeName().get(), TransactionIdentificationInvalid);
		codesByName.put(TransactionTypeMissing.getCodeName().get(), TransactionTypeMissing);
		codesByName.put(TransactionSequenceNumberInvalid.getCodeName().get(), TransactionSequenceNumberInvalid);
		codesByName.put(TransactionQuantityCannotBeZero.getCodeName().get(), TransactionQuantityCannotBeZero);
		codesByName.put(TransactionQuantityMissingOrInvalid.getCodeName().get(), TransactionQuantityMissingOrInvalid);
		codesByName.put(TransactionQuantityLessThanTransactionMinimum.getCodeName().get(), TransactionQuantityLessThanTransactionMinimum);
		codesByName.put(ProvidedByProtect.getCodeName().get(), ProvidedByProtect);
		codesByName.put(WithdrawalTransactionQuantityCannotBeZero.getCodeName().get(), WithdrawalTransactionQuantityCannotBeZero);
		codesByName.put(WithdrawError.getCodeName().get(), WithdrawError);
		codesByName.put(WithdrawalQuantityGreaterThanProtectQuantity.getCodeName().get(), WithdrawalQuantityGreaterThanProtectQuantity);
		codesByName.put(WithdrawalQuantityExceedsRemainingQuantity.getCodeName().get(), WithdrawalQuantityExceedsRemainingQuantity);
		codesByName.put(BeneficialOwnerNameMissing.getCodeName().get(), BeneficialOwnerNameMissing);
		codesByName.put(BeneficialOwnerDeathDateMissing.getCodeName().get(), BeneficialOwnerDeathDateMissing);
		codesByName.put(DeathCertificateMissing.getCodeName().get(), DeathCertificateMissing);
		codesByName.put(IssuingJurisdictionMissing.getCodeName().get(), IssuingJurisdictionMissing);
		codesByName.put(CertificateNumberInvalid.getCodeName().get(), CertificateNumberInvalid);
		codesByName.put(CertificateSequenceNumberInvalid.getCodeName().get(), CertificateSequenceNumberInvalid);
		codesByName.put(CertificateNameMissing.getCodeName().get(), CertificateNameMissing);
		codesByName.put(AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid.getCodeName().get(), AdjudicationOfIncompetencyAcknowledgementIndicatorInvalid);
		codesByName.put(AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing.getCodeName().get(), AdjudicationOfIncompetencyAcknowledgmentIndicatorMissing);
		codesByName.put(LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid.getCodeName().get(), LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorInvalid);
		codesByName.put(LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing.getCodeName().get(), LegalDocumentationThirtyMonthsRetentionAcknowledgementIndicatorMissing);
		codesByName.put(InstructionDeletionAcknowledgementIndicatorInvalid.getCodeName().get(), InstructionDeletionAcknowledgementIndicatorInvalid);
		codesByName.put(InstructionDeletionAcknowledgementIndicatorMissing.getCodeName().get(), InstructionDeletionAcknowledgementIndicatorMissing);
		codesByName.put(PotentiaLossAcknowledgementIndicatorInvalid.getCodeName().get(), PotentiaLossAcknowledgementIndicatorInvalid);
		codesByName.put(PotentiaLossAcknowledgementIndicatorMissing.getCodeName().get(), PotentiaLossAcknowledgementIndicatorMissing);
		codesByName.put(WarrantSubscriptionChargeAmountInvalid.getCodeName().get(), WarrantSubscriptionChargeAmountInvalid);
		codesByName.put(CoreInstructionQuantityAndExtensionTransactionDetailsDifference.getCodeName().get(), CoreInstructionQuantityAndExtensionTransactionDetailsDifference);
		codesByName.put(CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference.getCodeName().get(), CoreInstructionOversubscriptionQuantityAndExtensionTransactionDetailsDifference);
		codesByName.put(WithdrawalTransactionTypeInvalid.getCodeName().get(), WithdrawalTransactionTypeInvalid);
	}

	public static InstructionRejectionReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionRejectionReasonCode[] values() {
		InstructionRejectionReasonCode[] values = new InstructionRejectionReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionRejectionReasonCode> {
		@Override
		public InstructionRejectionReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionRejectionReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}