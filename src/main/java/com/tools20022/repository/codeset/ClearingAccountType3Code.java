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
import com.tools20022.repository.codeset.ClearingAccountType3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the clearing account type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code#NetOmnibusClientAccount
 * ClearingAccountType3Code.NetOmnibusClientAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code#IndividuallySegregatedAccount
 * ClearingAccountType3Code.IndividuallySegregatedAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code#House
 * ClearingAccountType3Code.House}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code#GrossOmnibusClientAccount
 * ClearingAccountType3Code.GrossOmnibusClientAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountTypeCode
 * ClearingAccountTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingAccountType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the clearing account type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingAccountType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code
	 * ClearingAccountType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetOmnibusClientAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ClearingAccountType3Code NetOmnibusClientAccount = new ClearingAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetOmnibusClientAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType3Code.mmObject();
			codeName = ClearingAccountTypeCode.NetOmnibusClientAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code
	 * ClearingAccountType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndividuallySegregatedAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ClearingAccountType3Code IndividuallySegregatedAccount = new ClearingAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndividuallySegregatedAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType3Code.mmObject();
			codeName = ClearingAccountTypeCode.IndividuallySegregatedAccount.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code
	 * ClearingAccountType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "House"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ClearingAccountType3Code House = new ClearingAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType3Code.mmObject();
			codeName = ClearingAccountTypeCode.House.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType3Code
	 * ClearingAccountType3Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossOmnibusClientAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final ClearingAccountType3Code GrossOmnibusClientAccount = new ClearingAccountType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossOmnibusClientAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType3Code.mmObject();
			codeName = ClearingAccountTypeCode.GrossOmnibusClientAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClearingAccountType3Code> codesByName = new LinkedHashMap<>();

	protected ClearingAccountType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ClearingAccountType3Code";
				definition = "Specifies the clearing account type.";
				trace_lazy = () -> ClearingAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingAccountType3Code.NetOmnibusClientAccount, com.tools20022.repository.codeset.ClearingAccountType3Code.IndividuallySegregatedAccount,
						com.tools20022.repository.codeset.ClearingAccountType3Code.House, com.tools20022.repository.codeset.ClearingAccountType3Code.GrossOmnibusClientAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NetOmnibusClientAccount.getCodeName().get(), NetOmnibusClientAccount);
		codesByName.put(IndividuallySegregatedAccount.getCodeName().get(), IndividuallySegregatedAccount);
		codesByName.put(House.getCodeName().get(), House);
		codesByName.put(GrossOmnibusClientAccount.getCodeName().get(), GrossOmnibusClientAccount);
	}

	public static ClearingAccountType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingAccountType3Code[] values() {
		ClearingAccountType3Code[] values = new ClearingAccountType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingAccountType3Code> {
		@Override
		public ClearingAccountType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingAccountType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}