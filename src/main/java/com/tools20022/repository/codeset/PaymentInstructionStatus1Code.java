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
import com.tools20022.repository.codeset.PaymentInstructionStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the state of a payment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Accepted
 * PaymentInstructionStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Validated
 * PaymentInstructionStatus1Code.Validated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Authorised
 * PaymentInstructionStatus1Code.Authorised}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Invalid
 * PaymentInstructionStatus1Code.Invalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Matched
 * PaymentInstructionStatus1Code.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Unmatched
 * PaymentInstructionStatus1Code.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Mismatched
 * PaymentInstructionStatus1Code.Mismatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#SettlementEligible
 * PaymentInstructionStatus1Code.SettlementEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#SettlementMature
 * PaymentInstructionStatus1Code.SettlementMature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Suspended
 * PaymentInstructionStatus1Code.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#PendingCancellation
 * PaymentInstructionStatus1Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#PendingSettlement
 * PaymentInstructionStatus1Code.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#PendingFailingSettlement
 * PaymentInstructionStatus1Code.PendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#SenderMultilateralLimitRelated
 * PaymentInstructionStatus1Code.SenderMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#ReceiverMultilateralLimitRelated
 * PaymentInstructionStatus1Code.ReceiverMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#SenderReceiverBilateralLimitRelated
 * PaymentInstructionStatus1Code.SenderReceiverBilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Settled
 * PaymentInstructionStatus1Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Rejected
 * PaymentInstructionStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Cancelled
 * PaymentInstructionStatus1Code.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code#Finalised
 * PaymentInstructionStatus1Code.Finalised}</li>
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
 * "PaymentInstructionStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the state of a payment."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PaymentInstructionStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Accepted = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validated"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Validated = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Validated";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Validated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorised"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Authorised = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorised";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Authorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Invalid = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Matched = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Unmatched = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mismatched"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Mismatched = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mismatched";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Mismatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementEligible"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code SettlementEligible = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SettlementEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code SettlementMature = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SettlementMature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Suspended = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code PendingCancellation = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code PendingSettlement = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code PendingFailingSettlement = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingFailingSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code SenderMultilateralLimitRelated = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code ReceiverMultilateralLimitRelated = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.ReceiverMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverBilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code SenderReceiverBilateralLimitRelated = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverBilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderReceiverBilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Settled = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Rejected = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Cancelled = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PaymentInstructionStatus1Code
	 * PaymentInstructionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Finalised"</li>
	 * </ul>
	 */
	public static final PaymentInstructionStatus1Code Finalised = new PaymentInstructionStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Finalised";
			owner_lazy = () -> com.tools20022.repository.codeset.PaymentInstructionStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Finalised.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PaymentInstructionStatus1Code> codesByName = new LinkedHashMap<>();

	protected PaymentInstructionStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PaymentInstructionStatus1Code";
				definition = "Specifies the state of a payment.";
				trace_lazy = () -> PaymentInstructionStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Accepted, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Validated,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Authorised, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Invalid,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Matched, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Unmatched,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Mismatched, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.SettlementEligible,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.SettlementMature, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Suspended,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.PendingCancellation, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.PendingSettlement,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.PendingFailingSettlement, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.SenderMultilateralLimitRelated,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.ReceiverMultilateralLimitRelated, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.SenderReceiverBilateralLimitRelated,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Settled, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Rejected,
						com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Cancelled, com.tools20022.repository.codeset.PaymentInstructionStatus1Code.Finalised);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Accepted.getCodeName().get(), Accepted);
		codesByName.put(Validated.getCodeName().get(), Validated);
		codesByName.put(Authorised.getCodeName().get(), Authorised);
		codesByName.put(Invalid.getCodeName().get(), Invalid);
		codesByName.put(Matched.getCodeName().get(), Matched);
		codesByName.put(Unmatched.getCodeName().get(), Unmatched);
		codesByName.put(Mismatched.getCodeName().get(), Mismatched);
		codesByName.put(SettlementEligible.getCodeName().get(), SettlementEligible);
		codesByName.put(SettlementMature.getCodeName().get(), SettlementMature);
		codesByName.put(Suspended.getCodeName().get(), Suspended);
		codesByName.put(PendingCancellation.getCodeName().get(), PendingCancellation);
		codesByName.put(PendingSettlement.getCodeName().get(), PendingSettlement);
		codesByName.put(PendingFailingSettlement.getCodeName().get(), PendingFailingSettlement);
		codesByName.put(SenderMultilateralLimitRelated.getCodeName().get(), SenderMultilateralLimitRelated);
		codesByName.put(ReceiverMultilateralLimitRelated.getCodeName().get(), ReceiverMultilateralLimitRelated);
		codesByName.put(SenderReceiverBilateralLimitRelated.getCodeName().get(), SenderReceiverBilateralLimitRelated);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Finalised.getCodeName().get(), Finalised);
	}

	public static PaymentInstructionStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PaymentInstructionStatus1Code[] values() {
		PaymentInstructionStatus1Code[] values = new PaymentInstructionStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PaymentInstructionStatus1Code> {
		@Override
		public PaymentInstructionStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PaymentInstructionStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}