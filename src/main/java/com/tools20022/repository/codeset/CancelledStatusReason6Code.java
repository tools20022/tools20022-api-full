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
import com.tools20022.repository.codeset.CancelledStatusReason6Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code#CancelledByYourself
 * CancelledStatusReason6Code.CancelledByYourself}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code#CancelledByOther
 * CancelledStatusReason6Code.CancelledByOther}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code#CancelledBySystem
 * CancelledStatusReason6Code.CancelledBySystem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code#CancelledByAgent
 * CancelledStatusReason6Code.CancelledByAgent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code#Other
 * CancelledStatusReason6Code.Other}</li>
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
 * "CancelledStatusReason6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the underlying reason for the cancellation of the associated transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CancelledStatusReason6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code
	 * CancelledStatusReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByYourself"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason6Code CancelledByYourself = new CancelledStatusReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByYourself";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason6Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByYourself.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code
	 * CancelledStatusReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByOther"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason6Code CancelledByOther = new CancelledStatusReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByOther";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason6Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByOther.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code
	 * CancelledStatusReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledBySystem"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason6Code CancelledBySystem = new CancelledStatusReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledBySystem";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason6Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledBySystem.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code
	 * CancelledStatusReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancelledByAgent"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason6Code CancelledByAgent = new CancelledStatusReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancelledByAgent";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason6Code.mmObject();
			codeName = CancelledStatusReasonV2Code.CancelledByAgent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CancelledStatusReason6Code
	 * CancelledStatusReason6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Other"</li>
	 * </ul>
	 */
	public static final CancelledStatusReason6Code Other = new CancelledStatusReason6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Other";
			owner_lazy = () -> com.tools20022.repository.codeset.CancelledStatusReason6Code.mmObject();
			codeName = CancelledStatusReasonV2Code.Other.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CancelledStatusReason6Code> codesByName = new LinkedHashMap<>();

	protected CancelledStatusReason6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CANI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CancelledStatusReason6Code";
				definition = "Specifies the underlying reason for the cancellation of the associated transaction.";
				trace_lazy = () -> CancelledStatusReasonV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CancelledStatusReason6Code.CancelledByYourself, com.tools20022.repository.codeset.CancelledStatusReason6Code.CancelledByOther,
						com.tools20022.repository.codeset.CancelledStatusReason6Code.CancelledBySystem, com.tools20022.repository.codeset.CancelledStatusReason6Code.CancelledByAgent,
						com.tools20022.repository.codeset.CancelledStatusReason6Code.Other);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CancelledByYourself.getCodeName().get(), CancelledByYourself);
		codesByName.put(CancelledByOther.getCodeName().get(), CancelledByOther);
		codesByName.put(CancelledBySystem.getCodeName().get(), CancelledBySystem);
		codesByName.put(CancelledByAgent.getCodeName().get(), CancelledByAgent);
		codesByName.put(Other.getCodeName().get(), Other);
	}

	public static CancelledStatusReason6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CancelledStatusReason6Code[] values() {
		CancelledStatusReason6Code[] values = new CancelledStatusReason6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CancelledStatusReason6Code> {
		@Override
		public CancelledStatusReason6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CancelledStatusReason6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}