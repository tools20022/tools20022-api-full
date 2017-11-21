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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of process related to a specific message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAuthorisationRequest
 * MessageFunctionCode.mmAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAuthorisationResponse
 * MessageFunctionCode.mmAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialAuthorisationRequest
 * MessageFunctionCode.mmFinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialAuthorisationResponse
 * MessageFunctionCode.mmFinancialAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCompletionAdvice
 * MessageFunctionCode.mmCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCompletionAdviceResponse
 * MessageFunctionCode.mmCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialCompletionAdvice
 * MessageFunctionCode.mmFinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialCompletionAdviceResponse
 * MessageFunctionCode.mmFinancialCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmReversalAdvice
 * MessageFunctionCode.mmReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmReversalAdviceResponse
 * MessageFunctionCode.mmReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialReversalAdvice
 * MessageFunctionCode.mmFinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialReversalAdviceResponse
 * MessageFunctionCode.mmFinancialReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCancellationRequest
 * MessageFunctionCode.mmCancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCancellationResponse
 * MessageFunctionCode.mmCancellationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCancellationAdvice
 * MessageFunctionCode.mmCancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCancellationAdviceResponse
 * MessageFunctionCode.mmCancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmDiagnosticRequest
 * MessageFunctionCode.mmDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmDiagnosticResponse
 * MessageFunctionCode.mmDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmReconciliationRequest
 * MessageFunctionCode.mmReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmReconciliationResponse
 * MessageFunctionCode.mmReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmBatchTransfer
 * MessageFunctionCode.mmBatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmRejection
 * MessageFunctionCode.mmRejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmResponse
 * MessageFunctionCode.mmResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmRequest
 * MessageFunctionCode.mmRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCurrencyConversionRequest
 * MessageFunctionCode.mmCurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCurrencyConversionResponse
 * MessageFunctionCode.mmCurrencyConversionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReconciliationAdvice
 * MessageFunctionCode.mmAcquirerReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReconciliationAdviceResponse
 * MessageFunctionCode.mmAcquirerReconciliationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReconciliationNotification
 * MessageFunctionCode.mmAcquirerReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReconciliationRequest
 * MessageFunctionCode.mmAcquirerReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReconciliationResponse
 * MessageFunctionCode.mmAcquirerReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReject
 * MessageFunctionCode.mmAcquirerReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAgentReconciliationAdvice
 * MessageFunctionCode.mmAgentReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAgentReconciliationAdviceResponse
 * MessageFunctionCode.mmAgentReconciliationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAgentReconciliationNotification
 * MessageFunctionCode.mmAgentReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAgentReconciliationRequest
 * MessageFunctionCode.mmAgentReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAgentReconciliationResponse
 * MessageFunctionCode.mmAgentReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAgentReject
 * MessageFunctionCode.mmAgentReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAuthorisationAdvice
 * MessageFunctionCode.mmAuthorisationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAuthorisationAdviceResponse
 * MessageFunctionCode.mmAuthorisationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAuthorisationNotification
 * MessageFunctionCode.mmAuthorisationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialAdvice
 * MessageFunctionCode.mmFinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialAdviceResponse
 * MessageFunctionCode.mmFinancialAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialNotification
 * MessageFunctionCode.mmFinancialNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialRequest
 * MessageFunctionCode.mmFinancialRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmFinancialResponse
 * MessageFunctionCode.mmFinancialResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmIssuerReconciliationAdvice
 * MessageFunctionCode.mmIssuerReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmIssuerReconciliationAdviceResponse
 * MessageFunctionCode.mmIssuerReconciliationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmIssuerReconciliationNotification
 * MessageFunctionCode.mmIssuerReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmIssuerReconciliationRequest
 * MessageFunctionCode.mmIssuerReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmIssuerReconciliationResponse
 * MessageFunctionCode.mmIssuerReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmIssuerReject
 * MessageFunctionCode.mmIssuerReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmNetworkManagementAdvice
 * MessageFunctionCode.mmNetworkManagementAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmNetworkManagementAdviceResponse
 * MessageFunctionCode.mmNetworkManagementAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmNetworkManagementRequest
 * MessageFunctionCode.mmNetworkManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmNetworkManagementResponse
 * MessageFunctionCode.mmNetworkManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmKeyExchangeAdvice
 * MessageFunctionCode.mmKeyExchangeAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmKeyExchangeAdviceResponse
 * MessageFunctionCode.mmKeyExchangeAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmKeyExchangeRequest
 * MessageFunctionCode.mmKeyExchangeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmKeyExchangeResponse
 * MessageFunctionCode.mmKeyExchangeResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReversalAdvice
 * MessageFunctionCode.mmAcquirerReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReversalAdviceResponse
 * MessageFunctionCode.mmAcquirerReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReversalNotification
 * MessageFunctionCode.mmAcquirerReversalNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReversalRequest
 * MessageFunctionCode.mmAcquirerReversalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcquirerReversalResponse
 * MessageFunctionCode.mmAcquirerReversalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMBalance
 * MessageFunctionCode.mmATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMCompletionAdvice
 * MessageFunctionCode.mmATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMCompletionAcknowledgement
 * MessageFunctionCode.mmATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMControl
 * MessageFunctionCode.mmATMControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDeviceControl
 * MessageFunctionCode.mmATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDiagnosticRequest
 * MessageFunctionCode.mmATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDiagnosticResponse
 * MessageFunctionCode.mmATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMGlobalStatus
 * MessageFunctionCode.mmATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMInquiryRequest
 * MessageFunctionCode.mmATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMInquiryResponse
 * MessageFunctionCode.mmATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMKeyDownloadRequest
 * MessageFunctionCode.mmATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMPINManagementResponse
 * MessageFunctionCode.mmATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMPINManagementRequest
 * MessageFunctionCode.mmATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMKeyDownloadResponse
 * MessageFunctionCode.mmATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMRequestReject
 * MessageFunctionCode.mmATMRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMResponseReject
 * MessageFunctionCode.mmATMResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMWithdrawalRequest
 * MessageFunctionCode.mmATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMWithdrawalResponse
 * MessageFunctionCode.mmATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMWithdrawalAdvice
 * MessageFunctionCode.mmATMWithdrawalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMWithdrawalAknowledgement
 * MessageFunctionCode.mmATMWithdrawalAknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCountersInquiry
 * MessageFunctionCode.mmCountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmHostToATMRequest
 * MessageFunctionCode.mmHostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmHostToATMAcknowledgement
 * MessageFunctionCode.mmHostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMOperation
 * MessageFunctionCode.mmATMOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmSecurityControl
 * MessageFunctionCode.mmSecurityControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmSecurityDetails
 * MessageFunctionCode.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmSecurityKeyCompletion
 * MessageFunctionCode.mmSecurityKeyCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmSecurityKeyStatus
 * MessageFunctionCode.mmSecurityKeyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcceptorRequestReject
 * MessageFunctionCode.mmAcceptorRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmAcceptorResponseReject
 * MessageFunctionCode.mmAcceptorResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDepositRequest
 * MessageFunctionCode.mmATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDepositResponse
 * MessageFunctionCode.mmATMDepositResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDepositCompletionAdvice
 * MessageFunctionCode.mmATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMDepositCompletionAcknowledgement
 * MessageFunctionCode.mmATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMExceptionAdvice
 * MessageFunctionCode.mmATMExceptionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMExceptionAcknowledgement
 * MessageFunctionCode.mmATMExceptionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMTransferRequest
 * MessageFunctionCode.mmATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmATMTransferResponse
 * MessageFunctionCode.mmATMTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCountersReport
 * MessageFunctionCode.mmCountersReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCurrencyConversionAdvice
 * MessageFunctionCode.mmCurrencyConversionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#mmCurrencyConversionAdviceResponse
 * MessageFunctionCode.mmCurrencyConversionAdviceResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction3Code
 * MessageFunction3Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction1Code
 * MessageFunction1Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction2Code
 * MessageFunction2Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction4Code
 * MessageFunction4Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction6Code
 * MessageFunction6Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction5Code
 * MessageFunction5Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction7Code
 * MessageFunction7Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction8Code
 * MessageFunction8Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction9Code
 * MessageFunction9Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction10Code
 * MessageFunction10Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction11Code
 * MessageFunction11Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction12Code
 * MessageFunction12Code}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction13Code
 * MessageFunction13Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AUTQ"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MessageFunctionCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of process related to a specific message."</li>
 * </ul>
 */
public class MessageFunctionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * The initiator requests an authorisation without financial impact to
	 * complete the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The initiator requests an authorisation without financial impact to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisationRequest";
			definition = "The initiator requests an authorisation without financial impact to complete the transaction.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "AUTQ";
		}
	};
	/**
	 * Response for authorisation without financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response for authorisation without financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisationResponse";
			definition = "Response for authorisation without financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "AUTP";
		}
	};
	/**
	 * Request for authorisation with financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAUQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for authorisation with financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialAuthorisationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAuthorisationRequest";
			definition = "Request for authorisation with financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FAUQ";
		}
	};
	/**
	 * Response for authorisation with financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FAUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response for authorisation with financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialAuthorisationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAuthorisationResponse";
			definition = "Response for authorisation with financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FAUP";
		}
	};
	/**
	 * Advice for completion without financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice for completion without financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmCompletionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompletionAdvice";
			definition = "Advice for completion without financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CMPV";
		}
	};
	/**
	 * Advice response for completion without financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice response for completion without financial capture."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCompletionAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompletionAdviceResponse";
			definition = "Advice response for completion without financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CMPK";
		}
	};
	/**
	 * Advice for completion with financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCMV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice for completion with financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialCompletionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCompletionAdvice";
			definition = "Advice for completion with financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FCMV";
		}
	};
	/**
	 * Advice response for completion with financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCMK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice response for completion with financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialCompletionAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCompletionAdviceResponse";
			definition = "Advice response for completion with financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FCMK";
		}
	};
	/**
	 * Advice for reversal without financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVRA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice for reversal without financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalAdvice";
			definition = "Advice for reversal without financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RVRA";
		}
	};
	/**
	 * Advice response for reversal without financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RVRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice response for reversal without financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmReversalAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalAdviceResponse";
			definition = "Advice response for reversal without financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RVRR";
		}
	};
	/**
	 * Advice for reversal with financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRVA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice for reversal with financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialReversalAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialReversalAdvice";
			definition = "Advice for reversal with financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FRVA";
		}
	};
	/**
	 * Advice response for reversal with financial capture.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FRVR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice response for reversal with financial capture."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialReversalAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialReversalAdviceResponse";
			definition = "Advice response for reversal with financial capture.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FRVR";
		}
	};
	/**
	 * Request for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for cancellation."</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequest";
			definition = "Request for cancellation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CCAQ";
		}
	};
	/**
	 * Response for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response for cancellation."</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationResponse";
			definition = "Response for cancellation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CCAP";
		}
	};
	/**
	 * Advice for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice for cancellation."</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationAdvice";
			definition = "Advice for cancellation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CCAV";
		}
	};
	/**
	 * Advice response for cancellation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CCAK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice response for cancellation."</li>
	 * </ul>
	 */
	public static final MMCode mmCancellationAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationAdviceResponse";
			definition = "Advice response for cancellation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CCAK";
		}
	};
	/**
	 * Request for diagnostic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGNP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for diagnostic."</li>
	 * </ul>
	 */
	public static final MMCode mmDiagnosticRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiagnosticRequest";
			definition = "Request for diagnostic.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DGNP";
		}
	};
	/**
	 * Response for diagnostic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGNQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response for diagnostic."</li>
	 * </ul>
	 */
	public static final MMCode mmDiagnosticResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiagnosticResponse";
			definition = "Response for diagnostic.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DGNQ";
		}
	};
	/**
	 * Request for reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCLQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for reconciliation."</li>
	 * </ul>
	 */
	public static final MMCode mmReconciliationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationRequest";
			definition = "Request for reconciliation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCLQ";
		}
	};
	/**
	 * Response for reconciliation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCLP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response for reconciliation."</li>
	 * </ul>
	 */
	public static final MMCode mmReconciliationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationResponse";
			definition = "Response for reconciliation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCLP";
		}
	};
	/**
	 * Transfer the financial data as a collection of transction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transfer the financial data as a collection of transction."</li>
	 * </ul>
	 */
	public static final MMCode mmBatchTransfer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BatchTransfer";
			definition = "Transfer the financial data as a collection of transction.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "BTCH";
		}
	};
	/**
	 * Reject a request or an advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejection"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reject a request or an advice."</li>
	 * </ul>
	 */
	public static final MMCode mmRejection = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejection";
			definition = "Reject a request or an advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RJCT";
		}
	};
	/**
	 * Message function is a response.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RESP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message function is a response."</li>
	 * </ul>
	 */
	public static final MMCode mmResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Message function is a response.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RESP";
		}
	};
	/**
	 * Message function is a request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Request"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message function is a request."</li>
	 * </ul>
	 */
	public static final MMCode mmRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Request";
			definition = "Message function is a request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REQU";
		}
	};
	/**
	 * Request for dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyConversionRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			definition = "Request for dynamic currency conversion.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DCCQ";
		}
	};
	/**
	 * Response from a dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response from a dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyConversionResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			definition = "Response from a dynamic currency conversion.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DCCP";
		}
	};
	/**
	 * Advice of transaction totals from an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice of transaction totals from an acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReconciliationAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationAdvice";
			definition = "Advice of transaction totals from an acquirer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCAV";
		}
	};
	/**
	 * Acknowledgement from an issuer or a processor of an acquirer
	 * reconciliation advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCAK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement from an issuer or a processor of an acquirer reconciliation advice."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReconciliationAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationAdviceResponse";
			definition = "Acknowledgement from an issuer or a processor of an acquirer reconciliation advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCAK";
		}
	};
	/**
	 * Notification of transaction totals from an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notification of transaction totals from an acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReconciliationNotification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationNotification";
			definition = "Notification of transaction totals from an acquirer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCAN";
		}
	};
	/**
	 * Request of transaction totals exchange from an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request of transaction totals exchange from an acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReconciliationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationRequest";
			definition = "Request of transaction totals exchange from an acquirer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCAQ";
		}
	};
	/**
	 * Response from an issuer or a processor to an acquirer reconciliation
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response from an issuer or a processor to an acquirer reconciliation request."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReconciliationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationResponse";
			definition = "Response from an issuer or a processor to an acquirer reconciliation request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCAP";
		}
	};
	/**
	 * Reject of a message by an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reject of a message by an acquirer."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReject";
			definition = "Reject of a message by an acquirer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REJA";
		}
	};
	/**
	 * Advice of transaction totals from a processor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice of transaction totals from a processor."</li>
	 * </ul>
	 */
	public static final MMCode mmAgentReconciliationAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationAdvice";
			definition = "Advice of transaction totals from a processor.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCPV";
		}
	};
	/**
	 * Acknowledgement from an issuer or an acquirer of a processor
	 * reconciliation advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement from an issuer or an acquirer of a processor reconciliation advice."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAgentReconciliationAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationAdviceResponse";
			definition = "Acknowledgement from an issuer or an acquirer of a processor reconciliation advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCPK";
		}
	};
	/**
	 * Notification of transaction totals from a processor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notification of transaction totals from a processor."</li>
	 * </ul>
	 */
	public static final MMCode mmAgentReconciliationNotification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationNotification";
			definition = "Notification of transaction totals from a processor.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCPN";
		}
	};
	/**
	 * Request of transaction totals exchange from a processor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request of transaction totals exchange from a processor."</li>
	 * </ul>
	 */
	public static final MMCode mmAgentReconciliationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationRequest";
			definition = "Request of transaction totals exchange from a processor.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCPQ";
		}
	};
	/**
	 * Response from an issuer or an acquirer to a processor reconciliation
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response from an issuer or an acquirer to a processor reconciliation request."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAgentReconciliationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationResponse";
			definition = "Response from an issuer or an acquirer to a processor reconciliation request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCPP";
		}
	};
	/**
	 * Reject of a message by an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reject of a message by an agent."</li>
	 * </ul>
	 */
	public static final MMCode mmAgentReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReject";
			definition = "Reject of a message by an agent.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REJP";
		}
	};
	/**
	 * Initiator of the message advises the recipient about the result of an
	 * authorisation already performed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator of the message advises the recipient about the result of an authorisation already performed."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisationAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationAdvice";
			definition = "Initiator of the message advises the recipient about the result of an authorisation already performed.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "AUTV";
		}
	};
	/**
	 * Response to an AuthorisationAdvice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to an AuthorisationAdvice."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisationAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationAdviceResponse";
			definition = "Response to an AuthorisationAdvice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "AUTK";
		}
	};
	/**
	 * Information about an authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "AUTN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about an authorisation."</li>
	 * </ul>
	 */
	public static final MMCode mmAuthorisationNotification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationNotification";
			definition = "Information about an authorisation.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "AUTN";
		}
	};
	/**
	 * Initiator of the message advises the receptor that an authorisation has
	 * been successfully delivered or completed with a final amount, and
	 * requests the clearing of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator of the message advises the receptor that an authorisation has been successfully delivered or completed with a final amount, and requests the clearing of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFinancialAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Initiator of the message advises the receptor that an authorisation has been successfully delivered or completed with a final amount, and requests the clearing of the transaction.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FNCV";
		}
	};
	/**
	 * Response to a FinancialAdvice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNCK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a FinancialAdvice."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdviceResponse";
			definition = "Response to a FinancialAdvice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FNCK";
		}
	};
	/**
	 * Initiator requests the clearing of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNCN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Initiator requests the clearing of the transaction. "</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialNotification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialNotification";
			definition = "Initiator requests the clearing of the transaction. ";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FNCN";
		}
	};
	/**
	 * Initiator of the message requests both the authorisation and the clearing
	 * of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Initiator of the message requests both the authorisation and the clearing of the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmFinancialRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialRequest";
			definition = "Initiator of the message requests both the authorisation and the clearing of the transaction.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FNCQ";
		}
	};
	/**
	 * Response to a FinancialRequest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FNCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a FinancialRequest."</li>
	 * </ul>
	 */
	public static final MMCode mmFinancialResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialResponse";
			definition = "Response to a FinancialRequest.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "FNCP";
		}
	};
	/**
	 * Advice of transaction totals from an issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice of transaction totals from an issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerReconciliationAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationAdvice";
			definition = "Advice of transaction totals from an issuer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCIV";
		}
	};
	/**
	 * Acknowledgement from an acquirer or a processor of an issuer
	 * reconciliation advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement from an acquirer or a processor of an issuer reconciliation advice."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerReconciliationAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationAdviceResponse";
			definition = "Acknowledgement from an acquirer or a processor of an issuer reconciliation advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCIK";
		}
	};
	/**
	 * Notification of transaction totals from an issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notification of transaction totals from an issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerReconciliationNotification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationNotification";
			definition = "Notification of transaction totals from an issuer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCIN";
		}
	};
	/**
	 * Request of transaction totals exchange from an issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request of transaction totals exchange from an issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerReconciliationRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationRequest";
			definition = "Request of transaction totals exchange from an issuer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCIQ";
		}
	};
	/**
	 * Response from an acquirer or a processor to an issuer reconciliation
	 * request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Response from an acquirer or a processor to an issuer reconciliation request."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmIssuerReconciliationResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationResponse";
			definition = "Response from an acquirer or a processor to an issuer reconciliation request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RCIP";
		}
	};
	/**
	 * Reject of a message by an issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REJI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reject of a message by an issuer."</li>
	 * </ul>
	 */
	public static final MMCode mmIssuerReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReject";
			definition = "Reject of a message by an issuer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REJI";
		}
	};
	/**
	 * Advise of a performed network management service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advise of a performed network management service."</li>
	 * </ul>
	 */
	public static final MMCode mmNetworkManagementAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementAdvice";
			definition = "Advise of a performed network management service.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "MGTV";
		}
	};
	/**
	 * Response to a NetworkManagementAdvice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGTK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a NetworkManagementAdvice."</li>
	 * </ul>
	 */
	public static final MMCode mmNetworkManagementAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementAdviceResponse";
			definition = "Response to a NetworkManagementAdvice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "MGTK";
		}
	};
	/**
	 * Request of a network management service.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGTQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request of a network management service."</li>
	 * </ul>
	 */
	public static final MMCode mmNetworkManagementRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementRequest";
			definition = "Request of a network management service.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "MGTQ";
		}
	};
	/**
	 * Response to a NetworkManagementRequest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MGTP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a NetworkManagementRequest."</li>
	 * </ul>
	 */
	public static final MMCode mmNetworkManagementResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementResponse";
			definition = "Response to a NetworkManagementRequest.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "MGTP";
		}
	};
	/**
	 * Advise of a performed key update.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advise of a performed key update."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyExchangeAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeAdvice";
			definition = "Advise of a performed key update.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "KEYV";
		}
	};
	/**
	 * Response to a KeyExchangeAdvice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a KeyExchangeAdvice."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyExchangeAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeAdviceResponse";
			definition = "Response to a KeyExchangeAdvice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "KEYK";
		}
	};
	/**
	 * Request of a key exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request of a key exchange."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyExchangeRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeRequest";
			definition = "Request of a key exchange.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "KEYQ";
		}
	};
	/**
	 * Response to a KeyExchangeRequest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KEYP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a KeyExchangeRequest."</li>
	 * </ul>
	 */
	public static final MMCode mmKeyExchangeResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeResponse";
			definition = "Response to a KeyExchangeRequest.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "KEYP";
		}
	};
	/**
	 * Reversal advice of an authorisation or a financial message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reversal advice of an authorisation or a financial message."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReversalAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalAdvice";
			definition = "Reversal advice of an authorisation or a financial message.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REVV";
		}
	};
	/**
	 * Response to a reversal advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a reversal advice."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReversalAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalAdviceResponse";
			definition = "Response to a reversal advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REVK";
		}
	};
	/**
	 * Reversal notification of an authorisation or a financial message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalNotification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reversal notification of an authorisation or a financial message."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReversalNotification = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalNotification";
			definition = "Reversal notification of an authorisation or a financial message.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REVN";
		}
	};
	/**
	 * Reversal request of an authorisation or a financial message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reversal request of an authorisation or a financial message."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReversalRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalRequest";
			definition = "Reversal request of an authorisation or a financial message.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REVQ";
		}
	};
	/**
	 * Response to a reversal request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REVP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a reversal request."</li>
	 * </ul>
	 */
	public static final MMCode mmAcquirerReversalResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalResponse";
			definition = "Response to a reversal request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "REVP";
		}
	};
	/**
	 * Provide the ATM counters resettting those that are applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BALN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide the ATM counters resettting those that are applicable."</li>
	 * </ul>
	 */
	public static final MMCode mmATMBalance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			definition = "Provide the ATM counters resettting those that are applicable.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "BALN";
		}
	};
	/**
	 * Advice of an ATM transaction completion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice of an ATM transaction completion."</li>
	 * </ul>
	 */
	public static final MMCode mmATMCompletionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAdvice";
			definition = "Advice of an ATM transaction completion.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CMPD";
		}
	};
	/**
	 * Acknowledgement of a completion advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMPA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgement of a completion advice."</li>
	 * </ul>
	 */
	public static final MMCode mmATMCompletionAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAcknowledgement";
			definition = "Acknowledgement of a completion advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CMPA";
		}
	};
	/**
	 * Global ATM commands.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACMD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global ATM commands."</li>
	 * </ul>
	 */
	public static final MMCode mmATMControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMControl";
			definition = "Global ATM commands.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "ACMD";
		}
	};
	/**
	 * Maintenance commands to perform.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDeviceControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance commands to perform."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDeviceControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDeviceControl";
			definition = "Maintenance commands to perform.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DVCC";
		}
	};
	/**
	 * Request for a diagnostic.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for a diagnostic."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDiagnosticRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticRequest";
			definition = "Request for a diagnostic.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DIAQ";
		}
	};
	/**
	 * Response to a diagnostic request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a diagnostic request."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDiagnosticResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticResponse";
			definition = "Response to a diagnostic request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DIAP";
		}
	};
	/**
	 * Global status of the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "GSTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMGlobalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Global status of the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmATMGlobalStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			definition = "Global status of the ATM.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "GSTS";
		}
	};
	/**
	 * Request for an inquiry.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMInquiryRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for an inquiry."</li>
	 * </ul>
	 */
	public static final MMCode mmATMInquiryRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryRequest";
			definition = "Request for an inquiry.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "INQQ";
		}
	};
	/**
	 * Response to an inquiry request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMInquiryResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to an inquiry request."</li>
	 * </ul>
	 */
	public static final MMCode mmATMInquiryResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryResponse";
			definition = "Response to an inquiry request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "INQP";
		}
	};
	/**
	 * Request for a key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for a key download."</li>
	 * </ul>
	 */
	public static final MMCode mmATMKeyDownloadRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadRequest";
			definition = "Request for a key download.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "KYAQ";
		}
	};
	/**
	 * Response to a cardholder PIN management request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMPINManagementResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a cardholder PIN management request."</li>
	 * </ul>
	 */
	public static final MMCode mmATMPINManagementResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementResponse";
			definition = "Response to a cardholder PIN management request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "PINP";
		}
	};
	/**
	 * Request for a cardholder PIN management.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMPINManagementRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for a cardholder PIN management."</li>
	 * </ul>
	 */
	public static final MMCode mmATMPINManagementRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementRequest";
			definition = "Request for a cardholder PIN management.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "PINQ";
		}
	};
	/**
	 * Response to a key download.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "KYAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a key download."</li>
	 * </ul>
	 */
	public static final MMCode mmATMKeyDownloadResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadResponse";
			definition = "Response to a key download.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "KYAP";
		}
	};
	/**
	 * Rejected request message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJAQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMRequestReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejected request message."</li>
	 * </ul>
	 */
	public static final MMCode mmATMRequestReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequestReject";
			definition = "Rejected request message.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RJAQ";
		}
	};
	/**
	 * Rejected response message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJAP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMResponseReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejected response message."</li>
	 * </ul>
	 */
	public static final MMCode mmATMResponseReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMResponseReject";
			definition = "Rejected response message.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RJAP";
		}
	};
	/**
	 * Request for a withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for a withdrawal transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalRequest";
			definition = "Request for a withdrawal transaction.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "WITQ";
		}
	};
	/**
	 * Response to a withdrawal transaction request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a withdrawal transaction request."</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalResponse";
			definition = "Response to a withdrawal transaction request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "WITP";
		}
	};
	/**
	 * Response of a withdrawal transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response of a withdrawal transaction."</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAdvice";
			definition = "Response of a withdrawal transaction.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "WITV";
		}
	};
	/**
	 * Acknowledgement of a withdrawal transaction advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WITK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalAknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgement of a withdrawal transaction advice."</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalAknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAknowledgement";
			definition = "Acknowledgement of a withdrawal transaction advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "WITK";
		}
	};
	/**
	 * Request the value of the ATM counters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INQC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request the value of the ATM counters."</li>
	 * </ul>
	 */
	public static final MMCode mmCountersInquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			definition = "Request the value of the ATM counters.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "INQC";
		}
	};
	/**
	 * Request from a host to an ATM to be contacted by this ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "H2AQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Request from a host to an ATM to be contacted by this ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmHostToATMRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMRequest";
			definition = "Request from a host to an ATM to be contacted by this ATM.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "H2AQ";
		}
	};
	/**
	 * Acknowledgement of a request from a host to an ATM for contacting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "H2AP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acknowledgement of a request from a host to an ATM for contacting."</li>
	 * </ul>
	 */
	public static final MMCode mmHostToATMAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMAcknowledgement";
			definition = "Acknowledgement of a request from a host to an ATM for contacting.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "H2AP";
		}
	};
	/**
	 * Logical or physical operation on the ATM.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TMOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Logical or physical operation on the ATM."</li>
	 * </ul>
	 */
	public static final MMCode mmATMOperation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMOperation";
			definition = "Logical or physical operation on the ATM.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "TMOP";
		}
	};
	/**
	 * Security Commands.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security Commands."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityControl";
			definition = "Security Commands.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "CSEC";
		}
	};
	/**
	 * Security detailed report.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSEC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Security detailed report."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Security detailed report.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DSEC";
		}
	};
	/**
	 * Result of the key download with the status of the downloaded keys
	 * including key check values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SKSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the key download with the status of the downloaded keys including key check values."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmSecurityKeyCompletion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyCompletion";
			definition = "Result of the key download with the status of the downloaded keys including key check values.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "SKSC";
		}
	};
	/**
	 * Status of cryptographic keys.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SSTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of cryptographic keys."</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityKeyStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyStatus";
			definition = "Status of cryptographic keys.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "SSTS";
		}
	};
	/**
	 * Reject of a request or an advice message by an acquirer or an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorRequestReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reject of a request or an advice message by an acquirer or an agent."</li>
	 * </ul>
	 */
	public static final MMCode mmAcceptorRequestReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorRequestReject";
			definition = "Reject of a request or an advice message by an acquirer or an agent.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RJCQ";
		}
	};
	/**
	 * Reject of a response or an advice response message by a card acceptor or
	 * an agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RJCP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcceptorResponseReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reject of a response or an advice response message by a card acceptor or an agent."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmAcceptorResponseReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorResponseReject";
			definition = "Reject of a response or an advice response message by a card acceptor or an agent.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RJCP";
		}
	};
	/**
	 * Request for a deposit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for a deposit."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositRequest";
			definition = "Request for a deposit.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DPSQ";
		}
	};
	/**
	 * Response to a deposit request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a deposit request."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositResponse";
			definition = "Response to a deposit request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DPSP";
		}
	};
	/**
	 * Advice of an ATM deposit transaction completion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice of an ATM deposit transaction completion."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositCompletionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAdvice";
			definition = "Advice of an ATM deposit transaction completion.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DPSV";
		}
	};
	/**
	 * Acknowledgement of a deposit completion advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DPSK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgement of a deposit completion advice."</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositCompletionAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAcknowledgement";
			definition = "Acknowledgement of a deposit completion advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DPSK";
		}
	};
	/**
	 * Advice of an ATM exception.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMExceptionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice of an ATM exception."</li>
	 * </ul>
	 */
	public static final MMCode mmATMExceptionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAdvice";
			definition = "Advice of an ATM exception.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "EXPV";
		}
	};
	/**
	 * Acknowledgement of an exception advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMExceptionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acknowledgement of an exception advice."</li>
	 * </ul>
	 */
	public static final MMCode mmATMExceptionAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAcknowledgement";
			definition = "Acknowledgement of an exception advice.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "EXPK";
		}
	};
	/**
	 * Request for a fund transfer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTransferRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Request for a fund transfer."</li>
	 * </ul>
	 */
	public static final MMCode mmATMTransferRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferRequest";
			definition = "Request for a fund transfer.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "TRFQ";
		}
	};
	/**
	 * Response to a fund transfer request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TRFP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTransferResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Response to a fund transfer request."</li>
	 * </ul>
	 */
	public static final MMCode mmATMTransferResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferResponse";
			definition = "Response to a fund transfer request.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "TRFP";
		}
	};
	/**
	 * Provide the value of the ATM counters, no reinitialisation of the
	 * counters.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RPTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provide the value of the ATM counters, no reinitialisation of the counters."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCountersReport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersReport";
			definition = "Provide the value of the ATM counters, no reinitialisation of the counters.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "RPTC";
		}
	};
	/**
	 * Advice for dynamic currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCAV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Advice for dynamic currency conversion."</li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyConversionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdvice";
			definition = "Advice for dynamic currency conversion.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DCAV";
		}
	};
	/**
	 * Advice response for the currency conversion from the service provider to
	 * the acceptor.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
	 * MessageFunctionCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DCRR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Advice response for the currency conversion from the service provider to the acceptor."
	 * </li>
	 * </ul>
	 */
	public static final MMCode mmCurrencyConversionAdviceResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdviceResponse";
			definition = "Advice response for the currency conversion from the service provider to the acceptor.";
			owner_lazy = () -> MessageFunctionCode.mmObject();
			codeName = "DCRR";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("AUTQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunctionCode";
				definition = "Type of process related to a specific message.";
				code_lazy = () -> Arrays.asList(MessageFunctionCode.mmAuthorisationRequest, MessageFunctionCode.mmAuthorisationResponse, MessageFunctionCode.mmFinancialAuthorisationRequest,
						MessageFunctionCode.mmFinancialAuthorisationResponse, MessageFunctionCode.mmCompletionAdvice, MessageFunctionCode.mmCompletionAdviceResponse, MessageFunctionCode.mmFinancialCompletionAdvice,
						MessageFunctionCode.mmFinancialCompletionAdviceResponse, MessageFunctionCode.mmReversalAdvice, MessageFunctionCode.mmReversalAdviceResponse, MessageFunctionCode.mmFinancialReversalAdvice,
						MessageFunctionCode.mmFinancialReversalAdviceResponse, MessageFunctionCode.mmCancellationRequest, MessageFunctionCode.mmCancellationResponse, MessageFunctionCode.mmCancellationAdvice,
						MessageFunctionCode.mmCancellationAdviceResponse, MessageFunctionCode.mmDiagnosticRequest, MessageFunctionCode.mmDiagnosticResponse, MessageFunctionCode.mmReconciliationRequest,
						MessageFunctionCode.mmReconciliationResponse, MessageFunctionCode.mmBatchTransfer, MessageFunctionCode.mmRejection, MessageFunctionCode.mmResponse, MessageFunctionCode.mmRequest,
						MessageFunctionCode.mmCurrencyConversionRequest, MessageFunctionCode.mmCurrencyConversionResponse, MessageFunctionCode.mmAcquirerReconciliationAdvice, MessageFunctionCode.mmAcquirerReconciliationAdviceResponse,
						MessageFunctionCode.mmAcquirerReconciliationNotification, MessageFunctionCode.mmAcquirerReconciliationRequest, MessageFunctionCode.mmAcquirerReconciliationResponse, MessageFunctionCode.mmAcquirerReject,
						MessageFunctionCode.mmAgentReconciliationAdvice, MessageFunctionCode.mmAgentReconciliationAdviceResponse, MessageFunctionCode.mmAgentReconciliationNotification, MessageFunctionCode.mmAgentReconciliationRequest,
						MessageFunctionCode.mmAgentReconciliationResponse, MessageFunctionCode.mmAgentReject, MessageFunctionCode.mmAuthorisationAdvice, MessageFunctionCode.mmAuthorisationAdviceResponse,
						MessageFunctionCode.mmAuthorisationNotification, MessageFunctionCode.mmFinancialAdvice, MessageFunctionCode.mmFinancialAdviceResponse, MessageFunctionCode.mmFinancialNotification,
						MessageFunctionCode.mmFinancialRequest, MessageFunctionCode.mmFinancialResponse, MessageFunctionCode.mmIssuerReconciliationAdvice, MessageFunctionCode.mmIssuerReconciliationAdviceResponse,
						MessageFunctionCode.mmIssuerReconciliationNotification, MessageFunctionCode.mmIssuerReconciliationRequest, MessageFunctionCode.mmIssuerReconciliationResponse, MessageFunctionCode.mmIssuerReject,
						MessageFunctionCode.mmNetworkManagementAdvice, MessageFunctionCode.mmNetworkManagementAdviceResponse, MessageFunctionCode.mmNetworkManagementRequest, MessageFunctionCode.mmNetworkManagementResponse,
						MessageFunctionCode.mmKeyExchangeAdvice, MessageFunctionCode.mmKeyExchangeAdviceResponse, MessageFunctionCode.mmKeyExchangeRequest, MessageFunctionCode.mmKeyExchangeResponse,
						MessageFunctionCode.mmAcquirerReversalAdvice, MessageFunctionCode.mmAcquirerReversalAdviceResponse, MessageFunctionCode.mmAcquirerReversalNotification, MessageFunctionCode.mmAcquirerReversalRequest,
						MessageFunctionCode.mmAcquirerReversalResponse, MessageFunctionCode.mmATMBalance, MessageFunctionCode.mmATMCompletionAdvice, MessageFunctionCode.mmATMCompletionAcknowledgement, MessageFunctionCode.mmATMControl,
						MessageFunctionCode.mmATMDeviceControl, MessageFunctionCode.mmATMDiagnosticRequest, MessageFunctionCode.mmATMDiagnosticResponse, MessageFunctionCode.mmATMGlobalStatus, MessageFunctionCode.mmATMInquiryRequest,
						MessageFunctionCode.mmATMInquiryResponse, MessageFunctionCode.mmATMKeyDownloadRequest, MessageFunctionCode.mmATMPINManagementResponse, MessageFunctionCode.mmATMPINManagementRequest,
						MessageFunctionCode.mmATMKeyDownloadResponse, MessageFunctionCode.mmATMRequestReject, MessageFunctionCode.mmATMResponseReject, MessageFunctionCode.mmATMWithdrawalRequest, MessageFunctionCode.mmATMWithdrawalResponse,
						MessageFunctionCode.mmATMWithdrawalAdvice, MessageFunctionCode.mmATMWithdrawalAknowledgement, MessageFunctionCode.mmCountersInquiry, MessageFunctionCode.mmHostToATMRequest,
						MessageFunctionCode.mmHostToATMAcknowledgement, MessageFunctionCode.mmATMOperation, MessageFunctionCode.mmSecurityControl, MessageFunctionCode.mmSecurityDetails, MessageFunctionCode.mmSecurityKeyCompletion,
						MessageFunctionCode.mmSecurityKeyStatus, MessageFunctionCode.mmAcceptorRequestReject, MessageFunctionCode.mmAcceptorResponseReject, MessageFunctionCode.mmATMDepositRequest, MessageFunctionCode.mmATMDepositResponse,
						MessageFunctionCode.mmATMDepositCompletionAdvice, MessageFunctionCode.mmATMDepositCompletionAcknowledgement, MessageFunctionCode.mmATMExceptionAdvice, MessageFunctionCode.mmATMExceptionAcknowledgement,
						MessageFunctionCode.mmATMTransferRequest, MessageFunctionCode.mmATMTransferResponse, MessageFunctionCode.mmCountersReport, MessageFunctionCode.mmCurrencyConversionAdvice,
						MessageFunctionCode.mmCurrencyConversionAdviceResponse);
				derivation_lazy = () -> Arrays.asList(MessageFunction3Code.mmObject(), MessageFunction1Code.mmObject(), MessageFunction2Code.mmObject(), MessageFunction4Code.mmObject(), MessageFunction6Code.mmObject(),
						MessageFunction5Code.mmObject(), MessageFunction7Code.mmObject(), MessageFunction8Code.mmObject(), MessageFunction9Code.mmObject(), MessageFunction10Code.mmObject(), MessageFunction11Code.mmObject(),
						MessageFunction12Code.mmObject(), MessageFunction13Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}