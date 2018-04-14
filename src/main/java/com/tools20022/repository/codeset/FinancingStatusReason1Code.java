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
import com.tools20022.repository.codeset.FinancingStatusReason1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the coded reason for the financing status.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#CancellationRequestOutOfTime
 * FinancingStatusReason1Code.CancellationRequestOutOfTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#NoMatchingFinancingRequest
 * FinancingStatusReason1Code.NoMatchingFinancingRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#IncorrectAccountNumber
 * FinancingStatusReason1Code.IncorrectAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#ClosedAccountNumber
 * FinancingStatusReason1Code.ClosedAccountNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#BlockedAccount
 * FinancingStatusReason1Code.BlockedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#UnrecognisedFinancingRequestor
 * FinancingStatusReason1Code.UnrecognisedFinancingRequestor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#UnrecognisedIntermediaryAgent
 * FinancingStatusReason1Code.UnrecognisedIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#UnexpectedIntermediaryAgent
 * FinancingStatusReason1Code.UnexpectedIntermediaryAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#UnrecognisedParty
 * FinancingStatusReason1Code.UnrecognisedParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#InvalidPaymentDueDate
 * FinancingStatusReason1Code.InvalidPaymentDueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#DuplicatedRequestMessage
 * FinancingStatusReason1Code.DuplicatedRequestMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#WrongIdentification
 * FinancingStatusReason1Code.WrongIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#InvalidDocumentNumber
 * FinancingStatusReason1Code.InvalidDocumentNumber}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#MissingMandatoryInformation
 * FinancingStatusReason1Code.MissingMandatoryInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#Narrative
 * FinancingStatusReason1Code.Narrative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code#FinancingProcessAlreadyInitiated
 * FinancingStatusReason1Code.FinancingProcessAlreadyInitiated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReasonCode
 * FinancingStatusReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingStatusReason1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the coded reason for the financing status."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CA01"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class FinancingStatusReason1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestOutOfTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code CancellationRequestOutOfTime = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestOutOfTime";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.CancellationRequestOutOfTime.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoMatchingFinancingRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code NoMatchingFinancingRequest = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoMatchingFinancingRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.NoMatchingFinancingRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncorrectAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code IncorrectAccountNumber = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncorrectAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.IncorrectAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosedAccountNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code ClosedAccountNumber = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosedAccountNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.ClosedAccountNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code BlockedAccount = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BlockedAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.BlockedAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedFinancingRequestor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code UnrecognisedFinancingRequestor = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedFinancingRequestor";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.UnrecognisedFinancingRequestor.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedIntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code UnrecognisedIntermediaryAgent = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedIntermediaryAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.UnrecognisedIntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnexpectedIntermediaryAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code UnexpectedIntermediaryAgent = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnexpectedIntermediaryAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.UnexpectedIntermediaryAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnrecognisedParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code UnrecognisedParty = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnrecognisedParty";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.UnrecognisedParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidPaymentDueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code InvalidPaymentDueDate = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidPaymentDueDate";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.InvalidPaymentDueDate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DuplicatedRequestMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code DuplicatedRequestMessage = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DuplicatedRequestMessage";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.DuplicatedRequestMessage.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WrongIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code WrongIdentification = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WrongIdentification";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.WrongIdentification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvalidDocumentNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code InvalidDocumentNumber = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvalidDocumentNumber";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.InvalidDocumentNumber.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MissingMandatoryInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code MissingMandatoryInformation = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MissingMandatoryInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.MissingMandatoryInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Narrative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code Narrative = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Narrative";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.Narrative.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.FinancingStatusReason1Code
	 * FinancingStatusReason1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancingProcessAlreadyInitiated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final FinancingStatusReason1Code FinancingProcessAlreadyInitiated = new FinancingStatusReason1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancingProcessAlreadyInitiated";
			owner_lazy = () -> com.tools20022.repository.codeset.FinancingStatusReason1Code.mmObject();
			codeName = FinancingStatusReasonCode.FinancingProcessAlreadyInitiated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, FinancingStatusReason1Code> codesByName = new LinkedHashMap<>();

	protected FinancingStatusReason1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CA01");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingStatusReason1Code";
				definition = "Specifies the coded reason for the financing status.";
				trace_lazy = () -> FinancingStatusReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.FinancingStatusReason1Code.CancellationRequestOutOfTime, com.tools20022.repository.codeset.FinancingStatusReason1Code.NoMatchingFinancingRequest,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.IncorrectAccountNumber, com.tools20022.repository.codeset.FinancingStatusReason1Code.ClosedAccountNumber,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.BlockedAccount, com.tools20022.repository.codeset.FinancingStatusReason1Code.UnrecognisedFinancingRequestor,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.UnrecognisedIntermediaryAgent, com.tools20022.repository.codeset.FinancingStatusReason1Code.UnexpectedIntermediaryAgent,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.UnrecognisedParty, com.tools20022.repository.codeset.FinancingStatusReason1Code.InvalidPaymentDueDate,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.DuplicatedRequestMessage, com.tools20022.repository.codeset.FinancingStatusReason1Code.WrongIdentification,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.InvalidDocumentNumber, com.tools20022.repository.codeset.FinancingStatusReason1Code.MissingMandatoryInformation,
						com.tools20022.repository.codeset.FinancingStatusReason1Code.Narrative, com.tools20022.repository.codeset.FinancingStatusReason1Code.FinancingProcessAlreadyInitiated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancellationRequestOutOfTime.getCodeName().get(), CancellationRequestOutOfTime);
		codesByName.put(NoMatchingFinancingRequest.getCodeName().get(), NoMatchingFinancingRequest);
		codesByName.put(IncorrectAccountNumber.getCodeName().get(), IncorrectAccountNumber);
		codesByName.put(ClosedAccountNumber.getCodeName().get(), ClosedAccountNumber);
		codesByName.put(BlockedAccount.getCodeName().get(), BlockedAccount);
		codesByName.put(UnrecognisedFinancingRequestor.getCodeName().get(), UnrecognisedFinancingRequestor);
		codesByName.put(UnrecognisedIntermediaryAgent.getCodeName().get(), UnrecognisedIntermediaryAgent);
		codesByName.put(UnexpectedIntermediaryAgent.getCodeName().get(), UnexpectedIntermediaryAgent);
		codesByName.put(UnrecognisedParty.getCodeName().get(), UnrecognisedParty);
		codesByName.put(InvalidPaymentDueDate.getCodeName().get(), InvalidPaymentDueDate);
		codesByName.put(DuplicatedRequestMessage.getCodeName().get(), DuplicatedRequestMessage);
		codesByName.put(WrongIdentification.getCodeName().get(), WrongIdentification);
		codesByName.put(InvalidDocumentNumber.getCodeName().get(), InvalidDocumentNumber);
		codesByName.put(MissingMandatoryInformation.getCodeName().get(), MissingMandatoryInformation);
		codesByName.put(Narrative.getCodeName().get(), Narrative);
		codesByName.put(FinancingProcessAlreadyInitiated.getCodeName().get(), FinancingProcessAlreadyInitiated);
	}

	public static FinancingStatusReason1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static FinancingStatusReason1Code[] values() {
		FinancingStatusReason1Code[] values = new FinancingStatusReason1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, FinancingStatusReason1Code> {
		@Override
		public FinancingStatusReason1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(FinancingStatusReason1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}