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
import com.tools20022.repository.codeset.MessageFunction11Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of process related to an ATM message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMBalance
 * MessageFunction11Code.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMCompletionAcknowledgement
 * MessageFunction11Code.ATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMCompletionAdvice
 * MessageFunction11Code.ATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMControl
 * MessageFunction11Code.ATMControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDeviceControl
 * MessageFunction11Code.ATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDiagnosticRequest
 * MessageFunction11Code.ATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDiagnosticResponse
 * MessageFunction11Code.ATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMGlobalStatus
 * MessageFunction11Code.ATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMInquiryRequest
 * MessageFunction11Code.ATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMInquiryResponse
 * MessageFunction11Code.ATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMKeyDownloadRequest
 * MessageFunction11Code.ATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMKeyDownloadResponse
 * MessageFunction11Code.ATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMPINManagementRequest
 * MessageFunction11Code.ATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMPINManagementResponse
 * MessageFunction11Code.ATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMRequestReject
 * MessageFunction11Code.ATMRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMResponseReject
 * MessageFunction11Code.ATMResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalAdvice
 * MessageFunction11Code.ATMWithdrawalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalAknowledgement
 * MessageFunction11Code.ATMWithdrawalAknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalRequest
 * MessageFunction11Code.ATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalResponse
 * MessageFunction11Code.ATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#CountersInquiry
 * MessageFunction11Code.CountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#HostToATMAcknowledgement
 * MessageFunction11Code.HostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#HostToATMRequest
 * MessageFunction11Code.HostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMOperation
 * MessageFunction11Code.ATMOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityControl
 * MessageFunction11Code.SecurityControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityDetails
 * MessageFunction11Code.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityKeyCompletion
 * MessageFunction11Code.SecurityKeyCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityKeyStatus
 * MessageFunction11Code.SecurityKeyStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDepositCompletionAcknowledgement
 * MessageFunction11Code.ATMDepositCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDepositCompletionAdvice
 * MessageFunction11Code.ATMDepositCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDepositRequest
 * MessageFunction11Code.ATMDepositRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDepositResponse
 * MessageFunction11Code.ATMDepositResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMExceptionAcknowledgement
 * MessageFunction11Code.ATMExceptionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMExceptionAdvice
 * MessageFunction11Code.ATMExceptionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMTransferRequest
 * MessageFunction11Code.ATMTransferRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMTransferResponse
 * MessageFunction11Code.ATMTransferResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#CountersReport
 * MessageFunction11Code.CountersReport}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunctionCode
 * MessageFunctionCode}</li>
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
 * "MessageFunction11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of process related to an ATM message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
 * MessageFunction7Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction11Code extends MMCode {

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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMBalance
	 * MessageFunction7Code.ATMBalance}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMBalance = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			previousVersion_lazy = () -> MessageFunction7Code.ATMBalance;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMBalance.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMCompletionAcknowledgement
	 * MessageFunction7Code.ATMCompletionAcknowledgement}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMCompletionAcknowledgement = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAcknowledgement";
			previousVersion_lazy = () -> MessageFunction7Code.ATMCompletionAcknowledgement;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMCompletionAcknowledgement.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMCompletionAdvice
	 * MessageFunction7Code.ATMCompletionAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMCompletionAdvice = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAdvice";
			previousVersion_lazy = () -> MessageFunction7Code.ATMCompletionAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMCompletionAdvice.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMControl
	 * MessageFunction7Code.ATMControl}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMControl = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMControl";
			previousVersion_lazy = () -> MessageFunction7Code.ATMControl;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMControl.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMDeviceControl
	 * MessageFunction7Code.ATMDeviceControl}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMDeviceControl = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDeviceControl";
			previousVersion_lazy = () -> MessageFunction7Code.ATMDeviceControl;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDeviceControl.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMDiagnosticRequest
	 * MessageFunction7Code.ATMDiagnosticRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMDiagnosticRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticRequest";
			previousVersion_lazy = () -> MessageFunction7Code.ATMDiagnosticRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDiagnosticRequest.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMDiagnosticResponse
	 * MessageFunction7Code.ATMDiagnosticResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMDiagnosticResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticResponse";
			previousVersion_lazy = () -> MessageFunction7Code.ATMDiagnosticResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDiagnosticResponse.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMGlobalStatus
	 * MessageFunction7Code.ATMGlobalStatus}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMGlobalStatus = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			previousVersion_lazy = () -> MessageFunction7Code.ATMGlobalStatus;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMGlobalStatus.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMInquiryRequest
	 * MessageFunction7Code.ATMInquiryRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMInquiryRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryRequest";
			previousVersion_lazy = () -> MessageFunction7Code.ATMInquiryRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMInquiryRequest.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMInquiryResponse
	 * MessageFunction7Code.ATMInquiryResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMInquiryResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryResponse";
			previousVersion_lazy = () -> MessageFunction7Code.ATMInquiryResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMInquiryResponse.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMKeyDownloadRequest
	 * MessageFunction7Code.ATMKeyDownloadRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMKeyDownloadRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadRequest";
			previousVersion_lazy = () -> MessageFunction7Code.ATMKeyDownloadRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMKeyDownloadRequest.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMKeyDownloadResponse
	 * MessageFunction7Code.ATMKeyDownloadResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMKeyDownloadResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadResponse";
			previousVersion_lazy = () -> MessageFunction7Code.ATMKeyDownloadResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMKeyDownloadResponse.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMPINManagementRequest
	 * MessageFunction7Code.ATMPINManagementRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMPINManagementRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementRequest";
			previousVersion_lazy = () -> MessageFunction7Code.ATMPINManagementRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMPINManagementRequest.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMPINManagementResponse
	 * MessageFunction7Code.ATMPINManagementResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMPINManagementResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementResponse";
			previousVersion_lazy = () -> MessageFunction7Code.ATMPINManagementResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMPINManagementResponse.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMRequestReject
	 * MessageFunction7Code.ATMRequestReject}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMRequestReject = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequestReject";
			previousVersion_lazy = () -> MessageFunction7Code.ATMRequestReject;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMRequestReject.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMResponseReject
	 * MessageFunction7Code.ATMResponseReject}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMResponseReject = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMResponseReject";
			previousVersion_lazy = () -> MessageFunction7Code.ATMResponseReject;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMResponseReject.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalAdvice
	 * MessageFunction7Code.ATMWithdrawalAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMWithdrawalAdvice = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAdvice";
			previousVersion_lazy = () -> MessageFunction7Code.ATMWithdrawalAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalAdvice.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalAknowledgement
	 * MessageFunction7Code.ATMWithdrawalAknowledgement}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMWithdrawalAknowledgement = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAknowledgement";
			previousVersion_lazy = () -> MessageFunction7Code.ATMWithdrawalAknowledgement;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalAknowledgement.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalRequest
	 * MessageFunction7Code.ATMWithdrawalRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMWithdrawalRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalRequest";
			previousVersion_lazy = () -> MessageFunction7Code.ATMWithdrawalRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalRequest.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalResponse
	 * MessageFunction7Code.ATMWithdrawalResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMWithdrawalResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalResponse";
			previousVersion_lazy = () -> MessageFunction7Code.ATMWithdrawalResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalResponse.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#CountersInquiry
	 * MessageFunction7Code.CountersInquiry}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code CountersInquiry = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			previousVersion_lazy = () -> MessageFunction7Code.CountersInquiry;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.CountersInquiry.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#HostToATMAcknowledgement
	 * MessageFunction7Code.HostToATMAcknowledgement}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code HostToATMAcknowledgement = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMAcknowledgement";
			previousVersion_lazy = () -> MessageFunction7Code.HostToATMAcknowledgement;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.HostToATMAcknowledgement.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#HostToATMRequest
	 * MessageFunction7Code.HostToATMRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code HostToATMRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMRequest";
			previousVersion_lazy = () -> MessageFunction7Code.HostToATMRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.HostToATMRequest.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMOperation
	 * MessageFunction7Code.ATMOperation}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code ATMOperation = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMOperation";
			previousVersion_lazy = () -> MessageFunction7Code.ATMOperation;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMOperation.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityControl
	 * MessageFunction7Code.SecurityControl}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code SecurityControl = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityControl";
			previousVersion_lazy = () -> MessageFunction7Code.SecurityControl;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.SecurityControl.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityDetails
	 * MessageFunction7Code.SecurityDetails}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code SecurityDetails = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			previousVersion_lazy = () -> MessageFunction7Code.SecurityDetails;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.SecurityDetails.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityKeyCompletion
	 * MessageFunction7Code.SecurityKeyCompletion}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code SecurityKeyCompletion = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyCompletion";
			previousVersion_lazy = () -> MessageFunction7Code.SecurityKeyCompletion;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.SecurityKeyCompletion.getCodeName().orElse(name);
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
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityKeyStatus
	 * MessageFunction7Code.SecurityKeyStatus}</li>
	 * </ul>
	 */
	public static final MessageFunction11Code SecurityKeyStatus = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyStatus";
			previousVersion_lazy = () -> MessageFunction7Code.SecurityKeyStatus;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.SecurityKeyStatus.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMDepositCompletionAcknowledgement = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAcknowledgement";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDepositCompletionAcknowledgement.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMDepositCompletionAdvice = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositCompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDepositCompletionAdvice.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMDepositRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDepositRequest.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMDepositResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDepositResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMDepositResponse.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMExceptionAcknowledgement = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAcknowledgement";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMExceptionAcknowledgement.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMExceptionAdvice = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMExceptionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMExceptionAdvice.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMTransferRequest = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMTransferRequest.getCodeName().orElse(name);
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
	public static final MessageFunction11Code ATMTransferResponse = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMTransferResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.ATMTransferResponse.getCodeName().orElse(name);
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
	public static final MessageFunction11Code CountersReport = new MessageFunction11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersReport";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction11Code.mmObject();
			codeName = MessageFunctionCode.CountersReport.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction11Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction11Code";
				definition = "Identifies the type of process related to an ATM message.";
				previousVersion_lazy = () -> MessageFunction7Code.mmObject();
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction11Code.ATMBalance, com.tools20022.repository.codeset.MessageFunction11Code.ATMCompletionAcknowledgement,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMCompletionAdvice, com.tools20022.repository.codeset.MessageFunction11Code.ATMControl,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMDeviceControl, com.tools20022.repository.codeset.MessageFunction11Code.ATMDiagnosticRequest,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMDiagnosticResponse, com.tools20022.repository.codeset.MessageFunction11Code.ATMGlobalStatus,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMInquiryRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMInquiryResponse,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMKeyDownloadRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMKeyDownloadResponse,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMPINManagementRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMPINManagementResponse,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMRequestReject, com.tools20022.repository.codeset.MessageFunction11Code.ATMResponseReject,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMWithdrawalAdvice, com.tools20022.repository.codeset.MessageFunction11Code.ATMWithdrawalAknowledgement,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMWithdrawalRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMWithdrawalResponse,
						com.tools20022.repository.codeset.MessageFunction11Code.CountersInquiry, com.tools20022.repository.codeset.MessageFunction11Code.HostToATMAcknowledgement,
						com.tools20022.repository.codeset.MessageFunction11Code.HostToATMRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMOperation,
						com.tools20022.repository.codeset.MessageFunction11Code.SecurityControl, com.tools20022.repository.codeset.MessageFunction11Code.SecurityDetails,
						com.tools20022.repository.codeset.MessageFunction11Code.SecurityKeyCompletion, com.tools20022.repository.codeset.MessageFunction11Code.SecurityKeyStatus,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMDepositCompletionAcknowledgement, com.tools20022.repository.codeset.MessageFunction11Code.ATMDepositCompletionAdvice,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMDepositRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMDepositResponse,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMExceptionAcknowledgement, com.tools20022.repository.codeset.MessageFunction11Code.ATMExceptionAdvice,
						com.tools20022.repository.codeset.MessageFunction11Code.ATMTransferRequest, com.tools20022.repository.codeset.MessageFunction11Code.ATMTransferResponse,
						com.tools20022.repository.codeset.MessageFunction11Code.CountersReport);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ATMBalance.getCodeName().get(), ATMBalance);
		codesByName.put(ATMCompletionAcknowledgement.getCodeName().get(), ATMCompletionAcknowledgement);
		codesByName.put(ATMCompletionAdvice.getCodeName().get(), ATMCompletionAdvice);
		codesByName.put(ATMControl.getCodeName().get(), ATMControl);
		codesByName.put(ATMDeviceControl.getCodeName().get(), ATMDeviceControl);
		codesByName.put(ATMDiagnosticRequest.getCodeName().get(), ATMDiagnosticRequest);
		codesByName.put(ATMDiagnosticResponse.getCodeName().get(), ATMDiagnosticResponse);
		codesByName.put(ATMGlobalStatus.getCodeName().get(), ATMGlobalStatus);
		codesByName.put(ATMInquiryRequest.getCodeName().get(), ATMInquiryRequest);
		codesByName.put(ATMInquiryResponse.getCodeName().get(), ATMInquiryResponse);
		codesByName.put(ATMKeyDownloadRequest.getCodeName().get(), ATMKeyDownloadRequest);
		codesByName.put(ATMKeyDownloadResponse.getCodeName().get(), ATMKeyDownloadResponse);
		codesByName.put(ATMPINManagementRequest.getCodeName().get(), ATMPINManagementRequest);
		codesByName.put(ATMPINManagementResponse.getCodeName().get(), ATMPINManagementResponse);
		codesByName.put(ATMRequestReject.getCodeName().get(), ATMRequestReject);
		codesByName.put(ATMResponseReject.getCodeName().get(), ATMResponseReject);
		codesByName.put(ATMWithdrawalAdvice.getCodeName().get(), ATMWithdrawalAdvice);
		codesByName.put(ATMWithdrawalAknowledgement.getCodeName().get(), ATMWithdrawalAknowledgement);
		codesByName.put(ATMWithdrawalRequest.getCodeName().get(), ATMWithdrawalRequest);
		codesByName.put(ATMWithdrawalResponse.getCodeName().get(), ATMWithdrawalResponse);
		codesByName.put(CountersInquiry.getCodeName().get(), CountersInquiry);
		codesByName.put(HostToATMAcknowledgement.getCodeName().get(), HostToATMAcknowledgement);
		codesByName.put(HostToATMRequest.getCodeName().get(), HostToATMRequest);
		codesByName.put(ATMOperation.getCodeName().get(), ATMOperation);
		codesByName.put(SecurityControl.getCodeName().get(), SecurityControl);
		codesByName.put(SecurityDetails.getCodeName().get(), SecurityDetails);
		codesByName.put(SecurityKeyCompletion.getCodeName().get(), SecurityKeyCompletion);
		codesByName.put(SecurityKeyStatus.getCodeName().get(), SecurityKeyStatus);
		codesByName.put(ATMDepositCompletionAcknowledgement.getCodeName().get(), ATMDepositCompletionAcknowledgement);
		codesByName.put(ATMDepositCompletionAdvice.getCodeName().get(), ATMDepositCompletionAdvice);
		codesByName.put(ATMDepositRequest.getCodeName().get(), ATMDepositRequest);
		codesByName.put(ATMDepositResponse.getCodeName().get(), ATMDepositResponse);
		codesByName.put(ATMExceptionAcknowledgement.getCodeName().get(), ATMExceptionAcknowledgement);
		codesByName.put(ATMExceptionAdvice.getCodeName().get(), ATMExceptionAdvice);
		codesByName.put(ATMTransferRequest.getCodeName().get(), ATMTransferRequest);
		codesByName.put(ATMTransferResponse.getCodeName().get(), ATMTransferResponse);
		codesByName.put(CountersReport.getCodeName().get(), CountersReport);
	}

	public static MessageFunction11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction11Code[] values() {
		MessageFunction11Code[] values = new MessageFunction11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction11Code> {
		@Override
		public MessageFunction11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}