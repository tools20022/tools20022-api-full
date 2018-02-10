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
import com.tools20022.repository.codeset.CancelledStatusReason9Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#CancelledByYourself
 * CancelledStatusReason9Code.CancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#CancelledBySystem
 * CancelledStatusReason9Code.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#CancelledByAgent
 * CancelledStatusReason9Code.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#EndOfLife
 * CancelledStatusReason9Code.EndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#CancelledDueToTransformation
 * CancelledStatusReason9Code.CancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#CancelledSplitPartialSettlement
 * CancelledStatusReason9Code.CancelledSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#CancelledDueToCorporateAction
 * CancelledStatusReason9Code.CancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#SecuritiesNoLongerEligible
 * CancelledStatusReason9Code.SecuritiesNoLongerEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code#Other
 * CancelledStatusReason9Code.Other}</li>
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
 * "CancelledStatusReason9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for the cancellation of the associated transaction."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason13Code
 * CancelledStatusReason13Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReason9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code CancelledByYourself = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByYourself";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByYourself.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code CancelledBySystem = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledBySystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code CancelledByAgent = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code EndOfLife = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfLife";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.EndOfLife.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToTransformation"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code CancelledDueToTransformation = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToTransformation";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledDueToTransformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledSplitPartialSettlement"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code CancelledSplitPartialSettlement = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledSplitPartialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledSplitPartialSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToCorporateAction"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code CancelledDueToCorporateAction = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledDueToCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesNoLongerEligible"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code SecuritiesNoLongerEligible = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesNoLongerEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.SecuritiesNoLongerEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason9Code
	 * CancelledStatusReason9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason9Code Other = new CancelledStatusReason9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason9Code.mmObject();
			codeName = CancelledStatusReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReason9Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReason9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReason9Code";
				definition = "Specifies the underlying reason for the cancellation of the associated transaction.";
				nextVersions_lazy = () -> Arrays.asList(CancelledStatusReason13Code.mmObject());
				trace_lazy = () -> CancelledStatusReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReason9Code.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReason9Code.CancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReason9Code.CancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReason9Code.EndOfLife,
						com.tools20022.repository.codeset.CancelledStatusReason9Code.CancelledDueToTransformation, com.tools20022.repository.codeset.CancelledStatusReason9Code.CancelledSplitPartialSettlement,
						com.tools20022.repository.codeset.CancelledStatusReason9Code.CancelledDueToCorporateAction, com.tools20022.repository.codeset.CancelledStatusReason9Code.SecuritiesNoLongerEligible,
						com.tools20022.repository.codeset.CancelledStatusReason9Code.Other);
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
	}

	public static CancelledStatusReason9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReason9Code[] values() {
		CancelledStatusReason9Code[] values = new CancelledStatusReason9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReason9Code> {
		@Override
		public CancelledStatusReason9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReason9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}