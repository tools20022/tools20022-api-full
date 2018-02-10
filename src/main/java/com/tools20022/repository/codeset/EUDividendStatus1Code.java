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
import com.tools20022.repository.codeset.EUDividendStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the dividend is in the scope of the European directive on
 * taxation of savings income in the form of interest payments.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code#DividendInScope
 * EUDividendStatus1Code.DividendInScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code#DividendOutScope
 * EUDividendStatus1Code.DividendOutScope}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code#DividendUnknown
 * EUDividendStatus1Code.DividendUnknown}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.EUDividendStatusCode
 * EUDividendStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DIVI"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EUDividendStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the dividend is in the scope of the European directive on taxation of savings income in the form of interest payments."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class EUDividendStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code
	 * EUDividendStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendInScope"</li>
	 * </ul>
	 */
	public static final EUDividendStatus1Code DividendInScope = new EUDividendStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendInScope";
			owner_lazy = () -> com.tools20022.repository.codeset.EUDividendStatus1Code.mmObject();
			codeName = EUDividendStatusCode.DividendInScope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code
	 * EUDividendStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOutScope"</li>
	 * </ul>
	 */
	public static final EUDividendStatus1Code DividendOutScope = new EUDividendStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOutScope";
			owner_lazy = () -> com.tools20022.repository.codeset.EUDividendStatus1Code.mmObject();
			codeName = EUDividendStatusCode.DividendOutScope.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.EUDividendStatus1Code
	 * EUDividendStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendUnknown"</li>
	 * </ul>
	 */
	public static final EUDividendStatus1Code DividendUnknown = new EUDividendStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendUnknown";
			owner_lazy = () -> com.tools20022.repository.codeset.EUDividendStatus1Code.mmObject();
			codeName = EUDividendStatusCode.DividendUnknown.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, EUDividendStatus1Code> codesByName = new LinkedHashMap<>();

	protected EUDividendStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DIVI");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "EUDividendStatus1Code";
				definition = "Specifies whether the dividend is in the scope of the European directive on taxation of savings income in the form of interest payments.";
				trace_lazy = () -> EUDividendStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.EUDividendStatus1Code.DividendInScope, com.tools20022.repository.codeset.EUDividendStatus1Code.DividendOutScope,
						com.tools20022.repository.codeset.EUDividendStatus1Code.DividendUnknown);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DividendInScope.getCodeName().get(), DividendInScope);
		codesByName.put(DividendOutScope.getCodeName().get(), DividendOutScope);
		codesByName.put(DividendUnknown.getCodeName().get(), DividendUnknown);
	}

	public static EUDividendStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static EUDividendStatus1Code[] values() {
		EUDividendStatus1Code[] values = new EUDividendStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, EUDividendStatus1Code> {
		@Override
		public EUDividendStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(EUDividendStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}