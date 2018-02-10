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
import com.tools20022.repository.codeset.InstructionCancellationReasonCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the reason why the instruction is cancelled.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledByYourselves
 * InstructionCancellationReasonCode.CancelledByYourselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledBySystem
 * InstructionCancellationReasonCode.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledByAgent
 * InstructionCancellationReasonCode.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledByAnotherParty
 * InstructionCancellationReasonCode.CancelledByAnotherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledDueToTransformation
 * InstructionCancellationReasonCode.CancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledDueToSplitPartialSettlement
 * InstructionCancellationReasonCode.CancelledDueToSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledDueToCorporateAction
 * InstructionCancellationReasonCode.CancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#CancelledByIssuerRegistrar
 * InstructionCancellationReasonCode.CancelledByIssuerRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#Expired
 * InstructionCancellationReasonCode.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode#SecuritiesNoLongerEligible
 * InstructionCancellationReasonCode.SecuritiesNoLongerEligible}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason1Code
 * InstructionCancellationReason1Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
 * InstructionCancellationReason2Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CANI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InstructionCancellationReasonCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the instruction is cancelled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionCancellationReasonCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Instruction has been cancelled as per your request.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourselves"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled as per your request."</li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledByYourselves = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByYourselves";
			definition = "Instruction has been cancelled as per your request.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CANI";
		}
	};
	/**
	 * Instruction has been cancelled by the settlement system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled by the settlement system."</li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledBySystem = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySystem";
			definition = "Instruction has been cancelled by the settlement system.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CANS";
		}
	};
	/**
	 * Instruction has been cancelled by the agent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CSUB"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled by the agent."</li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledByAgent = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAgent";
			definition = "Instruction has been cancelled by the agent.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CSUB";
		}
	};
	/**
	 * Instruction has been cancelled by another party than the instructing
	 * party, for example, market infrastructure such as a stock exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAnotherParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledByAnotherParty = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAnotherParty";
			definition = "Instruction has been cancelled by another party than the instructing party, for example, market infrastructure such as a stock exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CANO";
		}
	};
	/**
	 * Original instruction has been cancelled and replaced due to a corporate
	 * action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToTransformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original instruction has been cancelled and replaced due to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledDueToTransformation = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToTransformation";
			definition = "Original instruction has been cancelled and replaced due to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CANT";
		}
	};
	/**
	 * Original instruction has been cancelled and replaced to allow a partial
	 * or split settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CANZ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToSplitPartialSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Original instruction has been cancelled and replaced to allow a partial or split settlement."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledDueToSplitPartialSettlement = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToSplitPartialSettlement";
			definition = "Original instruction has been cancelled and replaced to allow a partial or split settlement.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CANZ";
		}
	};
	/**
	 * Instruction has been cancelled due to a corporate action.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CORP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToCorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled due to a corporate action."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledDueToCorporateAction = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToCorporateAction";
			definition = "Instruction has been cancelled due to a corporate action.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CORP";
		}
	};
	/**
	 * Instruction has been cancelled by the issuer/registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIssuerRegistrar"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has been cancelled by the issuer/registrar."</li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode CancelledByIssuerRegistrar = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByIssuerRegistrar";
			definition = "Instruction has been cancelled by the issuer/registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "CREG";
		}
	};
	/**
	 * Instruction has expired.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instruction has expired."</li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode Expired = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			definition = "Instruction has expired.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "EXPI";
		}
	};
	/**
	 * Instruction has been cancelled; the security no longer exists or is no
	 * longer eligible on the market instructed. For corporate action related
	 * cancellation, CORP should be used.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
	 * InstructionCancellationReasonCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SCEX"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesNoLongerEligible"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used."
	 * </li>
	 * </ul>
	 */
	public static final InstructionCancellationReasonCode SecuritiesNoLongerEligible = new InstructionCancellationReasonCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesNoLongerEligible";
			definition = "Instruction has been cancelled; the security no longer exists or is no longer eligible on the market instructed. For corporate action related cancellation, CORP should be used.";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReasonCode.mmObject();
			codeName = "SCEX";
		}
	};
	final static private LinkedHashMap<String, InstructionCancellationReasonCode> codesByName = new LinkedHashMap<>();

	protected InstructionCancellationReasonCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCancellationReasonCode";
				definition = "Specifies the reason why the instruction is cancelled.";
				derivation_lazy = () -> Arrays.asList(InstructionCancellationReason1Code.mmObject(), InstructionCancellationReason2Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledByYourselves, com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledBySystem,
						com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledByAgent, com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledByAnotherParty,
						com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledDueToTransformation, com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledDueToSplitPartialSettlement,
						com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledDueToCorporateAction, com.tools20022.repository.codeset.InstructionCancellationReasonCode.CancelledByIssuerRegistrar,
						com.tools20022.repository.codeset.InstructionCancellationReasonCode.Expired, com.tools20022.repository.codeset.InstructionCancellationReasonCode.SecuritiesNoLongerEligible);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByYourselves.getCodeName().get(), CancelledByYourselves);
		codesByName.put(CancelledBySystem.getCodeName().get(), CancelledBySystem);
		codesByName.put(CancelledByAgent.getCodeName().get(), CancelledByAgent);
		codesByName.put(CancelledByAnotherParty.getCodeName().get(), CancelledByAnotherParty);
		codesByName.put(CancelledDueToTransformation.getCodeName().get(), CancelledDueToTransformation);
		codesByName.put(CancelledDueToSplitPartialSettlement.getCodeName().get(), CancelledDueToSplitPartialSettlement);
		codesByName.put(CancelledDueToCorporateAction.getCodeName().get(), CancelledDueToCorporateAction);
		codesByName.put(CancelledByIssuerRegistrar.getCodeName().get(), CancelledByIssuerRegistrar);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(SecuritiesNoLongerEligible.getCodeName().get(), SecuritiesNoLongerEligible);
	}

	public static InstructionCancellationReasonCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionCancellationReasonCode[] values() {
		InstructionCancellationReasonCode[] values = new InstructionCancellationReasonCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionCancellationReasonCode> {
		@Override
		public InstructionCancellationReasonCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionCancellationReasonCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}