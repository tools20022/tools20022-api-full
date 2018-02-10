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
import com.tools20022.repository.codeset.InstructionCancellationReason2Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledByYourselves
 * InstructionCancellationReason2Code.CancelledByYourselves}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledBySystem
 * InstructionCancellationReason2Code.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledByAgent
 * InstructionCancellationReason2Code.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledByAnotherParty
 * InstructionCancellationReason2Code.CancelledByAnotherParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledDueToTransformation
 * InstructionCancellationReason2Code.CancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledDueToSplitPartialSettlement
 * InstructionCancellationReason2Code.CancelledDueToSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledDueToCorporateAction
 * InstructionCancellationReason2Code.CancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#CancelledByIssuerRegistrar
 * InstructionCancellationReason2Code.CancelledByIssuerRegistrar}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#Expired
 * InstructionCancellationReason2Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code#SecuritiesNoLongerEligible
 * InstructionCancellationReason2Code.SecuritiesNoLongerEligible}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReasonCode
 * InstructionCancellationReasonCode}</li>
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
 * "InstructionCancellationReason2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason why the instruction is cancelled."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class InstructionCancellationReason2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourselves"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledByYourselves = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByYourselves";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledByYourselves.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledBySystem = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySystem";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledBySystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledByAgent = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAnotherParty"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledByAnotherParty = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAnotherParty";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledByAnotherParty.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToTransformation"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledDueToTransformation = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToTransformation";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledDueToTransformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToSplitPartialSettlement"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledDueToSplitPartialSettlement = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToSplitPartialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledDueToSplitPartialSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToCorporateAction"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledDueToCorporateAction = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledDueToCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIssuerRegistrar"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code CancelledByIssuerRegistrar = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByIssuerRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.CancelledByIssuerRegistrar.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code Expired = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.InstructionCancellationReason2Code
	 * InstructionCancellationReason2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesNoLongerEligible"</li>
	 * </ul>
	 */
	public static final InstructionCancellationReason2Code SecuritiesNoLongerEligible = new InstructionCancellationReason2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesNoLongerEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.InstructionCancellationReason2Code.mmObject();
			codeName = InstructionCancellationReasonCode.SecuritiesNoLongerEligible.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, InstructionCancellationReason2Code> codesByName = new LinkedHashMap<>();

	protected InstructionCancellationReason2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InstructionCancellationReason2Code";
				definition = "Specifies the reason why the instruction is cancelled.";
				trace_lazy = () -> InstructionCancellationReasonCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledByYourselves, com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledBySystem,
						com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledByAgent, com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledByAnotherParty,
						com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledDueToTransformation, com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledDueToSplitPartialSettlement,
						com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledDueToCorporateAction, com.tools20022.repository.codeset.InstructionCancellationReason2Code.CancelledByIssuerRegistrar,
						com.tools20022.repository.codeset.InstructionCancellationReason2Code.Expired, com.tools20022.repository.codeset.InstructionCancellationReason2Code.SecuritiesNoLongerEligible);
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

	public static InstructionCancellationReason2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static InstructionCancellationReason2Code[] values() {
		InstructionCancellationReason2Code[] values = new InstructionCancellationReason2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, InstructionCancellationReason2Code> {
		@Override
		public InstructionCancellationReason2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(InstructionCancellationReason2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}