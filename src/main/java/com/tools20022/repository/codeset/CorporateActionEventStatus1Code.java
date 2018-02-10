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
import com.tools20022.repository.codeset.CorporateActionEventStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of the CA event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code#Active
 * CorporateActionEventStatus1Code.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code#Deactivated
 * CorporateActionEventStatus1Code.Deactivated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code#Expired
 * CorporateActionEventStatus1Code.Expired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code#Cancelled
 * CorporateActionEventStatus1Code.Cancelled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code#Withdrawn
 * CorporateActionEventStatus1Code.Withdrawn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatusCode
 * CorporateActionEventStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the status of the CA event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code
	 * CorporateActionEventStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatus1Code Active = new CorporateActionEventStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatus1Code.mmObject();
			codeName = CorporateActionEventStatusCode.Active.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code
	 * CorporateActionEventStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatus1Code Deactivated = new CorporateActionEventStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatus1Code.mmObject();
			codeName = CorporateActionEventStatusCode.Deactivated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code
	 * CorporateActionEventStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Expired"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatus1Code Expired = new CorporateActionEventStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Expired";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatus1Code.mmObject();
			codeName = CorporateActionEventStatusCode.Expired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code
	 * CorporateActionEventStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cancelled"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatus1Code Cancelled = new CorporateActionEventStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cancelled";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatus1Code.mmObject();
			codeName = CorporateActionEventStatusCode.Cancelled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventStatus1Code
	 * CorporateActionEventStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawn"</li>
	 * </ul>
	 */
	public static final CorporateActionEventStatus1Code Withdrawn = new CorporateActionEventStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawn";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventStatus1Code.mmObject();
			codeName = CorporateActionEventStatusCode.Withdrawn.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventStatus1Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventStatus1Code";
				definition = "Specifies the status of the CA event.";
				trace_lazy = () -> CorporateActionEventStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventStatus1Code.Active, com.tools20022.repository.codeset.CorporateActionEventStatus1Code.Deactivated,
						com.tools20022.repository.codeset.CorporateActionEventStatus1Code.Expired, com.tools20022.repository.codeset.CorporateActionEventStatus1Code.Cancelled,
						com.tools20022.repository.codeset.CorporateActionEventStatus1Code.Withdrawn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
		codesByName.put(Expired.getCodeName().get(), Expired);
		codesByName.put(Cancelled.getCodeName().get(), Cancelled);
		codesByName.put(Withdrawn.getCodeName().get(), Withdrawn);
	}

	public static CorporateActionEventStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventStatus1Code[] values() {
		CorporateActionEventStatus1Code[] values = new CorporateActionEventStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventStatus1Code> {
		@Override
		public CorporateActionEventStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}