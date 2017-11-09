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
import com.tools20022.repository.codeset.ResultDetailCode;
import com.tools20022.repository.GeneratedRepository;
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
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAccountNotFound
 * ResultDetail2Code.mmAccountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAcquirerNotSupported
 * ResultDetail2Code.mmAcquirerNotSupported}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAMLValidation
 * ResultDetail2Code.mmAMLValidation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAmountNotFound
 * ResultDetail2Code.mmAmountNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmAuthenticationFailed
 * ResultDetail2Code.mmAuthenticationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmBankNotFound
 * ResultDetail2Code.mmBankNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmCardError
 * ResultDetail2Code.mmCardError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmCardVerificationFailed
 * ResultDetail2Code.mmCardVerificationFailed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmClosedAccount
 * ResultDetail2Code.mmClosedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmCutoverInProcess
 * ResultDetail2Code.mmCutoverInProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDatabaseError
 * ResultDetail2Code.mmDatabaseError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDisputedFees
 * ResultDetail2Code.mmDisputedFees}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmExceededTransactionLifeCycle
 * ResultDetail2Code.mmExceededTransactionLifeCycle}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDepositAmountLimit
 * ResultDetail2Code.mmDepositAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmDepositNumberLimit
 * ResultDetail2Code.mmDepositNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmExpiredCard
 * ResultDetail2Code.mmExpiredCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmFallbackDeclined
 * ResultDetail2Code.mmFallbackDeclined}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmFormatError
 * ResultDetail2Code.mmFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInProgress
 * ResultDetail2Code.mmInProgress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInsufficientFunds
 * ResultDetail2Code.mmInsufficientFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidAcceptor
 * ResultDetail2Code.mmInvalidAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidAmount
 * ResultDetail2Code.mmInvalidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidAddress
 * ResultDetail2Code.mmInvalidAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidBranch
 * ResultDetail2Code.mmInvalidBranch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidCardholderIdentification
 * ResultDetail2Code.mmInvalidCardholderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidCardNumber
 * ResultDetail2Code.mmInvalidCardNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidCertificate
 * ResultDetail2Code.mmInvalidCertificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidOriginalAmount
 * ResultDetail2Code.mmInvalidOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidPIN
 * ResultDetail2Code.mmInvalidPIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidToken
 * ResultDetail2Code.mmInvalidToken}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidSignature
 * ResultDetail2Code.mmInvalidSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidTokenIdentification
 * ResultDetail2Code.mmInvalidTokenIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidTransaction
 * ResultDetail2Code.mmInvalidTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmInvalidTransactionDateTime
 * ResultDetail2Code.mmInvalidTransactionDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerInoperative
 * ResultDetail2Code.mmIssuerInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerNotFound
 * ResultDetail2Code.mmIssuerNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerSignedOff
 * ResultDetail2Code.mmIssuerSignedOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerTimeOut
 * ResultDetail2Code.mmIssuerTimeOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmIssuerUnavailable
 * ResultDetail2Code.mmIssuerUnavailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmKeyStorageSaturation
 * ResultDetail2Code.mmKeyStorageSaturation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmLiabilityAccepted
 * ResultDetail2Code.mmLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmLostCard
 * ResultDetail2Code.mmLostCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmMACError
 * ResultDetail2Code.mmMACError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmMACKeyError
 * ResultDetail2Code.mmMACKeyError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmMissingICCData
 * ResultDetail2Code.mmMissingICCData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNewPINInvalid
 * ResultDetail2Code.mmNewPINInvalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNoCardRecord
 * ResultDetail2Code.mmNoCardRecord}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNoLiabilityAccepted
 * ResultDetail2Code.mmNoLiabilityAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNotAbleToValidatePIN
 * ResultDetail2Code.mmNotAbleToValidatePIN}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNotPermittedToAcceptor
 * ResultDetail2Code.mmNotPermittedToAcceptor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOffLineProcess
 * ResultDetail2Code.mmOffLineProcess}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOffLineProcessAfterReferral
 * ResultDetail2Code.mmOffLineProcessAfterReferral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmNotPermittedToCardholder
 * ResultDetail2Code.mmNotPermittedToCardholder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOriginalDoesNotMatch
 * ResultDetail2Code.mmOriginalDoesNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOtherError
 * ResultDetail2Code.mmOtherError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOutOfBalance
 * ResultDetail2Code.mmOutOfBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmOutOfSequence
 * ResultDetail2Code.mmOutOfSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINChangeRequired
 * ResultDetail2Code.mmPINChangeRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINDataRequired
 * ResultDetail2Code.mmPINDataRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINSecurityError
 * ResultDetail2Code.mmPINSecurityError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINTriesExceeded
 * ResultDetail2Code.mmPINTriesExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmPINEncryptionError
 * ResultDetail2Code.mmPINEncryptionError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmQueueMaximumExceeded
 * ResultDetail2Code.mmQueueMaximumExceeded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmRecurringDataError
 * ResultDetail2Code.mmRecurringDataError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmRestrictedCard
 * ResultDetail2Code.mmRestrictedCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSecurityViolation
 * ResultDetail2Code.mmSecurityViolation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmServiceNotEnabled
 * ResultDetail2Code.mmServiceNotEnabled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSoftwareOrHardwareError
 * ResultDetail2Code.mmSoftwareOrHardwareError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSpecialConditions
 * ResultDetail2Code.mmSpecialConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmStolenCard
 * ResultDetail2Code.mmStolenCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSurchargeNotPermitted
 * ResultDetail2Code.mmSurchargeNotPermitted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSuspectedCounterfeitCard
 * ResultDetail2Code.mmSuspectedCounterfeitCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSuspectedFraud
 * ResultDetail2Code.mmSuspectedFraud}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSystemInoperative
 * ResultDetail2Code.mmSystemInoperative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmSystemMalfunction
 * ResultDetail2Code.mmSystemMalfunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTerminalNotConfigured
 * ResultDetail2Code.mmTerminalNotConfigured}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmToAccountError
 * ResultDetail2Code.mmToAccountError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTotalsNotAvailable
 * ResultDetail2Code.mmTotalsNotAvailable}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTransactionDidNotComplete
 * ResultDetail2Code.mmTransactionDidNotComplete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmTransactionDuplicate
 * ResultDetail2Code.mmTransactionDuplicate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnableToFindOriginal
 * ResultDetail2Code.mmUnableToFindOriginal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnableToGoOnLine
 * ResultDetail2Code.mmUnableToGoOnLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnableToProcessOffLine
 * ResultDetail2Code.mmUnableToProcessOffLine}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnacceptableCurrency
 * ResultDetail2Code.mmUnacceptableCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnavailablecommunicationKey
 * ResultDetail2Code.mmUnavailablecommunicationKey}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUneffectiveCard
 * ResultDetail2Code.mmUneffectiveCard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmUnsupportedService
 * ResultDetail2Code.mmUnsupportedService}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmVendorFormatError
 * ResultDetail2Code.mmVendorFormatError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmVendorNotFound
 * ResultDetail2Code.mmVendorNotFound}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmWithdrawalAmountLimit
 * ResultDetail2Code.mmWithdrawalAmountLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmWithdrawalNumberLimit
 * ResultDetail2Code.mmWithdrawalNumberLimit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code#mmWrongCard
 * ResultDetail2Code.mmWrongCard}</li>
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
 * "ResultDetail2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Detail of the response to an ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ResultDetail4Code
 * ResultDetail4Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class ResultDetail2Code extends ResultDetailCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail2Code
	 * ResultDetail2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountNotFound"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAccountNotFound
	 * ResultDetail4Code.mmAccountNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAccountNotFound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmAccountNotFound);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerNotSupported"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAcquirerNotSupported
	 * ResultDetail4Code.mmAcquirerNotSupported}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerNotSupported = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerNotSupported";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmAcquirerNotSupported);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AMLValidation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAMLValidation
	 * ResultDetail4Code.mmAMLValidation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAMLValidation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AMLValidation";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmAMLValidation);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountNotFound"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAmountNotFound
	 * ResultDetail4Code.mmAmountNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAmountNotFound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmAmountNotFound);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthenticationFailed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmAuthenticationFailed
	 * ResultDetail4Code.mmAuthenticationFailed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAuthenticationFailed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthenticationFailed";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmAuthenticationFailed);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankNotFound"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmBankNotFound
	 * ResultDetail4Code.mmBankNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmBankNotFound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmBankNotFound);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmCardError
	 * ResultDetail4Code.mmCardError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmCardError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardVerificationFailed"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmCardVerificationFailed
	 * ResultDetail4Code.mmCardVerificationFailed}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCardVerificationFailed = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardVerificationFailed";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmCardVerificationFailed);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmClosedAccount
	 * ResultDetail4Code.mmClosedAccount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmClosedAccount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccount";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmClosedAccount);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutoverInProcess"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmCutoverInProcess
	 * ResultDetail4Code.mmCutoverInProcess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCutoverInProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CutoverInProcess";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmCutoverInProcess);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DatabaseError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDatabaseError
	 * ResultDetail4Code.mmDatabaseError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDatabaseError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DatabaseError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmDatabaseError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DisputedFees"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDisputedFees
	 * ResultDetail4Code.mmDisputedFees}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDisputedFees = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DisputedFees";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmDisputedFees);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceededTransactionLifeCycle"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmExceededTransactionLifeCycle
	 * ResultDetail4Code.mmExceededTransactionLifeCycle}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExceededTransactionLifeCycle = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceededTransactionLifeCycle";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmExceededTransactionLifeCycle);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositAmountLimit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDepositAmountLimit
	 * ResultDetail4Code.mmDepositAmountLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDepositAmountLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositAmountLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmDepositAmountLimit);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositNumberLimit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmDepositNumberLimit
	 * ResultDetail4Code.mmDepositNumberLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmDepositNumberLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositNumberLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmDepositNumberLimit);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExpiredCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmExpiredCard
	 * ResultDetail4Code.mmExpiredCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmExpiredCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExpiredCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmExpiredCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FallbackDeclined"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmFallbackDeclined
	 * ResultDetail4Code.mmFallbackDeclined}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFallbackDeclined = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FallbackDeclined";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmFallbackDeclined);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FormatError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmFormatError
	 * ResultDetail4Code.mmFormatError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFormatError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FormatError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmFormatError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InProgress"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInProgress
	 * ResultDetail4Code.mmInProgress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInProgress = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InProgress";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInProgress);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InsufficientFunds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInsufficientFunds
	 * ResultDetail4Code.mmInsufficientFunds}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInsufficientFunds = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InsufficientFunds";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInsufficientFunds);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAcceptor"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidAcceptor
	 * ResultDetail4Code.mmInvalidAcceptor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAcceptor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAcceptor";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidAcceptor);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidAmount
	 * ResultDetail4Code.mmInvalidAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAmount";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidAmount);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidAddress"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidAddress
	 * ResultDetail4Code.mmInvalidAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidAddress = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidAddress";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidAddress);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidBranch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidBranch
	 * ResultDetail4Code.mmInvalidBranch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidBranch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidBranch";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidBranch);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardholderIdentification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidCardholderIdentification
	 * ResultDetail4Code.mmInvalidCardholderIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCardholderIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardholderIdentification";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidCardholderIdentification);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCardNumber"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidCardNumber
	 * ResultDetail4Code.mmInvalidCardNumber}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCardNumber = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCardNumber";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidCardNumber);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidCertificate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidCertificate
	 * ResultDetail4Code.mmInvalidCertificate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidCertificate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidCertificate";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidCertificate);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidOriginalAmount"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidOriginalAmount
	 * ResultDetail4Code.mmInvalidOriginalAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidOriginalAmount = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidOriginalAmount";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidOriginalAmount);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidPIN
	 * ResultDetail4Code.mmInvalidPIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidPIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPIN";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidPIN);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidToken"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidToken
	 * ResultDetail4Code.mmInvalidToken}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidToken = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidToken";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidToken);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidSignature"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidSignature
	 * ResultDetail4Code.mmInvalidSignature}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidSignature = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidSignature";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidSignature);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTokenIdentification"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidTokenIdentification
	 * ResultDetail4Code.mmInvalidTokenIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidTokenIdentification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTokenIdentification";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidTokenIdentification);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransaction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidTransaction
	 * ResultDetail4Code.mmInvalidTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidTransaction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransaction";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidTransaction);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidTransactionDateTime"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmInvalidTransactionDateTime
	 * ResultDetail4Code.mmInvalidTransactionDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmInvalidTransactionDateTime = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidTransactionDateTime";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmInvalidTransactionDateTime);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerInoperative"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerInoperative
	 * ResultDetail4Code.mmIssuerInoperative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerInoperative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerInoperative";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmIssuerInoperative);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerNotFound"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerNotFound
	 * ResultDetail4Code.mmIssuerNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerNotFound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmIssuerNotFound);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerSignedOff"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerSignedOff
	 * ResultDetail4Code.mmIssuerSignedOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerSignedOff = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerSignedOff";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmIssuerSignedOff);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerTimeOut"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerTimeOut
	 * ResultDetail4Code.mmIssuerTimeOut}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerTimeOut = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerTimeOut";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmIssuerTimeOut);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerUnavailable"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmIssuerUnavailable
	 * ResultDetail4Code.mmIssuerUnavailable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerUnavailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerUnavailable";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmIssuerUnavailable);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyStorageSaturation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmKeyStorageSaturation
	 * ResultDetail4Code.mmKeyStorageSaturation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmKeyStorageSaturation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyStorageSaturation";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmKeyStorageSaturation);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiabilityAccepted"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmLiabilityAccepted
	 * ResultDetail4Code.mmLiabilityAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLiabilityAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiabilityAccepted";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmLiabilityAccepted);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LostCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmLostCard
	 * ResultDetail4Code.mmLostCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmLostCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LostCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmLostCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmMACError
	 * ResultDetail4Code.mmMACError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMACError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmMACError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MACKeyError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmMACKeyError
	 * ResultDetail4Code.mmMACKeyError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMACKeyError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MACKeyError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmMACKeyError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingICCData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmMissingICCData
	 * ResultDetail4Code.mmMissingICCData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmMissingICCData = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingICCData";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmMissingICCData);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPINInvalid"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNewPINInvalid
	 * ResultDetail4Code.mmNewPINInvalid}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNewPINInvalid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPINInvalid";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmNewPINInvalid);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoCardRecord"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNoCardRecord
	 * ResultDetail4Code.mmNoCardRecord}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoCardRecord = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoCardRecord";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmNoCardRecord);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoLiabilityAccepted"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNoLiabilityAccepted
	 * ResultDetail4Code.mmNoLiabilityAccepted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNoLiabilityAccepted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoLiabilityAccepted";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmNoLiabilityAccepted);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotAbleToValidatePIN"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNotAbleToValidatePIN
	 * ResultDetail4Code.mmNotAbleToValidatePIN}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotAbleToValidatePIN = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotAbleToValidatePIN";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmNotAbleToValidatePIN);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToAcceptor"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNotPermittedToAcceptor
	 * ResultDetail4Code.mmNotPermittedToAcceptor}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotPermittedToAcceptor = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToAcceptor";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmNotPermittedToAcceptor);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcess"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOffLineProcess
	 * ResultDetail4Code.mmOffLineProcess}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOffLineProcess = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcess";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmOffLineProcess);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineProcessAfterReferral"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOffLineProcessAfterReferral
	 * ResultDetail4Code.mmOffLineProcessAfterReferral}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOffLineProcessAfterReferral = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineProcessAfterReferral";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmOffLineProcessAfterReferral);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotPermittedToCardholder"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmNotPermittedToCardholder
	 * ResultDetail4Code.mmNotPermittedToCardholder}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmNotPermittedToCardholder = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotPermittedToCardholder";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmNotPermittedToCardholder);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalDoesNotMatch"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOriginalDoesNotMatch
	 * ResultDetail4Code.mmOriginalDoesNotMatch}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOriginalDoesNotMatch = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalDoesNotMatch";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmOriginalDoesNotMatch);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOtherError
	 * ResultDetail4Code.mmOtherError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOtherError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmOtherError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfBalance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOutOfBalance
	 * ResultDetail4Code.mmOutOfBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOutOfBalance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfBalance";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmOutOfBalance);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfSequence"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmOutOfSequence
	 * ResultDetail4Code.mmOutOfSequence}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmOutOfSequence = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfSequence";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmOutOfSequence);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINChangeRequired"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINChangeRequired
	 * ResultDetail4Code.mmPINChangeRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPINChangeRequired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINChangeRequired";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmPINChangeRequired);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINDataRequired"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINDataRequired
	 * ResultDetail4Code.mmPINDataRequired}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPINDataRequired = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINDataRequired";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmPINDataRequired);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINSecurityError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINSecurityError
	 * ResultDetail4Code.mmPINSecurityError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPINSecurityError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINSecurityError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmPINSecurityError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINTriesExceeded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINTriesExceeded
	 * ResultDetail4Code.mmPINTriesExceeded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPINTriesExceeded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINTriesExceeded";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmPINTriesExceeded);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PINEncryptionError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmPINEncryptionError
	 * ResultDetail4Code.mmPINEncryptionError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmPINEncryptionError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PINEncryptionError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmPINEncryptionError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QueueMaximumExceeded"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmQueueMaximumExceeded
	 * ResultDetail4Code.mmQueueMaximumExceeded}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmQueueMaximumExceeded = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QueueMaximumExceeded";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmQueueMaximumExceeded);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecurringDataError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmRecurringDataError
	 * ResultDetail4Code.mmRecurringDataError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRecurringDataError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecurringDataError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmRecurringDataError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictedCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmRestrictedCard
	 * ResultDetail4Code.mmRestrictedCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmRestrictedCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictedCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmRestrictedCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityViolation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSecurityViolation
	 * ResultDetail4Code.mmSecurityViolation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecurityViolation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityViolation";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSecurityViolation);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ServiceNotEnabled"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmServiceNotEnabled
	 * ResultDetail4Code.mmServiceNotEnabled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmServiceNotEnabled = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ServiceNotEnabled";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmServiceNotEnabled);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SoftwareOrHardwareError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSoftwareOrHardwareError
	 * ResultDetail4Code.mmSoftwareOrHardwareError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSoftwareOrHardwareError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SoftwareOrHardwareError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSoftwareOrHardwareError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConditions"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSpecialConditions
	 * ResultDetail4Code.mmSpecialConditions}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSpecialConditions = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpecialConditions";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSpecialConditions);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StolenCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmStolenCard
	 * ResultDetail4Code.mmStolenCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmStolenCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StolenCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmStolenCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurchargeNotPermitted"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSurchargeNotPermitted
	 * ResultDetail4Code.mmSurchargeNotPermitted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSurchargeNotPermitted = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurchargeNotPermitted";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSurchargeNotPermitted);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedCounterfeitCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSuspectedCounterfeitCard
	 * ResultDetail4Code.mmSuspectedCounterfeitCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedCounterfeitCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedCounterfeitCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSuspectedCounterfeitCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuspectedFraud"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSuspectedFraud
	 * ResultDetail4Code.mmSuspectedFraud}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSuspectedFraud = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SuspectedFraud";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSuspectedFraud);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemInoperative"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSystemInoperative
	 * ResultDetail4Code.mmSystemInoperative}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSystemInoperative = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemInoperative";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSystemInoperative);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemMalfunction"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmSystemMalfunction
	 * ResultDetail4Code.mmSystemMalfunction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSystemMalfunction = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemMalfunction";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmSystemMalfunction);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminalNotConfigured"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTerminalNotConfigured
	 * ResultDetail4Code.mmTerminalNotConfigured}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTerminalNotConfigured = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminalNotConfigured";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmTerminalNotConfigured);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ToAccountError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmToAccountError
	 * ResultDetail4Code.mmToAccountError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmToAccountError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ToAccountError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmToAccountError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsNotAvailable"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTotalsNotAvailable
	 * ResultDetail4Code.mmTotalsNotAvailable}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTotalsNotAvailable = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsNotAvailable";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmTotalsNotAvailable);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDidNotComplete"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTransactionDidNotComplete
	 * ResultDetail4Code.mmTransactionDidNotComplete}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTransactionDidNotComplete = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDidNotComplete";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmTransactionDidNotComplete);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDuplicate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmTransactionDuplicate
	 * ResultDetail4Code.mmTransactionDuplicate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmTransactionDuplicate = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDuplicate";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmTransactionDuplicate);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToFindOriginal"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnableToFindOriginal
	 * ResultDetail4Code.mmUnableToFindOriginal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToFindOriginal = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToFindOriginal";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUnableToFindOriginal);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToGoOnLine"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnableToGoOnLine
	 * ResultDetail4Code.mmUnableToGoOnLine}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToGoOnLine = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToGoOnLine";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUnableToGoOnLine);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnableToProcessOffLine"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnableToProcessOffLine
	 * ResultDetail4Code.mmUnableToProcessOffLine}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnableToProcessOffLine = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnableToProcessOffLine";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUnableToProcessOffLine);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnacceptableCurrency"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnacceptableCurrency
	 * ResultDetail4Code.mmUnacceptableCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnacceptableCurrency = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnacceptableCurrency";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUnacceptableCurrency);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnavailablecommunicationKey"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnavailablecommunicationKey
	 * ResultDetail4Code.mmUnavailablecommunicationKey}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnavailablecommunicationKey = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnavailablecommunicationKey";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUnavailablecommunicationKey);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UneffectiveCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUneffectiveCard
	 * ResultDetail4Code.mmUneffectiveCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUneffectiveCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UneffectiveCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUneffectiveCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnsupportedService"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmUnsupportedService
	 * ResultDetail4Code.mmUnsupportedService}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmUnsupportedService = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnsupportedService";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmUnsupportedService);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorFormatError"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmVendorFormatError
	 * ResultDetail4Code.mmVendorFormatError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVendorFormatError = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorFormatError";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmVendorFormatError);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VendorNotFound"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmVendorNotFound
	 * ResultDetail4Code.mmVendorNotFound}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmVendorNotFound = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VendorNotFound";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmVendorNotFound);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalAmountLimit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmWithdrawalAmountLimit
	 * ResultDetail4Code.mmWithdrawalAmountLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalAmountLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalAmountLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmWithdrawalAmountLimit);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithdrawalNumberLimit"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmWithdrawalNumberLimit
	 * ResultDetail4Code.mmWithdrawalNumberLimit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWithdrawalNumberLimit = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithdrawalNumberLimit";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmWithdrawalNumberLimit);
			owner_lazy = () -> ResultDetail2Code.mmObject();
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongCard"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ResultDetail4Code#mmWrongCard
	 * ResultDetail4Code.mmWrongCard}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmWrongCard = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongCard";
			nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmWrongCard);
			owner_lazy = () -> ResultDetail2Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResultDetail2Code";
				definition = "Detail of the response to an ATM.";
				nextVersions_lazy = () -> Arrays.asList(ResultDetail4Code.mmObject());
				code_lazy = () -> Arrays.asList(ResultDetail2Code.mmAccountNotFound, ResultDetail2Code.mmAcquirerNotSupported, ResultDetail2Code.mmAMLValidation, ResultDetail2Code.mmAmountNotFound, ResultDetail2Code.mmAuthenticationFailed,
						ResultDetail2Code.mmBankNotFound, ResultDetail2Code.mmCardError, ResultDetail2Code.mmCardVerificationFailed, ResultDetail2Code.mmClosedAccount, ResultDetail2Code.mmCutoverInProcess,
						ResultDetail2Code.mmDatabaseError, ResultDetail2Code.mmDisputedFees, ResultDetail2Code.mmExceededTransactionLifeCycle, ResultDetail2Code.mmDepositAmountLimit, ResultDetail2Code.mmDepositNumberLimit,
						ResultDetail2Code.mmExpiredCard, ResultDetail2Code.mmFallbackDeclined, ResultDetail2Code.mmFormatError, ResultDetail2Code.mmInProgress, ResultDetail2Code.mmInsufficientFunds, ResultDetail2Code.mmInvalidAcceptor,
						ResultDetail2Code.mmInvalidAmount, ResultDetail2Code.mmInvalidAddress, ResultDetail2Code.mmInvalidBranch, ResultDetail2Code.mmInvalidCardholderIdentification, ResultDetail2Code.mmInvalidCardNumber,
						ResultDetail2Code.mmInvalidCertificate, ResultDetail2Code.mmInvalidOriginalAmount, ResultDetail2Code.mmInvalidPIN, ResultDetail2Code.mmInvalidToken, ResultDetail2Code.mmInvalidSignature,
						ResultDetail2Code.mmInvalidTokenIdentification, ResultDetail2Code.mmInvalidTransaction, ResultDetail2Code.mmInvalidTransactionDateTime, ResultDetail2Code.mmIssuerInoperative, ResultDetail2Code.mmIssuerNotFound,
						ResultDetail2Code.mmIssuerSignedOff, ResultDetail2Code.mmIssuerTimeOut, ResultDetail2Code.mmIssuerUnavailable, ResultDetail2Code.mmKeyStorageSaturation, ResultDetail2Code.mmLiabilityAccepted,
						ResultDetail2Code.mmLostCard, ResultDetail2Code.mmMACError, ResultDetail2Code.mmMACKeyError, ResultDetail2Code.mmMissingICCData, ResultDetail2Code.mmNewPINInvalid, ResultDetail2Code.mmNoCardRecord,
						ResultDetail2Code.mmNoLiabilityAccepted, ResultDetail2Code.mmNotAbleToValidatePIN, ResultDetail2Code.mmNotPermittedToAcceptor, ResultDetail2Code.mmOffLineProcess, ResultDetail2Code.mmOffLineProcessAfterReferral,
						ResultDetail2Code.mmNotPermittedToCardholder, ResultDetail2Code.mmOriginalDoesNotMatch, ResultDetail2Code.mmOtherError, ResultDetail2Code.mmOutOfBalance, ResultDetail2Code.mmOutOfSequence,
						ResultDetail2Code.mmPINChangeRequired, ResultDetail2Code.mmPINDataRequired, ResultDetail2Code.mmPINSecurityError, ResultDetail2Code.mmPINTriesExceeded, ResultDetail2Code.mmPINEncryptionError,
						ResultDetail2Code.mmQueueMaximumExceeded, ResultDetail2Code.mmRecurringDataError, ResultDetail2Code.mmRestrictedCard, ResultDetail2Code.mmSecurityViolation, ResultDetail2Code.mmServiceNotEnabled,
						ResultDetail2Code.mmSoftwareOrHardwareError, ResultDetail2Code.mmSpecialConditions, ResultDetail2Code.mmStolenCard, ResultDetail2Code.mmSurchargeNotPermitted, ResultDetail2Code.mmSuspectedCounterfeitCard,
						ResultDetail2Code.mmSuspectedFraud, ResultDetail2Code.mmSystemInoperative, ResultDetail2Code.mmSystemMalfunction, ResultDetail2Code.mmTerminalNotConfigured, ResultDetail2Code.mmToAccountError,
						ResultDetail2Code.mmTotalsNotAvailable, ResultDetail2Code.mmTransactionDidNotComplete, ResultDetail2Code.mmTransactionDuplicate, ResultDetail2Code.mmUnableToFindOriginal, ResultDetail2Code.mmUnableToGoOnLine,
						ResultDetail2Code.mmUnableToProcessOffLine, ResultDetail2Code.mmUnacceptableCurrency, ResultDetail2Code.mmUnavailablecommunicationKey, ResultDetail2Code.mmUneffectiveCard, ResultDetail2Code.mmUnsupportedService,
						ResultDetail2Code.mmVendorFormatError, ResultDetail2Code.mmVendorNotFound, ResultDetail2Code.mmWithdrawalAmountLimit, ResultDetail2Code.mmWithdrawalNumberLimit, ResultDetail2Code.mmWrongCard);
				trace_lazy = () -> ResultDetailCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}