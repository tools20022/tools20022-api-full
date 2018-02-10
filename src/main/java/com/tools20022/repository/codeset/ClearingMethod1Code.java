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
import com.tools20022.repository.codeset.ClearingMethod1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the value is net (inclusive of tax) or gross.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code#GrossNegotiation
 * ClearingMethod1Code.GrossNegotiation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code#NetMatch
 * ClearingMethod1Code.NetMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code#NetNegotiation
 * ClearingMethod1Code.NetNegotiation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ClearingMethodCode
 * ClearingMethodCode}</li>
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
 * "ClearingMethod1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the value is net (inclusive of tax) or gross."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ClearingMethod1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code
	 * ClearingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossNegotiation"</li>
	 * </ul>
	 */
	public static final ClearingMethod1Code GrossNegotiation = new ClearingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossNegotiation";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingMethod1Code.mmObject();
			codeName = ClearingMethodCode.GrossNegotiation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code
	 * ClearingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetMatch"</li>
	 * </ul>
	 */
	public static final ClearingMethod1Code NetMatch = new ClearingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingMethod1Code.mmObject();
			codeName = ClearingMethodCode.NetMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ClearingMethod1Code
	 * ClearingMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetNegotiation"</li>
	 * </ul>
	 */
	public static final ClearingMethod1Code NetNegotiation = new ClearingMethod1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetNegotiation";
			owner_lazy = () -> com.tools20022.repository.codeset.ClearingMethod1Code.mmObject();
			codeName = ClearingMethodCode.NetNegotiation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ClearingMethod1Code> codesByName = new LinkedHashMap<>();

	protected ClearingMethod1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClearingMethod1Code";
				definition = "Specifies whether the value is net (inclusive of tax) or gross.";
				trace_lazy = () -> ClearingMethodCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ClearingMethod1Code.GrossNegotiation, com.tools20022.repository.codeset.ClearingMethod1Code.NetMatch,
						com.tools20022.repository.codeset.ClearingMethod1Code.NetNegotiation);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(GrossNegotiation.getCodeName().get(), GrossNegotiation);
		codesByName.put(NetMatch.getCodeName().get(), NetMatch);
		codesByName.put(NetNegotiation.getCodeName().get(), NetNegotiation);
	}

	public static ClearingMethod1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ClearingMethod1Code[] values() {
		ClearingMethod1Code[] values = new ClearingMethod1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ClearingMethod1Code> {
		@Override
		public ClearingMethod1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ClearingMethod1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}