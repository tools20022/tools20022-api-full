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
import com.tools20022.repository.codeset.CurrencyDesignationCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignationCode#Onshore
 * CurrencyDesignationCode.Onshore}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignationCode#Offshore
 * CurrencyDesignationCode.Offshore}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.CurrencyDesignation1Code
 * CurrencyDesignation1Code}</li>
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
 * "CurrencyDesignationCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies whether a currency is settled offshore or onshore."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CurrencyDesignationCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Onshore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignationCode
	 * CurrencyDesignationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ONSH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Onshore"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Onshore."</li>
	 * </ul>
	 */
	public static final CurrencyDesignationCode Onshore = new CurrencyDesignationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Onshore";
			definition = "Onshore.";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyDesignationCode.mmObject();
			codeName = "ONSH";
		}
	};
	/**
	 * Offshore.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CurrencyDesignationCode
	 * CurrencyDesignationCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OFFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Offshore"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Offshore."</li>
	 * </ul>
	 */
	public static final CurrencyDesignationCode Offshore = new CurrencyDesignationCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Offshore";
			definition = "Offshore.";
			owner_lazy = () -> com.tools20022.repository.codeset.CurrencyDesignationCode.mmObject();
			codeName = "OFFS";
		}
	};
	final static private LinkedHashMap<String, CurrencyDesignationCode> codesByName = new LinkedHashMap<>();

	protected CurrencyDesignationCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrencyDesignationCode";
				definition = "Specifies whether a currency is settled offshore or onshore.";
				derivation_lazy = () -> Arrays.asList(CurrencyDesignation1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CurrencyDesignationCode.Onshore, com.tools20022.repository.codeset.CurrencyDesignationCode.Offshore);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Onshore.getCodeName().get(), Onshore);
		codesByName.put(Offshore.getCodeName().get(), Offshore);
	}

	public static CurrencyDesignationCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CurrencyDesignationCode[] values() {
		CurrencyDesignationCode[] values = new CurrencyDesignationCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CurrencyDesignationCode> {
		@Override
		public CurrencyDesignationCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CurrencyDesignationCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}