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
import com.tools20022.repository.codeset.CancelledStatusReason12Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledByYourself
 * CancelledStatusReason12Code.CancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledBySystem
 * CancelledStatusReason12Code.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledByAgent
 * CancelledStatusReason12Code.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#EndOfLife
 * CancelledStatusReason12Code.EndOfLife}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledDueToTransformation
 * CancelledStatusReason12Code.CancelledDueToTransformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledSplitPartialSettlement
 * CancelledStatusReason12Code.CancelledSplitPartialSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledDueToCorporateAction
 * CancelledStatusReason12Code.CancelledDueToCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#SecuritiesNoLongerEligible
 * CancelledStatusReason12Code.SecuritiesNoLongerEligible}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#Other
 * CancelledStatusReason12Code.Other}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledByOther
 * CancelledStatusReason12Code.CancelledByOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code#CancelledByIssuerRegistrar
 * CancelledStatusReason12Code.CancelledByIssuerRegistrar}</li>
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
 * "CancelledStatusReason12Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for the cancellation of the associated transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReason12Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledByYourself = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByYourself";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByYourself.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledBySystem = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledBySystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledByAgent = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EndOfLife"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code EndOfLife = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EndOfLife";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.EndOfLife.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToTransformation"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledDueToTransformation = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToTransformation";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledDueToTransformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledSplitPartialSettlement"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledSplitPartialSettlement = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledSplitPartialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledSplitPartialSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledDueToCorporateAction"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledDueToCorporateAction = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledDueToCorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledDueToCorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesNoLongerEligible"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code SecuritiesNoLongerEligible = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesNoLongerEligible";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.SecuritiesNoLongerEligible.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code Other = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByOther"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledByOther = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByOther";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByOther.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason12Code
	 * CancelledStatusReason12Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByIssuerRegistrar"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason12Code CancelledByIssuerRegistrar = new CancelledStatusReason12Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByIssuerRegistrar";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason12Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByIssuerRegistrar.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReason12Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReason12Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReason12Code";
				definition = "Specifies the underlying reason for the cancellation of the associated transaction.";
				trace_lazy = () -> CancelledStatusReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledBySystem,
						com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledByAgent, com.tools20022.repository.codeset.CancelledStatusReason12Code.EndOfLife,
						com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledDueToTransformation, com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledSplitPartialSettlement,
						com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledDueToCorporateAction, com.tools20022.repository.codeset.CancelledStatusReason12Code.SecuritiesNoLongerEligible,
						com.tools20022.repository.codeset.CancelledStatusReason12Code.Other, com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledByOther,
						com.tools20022.repository.codeset.CancelledStatusReason12Code.CancelledByIssuerRegistrar);
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
		codesByName.put(CancelledByOther.getCodeName().get(), CancelledByOther);
		codesByName.put(CancelledByIssuerRegistrar.getCodeName().get(), CancelledByIssuerRegistrar);
	}

	public static CancelledStatusReason12Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReason12Code[] values() {
		CancelledStatusReason12Code[] values = new CancelledStatusReason12Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReason12Code> {
		@Override
		public CancelledStatusReason12Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReason12Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}