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
import com.tools20022.repository.codeset.MessageFunction1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the message function within a card payment exchange.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#AuthorisationRequest
 * MessageFunction1Code.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#AuthorisationResponse
 * MessageFunction1Code.AuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#FinancialAuthorisationRequest
 * MessageFunction1Code.FinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#FinancialAuthorisationResponse
 * MessageFunction1Code.FinancialAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#CompletionAdvice
 * MessageFunction1Code.CompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#CompletionAdviceResponse
 * MessageFunction1Code.CompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#FinancialCompletionAdvice
 * MessageFunction1Code.FinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#FinancialCompletionAdviceResponse
 * MessageFunction1Code.FinancialCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#ReversalAdvice
 * MessageFunction1Code.ReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#ReversalAdviceResponse
 * MessageFunction1Code.ReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#FinancialReversalAdvice
 * MessageFunction1Code.FinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#FinancialReversalAdviceResponse
 * MessageFunction1Code.FinancialReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#CancellationRequest
 * MessageFunction1Code.CancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#CancellationResponse
 * MessageFunction1Code.CancellationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#CancellationAdvice
 * MessageFunction1Code.CancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#CancellationAdviceResponse
 * MessageFunction1Code.CancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#DiagnosticRequest
 * MessageFunction1Code.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#DiagnosticResponse
 * MessageFunction1Code.DiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#ReconciliationRequest
 * MessageFunction1Code.ReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#ReconciliationResponse
 * MessageFunction1Code.ReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code#Rejection
 * MessageFunction1Code.Rejection}</li>
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
 * "MessageFunction1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the message function within a card payment exchange."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.MessageFunction4Code
 * MessageFunction4Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#AuthorisationRequest
	 * MessageFunction4Code.AuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code AuthorisationRequest = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.AuthorisationRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#AuthorisationResponse
	 * MessageFunction4Code.AuthorisationResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code AuthorisationResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.AuthorisationResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialAuthorisationRequest
	 * MessageFunction4Code.FinancialAuthorisationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code FinancialAuthorisationRequest = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.FinancialAuthorisationRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialAuthorisationResponse
	 * MessageFunction4Code.FinancialAuthorisationResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code FinancialAuthorisationResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.FinancialAuthorisationResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CompletionAdvice
	 * MessageFunction4Code.CompletionAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code CompletionAdvice = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.CompletionAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdviceResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CompletionAdviceResponse
	 * MessageFunction4Code.CompletionAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code CompletionAdviceResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdviceResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.CompletionAdviceResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialCompletionAdvice
	 * MessageFunction4Code.FinancialCompletionAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code FinancialCompletionAdvice = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.FinancialCompletionAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdviceResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialCompletionAdviceResponse
	 * MessageFunction4Code.FinancialCompletionAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code FinancialCompletionAdviceResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdviceResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.FinancialCompletionAdviceResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReversalAdvice
	 * MessageFunction4Code.ReversalAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code ReversalAdvice = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.ReversalAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdviceResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReversalAdviceResponse
	 * MessageFunction4Code.ReversalAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code ReversalAdviceResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdviceResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.ReversalAdviceResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialReversalAdvice
	 * MessageFunction4Code.FinancialReversalAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code FinancialReversalAdvice = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.FinancialReversalAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdviceResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialReversalAdviceResponse
	 * MessageFunction4Code.FinancialReversalAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code FinancialReversalAdviceResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdviceResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.FinancialReversalAdviceResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationRequest
	 * MessageFunction4Code.CancellationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code CancellationRequest = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.CancellationRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.CancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationResponse
	 * MessageFunction4Code.CancellationResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code CancellationResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.CancellationResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.CancellationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationAdvice
	 * MessageFunction4Code.CancellationAdvice}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code CancellationAdvice = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdvice";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.CancellationAdvice);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationAdviceResponse
	 * MessageFunction4Code.CancellationAdviceResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code CancellationAdviceResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdviceResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.CancellationAdviceResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#DiagnosticRequest
	 * MessageFunction4Code.DiagnosticRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code DiagnosticRequest = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.DiagnosticRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#DiagnosticResponse
	 * MessageFunction4Code.DiagnosticResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code DiagnosticResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.DiagnosticResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReconciliationRequest
	 * MessageFunction4Code.ReconciliationRequest}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code ReconciliationRequest = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.ReconciliationRequest);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationResponse"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReconciliationResponse
	 * MessageFunction4Code.ReconciliationResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code ReconciliationResponse = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationResponse";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.ReconciliationResponse);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction1Code
	 * MessageFunction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejection"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#Rejection
	 * MessageFunction4Code.Rejection}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MessageFunction1Code Rejection = new MessageFunction1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejection";
			nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.Rejection);
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction1Code.mmObject();
			codeName = MessageFunctionCode.Rejection.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction1Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction1Code";
				definition = "Identifies the message function within a card payment exchange.";
				nextVersions_lazy = () -> Arrays.asList(MessageFunction4Code.mmObject());
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction1Code.AuthorisationRequest, com.tools20022.repository.codeset.MessageFunction1Code.AuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.FinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction1Code.FinancialAuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.CompletionAdvice, com.tools20022.repository.codeset.MessageFunction1Code.CompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.FinancialCompletionAdvice, com.tools20022.repository.codeset.MessageFunction1Code.FinancialCompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.ReversalAdvice, com.tools20022.repository.codeset.MessageFunction1Code.ReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.FinancialReversalAdvice, com.tools20022.repository.codeset.MessageFunction1Code.FinancialReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.CancellationRequest, com.tools20022.repository.codeset.MessageFunction1Code.CancellationResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.CancellationAdvice, com.tools20022.repository.codeset.MessageFunction1Code.CancellationAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.DiagnosticRequest, com.tools20022.repository.codeset.MessageFunction1Code.DiagnosticResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.ReconciliationRequest, com.tools20022.repository.codeset.MessageFunction1Code.ReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunction1Code.Rejection);
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
		codesByName.put(Rejection.getCodeName().get(), Rejection);
	}

	public static MessageFunction1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction1Code[] values() {
		MessageFunction1Code[] values = new MessageFunction1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction1Code> {
		@Override
		public MessageFunction1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}