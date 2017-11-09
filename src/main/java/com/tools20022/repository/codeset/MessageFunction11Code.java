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
import com.tools20022.repository.codeset.MessageFunctionCode;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Identifies the type of process related to an ATM message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
 * MessageFunctionCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMBalance
 * MessageFunction11Code.mmATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMCompletionAcknowledgement
 * MessageFunction11Code.mmATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMCompletionAdvice
 * MessageFunction11Code.mmATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMControl
 * MessageFunction11Code.mmATMControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDeviceControl
 * MessageFunction11Code.mmATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDiagnosticRequest
 * MessageFunction11Code.mmATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDiagnosticResponse
 * MessageFunction11Code.mmATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMGlobalStatus
 * MessageFunction11Code.mmATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMInquiryRequest
 * MessageFunction11Code.mmATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMInquiryResponse
 * MessageFunction11Code.mmATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMKeyDownloadRequest
 * MessageFunction11Code.mmATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMKeyDownloadResponse
 * MessageFunction11Code.mmATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMPINManagementRequest
 * MessageFunction11Code.mmATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMPINManagementResponse
 * MessageFunction11Code.mmATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMRequestReject
 * MessageFunction11Code.mmATMRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMResponseReject
 * MessageFunction11Code.mmATMResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMWithdrawalAdvice
 * MessageFunction11Code.mmATMWithdrawalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMWithdrawalAknowledgement
 * MessageFunction11Code.mmATMWithdrawalAknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMWithdrawalRequest
 * MessageFunction11Code.mmATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMWithdrawalResponse
 * MessageFunction11Code.mmATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmCountersInquiry
 * MessageFunction11Code.mmCountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmHostToATMAcknowledgement
 * MessageFunction11Code.mmHostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmHostToATMRequest
 * MessageFunction11Code.mmHostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMOperation
 * MessageFunction11Code.mmATMOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmSecurityControl
 * MessageFunction11Code.mmSecurityControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmSecurityDetails
 * MessageFunction11Code.mmSecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmSecurityKeyCompletion
 * MessageFunction11Code.mmSecurityKeyCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmSecurityKeyStatus
 * MessageFunction11Code.mmSecurityKeyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDepositCompletionAcknowledgement
 * MessageFunction11Code.mmATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDepositCompletionAdvice
 * MessageFunction11Code.mmATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDepositRequest
 * MessageFunction11Code.mmATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMDepositResponse
 * MessageFunction11Code.mmATMDepositResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMExceptionAcknowledgement
 * MessageFunction11Code.mmATMExceptionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMExceptionAdvice
 * MessageFunction11Code.mmATMExceptionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMTransferRequest
 * MessageFunction11Code.mmATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmATMTransferResponse
 * MessageFunction11Code.mmATMTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#mmCountersReport
 * MessageFunction11Code.mmCountersReport}</li>
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
 * "MessageFunction11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of process related to an ATM message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
 * MessageFunction7Code}</li>
 * </ul>
 */
public class MessageFunction11Code extends MessageFunctionCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMBalance
	 * MessageFunction7Code.mmATMBalance}</li>
	 * </ul>
	 */
	public static final MMCode mmATMBalance = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMBalance;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCompletionAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMCompletionAcknowledgement
	 * MessageFunction7Code.mmATMCompletionAcknowledgement}</li>
	 * </ul>
	 */
	public static final MMCode mmATMCompletionAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAcknowledgement";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMCompletionAcknowledgement;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMCompletionAdvice
	 * MessageFunction7Code.mmATMCompletionAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmATMCompletionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAdvice";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMCompletionAdvice;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMControl
	 * MessageFunction7Code.mmATMControl}</li>
	 * </ul>
	 */
	public static final MMCode mmATMControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMControl";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMControl;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDeviceControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMDeviceControl
	 * MessageFunction7Code.mmATMDeviceControl}</li>
	 * </ul>
	 */
	public static final MMCode mmATMDeviceControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDeviceControl";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMDeviceControl;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMDiagnosticRequest
	 * MessageFunction7Code.mmATMDiagnosticRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmATMDiagnosticRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticRequest";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMDiagnosticRequest;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMDiagnosticResponse
	 * MessageFunction7Code.mmATMDiagnosticResponse}</li>
	 * </ul>
	 */
	public static final MMCode mmATMDiagnosticResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticResponse";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMDiagnosticResponse;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMGlobalStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMGlobalStatus
	 * MessageFunction7Code.mmATMGlobalStatus}</li>
	 * </ul>
	 */
	public static final MMCode mmATMGlobalStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMGlobalStatus;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMInquiryRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMInquiryRequest
	 * MessageFunction7Code.mmATMInquiryRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmATMInquiryRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryRequest";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMInquiryRequest;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMInquiryResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMInquiryResponse
	 * MessageFunction7Code.mmATMInquiryResponse}</li>
	 * </ul>
	 */
	public static final MMCode mmATMInquiryResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryResponse";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMInquiryResponse;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMKeyDownloadRequest
	 * MessageFunction7Code.mmATMKeyDownloadRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmATMKeyDownloadRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadRequest";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMKeyDownloadRequest;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMKeyDownloadResponse
	 * MessageFunction7Code.mmATMKeyDownloadResponse}</li>
	 * </ul>
	 */
	public static final MMCode mmATMKeyDownloadResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadResponse";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMKeyDownloadResponse;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMPINManagementRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMPINManagementRequest
	 * MessageFunction7Code.mmATMPINManagementRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmATMPINManagementRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementRequest";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMPINManagementRequest;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMPINManagementResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMPINManagementResponse
	 * MessageFunction7Code.mmATMPINManagementResponse}</li>
	 * </ul>
	 */
	public static final MMCode mmATMPINManagementResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementResponse";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMPINManagementResponse;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMRequestReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMRequestReject
	 * MessageFunction7Code.mmATMRequestReject}</li>
	 * </ul>
	 */
	public static final MMCode mmATMRequestReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequestReject";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMRequestReject;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMResponseReject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMResponseReject
	 * MessageFunction7Code.mmATMResponseReject}</li>
	 * </ul>
	 */
	public static final MMCode mmATMResponseReject = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMResponseReject";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMResponseReject;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMWithdrawalAdvice
	 * MessageFunction7Code.mmATMWithdrawalAdvice}</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAdvice";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMWithdrawalAdvice;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalAknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMWithdrawalAknowledgement
	 * MessageFunction7Code.mmATMWithdrawalAknowledgement}</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalAknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAknowledgement";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMWithdrawalAknowledgement;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMWithdrawalRequest
	 * MessageFunction7Code.mmATMWithdrawalRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalRequest";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMWithdrawalRequest;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMWithdrawalResponse
	 * MessageFunction7Code.mmATMWithdrawalResponse}</li>
	 * </ul>
	 */
	public static final MMCode mmATMWithdrawalResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalResponse";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMWithdrawalResponse;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmCountersInquiry
	 * MessageFunction7Code.mmCountersInquiry}</li>
	 * </ul>
	 */
	public static final MMCode mmCountersInquiry = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			previousVersion_lazy = () -> MessageFunction7Code.mmCountersInquiry;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMAcknowledgement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmHostToATMAcknowledgement
	 * MessageFunction7Code.mmHostToATMAcknowledgement}</li>
	 * </ul>
	 */
	public static final MMCode mmHostToATMAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMAcknowledgement";
			previousVersion_lazy = () -> MessageFunction7Code.mmHostToATMAcknowledgement;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmHostToATMRequest
	 * MessageFunction7Code.mmHostToATMRequest}</li>
	 * </ul>
	 */
	public static final MMCode mmHostToATMRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMRequest";
			previousVersion_lazy = () -> MessageFunction7Code.mmHostToATMRequest;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmATMOperation
	 * MessageFunction7Code.mmATMOperation}</li>
	 * </ul>
	 */
	public static final MMCode mmATMOperation = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMOperation";
			previousVersion_lazy = () -> MessageFunction7Code.mmATMOperation;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityControl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmSecurityControl
	 * MessageFunction7Code.mmSecurityControl}</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityControl = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityControl";
			previousVersion_lazy = () -> MessageFunction7Code.mmSecurityControl;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmSecurityDetails
	 * MessageFunction7Code.mmSecurityDetails}</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityDetails = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			previousVersion_lazy = () -> MessageFunction7Code.mmSecurityDetails;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyCompletion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmSecurityKeyCompletion
	 * MessageFunction7Code.mmSecurityKeyCompletion}</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityKeyCompletion = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyCompletion";
			previousVersion_lazy = () -> MessageFunction7Code.mmSecurityKeyCompletion;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#mmSecurityKeyStatus
	 * MessageFunction7Code.mmSecurityKeyStatus}</li>
	 * </ul>
	 */
	public static final MMCode mmSecurityKeyStatus = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyStatus";
			previousVersion_lazy = () -> MessageFunction7Code.mmSecurityKeyStatus;
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositCompletionAcknowledgement"</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositCompletionAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAcknowledgement";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositCompletionAdvice"</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositCompletionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAdvice";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositRequest"</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositRequest";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDepositResponse"</li>
	 * </ul>
	 */
	public static final MMCode mmATMDepositResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositResponse";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMExceptionAcknowledgement"</li>
	 * </ul>
	 */
	public static final MMCode mmATMExceptionAcknowledgement = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAcknowledgement";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMExceptionAdvice"</li>
	 * </ul>
	 */
	public static final MMCode mmATMExceptionAdvice = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAdvice";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTransferRequest"</li>
	 * </ul>
	 */
	public static final MMCode mmATMTransferRequest = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferRequest";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMTransferResponse"</li>
	 * </ul>
	 */
	public static final MMCode mmATMTransferResponse = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferResponse";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code
	 * MessageFunction11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersReport"</li>
	 * </ul>
	 */
	public static final MMCode mmCountersReport = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersReport";
			owner_lazy = () -> MessageFunction11Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction11Code";
				definition = "Identifies the type of process related to an ATM message.";
				previousVersion_lazy = () -> MessageFunction7Code.mmObject();
				code_lazy = () -> Arrays.asList(MessageFunction11Code.mmATMBalance, MessageFunction11Code.mmATMCompletionAcknowledgement, MessageFunction11Code.mmATMCompletionAdvice, MessageFunction11Code.mmATMControl,
						MessageFunction11Code.mmATMDeviceControl, MessageFunction11Code.mmATMDiagnosticRequest, MessageFunction11Code.mmATMDiagnosticResponse, MessageFunction11Code.mmATMGlobalStatus,
						MessageFunction11Code.mmATMInquiryRequest, MessageFunction11Code.mmATMInquiryResponse, MessageFunction11Code.mmATMKeyDownloadRequest, MessageFunction11Code.mmATMKeyDownloadResponse,
						MessageFunction11Code.mmATMPINManagementRequest, MessageFunction11Code.mmATMPINManagementResponse, MessageFunction11Code.mmATMRequestReject, MessageFunction11Code.mmATMResponseReject,
						MessageFunction11Code.mmATMWithdrawalAdvice, MessageFunction11Code.mmATMWithdrawalAknowledgement, MessageFunction11Code.mmATMWithdrawalRequest, MessageFunction11Code.mmATMWithdrawalResponse,
						MessageFunction11Code.mmCountersInquiry, MessageFunction11Code.mmHostToATMAcknowledgement, MessageFunction11Code.mmHostToATMRequest, MessageFunction11Code.mmATMOperation, MessageFunction11Code.mmSecurityControl,
						MessageFunction11Code.mmSecurityDetails, MessageFunction11Code.mmSecurityKeyCompletion, MessageFunction11Code.mmSecurityKeyStatus, MessageFunction11Code.mmATMDepositCompletionAcknowledgement,
						MessageFunction11Code.mmATMDepositCompletionAdvice, MessageFunction11Code.mmATMDepositRequest, MessageFunction11Code.mmATMDepositResponse, MessageFunction11Code.mmATMExceptionAcknowledgement,
						MessageFunction11Code.mmATMExceptionAdvice, MessageFunction11Code.mmATMTransferRequest, MessageFunction11Code.mmATMTransferResponse, MessageFunction11Code.mmCountersReport);
				trace_lazy = () -> MessageFunctionCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}