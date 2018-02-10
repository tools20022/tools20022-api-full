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
import com.tools20022.repository.codeset.MessageFunction13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Type of message supporting a service.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#AuthorisationRequest
 * MessageFunction13Code.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#AuthorisationResponse
 * MessageFunction13Code.AuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CancellationAdvice
 * MessageFunction13Code.CancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CancellationAdviceResponse
 * MessageFunction13Code.CancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CancellationRequest
 * MessageFunction13Code.CancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CancellationResponse
 * MessageFunction13Code.CancellationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CompletionAdvice
 * MessageFunction13Code.CompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CompletionAdviceResponse
 * MessageFunction13Code.CompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CurrencyConversionAdvice
 * MessageFunction13Code.CurrencyConversionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CurrencyConversionAdviceResponse
 * MessageFunction13Code.CurrencyConversionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CurrencyConversionRequest
 * MessageFunction13Code.CurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#CurrencyConversionResponse
 * MessageFunction13Code.CurrencyConversionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#DiagnosticRequest
 * MessageFunction13Code.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#DiagnosticResponse
 * MessageFunction13Code.DiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#FinancialAuthorisationRequest
 * MessageFunction13Code.FinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#FinancialAuthorisationResponse
 * MessageFunction13Code.FinancialAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#FinancialCompletionAdvice
 * MessageFunction13Code.FinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#FinancialCompletionAdviceResponse
 * MessageFunction13Code.FinancialCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#FinancialReversalAdvice
 * MessageFunction13Code.FinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#FinancialReversalAdviceResponse
 * MessageFunction13Code.FinancialReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#ReconciliationRequest
 * MessageFunction13Code.ReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#ReconciliationResponse
 * MessageFunction13Code.ReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#ReversalAdvice
 * MessageFunction13Code.ReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code#ReversalAdviceResponse
 * MessageFunction13Code.ReversalAdviceResponse}</li>
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
 * "MessageFunction13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of message supporting a service."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code AuthorisationRequest = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code AuthorisationResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CancellationAdvice = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CancellationAdviceResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CancellationRequest = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CancellationResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CancellationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CompletionAdvice = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CompletionAdviceResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CurrencyConversionAdvice = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CurrencyConversionAdviceResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CurrencyConversionRequest = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code CurrencyConversionResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code DiagnosticRequest = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code DiagnosticResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code FinancialAuthorisationRequest = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code FinancialAuthorisationResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code FinancialCompletionAdvice = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code FinancialCompletionAdviceResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code FinancialReversalAdvice = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code FinancialReversalAdviceResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code ReconciliationRequest = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code ReconciliationResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdvice"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code ReversalAdvice = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdvice";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction13Code
	 * MessageFunction13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdviceResponse"</li>
	 * </ul>
	 */
	public static final MessageFunction13Code ReversalAdviceResponse = new MessageFunction13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdviceResponse";
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction13Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction13Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction13Code";
				definition = "Type of message supporting a service.";
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction13Code.AuthorisationRequest, com.tools20022.repository.codeset.MessageFunction13Code.AuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.CancellationAdvice, com.tools20022.repository.codeset.MessageFunction13Code.CancellationAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.CancellationRequest, com.tools20022.repository.codeset.MessageFunction13Code.CancellationResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.CompletionAdvice, com.tools20022.repository.codeset.MessageFunction13Code.CompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.CurrencyConversionAdvice, com.tools20022.repository.codeset.MessageFunction13Code.CurrencyConversionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.CurrencyConversionRequest, com.tools20022.repository.codeset.MessageFunction13Code.CurrencyConversionResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.DiagnosticRequest, com.tools20022.repository.codeset.MessageFunction13Code.DiagnosticResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.FinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction13Code.FinancialAuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.FinancialCompletionAdvice, com.tools20022.repository.codeset.MessageFunction13Code.FinancialCompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.FinancialReversalAdvice, com.tools20022.repository.codeset.MessageFunction13Code.FinancialReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.ReconciliationRequest, com.tools20022.repository.codeset.MessageFunction13Code.ReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunction13Code.ReversalAdvice, com.tools20022.repository.codeset.MessageFunction13Code.ReversalAdviceResponse);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AuthorisationRequest.getCodeName().get(), AuthorisationRequest);
		codesByName.put(AuthorisationResponse.getCodeName().get(), AuthorisationResponse);
		codesByName.put(CancellationAdvice.getCodeName().get(), CancellationAdvice);
		codesByName.put(CancellationAdviceResponse.getCodeName().get(), CancellationAdviceResponse);
		codesByName.put(CancellationRequest.getCodeName().get(), CancellationRequest);
		codesByName.put(CancellationResponse.getCodeName().get(), CancellationResponse);
		codesByName.put(CompletionAdvice.getCodeName().get(), CompletionAdvice);
		codesByName.put(CompletionAdviceResponse.getCodeName().get(), CompletionAdviceResponse);
		codesByName.put(CurrencyConversionAdvice.getCodeName().get(), CurrencyConversionAdvice);
		codesByName.put(CurrencyConversionAdviceResponse.getCodeName().get(), CurrencyConversionAdviceResponse);
		codesByName.put(CurrencyConversionRequest.getCodeName().get(), CurrencyConversionRequest);
		codesByName.put(CurrencyConversionResponse.getCodeName().get(), CurrencyConversionResponse);
		codesByName.put(DiagnosticRequest.getCodeName().get(), DiagnosticRequest);
		codesByName.put(DiagnosticResponse.getCodeName().get(), DiagnosticResponse);
		codesByName.put(FinancialAuthorisationRequest.getCodeName().get(), FinancialAuthorisationRequest);
		codesByName.put(FinancialAuthorisationResponse.getCodeName().get(), FinancialAuthorisationResponse);
		codesByName.put(FinancialCompletionAdvice.getCodeName().get(), FinancialCompletionAdvice);
		codesByName.put(FinancialCompletionAdviceResponse.getCodeName().get(), FinancialCompletionAdviceResponse);
		codesByName.put(FinancialReversalAdvice.getCodeName().get(), FinancialReversalAdvice);
		codesByName.put(FinancialReversalAdviceResponse.getCodeName().get(), FinancialReversalAdviceResponse);
		codesByName.put(ReconciliationRequest.getCodeName().get(), ReconciliationRequest);
		codesByName.put(ReconciliationResponse.getCodeName().get(), ReconciliationResponse);
		codesByName.put(ReversalAdvice.getCodeName().get(), ReversalAdvice);
		codesByName.put(ReversalAdviceResponse.getCodeName().get(), ReversalAdviceResponse);
	}

	public static MessageFunction13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction13Code[] values() {
		MessageFunction13Code[] values = new MessageFunction13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction13Code> {
		@Override
		public MessageFunction13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}