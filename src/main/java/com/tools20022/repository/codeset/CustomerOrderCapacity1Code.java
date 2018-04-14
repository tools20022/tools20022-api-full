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
import com.tools20022.repository.codeset.CustomerOrderCapacity1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Designation of the capacity of the firm placing the order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code#MemberOwnAccount
 * CustomerOrderCapacity1Code.MemberOwnAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code#ClearingProprietary
 * CustomerOrderCapacity1Code.ClearingProprietary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code#MemberOtherMember
 * CustomerOrderCapacity1Code.MemberOtherMember}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacityCode
 * CustomerOrderCapacityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CustomerOrderCapacity1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Designation of the capacity of the firm placing the order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OWNE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CustomerOrderCapacity1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code
	 * CustomerOrderCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberOwnAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CustomerOrderCapacity1Code MemberOwnAccount = new CustomerOrderCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberOwnAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerOrderCapacity1Code.mmObject();
			codeName = CustomerOrderCapacityCode.MemberOwnAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code
	 * CustomerOrderCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClearingProprietary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CustomerOrderCapacity1Code ClearingProprietary = new CustomerOrderCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClearingProprietary";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerOrderCapacity1Code.mmObject();
			codeName = CustomerOrderCapacityCode.ClearingProprietary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CustomerOrderCapacity1Code
	 * CustomerOrderCapacity1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MemberOtherMember"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final CustomerOrderCapacity1Code MemberOtherMember = new CustomerOrderCapacity1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MemberOtherMember";
			owner_lazy = () -> com.tools20022.repository.codeset.CustomerOrderCapacity1Code.mmObject();
			codeName = CustomerOrderCapacityCode.MemberOtherMember.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CustomerOrderCapacity1Code> codesByName = new LinkedHashMap<>();

	protected CustomerOrderCapacity1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OWNE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CustomerOrderCapacity1Code";
				definition = "Designation of the capacity of the firm placing the order.";
				trace_lazy = () -> CustomerOrderCapacityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CustomerOrderCapacity1Code.MemberOwnAccount, com.tools20022.repository.codeset.CustomerOrderCapacity1Code.ClearingProprietary,
						com.tools20022.repository.codeset.CustomerOrderCapacity1Code.MemberOtherMember);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MemberOwnAccount.getCodeName().get(), MemberOwnAccount);
		codesByName.put(ClearingProprietary.getCodeName().get(), ClearingProprietary);
		codesByName.put(MemberOtherMember.getCodeName().get(), MemberOtherMember);
	}

	public static CustomerOrderCapacity1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CustomerOrderCapacity1Code[] values() {
		CustomerOrderCapacity1Code[] values = new CustomerOrderCapacity1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CustomerOrderCapacity1Code> {
		@Override
		public CustomerOrderCapacity1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CustomerOrderCapacity1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}