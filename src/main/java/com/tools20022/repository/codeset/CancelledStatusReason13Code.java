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
import com.tools20022.repository.codeset.CancelledStatusReason13Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the underlying reason for the cancellation of the associated
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledByYourself
 * CancelledStatusReason13Code.CancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledBySystem
 * CancelledStatusReason13Code.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledByAgent
 * CancelledStatusReason13Code.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#EndOfLife
 * CancelledStatusReason13Code.EndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledDueToTransformation
 * CancelledStatusReason13Code.CancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledSplitPartialSettlement
 * CancelledStatusReason13Code.CancelledSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledDueToCorporateAction
 * CancelledStatusReason13Code.CancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#SecuritiesNoLongerEligible
 * CancelledStatusReason13Code.SecuritiesNoLongerEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#Other
 * CancelledStatusReason13Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code#CancelledByThirdParty
 * CancelledStatusReason13Code.CancelledByThirdParty}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReasonV2Code
 * CancelledStatusReasonV2Code}</li>
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
 * "CancelledStatusReason13Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for the cancellation of the associated transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
 * CancelledStatusReason9Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReason13Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledByYourself = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByYourself";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByYourself.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledBySystem = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledBySystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledByAgent = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code EndOfLife = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfLife";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.EndOfLife.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToTransformation"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledDueToTransformation = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToTransformation";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledDueToTransformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledSplitPartialSettlement"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledSplitPartialSettlement = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledSplitPartialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledSplitPartialSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToCorporateAction"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledDueToCorporateAction = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledDueToCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesNoLongerEligible"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code SecuritiesNoLongerEligible = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesNoLongerEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.SecuritiesNoLongerEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code Other = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
	 * CancelledStatusReason13Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByThirdParty"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason13Code CancelledByThirdParty = new CancelledStatusReason13Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByThirdParty";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason13Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByThirdParty.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReason13Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReason13Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReason13Code";
				definition = "Specifies the underlying reason for the cancellation of the associated transaction.";
				previousVersion_lazy = () -> CancelledStatusReason9Code.mmObject();
				trace_lazy = () -> CancelledStatusReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReason13Code.EndOfLife,
						com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledDueToTransformation, com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledSplitPartialSettlement,
						com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledDueToCorporateAction, com.tools20022.repository.codeset.CancelledStatusReason13Code.SecuritiesNoLongerEligible,
						com.tools20022.repository.codeset.CancelledStatusReason13Code.Other, com.tools20022.repository.codeset.CancelledStatusReason13Code.CancelledByThirdParty);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByYourself.getCodeName().get(), CancelledByYourself);
		codesByName.put(CancelledBySystem.getCodeName().get(), CancelledBySystem);
		codesByName.put(CancelledByAgent.getCodeName().get(), CancelledByAgent);
		codesByName.put(EndOfLife.getCodeName().get(), EndOfLife);
		codesByName.put(CancelledDueToTransformation.getCodeName().get(), CancelledDueToTransformation);
		codesByName.put(CancelledSplitPartialSettlement.getCodeName().get(), CancelledSplitPartialSettlement);
		codesByName.put(CancelledDueToCorporateAction.getCodeName().get(), CancelledDueToCorporateAction);
		codesByName.put(SecuritiesNoLongerEligible.getCodeName().get(), SecuritiesNoLongerEligible);
		codesByName.put(Other.getCodeName().get(), Other);
		codesByName.put(CancelledByThirdParty.getCodeName().get(), CancelledByThirdParty);
	}

	public static CancelledStatusReason13Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReason13Code[] values() {
		CancelledStatusReason13Code[] values = new CancelledStatusReason13Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReason13Code> {
		@Override
		public CancelledStatusReason13Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReason13Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}