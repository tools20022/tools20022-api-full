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
import com.tools20022.repository.codeset.CurrencyDesignation1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether a currency is settled offshore or onshore.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignation1Code#Onshore
 * CurrencyDesignation1Code.Onshore}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignation1Code#Offshore
 * CurrencyDesignation1Code.Offshore}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignationCode
 * CurrencyDesignationCode}</li>
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
 * "CurrencyDesignation1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether a currency is settled offshore or onshore."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CurrencyDesignation1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignation1Code
	 * CurrencyDesignation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Onshore"</li>
	 * </ul>
	 */
	public static final CurrencyDesignation1Code Onshore = new CurrencyDesignation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Onshore";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyDesignation1Code.mmObject();
			codeName = CurrencyDesignationCode.Onshore.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignation1Code
	 * CurrencyDesignation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offshore"</li>
	 * </ul>
	 */
	public static final CurrencyDesignation1Code Offshore = new CurrencyDesignation1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offshore";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyDesignation1Code.mmObject();
			codeName = CurrencyDesignationCode.Offshore.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CurrencyDesignation1Code> codesByName = new LinkedHashMap<>();

	protected CurrencyDesignation1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyDesignation1Code";
				definition = "Specifies whether a currency is settled offshore or onshore.";
				trace_lazy = () -> CurrencyDesignationCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyDesignation1Code.Onshore, com.tools20022.repository.codeset.CurrencyDesignation1Code.Offshore);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Onshore.getCodeName().get(), Onshore);
		codesByName.put(Offshore.getCodeName().get(), Offshore);
	}

	public static CurrencyDesignation1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CurrencyDesignation1Code[] values() {
		CurrencyDesignation1Code[] values = new CurrencyDesignation1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CurrencyDesignation1Code> {
		@Override
		public CurrencyDesignation1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CurrencyDesignation1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}