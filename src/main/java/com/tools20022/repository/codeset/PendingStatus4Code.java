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
import com.tools20022.repository.codeset.PendingStatus4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates that the state of a payment at the clearing agent side is pending.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Accepted
 * PendingStatus4Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Validated
 * PendingStatus4Code.Validated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Matched
 * PendingStatus4Code.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Authorised
 * PendingStatus4Code.Authorised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Invalid
 * PendingStatus4Code.Invalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Unmatched
 * PendingStatus4Code.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#SettlementEligible
 * PendingStatus4Code.SettlementEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#SettlementMature
 * PendingStatus4Code.SettlementMature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#Suspended
 * PendingStatus4Code.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#PendingCancellation
 * PendingStatus4Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#PendingSettlement
 * PendingStatus4Code.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#PendingFailingSettlement
 * PendingStatus4Code.PendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#SenderMultilateralLimitRelated
 * PendingStatus4Code.SenderMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#ReceiverMultilateralLimitRelated
 * PendingStatus4Code.ReceiverMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#SenderReceiverBilateralLimitRelated
 * PendingStatus4Code.SenderReceiverBilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#HeldForServiceAvailability
 * PendingStatus4Code.HeldForServiceAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code#SenderReceiverMultilateralLimitRelated
 * PendingStatus4Code.SenderReceiverMultilateralLimitRelated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatusCode
 * PaymentInstructionStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACPD"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PendingStatus4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that the state of a payment at the clearing agent side is pending."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingStatus4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Accepted = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validated"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Validated = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Validated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Validated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Matched = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorised"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Authorised = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorised";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Authorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Invalid = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Unmatched = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementEligible"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code SettlementEligible = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.SettlementEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code SettlementMature = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.SettlementMature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code Suspended = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code PendingCancellation = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code PendingSettlement = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code PendingFailingSettlement = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingFailingSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code SenderMultilateralLimitRelated = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code ReceiverMultilateralLimitRelated = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.ReceiverMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverBilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code SenderReceiverBilateralLimitRelated = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverBilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderReceiverBilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HeldForServiceAvailability"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code HeldForServiceAvailability = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HeldForServiceAvailability";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.HeldForServiceAvailability.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus4Code
	 * PendingStatus4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus4Code SenderReceiverMultilateralLimitRelated = new PendingStatus4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus4Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderReceiverMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingStatus4Code> codesByName = new LinkedHashMap<>();

	protected PendingStatus4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingStatus4Code";
				definition = "Indicates that the state of a payment at the clearing agent side is pending.";
				trace_lazy = () -> PaymentInstructionStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingStatus4Code.Accepted, com.tools20022.repository.codeset.PendingStatus4Code.Validated, com.tools20022.repository.codeset.PendingStatus4Code.Matched,
						com.tools20022.repository.codeset.PendingStatus4Code.Authorised, com.tools20022.repository.codeset.PendingStatus4Code.Invalid, com.tools20022.repository.codeset.PendingStatus4Code.Unmatched,
						com.tools20022.repository.codeset.PendingStatus4Code.SettlementEligible, com.tools20022.repository.codeset.PendingStatus4Code.SettlementMature, com.tools20022.repository.codeset.PendingStatus4Code.Suspended,
						com.tools20022.repository.codeset.PendingStatus4Code.PendingCancellation, com.tools20022.repository.codeset.PendingStatus4Code.PendingSettlement,
						com.tools20022.repository.codeset.PendingStatus4Code.PendingFailingSettlement, com.tools20022.repository.codeset.PendingStatus4Code.SenderMultilateralLimitRelated,
						com.tools20022.repository.codeset.PendingStatus4Code.ReceiverMultilateralLimitRelated, com.tools20022.repository.codeset.PendingStatus4Code.SenderReceiverBilateralLimitRelated,
						com.tools20022.repository.codeset.PendingStatus4Code.HeldForServiceAvailability, com.tools20022.repository.codeset.PendingStatus4Code.SenderReceiverMultilateralLimitRelated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Validated.getCodeName().get(), Validated);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Authorised.getCodeName().get(), Authorised);
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(SettlementEligible.getCodeName().get(), SettlementEligible);
		codesByName.put(SettlementMature.getCodeName().get(), SettlementMature);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(PendingSettlement.getCodeName().get(), PendingSettlement);
		codesByName.put(PendingFailingSettlement.getCodeName().get(), PendingFailingSettlement);
		codesByName.put(SenderMultilateralLimitRelated.getCodeName().get(), SenderMultilateralLimitRelated);
		codesByName.put(ReceiverMultilateralLimitRelated.getCodeName().get(), ReceiverMultilateralLimitRelated);
		codesByName.put(SenderReceiverBilateralLimitRelated.getCodeName().get(), SenderReceiverBilateralLimitRelated);
		codesByName.put(HeldForServiceAvailability.getCodeName().get(), HeldForServiceAvailability);
		codesByName.put(SenderReceiverMultilateralLimitRelated.getCodeName().get(), SenderReceiverMultilateralLimitRelated);
	}

	public static PendingStatus4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingStatus4Code[] values() {
		PendingStatus4Code[] values = new PendingStatus4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingStatus4Code> {
		@Override
		public PendingStatus4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingStatus4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}