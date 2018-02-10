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
import com.tools20022.repository.codeset.MessageFunctionCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of process related to a specific message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AuthorisationRequest
 * MessageFunctionCode.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AuthorisationResponse
 * MessageFunctionCode.AuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialAuthorisationRequest
 * MessageFunctionCode.FinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialAuthorisationResponse
 * MessageFunctionCode.FinancialAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CompletionAdvice
 * MessageFunctionCode.CompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CompletionAdviceResponse
 * MessageFunctionCode.CompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialCompletionAdvice
 * MessageFunctionCode.FinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialCompletionAdviceResponse
 * MessageFunctionCode.FinancialCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ReversalAdvice
 * MessageFunctionCode.ReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ReversalAdviceResponse
 * MessageFunctionCode.ReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialReversalAdvice
 * MessageFunctionCode.FinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialReversalAdviceResponse
 * MessageFunctionCode.FinancialReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CancellationRequest
 * MessageFunctionCode.CancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CancellationResponse
 * MessageFunctionCode.CancellationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CancellationAdvice
 * MessageFunctionCode.CancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CancellationAdviceResponse
 * MessageFunctionCode.CancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#DiagnosticRequest
 * MessageFunctionCode.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#DiagnosticResponse
 * MessageFunctionCode.DiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ReconciliationRequest
 * MessageFunctionCode.ReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ReconciliationResponse
 * MessageFunctionCode.ReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#BatchTransfer
 * MessageFunctionCode.BatchTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#Rejection
 * MessageFunctionCode.Rejection}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#Response
 * MessageFunctionCode.Response}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#Request
 * MessageFunctionCode.Request}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CurrencyConversionRequest
 * MessageFunctionCode.CurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CurrencyConversionResponse
 * MessageFunctionCode.CurrencyConversionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReconciliationAdvice
 * MessageFunctionCode.AcquirerReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReconciliationAdviceResponse
 * MessageFunctionCode.AcquirerReconciliationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReconciliationNotification
 * MessageFunctionCode.AcquirerReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReconciliationRequest
 * MessageFunctionCode.AcquirerReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReconciliationResponse
 * MessageFunctionCode.AcquirerReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReject
 * MessageFunctionCode.AcquirerReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AgentReconciliationAdvice
 * MessageFunctionCode.AgentReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AgentReconciliationAdviceResponse
 * MessageFunctionCode.AgentReconciliationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AgentReconciliationNotification
 * MessageFunctionCode.AgentReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AgentReconciliationRequest
 * MessageFunctionCode.AgentReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AgentReconciliationResponse
 * MessageFunctionCode.AgentReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AgentReject
 * MessageFunctionCode.AgentReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AuthorisationAdvice
 * MessageFunctionCode.AuthorisationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AuthorisationAdviceResponse
 * MessageFunctionCode.AuthorisationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AuthorisationNotification
 * MessageFunctionCode.AuthorisationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialAdvice
 * MessageFunctionCode.FinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialAdviceResponse
 * MessageFunctionCode.FinancialAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialNotification
 * MessageFunctionCode.FinancialNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialRequest
 * MessageFunctionCode.FinancialRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#FinancialResponse
 * MessageFunctionCode.FinancialResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#IssuerReconciliationAdvice
 * MessageFunctionCode.IssuerReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#IssuerReconciliationAdviceResponse
 * MessageFunctionCode.IssuerReconciliationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#IssuerReconciliationNotification
 * MessageFunctionCode.IssuerReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#IssuerReconciliationRequest
 * MessageFunctionCode.IssuerReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#IssuerReconciliationResponse
 * MessageFunctionCode.IssuerReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#IssuerReject
 * MessageFunctionCode.IssuerReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#NetworkManagementAdvice
 * MessageFunctionCode.NetworkManagementAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#NetworkManagementAdviceResponse
 * MessageFunctionCode.NetworkManagementAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#NetworkManagementRequest
 * MessageFunctionCode.NetworkManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#NetworkManagementResponse
 * MessageFunctionCode.NetworkManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#KeyExchangeAdvice
 * MessageFunctionCode.KeyExchangeAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#KeyExchangeAdviceResponse
 * MessageFunctionCode.KeyExchangeAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#KeyExchangeRequest
 * MessageFunctionCode.KeyExchangeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#KeyExchangeResponse
 * MessageFunctionCode.KeyExchangeResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReversalAdvice
 * MessageFunctionCode.AcquirerReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReversalAdviceResponse
 * MessageFunctionCode.AcquirerReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReversalNotification
 * MessageFunctionCode.AcquirerReversalNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReversalRequest
 * MessageFunctionCode.AcquirerReversalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcquirerReversalResponse
 * MessageFunctionCode.AcquirerReversalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMBalance
 * MessageFunctionCode.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMCompletionAdvice
 * MessageFunctionCode.ATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMCompletionAcknowledgement
 * MessageFunctionCode.ATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMControl
 * MessageFunctionCode.ATMControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDeviceControl
 * MessageFunctionCode.ATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDiagnosticRequest
 * MessageFunctionCode.ATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDiagnosticResponse
 * MessageFunctionCode.ATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMGlobalStatus
 * MessageFunctionCode.ATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMInquiryRequest
 * MessageFunctionCode.ATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMInquiryResponse
 * MessageFunctionCode.ATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMKeyDownloadRequest
 * MessageFunctionCode.ATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMPINManagementResponse
 * MessageFunctionCode.ATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMPINManagementRequest
 * MessageFunctionCode.ATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMKeyDownloadResponse
 * MessageFunctionCode.ATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMRequestReject
 * MessageFunctionCode.ATMRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMResponseReject
 * MessageFunctionCode.ATMResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMWithdrawalRequest
 * MessageFunctionCode.ATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMWithdrawalResponse
 * MessageFunctionCode.ATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMWithdrawalAdvice
 * MessageFunctionCode.ATMWithdrawalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMWithdrawalAknowledgement
 * MessageFunctionCode.ATMWithdrawalAknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CountersInquiry
 * MessageFunctionCode.CountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#HostToATMRequest
 * MessageFunctionCode.HostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#HostToATMAcknowledgement
 * MessageFunctionCode.HostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMOperation
 * MessageFunctionCode.ATMOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#SecurityControl
 * MessageFunctionCode.SecurityControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#SecurityDetails
 * MessageFunctionCode.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#SecurityKeyCompletion
 * MessageFunctionCode.SecurityKeyCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#SecurityKeyStatus
 * MessageFunctionCode.SecurityKeyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcceptorRequestReject
 * MessageFunctionCode.AcceptorRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#AcceptorResponseReject
 * MessageFunctionCode.AcceptorResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDepositRequest
 * MessageFunctionCode.ATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDepositResponse
 * MessageFunctionCode.ATMDepositResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDepositCompletionAdvice
 * MessageFunctionCode.ATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMDepositCompletionAcknowledgement
 * MessageFunctionCode.ATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMExceptionAdvice
 * MessageFunctionCode.ATMExceptionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMExceptionAcknowledgement
 * MessageFunctionCode.ATMExceptionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMTransferRequest
 * MessageFunctionCode.ATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#ATMTransferResponse
 * MessageFunctionCode.ATMTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CountersReport
 * MessageFunctionCode.CountersReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CurrencyConversionAdvice
 * MessageFunctionCode.CurrencyConversionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode#CurrencyConversionAdviceResponse
 * MessageFunctionCode.CurrencyConversionAdviceResponse}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunctionCode extends MMCode {

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
	public static final MessageFunctionCode AuthorisationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisationRequest";
			definition = "The initiator requests an authorisation without financial impact to complete the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AuthorisationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AuthorisationResponse";
			definition = "Response for authorisation without financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialAuthorisationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAuthorisationRequest";
			definition = "Request for authorisation with financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialAuthorisationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialAuthorisationResponse";
			definition = "Response for authorisation with financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CompletionAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompletionAdvice";
			definition = "Advice for completion without financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CompletionAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CompletionAdviceResponse";
			definition = "Advice response for completion without financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialCompletionAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCompletionAdvice";
			definition = "Advice for completion with financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialCompletionAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialCompletionAdviceResponse";
			definition = "Advice response for completion with financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ReversalAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalAdvice";
			definition = "Advice for reversal without financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ReversalAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReversalAdviceResponse";
			definition = "Advice response for reversal without financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialReversalAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialReversalAdvice";
			definition = "Advice for reversal with financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialReversalAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinancialReversalAdviceResponse";
			definition = "Advice response for reversal with financial capture.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CancellationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationRequest";
			definition = "Request for cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CancellationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationResponse";
			definition = "Response for cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CancellationAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationAdvice";
			definition = "Advice for cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CancellationAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CancellationAdviceResponse";
			definition = "Advice response for cancellation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode DiagnosticRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiagnosticRequest";
			definition = "Request for diagnostic.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode DiagnosticResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DiagnosticResponse";
			definition = "Response for diagnostic.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ReconciliationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationRequest";
			definition = "Request for reconciliation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ReconciliationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReconciliationResponse";
			definition = "Response for reconciliation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode BatchTransfer = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BatchTransfer";
			definition = "Transfer the financial data as a collection of transction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode Rejection = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rejection";
			definition = "Reject a request or an advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode Response = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Message function is a response.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode Request = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Request";
			definition = "Message function is a request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CurrencyConversionRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			definition = "Request for dynamic currency conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CurrencyConversionResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			definition = "Response from a dynamic currency conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReconciliationAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationAdvice";
			definition = "Advice of transaction totals from an acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReconciliationAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationAdviceResponse";
			definition = "Acknowledgement from an issuer or a processor of an acquirer reconciliation advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReconciliationNotification = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationNotification";
			definition = "Notification of transaction totals from an acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReconciliationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationRequest";
			definition = "Request of transaction totals exchange from an acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReconciliationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationResponse";
			definition = "Response from an issuer or a processor to an acquirer reconciliation request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReject";
			definition = "Reject of a message by an acquirer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AgentReconciliationAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationAdvice";
			definition = "Advice of transaction totals from a processor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AgentReconciliationAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationAdviceResponse";
			definition = "Acknowledgement from an issuer or an acquirer of a processor reconciliation advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AgentReconciliationNotification = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationNotification";
			definition = "Notification of transaction totals from a processor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AgentReconciliationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationRequest";
			definition = "Request of transaction totals exchange from a processor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AgentReconciliationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationResponse";
			definition = "Response from an issuer or an acquirer to a processor reconciliation request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AgentReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReject";
			definition = "Reject of a message by an agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AuthorisationAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationAdvice";
			definition = "Initiator of the message advises the recipient about the result of an authorisation already performed.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AuthorisationAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationAdviceResponse";
			definition = "Response to an AuthorisationAdvice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AuthorisationNotification = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationNotification";
			definition = "Information about an authorisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			definition = "Initiator of the message advises the receptor that an authorisation has been successfully delivered or completed with a final amount, and requests the clearing of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdviceResponse";
			definition = "Response to a FinancialAdvice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialNotification = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialNotification";
			definition = "Initiator requests the clearing of the transaction. ";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialRequest";
			definition = "Initiator of the message requests both the authorisation and the clearing of the transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode FinancialResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialResponse";
			definition = "Response to a FinancialRequest.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode IssuerReconciliationAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationAdvice";
			definition = "Advice of transaction totals from an issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode IssuerReconciliationAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationAdviceResponse";
			definition = "Acknowledgement from an acquirer or a processor of an issuer reconciliation advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode IssuerReconciliationNotification = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationNotification";
			definition = "Notification of transaction totals from an issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode IssuerReconciliationRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationRequest";
			definition = "Request of transaction totals exchange from an issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode IssuerReconciliationResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationResponse";
			definition = "Response from an acquirer or a processor to an issuer reconciliation request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode IssuerReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReject";
			definition = "Reject of a message by an issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode NetworkManagementAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementAdvice";
			definition = "Advise of a performed network management service.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode NetworkManagementAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementAdviceResponse";
			definition = "Response to a NetworkManagementAdvice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode NetworkManagementRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementRequest";
			definition = "Request of a network management service.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode NetworkManagementResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementResponse";
			definition = "Response to a NetworkManagementRequest.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode KeyExchangeAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeAdvice";
			definition = "Advise of a performed key update.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode KeyExchangeAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeAdviceResponse";
			definition = "Response to a KeyExchangeAdvice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode KeyExchangeRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeRequest";
			definition = "Request of a key exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode KeyExchangeResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeResponse";
			definition = "Response to a KeyExchangeRequest.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReversalAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalAdvice";
			definition = "Reversal advice of an authorisation or a financial message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReversalAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalAdviceResponse";
			definition = "Response to a reversal advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReversalNotification = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalNotification";
			definition = "Reversal notification of an authorisation or a financial message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReversalRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalRequest";
			definition = "Reversal request of an authorisation or a financial message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcquirerReversalResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalResponse";
			definition = "Response to a reversal request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMBalance = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			definition = "Provide the ATM counters resettting those that are applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMCompletionAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAdvice";
			definition = "Advice of an ATM transaction completion.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMCompletionAcknowledgement = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAcknowledgement";
			definition = "Acknowledgement of a completion advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMControl = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMControl";
			definition = "Global ATM commands.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDeviceControl = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDeviceControl";
			definition = "Maintenance commands to perform.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDiagnosticRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticRequest";
			definition = "Request for a diagnostic.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDiagnosticResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticResponse";
			definition = "Response to a diagnostic request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMGlobalStatus = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			definition = "Global status of the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMInquiryRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryRequest";
			definition = "Request for an inquiry.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMInquiryResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryResponse";
			definition = "Response to an inquiry request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMKeyDownloadRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadRequest";
			definition = "Request for a key download.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMPINManagementResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementResponse";
			definition = "Response to a cardholder PIN management request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMPINManagementRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementRequest";
			definition = "Request for a cardholder PIN management.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMKeyDownloadResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadResponse";
			definition = "Response to a key download.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMRequestReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequestReject";
			definition = "Rejected request message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMResponseReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMResponseReject";
			definition = "Rejected response message.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMWithdrawalRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalRequest";
			definition = "Request for a withdrawal transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMWithdrawalResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalResponse";
			definition = "Response to a withdrawal transaction request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMWithdrawalAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAdvice";
			definition = "Response of a withdrawal transaction.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMWithdrawalAknowledgement = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAknowledgement";
			definition = "Acknowledgement of a withdrawal transaction advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CountersInquiry = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			definition = "Request the value of the ATM counters.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode HostToATMRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMRequest";
			definition = "Request from a host to an ATM to be contacted by this ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode HostToATMAcknowledgement = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMAcknowledgement";
			definition = "Acknowledgement of a request from a host to an ATM for contacting.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMOperation = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMOperation";
			definition = "Logical or physical operation on the ATM.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode SecurityControl = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityControl";
			definition = "Security Commands.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode SecurityDetails = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			definition = "Security detailed report.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode SecurityKeyCompletion = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyCompletion";
			definition = "Result of the key download with the status of the downloaded keys including key check values.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode SecurityKeyStatus = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyStatus";
			definition = "Status of cryptographic keys.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcceptorRequestReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorRequestReject";
			definition = "Reject of a request or an advice message by an acquirer or an agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode AcceptorResponseReject = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcceptorResponseReject";
			definition = "Reject of a response or an advice response message by a card acceptor or an agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDepositRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositRequest";
			definition = "Request for a deposit.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDepositResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositResponse";
			definition = "Response to a deposit request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDepositCompletionAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAdvice";
			definition = "Advice of an ATM deposit transaction completion.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMDepositCompletionAcknowledgement = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAcknowledgement";
			definition = "Acknowledgement of a deposit completion advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMExceptionAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAdvice";
			definition = "Advice of an ATM exception.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMExceptionAcknowledgement = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAcknowledgement";
			definition = "Acknowledgement of an exception advice.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMTransferRequest = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferRequest";
			definition = "Request for a fund transfer.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode ATMTransferResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferResponse";
			definition = "Response to a fund transfer request.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CountersReport = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersReport";
			definition = "Provide the value of the ATM counters, no reinitialisation of the counters.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CurrencyConversionAdvice = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdvice";
			definition = "Advice for dynamic currency conversion.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
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
	public static final MessageFunctionCode CurrencyConversionAdviceResponse = new MessageFunctionCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdviceResponse";
			definition = "Advice response for the currency conversion from the service provider to the acceptor.";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunctionCode.mmObject();
			codeName = "DCRR";
		}
	};
	final static private LinkedHashMap<String, MessageFunctionCode> codesByName = new LinkedHashMap<>();

	protected MessageFunctionCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunctionCode";
				definition = "Type of process related to a specific message.";
				derivation_lazy = () -> Arrays.asList(MessageFunction3Code.mmObject(), MessageFunction1Code.mmObject(), MessageFunction2Code.mmObject(), MessageFunction4Code.mmObject(), MessageFunction6Code.mmObject(),
						MessageFunction5Code.mmObject(), MessageFunction7Code.mmObject(), MessageFunction8Code.mmObject(), MessageFunction9Code.mmObject(), MessageFunction10Code.mmObject(), MessageFunction11Code.mmObject(),
						MessageFunction12Code.mmObject(), MessageFunction13Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunctionCode.AuthorisationRequest, com.tools20022.repository.codeset.MessageFunctionCode.AuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.FinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunctionCode.FinancialAuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.CompletionAdvice, com.tools20022.repository.codeset.MessageFunctionCode.CompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.FinancialCompletionAdvice, com.tools20022.repository.codeset.MessageFunctionCode.FinancialCompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ReversalAdvice, com.tools20022.repository.codeset.MessageFunctionCode.ReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.FinancialReversalAdvice, com.tools20022.repository.codeset.MessageFunctionCode.FinancialReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.CancellationRequest, com.tools20022.repository.codeset.MessageFunctionCode.CancellationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.CancellationAdvice, com.tools20022.repository.codeset.MessageFunctionCode.CancellationAdviceResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.DiagnosticRequest, com.tools20022.repository.codeset.MessageFunctionCode.DiagnosticResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ReconciliationRequest, com.tools20022.repository.codeset.MessageFunctionCode.ReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.BatchTransfer, com.tools20022.repository.codeset.MessageFunctionCode.Rejection, com.tools20022.repository.codeset.MessageFunctionCode.Response,
						com.tools20022.repository.codeset.MessageFunctionCode.Request, com.tools20022.repository.codeset.MessageFunctionCode.CurrencyConversionRequest,
						com.tools20022.repository.codeset.MessageFunctionCode.CurrencyConversionResponse, com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReconciliationAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReconciliationAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReconciliationNotification,
						com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReconciliationRequest, com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReject, com.tools20022.repository.codeset.MessageFunctionCode.AgentReconciliationAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.AgentReconciliationAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.AgentReconciliationNotification,
						com.tools20022.repository.codeset.MessageFunctionCode.AgentReconciliationRequest, com.tools20022.repository.codeset.MessageFunctionCode.AgentReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.AgentReject, com.tools20022.repository.codeset.MessageFunctionCode.AuthorisationAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.AuthorisationAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.AuthorisationNotification,
						com.tools20022.repository.codeset.MessageFunctionCode.FinancialAdvice, com.tools20022.repository.codeset.MessageFunctionCode.FinancialAdviceResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.FinancialNotification, com.tools20022.repository.codeset.MessageFunctionCode.FinancialRequest,
						com.tools20022.repository.codeset.MessageFunctionCode.FinancialResponse, com.tools20022.repository.codeset.MessageFunctionCode.IssuerReconciliationAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.IssuerReconciliationAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.IssuerReconciliationNotification,
						com.tools20022.repository.codeset.MessageFunctionCode.IssuerReconciliationRequest, com.tools20022.repository.codeset.MessageFunctionCode.IssuerReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.IssuerReject, com.tools20022.repository.codeset.MessageFunctionCode.NetworkManagementAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.NetworkManagementAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.NetworkManagementRequest,
						com.tools20022.repository.codeset.MessageFunctionCode.NetworkManagementResponse, com.tools20022.repository.codeset.MessageFunctionCode.KeyExchangeAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.KeyExchangeAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.KeyExchangeRequest,
						com.tools20022.repository.codeset.MessageFunctionCode.KeyExchangeResponse, com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReversalAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReversalAdviceResponse, com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReversalNotification,
						com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReversalRequest, com.tools20022.repository.codeset.MessageFunctionCode.AcquirerReversalResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMBalance, com.tools20022.repository.codeset.MessageFunctionCode.ATMCompletionAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMCompletionAcknowledgement, com.tools20022.repository.codeset.MessageFunctionCode.ATMControl,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMDeviceControl, com.tools20022.repository.codeset.MessageFunctionCode.ATMDiagnosticRequest,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMDiagnosticResponse, com.tools20022.repository.codeset.MessageFunctionCode.ATMGlobalStatus,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMInquiryRequest, com.tools20022.repository.codeset.MessageFunctionCode.ATMInquiryResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMKeyDownloadRequest, com.tools20022.repository.codeset.MessageFunctionCode.ATMPINManagementResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMPINManagementRequest, com.tools20022.repository.codeset.MessageFunctionCode.ATMKeyDownloadResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMRequestReject, com.tools20022.repository.codeset.MessageFunctionCode.ATMResponseReject,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMWithdrawalRequest, com.tools20022.repository.codeset.MessageFunctionCode.ATMWithdrawalResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMWithdrawalAdvice, com.tools20022.repository.codeset.MessageFunctionCode.ATMWithdrawalAknowledgement,
						com.tools20022.repository.codeset.MessageFunctionCode.CountersInquiry, com.tools20022.repository.codeset.MessageFunctionCode.HostToATMRequest,
						com.tools20022.repository.codeset.MessageFunctionCode.HostToATMAcknowledgement, com.tools20022.repository.codeset.MessageFunctionCode.ATMOperation,
						com.tools20022.repository.codeset.MessageFunctionCode.SecurityControl, com.tools20022.repository.codeset.MessageFunctionCode.SecurityDetails,
						com.tools20022.repository.codeset.MessageFunctionCode.SecurityKeyCompletion, com.tools20022.repository.codeset.MessageFunctionCode.SecurityKeyStatus,
						com.tools20022.repository.codeset.MessageFunctionCode.AcceptorRequestReject, com.tools20022.repository.codeset.MessageFunctionCode.AcceptorResponseReject,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMDepositRequest, com.tools20022.repository.codeset.MessageFunctionCode.ATMDepositResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMDepositCompletionAdvice, com.tools20022.repository.codeset.MessageFunctionCode.ATMDepositCompletionAcknowledgement,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMExceptionAdvice, com.tools20022.repository.codeset.MessageFunctionCode.ATMExceptionAcknowledgement,
						com.tools20022.repository.codeset.MessageFunctionCode.ATMTransferRequest, com.tools20022.repository.codeset.MessageFunctionCode.ATMTransferResponse,
						com.tools20022.repository.codeset.MessageFunctionCode.CountersReport, com.tools20022.repository.codeset.MessageFunctionCode.CurrencyConversionAdvice,
						com.tools20022.repository.codeset.MessageFunctionCode.CurrencyConversionAdviceResponse);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AuthorisationRequest.getCodeName().get(), AuthorisationRequest);
		codesByName.put(AuthorisationResponse.getCodeName().get(), AuthorisationResponse);
		codesByName.put(FinancialAuthorisationRequest.getCodeName().get(), FinancialAuthorisationRequest);
		codesByName.put(FinancialAuthorisationResponse.getCodeName().get(), FinancialAuthorisationResponse);
		codesByName.put(CompletionAdvice.getCodeName().get(), CompletionAdvice);
		codesByName.put(CompletionAdviceResponse.getCodeName().get(), CompletionAdviceResponse);
		codesByName.put(FinancialCompletionAdvice.getCodeName().get(), FinancialCompletionAdvice);
		codesByName.put(FinancialCompletionAdviceResponse.getCodeName().get(), FinancialCompletionAdviceResponse);
		codesByName.put(ReversalAdvice.getCodeName().get(), ReversalAdvice);
		codesByName.put(ReversalAdviceResponse.getCodeName().get(), ReversalAdviceResponse);
		codesByName.put(FinancialReversalAdvice.getCodeName().get(), FinancialReversalAdvice);
		codesByName.put(FinancialReversalAdviceResponse.getCodeName().get(), FinancialReversalAdviceResponse);
		codesByName.put(CancellationRequest.getCodeName().get(), CancellationRequest);
		codesByName.put(CancellationResponse.getCodeName().get(), CancellationResponse);
		codesByName.put(CancellationAdvice.getCodeName().get(), CancellationAdvice);
		codesByName.put(CancellationAdviceResponse.getCodeName().get(), CancellationAdviceResponse);
		codesByName.put(DiagnosticRequest.getCodeName().get(), DiagnosticRequest);
		codesByName.put(DiagnosticResponse.getCodeName().get(), DiagnosticResponse);
		codesByName.put(ReconciliationRequest.getCodeName().get(), ReconciliationRequest);
		codesByName.put(ReconciliationResponse.getCodeName().get(), ReconciliationResponse);
		codesByName.put(BatchTransfer.getCodeName().get(), BatchTransfer);
		codesByName.put(Rejection.getCodeName().get(), Rejection);
		codesByName.put(Response.getCodeName().get(), Response);
		codesByName.put(Request.getCodeName().get(), Request);
		codesByName.put(CurrencyConversionRequest.getCodeName().get(), CurrencyConversionRequest);
		codesByName.put(CurrencyConversionResponse.getCodeName().get(), CurrencyConversionResponse);
		codesByName.put(AcquirerReconciliationAdvice.getCodeName().get(), AcquirerReconciliationAdvice);
		codesByName.put(AcquirerReconciliationAdviceResponse.getCodeName().get(), AcquirerReconciliationAdviceResponse);
		codesByName.put(AcquirerReconciliationNotification.getCodeName().get(), AcquirerReconciliationNotification);
		codesByName.put(AcquirerReconciliationRequest.getCodeName().get(), AcquirerReconciliationRequest);
		codesByName.put(AcquirerReconciliationResponse.getCodeName().get(), AcquirerReconciliationResponse);
		codesByName.put(AcquirerReject.getCodeName().get(), AcquirerReject);
		codesByName.put(AgentReconciliationAdvice.getCodeName().get(), AgentReconciliationAdvice);
		codesByName.put(AgentReconciliationAdviceResponse.getCodeName().get(), AgentReconciliationAdviceResponse);
		codesByName.put(AgentReconciliationNotification.getCodeName().get(), AgentReconciliationNotification);
		codesByName.put(AgentReconciliationRequest.getCodeName().get(), AgentReconciliationRequest);
		codesByName.put(AgentReconciliationResponse.getCodeName().get(), AgentReconciliationResponse);
		codesByName.put(AgentReject.getCodeName().get(), AgentReject);
		codesByName.put(AuthorisationAdvice.getCodeName().get(), AuthorisationAdvice);
		codesByName.put(AuthorisationAdviceResponse.getCodeName().get(), AuthorisationAdviceResponse);
		codesByName.put(AuthorisationNotification.getCodeName().get(), AuthorisationNotification);
		codesByName.put(FinancialAdvice.getCodeName().get(), FinancialAdvice);
		codesByName.put(FinancialAdviceResponse.getCodeName().get(), FinancialAdviceResponse);
		codesByName.put(FinancialNotification.getCodeName().get(), FinancialNotification);
		codesByName.put(FinancialRequest.getCodeName().get(), FinancialRequest);
		codesByName.put(FinancialResponse.getCodeName().get(), FinancialResponse);
		codesByName.put(IssuerReconciliationAdvice.getCodeName().get(), IssuerReconciliationAdvice);
		codesByName.put(IssuerReconciliationAdviceResponse.getCodeName().get(), IssuerReconciliationAdviceResponse);
		codesByName.put(IssuerReconciliationNotification.getCodeName().get(), IssuerReconciliationNotification);
		codesByName.put(IssuerReconciliationRequest.getCodeName().get(), IssuerReconciliationRequest);
		codesByName.put(IssuerReconciliationResponse.getCodeName().get(), IssuerReconciliationResponse);
		codesByName.put(IssuerReject.getCodeName().get(), IssuerReject);
		codesByName.put(NetworkManagementAdvice.getCodeName().get(), NetworkManagementAdvice);
		codesByName.put(NetworkManagementAdviceResponse.getCodeName().get(), NetworkManagementAdviceResponse);
		codesByName.put(NetworkManagementRequest.getCodeName().get(), NetworkManagementRequest);
		codesByName.put(NetworkManagementResponse.getCodeName().get(), NetworkManagementResponse);
		codesByName.put(KeyExchangeAdvice.getCodeName().get(), KeyExchangeAdvice);
		codesByName.put(KeyExchangeAdviceResponse.getCodeName().get(), KeyExchangeAdviceResponse);
		codesByName.put(KeyExchangeRequest.getCodeName().get(), KeyExchangeRequest);
		codesByName.put(KeyExchangeResponse.getCodeName().get(), KeyExchangeResponse);
		codesByName.put(AcquirerReversalAdvice.getCodeName().get(), AcquirerReversalAdvice);
		codesByName.put(AcquirerReversalAdviceResponse.getCodeName().get(), AcquirerReversalAdviceResponse);
		codesByName.put(AcquirerReversalNotification.getCodeName().get(), AcquirerReversalNotification);
		codesByName.put(AcquirerReversalRequest.getCodeName().get(), AcquirerReversalRequest);
		codesByName.put(AcquirerReversalResponse.getCodeName().get(), AcquirerReversalResponse);
		codesByName.put(ATMBalance.getCodeName().get(), ATMBalance);
		codesByName.put(ATMCompletionAdvice.getCodeName().get(), ATMCompletionAdvice);
		codesByName.put(ATMCompletionAcknowledgement.getCodeName().get(), ATMCompletionAcknowledgement);
		codesByName.put(ATMControl.getCodeName().get(), ATMControl);
		codesByName.put(ATMDeviceControl.getCodeName().get(), ATMDeviceControl);
		codesByName.put(ATMDiagnosticRequest.getCodeName().get(), ATMDiagnosticRequest);
		codesByName.put(ATMDiagnosticResponse.getCodeName().get(), ATMDiagnosticResponse);
		codesByName.put(ATMGlobalStatus.getCodeName().get(), ATMGlobalStatus);
		codesByName.put(ATMInquiryRequest.getCodeName().get(), ATMInquiryRequest);
		codesByName.put(ATMInquiryResponse.getCodeName().get(), ATMInquiryResponse);
		codesByName.put(ATMKeyDownloadRequest.getCodeName().get(), ATMKeyDownloadRequest);
		codesByName.put(ATMPINManagementResponse.getCodeName().get(), ATMPINManagementResponse);
		codesByName.put(ATMPINManagementRequest.getCodeName().get(), ATMPINManagementRequest);
		codesByName.put(ATMKeyDownloadResponse.getCodeName().get(), ATMKeyDownloadResponse);
		codesByName.put(ATMRequestReject.getCodeName().get(), ATMRequestReject);
		codesByName.put(ATMResponseReject.getCodeName().get(), ATMResponseReject);
		codesByName.put(ATMWithdrawalRequest.getCodeName().get(), ATMWithdrawalRequest);
		codesByName.put(ATMWithdrawalResponse.getCodeName().get(), ATMWithdrawalResponse);
		codesByName.put(ATMWithdrawalAdvice.getCodeName().get(), ATMWithdrawalAdvice);
		codesByName.put(ATMWithdrawalAknowledgement.getCodeName().get(), ATMWithdrawalAknowledgement);
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(HostToATMRequest.getCodeName().get(), HostToATMRequest);
		codesByName.put(HostToATMAcknowledgement.getCodeName().get(), HostToATMAcknowledgement);
		codesByName.put(ATMOperation.getCodeName().get(), ATMOperation);
		codesByName.put(SecurityControl.getCodeName().get(), SecurityControl);
		codesByName.put(SecurityDetails.getCodeName().get(), SecurityDetails);
		codesByName.put(SecurityKeyCompletion.getCodeName().get(), SecurityKeyCompletion);
		codesByName.put(SecurityKeyStatus.getCodeName().get(), SecurityKeyStatus);
		codesByName.put(AcceptorRequestReject.getCodeName().get(), AcceptorRequestReject);
		codesByName.put(AcceptorResponseReject.getCodeName().get(), AcceptorResponseReject);
		codesByName.put(ATMDepositRequest.getCodeName().get(), ATMDepositRequest);
		codesByName.put(ATMDepositResponse.getCodeName().get(), ATMDepositResponse);
		codesByName.put(ATMDepositCompletionAdvice.getCodeName().get(), ATMDepositCompletionAdvice);
		codesByName.put(ATMDepositCompletionAcknowledgement.getCodeName().get(), ATMDepositCompletionAcknowledgement);
		codesByName.put(ATMExceptionAdvice.getCodeName().get(), ATMExceptionAdvice);
		codesByName.put(ATMExceptionAcknowledgement.getCodeName().get(), ATMExceptionAcknowledgement);
		codesByName.put(ATMTransferRequest.getCodeName().get(), ATMTransferRequest);
		codesByName.put(ATMTransferResponse.getCodeName().get(), ATMTransferResponse);
		codesByName.put(CountersReport.getCodeName().get(), CountersReport);
		codesByName.put(CurrencyConversionAdvice.getCodeName().get(), CurrencyConversionAdvice);
		codesByName.put(CurrencyConversionAdviceResponse.getCodeName().get(), CurrencyConversionAdviceResponse);
	}

	public static MessageFunctionCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunctionCode[] values() {
		MessageFunctionCode[] values = new MessageFunctionCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunctionCode> {
		@Override
		public MessageFunctionCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunctionCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}