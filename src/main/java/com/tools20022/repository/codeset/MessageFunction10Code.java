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
import com.tools20022.repository.codeset.MessageFunction10Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#AuthorisationRequest
 * MessageFunction10Code.AuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#AuthorisationResponse
 * MessageFunction10Code.AuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#FinancialAuthorisationRequest
 * MessageFunction10Code.FinancialAuthorisationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#FinancialAuthorisationResponse
 * MessageFunction10Code.FinancialAuthorisationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CompletionAdvice
 * MessageFunction10Code.CompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CompletionAdviceResponse
 * MessageFunction10Code.CompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#FinancialCompletionAdvice
 * MessageFunction10Code.FinancialCompletionAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#FinancialCompletionAdviceResponse
 * MessageFunction10Code.FinancialCompletionAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#ReversalAdvice
 * MessageFunction10Code.ReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#ReversalAdviceResponse
 * MessageFunction10Code.ReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#FinancialReversalAdvice
 * MessageFunction10Code.FinancialReversalAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#FinancialReversalAdviceResponse
 * MessageFunction10Code.FinancialReversalAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CancellationRequest
 * MessageFunction10Code.CancellationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CancellationResponse
 * MessageFunction10Code.CancellationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CancellationAdvice
 * MessageFunction10Code.CancellationAdvice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CancellationAdviceResponse
 * MessageFunction10Code.CancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#DiagnosticRequest
 * MessageFunction10Code.DiagnosticRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#DiagnosticResponse
 * MessageFunction10Code.DiagnosticResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#ReconciliationRequest
 * MessageFunction10Code.ReconciliationRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#ReconciliationResponse
 * MessageFunction10Code.ReconciliationResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CurrencyConversionRequest
 * MessageFunction10Code.CurrencyConversionRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code#CurrencyConversionResponse
 * MessageFunction10Code.CurrencyConversionResponse}</li>
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
 * "MessageFunction10Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the message function within a card payment exchange."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code
 * MessageFunction4Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class MessageFunction10Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#AuthorisationRequest
	 * MessageFunction4Code.AuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code AuthorisationRequest = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationRequest";
			previousVersion_lazy = () -> MessageFunction4Code.AuthorisationRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#AuthorisationResponse
	 * MessageFunction4Code.AuthorisationResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code AuthorisationResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResponse";
			previousVersion_lazy = () -> MessageFunction4Code.AuthorisationResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.AuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialAuthorisationRequest
	 * MessageFunction4Code.FinancialAuthorisationRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code FinancialAuthorisationRequest = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationRequest";
			previousVersion_lazy = () -> MessageFunction4Code.FinancialAuthorisationRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialAuthorisationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialAuthorisationResponse
	 * MessageFunction4Code.FinancialAuthorisationResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code FinancialAuthorisationResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialAuthorisationResponse";
			previousVersion_lazy = () -> MessageFunction4Code.FinancialAuthorisationResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.FinancialAuthorisationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CompletionAdvice
	 * MessageFunction4Code.CompletionAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CompletionAdvice = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdvice";
			previousVersion_lazy = () -> MessageFunction4Code.CompletionAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompletionAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CompletionAdviceResponse
	 * MessageFunction4Code.CompletionAdviceResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CompletionAdviceResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompletionAdviceResponse";
			previousVersion_lazy = () -> MessageFunction4Code.CompletionAdviceResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialCompletionAdvice
	 * MessageFunction4Code.FinancialCompletionAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code FinancialCompletionAdvice = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdvice";
			previousVersion_lazy = () -> MessageFunction4Code.FinancialCompletionAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialCompletionAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialCompletionAdviceResponse
	 * MessageFunction4Code.FinancialCompletionAdviceResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code FinancialCompletionAdviceResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialCompletionAdviceResponse";
			previousVersion_lazy = () -> MessageFunction4Code.FinancialCompletionAdviceResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.FinancialCompletionAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReversalAdvice
	 * MessageFunction4Code.ReversalAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code ReversalAdvice = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdvice";
			previousVersion_lazy = () -> MessageFunction4Code.ReversalAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReversalAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReversalAdviceResponse
	 * MessageFunction4Code.ReversalAdviceResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code ReversalAdviceResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReversalAdviceResponse";
			previousVersion_lazy = () -> MessageFunction4Code.ReversalAdviceResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.ReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialReversalAdvice
	 * MessageFunction4Code.FinancialReversalAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code FinancialReversalAdvice = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdvice";
			previousVersion_lazy = () -> MessageFunction4Code.FinancialReversalAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialReversalAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#FinancialReversalAdviceResponse
	 * MessageFunction4Code.FinancialReversalAdviceResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code FinancialReversalAdviceResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialReversalAdviceResponse";
			previousVersion_lazy = () -> MessageFunction4Code.FinancialReversalAdviceResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.FinancialReversalAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationRequest
	 * MessageFunction4Code.CancellationRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CancellationRequest = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequest";
			previousVersion_lazy = () -> MessageFunction4Code.CancellationRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CancellationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationResponse
	 * MessageFunction4Code.CancellationResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CancellationResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationResponse";
			previousVersion_lazy = () -> MessageFunction4Code.CancellationResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CancellationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdvice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationAdvice
	 * MessageFunction4Code.CancellationAdvice}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CancellationAdvice = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdvice";
			previousVersion_lazy = () -> MessageFunction4Code.CancellationAdvice;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdvice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationAdviceResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CancellationAdviceResponse
	 * MessageFunction4Code.CancellationAdviceResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CancellationAdviceResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationAdviceResponse";
			previousVersion_lazy = () -> MessageFunction4Code.CancellationAdviceResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CancellationAdviceResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#DiagnosticRequest
	 * MessageFunction4Code.DiagnosticRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code DiagnosticRequest = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticRequest";
			previousVersion_lazy = () -> MessageFunction4Code.DiagnosticRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DiagnosticResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#DiagnosticResponse
	 * MessageFunction4Code.DiagnosticResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code DiagnosticResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DiagnosticResponse";
			previousVersion_lazy = () -> MessageFunction4Code.DiagnosticResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.DiagnosticResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReconciliationRequest
	 * MessageFunction4Code.ReconciliationRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code ReconciliationRequest = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationRequest";
			previousVersion_lazy = () -> MessageFunction4Code.ReconciliationRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#ReconciliationResponse
	 * MessageFunction4Code.ReconciliationResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code ReconciliationResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationResponse";
			previousVersion_lazy = () -> MessageFunction4Code.ReconciliationResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.ReconciliationResponse.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CurrencyConversionRequest
	 * MessageFunction4Code.CurrencyConversionRequest}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CurrencyConversionRequest = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionRequest";
			previousVersion_lazy = () -> MessageFunction4Code.CurrencyConversionRequest;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction10Code
	 * MessageFunction10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction4Code#CurrencyConversionResponse
	 * MessageFunction4Code.CurrencyConversionResponse}</li>
	 * </ul>
	 */
	public static final MessageFunction10Code CurrencyConversionResponse = new MessageFunction10Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversionResponse";
			previousVersion_lazy = () -> MessageFunction4Code.CurrencyConversionResponse;
			owner_lazy = () -> com.tools20022.repository.codeset.MessageFunction10Code.mmObject();
			codeName = MessageFunctionCode.CurrencyConversionResponse.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, MessageFunction10Code> codesByName = new LinkedHashMap<>();

	protected MessageFunction10Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AUTQ");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MessageFunction10Code";
				definition = "Identifies the message function within a card payment exchange.";
				previousVersion_lazy = () -> MessageFunction4Code.mmObject();
				trace_lazy = () -> MessageFunctionCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.MessageFunction10Code.AuthorisationRequest, com.tools20022.repository.codeset.MessageFunction10Code.AuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.FinancialAuthorisationRequest, com.tools20022.repository.codeset.MessageFunction10Code.FinancialAuthorisationResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.CompletionAdvice, com.tools20022.repository.codeset.MessageFunction10Code.CompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.FinancialCompletionAdvice, com.tools20022.repository.codeset.MessageFunction10Code.FinancialCompletionAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.ReversalAdvice, com.tools20022.repository.codeset.MessageFunction10Code.ReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.FinancialReversalAdvice, com.tools20022.repository.codeset.MessageFunction10Code.FinancialReversalAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.CancellationRequest, com.tools20022.repository.codeset.MessageFunction10Code.CancellationResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.CancellationAdvice, com.tools20022.repository.codeset.MessageFunction10Code.CancellationAdviceResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.DiagnosticRequest, com.tools20022.repository.codeset.MessageFunction10Code.DiagnosticResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.ReconciliationRequest, com.tools20022.repository.codeset.MessageFunction10Code.ReconciliationResponse,
						com.tools20022.repository.codeset.MessageFunction10Code.CurrencyConversionRequest, com.tools20022.repository.codeset.MessageFunction10Code.CurrencyConversionResponse);
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
		codesByName.put(CurrencyConversionRequest.getCodeName().get(), CurrencyConversionRequest);
		codesByName.put(CurrencyConversionResponse.getCodeName().get(), CurrencyConversionResponse);
	}

	public static MessageFunction10Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static MessageFunction10Code[] values() {
		MessageFunction10Code[] values = new MessageFunction10Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, MessageFunction10Code> {
		@Override
		public MessageFunction10Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(MessageFunction10Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}