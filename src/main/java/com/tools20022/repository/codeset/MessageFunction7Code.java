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
import com.tools20022.repository.codeset.MessageFunction7Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMBalance
 * MessageFunction7Code.ATMBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMCompletionAcknowledgement
 * MessageFunction7Code.ATMCompletionAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMCompletionAdvice
 * MessageFunction7Code.ATMCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMControl
 * MessageFunction7Code.ATMControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMDeviceControl
 * MessageFunction7Code.ATMDeviceControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMDiagnosticRequest
 * MessageFunction7Code.ATMDiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMDiagnosticResponse
 * MessageFunction7Code.ATMDiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMGlobalStatus
 * MessageFunction7Code.ATMGlobalStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMInquiryRequest
 * MessageFunction7Code.ATMInquiryRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMInquiryResponse
 * MessageFunction7Code.ATMInquiryResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMKeyDownloadRequest
 * MessageFunction7Code.ATMKeyDownloadRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMKeyDownloadResponse
 * MessageFunction7Code.ATMKeyDownloadResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMPINManagementRequest
 * MessageFunction7Code.ATMPINManagementRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMPINManagementResponse
 * MessageFunction7Code.ATMPINManagementResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMRequestReject
 * MessageFunction7Code.ATMRequestReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMResponseReject
 * MessageFunction7Code.ATMResponseReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalAdvice
 * MessageFunction7Code.ATMWithdrawalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalAknowledgement
 * MessageFunction7Code.ATMWithdrawalAknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalRequest
 * MessageFunction7Code.ATMWithdrawalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMWithdrawalResponse
 * MessageFunction7Code.ATMWithdrawalResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#CountersInquiry
 * MessageFunction7Code.CountersInquiry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#HostToATMAcknowledgement
 * MessageFunction7Code.HostToATMAcknowledgement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#HostToATMRequest
 * MessageFunction7Code.HostToATMRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#ATMOperation
 * MessageFunction7Code.ATMOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityControl
 * MessageFunction7Code.SecurityControl}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityDetails
 * MessageFunction7Code.SecurityDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityKeyCompletion
 * MessageFunction7Code.SecurityKeyCompletion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code#SecurityKeyStatus
 * MessageFunction7Code.SecurityKeyStatus}</li>
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
 * "MessageFunction7Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Identifies the type of process related to an ATM message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction11Code
 * MessageFunction11Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction7Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMBalance"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMBalance
	 * MessageFunction11Code.ATMBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMBalance = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMBalance";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMBalance);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMBalance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCompletionAcknowledgement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMCompletionAcknowledgement
	 * MessageFunction11Code.ATMCompletionAcknowledgement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMCompletionAcknowledgement = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAcknowledgement";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMCompletionAcknowledgement);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMCompletionAcknowledgement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMCompletionAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMCompletionAdvice
	 * MessageFunction11Code.ATMCompletionAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMCompletionAdvice = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMCompletionAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMCompletionAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMCompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMControl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMControl
	 * MessageFunction11Code.ATMControl}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMControl = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMControl";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMControl);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMControl.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDeviceControl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDeviceControl
	 * MessageFunction11Code.ATMDeviceControl}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMDeviceControl = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDeviceControl";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMDeviceControl);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMDeviceControl.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDiagnosticRequest
	 * MessageFunction11Code.ATMDiagnosticRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMDiagnosticRequest = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMDiagnosticRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMDiagnosticRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMDiagnosticResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMDiagnosticResponse
	 * MessageFunction11Code.ATMDiagnosticResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMDiagnosticResponse = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMDiagnosticResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMDiagnosticResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMDiagnosticResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMGlobalStatus"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMGlobalStatus
	 * MessageFunction11Code.ATMGlobalStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMGlobalStatus = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMGlobalStatus";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMGlobalStatus);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMGlobalStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMInquiryRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMInquiryRequest
	 * MessageFunction11Code.ATMInquiryRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMInquiryRequest = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMInquiryRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMInquiryRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMInquiryResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMInquiryResponse
	 * MessageFunction11Code.ATMInquiryResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMInquiryResponse = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMInquiryResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMInquiryResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMInquiryResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMKeyDownloadRequest
	 * MessageFunction11Code.ATMKeyDownloadRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMKeyDownloadRequest = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMKeyDownloadRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMKeyDownloadRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMKeyDownloadResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMKeyDownloadResponse
	 * MessageFunction11Code.ATMKeyDownloadResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMKeyDownloadResponse = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMKeyDownloadResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMKeyDownloadResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMKeyDownloadResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMPINManagementRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMPINManagementRequest
	 * MessageFunction11Code.ATMPINManagementRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMPINManagementRequest = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMPINManagementRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMPINManagementRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMPINManagementResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMPINManagementResponse
	 * MessageFunction11Code.ATMPINManagementResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMPINManagementResponse = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMPINManagementResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMPINManagementResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMPINManagementResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMRequestReject"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMRequestReject
	 * MessageFunction11Code.ATMRequestReject}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMRequestReject = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMRequestReject";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMRequestReject);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMRequestReject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMResponseReject"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMResponseReject
	 * MessageFunction11Code.ATMResponseReject}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMResponseReject = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMResponseReject";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMResponseReject);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMResponseReject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalAdvice
	 * MessageFunction11Code.ATMWithdrawalAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMWithdrawalAdvice = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMWithdrawalAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalAknowledgement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalAknowledgement
	 * MessageFunction11Code.ATMWithdrawalAknowledgement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMWithdrawalAknowledgement = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalAknowledgement";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMWithdrawalAknowledgement);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalAknowledgement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalRequest
	 * MessageFunction11Code.ATMWithdrawalRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMWithdrawalRequest = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMWithdrawalRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMWithdrawalResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMWithdrawalResponse
	 * MessageFunction11Code.ATMWithdrawalResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMWithdrawalResponse = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMWithdrawalResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMWithdrawalResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMWithdrawalResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountersInquiry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#CountersInquiry
	 * MessageFunction11Code.CountersInquiry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code CountersInquiry = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountersInquiry";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.CountersInquiry);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.CountersInquiry.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMAcknowledgement"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#HostToATMAcknowledgement
	 * MessageFunction11Code.HostToATMAcknowledgement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code HostToATMAcknowledgement = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMAcknowledgement";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.HostToATMAcknowledgement);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.HostToATMAcknowledgement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HostToATMRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#HostToATMRequest
	 * MessageFunction11Code.HostToATMRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code HostToATMRequest = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HostToATMRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.HostToATMRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.HostToATMRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ATMOperation"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#ATMOperation
	 * MessageFunction11Code.ATMOperation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code ATMOperation = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ATMOperation";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.ATMOperation);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.ATMOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityControl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityControl
	 * MessageFunction11Code.SecurityControl}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code SecurityControl = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityControl";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.SecurityControl);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.SecurityControl.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityDetails"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityDetails
	 * MessageFunction11Code.SecurityDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code SecurityDetails = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityDetails";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.SecurityDetails);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.SecurityDetails.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyCompletion"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityKeyCompletion
	 * MessageFunction11Code.SecurityKeyCompletion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code SecurityKeyCompletion = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyCompletion";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.SecurityKeyCompletion);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.SecurityKeyCompletion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction7Code
	 * MessageFunction7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityKeyStatus"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction11Code#SecurityKeyStatus
	 * MessageFunction11Code.SecurityKeyStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction7Code SecurityKeyStatus = new MessageFunction7Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityKeyStatus";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.SecurityKeyStatus);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction7Code.mmObject();
			codeName = MessageFunctionCode.SecurityKeyStatus.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction7Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction7Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction7Code";
				definition = "Identifies the type of process related to an ATM message.";
				nextVersions_lazy = () -> Arrays.asList(MessageFunction11Code.mmObject());
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction7Code.ATMBalance, com.tools20022.repository.codeset.MessageFunction7Code.ATMCompletionAcknowledgement,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMCompletionAdvice, com.tools20022.repository.codeset.MessageFunction7Code.ATMControl, com.tools20022.repository.codeset.MessageFunction7Code.ATMDeviceControl,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMDiagnosticRequest, com.tools20022.repository.codeset.MessageFunction7Code.ATMDiagnosticResponse,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMGlobalStatus, com.tools20022.repository.codeset.MessageFunction7Code.ATMInquiryRequest,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMInquiryResponse, com.tools20022.repository.codeset.MessageFunction7Code.ATMKeyDownloadRequest,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMKeyDownloadResponse, com.tools20022.repository.codeset.MessageFunction7Code.ATMPINManagementRequest,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMPINManagementResponse, com.tools20022.repository.codeset.MessageFunction7Code.ATMRequestReject,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMResponseReject, com.tools20022.repository.codeset.MessageFunction7Code.ATMWithdrawalAdvice,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMWithdrawalAknowledgement, com.tools20022.repository.codeset.MessageFunction7Code.ATMWithdrawalRequest,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMWithdrawalResponse, com.tools20022.repository.codeset.MessageFunction7Code.CountersInquiry,
						com.tools20022.repository.codeset.MessageFunction7Code.HostToATMAcknowledgement, com.tools20022.repository.codeset.MessageFunction7Code.HostToATMRequest,
						com.tools20022.repository.codeset.MessageFunction7Code.ATMOperation, com.tools20022.repository.codeset.MessageFunction7Code.SecurityControl, com.tools20022.repository.codeset.MessageFunction7Code.SecurityDetails,
						com.tools20022.repository.codeset.MessageFunction7Code.SecurityKeyCompletion, com.tools20022.repository.codeset.MessageFunction7Code.SecurityKeyStatus);
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
	}

	public static MessageFunction7Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction7Code[] values() {
		MessageFunction7Code[] values = new MessageFunction7Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction7Code> {
		@Override
		public MessageFunction7Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction7Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}