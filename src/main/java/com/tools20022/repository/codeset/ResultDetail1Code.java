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
import com.tools20022.repository.codeset.ResultDetail1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Detail of the result.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#AccountNotFound
 * ResultDetail1Code.AccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#AcquirerNotSupported
 * ResultDetail1Code.AcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#AMLValidation
 * ResultDetail1Code.AMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#AmountNotFound
 * ResultDetail1Code.AmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#BankNotFound
 * ResultDetail1Code.BankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#CardError
 * ResultDetail1Code.CardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#CardVerificationFailed
 * ResultDetail1Code.CardVerificationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#CasbackNotAllowed
 * ResultDetail1Code.CasbackNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#CashbackAmountExceeded
 * ResultDetail1Code.CashbackAmountExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#ClosedAccount
 * ResultDetail1Code.ClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#CutoverInProcess
 * ResultDetail1Code.CutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#DatabaseError
 * ResultDetail1Code.DatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#DisputedFees
 * ResultDetail1Code.DisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#ExceededTransactionLifeCycle
 * ResultDetail1Code.ExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#ExpiredCard
 * ResultDetail1Code.ExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#FormatError
 * ResultDetail1Code.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#FromAccountError
 * ResultDetail1Code.FromAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InProgress
 * ResultDetail1Code.InProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InsufficientFunds
 * ResultDetail1Code.InsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidAcceptor
 * ResultDetail1Code.InvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidAmount
 * ResultDetail1Code.InvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidCardholderIdentification
 * ResultDetail1Code.InvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidCardNumber
 * ResultDetail1Code.InvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidCertificate
 * ResultDetail1Code.InvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#NotPermittedToAcceptor
 * ResultDetail1Code.NotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#NotAbleToValidatePIN
 * ResultDetail1Code.NotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#NoLiabilityAccepted
 * ResultDetail1Code.NoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#NoCardRecord
 * ResultDetail1Code.NoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#NewPINInvalid
 * ResultDetail1Code.NewPINInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#MACKeyError
 * ResultDetail1Code.MACKeyError}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail1Code#MACError
 * ResultDetail1Code.MACError}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail1Code#LostCard
 * ResultDetail1Code.LostCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#LiabilityAccepted
 * ResultDetail1Code.LiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#IssuerUnavailable
 * ResultDetail1Code.IssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#IssuerTimeOut
 * ResultDetail1Code.IssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#IssuerSignedOff
 * ResultDetail1Code.IssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#IssuerNotFound
 * ResultDetail1Code.IssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#IssuerInoperative
 * ResultDetail1Code.IssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidTransactionDateTime
 * ResultDetail1Code.InvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidTransaction
 * ResultDetail1Code.InvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidTokenIdentification
 * ResultDetail1Code.InvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidToken
 * ResultDetail1Code.InvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidSecurityCode
 * ResultDetail1Code.InvalidSecurityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidPIN
 * ResultDetail1Code.InvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#InvalidOriginalAmount
 * ResultDetail1Code.InvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#NotPermittedToCardholder
 * ResultDetail1Code.NotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#OffLineProcess
 * ResultDetail1Code.OffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#OffLineProcessAfterReferral
 * ResultDetail1Code.OffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#OriginalDoesNotMatch
 * ResultDetail1Code.OriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#OtherError
 * ResultDetail1Code.OtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#OutOfBalance
 * ResultDetail1Code.OutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#OutOfSequence
 * ResultDetail1Code.OutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PaymentAmountLimit
 * ResultDetail1Code.PaymentAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PaymentNumberLimit
 * ResultDetail1Code.PaymentNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PINChangeRequired
 * ResultDetail1Code.PINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PINDataRequired
 * ResultDetail1Code.PINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PINEncryptionError
 * ResultDetail1Code.PINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PINSecurityError
 * ResultDetail1Code.PINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#PINTriesExceeded
 * ResultDetail1Code.PINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#QueueMaximumExceeded
 * ResultDetail1Code.QueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#RecurringDataError
 * ResultDetail1Code.RecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#RestrictedCard
 * ResultDetail1Code.RestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SecurityViolation
 * ResultDetail1Code.SecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SoftwareOrHardwareError
 * ResultDetail1Code.SoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SpecialConditions
 * ResultDetail1Code.SpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#WrongCard
 * ResultDetail1Code.WrongCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#WithdrawalNumberLimit
 * ResultDetail1Code.WithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#WithdrawalAmountLimit
 * ResultDetail1Code.WithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#VendorNotFound
 * ResultDetail1Code.VendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#VendorFormatError
 * ResultDetail1Code.VendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UnsupportedService
 * ResultDetail1Code.UnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UneffectiveCard
 * ResultDetail1Code.UneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UnavailablecommunicationKey
 * ResultDetail1Code.UnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UnacceptableCurrency
 * ResultDetail1Code.UnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UnableToProcessOffLine
 * ResultDetail1Code.UnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UnableToGoOnLine
 * ResultDetail1Code.UnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#UnableToFindOriginal
 * ResultDetail1Code.UnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#TransactionDuplicate
 * ResultDetail1Code.TransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#TransactionDidNotComplete
 * ResultDetail1Code.TransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#TotalsNotAvailable
 * ResultDetail1Code.TotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#ToAccountError
 * ResultDetail1Code.ToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SystemMalfunction
 * ResultDetail1Code.SystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SystemInoperative
 * ResultDetail1Code.SystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SuspectedFraud
 * ResultDetail1Code.SuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SuspectedCounterfeitCard
 * ResultDetail1Code.SuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#SurchargeNotPermitted
 * ResultDetail1Code.SurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#StolenCard
 * ResultDetail1Code.StolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#AcknowledgementOnly
 * ResultDetail1Code.AcknowledgementOnly}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
 * ResultDetailCode}</li>
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
 * "ResultDetail1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the result."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResultDetail1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code AccountNotFound = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.AccountNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerNotSupported"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code AcquirerNotSupported = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.AcquirerNotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLValidation"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code AMLValidation = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.AMLValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code AmountNotFound = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.AmountNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code BankNotFound = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.BankNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code CardError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.CardError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerificationFailed"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code CardVerificationFailed = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.CardVerificationFailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CasbackNotAllowed"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code CasbackNotAllowed = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CasbackNotAllowed";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.CasbackNotAllowed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashbackAmountExceeded"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code CashbackAmountExceeded = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashbackAmountExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.CashbackAmountExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccount"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code ClosedAccount = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.ClosedAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoverInProcess"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code CutoverInProcess = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.CutoverInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatabaseError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code DatabaseError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.DatabaseError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedFees"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code DisputedFees = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.DisputedFees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceededTransactionLifeCycle"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code ExceededTransactionLifeCycle = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.ExceededTransactionLifeCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiredCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code ExpiredCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.ExpiredCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code FormatError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAccountError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code FromAccountError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAccountError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.FromAccountError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProgress"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InProgress = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InsufficientFunds = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InsufficientFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAcceptor"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidAcceptor = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidAcceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAmount"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidAmount = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardholderIdentification"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidCardholderIdentification = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidCardholderIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardNumber"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidCardNumber = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCertificate"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidCertificate = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToAcceptor"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code NotPermittedToAcceptor = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.NotPermittedToAcceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAbleToValidatePIN"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code NotAbleToValidatePIN = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.NotAbleToValidatePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLiabilityAccepted"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code NoLiabilityAccepted = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.NoLiabilityAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCardRecord"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code NoCardRecord = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.NoCardRecord.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPINInvalid"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code NewPINInvalid = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.NewPINInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACKeyError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code MACKeyError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.MACKeyError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code MACError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.MACError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code LostCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.LostCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiabilityAccepted"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code LiabilityAccepted = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.LiabilityAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code IssuerUnavailable = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.IssuerUnavailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeOut"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code IssuerTimeOut = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.IssuerTimeOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code IssuerSignedOff = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.IssuerSignedOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code IssuerNotFound = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.IssuerNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInoperative"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code IssuerInoperative = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.IssuerInoperative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransactionDateTime"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidTransactionDateTime = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidTransactionDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransaction"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidTransaction = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTokenIdentification"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidTokenIdentification = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidTokenIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidToken"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidToken = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidToken.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurityCode"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidSecurityCode = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurityCode";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidSecurityCode.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPIN"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidPIN = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidPIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOriginalAmount"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code InvalidOriginalAmount = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.InvalidOriginalAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToCardholder"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code NotPermittedToCardholder = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.NotPermittedToCardholder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcess"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code OffLineProcess = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.OffLineProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcessAfterReferral"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code OffLineProcessAfterReferral = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.OffLineProcessAfterReferral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDoesNotMatch"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code OriginalDoesNotMatch = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.OriginalDoesNotMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code OtherError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.OtherError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfBalance"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code OutOfBalance = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.OutOfBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSequence"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code OutOfSequence = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.OutOfSequence.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentAmountLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PaymentAmountLimit = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentAmountLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PaymentAmountLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentNumberLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PaymentNumberLimit = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentNumberLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PaymentNumberLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChangeRequired"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PINChangeRequired = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PINChangeRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDataRequired"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PINDataRequired = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PINDataRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryptionError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PINEncryptionError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PINEncryptionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINSecurityError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PINSecurityError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PINSecurityError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINTriesExceeded"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code PINTriesExceeded = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.PINTriesExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueMaximumExceeded"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code QueueMaximumExceeded = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.QueueMaximumExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringDataError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code RecurringDataError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.RecurringDataError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code RestrictedCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.RestrictedCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityViolation"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SecurityViolation = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SecurityViolation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareOrHardwareError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SoftwareOrHardwareError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SoftwareOrHardwareError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SpecialConditions = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SpecialConditions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code WrongCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.WrongCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalNumberLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code WithdrawalNumberLimit = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.WithdrawalNumberLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAmountLimit"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code WithdrawalAmountLimit = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.WithdrawalAmountLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorNotFound"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code VendorNotFound = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.VendorNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorFormatError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code VendorFormatError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.VendorFormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsupportedService"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UnsupportedService = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UnsupportedService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UneffectiveCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UneffectiveCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UneffectiveCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailablecommunicationKey"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UnavailablecommunicationKey = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UnavailablecommunicationKey.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableCurrency"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UnacceptableCurrency = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UnacceptableCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcessOffLine"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UnableToProcessOffLine = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UnableToProcessOffLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToGoOnLine"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UnableToGoOnLine = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UnableToGoOnLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToFindOriginal"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code UnableToFindOriginal = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.UnableToFindOriginal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDuplicate"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code TransactionDuplicate = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.TransactionDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDidNotComplete"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code TransactionDidNotComplete = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.TransactionDidNotComplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsNotAvailable"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code TotalsNotAvailable = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.TotalsNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAccountError"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code ToAccountError = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.ToAccountError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMalfunction"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SystemMalfunction = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SystemMalfunction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInoperative"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SystemInoperative = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SystemInoperative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SuspectedFraud = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SuspectedFraud.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeitCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SuspectedCounterfeitCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SuspectedCounterfeitCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurchargeNotPermitted"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code SurchargeNotPermitted = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.SurchargeNotPermitted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StolenCard"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code StolenCard = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.StolenCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code
	 * ResultDetail1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementOnly"</li>
	 * </ul>
	 */
	public static final ResultDetail1Code AcknowledgementOnly = new ResultDetail1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementOnly";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail1Code.mmObject();
			codeName = ResultDetailCode.AcknowledgementOnly.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ResultDetail1Code> codesByName = new LinkedHashMap<>();

	protected ResultDetail1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResultDetail1Code";
				definition = "Detail of the result.";
				trace_lazy = () -> ResultDetailCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResultDetail1Code.AccountNotFound, com.tools20022.repository.codeset.ResultDetail1Code.AcquirerNotSupported,
						com.tools20022.repository.codeset.ResultDetail1Code.AMLValidation, com.tools20022.repository.codeset.ResultDetail1Code.AmountNotFound, com.tools20022.repository.codeset.ResultDetail1Code.BankNotFound,
						com.tools20022.repository.codeset.ResultDetail1Code.CardError, com.tools20022.repository.codeset.ResultDetail1Code.CardVerificationFailed, com.tools20022.repository.codeset.ResultDetail1Code.CasbackNotAllowed,
						com.tools20022.repository.codeset.ResultDetail1Code.CashbackAmountExceeded, com.tools20022.repository.codeset.ResultDetail1Code.ClosedAccount, com.tools20022.repository.codeset.ResultDetail1Code.CutoverInProcess,
						com.tools20022.repository.codeset.ResultDetail1Code.DatabaseError, com.tools20022.repository.codeset.ResultDetail1Code.DisputedFees, com.tools20022.repository.codeset.ResultDetail1Code.ExceededTransactionLifeCycle,
						com.tools20022.repository.codeset.ResultDetail1Code.ExpiredCard, com.tools20022.repository.codeset.ResultDetail1Code.FormatError, com.tools20022.repository.codeset.ResultDetail1Code.FromAccountError,
						com.tools20022.repository.codeset.ResultDetail1Code.InProgress, com.tools20022.repository.codeset.ResultDetail1Code.InsufficientFunds, com.tools20022.repository.codeset.ResultDetail1Code.InvalidAcceptor,
						com.tools20022.repository.codeset.ResultDetail1Code.InvalidAmount, com.tools20022.repository.codeset.ResultDetail1Code.InvalidCardholderIdentification,
						com.tools20022.repository.codeset.ResultDetail1Code.InvalidCardNumber, com.tools20022.repository.codeset.ResultDetail1Code.InvalidCertificate,
						com.tools20022.repository.codeset.ResultDetail1Code.NotPermittedToAcceptor, com.tools20022.repository.codeset.ResultDetail1Code.NotAbleToValidatePIN,
						com.tools20022.repository.codeset.ResultDetail1Code.NoLiabilityAccepted, com.tools20022.repository.codeset.ResultDetail1Code.NoCardRecord, com.tools20022.repository.codeset.ResultDetail1Code.NewPINInvalid,
						com.tools20022.repository.codeset.ResultDetail1Code.MACKeyError, com.tools20022.repository.codeset.ResultDetail1Code.MACError, com.tools20022.repository.codeset.ResultDetail1Code.LostCard,
						com.tools20022.repository.codeset.ResultDetail1Code.LiabilityAccepted, com.tools20022.repository.codeset.ResultDetail1Code.IssuerUnavailable, com.tools20022.repository.codeset.ResultDetail1Code.IssuerTimeOut,
						com.tools20022.repository.codeset.ResultDetail1Code.IssuerSignedOff, com.tools20022.repository.codeset.ResultDetail1Code.IssuerNotFound, com.tools20022.repository.codeset.ResultDetail1Code.IssuerInoperative,
						com.tools20022.repository.codeset.ResultDetail1Code.InvalidTransactionDateTime, com.tools20022.repository.codeset.ResultDetail1Code.InvalidTransaction,
						com.tools20022.repository.codeset.ResultDetail1Code.InvalidTokenIdentification, com.tools20022.repository.codeset.ResultDetail1Code.InvalidToken,
						com.tools20022.repository.codeset.ResultDetail1Code.InvalidSecurityCode, com.tools20022.repository.codeset.ResultDetail1Code.InvalidPIN, com.tools20022.repository.codeset.ResultDetail1Code.InvalidOriginalAmount,
						com.tools20022.repository.codeset.ResultDetail1Code.NotPermittedToCardholder, com.tools20022.repository.codeset.ResultDetail1Code.OffLineProcess,
						com.tools20022.repository.codeset.ResultDetail1Code.OffLineProcessAfterReferral, com.tools20022.repository.codeset.ResultDetail1Code.OriginalDoesNotMatch,
						com.tools20022.repository.codeset.ResultDetail1Code.OtherError, com.tools20022.repository.codeset.ResultDetail1Code.OutOfBalance, com.tools20022.repository.codeset.ResultDetail1Code.OutOfSequence,
						com.tools20022.repository.codeset.ResultDetail1Code.PaymentAmountLimit, com.tools20022.repository.codeset.ResultDetail1Code.PaymentNumberLimit, com.tools20022.repository.codeset.ResultDetail1Code.PINChangeRequired,
						com.tools20022.repository.codeset.ResultDetail1Code.PINDataRequired, com.tools20022.repository.codeset.ResultDetail1Code.PINEncryptionError, com.tools20022.repository.codeset.ResultDetail1Code.PINSecurityError,
						com.tools20022.repository.codeset.ResultDetail1Code.PINTriesExceeded, com.tools20022.repository.codeset.ResultDetail1Code.QueueMaximumExceeded, com.tools20022.repository.codeset.ResultDetail1Code.RecurringDataError,
						com.tools20022.repository.codeset.ResultDetail1Code.RestrictedCard, com.tools20022.repository.codeset.ResultDetail1Code.SecurityViolation, com.tools20022.repository.codeset.ResultDetail1Code.SoftwareOrHardwareError,
						com.tools20022.repository.codeset.ResultDetail1Code.SpecialConditions, com.tools20022.repository.codeset.ResultDetail1Code.WrongCard, com.tools20022.repository.codeset.ResultDetail1Code.WithdrawalNumberLimit,
						com.tools20022.repository.codeset.ResultDetail1Code.WithdrawalAmountLimit, com.tools20022.repository.codeset.ResultDetail1Code.VendorNotFound, com.tools20022.repository.codeset.ResultDetail1Code.VendorFormatError,
						com.tools20022.repository.codeset.ResultDetail1Code.UnsupportedService, com.tools20022.repository.codeset.ResultDetail1Code.UneffectiveCard,
						com.tools20022.repository.codeset.ResultDetail1Code.UnavailablecommunicationKey, com.tools20022.repository.codeset.ResultDetail1Code.UnacceptableCurrency,
						com.tools20022.repository.codeset.ResultDetail1Code.UnableToProcessOffLine, com.tools20022.repository.codeset.ResultDetail1Code.UnableToGoOnLine,
						com.tools20022.repository.codeset.ResultDetail1Code.UnableToFindOriginal, com.tools20022.repository.codeset.ResultDetail1Code.TransactionDuplicate,
						com.tools20022.repository.codeset.ResultDetail1Code.TransactionDidNotComplete, com.tools20022.repository.codeset.ResultDetail1Code.TotalsNotAvailable,
						com.tools20022.repository.codeset.ResultDetail1Code.ToAccountError, com.tools20022.repository.codeset.ResultDetail1Code.SystemMalfunction, com.tools20022.repository.codeset.ResultDetail1Code.SystemInoperative,
						com.tools20022.repository.codeset.ResultDetail1Code.SuspectedFraud, com.tools20022.repository.codeset.ResultDetail1Code.SuspectedCounterfeitCard,
						com.tools20022.repository.codeset.ResultDetail1Code.SurchargeNotPermitted, com.tools20022.repository.codeset.ResultDetail1Code.StolenCard, com.tools20022.repository.codeset.ResultDetail1Code.AcknowledgementOnly);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountNotFound.getCodeName().get(), AccountNotFound);
		codesByName.put(AcquirerNotSupported.getCodeName().get(), AcquirerNotSupported);
		codesByName.put(AMLValidation.getCodeName().get(), AMLValidation);
		codesByName.put(AmountNotFound.getCodeName().get(), AmountNotFound);
		codesByName.put(BankNotFound.getCodeName().get(), BankNotFound);
		codesByName.put(CardError.getCodeName().get(), CardError);
		codesByName.put(CardVerificationFailed.getCodeName().get(), CardVerificationFailed);
		codesByName.put(CasbackNotAllowed.getCodeName().get(), CasbackNotAllowed);
		codesByName.put(CashbackAmountExceeded.getCodeName().get(), CashbackAmountExceeded);
		codesByName.put(ClosedAccount.getCodeName().get(), ClosedAccount);
		codesByName.put(CutoverInProcess.getCodeName().get(), CutoverInProcess);
		codesByName.put(DatabaseError.getCodeName().get(), DatabaseError);
		codesByName.put(DisputedFees.getCodeName().get(), DisputedFees);
		codesByName.put(ExceededTransactionLifeCycle.getCodeName().get(), ExceededTransactionLifeCycle);
		codesByName.put(ExpiredCard.getCodeName().get(), ExpiredCard);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(FromAccountError.getCodeName().get(), FromAccountError);
		codesByName.put(InProgress.getCodeName().get(), InProgress);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
		codesByName.put(InvalidAcceptor.getCodeName().get(), InvalidAcceptor);
		codesByName.put(InvalidAmount.getCodeName().get(), InvalidAmount);
		codesByName.put(InvalidCardholderIdentification.getCodeName().get(), InvalidCardholderIdentification);
		codesByName.put(InvalidCardNumber.getCodeName().get(), InvalidCardNumber);
		codesByName.put(InvalidCertificate.getCodeName().get(), InvalidCertificate);
		codesByName.put(NotPermittedToAcceptor.getCodeName().get(), NotPermittedToAcceptor);
		codesByName.put(NotAbleToValidatePIN.getCodeName().get(), NotAbleToValidatePIN);
		codesByName.put(NoLiabilityAccepted.getCodeName().get(), NoLiabilityAccepted);
		codesByName.put(NoCardRecord.getCodeName().get(), NoCardRecord);
		codesByName.put(NewPINInvalid.getCodeName().get(), NewPINInvalid);
		codesByName.put(MACKeyError.getCodeName().get(), MACKeyError);
		codesByName.put(MACError.getCodeName().get(), MACError);
		codesByName.put(LostCard.getCodeName().get(), LostCard);
		codesByName.put(LiabilityAccepted.getCodeName().get(), LiabilityAccepted);
		codesByName.put(IssuerUnavailable.getCodeName().get(), IssuerUnavailable);
		codesByName.put(IssuerTimeOut.getCodeName().get(), IssuerTimeOut);
		codesByName.put(IssuerSignedOff.getCodeName().get(), IssuerSignedOff);
		codesByName.put(IssuerNotFound.getCodeName().get(), IssuerNotFound);
		codesByName.put(IssuerInoperative.getCodeName().get(), IssuerInoperative);
		codesByName.put(InvalidTransactionDateTime.getCodeName().get(), InvalidTransactionDateTime);
		codesByName.put(InvalidTransaction.getCodeName().get(), InvalidTransaction);
		codesByName.put(InvalidTokenIdentification.getCodeName().get(), InvalidTokenIdentification);
		codesByName.put(InvalidToken.getCodeName().get(), InvalidToken);
		codesByName.put(InvalidSecurityCode.getCodeName().get(), InvalidSecurityCode);
		codesByName.put(InvalidPIN.getCodeName().get(), InvalidPIN);
		codesByName.put(InvalidOriginalAmount.getCodeName().get(), InvalidOriginalAmount);
		codesByName.put(NotPermittedToCardholder.getCodeName().get(), NotPermittedToCardholder);
		codesByName.put(OffLineProcess.getCodeName().get(), OffLineProcess);
		codesByName.put(OffLineProcessAfterReferral.getCodeName().get(), OffLineProcessAfterReferral);
		codesByName.put(OriginalDoesNotMatch.getCodeName().get(), OriginalDoesNotMatch);
		codesByName.put(OtherError.getCodeName().get(), OtherError);
		codesByName.put(OutOfBalance.getCodeName().get(), OutOfBalance);
		codesByName.put(OutOfSequence.getCodeName().get(), OutOfSequence);
		codesByName.put(PaymentAmountLimit.getCodeName().get(), PaymentAmountLimit);
		codesByName.put(PaymentNumberLimit.getCodeName().get(), PaymentNumberLimit);
		codesByName.put(PINChangeRequired.getCodeName().get(), PINChangeRequired);
		codesByName.put(PINDataRequired.getCodeName().get(), PINDataRequired);
		codesByName.put(PINEncryptionError.getCodeName().get(), PINEncryptionError);
		codesByName.put(PINSecurityError.getCodeName().get(), PINSecurityError);
		codesByName.put(PINTriesExceeded.getCodeName().get(), PINTriesExceeded);
		codesByName.put(QueueMaximumExceeded.getCodeName().get(), QueueMaximumExceeded);
		codesByName.put(RecurringDataError.getCodeName().get(), RecurringDataError);
		codesByName.put(RestrictedCard.getCodeName().get(), RestrictedCard);
		codesByName.put(SecurityViolation.getCodeName().get(), SecurityViolation);
		codesByName.put(SoftwareOrHardwareError.getCodeName().get(), SoftwareOrHardwareError);
		codesByName.put(SpecialConditions.getCodeName().get(), SpecialConditions);
		codesByName.put(WrongCard.getCodeName().get(), WrongCard);
		codesByName.put(WithdrawalNumberLimit.getCodeName().get(), WithdrawalNumberLimit);
		codesByName.put(WithdrawalAmountLimit.getCodeName().get(), WithdrawalAmountLimit);
		codesByName.put(VendorNotFound.getCodeName().get(), VendorNotFound);
		codesByName.put(VendorFormatError.getCodeName().get(), VendorFormatError);
		codesByName.put(UnsupportedService.getCodeName().get(), UnsupportedService);
		codesByName.put(UneffectiveCard.getCodeName().get(), UneffectiveCard);
		codesByName.put(UnavailablecommunicationKey.getCodeName().get(), UnavailablecommunicationKey);
		codesByName.put(UnacceptableCurrency.getCodeName().get(), UnacceptableCurrency);
		codesByName.put(UnableToProcessOffLine.getCodeName().get(), UnableToProcessOffLine);
		codesByName.put(UnableToGoOnLine.getCodeName().get(), UnableToGoOnLine);
		codesByName.put(UnableToFindOriginal.getCodeName().get(), UnableToFindOriginal);
		codesByName.put(TransactionDuplicate.getCodeName().get(), TransactionDuplicate);
		codesByName.put(TransactionDidNotComplete.getCodeName().get(), TransactionDidNotComplete);
		codesByName.put(TotalsNotAvailable.getCodeName().get(), TotalsNotAvailable);
		codesByName.put(ToAccountError.getCodeName().get(), ToAccountError);
		codesByName.put(SystemMalfunction.getCodeName().get(), SystemMalfunction);
		codesByName.put(SystemInoperative.getCodeName().get(), SystemInoperative);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(SuspectedCounterfeitCard.getCodeName().get(), SuspectedCounterfeitCard);
		codesByName.put(SurchargeNotPermitted.getCodeName().get(), SurchargeNotPermitted);
		codesByName.put(StolenCard.getCodeName().get(), StolenCard);
		codesByName.put(AcknowledgementOnly.getCodeName().get(), AcknowledgementOnly);
	}

	public static ResultDetail1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResultDetail1Code[] values() {
		ResultDetail1Code[] values = new ResultDetail1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResultDetail1Code> {
		@Override
		public ResultDetail1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResultDetail1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}