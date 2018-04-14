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
import com.tools20022.repository.codeset.ResultDetail2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Detail of the response to an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#AccountNotFound
 * ResultDetail2Code.AccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#AcquirerNotSupported
 * ResultDetail2Code.AcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#AMLValidation
 * ResultDetail2Code.AMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#AmountNotFound
 * ResultDetail2Code.AmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#AuthenticationFailed
 * ResultDetail2Code.AuthenticationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#BankNotFound
 * ResultDetail2Code.BankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#CardError
 * ResultDetail2Code.CardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#CardVerificationFailed
 * ResultDetail2Code.CardVerificationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#ClosedAccount
 * ResultDetail2Code.ClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#CutoverInProcess
 * ResultDetail2Code.CutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#DatabaseError
 * ResultDetail2Code.DatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#DisputedFees
 * ResultDetail2Code.DisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#ExceededTransactionLifeCycle
 * ResultDetail2Code.ExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#DepositAmountLimit
 * ResultDetail2Code.DepositAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#DepositNumberLimit
 * ResultDetail2Code.DepositNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#ExpiredCard
 * ResultDetail2Code.ExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#FallbackDeclined
 * ResultDetail2Code.FallbackDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#FormatError
 * ResultDetail2Code.FormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InProgress
 * ResultDetail2Code.InProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InsufficientFunds
 * ResultDetail2Code.InsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidAcceptor
 * ResultDetail2Code.InvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidAmount
 * ResultDetail2Code.InvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidAddress
 * ResultDetail2Code.InvalidAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidBranch
 * ResultDetail2Code.InvalidBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidCardholderIdentification
 * ResultDetail2Code.InvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidCardNumber
 * ResultDetail2Code.InvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidCertificate
 * ResultDetail2Code.InvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidOriginalAmount
 * ResultDetail2Code.InvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidPIN
 * ResultDetail2Code.InvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidToken
 * ResultDetail2Code.InvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidSignature
 * ResultDetail2Code.InvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidTokenIdentification
 * ResultDetail2Code.InvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidTransaction
 * ResultDetail2Code.InvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#InvalidTransactionDateTime
 * ResultDetail2Code.InvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#IssuerInoperative
 * ResultDetail2Code.IssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#IssuerNotFound
 * ResultDetail2Code.IssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#IssuerSignedOff
 * ResultDetail2Code.IssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#IssuerTimeOut
 * ResultDetail2Code.IssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#IssuerUnavailable
 * ResultDetail2Code.IssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#KeyStorageSaturation
 * ResultDetail2Code.KeyStorageSaturation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#LiabilityAccepted
 * ResultDetail2Code.LiabilityAccepted}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail2Code#LostCard
 * ResultDetail2Code.LostCard}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail2Code#MACError
 * ResultDetail2Code.MACError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#MACKeyError
 * ResultDetail2Code.MACKeyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#MissingICCData
 * ResultDetail2Code.MissingICCData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#NewPINInvalid
 * ResultDetail2Code.NewPINInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#NoCardRecord
 * ResultDetail2Code.NoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#NoLiabilityAccepted
 * ResultDetail2Code.NoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#NotAbleToValidatePIN
 * ResultDetail2Code.NotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#NotPermittedToAcceptor
 * ResultDetail2Code.NotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#OffLineProcess
 * ResultDetail2Code.OffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#OffLineProcessAfterReferral
 * ResultDetail2Code.OffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#NotPermittedToCardholder
 * ResultDetail2Code.NotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#OriginalDoesNotMatch
 * ResultDetail2Code.OriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#OtherError
 * ResultDetail2Code.OtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#OutOfBalance
 * ResultDetail2Code.OutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#OutOfSequence
 * ResultDetail2Code.OutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#PINChangeRequired
 * ResultDetail2Code.PINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#PINDataRequired
 * ResultDetail2Code.PINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#PINSecurityError
 * ResultDetail2Code.PINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#PINTriesExceeded
 * ResultDetail2Code.PINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#PINEncryptionError
 * ResultDetail2Code.PINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#QueueMaximumExceeded
 * ResultDetail2Code.QueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#RecurringDataError
 * ResultDetail2Code.RecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#RestrictedCard
 * ResultDetail2Code.RestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SecurityViolation
 * ResultDetail2Code.SecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#ServiceNotEnabled
 * ResultDetail2Code.ServiceNotEnabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SoftwareOrHardwareError
 * ResultDetail2Code.SoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SpecialConditions
 * ResultDetail2Code.SpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#StolenCard
 * ResultDetail2Code.StolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SurchargeNotPermitted
 * ResultDetail2Code.SurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SuspectedCounterfeitCard
 * ResultDetail2Code.SuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SuspectedFraud
 * ResultDetail2Code.SuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SystemInoperative
 * ResultDetail2Code.SystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#SystemMalfunction
 * ResultDetail2Code.SystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#TerminalNotConfigured
 * ResultDetail2Code.TerminalNotConfigured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#ToAccountError
 * ResultDetail2Code.ToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#TotalsNotAvailable
 * ResultDetail2Code.TotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#TransactionDidNotComplete
 * ResultDetail2Code.TransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#TransactionDuplicate
 * ResultDetail2Code.TransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UnableToFindOriginal
 * ResultDetail2Code.UnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UnableToGoOnLine
 * ResultDetail2Code.UnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UnableToProcessOffLine
 * ResultDetail2Code.UnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UnacceptableCurrency
 * ResultDetail2Code.UnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UnavailablecommunicationKey
 * ResultDetail2Code.UnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UneffectiveCard
 * ResultDetail2Code.UneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#UnsupportedService
 * ResultDetail2Code.UnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#VendorFormatError
 * ResultDetail2Code.VendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#VendorNotFound
 * ResultDetail2Code.VendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#WithdrawalAmountLimit
 * ResultDetail2Code.WithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#WithdrawalNumberLimit
 * ResultDetail2Code.WithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#WrongCard
 * ResultDetail2Code.WrongCard}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResultDetail2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the response to an ATM."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail4Code
 * ResultDetail4Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResultDetail2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AccountNotFound
	 * ResultDetail4Code.AccountNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code AccountNotFound = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.AccountNotFound);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.AccountNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerNotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AcquirerNotSupported
	 * ResultDetail4Code.AcquirerNotSupported}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code AcquirerNotSupported = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.AcquirerNotSupported);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.AcquirerNotSupported.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AMLValidation
	 * ResultDetail4Code.AMLValidation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code AMLValidation = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.AMLValidation);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.AMLValidation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AmountNotFound
	 * ResultDetail4Code.AmountNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code AmountNotFound = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.AmountNotFound);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.AmountNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#AuthenticationFailed
	 * ResultDetail4Code.AuthenticationFailed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code AuthenticationFailed = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationFailed";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.AuthenticationFailed);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.AuthenticationFailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#BankNotFound
	 * ResultDetail4Code.BankNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code BankNotFound = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.BankNotFound);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.BankNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#CardError
	 * ResultDetail4Code.CardError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code CardError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.CardError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.CardError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerificationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#CardVerificationFailed
	 * ResultDetail4Code.CardVerificationFailed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code CardVerificationFailed = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.CardVerificationFailed);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.CardVerificationFailed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ClosedAccount
	 * ResultDetail4Code.ClosedAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code ClosedAccount = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.ClosedAccount);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.ClosedAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoverInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#CutoverInProcess
	 * ResultDetail4Code.CutoverInProcess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code CutoverInProcess = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.CutoverInProcess);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.CutoverInProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatabaseError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DatabaseError
	 * ResultDetail4Code.DatabaseError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code DatabaseError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.DatabaseError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.DatabaseError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DisputedFees
	 * ResultDetail4Code.DisputedFees}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code DisputedFees = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.DisputedFees);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.DisputedFees.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceededTransactionLifeCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ExceededTransactionLifeCycle
	 * ResultDetail4Code.ExceededTransactionLifeCycle}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code ExceededTransactionLifeCycle = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.ExceededTransactionLifeCycle);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.ExceededTransactionLifeCycle.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DepositAmountLimit
	 * ResultDetail4Code.DepositAmountLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code DepositAmountLimit = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmountLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.DepositAmountLimit);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.DepositAmountLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#DepositNumberLimit
	 * ResultDetail4Code.DepositNumberLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code DepositNumberLimit = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositNumberLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.DepositNumberLimit);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.DepositNumberLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiredCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ExpiredCard
	 * ResultDetail4Code.ExpiredCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code ExpiredCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.ExpiredCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.ExpiredCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#FallbackDeclined
	 * ResultDetail4Code.FallbackDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code FallbackDeclined = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackDeclined";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.FallbackDeclined);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.FallbackDeclined.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#FormatError
	 * ResultDetail4Code.FormatError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code FormatError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.FormatError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.FormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InProgress
	 * ResultDetail4Code.InProgress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InProgress = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InProgress);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InProgress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InsufficientFunds
	 * ResultDetail4Code.InsufficientFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InsufficientFunds = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InsufficientFunds);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InsufficientFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidAcceptor
	 * ResultDetail4Code.InvalidAcceptor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidAcceptor = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidAcceptor);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidAcceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidAmount
	 * ResultDetail4Code.InvalidAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidAmount = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidAddress
	 * ResultDetail4Code.InvalidAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidAddress = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAddress";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidAddress);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidAddress.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidBranch
	 * ResultDetail4Code.InvalidBranch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidBranch = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBranch";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidBranch);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidBranch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardholderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidCardholderIdentification
	 * ResultDetail4Code.InvalidCardholderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidCardholderIdentification = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidCardholderIdentification);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidCardholderIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidCardNumber
	 * ResultDetail4Code.InvalidCardNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidCardNumber = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidCardNumber);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidCardNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidCertificate
	 * ResultDetail4Code.InvalidCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidCertificate = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidCertificate);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidCertificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidOriginalAmount
	 * ResultDetail4Code.InvalidOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidOriginalAmount = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidOriginalAmount);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidOriginalAmount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidPIN
	 * ResultDetail4Code.InvalidPIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidPIN = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidPIN);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidPIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidToken
	 * ResultDetail4Code.InvalidToken}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidToken = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidToken);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidToken.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidSignature
	 * ResultDetail4Code.InvalidSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidSignature = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidSignature);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidSignature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTokenIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidTokenIdentification
	 * ResultDetail4Code.InvalidTokenIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidTokenIdentification = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidTokenIdentification);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidTokenIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidTransaction
	 * ResultDetail4Code.InvalidTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidTransaction = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidTransaction);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidTransaction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#InvalidTransactionDateTime
	 * ResultDetail4Code.InvalidTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code InvalidTransactionDateTime = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.InvalidTransactionDateTime);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.InvalidTransactionDateTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInoperative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerInoperative
	 * ResultDetail4Code.IssuerInoperative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code IssuerInoperative = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.IssuerInoperative);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.IssuerInoperative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerNotFound
	 * ResultDetail4Code.IssuerNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code IssuerNotFound = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.IssuerNotFound);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.IssuerNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerSignedOff
	 * ResultDetail4Code.IssuerSignedOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code IssuerSignedOff = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.IssuerSignedOff);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.IssuerSignedOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerTimeOut
	 * ResultDetail4Code.IssuerTimeOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code IssuerTimeOut = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.IssuerTimeOut);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.IssuerTimeOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#IssuerUnavailable
	 * ResultDetail4Code.IssuerUnavailable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code IssuerUnavailable = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.IssuerUnavailable);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.IssuerUnavailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyStorageSaturation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#KeyStorageSaturation
	 * ResultDetail4Code.KeyStorageSaturation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code KeyStorageSaturation = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyStorageSaturation";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.KeyStorageSaturation);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.KeyStorageSaturation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiabilityAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#LiabilityAccepted
	 * ResultDetail4Code.LiabilityAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code LiabilityAccepted = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.LiabilityAccepted);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.LiabilityAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#LostCard
	 * ResultDetail4Code.LostCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code LostCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.LostCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.LostCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#MACError
	 * ResultDetail4Code.MACError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code MACError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.MACError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.MACError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACKeyError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#MACKeyError
	 * ResultDetail4Code.MACKeyError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code MACKeyError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.MACKeyError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.MACKeyError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingICCData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#MissingICCData
	 * ResultDetail4Code.MissingICCData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code MissingICCData = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingICCData";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.MissingICCData);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.MissingICCData.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPINInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NewPINInvalid
	 * ResultDetail4Code.NewPINInvalid}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code NewPINInvalid = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.NewPINInvalid);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.NewPINInvalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCardRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NoCardRecord
	 * ResultDetail4Code.NoCardRecord}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code NoCardRecord = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.NoCardRecord);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.NoCardRecord.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLiabilityAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NoLiabilityAccepted
	 * ResultDetail4Code.NoLiabilityAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code NoLiabilityAccepted = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.NoLiabilityAccepted);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.NoLiabilityAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAbleToValidatePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NotAbleToValidatePIN
	 * ResultDetail4Code.NotAbleToValidatePIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code NotAbleToValidatePIN = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.NotAbleToValidatePIN);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.NotAbleToValidatePIN.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NotPermittedToAcceptor
	 * ResultDetail4Code.NotPermittedToAcceptor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code NotPermittedToAcceptor = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.NotPermittedToAcceptor);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.NotPermittedToAcceptor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OffLineProcess
	 * ResultDetail4Code.OffLineProcess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code OffLineProcess = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.OffLineProcess);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.OffLineProcess.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcessAfterReferral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OffLineProcessAfterReferral
	 * ResultDetail4Code.OffLineProcessAfterReferral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code OffLineProcessAfterReferral = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.OffLineProcessAfterReferral);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.OffLineProcessAfterReferral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToCardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#NotPermittedToCardholder
	 * ResultDetail4Code.NotPermittedToCardholder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code NotPermittedToCardholder = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.NotPermittedToCardholder);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.NotPermittedToCardholder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDoesNotMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OriginalDoesNotMatch
	 * ResultDetail4Code.OriginalDoesNotMatch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code OriginalDoesNotMatch = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.OriginalDoesNotMatch);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.OriginalDoesNotMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OtherError
	 * ResultDetail4Code.OtherError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code OtherError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.OtherError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.OtherError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OutOfBalance
	 * ResultDetail4Code.OutOfBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code OutOfBalance = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.OutOfBalance);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.OutOfBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#OutOfSequence
	 * ResultDetail4Code.OutOfSequence}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code OutOfSequence = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.OutOfSequence);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.OutOfSequence.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChangeRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINChangeRequired
	 * ResultDetail4Code.PINChangeRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code PINChangeRequired = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.PINChangeRequired);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.PINChangeRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDataRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINDataRequired
	 * ResultDetail4Code.PINDataRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code PINDataRequired = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.PINDataRequired);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.PINDataRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINSecurityError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINSecurityError
	 * ResultDetail4Code.PINSecurityError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code PINSecurityError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.PINSecurityError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.PINSecurityError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINTriesExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINTriesExceeded
	 * ResultDetail4Code.PINTriesExceeded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code PINTriesExceeded = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.PINTriesExceeded);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.PINTriesExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryptionError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#PINEncryptionError
	 * ResultDetail4Code.PINEncryptionError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code PINEncryptionError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.PINEncryptionError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.PINEncryptionError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueMaximumExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#QueueMaximumExceeded
	 * ResultDetail4Code.QueueMaximumExceeded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code QueueMaximumExceeded = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.QueueMaximumExceeded);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.QueueMaximumExceeded.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringDataError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#RecurringDataError
	 * ResultDetail4Code.RecurringDataError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code RecurringDataError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.RecurringDataError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.RecurringDataError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#RestrictedCard
	 * ResultDetail4Code.RestrictedCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code RestrictedCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.RestrictedCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.RestrictedCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityViolation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SecurityViolation
	 * ResultDetail4Code.SecurityViolation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SecurityViolation = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SecurityViolation);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SecurityViolation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceNotEnabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ServiceNotEnabled
	 * ResultDetail4Code.ServiceNotEnabled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code ServiceNotEnabled = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceNotEnabled";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.ServiceNotEnabled);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.ServiceNotEnabled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareOrHardwareError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SoftwareOrHardwareError
	 * ResultDetail4Code.SoftwareOrHardwareError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SoftwareOrHardwareError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SoftwareOrHardwareError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SoftwareOrHardwareError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SpecialConditions
	 * ResultDetail4Code.SpecialConditions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SpecialConditions = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SpecialConditions);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SpecialConditions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StolenCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#StolenCard
	 * ResultDetail4Code.StolenCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code StolenCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.StolenCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.StolenCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurchargeNotPermitted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SurchargeNotPermitted
	 * ResultDetail4Code.SurchargeNotPermitted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SurchargeNotPermitted = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SurchargeNotPermitted);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SurchargeNotPermitted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SuspectedCounterfeitCard
	 * ResultDetail4Code.SuspectedCounterfeitCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SuspectedCounterfeitCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SuspectedCounterfeitCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SuspectedCounterfeitCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SuspectedFraud
	 * ResultDetail4Code.SuspectedFraud}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SuspectedFraud = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SuspectedFraud);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SuspectedFraud.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInoperative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SystemInoperative
	 * ResultDetail4Code.SystemInoperative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SystemInoperative = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SystemInoperative);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SystemInoperative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMalfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#SystemMalfunction
	 * ResultDetail4Code.SystemMalfunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code SystemMalfunction = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.SystemMalfunction);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.SystemMalfunction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalNotConfigured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TerminalNotConfigured
	 * ResultDetail4Code.TerminalNotConfigured}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code TerminalNotConfigured = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalNotConfigured";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.TerminalNotConfigured);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.TerminalNotConfigured.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAccountError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#ToAccountError
	 * ResultDetail4Code.ToAccountError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code ToAccountError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.ToAccountError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.ToAccountError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TotalsNotAvailable
	 * ResultDetail4Code.TotalsNotAvailable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code TotalsNotAvailable = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.TotalsNotAvailable);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.TotalsNotAvailable.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDidNotComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TransactionDidNotComplete
	 * ResultDetail4Code.TransactionDidNotComplete}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code TransactionDidNotComplete = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.TransactionDidNotComplete);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.TransactionDidNotComplete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#TransactionDuplicate
	 * ResultDetail4Code.TransactionDuplicate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code TransactionDuplicate = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.TransactionDuplicate);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.TransactionDuplicate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToFindOriginal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnableToFindOriginal
	 * ResultDetail4Code.UnableToFindOriginal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UnableToFindOriginal = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UnableToFindOriginal);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UnableToFindOriginal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToGoOnLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnableToGoOnLine
	 * ResultDetail4Code.UnableToGoOnLine}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UnableToGoOnLine = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UnableToGoOnLine);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UnableToGoOnLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcessOffLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnableToProcessOffLine
	 * ResultDetail4Code.UnableToProcessOffLine}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UnableToProcessOffLine = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UnableToProcessOffLine);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UnableToProcessOffLine.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnacceptableCurrency
	 * ResultDetail4Code.UnacceptableCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UnacceptableCurrency = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UnacceptableCurrency);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UnacceptableCurrency.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailablecommunicationKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnavailablecommunicationKey
	 * ResultDetail4Code.UnavailablecommunicationKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UnavailablecommunicationKey = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UnavailablecommunicationKey);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UnavailablecommunicationKey.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UneffectiveCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UneffectiveCard
	 * ResultDetail4Code.UneffectiveCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UneffectiveCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UneffectiveCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UneffectiveCard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsupportedService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#UnsupportedService
	 * ResultDetail4Code.UnsupportedService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code UnsupportedService = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.UnsupportedService);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.UnsupportedService.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorFormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#VendorFormatError
	 * ResultDetail4Code.VendorFormatError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code VendorFormatError = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.VendorFormatError);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.VendorFormatError.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#VendorNotFound
	 * ResultDetail4Code.VendorNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code VendorNotFound = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.VendorNotFound);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.VendorNotFound.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#WithdrawalAmountLimit
	 * ResultDetail4Code.WithdrawalAmountLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code WithdrawalAmountLimit = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.WithdrawalAmountLimit);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.WithdrawalAmountLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#WithdrawalNumberLimit
	 * ResultDetail4Code.WithdrawalNumberLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code WithdrawalNumberLimit = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.WithdrawalNumberLimit);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.WithdrawalNumberLimit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#WrongCard
	 * ResultDetail4Code.WrongCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ResultDetail2Code WrongCard = new ResultDetail2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.WrongCard);
			owner_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmObject();
			codeName = ResultDetailCode.WrongCard.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ResultDetail2Code> codesByName = new LinkedHashMap<>();

	protected ResultDetail2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResultDetail2Code";
				definition = "Detail of the response to an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmObject());
				trace_lazy = () -> ResultDetailCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResultDetail2Code.AccountNotFound, com.tools20022.repository.codeset.ResultDetail2Code.AcquirerNotSupported,
						com.tools20022.repository.codeset.ResultDetail2Code.AMLValidation, com.tools20022.repository.codeset.ResultDetail2Code.AmountNotFound, com.tools20022.repository.codeset.ResultDetail2Code.AuthenticationFailed,
						com.tools20022.repository.codeset.ResultDetail2Code.BankNotFound, com.tools20022.repository.codeset.ResultDetail2Code.CardError, com.tools20022.repository.codeset.ResultDetail2Code.CardVerificationFailed,
						com.tools20022.repository.codeset.ResultDetail2Code.ClosedAccount, com.tools20022.repository.codeset.ResultDetail2Code.CutoverInProcess, com.tools20022.repository.codeset.ResultDetail2Code.DatabaseError,
						com.tools20022.repository.codeset.ResultDetail2Code.DisputedFees, com.tools20022.repository.codeset.ResultDetail2Code.ExceededTransactionLifeCycle,
						com.tools20022.repository.codeset.ResultDetail2Code.DepositAmountLimit, com.tools20022.repository.codeset.ResultDetail2Code.DepositNumberLimit, com.tools20022.repository.codeset.ResultDetail2Code.ExpiredCard,
						com.tools20022.repository.codeset.ResultDetail2Code.FallbackDeclined, com.tools20022.repository.codeset.ResultDetail2Code.FormatError, com.tools20022.repository.codeset.ResultDetail2Code.InProgress,
						com.tools20022.repository.codeset.ResultDetail2Code.InsufficientFunds, com.tools20022.repository.codeset.ResultDetail2Code.InvalidAcceptor, com.tools20022.repository.codeset.ResultDetail2Code.InvalidAmount,
						com.tools20022.repository.codeset.ResultDetail2Code.InvalidAddress, com.tools20022.repository.codeset.ResultDetail2Code.InvalidBranch,
						com.tools20022.repository.codeset.ResultDetail2Code.InvalidCardholderIdentification, com.tools20022.repository.codeset.ResultDetail2Code.InvalidCardNumber,
						com.tools20022.repository.codeset.ResultDetail2Code.InvalidCertificate, com.tools20022.repository.codeset.ResultDetail2Code.InvalidOriginalAmount, com.tools20022.repository.codeset.ResultDetail2Code.InvalidPIN,
						com.tools20022.repository.codeset.ResultDetail2Code.InvalidToken, com.tools20022.repository.codeset.ResultDetail2Code.InvalidSignature, com.tools20022.repository.codeset.ResultDetail2Code.InvalidTokenIdentification,
						com.tools20022.repository.codeset.ResultDetail2Code.InvalidTransaction, com.tools20022.repository.codeset.ResultDetail2Code.InvalidTransactionDateTime,
						com.tools20022.repository.codeset.ResultDetail2Code.IssuerInoperative, com.tools20022.repository.codeset.ResultDetail2Code.IssuerNotFound, com.tools20022.repository.codeset.ResultDetail2Code.IssuerSignedOff,
						com.tools20022.repository.codeset.ResultDetail2Code.IssuerTimeOut, com.tools20022.repository.codeset.ResultDetail2Code.IssuerUnavailable, com.tools20022.repository.codeset.ResultDetail2Code.KeyStorageSaturation,
						com.tools20022.repository.codeset.ResultDetail2Code.LiabilityAccepted, com.tools20022.repository.codeset.ResultDetail2Code.LostCard, com.tools20022.repository.codeset.ResultDetail2Code.MACError,
						com.tools20022.repository.codeset.ResultDetail2Code.MACKeyError, com.tools20022.repository.codeset.ResultDetail2Code.MissingICCData, com.tools20022.repository.codeset.ResultDetail2Code.NewPINInvalid,
						com.tools20022.repository.codeset.ResultDetail2Code.NoCardRecord, com.tools20022.repository.codeset.ResultDetail2Code.NoLiabilityAccepted, com.tools20022.repository.codeset.ResultDetail2Code.NotAbleToValidatePIN,
						com.tools20022.repository.codeset.ResultDetail2Code.NotPermittedToAcceptor, com.tools20022.repository.codeset.ResultDetail2Code.OffLineProcess,
						com.tools20022.repository.codeset.ResultDetail2Code.OffLineProcessAfterReferral, com.tools20022.repository.codeset.ResultDetail2Code.NotPermittedToCardholder,
						com.tools20022.repository.codeset.ResultDetail2Code.OriginalDoesNotMatch, com.tools20022.repository.codeset.ResultDetail2Code.OtherError, com.tools20022.repository.codeset.ResultDetail2Code.OutOfBalance,
						com.tools20022.repository.codeset.ResultDetail2Code.OutOfSequence, com.tools20022.repository.codeset.ResultDetail2Code.PINChangeRequired, com.tools20022.repository.codeset.ResultDetail2Code.PINDataRequired,
						com.tools20022.repository.codeset.ResultDetail2Code.PINSecurityError, com.tools20022.repository.codeset.ResultDetail2Code.PINTriesExceeded, com.tools20022.repository.codeset.ResultDetail2Code.PINEncryptionError,
						com.tools20022.repository.codeset.ResultDetail2Code.QueueMaximumExceeded, com.tools20022.repository.codeset.ResultDetail2Code.RecurringDataError, com.tools20022.repository.codeset.ResultDetail2Code.RestrictedCard,
						com.tools20022.repository.codeset.ResultDetail2Code.SecurityViolation, com.tools20022.repository.codeset.ResultDetail2Code.ServiceNotEnabled,
						com.tools20022.repository.codeset.ResultDetail2Code.SoftwareOrHardwareError, com.tools20022.repository.codeset.ResultDetail2Code.SpecialConditions, com.tools20022.repository.codeset.ResultDetail2Code.StolenCard,
						com.tools20022.repository.codeset.ResultDetail2Code.SurchargeNotPermitted, com.tools20022.repository.codeset.ResultDetail2Code.SuspectedCounterfeitCard,
						com.tools20022.repository.codeset.ResultDetail2Code.SuspectedFraud, com.tools20022.repository.codeset.ResultDetail2Code.SystemInoperative, com.tools20022.repository.codeset.ResultDetail2Code.SystemMalfunction,
						com.tools20022.repository.codeset.ResultDetail2Code.TerminalNotConfigured, com.tools20022.repository.codeset.ResultDetail2Code.ToAccountError, com.tools20022.repository.codeset.ResultDetail2Code.TotalsNotAvailable,
						com.tools20022.repository.codeset.ResultDetail2Code.TransactionDidNotComplete, com.tools20022.repository.codeset.ResultDetail2Code.TransactionDuplicate,
						com.tools20022.repository.codeset.ResultDetail2Code.UnableToFindOriginal, com.tools20022.repository.codeset.ResultDetail2Code.UnableToGoOnLine,
						com.tools20022.repository.codeset.ResultDetail2Code.UnableToProcessOffLine, com.tools20022.repository.codeset.ResultDetail2Code.UnacceptableCurrency,
						com.tools20022.repository.codeset.ResultDetail2Code.UnavailablecommunicationKey, com.tools20022.repository.codeset.ResultDetail2Code.UneffectiveCard,
						com.tools20022.repository.codeset.ResultDetail2Code.UnsupportedService, com.tools20022.repository.codeset.ResultDetail2Code.VendorFormatError, com.tools20022.repository.codeset.ResultDetail2Code.VendorNotFound,
						com.tools20022.repository.codeset.ResultDetail2Code.WithdrawalAmountLimit, com.tools20022.repository.codeset.ResultDetail2Code.WithdrawalNumberLimit, com.tools20022.repository.codeset.ResultDetail2Code.WrongCard);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AccountNotFound.getCodeName().get(), AccountNotFound);
		codesByName.put(AcquirerNotSupported.getCodeName().get(), AcquirerNotSupported);
		codesByName.put(AMLValidation.getCodeName().get(), AMLValidation);
		codesByName.put(AmountNotFound.getCodeName().get(), AmountNotFound);
		codesByName.put(AuthenticationFailed.getCodeName().get(), AuthenticationFailed);
		codesByName.put(BankNotFound.getCodeName().get(), BankNotFound);
		codesByName.put(CardError.getCodeName().get(), CardError);
		codesByName.put(CardVerificationFailed.getCodeName().get(), CardVerificationFailed);
		codesByName.put(ClosedAccount.getCodeName().get(), ClosedAccount);
		codesByName.put(CutoverInProcess.getCodeName().get(), CutoverInProcess);
		codesByName.put(DatabaseError.getCodeName().get(), DatabaseError);
		codesByName.put(DisputedFees.getCodeName().get(), DisputedFees);
		codesByName.put(ExceededTransactionLifeCycle.getCodeName().get(), ExceededTransactionLifeCycle);
		codesByName.put(DepositAmountLimit.getCodeName().get(), DepositAmountLimit);
		codesByName.put(DepositNumberLimit.getCodeName().get(), DepositNumberLimit);
		codesByName.put(ExpiredCard.getCodeName().get(), ExpiredCard);
		codesByName.put(FallbackDeclined.getCodeName().get(), FallbackDeclined);
		codesByName.put(FormatError.getCodeName().get(), FormatError);
		codesByName.put(InProgress.getCodeName().get(), InProgress);
		codesByName.put(InsufficientFunds.getCodeName().get(), InsufficientFunds);
		codesByName.put(InvalidAcceptor.getCodeName().get(), InvalidAcceptor);
		codesByName.put(InvalidAmount.getCodeName().get(), InvalidAmount);
		codesByName.put(InvalidAddress.getCodeName().get(), InvalidAddress);
		codesByName.put(InvalidBranch.getCodeName().get(), InvalidBranch);
		codesByName.put(InvalidCardholderIdentification.getCodeName().get(), InvalidCardholderIdentification);
		codesByName.put(InvalidCardNumber.getCodeName().get(), InvalidCardNumber);
		codesByName.put(InvalidCertificate.getCodeName().get(), InvalidCertificate);
		codesByName.put(InvalidOriginalAmount.getCodeName().get(), InvalidOriginalAmount);
		codesByName.put(InvalidPIN.getCodeName().get(), InvalidPIN);
		codesByName.put(InvalidToken.getCodeName().get(), InvalidToken);
		codesByName.put(InvalidSignature.getCodeName().get(), InvalidSignature);
		codesByName.put(InvalidTokenIdentification.getCodeName().get(), InvalidTokenIdentification);
		codesByName.put(InvalidTransaction.getCodeName().get(), InvalidTransaction);
		codesByName.put(InvalidTransactionDateTime.getCodeName().get(), InvalidTransactionDateTime);
		codesByName.put(IssuerInoperative.getCodeName().get(), IssuerInoperative);
		codesByName.put(IssuerNotFound.getCodeName().get(), IssuerNotFound);
		codesByName.put(IssuerSignedOff.getCodeName().get(), IssuerSignedOff);
		codesByName.put(IssuerTimeOut.getCodeName().get(), IssuerTimeOut);
		codesByName.put(IssuerUnavailable.getCodeName().get(), IssuerUnavailable);
		codesByName.put(KeyStorageSaturation.getCodeName().get(), KeyStorageSaturation);
		codesByName.put(LiabilityAccepted.getCodeName().get(), LiabilityAccepted);
		codesByName.put(LostCard.getCodeName().get(), LostCard);
		codesByName.put(MACError.getCodeName().get(), MACError);
		codesByName.put(MACKeyError.getCodeName().get(), MACKeyError);
		codesByName.put(MissingICCData.getCodeName().get(), MissingICCData);
		codesByName.put(NewPINInvalid.getCodeName().get(), NewPINInvalid);
		codesByName.put(NoCardRecord.getCodeName().get(), NoCardRecord);
		codesByName.put(NoLiabilityAccepted.getCodeName().get(), NoLiabilityAccepted);
		codesByName.put(NotAbleToValidatePIN.getCodeName().get(), NotAbleToValidatePIN);
		codesByName.put(NotPermittedToAcceptor.getCodeName().get(), NotPermittedToAcceptor);
		codesByName.put(OffLineProcess.getCodeName().get(), OffLineProcess);
		codesByName.put(OffLineProcessAfterReferral.getCodeName().get(), OffLineProcessAfterReferral);
		codesByName.put(NotPermittedToCardholder.getCodeName().get(), NotPermittedToCardholder);
		codesByName.put(OriginalDoesNotMatch.getCodeName().get(), OriginalDoesNotMatch);
		codesByName.put(OtherError.getCodeName().get(), OtherError);
		codesByName.put(OutOfBalance.getCodeName().get(), OutOfBalance);
		codesByName.put(OutOfSequence.getCodeName().get(), OutOfSequence);
		codesByName.put(PINChangeRequired.getCodeName().get(), PINChangeRequired);
		codesByName.put(PINDataRequired.getCodeName().get(), PINDataRequired);
		codesByName.put(PINSecurityError.getCodeName().get(), PINSecurityError);
		codesByName.put(PINTriesExceeded.getCodeName().get(), PINTriesExceeded);
		codesByName.put(PINEncryptionError.getCodeName().get(), PINEncryptionError);
		codesByName.put(QueueMaximumExceeded.getCodeName().get(), QueueMaximumExceeded);
		codesByName.put(RecurringDataError.getCodeName().get(), RecurringDataError);
		codesByName.put(RestrictedCard.getCodeName().get(), RestrictedCard);
		codesByName.put(SecurityViolation.getCodeName().get(), SecurityViolation);
		codesByName.put(ServiceNotEnabled.getCodeName().get(), ServiceNotEnabled);
		codesByName.put(SoftwareOrHardwareError.getCodeName().get(), SoftwareOrHardwareError);
		codesByName.put(SpecialConditions.getCodeName().get(), SpecialConditions);
		codesByName.put(StolenCard.getCodeName().get(), StolenCard);
		codesByName.put(SurchargeNotPermitted.getCodeName().get(), SurchargeNotPermitted);
		codesByName.put(SuspectedCounterfeitCard.getCodeName().get(), SuspectedCounterfeitCard);
		codesByName.put(SuspectedFraud.getCodeName().get(), SuspectedFraud);
		codesByName.put(SystemInoperative.getCodeName().get(), SystemInoperative);
		codesByName.put(SystemMalfunction.getCodeName().get(), SystemMalfunction);
		codesByName.put(TerminalNotConfigured.getCodeName().get(), TerminalNotConfigured);
		codesByName.put(ToAccountError.getCodeName().get(), ToAccountError);
		codesByName.put(TotalsNotAvailable.getCodeName().get(), TotalsNotAvailable);
		codesByName.put(TransactionDidNotComplete.getCodeName().get(), TransactionDidNotComplete);
		codesByName.put(TransactionDuplicate.getCodeName().get(), TransactionDuplicate);
		codesByName.put(UnableToFindOriginal.getCodeName().get(), UnableToFindOriginal);
		codesByName.put(UnableToGoOnLine.getCodeName().get(), UnableToGoOnLine);
		codesByName.put(UnableToProcessOffLine.getCodeName().get(), UnableToProcessOffLine);
		codesByName.put(UnacceptableCurrency.getCodeName().get(), UnacceptableCurrency);
		codesByName.put(UnavailablecommunicationKey.getCodeName().get(), UnavailablecommunicationKey);
		codesByName.put(UneffectiveCard.getCodeName().get(), UneffectiveCard);
		codesByName.put(UnsupportedService.getCodeName().get(), UnsupportedService);
		codesByName.put(VendorFormatError.getCodeName().get(), VendorFormatError);
		codesByName.put(VendorNotFound.getCodeName().get(), VendorNotFound);
		codesByName.put(WithdrawalAmountLimit.getCodeName().get(), WithdrawalAmountLimit);
		codesByName.put(WithdrawalNumberLimit.getCodeName().get(), WithdrawalNumberLimit);
		codesByName.put(WrongCard.getCodeName().get(), WrongCard);
	}

	public static ResultDetail2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResultDetail2Code[] values() {
		ResultDetail2Code[] values = new ResultDetail2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResultDetail2Code> {
		@Override
		public ResultDetail2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResultDetail2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}