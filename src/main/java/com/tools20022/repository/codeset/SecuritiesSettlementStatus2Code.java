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
import com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Provides the status of settlement of an instruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code#Pending
 * SecuritiesSettlementStatus2Code.Pending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code#Failing
 * SecuritiesSettlementStatus2Code.Failing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code#Unsettled
 * SecuritiesSettlementStatus2Code.Unsettled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code#Settled
 * SecuritiesSettlementStatus2Code.Settled}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code#PartialSettlement
 * SecuritiesSettlementStatus2Code.PartialSettlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatusCode
 * SecuritiesSettlementStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PEND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementStatus2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides the status of settlement of an instruction."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesSettlementStatus2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code
	 * SecuritiesSettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pending"</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatus2Code Pending = new SecuritiesSettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.mmObject();
			codeName = SecuritiesSettlementStatusCode.Pending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code
	 * SecuritiesSettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Failing"</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatus2Code Failing = new SecuritiesSettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Failing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.mmObject();
			codeName = SecuritiesSettlementStatusCode.Failing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code
	 * SecuritiesSettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unsettled"</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatus2Code Unsettled = new SecuritiesSettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unsettled";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.mmObject();
			codeName = SecuritiesSettlementStatusCode.Unsettled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code
	 * SecuritiesSettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatus2Code Settled = new SecuritiesSettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.mmObject();
			codeName = SecuritiesSettlementStatusCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code
	 * SecuritiesSettlementStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialSettlement"</li>
	 * </ul>
	 */
	public static final SecuritiesSettlementStatus2Code PartialSettlement = new SecuritiesSettlementStatus2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.mmObject();
			codeName = SecuritiesSettlementStatusCode.PartialSettlement.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesSettlementStatus2Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesSettlementStatus2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PEND");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementStatus2Code";
				definition = "Provides the status of settlement of an instruction.";
				trace_lazy = () -> SecuritiesSettlementStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.Pending, com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.Failing,
						com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.Unsettled, com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.Settled,
						com.tools20022.repository.codeset.SecuritiesSettlementStatus2Code.PartialSettlement);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Pending.getCodeName().get(), Pending);
		codesByName.put(Failing.getCodeName().get(), Failing);
		codesByName.put(Unsettled.getCodeName().get(), Unsettled);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(PartialSettlement.getCodeName().get(), PartialSettlement);
	}

	public static SecuritiesSettlementStatus2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesSettlementStatus2Code[] values() {
		SecuritiesSettlementStatus2Code[] values = new SecuritiesSettlementStatus2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesSettlementStatus2Code> {
		@Override
		public SecuritiesSettlementStatus2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesSettlementStatus2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}