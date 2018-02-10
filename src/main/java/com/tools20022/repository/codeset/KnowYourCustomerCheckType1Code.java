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
import com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of Know Your Customer (KYC) or anti-money laundering due
 * diligence to which the investor has been subjected.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code#Enhanced
 * KnowYourCustomerCheckType1Code.Enhanced}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code#Ordinary
 * KnowYourCustomerCheckType1Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code#Simple
 * KnowYourCustomerCheckType1Code.Simple}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckTypeCode
 * KnowYourCustomerCheckTypeCode}</li>
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
 * "KnowYourCustomerCheckType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of Know Your Customer (KYC) or anti-money laundering due diligence to which the investor has been subjected."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class KnowYourCustomerCheckType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code
	 * KnowYourCustomerCheckType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Enhanced"</li>
	 * </ul>
	 */
	public static final KnowYourCustomerCheckType1Code Enhanced = new KnowYourCustomerCheckType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Enhanced";
			owner_lazy = () -> com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.mmObject();
			codeName = KnowYourCustomerCheckTypeCode.Enhanced.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code
	 * KnowYourCustomerCheckType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final KnowYourCustomerCheckType1Code Ordinary = new KnowYourCustomerCheckType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.mmObject();
			codeName = KnowYourCustomerCheckTypeCode.Ordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code
	 * KnowYourCustomerCheckType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Simple"</li>
	 * </ul>
	 */
	public static final KnowYourCustomerCheckType1Code Simple = new KnowYourCustomerCheckType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Simple";
			owner_lazy = () -> com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.mmObject();
			codeName = KnowYourCustomerCheckTypeCode.Simple.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, KnowYourCustomerCheckType1Code> codesByName = new LinkedHashMap<>();

	protected KnowYourCustomerCheckType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "KnowYourCustomerCheckType1Code";
				definition = "Specifies the type of Know Your Customer (KYC) or anti-money laundering due diligence to which the investor has been subjected.";
				trace_lazy = () -> KnowYourCustomerCheckTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.Enhanced, com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.Ordinary,
						com.tools20022.repository.codeset.KnowYourCustomerCheckType1Code.Simple);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Enhanced.getCodeName().get(), Enhanced);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Simple.getCodeName().get(), Simple);
	}

	public static KnowYourCustomerCheckType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static KnowYourCustomerCheckType1Code[] values() {
		KnowYourCustomerCheckType1Code[] values = new KnowYourCustomerCheckType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, KnowYourCustomerCheckType1Code> {
		@Override
		public KnowYourCustomerCheckType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(KnowYourCustomerCheckType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}