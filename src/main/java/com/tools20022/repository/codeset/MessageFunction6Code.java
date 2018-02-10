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
import com.tools20022.repository.codeset.MessageFunction6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the type of process related to the message. It partially
 * correspond to the message type identifier (MTI) of ISO 8583.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReconciliationAdvice
 * MessageFunction6Code.AcquirerReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReconciliationNotification
 * MessageFunction6Code.AcquirerReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReconciliationRequest
 * MessageFunction6Code.AcquirerReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReject
 * MessageFunction6Code.AcquirerReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReversalAdvice
 * MessageFunction6Code.AcquirerReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReversalNotification
 * MessageFunction6Code.AcquirerReversalNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AcquirerReversalRequest
 * MessageFunction6Code.AcquirerReversalRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AgentReconciliationAdvice
 * MessageFunction6Code.AgentReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AgentReconciliationNotification
 * MessageFunction6Code.AgentReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AgentReconciliationRequest
 * MessageFunction6Code.AgentReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AgentReject
 * MessageFunction6Code.AgentReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AuthorisationAdvice
 * MessageFunction6Code.AuthorisationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AuthorisationNotification
 * MessageFunction6Code.AuthorisationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AuthorisationRequest
 * MessageFunction6Code.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#AuthorisationResponse
 * MessageFunction6Code.AuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#FinancialAdvice
 * MessageFunction6Code.FinancialAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#FinancialNotification
 * MessageFunction6Code.FinancialNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#FinancialRequest
 * MessageFunction6Code.FinancialRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#IssuerReconciliationAdvice
 * MessageFunction6Code.IssuerReconciliationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#IssuerReconciliationNotification
 * MessageFunction6Code.IssuerReconciliationNotification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#IssuerReconciliationRequest
 * MessageFunction6Code.IssuerReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#IssuerReject
 * MessageFunction6Code.IssuerReject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#KeyExchangeAdvice
 * MessageFunction6Code.KeyExchangeAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#KeyExchangeRequest
 * MessageFunction6Code.KeyExchangeRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#NetworkManagementAdvice
 * MessageFunction6Code.NetworkManagementAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code#NetworkManagementRequest
 * MessageFunction6Code.NetworkManagementRequest}</li>
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
 * "MessageFunction6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the type of process related to the message. It partially correspond to the message type identifier (MTI) of ISO 8583."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReconciliationAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReconciliationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationNotification"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReconciliationNotification = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReconciliationNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReconciliationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReconciliationRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReconciliationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReject"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReject = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReject";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReversalAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalNotification"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReversalNotification = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReversalNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerReversalRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AcquirerReversalRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerReversalRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AcquirerReversalRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AgentReconciliationAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AgentReconciliationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationNotification"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AgentReconciliationNotification = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AgentReconciliationNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReconciliationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AgentReconciliationRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReconciliationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AgentReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentReject"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AgentReject = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentReject";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AgentReject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AuthorisationAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationNotification"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AuthorisationNotification = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AuthorisationRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code AuthorisationResponse = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code FinancialAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.FinancialAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialNotification"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code FinancialNotification = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.FinancialNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code FinancialRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.FinancialRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code IssuerReconciliationAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.IssuerReconciliationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationNotification"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code IssuerReconciliationNotification = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationNotification";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.IssuerReconciliationNotification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReconciliationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code IssuerReconciliationRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReconciliationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.IssuerReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerReject"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code IssuerReject = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerReject";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.IssuerReject.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code KeyExchangeAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.KeyExchangeAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "KeyExchangeRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code KeyExchangeRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "KeyExchangeRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.KeyExchangeRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code NetworkManagementAdvice = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.NetworkManagementAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetworkManagementRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction6Code NetworkManagementRequest = new MessageFunction6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetworkManagementRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction6Code.mmObject();
			codeName = MessageFunctionCode.NetworkManagementRequest.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction6Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction6Code";
				definition = "Identifies the type of process related to the message. It partially correspond to the message type identifier (MTI) of ISO 8583.";
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReconciliationAdvice, com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReconciliationNotification,
						com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReconciliationRequest, com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReject,
						com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReversalAdvice, com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReversalNotification,
						com.tools20022.repository.codeset.MessageFunction6Code.AcquirerReversalRequest, com.tools20022.repository.codeset.MessageFunction6Code.AgentReconciliationAdvice,
						com.tools20022.repository.codeset.MessageFunction6Code.AgentReconciliationNotification, com.tools20022.repository.codeset.MessageFunction6Code.AgentReconciliationRequest,
						com.tools20022.repository.codeset.MessageFunction6Code.AgentReject, com.tools20022.repository.codeset.MessageFunction6Code.AuthorisationAdvice,
						com.tools20022.repository.codeset.MessageFunction6Code.AuthorisationNotification, com.tools20022.repository.codeset.MessageFunction6Code.AuthorisationRequest,
						com.tools20022.repository.codeset.MessageFunction6Code.AuthorisationResponse, com.tools20022.repository.codeset.MessageFunction6Code.FinancialAdvice,
						com.tools20022.repository.codeset.MessageFunction6Code.FinancialNotification, com.tools20022.repository.codeset.MessageFunction6Code.FinancialRequest,
						com.tools20022.repository.codeset.MessageFunction6Code.IssuerReconciliationAdvice, com.tools20022.repository.codeset.MessageFunction6Code.IssuerReconciliationNotification,
						com.tools20022.repository.codeset.MessageFunction6Code.IssuerReconciliationRequest, com.tools20022.repository.codeset.MessageFunction6Code.IssuerReject,
						com.tools20022.repository.codeset.MessageFunction6Code.KeyExchangeAdvice, com.tools20022.repository.codeset.MessageFunction6Code.KeyExchangeRequest,
						com.tools20022.repository.codeset.MessageFunction6Code.NetworkManagementAdvice, com.tools20022.repository.codeset.MessageFunction6Code.NetworkManagementRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcquirerReconciliationAdvice.getCodeName().get(), AcquirerReconciliationAdvice);
		codesByName.put(AcquirerReconciliationNotification.getCodeName().get(), AcquirerReconciliationNotification);
		codesByName.put(AcquirerReconciliationRequest.getCodeName().get(), AcquirerReconciliationRequest);
		codesByName.put(AcquirerReject.getCodeName().get(), AcquirerReject);
		codesByName.put(AcquirerReversalAdvice.getCodeName().get(), AcquirerReversalAdvice);
		codesByName.put(AcquirerReversalNotification.getCodeName().get(), AcquirerReversalNotification);
		codesByName.put(AcquirerReversalRequest.getCodeName().get(), AcquirerReversalRequest);
		codesByName.put(AgentReconciliationAdvice.getCodeName().get(), AgentReconciliationAdvice);
		codesByName.put(AgentReconciliationNotification.getCodeName().get(), AgentReconciliationNotification);
		codesByName.put(AgentReconciliationRequest.getCodeName().get(), AgentReconciliationRequest);
		codesByName.put(AgentReject.getCodeName().get(), AgentReject);
		codesByName.put(AuthorisationAdvice.getCodeName().get(), AuthorisationAdvice);
		codesByName.put(AuthorisationNotification.getCodeName().get(), AuthorisationNotification);
		codesByName.put(AuthorisationRequest.getCodeName().get(), AuthorisationRequest);
		codesByName.put(AuthorisationResponse.getCodeName().get(), AuthorisationResponse);
		codesByName.put(FinancialAdvice.getCodeName().get(), FinancialAdvice);
		codesByName.put(FinancialNotification.getCodeName().get(), FinancialNotification);
		codesByName.put(FinancialRequest.getCodeName().get(), FinancialRequest);
		codesByName.put(IssuerReconciliationAdvice.getCodeName().get(), IssuerReconciliationAdvice);
		codesByName.put(IssuerReconciliationNotification.getCodeName().get(), IssuerReconciliationNotification);
		codesByName.put(IssuerReconciliationRequest.getCodeName().get(), IssuerReconciliationRequest);
		codesByName.put(IssuerReject.getCodeName().get(), IssuerReject);
		codesByName.put(KeyExchangeAdvice.getCodeName().get(), KeyExchangeAdvice);
		codesByName.put(KeyExchangeRequest.getCodeName().get(), KeyExchangeRequest);
		codesByName.put(NetworkManagementAdvice.getCodeName().get(), NetworkManagementAdvice);
		codesByName.put(NetworkManagementRequest.getCodeName().get(), NetworkManagementRequest);
	}

	public static MessageFunction6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction6Code[] values() {
		MessageFunction6Code[] values = new MessageFunction6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction6Code> {
		@Override
		public MessageFunction6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}