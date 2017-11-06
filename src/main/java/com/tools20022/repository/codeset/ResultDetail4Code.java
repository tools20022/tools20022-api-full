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
 * Detail of the response to an ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResultDetailCode
 * ResultDetailCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAccountNotFound
 * ResultDetail4Code.mmAccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAcquirerNotSupported
 * ResultDetail4Code.mmAcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAMLValidation
 * ResultDetail4Code.mmAMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAmountNotFound
 * ResultDetail4Code.mmAmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAuthenticationFailed
 * ResultDetail4Code.mmAuthenticationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmBankNotFound
 * ResultDetail4Code.mmBankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmCardError
 * ResultDetail4Code.mmCardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmCardVerificationFailed
 * ResultDetail4Code.mmCardVerificationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmClosedAccount
 * ResultDetail4Code.mmClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmCutoverInProcess
 * ResultDetail4Code.mmCutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDatabaseError
 * ResultDetail4Code.mmDatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDisputedFees
 * ResultDetail4Code.mmDisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmExceededTransactionLifeCycle
 * ResultDetail4Code.mmExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDepositAmountLimit
 * ResultDetail4Code.mmDepositAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDepositNumberLimit
 * ResultDetail4Code.mmDepositNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmExpiredCard
 * ResultDetail4Code.mmExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmFallbackDeclined
 * ResultDetail4Code.mmFallbackDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmFormatError
 * ResultDetail4Code.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInProgress
 * ResultDetail4Code.mmInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInsufficientFunds
 * ResultDetail4Code.mmInsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidAcceptor
 * ResultDetail4Code.mmInvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidAmount
 * ResultDetail4Code.mmInvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidAddress
 * ResultDetail4Code.mmInvalidAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidBranch
 * ResultDetail4Code.mmInvalidBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidCardholderIdentification
 * ResultDetail4Code.mmInvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidCardNumber
 * ResultDetail4Code.mmInvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidCertificate
 * ResultDetail4Code.mmInvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidOriginalAmount
 * ResultDetail4Code.mmInvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidPIN
 * ResultDetail4Code.mmInvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidToken
 * ResultDetail4Code.mmInvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidSignature
 * ResultDetail4Code.mmInvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidTokenIdentification
 * ResultDetail4Code.mmInvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidTransaction
 * ResultDetail4Code.mmInvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidTransactionDateTime
 * ResultDetail4Code.mmInvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerInoperative
 * ResultDetail4Code.mmIssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerNotFound
 * ResultDetail4Code.mmIssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerSignedOff
 * ResultDetail4Code.mmIssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerTimeOut
 * ResultDetail4Code.mmIssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerUnavailable
 * ResultDetail4Code.mmIssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmKeyStorageSaturation
 * ResultDetail4Code.mmKeyStorageSaturation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmLiabilityAccepted
 * ResultDetail4Code.mmLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmLostCard
 * ResultDetail4Code.mmLostCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmMACError
 * ResultDetail4Code.mmMACError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmMACKeyError
 * ResultDetail4Code.mmMACKeyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmMissingICCData
 * ResultDetail4Code.mmMissingICCData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNewPINInvalid
 * ResultDetail4Code.mmNewPINInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNoCardRecord
 * ResultDetail4Code.mmNoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNoLiabilityAccepted
 * ResultDetail4Code.mmNoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNotAbleToValidatePIN
 * ResultDetail4Code.mmNotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNotPermittedToAcceptor
 * ResultDetail4Code.mmNotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOffLineProcess
 * ResultDetail4Code.mmOffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOffLineProcessAfterReferral
 * ResultDetail4Code.mmOffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNotPermittedToCardholder
 * ResultDetail4Code.mmNotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOriginalDoesNotMatch
 * ResultDetail4Code.mmOriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOtherError
 * ResultDetail4Code.mmOtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOutOfBalance
 * ResultDetail4Code.mmOutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOutOfSequence
 * ResultDetail4Code.mmOutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINChangeRequired
 * ResultDetail4Code.mmPINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINDataRequired
 * ResultDetail4Code.mmPINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINSecurityError
 * ResultDetail4Code.mmPINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINTriesExceeded
 * ResultDetail4Code.mmPINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINEncryptionError
 * ResultDetail4Code.mmPINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmQueueMaximumExceeded
 * ResultDetail4Code.mmQueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmRecurringDataError
 * ResultDetail4Code.mmRecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmRestrictedCard
 * ResultDetail4Code.mmRestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSecurityViolation
 * ResultDetail4Code.mmSecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmServiceNotEnabled
 * ResultDetail4Code.mmServiceNotEnabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSoftwareOrHardwareError
 * ResultDetail4Code.mmSoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSpecialConditions
 * ResultDetail4Code.mmSpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmStolenCard
 * ResultDetail4Code.mmStolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSurchargeNotPermitted
 * ResultDetail4Code.mmSurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSuspectedCounterfeitCard
 * ResultDetail4Code.mmSuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSuspectedFraud
 * ResultDetail4Code.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSystemInoperative
 * ResultDetail4Code.mmSystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSystemMalfunction
 * ResultDetail4Code.mmSystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTerminalNotConfigured
 * ResultDetail4Code.mmTerminalNotConfigured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmToAccountError
 * ResultDetail4Code.mmToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTotalsNotAvailable
 * ResultDetail4Code.mmTotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTransactionDidNotComplete
 * ResultDetail4Code.mmTransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTransactionDuplicate
 * ResultDetail4Code.mmTransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnableToFindOriginal
 * ResultDetail4Code.mmUnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnableToGoOnLine
 * ResultDetail4Code.mmUnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnableToProcessOffLine
 * ResultDetail4Code.mmUnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnacceptableCurrency
 * ResultDetail4Code.mmUnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnavailablecommunicationKey
 * ResultDetail4Code.mmUnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUneffectiveCard
 * ResultDetail4Code.mmUneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnsupportedService
 * ResultDetail4Code.mmUnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmVendorFormatError
 * ResultDetail4Code.mmVendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmVendorNotFound
 * ResultDetail4Code.mmVendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmWithdrawalAmountLimit
 * ResultDetail4Code.mmWithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmWithdrawalNumberLimit
 * ResultDetail4Code.mmWithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmWrongCard
 * ResultDetail4Code.mmWrongCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidMediaType
 * ResultDetail4Code.mmInvalidMediaType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidService
 * ResultDetail4Code.mmInvalidService}</li>
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
 * "ResultDetail4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the response to an ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
 * ResultDetail2Code}</li>
 * </ul>
 */
public class ResultDetail4Code extends ResultDetailCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAccountNotFound
	 * ResultDetail2Code.mmAccountNotFound}</li>
	 * </ul>
	 */
	public static final MMCode mmAccountNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmAccountNotFound;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerNotSupported"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAcquirerNotSupported
	 * ResultDetail2Code.mmAcquirerNotSupported}</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerNotSupported = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmAcquirerNotSupported;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLValidation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAMLValidation
	 * ResultDetail2Code.mmAMLValidation}</li>
	 * </ul>
	 */
	public static final MMCode mmAMLValidation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmAMLValidation;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAmountNotFound
	 * ResultDetail2Code.mmAmountNotFound}</li>
	 * </ul>
	 */
	public static final MMCode mmAmountNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmAmountNotFound;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAuthenticationFailed
	 * ResultDetail2Code.mmAuthenticationFailed}</li>
	 * </ul>
	 */
	public static final MMCode mmAuthenticationFailed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationFailed";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmAuthenticationFailed;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmBankNotFound
	 * ResultDetail2Code.mmBankNotFound}</li>
	 * </ul>
	 */
	public static final MMCode mmBankNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmBankNotFound;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmCardError
	 * ResultDetail2Code.mmCardError}</li>
	 * </ul>
	 */
	public static final MMCode mmCardError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmCardError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerificationFailed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmCardVerificationFailed
	 * ResultDetail2Code.mmCardVerificationFailed}</li>
	 * </ul>
	 */
	public static final MMCode mmCardVerificationFailed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmCardVerificationFailed;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmClosedAccount
	 * ResultDetail2Code.mmClosedAccount}</li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmClosedAccount;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoverInProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmCutoverInProcess
	 * ResultDetail2Code.mmCutoverInProcess}</li>
	 * </ul>
	 */
	public static final MMCode mmCutoverInProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmCutoverInProcess;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatabaseError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDatabaseError
	 * ResultDetail2Code.mmDatabaseError}</li>
	 * </ul>
	 */
	public static final MMCode mmDatabaseError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmDatabaseError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedFees"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDisputedFees
	 * ResultDetail2Code.mmDisputedFees}</li>
	 * </ul>
	 */
	public static final MMCode mmDisputedFees = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmDisputedFees;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceededTransactionLifeCycle"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmExceededTransactionLifeCycle
	 * ResultDetail2Code.mmExceededTransactionLifeCycle}</li>
	 * </ul>
	 */
	public static final MMCode mmExceededTransactionLifeCycle = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmExceededTransactionLifeCycle;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDepositAmountLimit
	 * ResultDetail2Code.mmDepositAmountLimit}</li>
	 * </ul>
	 */
	public static final MMCode mmDepositAmountLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmountLimit";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmDepositAmountLimit;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDepositNumberLimit
	 * ResultDetail2Code.mmDepositNumberLimit}</li>
	 * </ul>
	 */
	public static final MMCode mmDepositNumberLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositNumberLimit";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmDepositNumberLimit;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiredCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmExpiredCard
	 * ResultDetail2Code.mmExpiredCard}</li>
	 * </ul>
	 */
	public static final MMCode mmExpiredCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmExpiredCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackDeclined"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmFallbackDeclined
	 * ResultDetail2Code.mmFallbackDeclined}</li>
	 * </ul>
	 */
	public static final MMCode mmFallbackDeclined = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackDeclined";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmFallbackDeclined;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmFormatError
	 * ResultDetail2Code.mmFormatError}</li>
	 * </ul>
	 */
	public static final MMCode mmFormatError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmFormatError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProgress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInProgress
	 * ResultDetail2Code.mmInProgress}</li>
	 * </ul>
	 */
	public static final MMCode mmInProgress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInProgress;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInsufficientFunds
	 * ResultDetail2Code.mmInsufficientFunds}</li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFunds = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInsufficientFunds;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidAcceptor
	 * ResultDetail2Code.mmInvalidAcceptor}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAcceptor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidAcceptor;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidAmount
	 * ResultDetail2Code.mmInvalidAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidAmount;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidAddress
	 * ResultDetail2Code.mmInvalidAddress}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAddress = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAddress";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidAddress;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBranch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidBranch
	 * ResultDetail2Code.mmInvalidBranch}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidBranch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBranch";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidBranch;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardholderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidCardholderIdentification
	 * ResultDetail2Code.mmInvalidCardholderIdentification}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCardholderIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidCardholderIdentification;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidCardNumber
	 * ResultDetail2Code.mmInvalidCardNumber}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCardNumber = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidCardNumber;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCertificate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidCertificate
	 * ResultDetail2Code.mmInvalidCertificate}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCertificate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidCertificate;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidOriginalAmount
	 * ResultDetail2Code.mmInvalidOriginalAmount}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOriginalAmount = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidOriginalAmount;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidPIN
	 * ResultDetail2Code.mmInvalidPIN}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidPIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidPIN;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidToken"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidToken
	 * ResultDetail2Code.mmInvalidToken}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidToken = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidToken;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidSignature
	 * ResultDetail2Code.mmInvalidSignature}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSignature = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidSignature;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTokenIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidTokenIdentification
	 * ResultDetail2Code.mmInvalidTokenIdentification}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidTokenIdentification = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidTokenIdentification;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidTransaction
	 * ResultDetail2Code.mmInvalidTransaction}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidTransaction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidTransaction;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransactionDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidTransactionDateTime
	 * ResultDetail2Code.mmInvalidTransactionDateTime}</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidTransactionDateTime = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmInvalidTransactionDateTime;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInoperative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerInoperative
	 * ResultDetail2Code.mmIssuerInoperative}</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerInoperative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmIssuerInoperative;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerNotFound
	 * ResultDetail2Code.mmIssuerNotFound}</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmIssuerNotFound;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerSignedOff
	 * ResultDetail2Code.mmIssuerSignedOff}</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerSignedOff = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmIssuerSignedOff;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerTimeOut
	 * ResultDetail2Code.mmIssuerTimeOut}</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerTimeOut = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmIssuerTimeOut;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerUnavailable
	 * ResultDetail2Code.mmIssuerUnavailable}</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerUnavailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmIssuerUnavailable;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyStorageSaturation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmKeyStorageSaturation
	 * ResultDetail2Code.mmKeyStorageSaturation}</li>
	 * </ul>
	 */
	public static final MMCode mmKeyStorageSaturation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyStorageSaturation";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmKeyStorageSaturation;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiabilityAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmLiabilityAccepted
	 * ResultDetail2Code.mmLiabilityAccepted}</li>
	 * </ul>
	 */
	public static final MMCode mmLiabilityAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmLiabilityAccepted;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmLostCard
	 * ResultDetail2Code.mmLostCard}</li>
	 * </ul>
	 */
	public static final MMCode mmLostCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmLostCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmMACError
	 * ResultDetail2Code.mmMACError}</li>
	 * </ul>
	 */
	public static final MMCode mmMACError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmMACError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACKeyError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmMACKeyError
	 * ResultDetail2Code.mmMACKeyError}</li>
	 * </ul>
	 */
	public static final MMCode mmMACKeyError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmMACKeyError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingICCData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmMissingICCData
	 * ResultDetail2Code.mmMissingICCData}</li>
	 * </ul>
	 */
	public static final MMCode mmMissingICCData = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingICCData";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmMissingICCData;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPINInvalid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNewPINInvalid
	 * ResultDetail2Code.mmNewPINInvalid}</li>
	 * </ul>
	 */
	public static final MMCode mmNewPINInvalid = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmNewPINInvalid;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCardRecord"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNoCardRecord
	 * ResultDetail2Code.mmNoCardRecord}</li>
	 * </ul>
	 */
	public static final MMCode mmNoCardRecord = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmNoCardRecord;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLiabilityAccepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNoLiabilityAccepted
	 * ResultDetail2Code.mmNoLiabilityAccepted}</li>
	 * </ul>
	 */
	public static final MMCode mmNoLiabilityAccepted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmNoLiabilityAccepted;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAbleToValidatePIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNotAbleToValidatePIN
	 * ResultDetail2Code.mmNotAbleToValidatePIN}</li>
	 * </ul>
	 */
	public static final MMCode mmNotAbleToValidatePIN = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmNotAbleToValidatePIN;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToAcceptor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNotPermittedToAcceptor
	 * ResultDetail2Code.mmNotPermittedToAcceptor}</li>
	 * </ul>
	 */
	public static final MMCode mmNotPermittedToAcceptor = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmNotPermittedToAcceptor;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOffLineProcess
	 * ResultDetail2Code.mmOffLineProcess}</li>
	 * </ul>
	 */
	public static final MMCode mmOffLineProcess = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmOffLineProcess;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcessAfterReferral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOffLineProcessAfterReferral
	 * ResultDetail2Code.mmOffLineProcessAfterReferral}</li>
	 * </ul>
	 */
	public static final MMCode mmOffLineProcessAfterReferral = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmOffLineProcessAfterReferral;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToCardholder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNotPermittedToCardholder
	 * ResultDetail2Code.mmNotPermittedToCardholder}</li>
	 * </ul>
	 */
	public static final MMCode mmNotPermittedToCardholder = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmNotPermittedToCardholder;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDoesNotMatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOriginalDoesNotMatch
	 * ResultDetail2Code.mmOriginalDoesNotMatch}</li>
	 * </ul>
	 */
	public static final MMCode mmOriginalDoesNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmOriginalDoesNotMatch;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOtherError
	 * ResultDetail2Code.mmOtherError}</li>
	 * </ul>
	 */
	public static final MMCode mmOtherError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmOtherError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOutOfBalance
	 * ResultDetail2Code.mmOutOfBalance}</li>
	 * </ul>
	 */
	public static final MMCode mmOutOfBalance = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmOutOfBalance;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOutOfSequence
	 * ResultDetail2Code.mmOutOfSequence}</li>
	 * </ul>
	 */
	public static final MMCode mmOutOfSequence = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmOutOfSequence;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChangeRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINChangeRequired
	 * ResultDetail2Code.mmPINChangeRequired}</li>
	 * </ul>
	 */
	public static final MMCode mmPINChangeRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmPINChangeRequired;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDataRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINDataRequired
	 * ResultDetail2Code.mmPINDataRequired}</li>
	 * </ul>
	 */
	public static final MMCode mmPINDataRequired = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmPINDataRequired;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINSecurityError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINSecurityError
	 * ResultDetail2Code.mmPINSecurityError}</li>
	 * </ul>
	 */
	public static final MMCode mmPINSecurityError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmPINSecurityError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINTriesExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINTriesExceeded
	 * ResultDetail2Code.mmPINTriesExceeded}</li>
	 * </ul>
	 */
	public static final MMCode mmPINTriesExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmPINTriesExceeded;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryptionError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINEncryptionError
	 * ResultDetail2Code.mmPINEncryptionError}</li>
	 * </ul>
	 */
	public static final MMCode mmPINEncryptionError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmPINEncryptionError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueMaximumExceeded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmQueueMaximumExceeded
	 * ResultDetail2Code.mmQueueMaximumExceeded}</li>
	 * </ul>
	 */
	public static final MMCode mmQueueMaximumExceeded = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmQueueMaximumExceeded;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringDataError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmRecurringDataError
	 * ResultDetail2Code.mmRecurringDataError}</li>
	 * </ul>
	 */
	public static final MMCode mmRecurringDataError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmRecurringDataError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmRestrictedCard
	 * ResultDetail2Code.mmRestrictedCard}</li>
	 * </ul>
	 */
	public static final MMCode mmRestrictedCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmRestrictedCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityViolation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSecurityViolation
	 * ResultDetail2Code.mmSecurityViolation}</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityViolation = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSecurityViolation;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceNotEnabled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmServiceNotEnabled
	 * ResultDetail2Code.mmServiceNotEnabled}</li>
	 * </ul>
	 */
	public static final MMCode mmServiceNotEnabled = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceNotEnabled";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmServiceNotEnabled;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareOrHardwareError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSoftwareOrHardwareError
	 * ResultDetail2Code.mmSoftwareOrHardwareError}</li>
	 * </ul>
	 */
	public static final MMCode mmSoftwareOrHardwareError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSoftwareOrHardwareError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSpecialConditions
	 * ResultDetail2Code.mmSpecialConditions}</li>
	 * </ul>
	 */
	public static final MMCode mmSpecialConditions = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSpecialConditions;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StolenCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmStolenCard
	 * ResultDetail2Code.mmStolenCard}</li>
	 * </ul>
	 */
	public static final MMCode mmStolenCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmStolenCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurchargeNotPermitted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSurchargeNotPermitted
	 * ResultDetail2Code.mmSurchargeNotPermitted}</li>
	 * </ul>
	 */
	public static final MMCode mmSurchargeNotPermitted = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSurchargeNotPermitted;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeitCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSuspectedCounterfeitCard
	 * ResultDetail2Code.mmSuspectedCounterfeitCard}</li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedCounterfeitCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSuspectedCounterfeitCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSuspectedFraud
	 * ResultDetail2Code.mmSuspectedFraud}</li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSuspectedFraud;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInoperative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSystemInoperative
	 * ResultDetail2Code.mmSystemInoperative}</li>
	 * </ul>
	 */
	public static final MMCode mmSystemInoperative = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSystemInoperative;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMalfunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSystemMalfunction
	 * ResultDetail2Code.mmSystemMalfunction}</li>
	 * </ul>
	 */
	public static final MMCode mmSystemMalfunction = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmSystemMalfunction;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalNotConfigured"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTerminalNotConfigured
	 * ResultDetail2Code.mmTerminalNotConfigured}</li>
	 * </ul>
	 */
	public static final MMCode mmTerminalNotConfigured = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalNotConfigured";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmTerminalNotConfigured;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAccountError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmToAccountError
	 * ResultDetail2Code.mmToAccountError}</li>
	 * </ul>
	 */
	public static final MMCode mmToAccountError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmToAccountError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsNotAvailable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTotalsNotAvailable
	 * ResultDetail2Code.mmTotalsNotAvailable}</li>
	 * </ul>
	 */
	public static final MMCode mmTotalsNotAvailable = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmTotalsNotAvailable;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDidNotComplete"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTransactionDidNotComplete
	 * ResultDetail2Code.mmTransactionDidNotComplete}</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionDidNotComplete = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmTransactionDidNotComplete;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDuplicate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTransactionDuplicate
	 * ResultDetail2Code.mmTransactionDuplicate}</li>
	 * </ul>
	 */
	public static final MMCode mmTransactionDuplicate = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmTransactionDuplicate;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToFindOriginal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnableToFindOriginal
	 * ResultDetail2Code.mmUnableToFindOriginal}</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToFindOriginal = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUnableToFindOriginal;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToGoOnLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnableToGoOnLine
	 * ResultDetail2Code.mmUnableToGoOnLine}</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToGoOnLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUnableToGoOnLine;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcessOffLine"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnableToProcessOffLine
	 * ResultDetail2Code.mmUnableToProcessOffLine}</li>
	 * </ul>
	 */
	public static final MMCode mmUnableToProcessOffLine = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUnableToProcessOffLine;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnacceptableCurrency
	 * ResultDetail2Code.mmUnacceptableCurrency}</li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptableCurrency = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUnacceptableCurrency;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailablecommunicationKey"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnavailablecommunicationKey
	 * ResultDetail2Code.mmUnavailablecommunicationKey}</li>
	 * </ul>
	 */
	public static final MMCode mmUnavailablecommunicationKey = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUnavailablecommunicationKey;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UneffectiveCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUneffectiveCard
	 * ResultDetail2Code.mmUneffectiveCard}</li>
	 * </ul>
	 */
	public static final MMCode mmUneffectiveCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUneffectiveCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsupportedService"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnsupportedService
	 * ResultDetail2Code.mmUnsupportedService}</li>
	 * </ul>
	 */
	public static final MMCode mmUnsupportedService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmUnsupportedService;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorFormatError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmVendorFormatError
	 * ResultDetail2Code.mmVendorFormatError}</li>
	 * </ul>
	 */
	public static final MMCode mmVendorFormatError = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmVendorFormatError;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorNotFound"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmVendorNotFound
	 * ResultDetail2Code.mmVendorNotFound}</li>
	 * </ul>
	 */
	public static final MMCode mmVendorNotFound = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmVendorNotFound;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAmountLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmWithdrawalAmountLimit
	 * ResultDetail2Code.mmWithdrawalAmountLimit}</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalAmountLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmWithdrawalAmountLimit;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalNumberLimit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmWithdrawalNumberLimit
	 * ResultDetail2Code.mmWithdrawalNumberLimit}</li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalNumberLimit = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmWithdrawalNumberLimit;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmWrongCard
	 * ResultDetail2Code.mmWrongCard}</li>
	 * </ul>
	 */
	public static final MMCode mmWrongCard = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			previousVersion_lazy = () -> com.tools20022.repository.codeset.ResultDetail2Code.mmWrongCard;
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidMediaType"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidMediaType = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidMediaType";
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code
	 * ResultDetail4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidService"</li>
	 * </ul>
	 */
	public static final MMCode mmInvalidService = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidService";
			owner_lazy = () -> ResultDetail4Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "ResultDetail4Code";
				definition = "Detail of the response to an ATM.";
				previousVersion_lazy = () -> ResultDetail2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResultDetail4Code.mmAccountNotFound, com.tools20022.repository.codeset.ResultDetail4Code.mmAcquirerNotSupported,
						com.tools20022.repository.codeset.ResultDetail4Code.mmAMLValidation, com.tools20022.repository.codeset.ResultDetail4Code.mmAmountNotFound, com.tools20022.repository.codeset.ResultDetail4Code.mmAuthenticationFailed,
						com.tools20022.repository.codeset.ResultDetail4Code.mmBankNotFound, com.tools20022.repository.codeset.ResultDetail4Code.mmCardError, com.tools20022.repository.codeset.ResultDetail4Code.mmCardVerificationFailed,
						com.tools20022.repository.codeset.ResultDetail4Code.mmClosedAccount, com.tools20022.repository.codeset.ResultDetail4Code.mmCutoverInProcess, com.tools20022.repository.codeset.ResultDetail4Code.mmDatabaseError,
						com.tools20022.repository.codeset.ResultDetail4Code.mmDisputedFees, com.tools20022.repository.codeset.ResultDetail4Code.mmExceededTransactionLifeCycle,
						com.tools20022.repository.codeset.ResultDetail4Code.mmDepositAmountLimit, com.tools20022.repository.codeset.ResultDetail4Code.mmDepositNumberLimit, com.tools20022.repository.codeset.ResultDetail4Code.mmExpiredCard,
						com.tools20022.repository.codeset.ResultDetail4Code.mmFallbackDeclined, com.tools20022.repository.codeset.ResultDetail4Code.mmFormatError, com.tools20022.repository.codeset.ResultDetail4Code.mmInProgress,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInsufficientFunds, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidAcceptor, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidAmount,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidAddress, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidBranch,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidCardholderIdentification, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidCardNumber,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidCertificate, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidOriginalAmount,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidPIN, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidToken, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidSignature,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidTokenIdentification, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidTransaction,
						com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidTransactionDateTime, com.tools20022.repository.codeset.ResultDetail4Code.mmIssuerInoperative,
						com.tools20022.repository.codeset.ResultDetail4Code.mmIssuerNotFound, com.tools20022.repository.codeset.ResultDetail4Code.mmIssuerSignedOff, com.tools20022.repository.codeset.ResultDetail4Code.mmIssuerTimeOut,
						com.tools20022.repository.codeset.ResultDetail4Code.mmIssuerUnavailable, com.tools20022.repository.codeset.ResultDetail4Code.mmKeyStorageSaturation,
						com.tools20022.repository.codeset.ResultDetail4Code.mmLiabilityAccepted, com.tools20022.repository.codeset.ResultDetail4Code.mmLostCard, com.tools20022.repository.codeset.ResultDetail4Code.mmMACError,
						com.tools20022.repository.codeset.ResultDetail4Code.mmMACKeyError, com.tools20022.repository.codeset.ResultDetail4Code.mmMissingICCData, com.tools20022.repository.codeset.ResultDetail4Code.mmNewPINInvalid,
						com.tools20022.repository.codeset.ResultDetail4Code.mmNoCardRecord, com.tools20022.repository.codeset.ResultDetail4Code.mmNoLiabilityAccepted,
						com.tools20022.repository.codeset.ResultDetail4Code.mmNotAbleToValidatePIN, com.tools20022.repository.codeset.ResultDetail4Code.mmNotPermittedToAcceptor,
						com.tools20022.repository.codeset.ResultDetail4Code.mmOffLineProcess, com.tools20022.repository.codeset.ResultDetail4Code.mmOffLineProcessAfterReferral,
						com.tools20022.repository.codeset.ResultDetail4Code.mmNotPermittedToCardholder, com.tools20022.repository.codeset.ResultDetail4Code.mmOriginalDoesNotMatch,
						com.tools20022.repository.codeset.ResultDetail4Code.mmOtherError, com.tools20022.repository.codeset.ResultDetail4Code.mmOutOfBalance, com.tools20022.repository.codeset.ResultDetail4Code.mmOutOfSequence,
						com.tools20022.repository.codeset.ResultDetail4Code.mmPINChangeRequired, com.tools20022.repository.codeset.ResultDetail4Code.mmPINDataRequired, com.tools20022.repository.codeset.ResultDetail4Code.mmPINSecurityError,
						com.tools20022.repository.codeset.ResultDetail4Code.mmPINTriesExceeded, com.tools20022.repository.codeset.ResultDetail4Code.mmPINEncryptionError,
						com.tools20022.repository.codeset.ResultDetail4Code.mmQueueMaximumExceeded, com.tools20022.repository.codeset.ResultDetail4Code.mmRecurringDataError,
						com.tools20022.repository.codeset.ResultDetail4Code.mmRestrictedCard, com.tools20022.repository.codeset.ResultDetail4Code.mmSecurityViolation, com.tools20022.repository.codeset.ResultDetail4Code.mmServiceNotEnabled,
						com.tools20022.repository.codeset.ResultDetail4Code.mmSoftwareOrHardwareError, com.tools20022.repository.codeset.ResultDetail4Code.mmSpecialConditions,
						com.tools20022.repository.codeset.ResultDetail4Code.mmStolenCard, com.tools20022.repository.codeset.ResultDetail4Code.mmSurchargeNotPermitted,
						com.tools20022.repository.codeset.ResultDetail4Code.mmSuspectedCounterfeitCard, com.tools20022.repository.codeset.ResultDetail4Code.mmSuspectedFraud,
						com.tools20022.repository.codeset.ResultDetail4Code.mmSystemInoperative, com.tools20022.repository.codeset.ResultDetail4Code.mmSystemMalfunction,
						com.tools20022.repository.codeset.ResultDetail4Code.mmTerminalNotConfigured, com.tools20022.repository.codeset.ResultDetail4Code.mmToAccountError,
						com.tools20022.repository.codeset.ResultDetail4Code.mmTotalsNotAvailable, com.tools20022.repository.codeset.ResultDetail4Code.mmTransactionDidNotComplete,
						com.tools20022.repository.codeset.ResultDetail4Code.mmTransactionDuplicate, com.tools20022.repository.codeset.ResultDetail4Code.mmUnableToFindOriginal,
						com.tools20022.repository.codeset.ResultDetail4Code.mmUnableToGoOnLine, com.tools20022.repository.codeset.ResultDetail4Code.mmUnableToProcessOffLine,
						com.tools20022.repository.codeset.ResultDetail4Code.mmUnacceptableCurrency, com.tools20022.repository.codeset.ResultDetail4Code.mmUnavailablecommunicationKey,
						com.tools20022.repository.codeset.ResultDetail4Code.mmUneffectiveCard, com.tools20022.repository.codeset.ResultDetail4Code.mmUnsupportedService,
						com.tools20022.repository.codeset.ResultDetail4Code.mmVendorFormatError, com.tools20022.repository.codeset.ResultDetail4Code.mmVendorNotFound,
						com.tools20022.repository.codeset.ResultDetail4Code.mmWithdrawalAmountLimit, com.tools20022.repository.codeset.ResultDetail4Code.mmWithdrawalNumberLimit,
						com.tools20022.repository.codeset.ResultDetail4Code.mmWrongCard, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidMediaType, com.tools20022.repository.codeset.ResultDetail4Code.mmInvalidService);
				trace_lazy = () -> ResultDetailCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}