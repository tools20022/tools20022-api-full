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
import com.tools20022.repository.codeset.UndertakingIssuanceName1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceName1Code#Standby
 * UndertakingIssuanceName1Code.Standby}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceName1Code#Guarantee
 * UndertakingIssuanceName1Code.Guarantee}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceNameCode
 * UndertakingIssuanceNameCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingIssuanceName1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the issued undertaking name."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"STBY"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class UndertakingIssuanceName1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceName1Code
	 * UndertakingIssuanceName1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standby"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UndertakingIssuanceName1Code Standby = new UndertakingIssuanceName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standby";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingIssuanceName1Code.mmObject();
			codeName = UndertakingIssuanceNameCode.Standby.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingIssuanceName1Code
	 * UndertakingIssuanceName1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Guarantee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final UndertakingIssuanceName1Code Guarantee = new UndertakingIssuanceName1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Guarantee";
			owner_lazy = () -> com.tools20022.repository.codeset.UndertakingIssuanceName1Code.mmObject();
			codeName = UndertakingIssuanceNameCode.Guarantee.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, UndertakingIssuanceName1Code> codesByName = new LinkedHashMap<>();

	protected UndertakingIssuanceName1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("STBY");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingIssuanceName1Code";
				definition = "Specifies the issued undertaking name.";
				trace_lazy = () -> UndertakingIssuanceNameCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.UndertakingIssuanceName1Code.Standby, com.tools20022.repository.codeset.UndertakingIssuanceName1Code.Guarantee);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Standby.getCodeName().get(), Standby);
		codesByName.put(Guarantee.getCodeName().get(), Guarantee);
	}

	public static UndertakingIssuanceName1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static UndertakingIssuanceName1Code[] values() {
		UndertakingIssuanceName1Code[] values = new UndertakingIssuanceName1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, UndertakingIssuanceName1Code> {
		@Override
		public UndertakingIssuanceName1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(UndertakingIssuanceName1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}