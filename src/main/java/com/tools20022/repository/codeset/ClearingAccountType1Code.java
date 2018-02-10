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
import com.tools20022.repository.codeset.ClearingAccountType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code#House
 * ClearingAccountType1Code.House}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code#Client
 * ClearingAccountType1Code.Client}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code#LiquidityProvider
 * ClearingAccountType1Code.LiquidityProvider}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"HOUS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClearingAccountType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the clearing account type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingAccountType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code
	 * ClearingAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "House"</li>
	 * </ul>
	 */
	public static final ClearingAccountType1Code House = new ClearingAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "House";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType1Code.mmObject();
			codeName = ClearingAccountTypeCode.House.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code
	 * ClearingAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Client"</li>
	 * </ul>
	 */
	public static final ClearingAccountType1Code Client = new ClearingAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Client";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType1Code.mmObject();
			codeName = ClearingAccountTypeCode.Client.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingAccountType1Code
	 * ClearingAccountType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityProvider"</li>
	 * </ul>
	 */
	public static final ClearingAccountType1Code LiquidityProvider = new ClearingAccountType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityProvider";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingAccountType1Code.mmObject();
			codeName = ClearingAccountTypeCode.LiquidityProvider.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClearingAccountType1Code> codesByName = new LinkedHashMap<>();

	protected ClearingAccountType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("HOUS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingAccountType1Code";
				definition = "Specifies the clearing account type.";
				trace_lazy = () -> ClearingAccountTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingAccountType1Code.House, com.tools20022.repository.codeset.ClearingAccountType1Code.Client,
						com.tools20022.repository.codeset.ClearingAccountType1Code.LiquidityProvider);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(House.getCodeName().get(), House);
		codesByName.put(Client.getCodeName().get(), Client);
		codesByName.put(LiquidityProvider.getCodeName().get(), LiquidityProvider);
	}

	public static ClearingAccountType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingAccountType1Code[] values() {
		ClearingAccountType1Code[] values = new ClearingAccountType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingAccountType1Code> {
		@Override
		public ClearingAccountType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingAccountType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}