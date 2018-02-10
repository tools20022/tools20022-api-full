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
import com.tools20022.repository.codeset.ATMCustomerProfileCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode#CardInformation
 * ATMCustomerProfileCode.CardInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode#ProfileRequest
 * ATMCustomerProfileCode.ProfileRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode#OtherRequest
 * ATMCustomerProfileCode.OtherRequest}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMCustomerProfile1Code
 * ATMCustomerProfile1Code}</li>
 * </ul>
 * </li>
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
 * "ATMCustomerProfileCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the main way customer information was collected to build up the customer menu and the withdrawal request."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMCustomerProfileCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Customer profile is deduced from the card data and the local
	 * configuration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode
	 * ATMCustomerProfileCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CRDF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer profile is deduced from the card data and the local configuration."
	 * </li>
	 * </ul>
	 */
	public static final ATMCustomerProfileCode CardInformation = new ATMCustomerProfileCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardInformation";
			definition = "Customer profile is deduced from the card data and the local configuration.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCustomerProfileCode.mmObject();
			codeName = "CRDF";
		}
	};
	/**
	 * Customer profile is built via a specific profile message exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode
	 * ATMCustomerProfileCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProfileRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer profile is built via a specific profile message exchange."</li>
	 * </ul>
	 */
	public static final ATMCustomerProfileCode ProfileRequest = new ATMCustomerProfileCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProfileRequest";
			definition = "Customer profile is built via a specific profile message exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCustomerProfileCode.mmObject();
			codeName = "PREQ";
		}
	};
	/**
	 * Customer profile is sent via an account enquiry selecting an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMCustomerProfileCode
	 * ATMCustomerProfileCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OREQ"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Customer profile is sent via an account enquiry selecting an account."</li>
	 * </ul>
	 */
	public static final ATMCustomerProfileCode OtherRequest = new ATMCustomerProfileCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherRequest";
			definition = "Customer profile is sent via an account enquiry selecting an account.";
			owner_lazy = () -> com.tools20022.repository.codeset.ATMCustomerProfileCode.mmObject();
			codeName = "OREQ";
		}
	};
	final static private LinkedHashMap<String, ATMCustomerProfileCode> codesByName = new LinkedHashMap<>();

	protected ATMCustomerProfileCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMCustomerProfileCode";
				definition = "Describes the main way customer information was collected to build up the customer menu and the withdrawal request.";
				derivation_lazy = () -> Arrays.asList(ATMCustomerProfile1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMCustomerProfileCode.CardInformation, com.tools20022.repository.codeset.ATMCustomerProfileCode.ProfileRequest,
						com.tools20022.repository.codeset.ATMCustomerProfileCode.OtherRequest);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CardInformation.getCodeName().get(), CardInformation);
		codesByName.put(ProfileRequest.getCodeName().get(), ProfileRequest);
		codesByName.put(OtherRequest.getCodeName().get(), OtherRequest);
	}

	public static ATMCustomerProfileCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMCustomerProfileCode[] values() {
		ATMCustomerProfileCode[] values = new ATMCustomerProfileCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMCustomerProfileCode> {
		@Override
		public ATMCustomerProfileCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMCustomerProfileCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}