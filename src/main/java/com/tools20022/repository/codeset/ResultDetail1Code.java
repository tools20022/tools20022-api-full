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
import com.tools20022.repository.codeset.ResultDetailCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Detail of the result.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
 * ResultDetailCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmAccountNotFound
 * ResultDetail1Code.mmAccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmAcquirerNotSupported
 * ResultDetail1Code.mmAcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmAMLValidation
 * ResultDetail1Code.mmAMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmAmountNotFound
 * ResultDetail1Code.mmAmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmBankNotFound
 * ResultDetail1Code.mmBankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmCardError
 * ResultDetail1Code.mmCardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmCardVerificationFailed
 * ResultDetail1Code.mmCardVerificationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmCasbackNotAllowed
 * ResultDetail1Code.mmCasbackNotAllowed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmCashbackAmountExceeded
 * ResultDetail1Code.mmCashbackAmountExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmClosedAccount
 * ResultDetail1Code.mmClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmCutoverInProcess
 * ResultDetail1Code.mmCutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmDatabaseError
 * ResultDetail1Code.mmDatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmDisputedFees
 * ResultDetail1Code.mmDisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmExceededTransactionLifeCycle
 * ResultDetail1Code.mmExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmExpiredCard
 * ResultDetail1Code.mmExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmFormatError
 * ResultDetail1Code.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmFromAccountError
 * ResultDetail1Code.mmFromAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInProgress
 * ResultDetail1Code.mmInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInsufficientFunds
 * ResultDetail1Code.mmInsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidAcceptor
 * ResultDetail1Code.mmInvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidAmount
 * ResultDetail1Code.mmInvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidCardholderIdentification
 * ResultDetail1Code.mmInvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidCardNumber
 * ResultDetail1Code.mmInvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidCertificate
 * ResultDetail1Code.mmInvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmNotPermittedToAcceptor
 * ResultDetail1Code.mmNotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmNotAbleToValidatePIN
 * ResultDetail1Code.mmNotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmNoLiabilityAccepted
 * ResultDetail1Code.mmNoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmNoCardRecord
 * ResultDetail1Code.mmNoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmNewPINInvalid
 * ResultDetail1Code.mmNewPINInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmMACKeyError
 * ResultDetail1Code.mmMACKeyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmMACError
 * ResultDetail1Code.mmMACError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmLostCard
 * ResultDetail1Code.mmLostCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmLiabilityAccepted
 * ResultDetail1Code.mmLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmIssuerUnavailable
 * ResultDetail1Code.mmIssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmIssuerTimeOut
 * ResultDetail1Code.mmIssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmIssuerSignedOff
 * ResultDetail1Code.mmIssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmIssuerNotFound
 * ResultDetail1Code.mmIssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmIssuerInoperative
 * ResultDetail1Code.mmIssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidTransactionDateTime
 * ResultDetail1Code.mmInvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidTransaction
 * ResultDetail1Code.mmInvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidTokenIdentification
 * ResultDetail1Code.mmInvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidToken
 * ResultDetail1Code.mmInvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidSecurityCode
 * ResultDetail1Code.mmInvalidSecurityCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidPIN
 * ResultDetail1Code.mmInvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmInvalidOriginalAmount
 * ResultDetail1Code.mmInvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmNotPermittedToCardholder
 * ResultDetail1Code.mmNotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmOffLineProcess
 * ResultDetail1Code.mmOffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmOffLineProcessAfterReferral
 * ResultDetail1Code.mmOffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmOriginalDoesNotMatch
 * ResultDetail1Code.mmOriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmOtherError
 * ResultDetail1Code.mmOtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmOutOfBalance
 * ResultDetail1Code.mmOutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmOutOfSequence
 * ResultDetail1Code.mmOutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPaymentAmountLimit
 * ResultDetail1Code.mmPaymentAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPaymentNumberLimit
 * ResultDetail1Code.mmPaymentNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPINChangeRequired
 * ResultDetail1Code.mmPINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPINDataRequired
 * ResultDetail1Code.mmPINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPINEncryptionError
 * ResultDetail1Code.mmPINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPINSecurityError
 * ResultDetail1Code.mmPINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmPINTriesExceeded
 * ResultDetail1Code.mmPINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmQueueMaximumExceeded
 * ResultDetail1Code.mmQueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmRecurringDataError
 * ResultDetail1Code.mmRecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmRestrictedCard
 * ResultDetail1Code.mmRestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSecurityViolation
 * ResultDetail1Code.mmSecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSoftwareOrHardwareError
 * ResultDetail1Code.mmSoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSpecialConditions
 * ResultDetail1Code.mmSpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmWrongCard
 * ResultDetail1Code.mmWrongCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmWithdrawalNumberLimit
 * ResultDetail1Code.mmWithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmWithdrawalAmountLimit
 * ResultDetail1Code.mmWithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmVendorNotFound
 * ResultDetail1Code.mmVendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmVendorFormatError
 * ResultDetail1Code.mmVendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUnsupportedService
 * ResultDetail1Code.mmUnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUneffectiveCard
 * ResultDetail1Code.mmUneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUnavailablecommunicationKey
 * ResultDetail1Code.mmUnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUnacceptableCurrency
 * ResultDetail1Code.mmUnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUnableToProcessOffLine
 * ResultDetail1Code.mmUnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUnableToGoOnLine
 * ResultDetail1Code.mmUnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmUnableToFindOriginal
 * ResultDetail1Code.mmUnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmTransactionDuplicate
 * ResultDetail1Code.mmTransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmTransactionDidNotComplete
 * ResultDetail1Code.mmTransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmTotalsNotAvailable
 * ResultDetail1Code.mmTotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmToAccountError
 * ResultDetail1Code.mmToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSystemMalfunction
 * ResultDetail1Code.mmSystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSystemInoperative
 * ResultDetail1Code.mmSystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSuspectedFraud
 * ResultDetail1Code.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSuspectedCounterfeitCard
 * ResultDetail1Code.mmSuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmSurchargeNotPermitted
 * ResultDetail1Code.mmSurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmStolenCard
 * ResultDetail1Code.mmStolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail1Code#mmAcknowledgementOnly
 * ResultDetail1Code.mmAcknowledgementOnly}</li>
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
 * "ResultDetail1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the result."</li>
 * </ul>
 */
public class ResultDetail1Code extends ResultDetailCode {

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
	public static final MMCode mmAccountNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmAcquirerNotSupported = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmAMLValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmAmountNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmBankNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmCardError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmCardVerificationFailed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmCasbackNotAllowed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CasbackNotAllowed";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmCashbackAmountExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashbackAmountExceeded";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmClosedAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmCutoverInProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmDatabaseError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmDisputedFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmExceededTransactionLifeCycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmExpiredCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmFormatError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmFromAccountError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FromAccountError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInsufficientFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidAcceptor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidCardholderIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidCardNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmNotPermittedToAcceptor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmNotAbleToValidatePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmNoLiabilityAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmNoCardRecord = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmNewPINInvalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmMACKeyError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmMACError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmLostCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmLiabilityAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmIssuerUnavailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmIssuerTimeOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmIssuerSignedOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmIssuerNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmIssuerInoperative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidTransactionDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidTokenIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidToken = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidSecurityCode = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSecurityCode";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidPIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmInvalidOriginalAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmNotPermittedToCardholder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmOffLineProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmOffLineProcessAfterReferral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmOriginalDoesNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmOtherError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmOutOfBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmOutOfSequence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPaymentAmountLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentAmountLimit";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPaymentNumberLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentNumberLimit";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPINChangeRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPINDataRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPINEncryptionError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPINSecurityError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmPINTriesExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmQueueMaximumExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmRecurringDataError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmRestrictedCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSecurityViolation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSoftwareOrHardwareError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSpecialConditions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmWrongCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmWithdrawalNumberLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmWithdrawalAmountLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmVendorNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmVendorFormatError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUnsupportedService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUneffectiveCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUnavailablecommunicationKey = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUnacceptableCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUnableToProcessOffLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUnableToGoOnLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmUnableToFindOriginal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmTransactionDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmTransactionDidNotComplete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmTotalsNotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmToAccountError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSystemMalfunction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSystemInoperative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSuspectedCounterfeitCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmSurchargeNotPermitted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmStolenCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			owner_lazy = () -> ResultDetail1Code.mmObject();
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
	public static final MMCode mmAcknowledgementOnly = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementOnly";
			owner_lazy = () -> ResultDetail1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResultDetail1Code";
				definition = "Detail of the result.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResultDetail1Code.mmAccountNotFound, com.tools20022.repository.codeset.ResultDetail1Code.mmAcquirerNotSupported,
						com.tools20022.repository.codeset.ResultDetail1Code.mmAMLValidation, com.tools20022.repository.codeset.ResultDetail1Code.mmAmountNotFound, com.tools20022.repository.codeset.ResultDetail1Code.mmBankNotFound,
						com.tools20022.repository.codeset.ResultDetail1Code.mmCardError, com.tools20022.repository.codeset.ResultDetail1Code.mmCardVerificationFailed, com.tools20022.repository.codeset.ResultDetail1Code.mmCasbackNotAllowed,
						com.tools20022.repository.codeset.ResultDetail1Code.mmCashbackAmountExceeded, com.tools20022.repository.codeset.ResultDetail1Code.mmClosedAccount,
						com.tools20022.repository.codeset.ResultDetail1Code.mmCutoverInProcess, com.tools20022.repository.codeset.ResultDetail1Code.mmDatabaseError, com.tools20022.repository.codeset.ResultDetail1Code.mmDisputedFees,
						com.tools20022.repository.codeset.ResultDetail1Code.mmExceededTransactionLifeCycle, com.tools20022.repository.codeset.ResultDetail1Code.mmExpiredCard,
						com.tools20022.repository.codeset.ResultDetail1Code.mmFormatError, com.tools20022.repository.codeset.ResultDetail1Code.mmFromAccountError, com.tools20022.repository.codeset.ResultDetail1Code.mmInProgress,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInsufficientFunds, com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidAcceptor, com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidAmount,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidCardholderIdentification, com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidCardNumber,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidCertificate, com.tools20022.repository.codeset.ResultDetail1Code.mmNotPermittedToAcceptor,
						com.tools20022.repository.codeset.ResultDetail1Code.mmNotAbleToValidatePIN, com.tools20022.repository.codeset.ResultDetail1Code.mmNoLiabilityAccepted,
						com.tools20022.repository.codeset.ResultDetail1Code.mmNoCardRecord, com.tools20022.repository.codeset.ResultDetail1Code.mmNewPINInvalid, com.tools20022.repository.codeset.ResultDetail1Code.mmMACKeyError,
						com.tools20022.repository.codeset.ResultDetail1Code.mmMACError, com.tools20022.repository.codeset.ResultDetail1Code.mmLostCard, com.tools20022.repository.codeset.ResultDetail1Code.mmLiabilityAccepted,
						com.tools20022.repository.codeset.ResultDetail1Code.mmIssuerUnavailable, com.tools20022.repository.codeset.ResultDetail1Code.mmIssuerTimeOut, com.tools20022.repository.codeset.ResultDetail1Code.mmIssuerSignedOff,
						com.tools20022.repository.codeset.ResultDetail1Code.mmIssuerNotFound, com.tools20022.repository.codeset.ResultDetail1Code.mmIssuerInoperative,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidTransactionDateTime, com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidTransaction,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidTokenIdentification, com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidToken,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidSecurityCode, com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidPIN,
						com.tools20022.repository.codeset.ResultDetail1Code.mmInvalidOriginalAmount, com.tools20022.repository.codeset.ResultDetail1Code.mmNotPermittedToCardholder,
						com.tools20022.repository.codeset.ResultDetail1Code.mmOffLineProcess, com.tools20022.repository.codeset.ResultDetail1Code.mmOffLineProcessAfterReferral,
						com.tools20022.repository.codeset.ResultDetail1Code.mmOriginalDoesNotMatch, com.tools20022.repository.codeset.ResultDetail1Code.mmOtherError, com.tools20022.repository.codeset.ResultDetail1Code.mmOutOfBalance,
						com.tools20022.repository.codeset.ResultDetail1Code.mmOutOfSequence, com.tools20022.repository.codeset.ResultDetail1Code.mmPaymentAmountLimit,
						com.tools20022.repository.codeset.ResultDetail1Code.mmPaymentNumberLimit, com.tools20022.repository.codeset.ResultDetail1Code.mmPINChangeRequired,
						com.tools20022.repository.codeset.ResultDetail1Code.mmPINDataRequired, com.tools20022.repository.codeset.ResultDetail1Code.mmPINEncryptionError,
						com.tools20022.repository.codeset.ResultDetail1Code.mmPINSecurityError, com.tools20022.repository.codeset.ResultDetail1Code.mmPINTriesExceeded,
						com.tools20022.repository.codeset.ResultDetail1Code.mmQueueMaximumExceeded, com.tools20022.repository.codeset.ResultDetail1Code.mmRecurringDataError,
						com.tools20022.repository.codeset.ResultDetail1Code.mmRestrictedCard, com.tools20022.repository.codeset.ResultDetail1Code.mmSecurityViolation,
						com.tools20022.repository.codeset.ResultDetail1Code.mmSoftwareOrHardwareError, com.tools20022.repository.codeset.ResultDetail1Code.mmSpecialConditions,
						com.tools20022.repository.codeset.ResultDetail1Code.mmWrongCard, com.tools20022.repository.codeset.ResultDetail1Code.mmWithdrawalNumberLimit,
						com.tools20022.repository.codeset.ResultDetail1Code.mmWithdrawalAmountLimit, com.tools20022.repository.codeset.ResultDetail1Code.mmVendorNotFound,
						com.tools20022.repository.codeset.ResultDetail1Code.mmVendorFormatError, com.tools20022.repository.codeset.ResultDetail1Code.mmUnsupportedService,
						com.tools20022.repository.codeset.ResultDetail1Code.mmUneffectiveCard, com.tools20022.repository.codeset.ResultDetail1Code.mmUnavailablecommunicationKey,
						com.tools20022.repository.codeset.ResultDetail1Code.mmUnacceptableCurrency, com.tools20022.repository.codeset.ResultDetail1Code.mmUnableToProcessOffLine,
						com.tools20022.repository.codeset.ResultDetail1Code.mmUnableToGoOnLine, com.tools20022.repository.codeset.ResultDetail1Code.mmUnableToFindOriginal,
						com.tools20022.repository.codeset.ResultDetail1Code.mmTransactionDuplicate, com.tools20022.repository.codeset.ResultDetail1Code.mmTransactionDidNotComplete,
						com.tools20022.repository.codeset.ResultDetail1Code.mmTotalsNotAvailable, com.tools20022.repository.codeset.ResultDetail1Code.mmToAccountError,
						com.tools20022.repository.codeset.ResultDetail1Code.mmSystemMalfunction, com.tools20022.repository.codeset.ResultDetail1Code.mmSystemInoperative, com.tools20022.repository.codeset.ResultDetail1Code.mmSuspectedFraud,
						com.tools20022.repository.codeset.ResultDetail1Code.mmSuspectedCounterfeitCard, com.tools20022.repository.codeset.ResultDetail1Code.mmSurchargeNotPermitted,
						com.tools20022.repository.codeset.ResultDetail1Code.mmStolenCard, com.tools20022.repository.codeset.ResultDetail1Code.mmAcknowledgementOnly);
				trace_lazy = () -> ResultDetailCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}