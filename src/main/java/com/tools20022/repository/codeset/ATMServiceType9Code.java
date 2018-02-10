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
import com.tools20022.repository.codeset.ATMServiceType9Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Describes the type of fund transfer selected by the customer or the ATM.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code#CustomerTransfer
 * ATMServiceType9Code.CustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code#InterCustomerTransfer
 * ATMServiceType9Code.InterCustomerTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code#Payment
 * ATMServiceType9Code.Payment}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ATMServiceTypeCode
 * ATMServiceTypeCode}</li>
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
 * "ATMServiceType9Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Describes the type of fund transfer selected by the customer or the ATM."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ATMServiceType10Code
 * ATMServiceType10Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ATMServiceType9Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code
	 * ATMServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#CustomerTransfer
	 * ATMServiceType10Code.CustomerTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMServiceType9Code CustomerTransfer = new ATMServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerTransfer";
			nextVersions_lazy = () -> Arrays.asList(ATMServiceType10Code.CustomerTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType9Code.mmObject();
			codeName = ATMServiceTypeCode.CustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code
	 * ATMServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterCustomerTransfer"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#InterCustomerTransfer
	 * ATMServiceType10Code.InterCustomerTransfer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMServiceType9Code InterCustomerTransfer = new ATMServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterCustomerTransfer";
			nextVersions_lazy = () -> Arrays.asList(ATMServiceType10Code.InterCustomerTransfer);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType9Code.mmObject();
			codeName = ATMServiceTypeCode.InterCustomerTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType9Code
	 * ATMServiceType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Payment"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.ATMServiceType10Code#Payment
	 * ATMServiceType10Code.Payment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final ATMServiceType9Code Payment = new ATMServiceType9Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Payment";
			nextVersions_lazy = () -> Arrays.asList(ATMServiceType10Code.Payment);
			owner_lazy = () -> com.tools20022.repository.codeset.ATMServiceType9Code.mmObject();
			codeName = ATMServiceTypeCode.Payment.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ATMServiceType9Code> codesByName = new LinkedHashMap<>();

	protected ATMServiceType9Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMServiceType9Code";
				definition = "Describes the type of fund transfer selected by the customer or the ATM.";
				nextVersions_lazy = () -> Arrays.asList(ATMServiceType10Code.mmObject());
				trace_lazy = () -> ATMServiceTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ATMServiceType9Code.CustomerTransfer, com.tools20022.repository.codeset.ATMServiceType9Code.InterCustomerTransfer,
						com.tools20022.repository.codeset.ATMServiceType9Code.Payment);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CustomerTransfer.getCodeName().get(), CustomerTransfer);
		codesByName.put(InterCustomerTransfer.getCodeName().get(), InterCustomerTransfer);
		codesByName.put(Payment.getCodeName().get(), Payment);
	}

	public static ATMServiceType9Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ATMServiceType9Code[] values() {
		ATMServiceType9Code[] values = new ATMServiceType9Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ATMServiceType9Code> {
		@Override
		public ATMServiceType9Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ATMServiceType9Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}