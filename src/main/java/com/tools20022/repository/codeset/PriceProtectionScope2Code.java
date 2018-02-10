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
import com.tools20022.repository.codeset.PriceProtectionScope2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Defines the type of price protection the customer requires on their order.
 * Defines the scope of the "related to" price of the peg or the scope of
 * "related to" price of the discretion (for example, local, global etc).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code#Local
 * PriceProtectionScope2Code.Local}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code#National
 * PriceProtectionScope2Code.National}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code#Global
 * PriceProtectionScope2Code.Global}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code#NationalExcludingLocal
 * PriceProtectionScope2Code.NationalExcludingLocal}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScopeCode
 * PriceProtectionScopeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"LOCA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceProtectionScope2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines the type of price protection the customer requires on their order. Defines the scope of the \"related to\" price of the peg or the scope of \"related to\" price of the discretion (for example, local, global etc)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PriceProtectionScope2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Local"</li>
	 * </ul>
	 */
	public static final PriceProtectionScope2Code Local = new PriceProtectionScope2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Local";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScope2Code.mmObject();
			codeName = PriceProtectionScopeCode.Local.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "National"</li>
	 * </ul>
	 */
	public static final PriceProtectionScope2Code National = new PriceProtectionScope2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "National";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScope2Code.mmObject();
			codeName = PriceProtectionScopeCode.National.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Global"</li>
	 * </ul>
	 */
	public static final PriceProtectionScope2Code Global = new PriceProtectionScope2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Global";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScope2Code.mmObject();
			codeName = PriceProtectionScopeCode.Global.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PriceProtectionScope2Code
	 * PriceProtectionScope2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NationalExcludingLocal"</li>
	 * </ul>
	 */
	public static final PriceProtectionScope2Code NationalExcludingLocal = new PriceProtectionScope2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NationalExcludingLocal";
			owner_lazy = () -> com.tools20022.repository.codeset.PriceProtectionScope2Code.mmObject();
			codeName = PriceProtectionScopeCode.NationalExcludingLocal.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PriceProtectionScope2Code> codesByName = new LinkedHashMap<>();

	protected PriceProtectionScope2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("LOCA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceProtectionScope2Code";
				definition = "Defines the type of price protection the customer requires on their order. Defines the scope of the \"related to\" price of the peg or the scope of \"related to\" price of the discretion (for example, local, global etc).";
				trace_lazy = () -> PriceProtectionScopeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PriceProtectionScope2Code.Local, com.tools20022.repository.codeset.PriceProtectionScope2Code.National,
						com.tools20022.repository.codeset.PriceProtectionScope2Code.Global, com.tools20022.repository.codeset.PriceProtectionScope2Code.NationalExcludingLocal);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Local.getCodeName().get(), Local);
		codesByName.put(National.getCodeName().get(), National);
		codesByName.put(Global.getCodeName().get(), Global);
		codesByName.put(NationalExcludingLocal.getCodeName().get(), NationalExcludingLocal);
	}

	public static PriceProtectionScope2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PriceProtectionScope2Code[] values() {
		PriceProtectionScope2Code[] values = new PriceProtectionScope2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PriceProtectionScope2Code> {
		@Override
		public PriceProtectionScope2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PriceProtectionScope2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}