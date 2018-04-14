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
import com.tools20022.repository.codeset.ResultDetailCode.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetailCode#WrongCard
 * ResultDetailCode.WrongCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#WithdrawalNumberLimit
 * ResultDetailCode.WithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#WithdrawalAmountLimit
 * ResultDetailCode.WithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#VendorNotFound
 * ResultDetailCode.VendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#VendorFormatError
 * ResultDetailCode.VendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#AccountNotFound
 * ResultDetailCode.AccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#AcquirerNotSupported
 * ResultDetailCode.AcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#AMLValidation
 * ResultDetailCode.AMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnsupportedService
 * ResultDetailCode.UnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UneffectiveCard
 * ResultDetailCode.UneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnavailablecommunicationKey
 * ResultDetailCode.UnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnacceptableCurrency
 * ResultDetailCode.UnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnableToProcessOffLine
 * ResultDetailCode.UnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnableToGoOnLine
 * ResultDetailCode.UnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnableToFindOriginal
 * ResultDetailCode.UnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#TransactionDuplicate
 * ResultDetailCode.TransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#TransactionDidNotComplete
 * ResultDetailCode.TransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#TotalsNotAvailable
 * ResultDetailCode.TotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#ToAccountError
 * ResultDetailCode.ToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SystemMalfunction
 * ResultDetailCode.SystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SystemInoperative
 * ResultDetailCode.SystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SuspectedFraud
 * ResultDetailCode.SuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SuspectedCounterfeitCard
 * ResultDetailCode.SuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SurchargeNotPermitted
 * ResultDetailCode.SurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SpecialConditions
 * ResultDetailCode.SpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#StolenCard
 * ResultDetailCode.StolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SoftwareOrHardwareError
 * ResultDetailCode.SoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#SecurityViolation
 * ResultDetailCode.SecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#RestrictedCard
 * ResultDetailCode.RestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#RecurringDataError
 * ResultDetailCode.RecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#QueueMaximumExceeded
 * ResultDetailCode.QueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PINTriesExceeded
 * ResultDetailCode.PINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PINSecurityError
 * ResultDetailCode.PINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PINEncryptionError
 * ResultDetailCode.PINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PINDataRequired
 * ResultDetailCode.PINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PINChangeRequired
 * ResultDetailCode.PINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PaymentNumberLimit
 * ResultDetailCode.PaymentNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#PaymentAmountLimit
 * ResultDetailCode.PaymentAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#OutOfSequence
 * ResultDetailCode.OutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#OutOfBalance
 * ResultDetailCode.OutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#OtherError
 * ResultDetailCode.OtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#OriginalDoesNotMatch
 * ResultDetailCode.OriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#OffLineProcessAfterReferral
 * ResultDetailCode.OffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#OffLineProcess
 * ResultDetailCode.OffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#NotPermittedToCardholder
 * ResultDetailCode.NotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#NotPermittedToAcceptor
 * ResultDetailCode.NotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#NotAbleToValidatePIN
 * ResultDetailCode.NotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#NoCardRecord
 * ResultDetailCode.NoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#NewPINInvalid
 * ResultDetailCode.NewPINInvalid}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetailCode#LostCard
 * ResultDetailCode.LostCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#NoLiabilityAccepted
 * ResultDetailCode.NoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#MACKeyError
 * ResultDetailCode.MACKeyError}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetailCode#MACError
 * ResultDetailCode.MACError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#LiabilityAccepted
 * ResultDetailCode.LiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#IssuerUnavailable
 * ResultDetailCode.IssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#IssuerTimeOut
 * ResultDetailCode.IssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#IssuerSignedOff
 * ResultDetailCode.IssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#IssuerNotFound
 * ResultDetailCode.IssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#IssuerInoperative
 * ResultDetailCode.IssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidTransactionDateTime
 * ResultDetailCode.InvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidTransaction
 * ResultDetailCode.InvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidTokenIdentification
 * ResultDetailCode.InvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidToken
 * ResultDetailCode.InvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidSecurityCode
 * ResultDetailCode.InvalidSecurityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidPIN
 * ResultDetailCode.InvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidOriginalAmount
 * ResultDetailCode.InvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidCertificate
 * ResultDetailCode.InvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidCardNumber
 * ResultDetailCode.InvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidCardholderIdentification
 * ResultDetailCode.InvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidAmount
 * ResultDetailCode.InvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidAcceptor
 * ResultDetailCode.InvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InsufficientFunds
 * ResultDetailCode.InsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InProgress
 * ResultDetailCode.InProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#FromAccountError
 * ResultDetailCode.FromAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#FormatError
 * ResultDetailCode.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#ExpiredCard
 * ResultDetailCode.ExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#ExceededTransactionLifeCycle
 * ResultDetailCode.ExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#DisputedFees
 * ResultDetailCode.DisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#DatabaseError
 * ResultDetailCode.DatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#CutoverInProcess
 * ResultDetailCode.CutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#ClosedAccount
 * ResultDetailCode.ClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#CasbackNotAllowed
 * ResultDetailCode.CasbackNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#CashbackAmountExceeded
 * ResultDetailCode.CashbackAmountExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#CardVerificationFailed
 * ResultDetailCode.CardVerificationFailed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetailCode#CardError
 * ResultDetailCode.CardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#BankNotFound
 * ResultDetailCode.BankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#AmountNotFound
 * ResultDetailCode.AmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#AcknowledgementOnly
 * ResultDetailCode.AcknowledgementOnly}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#AuthenticationFailed
 * ResultDetailCode.AuthenticationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#DepositAmountLimit
 * ResultDetailCode.DepositAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#DepositNumberLimit
 * ResultDetailCode.DepositNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#FallbackDeclined
 * ResultDetailCode.FallbackDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidAddress
 * ResultDetailCode.InvalidAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidBranch
 * ResultDetailCode.InvalidBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidSignature
 * ResultDetailCode.InvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#KeyStorageSaturation
 * ResultDetailCode.KeyStorageSaturation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#MissingICCData
 * ResultDetailCode.MissingICCData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#ServiceNotEnabled
 * ResultDetailCode.ServiceNotEnabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#TerminalNotConfigured
 * ResultDetailCode.TerminalNotConfigured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#UnknownCertificate
 * ResultDetailCode.UnknownCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidMediaType
 * ResultDetailCode.InvalidMediaType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode#InvalidService
 * ResultDetailCode.InvalidService}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail1Code
 * ResultDetail1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail2Code
 * ResultDetail2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail3Code
 * ResultDetail3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail4Code
 * ResultDetail4Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResultDetailCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the result."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResultDetailCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Other card used for the original transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other card used for the original transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode WrongCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			definition = "Other card used for the original transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDW";
		}
	};
	/**
	 * Number of withdrawal transactions exceeds card limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMBW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of withdrawal transactions exceeds card limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode WithdrawalNumberLimit = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			definition = "Number of withdrawal transactions exceeds card limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "NMBW";
		}
	};
	/**
	 * Amount of withdrawal transactions exceeds card limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTW"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of withdrawal transactions exceeds card limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode WithdrawalAmountLimit = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			definition = "Amount of withdrawal transactions exceeds card limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMTW";
		}
	};
	/**
	 * Vendor not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VNDF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vendor not found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode VendorNotFound = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			definition = "Vendor not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "VNDF";
		}
	};
	/**
	 * Vendor format has an error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VNDR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorFormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Vendor format has an error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode VendorFormatError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			definition = "Vendor format has an error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "VNDR";
		}
	};
	/**
	 * Account of the cardholder or the customer is not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account of the cardholder or the customer is not found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode AccountNotFound = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			definition = "Account of the cardholder or the customer is not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACTF";
		}
	};
	/**
	 * Acquirer is not supported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACQS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerNotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer is not supported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode AcquirerNotSupported = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			definition = "Acquirer is not supported.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACQS";
		}
	};
	/**
	 * Error on AML (Anti Money Laundering) validation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMLV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Error on AML (Anti Money Laundering) validation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode AMLValidation = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			definition = "Error on AML (Anti Money Laundering) validation.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMLV";
		}
	};
	/**
	 * Requested service not supported.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SVSU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsupportedService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested service not supported."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnsupportedService = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			definition = "Requested service not supported.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SVSU";
		}
	};
	/**
	 * Card is not active yet.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UneffectiveCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card is not active yet."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UneffectiveCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			definition = "Card is not active yet.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDU";
		}
	};
	/**
	 * Communication keys are not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMKY"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailablecommunicationKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Communication keys are not available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnavailablecommunicationKey = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			definition = "Communication keys are not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CMKY";
		}
	};
	/**
	 * Currency is unacceptable for the Issuer or the processor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency is unacceptable for the Issuer or the processor."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnacceptableCurrency = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			definition = "Currency is unacceptable for the Issuer or the processor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "UNBC";
		}
	};
	/**
	 * Transaction cannot be processed offline.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcessOffLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction cannot be processed offline."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnableToProcessOffLine = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			definition = "Transaction cannot be processed offline.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "UNBP";
		}
	};
	/**
	 * Transaction cannot be processed online by the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UNBO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToGoOnLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction cannot be processed online by the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnableToGoOnLine = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			definition = "Transaction cannot be processed online by the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "UNBO";
		}
	};
	/**
	 * Transaction could not be processed as original is not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ORGF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToFindOriginal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction could not be processed as original is not found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnableToFindOriginal = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			definition = "Transaction could not be processed as original is not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ORGF";
		}
	};
	/**
	 * Transaction identification already used for another transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction identification already used for another transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode TransactionDuplicate = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			definition = "Transaction identification already used for another transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TXND";
		}
	};
	/**
	 * Transaction did not complete at the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXNU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDidNotComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction did not complete at the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode TransactionDidNotComplete = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			definition = "Transaction did not complete at the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TXNU";
		}
	};
	/**
	 * Totals are not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TTLV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Totals are not available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode TotalsNotAvailable = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			definition = "Totals are not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TTLV";
		}
	};
	/**
	 * To account status error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAccountError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "To account status error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode ToAccountError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			definition = "To account status error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACTT";
		}
	};
	/**
	 * System Malfunction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYSM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMalfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "System Malfunction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SystemMalfunction = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			definition = "System Malfunction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SYSM";
		}
	};
	/**
	 * Processing temporary not available.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SYSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInoperative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing temporary not available."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SystemInoperative = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			definition = "Processing temporary not available.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SYSP";
		}
	};
	/**
	 * Fraudulent transaction is suspected by the issuer or the processor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRDS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fraudulent transaction is suspected by the issuer or the processor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SuspectedFraud = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			definition = "Fraudulent transaction is suspected by the issuer or the processor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "FRDS";
		}
	};
	/**
	 * Counterfeit card suspected by the issuer or the processor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CNTC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Counterfeit card suspected by the issuer or the processor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SuspectedCounterfeitCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			definition = "Counterfeit card suspected by the issuer or the processor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CNTC";
		}
	};
	/**
	 * Surcharging is not permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRCH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurchargeNotPermitted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Surcharging is not permitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SurchargeNotPermitted = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			definition = "Surcharging is not permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SRCH";
		}
	};
	/**
	 * Special card conditions not respected.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPCC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Special card conditions not respected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SpecialConditions = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			definition = "Special card conditions not respected.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SPCC";
		}
	};
	/**
	 * Card has been declared stolen.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StolenCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card has been declared stolen."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode StolenCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			definition = "Card has been declared stolen.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDS";
		}
	};
	/**
	 * Security software or hardware error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SFWE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareOrHardwareError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security software or hardware error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SoftwareOrHardwareError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			definition = "Security software or hardware error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SFWE";
		}
	};
	/**
	 * Security violation, for instance invalid ARPC (Authorisation ResPonse
	 * Cryptogram).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SECV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityViolation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security violation, for instance invalid ARPC (Authorisation ResPonse Cryptogram)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode SecurityViolation = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			definition = "Security violation, for instance invalid ARPC (Authorisation ResPonse Cryptogram).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SECV";
		}
	};
	/**
	 * Requested service not allowed by the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDT"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested service not allowed by the card."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode RestrictedCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			definition = "Requested service not allowed by the card.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDT";
		}
	};
	/**
	 * Recurring Error on Data.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RECD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringDataError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recurring Error on Data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode RecurringDataError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			definition = "Recurring Error on Data.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "RECD";
		}
	};
	/**
	 * Store and forward queue maximum exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "QMAX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueMaximumExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Store and forward queue maximum exceeded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode QueueMaximumExceeded = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			definition = "Store and forward queue maximum exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "QMAX";
		}
	};
	/**
	 * Last attempt of the PIN verification fails.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINTriesExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Last attempt of the PIN verification fails."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PINTriesExceeded = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			definition = "Last attempt of the PIN verification fails.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINX";
		}
	};
	/**
	 * PIN length or PIN key is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINSecurityError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PIN length or PIN key is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PINSecurityError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			definition = "PIN length or PIN key is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINS";
		}
	};
	/**
	 * Decrypted PIN block is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryptionError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Decrypted PIN block is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PINEncryptionError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			definition = "Decrypted PIN block is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINE";
		}
	};
	/**
	 * Additional information are required to verify the PIN.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PIND"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDataRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information are required to verify the PIN."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PINDataRequired = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			definition = "Additional information are required to verify the PIN.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PIND";
		}
	};
	/**
	 * Cardholder must change the PIN to be able to perform the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChangeRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder must change the PIN to be able to perform the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PINChangeRequired = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			definition = "Cardholder must change the PIN to be able to perform the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINC";
		}
	};
	/**
	 * Number of payment transactions exceeds card limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMBL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of payment transactions exceeds card limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PaymentNumberLimit = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentNumberLimit";
			definition = "Number of payment transactions exceeds card limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "NMBL";
		}
	};
	/**
	 * Amount of payment transactions exceeds card limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of payment transactions exceeds card limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode PaymentAmountLimit = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentAmountLimit";
			definition = "Amount of payment transactions exceeds card limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMTL";
		}
	};
	/**
	 * Message is out of sequence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SEQO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message is out of sequence."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode OutOfSequence = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			definition = "Message is out of sequence.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SEQO";
		}
	};
	/**
	 * Out of balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BALO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Out of balance."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode OutOfBalance = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			definition = "Out of balance.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "BALO";
		}
	};
	/**
	 * Other error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode OtherError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			definition = "Other error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Original is found, but transaction does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXNM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDoesNotMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original is found, but transaction does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode OriginalDoesNotMatch = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			definition = "Original is found, but transaction does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TXNM";
		}
	};
	/**
	 * Transaction has been processed offline after referral.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONLP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcessAfterReferral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been processed offline after referral."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode OffLineProcessAfterReferral = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			definition = "Transaction has been processed offline after referral.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ONLP";
		}
	};
	/**
	 * Transaction has been processed offline by the terminal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction has been processed offline by the terminal."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode OffLineProcess = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			definition = "Transaction has been processed offline by the terminal.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "OFFL";
		}
	};
	/**
	 * Transaction not permitted to the cardholder or the customer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPRC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToCardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction not permitted to the cardholder or the customer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode NotPermittedToCardholder = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			definition = "Transaction not permitted to the cardholder or the customer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "NPRC";
		}
	};
	/**
	 * Process not permitted to the acceptor (for example fall back).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NPRA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Process not permitted to the acceptor (for example fall back)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode NotPermittedToAcceptor = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			definition = "Process not permitted to the acceptor (for example fall back).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "NPRA";
		}
	};
	/**
	 * PIN could not be validated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAbleToValidatePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PIN could not be validated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode NotAbleToValidatePIN = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			definition = "PIN could not be validated.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINA";
		}
	};
	/**
	 * No card file record.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCardRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "No card file record."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode NoCardRecord = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			definition = "No card file record.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDA";
		}
	};
	/**
	 * New PIN is invalid (PIN change).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPINInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New PIN is invalid (PIN change)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode NewPINInvalid = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			definition = "New PIN is invalid (PIN change).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINN";
		}
	};
	/**
	 * Card has been declared lost.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card has been declared lost."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode LostCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			definition = "Card has been declared lost.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDL";
		}
	};
	/**
	 * Transaction is processed, but liability is not accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBLU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLiabilityAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is processed, but liability is not accepted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode NoLiabilityAccepted = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			definition = "Transaction is processed, but liability is not accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "LBLU";
		}
	};
	/**
	 * MAC key error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACKeyError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MAC key error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode MACKeyError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			definition = "MAC key error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "MACK";
		}
	};
	/**
	 * MAC error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MACR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "MAC error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode MACError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			definition = "MAC error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "MACR";
		}
	};
	/**
	 * Transaction is processed and liability is accepted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LBLA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiabilityAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is processed and liability is accepted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode LiabilityAccepted = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			definition = "Transaction is processed and liability is accepted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "LBLA";
		}
	};
	/**
	 * Transaction could not be processed as Issuer is unavailable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction could not be processed as Issuer is unavailable."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode IssuerUnavailable = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			definition = "Transaction could not be processed as Issuer is unavailable.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ISSU";
		}
	};
	/**
	 * Transaction could not be processed as Issuer times out.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISST"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction could not be processed as Issuer times out."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode IssuerTimeOut = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			definition = "Transaction could not be processed as Issuer times out.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ISST";
		}
	};
	/**
	 * Transaction could not be processed as Issuer is signed off.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction could not be processed as Issuer is signed off."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode IssuerSignedOff = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			definition = "Transaction could not be processed as Issuer is signed off.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ISSO";
		}
	};
	/**
	 * Issuer is not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is not found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode IssuerNotFound = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			definition = "Issuer is not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ISSF";
		}
	};
	/**
	 * Issuer is inoperative.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ISSP"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInoperative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer is inoperative."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode IssuerInoperative = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			definition = "Issuer is inoperative.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ISSP";
		}
	};
	/**
	 * Date time of the transaction is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DATI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date time of the transaction is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidTransactionDateTime = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			definition = "Date time of the transaction is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "DATI";
		}
	};
	/**
	 * Transaction is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXNV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidTransaction = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			definition = "Transaction is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TXNV";
		}
	};
	/**
	 * Identification of the token provider or the token requestor is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TKID"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTokenIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the token provider or the token requestor is invalid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidTokenIdentification = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			definition = "Identification of the token provider or the token requestor is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TKID";
		}
	};
	/**
	 * Token cannot be used to surrogate a PAN (Primary Account Number).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TKKO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Token cannot be used to surrogate a PAN (Primary Account Number)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidToken = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			definition = "Token cannot be used to surrogate a PAN (Primary Account Number).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TKKO";
		}
	};
	/**
	 * Security code validation fails.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSCV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSecurityCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security code validation fails."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidSecurityCode = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurityCode";
			definition = "Security code validation fails.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CSCV";
		}
	};
	/**
	 * PIN is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "PIN is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidPIN = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			definition = "PIN is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "PINV";
		}
	};
	/**
	 * Original amount is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original amount is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidOriginalAmount = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			definition = "Original amount is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMTO";
		}
	};
	/**
	 * Digital certificate cannot be authenticated, is expired or revoked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTFV"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital certificate cannot be authenticated, is expired or revoked."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidCertificate = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			definition = "Digital certificate cannot be authenticated, is expired or revoked.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CTFV";
		}
	};
	/**
	 * Identification of the card is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the card is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidCardNumber = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			definition = "Identification of the card is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDI";
		}
	};
	/**
	 * Identification of the cardholder or the customer does not match.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHDI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardholderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the cardholder or the customer does not match."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidCardholderIdentification = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			definition = "Identification of the cardholder or the customer does not match.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CHDI";
		}
	};
	/**
	 * Requested amount is outside the card limits, or the currency is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested amount is outside the card limits, or the currency is invalid."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidAmount = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			definition = "Requested amount is outside the card limits, or the currency is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMTI";
		}
	};
	/**
	 * Issuer denies the acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACPI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer denies the acceptor."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidAcceptor = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			definition = "Issuer denies the acceptor.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACPI";
		}
	};
	/**
	 * Account balance is not sufficient.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNDI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account balance is not sufficient."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InsufficientFunds = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			definition = "Account balance is not sufficient.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "FNDI";
		}
	};
	/**
	 * Original request is in progress.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXNG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Original request is in progress."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InProgress = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			definition = "Original request is in progress.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TXNG";
		}
	};
	/**
	 * From account status error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACEF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FromAccountError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "From account status error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode FromAccountError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAccountError";
			definition = "From account status error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACEF";
		}
	};
	/**
	 * Invalid format of the message or its content.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FMTR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid format of the message or its content."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode FormatError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			definition = "Invalid format of the message or its content.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "FMTR";
		}
	};
	/**
	 * Card has expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDX"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiredCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Card has expired."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode ExpiredCard = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			definition = "Card has expired.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDX";
		}
	};
	/**
	 * Validity period of the transaction is exceeded.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TXNL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceededTransactionLifeCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Validity period of the transaction is exceeded."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode ExceededTransactionLifeCycle = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			definition = "Validity period of the transaction is exceeded.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TXNL";
		}
	};
	/**
	 * Transaction fees are disputed by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FEES"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Transaction fees are disputed by the issuer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode DisputedFees = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			definition = "Transaction fees are disputed by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "FEES";
		}
	};
	/**
	 * Database access error.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DBER"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatabaseError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Database access error."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode DatabaseError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			definition = "Database access error.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "DBER";
		}
	};
	/**
	 * Cutover is in progress, transaction could not be processed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CTVG"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoverInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cutover is in progress, transaction could not be processed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode CutoverInProcess = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			definition = "Cutover is in progress, transaction could not be processed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CTVG";
		}
	};
	/**
	 * Account is no more usable for the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account is no more usable for the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode ClosedAccount = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			definition = "Account is no more usable for the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACTC";
		}
	};
	/**
	 * Cashback is not permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CasbackNotAllowed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cashback is not permitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode CasbackNotAllowed = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CasbackNotAllowed";
			definition = "Cashback is not permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CSHI";
		}
	};
	/**
	 * Cashback amount is higher than permitted.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSHE"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashbackAmountExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cashback amount is higher than permitted."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode CashbackAmountExceeded = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashbackAmountExceeded";
			definition = "Cashback amount is higher than permitted.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CSHE";
		}
	};
	/**
	 * Identification of the card is invalid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDF"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerificationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the card is invalid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode CardVerificationFailed = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			definition = "Identification of the card is invalid.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDF";
		}
	};
	/**
	 * Card error, for instance invalid ARQC (Authorisation ReQuest Cryptogram).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDR"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Card error, for instance invalid ARQC (Authorisation ReQuest Cryptogram)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode CardError = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			definition = "Card error, for instance invalid ARQC (Authorisation ReQuest Cryptogram).";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRDR";
		}
	};
	/**
	 * Bank not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BANK"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Bank not found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode BankNotFound = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			definition = "Bank not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "BANK";
		}
	};
	/**
	 * Amount not found.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTA"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount not found."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode AmountNotFound = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			definition = "Amount not found.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMTA";
		}
	};
	/**
	 * Message is acknowledged only without processing the service, for instance
	 * the reconciliation is not performed, acknowledged only.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACKO"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message is acknowledged only without processing the service, for instance the reconciliation is not performed, acknowledged only."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode AcknowledgementOnly = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementOnly";
			definition = "Message is acknowledged only without processing the service, for instance the reconciliation is not performed, acknowledged only.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ACKO";
		}
	};
	/**
	 * Cardholder or customer could not be authenticated, for instance due to an
	 * incorrect login identification or an incorrect password.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTH"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder or customer could not be authenticated, for instance due to an incorrect login identification or an incorrect password."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode AuthenticationFailed = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationFailed";
			definition = "Cardholder or customer could not be authenticated, for instance due to an incorrect login identification or an incorrect password.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AUTH";
		}
	};
	/**
	 * Amount of deposit transactions exceeds the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AMTD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of deposit transactions exceeds the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode DepositAmountLimit = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmountLimit";
			definition = "Amount of deposit transactions exceeds the limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "AMTD";
		}
	};
	/**
	 * Number of deposit transactions or items exceeds the limit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NMBD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of deposit transactions or items exceeds the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode DepositNumberLimit = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositNumberLimit";
			definition = "Number of deposit transactions or items exceeds the limit.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "NMBD";
		}
	};
	/**
	 * Issuer declined the fall-back transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FDCL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer declined the fall-back transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode FallbackDeclined = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackDeclined";
			definition = "Issuer declined the fall-back transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "FDCL";
		}
	};
	/**
	 * Part of the specified address is incorrect.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADDI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Part of the specified address is incorrect."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidAddress = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAddress";
			definition = "Part of the specified address is incorrect.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ADDI";
		}
	};
	/**
	 * Invalid branch or bank information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRHI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Invalid branch or bank information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidBranch = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBranch";
			definition = "Invalid branch or bank information.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "BRHI";
		}
	};
	/**
	 * Signed message has an invalid signature.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SGNI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Signed message has an invalid signature."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidSignature = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			definition = "Signed message has an invalid signature.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SGNI";
		}
	};
	/**
	 * Storage space not available for the key.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYS"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyStorageSaturation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Storage space not available for the key."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode KeyStorageSaturation = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyStorageSaturation";
			definition = "Storage space not available for the key.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "KEYS";
		}
	};
	/**
	 * ICC data elements required for processing the ICC transaction were not
	 * present in the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ICCM"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingICCData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "ICC data elements required for processing the ICC transaction were not present in the message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode MissingICCData = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingICCData";
			definition = "ICC data elements required for processing the ICC transaction were not present in the message.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "ICCM";
		}
	};
	/**
	 * Cardholder or customer has not enabled the service with the service
	 * provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRVU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceNotEnabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cardholder or customer has not enabled the service with the service provider."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode ServiceNotEnabled = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceNotEnabled";
			definition = "Cardholder or customer has not enabled the service with the service provider.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SRVU";
		}
	};
	/**
	 * Server received a terminal identification that it does not have any
	 * knowledge of.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRMI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalNotConfigured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Server received a terminal identification that it does not have any knowledge of."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode TerminalNotConfigured = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalNotConfigured";
			definition = "Server received a terminal identification that it does not have any knowledge of.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "TRMI";
		}
	};
	/**
	 * The certificate is unknown.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRTU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The certificate is unknown."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode UnknownCertificate = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownCertificate";
			definition = "The certificate is unknown.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "CRTU";
		}
	};
	/**
	 * The requested media are not allowed for the service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEDI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMediaType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The requested media are not allowed for the service."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidMediaType = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMediaType";
			definition = "The requested media are not allowed for the service.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "MEDI";
		}
	};
	/**
	 * The requested service is not allowed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
	 * ResultDetailCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SRVI"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The requested service is not allowed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ResultDetailCode InvalidService = new ResultDetailCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidService";
			definition = "The requested service is not allowed.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetailCode.mmObject();
			codeName = "SRVI";
		}
	};
	final static private LinkedHashMap<String, ResultDetailCode> codesByName = new LinkedHashMap<>();

	protected ResultDetailCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResultDetailCode";
				definition = "Detail of the result.";
				derivation_lazy = () -> Arrays.asList(ResultDetail1Code.mmObject(), ResultDetail2Code.mmObject(), ResultDetail3Code.mmObject(), ResultDetail4Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResultDetailCode.WrongCard, com.tools20022.repository.codeset.ResultDetailCode.WithdrawalNumberLimit,
						com.tools20022.repository.codeset.ResultDetailCode.WithdrawalAmountLimit, com.tools20022.repository.codeset.ResultDetailCode.VendorNotFound, com.tools20022.repository.codeset.ResultDetailCode.VendorFormatError,
						com.tools20022.repository.codeset.ResultDetailCode.AccountNotFound, com.tools20022.repository.codeset.ResultDetailCode.AcquirerNotSupported, com.tools20022.repository.codeset.ResultDetailCode.AMLValidation,
						com.tools20022.repository.codeset.ResultDetailCode.UnsupportedService, com.tools20022.repository.codeset.ResultDetailCode.UneffectiveCard,
						com.tools20022.repository.codeset.ResultDetailCode.UnavailablecommunicationKey, com.tools20022.repository.codeset.ResultDetailCode.UnacceptableCurrency,
						com.tools20022.repository.codeset.ResultDetailCode.UnableToProcessOffLine, com.tools20022.repository.codeset.ResultDetailCode.UnableToGoOnLine,
						com.tools20022.repository.codeset.ResultDetailCode.UnableToFindOriginal, com.tools20022.repository.codeset.ResultDetailCode.TransactionDuplicate,
						com.tools20022.repository.codeset.ResultDetailCode.TransactionDidNotComplete, com.tools20022.repository.codeset.ResultDetailCode.TotalsNotAvailable, com.tools20022.repository.codeset.ResultDetailCode.ToAccountError,
						com.tools20022.repository.codeset.ResultDetailCode.SystemMalfunction, com.tools20022.repository.codeset.ResultDetailCode.SystemInoperative, com.tools20022.repository.codeset.ResultDetailCode.SuspectedFraud,
						com.tools20022.repository.codeset.ResultDetailCode.SuspectedCounterfeitCard, com.tools20022.repository.codeset.ResultDetailCode.SurchargeNotPermitted,
						com.tools20022.repository.codeset.ResultDetailCode.SpecialConditions, com.tools20022.repository.codeset.ResultDetailCode.StolenCard, com.tools20022.repository.codeset.ResultDetailCode.SoftwareOrHardwareError,
						com.tools20022.repository.codeset.ResultDetailCode.SecurityViolation, com.tools20022.repository.codeset.ResultDetailCode.RestrictedCard, com.tools20022.repository.codeset.ResultDetailCode.RecurringDataError,
						com.tools20022.repository.codeset.ResultDetailCode.QueueMaximumExceeded, com.tools20022.repository.codeset.ResultDetailCode.PINTriesExceeded, com.tools20022.repository.codeset.ResultDetailCode.PINSecurityError,
						com.tools20022.repository.codeset.ResultDetailCode.PINEncryptionError, com.tools20022.repository.codeset.ResultDetailCode.PINDataRequired, com.tools20022.repository.codeset.ResultDetailCode.PINChangeRequired,
						com.tools20022.repository.codeset.ResultDetailCode.PaymentNumberLimit, com.tools20022.repository.codeset.ResultDetailCode.PaymentAmountLimit, com.tools20022.repository.codeset.ResultDetailCode.OutOfSequence,
						com.tools20022.repository.codeset.ResultDetailCode.OutOfBalance, com.tools20022.repository.codeset.ResultDetailCode.OtherError, com.tools20022.repository.codeset.ResultDetailCode.OriginalDoesNotMatch,
						com.tools20022.repository.codeset.ResultDetailCode.OffLineProcessAfterReferral, com.tools20022.repository.codeset.ResultDetailCode.OffLineProcess,
						com.tools20022.repository.codeset.ResultDetailCode.NotPermittedToCardholder, com.tools20022.repository.codeset.ResultDetailCode.NotPermittedToAcceptor,
						com.tools20022.repository.codeset.ResultDetailCode.NotAbleToValidatePIN, com.tools20022.repository.codeset.ResultDetailCode.NoCardRecord, com.tools20022.repository.codeset.ResultDetailCode.NewPINInvalid,
						com.tools20022.repository.codeset.ResultDetailCode.LostCard, com.tools20022.repository.codeset.ResultDetailCode.NoLiabilityAccepted, com.tools20022.repository.codeset.ResultDetailCode.MACKeyError,
						com.tools20022.repository.codeset.ResultDetailCode.MACError, com.tools20022.repository.codeset.ResultDetailCode.LiabilityAccepted, com.tools20022.repository.codeset.ResultDetailCode.IssuerUnavailable,
						com.tools20022.repository.codeset.ResultDetailCode.IssuerTimeOut, com.tools20022.repository.codeset.ResultDetailCode.IssuerSignedOff, com.tools20022.repository.codeset.ResultDetailCode.IssuerNotFound,
						com.tools20022.repository.codeset.ResultDetailCode.IssuerInoperative, com.tools20022.repository.codeset.ResultDetailCode.InvalidTransactionDateTime,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidTransaction, com.tools20022.repository.codeset.ResultDetailCode.InvalidTokenIdentification, com.tools20022.repository.codeset.ResultDetailCode.InvalidToken,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidSecurityCode, com.tools20022.repository.codeset.ResultDetailCode.InvalidPIN, com.tools20022.repository.codeset.ResultDetailCode.InvalidOriginalAmount,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidCertificate, com.tools20022.repository.codeset.ResultDetailCode.InvalidCardNumber,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidCardholderIdentification, com.tools20022.repository.codeset.ResultDetailCode.InvalidAmount,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidAcceptor, com.tools20022.repository.codeset.ResultDetailCode.InsufficientFunds, com.tools20022.repository.codeset.ResultDetailCode.InProgress,
						com.tools20022.repository.codeset.ResultDetailCode.FromAccountError, com.tools20022.repository.codeset.ResultDetailCode.FormatError, com.tools20022.repository.codeset.ResultDetailCode.ExpiredCard,
						com.tools20022.repository.codeset.ResultDetailCode.ExceededTransactionLifeCycle, com.tools20022.repository.codeset.ResultDetailCode.DisputedFees, com.tools20022.repository.codeset.ResultDetailCode.DatabaseError,
						com.tools20022.repository.codeset.ResultDetailCode.CutoverInProcess, com.tools20022.repository.codeset.ResultDetailCode.ClosedAccount, com.tools20022.repository.codeset.ResultDetailCode.CasbackNotAllowed,
						com.tools20022.repository.codeset.ResultDetailCode.CashbackAmountExceeded, com.tools20022.repository.codeset.ResultDetailCode.CardVerificationFailed, com.tools20022.repository.codeset.ResultDetailCode.CardError,
						com.tools20022.repository.codeset.ResultDetailCode.BankNotFound, com.tools20022.repository.codeset.ResultDetailCode.AmountNotFound, com.tools20022.repository.codeset.ResultDetailCode.AcknowledgementOnly,
						com.tools20022.repository.codeset.ResultDetailCode.AuthenticationFailed, com.tools20022.repository.codeset.ResultDetailCode.DepositAmountLimit, com.tools20022.repository.codeset.ResultDetailCode.DepositNumberLimit,
						com.tools20022.repository.codeset.ResultDetailCode.FallbackDeclined, com.tools20022.repository.codeset.ResultDetailCode.InvalidAddress, com.tools20022.repository.codeset.ResultDetailCode.InvalidBranch,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidSignature, com.tools20022.repository.codeset.ResultDetailCode.KeyStorageSaturation, com.tools20022.repository.codeset.ResultDetailCode.MissingICCData,
						com.tools20022.repository.codeset.ResultDetailCode.ServiceNotEnabled, com.tools20022.repository.codeset.ResultDetailCode.TerminalNotConfigured, com.tools20022.repository.codeset.ResultDetailCode.UnknownCertificate,
						com.tools20022.repository.codeset.ResultDetailCode.InvalidMediaType, com.tools20022.repository.codeset.ResultDetailCode.InvalidService);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WrongCard.getCodeName().get(), WrongCard);
		codesByName.put(WithdrawalNumberLimit.getCodeName().get(), WithdrawalNumberLimit);
		codesByName.put(WithdrawalAmountLimit.getCodeName().get(), WithdrawalAmountLimit);
		codesByName.put(VendorNotFound.getCodeName().get(), VendorNotFound);
		codesByName.put(VendorFormatError.getCodeName().get(), VendorFormatError);
		codesByName.put(AccountNotFound.getCodeName().get(), AccountNotFound);
		codesByName.put(AcquirerNotSupported.getCodeName().get(), AcquirerNotSupported);
		codesByName.put(AMLValidation.getCodeName().get(), AMLValidation);
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
		codesByName.put(SpecialConditions.getCodeName().get(), SpecialConditions);
		codesByName.put(StolenCard.getCodeName().get(), StolenCard);
		codesByName.put(SoftwareOrHardwareError.getCodeName().get(), SoftwareOrHardwareError);
		codesByName.put(SecurityViolation.getCodeName().get(), SecurityViolation);
		codesByName.put(RestrictedCard.getCodeName().get(), RestrictedCard);
		codesByName.put(RecurringDataError.getCodeName().get(), RecurringDataError);
		codesByName.put(QueueMaximumExceeded.getCodeName().get(), QueueMaximumExceeded);
		codesByName.put(PINTriesExceeded.getCodeName().get(), PINTriesExceeded);
		codesByName.put(PINSecurityError.getCodeName().get(), PINSecurityError);
		codesByName.put(PINEncryptionError.getCodeName().get(), PINEncryptionError);
		codesByName.put(PINDataRequired.getCodeName().get(), PINDataRequired);
		codesByName.put(PINChangeRequired.getCodeName().get(), PINChangeRequired);
		codesByName.put(PaymentNumberLimit.getCodeName().get(), PaymentNumberLimit);
		codesByName.put(PaymentAmountLimit.getCodeName().get(), PaymentAmountLimit);
		codesByName.put(OutOfSequence.getCodeName().get(), OutOfSequence);
		codesByName.put(OutOfBalance.getCodeName().get(), OutOfBalance);
		codesByName.put(OtherError.getCodeName().get(), OtherError);
		codesByName.put(OriginalDoesNotMatch.getCodeName().get(), OriginalDoesNotMatch);
		codesByName.put(OffLineProcessAfterReferral.getCodeName().get(), OffLineProcessAfterReferral);
		codesByName.put(OffLineProcess.getCodeName().get(), OffLineProcess);
		codesByName.put(NotPermittedToCardholder.getCodeName().get(), NotPermittedToCardholder);
		codesByName.put(NotPermittedToAcceptor.getCodeName().get(), NotPermittedToAcceptor);
		codesByName.put(NotAbleToValidatePIN.getCodeName().get(), NotAbleToValidatePIN);
		codesByName.put(NoCardRecord.getCodeName().get(), NoCardRecord);
		codesByName.put(NewPINInvalid.getCodeName().get(), NewPINInvalid);
		codesByName.put(LostCard.getCodeName().get(), LostCard);
		codesByName.put(NoLiabilityAccepted.getCodeName().get(), NoLiabilityAccepted);
		codesByName.put(MACKeyError.getCodeName().get(), MACKeyError);
		codesByName.put(MACError.getCodeName().get(), MACError);
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
		codesByName.put(InvalidCertificate.getCodeName().get(), InvalidCertificate);
		codesByName.put(InvalidCardNumber.getCodeName().get(), InvalidCardNumber);
		codesByName.put(InvalidCardholderIdentification.getCodeName().get(), InvalidCardholderIdentification);
		codesByName.put(InvalidAmount.getCodeName().get(), InvalidAmount);
		codesByName.put(InvalidAcceptor.getCodeName().get(), InvalidAcceptor);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
		codesByName.put(InProgress.getCodeName().get(), InProgress);
		codesByName.put(FromAccountError.getCodeName().get(), FromAccountError);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(ExpiredCard.getCodeName().get(), ExpiredCard);
		codesByName.put(ExceededTransactionLifeCycle.getCodeName().get(), ExceededTransactionLifeCycle);
		codesByName.put(DisputedFees.getCodeName().get(), DisputedFees);
		codesByName.put(DatabaseError.getCodeName().get(), DatabaseError);
		codesByName.put(CutoverInProcess.getCodeName().get(), CutoverInProcess);
		codesByName.put(ClosedAccount.getCodeName().get(), ClosedAccount);
		codesByName.put(CasbackNotAllowed.getCodeName().get(), CasbackNotAllowed);
		codesByName.put(CashbackAmountExceeded.getCodeName().get(), CashbackAmountExceeded);
		codesByName.put(CardVerificationFailed.getCodeName().get(), CardVerificationFailed);
		codesByName.put(CardError.getCodeName().get(), CardError);
		codesByName.put(BankNotFound.getCodeName().get(), BankNotFound);
		codesByName.put(AmountNotFound.getCodeName().get(), AmountNotFound);
		codesByName.put(AcknowledgementOnly.getCodeName().get(), AcknowledgementOnly);
		codesByName.put(AuthenticationFailed.getCodeName().get(), AuthenticationFailed);
		codesByName.put(DepositAmountLimit.getCodeName().get(), DepositAmountLimit);
		codesByName.put(DepositNumberLimit.getCodeName().get(), DepositNumberLimit);
		codesByName.put(FallbackDeclined.getCodeName().get(), FallbackDeclined);
		codesByName.put(InvalidAddress.getCodeName().get(), InvalidAddress);
		codesByName.put(InvalidBranch.getCodeName().get(), InvalidBranch);
		codesByName.put(InvalidSignature.getCodeName().get(), InvalidSignature);
		codesByName.put(KeyStorageSaturation.getCodeName().get(), KeyStorageSaturation);
		codesByName.put(MissingICCData.getCodeName().get(), MissingICCData);
		codesByName.put(ServiceNotEnabled.getCodeName().get(), ServiceNotEnabled);
		codesByName.put(TerminalNotConfigured.getCodeName().get(), TerminalNotConfigured);
		codesByName.put(UnknownCertificate.getCodeName().get(), UnknownCertificate);
		codesByName.put(InvalidMediaType.getCodeName().get(), InvalidMediaType);
		codesByName.put(InvalidService.getCodeName().get(), InvalidService);
	}

	public static ResultDetailCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResultDetailCode[] values() {
		ResultDetailCode[] values = new ResultDetailCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResultDetailCode> {
		@Override
		public ResultDetailCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResultDetailCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}