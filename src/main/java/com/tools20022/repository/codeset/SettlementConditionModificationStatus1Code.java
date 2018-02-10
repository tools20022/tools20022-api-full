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
import com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of a securities settlement condition modification
 * request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code#AcknowledgedAccepted
 * SettlementConditionModificationStatus1Code.AcknowledgedAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code#Rejected
 * SettlementConditionModificationStatus1Code.Rejected}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code#Pending
 * SettlementConditionModificationStatus1Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code#Denied
 * SettlementConditionModificationStatus1Code.Denied}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code#Completed
 * SettlementConditionModificationStatus1Code.Completed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatusStatusCode
 * SettlementConditionModificationStatusStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PACK"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementConditionModificationStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of a securities settlement condition modification request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SettlementConditionModificationStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code
	 * SettlementConditionModificationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAccepted"</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatus1Code AcknowledgedAccepted = new SettlementConditionModificationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAccepted";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.mmObject();
			codeName = SettlementConditionModificationStatusStatusCode.AcknowledgedAccepted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code
	 * SettlementConditionModificationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rejected"</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatus1Code Rejected = new SettlementConditionModificationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rejected";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.mmObject();
			codeName = SettlementConditionModificationStatusStatusCode.Rejected.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code
	 * SettlementConditionModificationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatus1Code Pending = new SettlementConditionModificationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.mmObject();
			codeName = SettlementConditionModificationStatusStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code
	 * SettlementConditionModificationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Denied"</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatus1Code Denied = new SettlementConditionModificationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Denied";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.mmObject();
			codeName = SettlementConditionModificationStatusStatusCode.Denied.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code
	 * SettlementConditionModificationStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Completed"</li>
	 * </ul>
	 */
	public static final SettlementConditionModificationStatus1Code Completed = new SettlementConditionModificationStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Completed";
			owner_lazy = () -> com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.mmObject();
			codeName = SettlementConditionModificationStatusStatusCode.Completed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SettlementConditionModificationStatus1Code> codesByName = new LinkedHashMap<>();

	protected SettlementConditionModificationStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PACK");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementConditionModificationStatus1Code";
				definition = "Specifies the status of a securities settlement condition modification request.";
				trace_lazy = () -> SettlementConditionModificationStatusStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.AcknowledgedAccepted, com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.Rejected,
						com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.Pending, com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.Denied,
						com.tools20022.repository.codeset.SettlementConditionModificationStatus1Code.Completed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AcknowledgedAccepted.getCodeName().get(), AcknowledgedAccepted);
		codesByName.put(Rejected.getCodeName().get(), Rejected);
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Denied.getCodeName().get(), Denied);
		codesByName.put(Completed.getCodeName().get(), Completed);
	}

	public static SettlementConditionModificationStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SettlementConditionModificationStatus1Code[] values() {
		SettlementConditionModificationStatus1Code[] values = new SettlementConditionModificationStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SettlementConditionModificationStatus1Code> {
		@Override
		public SettlementConditionModificationStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SettlementConditionModificationStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}