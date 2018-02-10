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
import com.tools20022.repository.codeset.UndertakingIssuanceNameCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the issued undertaking name.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceNameCode#Guarantee
 * UndertakingIssuanceNameCode.Guarantee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceNameCode#Standby
 * UndertakingIssuanceNameCode.Standby}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceName1Code
 * UndertakingIssuanceName1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DGAR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingIssuanceNameCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the issued undertaking name."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UndertakingIssuanceNameCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Demand guarantee.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceNameCode
	 * UndertakingIssuanceNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DGAR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Demand guarantee."</li>
	 * </ul>
	 */
	public static final UndertakingIssuanceNameCode Guarantee = new UndertakingIssuanceNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Guarantee";
			definition = "Demand guarantee.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingIssuanceNameCode.mmObject();
			codeName = "DGAR";
		}
	};
	/**
	 * Standby letter of credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceNameCode
	 * UndertakingIssuanceNameCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "STBY"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standby"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Standby letter of credit."</li>
	 * </ul>
	 */
	public static final UndertakingIssuanceNameCode Standby = new UndertakingIssuanceNameCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standby";
			definition = "Standby letter of credit.";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingIssuanceNameCode.mmObject();
			codeName = "STBY";
		}
	};
	final static private LinkedHashMap<String, UndertakingIssuanceNameCode> codesByName = new LinkedHashMap<>();

	protected UndertakingIssuanceNameCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DGAR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingIssuanceNameCode";
				definition = "Specifies the issued undertaking name.";
				derivation_lazy = () -> Arrays.asList(UndertakingIssuanceName1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingIssuanceNameCode.Guarantee, com.tools20022.repository.codeset.UndertakingIssuanceNameCode.Standby);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Guarantee.getCodeName().get(), Guarantee);
		codesByName.put(Standby.getCodeName().get(), Standby);
	}

	public static UndertakingIssuanceNameCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UndertakingIssuanceNameCode[] values() {
		UndertakingIssuanceNameCode[] values = new UndertakingIssuanceNameCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UndertakingIssuanceNameCode> {
		@Override
		public UndertakingIssuanceNameCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UndertakingIssuanceNameCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}