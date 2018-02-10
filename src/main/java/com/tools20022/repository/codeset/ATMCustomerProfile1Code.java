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
import com.tools20022.repository.codeset.ATMCustomerProfile1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the main way customer information was collected to build up the
 * customer menu and the withdrawal request.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code#CardInformation
 * ATMCustomerProfile1Code.CardInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code#OtherRequest
 * ATMCustomerProfile1Code.OtherRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code#ProfileRequest
 * ATMCustomerProfile1Code.ProfileRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode
 * ATMCustomerProfileCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ATMCustomerProfile1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the main way customer information was collected to build up the customer menu and the withdrawal request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCustomerProfile1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code
	 * ATMCustomerProfile1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardInformation"</li>
	 * </ul>
	 */
	public static final ATMCustomerProfile1Code CardInformation = new ATMCustomerProfile1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardInformation";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCustomerProfile1Code.mmObject();
			codeName = ATMCustomerProfileCode.CardInformation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code
	 * ATMCustomerProfile1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRequest"</li>
	 * </ul>
	 */
	public static final ATMCustomerProfile1Code OtherRequest = new ATMCustomerProfile1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCustomerProfile1Code.mmObject();
			codeName = ATMCustomerProfileCode.OtherRequest.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code
	 * ATMCustomerProfile1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileRequest"</li>
	 * </ul>
	 */
	public static final ATMCustomerProfile1Code ProfileRequest = new ATMCustomerProfile1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileRequest";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCustomerProfile1Code.mmObject();
			codeName = ATMCustomerProfileCode.ProfileRequest.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMCustomerProfile1Code> codesByName = new LinkedHashMap<>();

	protected ATMCustomerProfile1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomerProfile1Code";
				definition = "Describes the main way customer information was collected to build up the customer menu and the withdrawal request.";
				trace_lazy = () -> ATMCustomerProfileCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCustomerProfile1Code.CardInformation, com.tools20022.repository.codeset.ATMCustomerProfile1Code.OtherRequest,
						com.tools20022.repository.codeset.ATMCustomerProfile1Code.ProfileRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardInformation.getCodeName().get(), CardInformation);
		codesByName.put(OtherRequest.getCodeName().get(), OtherRequest);
		codesByName.put(ProfileRequest.getCodeName().get(), ProfileRequest);
	}

	public static ATMCustomerProfile1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCustomerProfile1Code[] values() {
		ATMCustomerProfile1Code[] values = new ATMCustomerProfile1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCustomerProfile1Code> {
		@Override
		public ATMCustomerProfile1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCustomerProfile1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}