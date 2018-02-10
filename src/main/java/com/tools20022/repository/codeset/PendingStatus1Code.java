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
import com.tools20022.repository.codeset.PendingStatus1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Accepted
 * PendingStatus1Code.Accepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Validated
 * PendingStatus1Code.Validated}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Matched
 * PendingStatus1Code.Matched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Authorised
 * PendingStatus1Code.Authorised}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Invalid
 * PendingStatus1Code.Invalid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Unmatched
 * PendingStatus1Code.Unmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#SettlementEligible
 * PendingStatus1Code.SettlementEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#SettlementMature
 * PendingStatus1Code.SettlementMature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#Suspended
 * PendingStatus1Code.Suspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#PendingCancellation
 * PendingStatus1Code.PendingCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#PendingSettlement
 * PendingStatus1Code.PendingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#PendingFailingSettlement
 * PendingStatus1Code.PendingFailingSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#SenderMultilateralLimitRelated
 * PendingStatus1Code.SenderMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#ReceiverMultilateralLimitRelated
 * PendingStatus1Code.ReceiverMultilateralLimitRelated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code#SenderReceiverBilateralLimitRelated
 * PendingStatus1Code.SenderReceiverBilateralLimitRelated}</li>
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
 * "PendingStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates that the state of a payment at the clearing agent side is pending."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PendingStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Accepted = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Accepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Validated"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Validated = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Validated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Validated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Matched = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Matched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Authorised"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Authorised = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Authorised";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Authorised.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Invalid"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Invalid = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Invalid";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Invalid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Unmatched = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Unmatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementEligible"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code SettlementEligible = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SettlementEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementMature"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code SettlementMature = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementMature";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SettlementMature.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Suspended"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code Suspended = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Suspended";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.Suspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellation"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code PendingCancellation = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingSettlement"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code PendingSettlement = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingFailingSettlement"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code PendingFailingSettlement = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingFailingSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.PendingFailingSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code SenderMultilateralLimitRelated = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverMultilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code ReceiverMultilateralLimitRelated = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverMultilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.ReceiverMultilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PendingStatus1Code
	 * PendingStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderReceiverBilateralLimitRelated"</li>
	 * </ul>
	 */
	public static final PendingStatus1Code SenderReceiverBilateralLimitRelated = new PendingStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderReceiverBilateralLimitRelated";
			owner_lazy = () -> com.tools20022.repository.codeset.PendingStatus1Code.mmObject();
			codeName = PaymentInstructionStatusCode.SenderReceiverBilateralLimitRelated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PendingStatus1Code> codesByName = new LinkedHashMap<>();

	protected PendingStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACPD");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PendingStatus1Code";
				definition = "Indicates that the state of a payment at the clearing agent side is pending.";
				trace_lazy = () -> PaymentInstructionStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PendingStatus1Code.Accepted, com.tools20022.repository.codeset.PendingStatus1Code.Validated, com.tools20022.repository.codeset.PendingStatus1Code.Matched,
						com.tools20022.repository.codeset.PendingStatus1Code.Authorised, com.tools20022.repository.codeset.PendingStatus1Code.Invalid, com.tools20022.repository.codeset.PendingStatus1Code.Unmatched,
						com.tools20022.repository.codeset.PendingStatus1Code.SettlementEligible, com.tools20022.repository.codeset.PendingStatus1Code.SettlementMature, com.tools20022.repository.codeset.PendingStatus1Code.Suspended,
						com.tools20022.repository.codeset.PendingStatus1Code.PendingCancellation, com.tools20022.repository.codeset.PendingStatus1Code.PendingSettlement,
						com.tools20022.repository.codeset.PendingStatus1Code.PendingFailingSettlement, com.tools20022.repository.codeset.PendingStatus1Code.SenderMultilateralLimitRelated,
						com.tools20022.repository.codeset.PendingStatus1Code.ReceiverMultilateralLimitRelated, com.tools20022.repository.codeset.PendingStatus1Code.SenderReceiverBilateralLimitRelated);
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
	}

	public static PendingStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PendingStatus1Code[] values() {
		PendingStatus1Code[] values = new PendingStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PendingStatus1Code> {
		@Override
		public PendingStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PendingStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}